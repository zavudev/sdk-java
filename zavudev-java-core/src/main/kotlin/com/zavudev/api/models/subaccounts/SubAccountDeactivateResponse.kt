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

class SubAccountDeactivateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val keysRevoked: JsonField<Long>,
    private val message: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("keysRevoked")
        @ExcludeMissing
        keysRevoked: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
    ) : this(keysRevoked, message, mutableMapOf())

    /**
     * Number of API keys revoked.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun keysRevoked(): Long = keysRevoked.getRequired("keysRevoked")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Returns the raw JSON value of [keysRevoked].
     *
     * Unlike [keysRevoked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keysRevoked") @ExcludeMissing fun _keysRevoked(): JsonField<Long> = keysRevoked

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
         * Returns a mutable builder for constructing an instance of [SubAccountDeactivateResponse].
         *
         * The following fields are required:
         * ```java
         * .keysRevoked()
         * .message()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubAccountDeactivateResponse]. */
    class Builder internal constructor() {

        private var keysRevoked: JsonField<Long>? = null
        private var message: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subAccountDeactivateResponse: SubAccountDeactivateResponse) = apply {
            keysRevoked = subAccountDeactivateResponse.keysRevoked
            message = subAccountDeactivateResponse.message
            additionalProperties = subAccountDeactivateResponse.additionalProperties.toMutableMap()
        }

        /** Number of API keys revoked. */
        fun keysRevoked(keysRevoked: Long) = keysRevoked(JsonField.of(keysRevoked))

        /**
         * Sets [Builder.keysRevoked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keysRevoked] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun keysRevoked(keysRevoked: JsonField<Long>) = apply { this.keysRevoked = keysRevoked }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

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
         * Returns an immutable instance of [SubAccountDeactivateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .keysRevoked()
         * .message()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubAccountDeactivateResponse =
            SubAccountDeactivateResponse(
                checkRequired("keysRevoked", keysRevoked),
                checkRequired("message", message),
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
    fun validate(): SubAccountDeactivateResponse = apply {
        if (validated) {
            return@apply
        }

        keysRevoked()
        message()
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
        (if (keysRevoked.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubAccountDeactivateResponse &&
            keysRevoked == other.keysRevoked &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(keysRevoked, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubAccountDeactivateResponse{keysRevoked=$keysRevoked, message=$message, additionalProperties=$additionalProperties}"
}
