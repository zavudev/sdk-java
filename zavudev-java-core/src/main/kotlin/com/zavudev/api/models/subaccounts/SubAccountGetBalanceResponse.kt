// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts

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

class SubAccountGetBalanceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val balance: JsonField<Long>,
    private val currency: JsonField<String>,
    private val creditLimit: JsonField<Long>,
    private val isSubAccount: JsonField<Boolean>,
    private val totalSpent: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("balance") @ExcludeMissing balance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditLimit")
        @ExcludeMissing
        creditLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("isSubAccount")
        @ExcludeMissing
        isSubAccount: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("totalSpent") @ExcludeMissing totalSpent: JsonField<Long> = JsonMissing.of(),
    ) : this(balance, currency, creditLimit, isSubAccount, totalSpent, mutableMapOf())

    /**
     * Team balance in cents. All charges are billed to the parent team.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balance(): Long = balance.getRequired("balance")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Spending cap in cents (only for sub-accounts).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditLimit(): Optional<Long> = creditLimit.getOptional("creditLimit")

    /**
     * Whether this API key belongs to a sub-account.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isSubAccount(): Optional<Boolean> = isSubAccount.getOptional("isSubAccount")

    /**
     * Total amount spent by this sub-account in cents (only for sub-accounts).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalSpent(): Optional<Long> = totalSpent.getOptional("totalSpent")

    /**
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Long> = balance

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [creditLimit].
     *
     * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditLimit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

    /**
     * Returns the raw JSON value of [isSubAccount].
     *
     * Unlike [isSubAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isSubAccount")
    @ExcludeMissing
    fun _isSubAccount(): JsonField<Boolean> = isSubAccount

    /**
     * Returns the raw JSON value of [totalSpent].
     *
     * Unlike [totalSpent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalSpent") @ExcludeMissing fun _totalSpent(): JsonField<Long> = totalSpent

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
         * Returns a mutable builder for constructing an instance of [SubAccountGetBalanceResponse].
         *
         * The following fields are required:
         * ```java
         * .balance()
         * .currency()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubAccountGetBalanceResponse]. */
    class Builder internal constructor() {

        private var balance: JsonField<Long>? = null
        private var currency: JsonField<String>? = null
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var isSubAccount: JsonField<Boolean> = JsonMissing.of()
        private var totalSpent: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subAccountGetBalanceResponse: SubAccountGetBalanceResponse) = apply {
            balance = subAccountGetBalanceResponse.balance
            currency = subAccountGetBalanceResponse.currency
            creditLimit = subAccountGetBalanceResponse.creditLimit
            isSubAccount = subAccountGetBalanceResponse.isSubAccount
            totalSpent = subAccountGetBalanceResponse.totalSpent
            additionalProperties = subAccountGetBalanceResponse.additionalProperties.toMutableMap()
        }

        /** Team balance in cents. All charges are billed to the parent team. */
        fun balance(balance: Long) = balance(JsonField.of(balance))

        /**
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balance(balance: JsonField<Long>) = apply { this.balance = balance }

        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Spending cap in cents (only for sub-accounts). */
        fun creditLimit(creditLimit: Long?) = creditLimit(JsonField.ofNullable(creditLimit))

        /**
         * Alias for [Builder.creditLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun creditLimit(creditLimit: Long) = creditLimit(creditLimit as Long?)

        /** Alias for calling [Builder.creditLimit] with `creditLimit.orElse(null)`. */
        fun creditLimit(creditLimit: Optional<Long>) = creditLimit(creditLimit.getOrNull())

        /**
         * Sets [Builder.creditLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Whether this API key belongs to a sub-account. */
        fun isSubAccount(isSubAccount: Boolean) = isSubAccount(JsonField.of(isSubAccount))

        /**
         * Sets [Builder.isSubAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSubAccount] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isSubAccount(isSubAccount: JsonField<Boolean>) = apply {
            this.isSubAccount = isSubAccount
        }

        /** Total amount spent by this sub-account in cents (only for sub-accounts). */
        fun totalSpent(totalSpent: Long?) = totalSpent(JsonField.ofNullable(totalSpent))

        /**
         * Alias for [Builder.totalSpent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalSpent(totalSpent: Long) = totalSpent(totalSpent as Long?)

        /** Alias for calling [Builder.totalSpent] with `totalSpent.orElse(null)`. */
        fun totalSpent(totalSpent: Optional<Long>) = totalSpent(totalSpent.getOrNull())

        /**
         * Sets [Builder.totalSpent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSpent] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalSpent(totalSpent: JsonField<Long>) = apply { this.totalSpent = totalSpent }

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
         * Returns an immutable instance of [SubAccountGetBalanceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .balance()
         * .currency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubAccountGetBalanceResponse =
            SubAccountGetBalanceResponse(
                checkRequired("balance", balance),
                checkRequired("currency", currency),
                creditLimit,
                isSubAccount,
                totalSpent,
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
    fun validate(): SubAccountGetBalanceResponse = apply {
        if (validated) {
            return@apply
        }

        balance()
        currency()
        creditLimit()
        isSubAccount()
        totalSpent()
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
        (if (balance.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (creditLimit.asKnown().isPresent) 1 else 0) +
            (if (isSubAccount.asKnown().isPresent) 1 else 0) +
            (if (totalSpent.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubAccountGetBalanceResponse &&
            balance == other.balance &&
            currency == other.currency &&
            creditLimit == other.creditLimit &&
            isSubAccount == other.isSubAccount &&
            totalSpent == other.totalSpent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(balance, currency, creditLimit, isSubAccount, totalSpent, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubAccountGetBalanceResponse{balance=$balance, currency=$currency, creditLimit=$creditLimit, isSubAccount=$isSubAccount, totalSpent=$totalSpent, additionalProperties=$additionalProperties}"
}
