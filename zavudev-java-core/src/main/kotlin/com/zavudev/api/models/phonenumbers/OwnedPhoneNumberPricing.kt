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
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class OwnedPhoneNumberPricing
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isFreeNumber: JsonField<Boolean>,
    private val monthlyCost: JsonField<Double>,
    private val monthlyPrice: JsonField<Double>,
    private val upfrontCost: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("isFreeNumber")
        @ExcludeMissing
        isFreeNumber: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("monthlyCost")
        @ExcludeMissing
        monthlyCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("monthlyPrice")
        @ExcludeMissing
        monthlyPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("upfrontCost")
        @ExcludeMissing
        upfrontCost: JsonField<Double> = JsonMissing.of(),
    ) : this(isFreeNumber, monthlyCost, monthlyPrice, upfrontCost, mutableMapOf())

    /**
     * Whether this is a free number.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isFreeNumber(): Optional<Boolean> = isFreeNumber.getOptional("isFreeNumber")

    /**
     * Monthly cost in cents.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyCost(): Optional<Double> = monthlyCost.getOptional("monthlyCost")

    /**
     * Monthly price in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyPrice(): Optional<Double> = monthlyPrice.getOptional("monthlyPrice")

    /**
     * One-time purchase cost in cents.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upfrontCost(): Optional<Double> = upfrontCost.getOptional("upfrontCost")

    /**
     * Returns the raw JSON value of [isFreeNumber].
     *
     * Unlike [isFreeNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isFreeNumber")
    @ExcludeMissing
    fun _isFreeNumber(): JsonField<Boolean> = isFreeNumber

    /**
     * Returns the raw JSON value of [monthlyCost].
     *
     * Unlike [monthlyCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlyCost") @ExcludeMissing fun _monthlyCost(): JsonField<Double> = monthlyCost

    /**
     * Returns the raw JSON value of [monthlyPrice].
     *
     * Unlike [monthlyPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlyPrice")
    @ExcludeMissing
    fun _monthlyPrice(): JsonField<Double> = monthlyPrice

    /**
     * Returns the raw JSON value of [upfrontCost].
     *
     * Unlike [upfrontCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upfrontCost") @ExcludeMissing fun _upfrontCost(): JsonField<Double> = upfrontCost

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

        /** Returns a mutable builder for constructing an instance of [OwnedPhoneNumberPricing]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OwnedPhoneNumberPricing]. */
    class Builder internal constructor() {

        private var isFreeNumber: JsonField<Boolean> = JsonMissing.of()
        private var monthlyCost: JsonField<Double> = JsonMissing.of()
        private var monthlyPrice: JsonField<Double> = JsonMissing.of()
        private var upfrontCost: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ownedPhoneNumberPricing: OwnedPhoneNumberPricing) = apply {
            isFreeNumber = ownedPhoneNumberPricing.isFreeNumber
            monthlyCost = ownedPhoneNumberPricing.monthlyCost
            monthlyPrice = ownedPhoneNumberPricing.monthlyPrice
            upfrontCost = ownedPhoneNumberPricing.upfrontCost
            additionalProperties = ownedPhoneNumberPricing.additionalProperties.toMutableMap()
        }

        /** Whether this is a free number. */
        fun isFreeNumber(isFreeNumber: Boolean) = isFreeNumber(JsonField.of(isFreeNumber))

        /**
         * Sets [Builder.isFreeNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFreeNumber] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isFreeNumber(isFreeNumber: JsonField<Boolean>) = apply {
            this.isFreeNumber = isFreeNumber
        }

        /** Monthly cost in cents. */
        fun monthlyCost(monthlyCost: Double) = monthlyCost(JsonField.of(monthlyCost))

        /**
         * Sets [Builder.monthlyCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlyCost(monthlyCost: JsonField<Double>) = apply { this.monthlyCost = monthlyCost }

        /** Monthly price in USD. */
        fun monthlyPrice(monthlyPrice: Double) = monthlyPrice(JsonField.of(monthlyPrice))

        /**
         * Sets [Builder.monthlyPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyPrice] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlyPrice(monthlyPrice: JsonField<Double>) = apply {
            this.monthlyPrice = monthlyPrice
        }

        /** One-time purchase cost in cents. */
        fun upfrontCost(upfrontCost: Double) = upfrontCost(JsonField.of(upfrontCost))

        /**
         * Sets [Builder.upfrontCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upfrontCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun upfrontCost(upfrontCost: JsonField<Double>) = apply { this.upfrontCost = upfrontCost }

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
         * Returns an immutable instance of [OwnedPhoneNumberPricing].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OwnedPhoneNumberPricing =
            OwnedPhoneNumberPricing(
                isFreeNumber,
                monthlyCost,
                monthlyPrice,
                upfrontCost,
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
    fun validate(): OwnedPhoneNumberPricing = apply {
        if (validated) {
            return@apply
        }

        isFreeNumber()
        monthlyCost()
        monthlyPrice()
        upfrontCost()
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
        (if (isFreeNumber.asKnown().isPresent) 1 else 0) +
            (if (monthlyCost.asKnown().isPresent) 1 else 0) +
            (if (monthlyPrice.asKnown().isPresent) 1 else 0) +
            (if (upfrontCost.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OwnedPhoneNumberPricing &&
            isFreeNumber == other.isFreeNumber &&
            monthlyCost == other.monthlyCost &&
            monthlyPrice == other.monthlyPrice &&
            upfrontCost == other.upfrontCost &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(isFreeNumber, monthlyCost, monthlyPrice, upfrontCost, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OwnedPhoneNumberPricing{isFreeNumber=$isFreeNumber, monthlyCost=$monthlyCost, monthlyPrice=$monthlyPrice, upfrontCost=$upfrontCost, additionalProperties=$additionalProperties}"
}
