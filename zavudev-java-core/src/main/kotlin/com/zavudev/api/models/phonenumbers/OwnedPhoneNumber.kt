// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OwnedPhoneNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val capabilities: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val phoneNumber: JsonField<String>,
    private val pricing: JsonField<OwnedPhoneNumberPricing>,
    private val status: JsonField<PhoneNumberStatus>,
    private val name: JsonField<String>,
    private val nextRenewalDate: JsonField<OffsetDateTime>,
    private val senderId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capabilities")
        @ExcludeMissing
        capabilities: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricing")
        @ExcludeMissing
        pricing: JsonField<OwnedPhoneNumberPricing> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PhoneNumberStatus> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nextRenewalDate")
        @ExcludeMissing
        nextRenewalDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("senderId") @ExcludeMissing senderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        capabilities,
        createdAt,
        phoneNumber,
        pricing,
        status,
        name,
        nextRenewalDate,
        senderId,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): List<String> = capabilities.getRequired("capabilities")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pricing(): OwnedPhoneNumberPricing = pricing.getRequired("pricing")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PhoneNumberStatus = status.getRequired("status")

    /**
     * Optional custom name for the phone number.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextRenewalDate(): Optional<OffsetDateTime> = nextRenewalDate.getOptional("nextRenewalDate")

    /**
     * Sender ID if the phone number is assigned to a sender.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderId(): Optional<String> = senderId.getOptional("senderId")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilities")
    @ExcludeMissing
    fun _capabilities(): JsonField<List<String>> = capabilities

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [pricing].
     *
     * Unlike [pricing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricing")
    @ExcludeMissing
    fun _pricing(): JsonField<OwnedPhoneNumberPricing> = pricing

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PhoneNumberStatus> = status

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [nextRenewalDate].
     *
     * Unlike [nextRenewalDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextRenewalDate")
    @ExcludeMissing
    fun _nextRenewalDate(): JsonField<OffsetDateTime> = nextRenewalDate

    /**
     * Returns the raw JSON value of [senderId].
     *
     * Unlike [senderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senderId") @ExcludeMissing fun _senderId(): JsonField<String> = senderId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [OwnedPhoneNumber].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .capabilities()
         * .createdAt()
         * .phoneNumber()
         * .pricing()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OwnedPhoneNumber]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var capabilities: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var phoneNumber: JsonField<String>? = null
        private var pricing: JsonField<OwnedPhoneNumberPricing>? = null
        private var status: JsonField<PhoneNumberStatus>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var nextRenewalDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var senderId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ownedPhoneNumber: OwnedPhoneNumber) = apply {
            id = ownedPhoneNumber.id
            capabilities = ownedPhoneNumber.capabilities.map { it.toMutableList() }
            createdAt = ownedPhoneNumber.createdAt
            phoneNumber = ownedPhoneNumber.phoneNumber
            pricing = ownedPhoneNumber.pricing
            status = ownedPhoneNumber.status
            name = ownedPhoneNumber.name
            nextRenewalDate = ownedPhoneNumber.nextRenewalDate
            senderId = ownedPhoneNumber.senderId
            updatedAt = ownedPhoneNumber.updatedAt
            additionalProperties = ownedPhoneNumber.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun capabilities(capabilities: List<String>) = capabilities(JsonField.of(capabilities))

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capabilities(capabilities: JsonField<List<String>>) = apply {
            this.capabilities = capabilities.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [capabilities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCapability(capability: String) = apply {
            capabilities =
                (capabilities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("capabilities", it).add(capability)
                }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun pricing(pricing: OwnedPhoneNumberPricing) = pricing(JsonField.of(pricing))

        /**
         * Sets [Builder.pricing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricing] with a well-typed [OwnedPhoneNumberPricing]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pricing(pricing: JsonField<OwnedPhoneNumberPricing>) = apply { this.pricing = pricing }

        fun status(status: PhoneNumberStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PhoneNumberStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PhoneNumberStatus>) = apply { this.status = status }

        /** Optional custom name for the phone number. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun nextRenewalDate(nextRenewalDate: OffsetDateTime) =
            nextRenewalDate(JsonField.of(nextRenewalDate))

        /**
         * Sets [Builder.nextRenewalDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextRenewalDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nextRenewalDate(nextRenewalDate: JsonField<OffsetDateTime>) = apply {
            this.nextRenewalDate = nextRenewalDate
        }

        /** Sender ID if the phone number is assigned to a sender. */
        fun senderId(senderId: String) = senderId(JsonField.of(senderId))

        /**
         * Sets [Builder.senderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senderId(senderId: JsonField<String>) = apply { this.senderId = senderId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [OwnedPhoneNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .capabilities()
         * .createdAt()
         * .phoneNumber()
         * .pricing()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OwnedPhoneNumber =
            OwnedPhoneNumber(
                checkRequired("id", id),
                checkRequired("capabilities", capabilities).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("pricing", pricing),
                checkRequired("status", status),
                name,
                nextRenewalDate,
                senderId,
                updatedAt,
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
    fun validate(): OwnedPhoneNumber = apply {
        if (validated) {
            return@apply
        }

        id()
        capabilities()
        createdAt()
        phoneNumber()
        pricing().validate()
        status().validate()
        name()
        nextRenewalDate()
        senderId()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (capabilities.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (pricing.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (nextRenewalDate.asKnown().isPresent) 1 else 0) +
            (if (senderId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OwnedPhoneNumber &&
            id == other.id &&
            capabilities == other.capabilities &&
            createdAt == other.createdAt &&
            phoneNumber == other.phoneNumber &&
            pricing == other.pricing &&
            status == other.status &&
            name == other.name &&
            nextRenewalDate == other.nextRenewalDate &&
            senderId == other.senderId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            capabilities,
            createdAt,
            phoneNumber,
            pricing,
            status,
            name,
            nextRenewalDate,
            senderId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OwnedPhoneNumber{id=$id, capabilities=$capabilities, createdAt=$createdAt, phoneNumber=$phoneNumber, pricing=$pricing, status=$status, name=$name, nextRenewalDate=$nextRenewalDate, senderId=$senderId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
