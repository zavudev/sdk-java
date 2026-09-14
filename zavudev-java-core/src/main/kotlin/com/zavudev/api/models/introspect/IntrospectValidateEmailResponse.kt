// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.introspect

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IntrospectValidateEmailResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<Result>>,
    private val summary: JsonField<Summary>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
    ) : this(results, summary, mutableMapOf())

    /**
     * One result per submitted address, in the same order.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun summary(): Summary = summary.getRequired("summary")

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntrospectValidateEmailResponse].
         *
         * The following fields are required:
         * ```java
         * .results()
         * .summary()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntrospectValidateEmailResponse]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<Result>>? = null
        private var summary: JsonField<Summary>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(introspectValidateEmailResponse: IntrospectValidateEmailResponse) =
            apply {
                results = introspectValidateEmailResponse.results.map { it.toMutableList() }
                summary = introspectValidateEmailResponse.summary
                additionalProperties =
                    introspectValidateEmailResponse.additionalProperties.toMutableMap()
            }

        /** One result per submitted address, in the same order. */
        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        fun summary(summary: Summary) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [Summary] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [IntrospectValidateEmailResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .results()
         * .summary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntrospectValidateEmailResponse =
            IntrospectValidateEmailResponse(
                checkRequired("results", results).map { it.toImmutable() },
                checkRequired("summary", summary),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): IntrospectValidateEmailResponse = apply {
        if (validated) {
            return@apply
        }

        results().forEach { it.validate() }
        summary().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ZavudevInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (summary.asKnown().getOrNull()?.validity() ?: 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val domain: JsonField<String>,
        private val email: JsonField<String>,
        private val normalized: JsonField<String>,
        private val reasons: JsonField<List<Reason>>,
        private val verdict: JsonField<Verdict>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("normalized")
            @ExcludeMissing
            normalized: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reasons")
            @ExcludeMissing
            reasons: JsonField<List<Reason>> = JsonMissing.of(),
            @JsonProperty("verdict") @ExcludeMissing verdict: JsonField<Verdict> = JsonMissing.of(),
        ) : this(domain, email, normalized, reasons, verdict, mutableMapOf())

        /**
         * Domain part of the address. Null when the syntax is invalid.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun domain(): Optional<String> = domain.getOptional("domain")

        /**
         * The address exactly as submitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Lowercased, trimmed form of the address. Null when the syntax is invalid.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun normalized(): Optional<String> = normalized.getOptional("normalized")

        /**
         * Signals behind the verdict. Empty for a clean `deliverable` address.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reasons(): List<Reason> = reasons.getRequired("reasons")

        /**
         * Validation verdict.
         * - `deliverable`: nothing suggests the address will bounce.
         * - `risky`: sendable, but a signal predicts elevated bounce/complaint odds (role address,
         *   disposable domain, MX-less domain, prior soft bounce).
         * - `undeliverable`: will bounce or is blocked (invalid syntax, dead domain, or the address
         *   is on your suppression list after a hard bounce/complaint).
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun verdict(): Verdict = verdict.getRequired("verdict")

        /**
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [normalized].
         *
         * Unlike [normalized], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("normalized")
        @ExcludeMissing
        fun _normalized(): JsonField<String> = normalized

        /**
         * Returns the raw JSON value of [reasons].
         *
         * Unlike [reasons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reasons") @ExcludeMissing fun _reasons(): JsonField<List<Reason>> = reasons

        /**
         * Returns the raw JSON value of [verdict].
         *
         * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Verdict> = verdict

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .domain()
             * .email()
             * .normalized()
             * .reasons()
             * .verdict()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var domain: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var normalized: JsonField<String>? = null
            private var reasons: JsonField<MutableList<Reason>>? = null
            private var verdict: JsonField<Verdict>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                domain = result.domain
                email = result.email
                normalized = result.normalized
                reasons = result.reasons.map { it.toMutableList() }
                verdict = result.verdict
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Domain part of the address. Null when the syntax is invalid. */
            fun domain(domain: String?) = domain(JsonField.ofNullable(domain))

            /** Alias for calling [Builder.domain] with `domain.orElse(null)`. */
            fun domain(domain: Optional<String>) = domain(domain.getOrNull())

            /**
             * Sets [Builder.domain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            /** The address exactly as submitted. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Lowercased, trimmed form of the address. Null when the syntax is invalid. */
            fun normalized(normalized: String?) = normalized(JsonField.ofNullable(normalized))

            /** Alias for calling [Builder.normalized] with `normalized.orElse(null)`. */
            fun normalized(normalized: Optional<String>) = normalized(normalized.getOrNull())

            /**
             * Sets [Builder.normalized] to an arbitrary JSON value.
             *
             * You should usually call [Builder.normalized] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun normalized(normalized: JsonField<String>) = apply { this.normalized = normalized }

            /** Signals behind the verdict. Empty for a clean `deliverable` address. */
            fun reasons(reasons: List<Reason>) = reasons(JsonField.of(reasons))

            /**
             * Sets [Builder.reasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasons] with a well-typed `List<Reason>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasons(reasons: JsonField<List<Reason>>) = apply {
                this.reasons = reasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [Reason] to [reasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReason(reason: Reason) = apply {
                reasons =
                    (reasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reasons", it).add(reason)
                    }
            }

            /**
             * Validation verdict.
             * - `deliverable`: nothing suggests the address will bounce.
             * - `risky`: sendable, but a signal predicts elevated bounce/complaint odds (role
             *   address, disposable domain, MX-less domain, prior soft bounce).
             * - `undeliverable`: will bounce or is blocked (invalid syntax, dead domain, or the
             *   address is on your suppression list after a hard bounce/complaint).
             */
            fun verdict(verdict: Verdict) = verdict(JsonField.of(verdict))

            /**
             * Sets [Builder.verdict] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verdict] with a well-typed [Verdict] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verdict(verdict: JsonField<Verdict>) = apply { this.verdict = verdict }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .domain()
             * .email()
             * .normalized()
             * .reasons()
             * .verdict()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("domain", domain),
                    checkRequired("email", email),
                    checkRequired("normalized", normalized),
                    checkRequired("reasons", reasons).map { it.toImmutable() },
                    checkRequired("verdict", verdict),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            domain()
            email()
            normalized()
            reasons().forEach { it.validate() }
            verdict().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ZavudevInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (domain.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (normalized.asKnown().isPresent) 1 else 0) +
                (reasons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (verdict.asKnown().getOrNull()?.validity() ?: 0)

        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INVALID_SYNTAX = of("invalid_syntax")

                @JvmField val DOMAIN_NOT_FOUND = of("domain_not_found")

                @JvmField val DOMAIN_NO_MX = of("domain_no_mx")

                @JvmField val DISPOSABLE_DOMAIN = of("disposable_domain")

                @JvmField val ROLE_ADDRESS = of("role_address")

                @JvmField val SUPPRESSED_HARD_BOUNCE = of("suppressed_hard_bounce")

                @JvmField val SUPPRESSED_SOFT_BOUNCE = of("suppressed_soft_bounce")

                @JvmField val SUPPRESSED_COMPLAINT = of("suppressed_complaint")

                @JvmField val SUPPRESSED_MANUAL = of("suppressed_manual")

                @JvmField val SUPPRESSED_UNSUBSCRIBE = of("suppressed_unsubscribe")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                INVALID_SYNTAX,
                DOMAIN_NOT_FOUND,
                DOMAIN_NO_MX,
                DISPOSABLE_DOMAIN,
                ROLE_ADDRESS,
                SUPPRESSED_HARD_BOUNCE,
                SUPPRESSED_SOFT_BOUNCE,
                SUPPRESSED_COMPLAINT,
                SUPPRESSED_MANUAL,
                SUPPRESSED_UNSUBSCRIBE,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INVALID_SYNTAX,
                DOMAIN_NOT_FOUND,
                DOMAIN_NO_MX,
                DISPOSABLE_DOMAIN,
                ROLE_ADDRESS,
                SUPPRESSED_HARD_BOUNCE,
                SUPPRESSED_SOFT_BOUNCE,
                SUPPRESSED_COMPLAINT,
                SUPPRESSED_MANUAL,
                SUPPRESSED_UNSUBSCRIBE,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INVALID_SYNTAX -> Value.INVALID_SYNTAX
                    DOMAIN_NOT_FOUND -> Value.DOMAIN_NOT_FOUND
                    DOMAIN_NO_MX -> Value.DOMAIN_NO_MX
                    DISPOSABLE_DOMAIN -> Value.DISPOSABLE_DOMAIN
                    ROLE_ADDRESS -> Value.ROLE_ADDRESS
                    SUPPRESSED_HARD_BOUNCE -> Value.SUPPRESSED_HARD_BOUNCE
                    SUPPRESSED_SOFT_BOUNCE -> Value.SUPPRESSED_SOFT_BOUNCE
                    SUPPRESSED_COMPLAINT -> Value.SUPPRESSED_COMPLAINT
                    SUPPRESSED_MANUAL -> Value.SUPPRESSED_MANUAL
                    SUPPRESSED_UNSUBSCRIBE -> Value.SUPPRESSED_UNSUBSCRIBE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ZavudevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INVALID_SYNTAX -> Known.INVALID_SYNTAX
                    DOMAIN_NOT_FOUND -> Known.DOMAIN_NOT_FOUND
                    DOMAIN_NO_MX -> Known.DOMAIN_NO_MX
                    DISPOSABLE_DOMAIN -> Known.DISPOSABLE_DOMAIN
                    ROLE_ADDRESS -> Known.ROLE_ADDRESS
                    SUPPRESSED_HARD_BOUNCE -> Known.SUPPRESSED_HARD_BOUNCE
                    SUPPRESSED_SOFT_BOUNCE -> Known.SUPPRESSED_SOFT_BOUNCE
                    SUPPRESSED_COMPLAINT -> Known.SUPPRESSED_COMPLAINT
                    SUPPRESSED_MANUAL -> Known.SUPPRESSED_MANUAL
                    SUPPRESSED_UNSUBSCRIBE -> Known.SUPPRESSED_UNSUBSCRIBE
                    else -> throw ZavudevInvalidDataException("Unknown Reason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ZavudevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ZavudevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Reason = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ZavudevInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Validation verdict.
         * - `deliverable`: nothing suggests the address will bounce.
         * - `risky`: sendable, but a signal predicts elevated bounce/complaint odds (role address,
         *   disposable domain, MX-less domain, prior soft bounce).
         * - `undeliverable`: will bounce or is blocked (invalid syntax, dead domain, or the address
         *   is on your suppression list after a hard bounce/complaint).
         */
        class Verdict @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DELIVERABLE = of("deliverable")

                @JvmField val RISKY = of("risky")

                @JvmField val UNDELIVERABLE = of("undeliverable")

                @JvmStatic fun of(value: String) = Verdict(JsonField.of(value))
            }

            /** An enum containing [Verdict]'s known values. */
            enum class Known {
                DELIVERABLE,
                RISKY,
                UNDELIVERABLE,
            }

            /**
             * An enum containing [Verdict]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Verdict] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DELIVERABLE,
                RISKY,
                UNDELIVERABLE,
                /**
                 * An enum member indicating that [Verdict] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DELIVERABLE -> Value.DELIVERABLE
                    RISKY -> Value.RISKY
                    UNDELIVERABLE -> Value.UNDELIVERABLE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ZavudevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DELIVERABLE -> Known.DELIVERABLE
                    RISKY -> Known.RISKY
                    UNDELIVERABLE -> Known.UNDELIVERABLE
                    else -> throw ZavudevInvalidDataException("Unknown Verdict: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ZavudevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ZavudevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Verdict = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ZavudevInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Verdict && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                domain == other.domain &&
                email == other.email &&
                normalized == other.normalized &&
                reasons == other.reasons &&
                verdict == other.verdict &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(domain, email, normalized, reasons, verdict, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{domain=$domain, email=$email, normalized=$normalized, reasons=$reasons, verdict=$verdict, additionalProperties=$additionalProperties}"
    }

    class Summary
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deliverable: JsonField<Long>,
        private val risky: JsonField<Long>,
        private val total: JsonField<Long>,
        private val undeliverable: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("deliverable")
            @ExcludeMissing
            deliverable: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("risky") @ExcludeMissing risky: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("undeliverable")
            @ExcludeMissing
            undeliverable: JsonField<Long> = JsonMissing.of(),
        ) : this(deliverable, risky, total, undeliverable, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliverable(): Long = deliverable.getRequired("deliverable")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun risky(): Long = risky.getRequired("risky")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): Long = total.getRequired("total")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun undeliverable(): Long = undeliverable.getRequired("undeliverable")

        /**
         * Returns the raw JSON value of [deliverable].
         *
         * Unlike [deliverable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deliverable")
        @ExcludeMissing
        fun _deliverable(): JsonField<Long> = deliverable

        /**
         * Returns the raw JSON value of [risky].
         *
         * Unlike [risky], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("risky") @ExcludeMissing fun _risky(): JsonField<Long> = risky

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

        /**
         * Returns the raw JSON value of [undeliverable].
         *
         * Unlike [undeliverable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("undeliverable")
        @ExcludeMissing
        fun _undeliverable(): JsonField<Long> = undeliverable

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Summary].
             *
             * The following fields are required:
             * ```java
             * .deliverable()
             * .risky()
             * .total()
             * .undeliverable()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Summary]. */
        class Builder internal constructor() {

            private var deliverable: JsonField<Long>? = null
            private var risky: JsonField<Long>? = null
            private var total: JsonField<Long>? = null
            private var undeliverable: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(summary: Summary) = apply {
                deliverable = summary.deliverable
                risky = summary.risky
                total = summary.total
                undeliverable = summary.undeliverable
                additionalProperties = summary.additionalProperties.toMutableMap()
            }

            fun deliverable(deliverable: Long) = deliverable(JsonField.of(deliverable))

            /**
             * Sets [Builder.deliverable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliverable] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deliverable(deliverable: JsonField<Long>) = apply { this.deliverable = deliverable }

            fun risky(risky: Long) = risky(JsonField.of(risky))

            /**
             * Sets [Builder.risky] to an arbitrary JSON value.
             *
             * You should usually call [Builder.risky] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun risky(risky: JsonField<Long>) = apply { this.risky = risky }

            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

            fun undeliverable(undeliverable: Long) = undeliverable(JsonField.of(undeliverable))

            /**
             * Sets [Builder.undeliverable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.undeliverable] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun undeliverable(undeliverable: JsonField<Long>) = apply {
                this.undeliverable = undeliverable
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Summary].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .deliverable()
             * .risky()
             * .total()
             * .undeliverable()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Summary =
                Summary(
                    checkRequired("deliverable", deliverable),
                    checkRequired("risky", risky),
                    checkRequired("total", total),
                    checkRequired("undeliverable", undeliverable),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Summary = apply {
            if (validated) {
                return@apply
            }

            deliverable()
            risky()
            total()
            undeliverable()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ZavudevInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (deliverable.asKnown().isPresent) 1 else 0) +
                (if (risky.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (if (undeliverable.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Summary &&
                deliverable == other.deliverable &&
                risky == other.risky &&
                total == other.total &&
                undeliverable == other.undeliverable &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(deliverable, risky, total, undeliverable, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Summary{deliverable=$deliverable, risky=$risky, total=$total, undeliverable=$undeliverable, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntrospectValidateEmailResponse &&
            results == other.results &&
            summary == other.summary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, summary, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntrospectValidateEmailResponse{results=$results, summary=$summary, additionalProperties=$additionalProperties}"
}
