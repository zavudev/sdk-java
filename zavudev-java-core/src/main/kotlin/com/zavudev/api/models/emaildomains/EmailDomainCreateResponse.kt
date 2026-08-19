// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.emaildomains

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

class EmailDomainCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val domain: JsonField<Domain>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<Domain> = JsonMissing.of()
    ) : this(domain, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domain(): Domain = domain.getRequired("domain")

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<Domain> = domain

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
         * Returns a mutable builder for constructing an instance of [EmailDomainCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .domain()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailDomainCreateResponse]. */
    class Builder internal constructor() {

        private var domain: JsonField<Domain>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailDomainCreateResponse: EmailDomainCreateResponse) = apply {
            domain = emailDomainCreateResponse.domain
            additionalProperties = emailDomainCreateResponse.additionalProperties.toMutableMap()
        }

        fun domain(domain: Domain) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [Domain] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<Domain>) = apply { this.domain = domain }

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
         * Returns an immutable instance of [EmailDomainCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .domain()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailDomainCreateResponse =
            EmailDomainCreateResponse(
                checkRequired("domain", domain),
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
    fun validate(): EmailDomainCreateResponse = apply {
        if (validated) {
            return@apply
        }

        domain().validate()
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
    @JvmSynthetic internal fun validity(): Int = (domain.asKnown().getOrNull()?.validity() ?: 0)

    class Domain
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val dkimStatus: JsonField<String>,
        private val domain: JsonField<String>,
        private val status: JsonField<String>,
        private val dnsRecords: JsonField<List<DnsRecord>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dkimStatus")
            @ExcludeMissing
            dkimStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dnsRecords")
            @ExcludeMissing
            dnsRecords: JsonField<List<DnsRecord>> = JsonMissing.of(),
        ) : this(id, dkimStatus, domain, status, dnsRecords, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dkimStatus(): String = dkimStatus.getRequired("dkimStatus")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun domain(): String = domain.getRequired("domain")

        /**
         * Overall verification status.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * DNS records to publish. Present when fetching a single domain or after adding one.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dnsRecords(): Optional<List<DnsRecord>> = dnsRecords.getOptional("dnsRecords")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [dkimStatus].
         *
         * Unlike [dkimStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dkimStatus")
        @ExcludeMissing
        fun _dkimStatus(): JsonField<String> = dkimStatus

        /**
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [dnsRecords].
         *
         * Unlike [dnsRecords], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dnsRecords")
        @ExcludeMissing
        fun _dnsRecords(): JsonField<List<DnsRecord>> = dnsRecords

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
             * Returns a mutable builder for constructing an instance of [Domain].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .dkimStatus()
             * .domain()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Domain]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var dkimStatus: JsonField<String>? = null
            private var domain: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var dnsRecords: JsonField<MutableList<DnsRecord>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(domain: Domain) = apply {
                id = domain.id
                dkimStatus = domain.dkimStatus
                this.domain = domain.domain
                status = domain.status
                dnsRecords = domain.dnsRecords.map { it.toMutableList() }
                additionalProperties = domain.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun dkimStatus(dkimStatus: String) = dkimStatus(JsonField.of(dkimStatus))

            /**
             * Sets [Builder.dkimStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dkimStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dkimStatus(dkimStatus: JsonField<String>) = apply { this.dkimStatus = dkimStatus }

            fun domain(domain: String) = domain(JsonField.of(domain))

            /**
             * Sets [Builder.domain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            /** Overall verification status. */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /**
             * DNS records to publish. Present when fetching a single domain or after adding one.
             */
            fun dnsRecords(dnsRecords: List<DnsRecord>) = dnsRecords(JsonField.of(dnsRecords))

            /**
             * Sets [Builder.dnsRecords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dnsRecords] with a well-typed `List<DnsRecord>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dnsRecords(dnsRecords: JsonField<List<DnsRecord>>) = apply {
                this.dnsRecords = dnsRecords.map { it.toMutableList() }
            }

            /**
             * Adds a single [DnsRecord] to [dnsRecords].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDnsRecord(dnsRecord: DnsRecord) = apply {
                dnsRecords =
                    (dnsRecords ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dnsRecords", it).add(dnsRecord)
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
             * Returns an immutable instance of [Domain].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .dkimStatus()
             * .domain()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Domain =
                Domain(
                    checkRequired("id", id),
                    checkRequired("dkimStatus", dkimStatus),
                    checkRequired("domain", domain),
                    checkRequired("status", status),
                    (dnsRecords ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Domain = apply {
            if (validated) {
                return@apply
            }

            id()
            dkimStatus()
            domain()
            status()
            dnsRecords().ifPresent { it.forEach { it.validate() } }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (dkimStatus.asKnown().isPresent) 1 else 0) +
                (if (domain.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (dnsRecords.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class DnsRecord
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val purpose: JsonField<Purpose>,
            private val required: JsonField<Boolean>,
            private val type: JsonField<String>,
            private val value: JsonField<String>,
            private val priority: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("purpose")
                @ExcludeMissing
                purpose: JsonField<Purpose> = JsonMissing.of(),
                @JsonProperty("required")
                @ExcludeMissing
                required: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<Long> = JsonMissing.of(),
            ) : this(name, purpose, required, type, value, priority, mutableMapOf())

            /**
             * Record host/name to create.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * What the record is for.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun purpose(): Purpose = purpose.getRequired("purpose")

            /**
             * Whether the record is required to verify + send (DKIM) or recommended for
             * deliverability.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun required(): Boolean = required.getRequired("required")

            /**
             * DNS record type.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * Record value.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Priority (MX records only).
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun priority(): Optional<Long> = priority.getOptional("priority")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [purpose].
             *
             * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<Purpose> = purpose

            /**
             * Returns the raw JSON value of [required].
             *
             * Unlike [required], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

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
                 * Returns a mutable builder for constructing an instance of [DnsRecord].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .purpose()
                 * .required()
                 * .type()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DnsRecord]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var purpose: JsonField<Purpose>? = null
                private var required: JsonField<Boolean>? = null
                private var type: JsonField<String>? = null
                private var value: JsonField<String>? = null
                private var priority: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dnsRecord: DnsRecord) = apply {
                    name = dnsRecord.name
                    purpose = dnsRecord.purpose
                    required = dnsRecord.required
                    type = dnsRecord.type
                    value = dnsRecord.value
                    priority = dnsRecord.priority
                    additionalProperties = dnsRecord.additionalProperties.toMutableMap()
                }

                /** Record host/name to create. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** What the record is for. */
                fun purpose(purpose: Purpose) = purpose(JsonField.of(purpose))

                /**
                 * Sets [Builder.purpose] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.purpose] with a well-typed [Purpose] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun purpose(purpose: JsonField<Purpose>) = apply { this.purpose = purpose }

                /**
                 * Whether the record is required to verify + send (DKIM) or recommended for
                 * deliverability.
                 */
                fun required(required: Boolean) = required(JsonField.of(required))

                /**
                 * Sets [Builder.required] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.required] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun required(required: JsonField<Boolean>) = apply { this.required = required }

                /** DNS record type. */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                /** Record value. */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

                /** Priority (MX records only). */
                fun priority(priority: Long) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DnsRecord].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .purpose()
                 * .required()
                 * .type()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DnsRecord =
                    DnsRecord(
                        checkRequired("name", name),
                        checkRequired("purpose", purpose),
                        checkRequired("required", required),
                        checkRequired("type", type),
                        checkRequired("value", value),
                        priority,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): DnsRecord = apply {
                if (validated) {
                    return@apply
                }

                name()
                purpose().validate()
                required()
                type()
                value()
                priority()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (purpose.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (required.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0) +
                    (if (priority.asKnown().isPresent) 1 else 0)

            /** What the record is for. */
            class Purpose @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DKIM = of("dkim")

                    @JvmField val SPF = of("spf")

                    @JvmField val DMARC = of("dmarc")

                    @JvmField val MAIL_FROM = of("mail_from")

                    @JvmStatic fun of(value: String) = Purpose(JsonField.of(value))
                }

                /** An enum containing [Purpose]'s known values. */
                enum class Known {
                    DKIM,
                    SPF,
                    DMARC,
                    MAIL_FROM,
                }

                /**
                 * An enum containing [Purpose]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Purpose] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DKIM,
                    SPF,
                    DMARC,
                    MAIL_FROM,
                    /**
                     * An enum member indicating that [Purpose] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DKIM -> Value.DKIM
                        SPF -> Value.SPF
                        DMARC -> Value.DMARC
                        MAIL_FROM -> Value.MAIL_FROM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ZavudevInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DKIM -> Known.DKIM
                        SPF -> Known.SPF
                        DMARC -> Known.DMARC
                        MAIL_FROM -> Known.MAIL_FROM
                        else -> throw ZavudevInvalidDataException("Unknown Purpose: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ZavudevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws ZavudevInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Purpose = apply {
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

                    return other is Purpose && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DnsRecord &&
                    name == other.name &&
                    purpose == other.purpose &&
                    required == other.required &&
                    type == other.type &&
                    value == other.value &&
                    priority == other.priority &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(name, purpose, required, type, value, priority, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DnsRecord{name=$name, purpose=$purpose, required=$required, type=$type, value=$value, priority=$priority, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Domain &&
                id == other.id &&
                dkimStatus == other.dkimStatus &&
                domain == other.domain &&
                status == other.status &&
                dnsRecords == other.dnsRecords &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, dkimStatus, domain, status, dnsRecords, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Domain{id=$id, dkimStatus=$dkimStatus, domain=$domain, status=$status, dnsRecords=$dnsRecords, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailDomainCreateResponse &&
            domain == other.domain &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(domain, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailDomainCreateResponse{domain=$domain, additionalProperties=$additionalProperties}"
}
