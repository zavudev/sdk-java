// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.whatsappsync

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

class WhatsappSyncRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sync: JsonField<WhatsAppSyncStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("sync") @ExcludeMissing sync: JsonField<WhatsAppSyncStatus> = JsonMissing.of()
    ) : this(sync, mutableMapOf())

    /**
     * WhatsApp coexistence sync status.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sync(): WhatsAppSyncStatus = sync.getRequired("sync")

    /**
     * Returns the raw JSON value of [sync].
     *
     * Unlike [sync], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sync") @ExcludeMissing fun _sync(): JsonField<WhatsAppSyncStatus> = sync

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
         * Returns a mutable builder for constructing an instance of [WhatsappSyncRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .sync()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappSyncRetrieveResponse]. */
    class Builder internal constructor() {

        private var sync: JsonField<WhatsAppSyncStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappSyncRetrieveResponse: WhatsappSyncRetrieveResponse) = apply {
            sync = whatsappSyncRetrieveResponse.sync
            additionalProperties = whatsappSyncRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** WhatsApp coexistence sync status. */
        fun sync(sync: WhatsAppSyncStatus) = sync(JsonField.of(sync))

        /**
         * Sets [Builder.sync] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sync] with a well-typed [WhatsAppSyncStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sync(sync: JsonField<WhatsAppSyncStatus>) = apply { this.sync = sync }

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
         * Returns an immutable instance of [WhatsappSyncRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sync()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WhatsappSyncRetrieveResponse =
            WhatsappSyncRetrieveResponse(
                checkRequired("sync", sync),
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
    fun validate(): WhatsappSyncRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        sync().validate()
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
    @JvmSynthetic internal fun validity(): Int = (sync.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappSyncRetrieveResponse &&
            sync == other.sync &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(sync, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappSyncRetrieveResponse{sync=$sync, additionalProperties=$additionalProperties}"
}
