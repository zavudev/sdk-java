// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts.channels

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
import com.zavudev.api.models.contacts.ContactChannel
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ChannelAddResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channel: JsonField<ContactChannel>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel")
        @ExcludeMissing
        channel: JsonField<ContactChannel> = JsonMissing.of()
    ) : this(channel, mutableMapOf())

    /**
     * A communication channel for a contact.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): ContactChannel = channel.getRequired("channel")

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<ContactChannel> = channel

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
         * Returns a mutable builder for constructing an instance of [ChannelAddResponse].
         *
         * The following fields are required:
         * ```java
         * .channel()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelAddResponse]. */
    class Builder internal constructor() {

        private var channel: JsonField<ContactChannel>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(channelAddResponse: ChannelAddResponse) = apply {
            channel = channelAddResponse.channel
            additionalProperties = channelAddResponse.additionalProperties.toMutableMap()
        }

        /** A communication channel for a contact. */
        fun channel(channel: ContactChannel) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [ContactChannel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channel(channel: JsonField<ContactChannel>) = apply { this.channel = channel }

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
         * Returns an immutable instance of [ChannelAddResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channel()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChannelAddResponse =
            ChannelAddResponse(
                checkRequired("channel", channel),
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
    fun validate(): ChannelAddResponse = apply {
        if (validated) {
            return@apply
        }

        channel().validate()
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
    @JvmSynthetic internal fun validity(): Int = (channel.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelAddResponse &&
            channel == other.channel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(channel, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChannelAddResponse{channel=$channel, additionalProperties=$additionalProperties}"
}
