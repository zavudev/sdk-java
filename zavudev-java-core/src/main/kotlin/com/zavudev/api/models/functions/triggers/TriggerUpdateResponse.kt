// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.triggers

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

class TriggerUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val active: JsonField<Boolean>,
    private val ok: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ok") @ExcludeMissing ok: JsonField<Boolean> = JsonMissing.of(),
    ) : this(active, ok, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun active(): Boolean = active.getRequired("active")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ok(): Boolean = ok.getRequired("ok")

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [ok].
     *
     * Unlike [ok], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ok") @ExcludeMissing fun _ok(): JsonField<Boolean> = ok

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
         * Returns a mutable builder for constructing an instance of [TriggerUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .active()
         * .ok()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TriggerUpdateResponse]. */
    class Builder internal constructor() {

        private var active: JsonField<Boolean>? = null
        private var ok: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(triggerUpdateResponse: TriggerUpdateResponse) = apply {
            active = triggerUpdateResponse.active
            ok = triggerUpdateResponse.ok
            additionalProperties = triggerUpdateResponse.additionalProperties.toMutableMap()
        }

        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        fun ok(ok: Boolean) = ok(JsonField.of(ok))

        /**
         * Sets [Builder.ok] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ok] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ok(ok: JsonField<Boolean>) = apply { this.ok = ok }

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
         * Returns an immutable instance of [TriggerUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .active()
         * .ok()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TriggerUpdateResponse =
            TriggerUpdateResponse(
                checkRequired("active", active),
                checkRequired("ok", ok),
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
    fun validate(): TriggerUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        active()
        ok()
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
        (if (active.asKnown().isPresent) 1 else 0) + (if (ok.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TriggerUpdateResponse &&
            active == other.active &&
            ok == other.ok &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(active, ok, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TriggerUpdateResponse{active=$active, ok=$ok, additionalProperties=$additionalProperties}"
}
