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
import com.zavudev.api.core.checkRequired
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AvailablePhoneNumber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val capabilities: JsonField<PhoneNumberCapabilities>,
    private val phoneNumber: JsonField<String>,
    private val pricing: JsonField<PhoneNumberPricing>,
    private val friendlyName: JsonField<String>,
    private val locality: JsonField<String>,
    private val region: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("capabilities")
        @ExcludeMissing
        capabilities: JsonField<PhoneNumberCapabilities> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricing")
        @ExcludeMissing
        pricing: JsonField<PhoneNumberPricing> = JsonMissing.of(),
        @JsonProperty("friendlyName")
        @ExcludeMissing
        friendlyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality") @ExcludeMissing locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
    ) : this(capabilities, phoneNumber, pricing, friendlyName, locality, region, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun capabilities(): PhoneNumberCapabilities = capabilities.getRequired("capabilities")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pricing(): PhoneNumberPricing = pricing.getRequired("pricing")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun friendlyName(): Optional<String> = friendlyName.getOptional("friendlyName")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locality(): Optional<String> = locality.getOptional("locality")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("capabilities")
    @ExcludeMissing
    fun _capabilities(): JsonField<PhoneNumberCapabilities> = capabilities

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
    @JsonProperty("pricing") @ExcludeMissing fun _pricing(): JsonField<PhoneNumberPricing> = pricing

    /**
     * Returns the raw JSON value of [friendlyName].
     *
     * Unlike [friendlyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("friendlyName")
    @ExcludeMissing
    fun _friendlyName(): JsonField<String> = friendlyName

    /**
     * Returns the raw JSON value of [locality].
     *
     * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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
         * Returns a mutable builder for constructing an instance of [AvailablePhoneNumber].
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .phoneNumber()
         * .pricing()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AvailablePhoneNumber]. */
    class Builder internal constructor() {

        private var capabilities: JsonField<PhoneNumberCapabilities>? = null
        private var phoneNumber: JsonField<String>? = null
        private var pricing: JsonField<PhoneNumberPricing>? = null
        private var friendlyName: JsonField<String> = JsonMissing.of()
        private var locality: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(availablePhoneNumber: AvailablePhoneNumber) = apply {
            capabilities = availablePhoneNumber.capabilities
            phoneNumber = availablePhoneNumber.phoneNumber
            pricing = availablePhoneNumber.pricing
            friendlyName = availablePhoneNumber.friendlyName
            locality = availablePhoneNumber.locality
            region = availablePhoneNumber.region
            additionalProperties = availablePhoneNumber.additionalProperties.toMutableMap()
        }

        fun capabilities(capabilities: PhoneNumberCapabilities) =
            capabilities(JsonField.of(capabilities))

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed
         * [PhoneNumberCapabilities] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun capabilities(capabilities: JsonField<PhoneNumberCapabilities>) = apply {
            this.capabilities = capabilities
        }

        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun pricing(pricing: PhoneNumberPricing) = pricing(JsonField.of(pricing))

        /**
         * Sets [Builder.pricing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricing] with a well-typed [PhoneNumberPricing] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pricing(pricing: JsonField<PhoneNumberPricing>) = apply { this.pricing = pricing }

        fun friendlyName(friendlyName: String) = friendlyName(JsonField.of(friendlyName))

        /**
         * Sets [Builder.friendlyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.friendlyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun friendlyName(friendlyName: JsonField<String>) = apply {
            this.friendlyName = friendlyName
        }

        fun locality(locality: String) = locality(JsonField.of(locality))

        /**
         * Sets [Builder.locality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locality(locality: JsonField<String>) = apply { this.locality = locality }

        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

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
         * Returns an immutable instance of [AvailablePhoneNumber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .capabilities()
         * .phoneNumber()
         * .pricing()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AvailablePhoneNumber =
            AvailablePhoneNumber(
                checkRequired("capabilities", capabilities),
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("pricing", pricing),
                friendlyName,
                locality,
                region,
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
    fun validate(): AvailablePhoneNumber = apply {
        if (validated) {
            return@apply
        }

        capabilities().validate()
        phoneNumber()
        pricing().validate()
        friendlyName()
        locality()
        region()
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
        (capabilities.asKnown().getOrNull()?.validity() ?: 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (pricing.asKnown().getOrNull()?.validity() ?: 0) +
            (if (friendlyName.asKnown().isPresent) 1 else 0) +
            (if (locality.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AvailablePhoneNumber &&
            capabilities == other.capabilities &&
            phoneNumber == other.phoneNumber &&
            pricing == other.pricing &&
            friendlyName == other.friendlyName &&
            locality == other.locality &&
            region == other.region &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            capabilities,
            phoneNumber,
            pricing,
            friendlyName,
            locality,
            region,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AvailablePhoneNumber{capabilities=$capabilities, phoneNumber=$phoneNumber, pricing=$pricing, friendlyName=$friendlyName, locality=$locality, region=$region, additionalProperties=$additionalProperties}"
}
