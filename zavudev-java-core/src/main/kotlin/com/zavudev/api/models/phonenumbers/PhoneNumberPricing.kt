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

class PhoneNumberPricing
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isFreeEligible: JsonField<Boolean>,
    private val monthlyPrice: JsonField<Double>,
    private val upfrontPrice: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("isFreeEligible")
        @ExcludeMissing
        isFreeEligible: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("monthlyPrice")
        @ExcludeMissing
        monthlyPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("upfrontPrice")
        @ExcludeMissing
        upfrontPrice: JsonField<Double> = JsonMissing.of(),
    ) : this(isFreeEligible, monthlyPrice, upfrontPrice, mutableMapOf())

    /**
     * Whether this number qualifies as the plan-included US number on paid plans. The benefit is
     * one per account: it is never offered again once claimed, not even after the number is
     * released.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isFreeEligible(): Optional<Boolean> = isFreeEligible.getOptional("isFreeEligible")

    /**
     * Monthly price in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyPrice(): Optional<Double> = monthlyPrice.getOptional("monthlyPrice")

    /**
     * One-time purchase price in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upfrontPrice(): Optional<Double> = upfrontPrice.getOptional("upfrontPrice")

    /**
     * Returns the raw JSON value of [isFreeEligible].
     *
     * Unlike [isFreeEligible], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isFreeEligible")
    @ExcludeMissing
    fun _isFreeEligible(): JsonField<Boolean> = isFreeEligible

    /**
     * Returns the raw JSON value of [monthlyPrice].
     *
     * Unlike [monthlyPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlyPrice")
    @ExcludeMissing
    fun _monthlyPrice(): JsonField<Double> = monthlyPrice

    /**
     * Returns the raw JSON value of [upfrontPrice].
     *
     * Unlike [upfrontPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upfrontPrice")
    @ExcludeMissing
    fun _upfrontPrice(): JsonField<Double> = upfrontPrice

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

        /** Returns a mutable builder for constructing an instance of [PhoneNumberPricing]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberPricing]. */
    class Builder internal constructor() {

        private var isFreeEligible: JsonField<Boolean> = JsonMissing.of()
        private var monthlyPrice: JsonField<Double> = JsonMissing.of()
        private var upfrontPrice: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberPricing: PhoneNumberPricing) = apply {
            isFreeEligible = phoneNumberPricing.isFreeEligible
            monthlyPrice = phoneNumberPricing.monthlyPrice
            upfrontPrice = phoneNumberPricing.upfrontPrice
            additionalProperties = phoneNumberPricing.additionalProperties.toMutableMap()
        }

        /**
         * Whether this number qualifies as the plan-included US number on paid plans. The benefit
         * is one per account: it is never offered again once claimed, not even after the number is
         * released.
         */
        fun isFreeEligible(isFreeEligible: Boolean) = isFreeEligible(JsonField.of(isFreeEligible))

        /**
         * Sets [Builder.isFreeEligible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFreeEligible] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isFreeEligible(isFreeEligible: JsonField<Boolean>) = apply {
            this.isFreeEligible = isFreeEligible
        }

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

        /** One-time purchase price in USD. */
        fun upfrontPrice(upfrontPrice: Double) = upfrontPrice(JsonField.of(upfrontPrice))

        /**
         * Sets [Builder.upfrontPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upfrontPrice] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun upfrontPrice(upfrontPrice: JsonField<Double>) = apply {
            this.upfrontPrice = upfrontPrice
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
         * Returns an immutable instance of [PhoneNumberPricing].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberPricing =
            PhoneNumberPricing(
                isFreeEligible,
                monthlyPrice,
                upfrontPrice,
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
    fun validate(): PhoneNumberPricing = apply {
        if (validated) {
            return@apply
        }

        isFreeEligible()
        monthlyPrice()
        upfrontPrice()
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
        (if (isFreeEligible.asKnown().isPresent) 1 else 0) +
            (if (monthlyPrice.asKnown().isPresent) 1 else 0) +
            (if (upfrontPrice.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberPricing &&
            isFreeEligible == other.isFreeEligible &&
            monthlyPrice == other.monthlyPrice &&
            upfrontPrice == other.upfrontPrice &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(isFreeEligible, monthlyPrice, upfrontPrice, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberPricing{isFreeEligible=$isFreeEligible, monthlyPrice=$monthlyPrice, upfrontPrice=$upfrontPrice, additionalProperties=$additionalProperties}"
}
