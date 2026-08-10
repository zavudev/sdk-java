// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts.contacts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ContactAddResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val added: JsonField<Long>,
    private val duplicates: JsonField<Long>,
    private val invalid: JsonField<Long>,
    private val errors: JsonField<List<Error>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("added") @ExcludeMissing added: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("duplicates") @ExcludeMissing duplicates: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("invalid") @ExcludeMissing invalid: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<Error>> = JsonMissing.of(),
    ) : this(added, duplicates, invalid, errors, mutableMapOf())

    /**
     * Number of contacts successfully added.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun added(): Long = added.getRequired("added")

    /**
     * Number of duplicate contacts skipped.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun duplicates(): Long = duplicates.getRequired("duplicates")

    /**
     * Number of invalid contacts rejected.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invalid(): Long = invalid.getRequired("invalid")

    /**
     * Details about invalid contacts.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errors(): Optional<List<Error>> = errors.getOptional("errors")

    /**
     * Returns the raw JSON value of [added].
     *
     * Unlike [added], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added") @ExcludeMissing fun _added(): JsonField<Long> = added

    /**
     * Returns the raw JSON value of [duplicates].
     *
     * Unlike [duplicates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duplicates") @ExcludeMissing fun _duplicates(): JsonField<Long> = duplicates

    /**
     * Returns the raw JSON value of [invalid].
     *
     * Unlike [invalid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invalid") @ExcludeMissing fun _invalid(): JsonField<Long> = invalid

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<Error>> = errors

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
         * Returns a mutable builder for constructing an instance of [ContactAddResponse].
         *
         * The following fields are required:
         * ```java
         * .added()
         * .duplicates()
         * .invalid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactAddResponse]. */
    class Builder internal constructor() {

        private var added: JsonField<Long>? = null
        private var duplicates: JsonField<Long>? = null
        private var invalid: JsonField<Long>? = null
        private var errors: JsonField<MutableList<Error>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactAddResponse: ContactAddResponse) = apply {
            added = contactAddResponse.added
            duplicates = contactAddResponse.duplicates
            invalid = contactAddResponse.invalid
            errors = contactAddResponse.errors.map { it.toMutableList() }
            additionalProperties = contactAddResponse.additionalProperties.toMutableMap()
        }

        /** Number of contacts successfully added. */
        fun added(added: Long) = added(JsonField.of(added))

        /**
         * Sets [Builder.added] to an arbitrary JSON value.
         *
         * You should usually call [Builder.added] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun added(added: JsonField<Long>) = apply { this.added = added }

        /** Number of duplicate contacts skipped. */
        fun duplicates(duplicates: Long) = duplicates(JsonField.of(duplicates))

        /**
         * Sets [Builder.duplicates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duplicates] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duplicates(duplicates: JsonField<Long>) = apply { this.duplicates = duplicates }

        /** Number of invalid contacts rejected. */
        fun invalid(invalid: Long) = invalid(JsonField.of(invalid))

        /**
         * Sets [Builder.invalid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalid] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun invalid(invalid: JsonField<Long>) = apply { this.invalid = invalid }

        /** Details about invalid contacts. */
        fun errors(errors: List<Error>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<Error>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<Error>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [Error] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: Error) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
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
         * Returns an immutable instance of [ContactAddResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .added()
         * .duplicates()
         * .invalid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactAddResponse =
            ContactAddResponse(
                checkRequired("added", added),
                checkRequired("duplicates", duplicates),
                checkRequired("invalid", invalid),
                (errors ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ContactAddResponse = apply {
        if (validated) {
            return@apply
        }

        added()
        duplicates()
        invalid()
        errors().ifPresent { it.forEach { it.validate() } }
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
        (if (added.asKnown().isPresent) 1 else 0) +
            (if (duplicates.asKnown().isPresent) 1 else 0) +
            (if (invalid.asKnown().isPresent) 1 else 0) +
            (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<String>,
        private val recipient: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient")
            @ExcludeMissing
            recipient: JsonField<String> = JsonMissing.of(),
        ) : this(reason, recipient, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recipient(): Optional<String> = recipient.getOptional("recipient")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [recipient].
         *
         * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

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

            /** Returns a mutable builder for constructing an instance of [Error]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var reason: JsonField<String> = JsonMissing.of()
            private var recipient: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(error: Error) = apply {
                reason = error.reason
                recipient = error.recipient
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun recipient(recipient: String) = recipient(JsonField.of(recipient))

            /**
             * Sets [Builder.recipient] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipient] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Error = Error(reason, recipient, additionalProperties.toMutableMap())
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
        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            reason()
            recipient()
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
            (if (reason.asKnown().isPresent) 1 else 0) +
                (if (recipient.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                reason == other.reason &&
                recipient == other.recipient &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reason, recipient, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{reason=$reason, recipient=$recipient, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactAddResponse &&
            added == other.added &&
            duplicates == other.duplicates &&
            invalid == other.invalid &&
            errors == other.errors &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(added, duplicates, invalid, errors, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactAddResponse{added=$added, duplicates=$duplicates, invalid=$invalid, errors=$errors, additionalProperties=$additionalProperties}"
}
