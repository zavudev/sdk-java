// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.telegram

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

class TelegramConnectResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val telegram: JsonField<Telegram>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("telegram") @ExcludeMissing telegram: JsonField<Telegram> = JsonMissing.of()
    ) : this(telegram, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun telegram(): Telegram = telegram.getRequired("telegram")

    /**
     * Returns the raw JSON value of [telegram].
     *
     * Unlike [telegram], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("telegram") @ExcludeMissing fun _telegram(): JsonField<Telegram> = telegram

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
         * Returns a mutable builder for constructing an instance of [TelegramConnectResponse].
         *
         * The following fields are required:
         * ```java
         * .telegram()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelegramConnectResponse]. */
    class Builder internal constructor() {

        private var telegram: JsonField<Telegram>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telegramConnectResponse: TelegramConnectResponse) = apply {
            telegram = telegramConnectResponse.telegram
            additionalProperties = telegramConnectResponse.additionalProperties.toMutableMap()
        }

        fun telegram(telegram: Telegram) = telegram(JsonField.of(telegram))

        /**
         * Sets [Builder.telegram] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telegram] with a well-typed [Telegram] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun telegram(telegram: JsonField<Telegram>) = apply { this.telegram = telegram }

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
         * Returns an immutable instance of [TelegramConnectResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .telegram()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TelegramConnectResponse =
            TelegramConnectResponse(
                checkRequired("telegram", telegram),
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
    fun validate(): TelegramConnectResponse = apply {
        if (validated) {
            return@apply
        }

        telegram().validate()
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
    @JvmSynthetic internal fun validity(): Int = (telegram.asKnown().getOrNull()?.validity() ?: 0)

    class Telegram
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connected: JsonField<Boolean>,
        private val botId: JsonField<String>,
        private val botUsername: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connected")
            @ExcludeMissing
            connected: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("botId") @ExcludeMissing botId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("botUsername")
            @ExcludeMissing
            botUsername: JsonField<String> = JsonMissing.of(),
        ) : this(connected, botId, botUsername, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun connected(): Boolean = connected.getRequired("connected")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun botId(): Optional<String> = botId.getOptional("botId")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun botUsername(): Optional<String> = botUsername.getOptional("botUsername")

        /**
         * Returns the raw JSON value of [connected].
         *
         * Unlike [connected], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("connected") @ExcludeMissing fun _connected(): JsonField<Boolean> = connected

        /**
         * Returns the raw JSON value of [botId].
         *
         * Unlike [botId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("botId") @ExcludeMissing fun _botId(): JsonField<String> = botId

        /**
         * Returns the raw JSON value of [botUsername].
         *
         * Unlike [botUsername], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("botUsername")
        @ExcludeMissing
        fun _botUsername(): JsonField<String> = botUsername

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
             * Returns a mutable builder for constructing an instance of [Telegram].
             *
             * The following fields are required:
             * ```java
             * .connected()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Telegram]. */
        class Builder internal constructor() {

            private var connected: JsonField<Boolean>? = null
            private var botId: JsonField<String> = JsonMissing.of()
            private var botUsername: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(telegram: Telegram) = apply {
                connected = telegram.connected
                botId = telegram.botId
                botUsername = telegram.botUsername
                additionalProperties = telegram.additionalProperties.toMutableMap()
            }

            fun connected(connected: Boolean) = connected(JsonField.of(connected))

            /**
             * Sets [Builder.connected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connected] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connected(connected: JsonField<Boolean>) = apply { this.connected = connected }

            fun botId(botId: String) = botId(JsonField.of(botId))

            /**
             * Sets [Builder.botId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.botId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun botId(botId: JsonField<String>) = apply { this.botId = botId }

            fun botUsername(botUsername: String) = botUsername(JsonField.of(botUsername))

            /**
             * Sets [Builder.botUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.botUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun botUsername(botUsername: JsonField<String>) = apply {
                this.botUsername = botUsername
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
             * Returns an immutable instance of [Telegram].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .connected()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Telegram =
                Telegram(
                    checkRequired("connected", connected),
                    botId,
                    botUsername,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Telegram = apply {
            if (validated) {
                return@apply
            }

            connected()
            botId()
            botUsername()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (connected.asKnown().isPresent) 1 else 0) +
                (if (botId.asKnown().isPresent) 1 else 0) +
                (if (botUsername.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Telegram &&
                connected == other.connected &&
                botId == other.botId &&
                botUsername == other.botUsername &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(connected, botId, botUsername, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Telegram{connected=$connected, botId=$botId, botUsername=$botUsername, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelegramConnectResponse &&
            telegram == other.telegram &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(telegram, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelegramConnectResponse{telegram=$telegram, additionalProperties=$additionalProperties}"
}
