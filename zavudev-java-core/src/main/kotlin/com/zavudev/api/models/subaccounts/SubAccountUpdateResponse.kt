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
import kotlin.jvm.optionals.getOrNull

class SubAccountUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val subAccount: JsonField<SubAccount>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("subAccount")
        @ExcludeMissing
        subAccount: JsonField<SubAccount> = JsonMissing.of()
    ) : this(subAccount, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subAccount(): SubAccount = subAccount.getRequired("subAccount")

    /**
     * Returns the raw JSON value of [subAccount].
     *
     * Unlike [subAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subAccount")
    @ExcludeMissing
    fun _subAccount(): JsonField<SubAccount> = subAccount

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
         * Returns a mutable builder for constructing an instance of [SubAccountUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .subAccount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubAccountUpdateResponse]. */
    class Builder internal constructor() {

        private var subAccount: JsonField<SubAccount>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subAccountUpdateResponse: SubAccountUpdateResponse) = apply {
            subAccount = subAccountUpdateResponse.subAccount
            additionalProperties = subAccountUpdateResponse.additionalProperties.toMutableMap()
        }

        fun subAccount(subAccount: SubAccount) = subAccount(JsonField.of(subAccount))

        /**
         * Sets [Builder.subAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subAccount] with a well-typed [SubAccount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subAccount(subAccount: JsonField<SubAccount>) = apply { this.subAccount = subAccount }

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
         * Returns an immutable instance of [SubAccountUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .subAccount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubAccountUpdateResponse =
            SubAccountUpdateResponse(
                checkRequired("subAccount", subAccount),
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
    fun validate(): SubAccountUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        subAccount().validate()
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
    @JvmSynthetic internal fun validity(): Int = (subAccount.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubAccountUpdateResponse &&
            subAccount == other.subAccount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(subAccount, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubAccountUpdateResponse{subAccount=$subAccount, additionalProperties=$additionalProperties}"
}
