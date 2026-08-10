// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A communication channel for a contact. */
class ContactChannel
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val channel: JsonField<Channel>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val identifier: JsonField<String>,
    private val isPrimary: JsonField<Boolean>,
    private val verified: JsonField<Boolean>,
    private val countryCode: JsonField<String>,
    private val label: JsonField<String>,
    private val lastInboundAt: JsonField<OffsetDateTime>,
    private val metadata: JsonField<Metadata>,
    private val metrics: JsonField<Metrics>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("identifier")
        @ExcludeMissing
        identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isPrimary") @ExcludeMissing isPrimary: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("verified") @ExcludeMissing verified: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastInboundAt")
        @ExcludeMissing
        lastInboundAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("metrics") @ExcludeMissing metrics: JsonField<Metrics> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        channel,
        createdAt,
        identifier,
        isPrimary,
        verified,
        countryCode,
        label,
        lastInboundAt,
        metadata,
        metrics,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Channel type.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): Channel = channel.getRequired("channel")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Channel identifier (phone number or email address).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifier(): String = identifier.getRequired("identifier")

    /**
     * Whether this is the primary channel for its type.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPrimary(): Boolean = isPrimary.getRequired("isPrimary")

    /**
     * Whether this channel has been verified.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verified(): Boolean = verified.getRequired("verified")

    /**
     * ISO country code for phone numbers.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * Optional label for the channel.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Last time a message was received on this channel.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastInboundAt(): Optional<OffsetDateTime> = lastInboundAt.getOptional("lastInboundAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Delivery metrics for this channel.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metrics(): Optional<Metrics> = metrics.getOptional("metrics")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [identifier].
     *
     * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    /**
     * Returns the raw JSON value of [isPrimary].
     *
     * Unlike [isPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPrimary") @ExcludeMissing fun _isPrimary(): JsonField<Boolean> = isPrimary

    /**
     * Returns the raw JSON value of [verified].
     *
     * Unlike [verified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verified") @ExcludeMissing fun _verified(): JsonField<Boolean> = verified

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [lastInboundAt].
     *
     * Unlike [lastInboundAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastInboundAt")
    @ExcludeMissing
    fun _lastInboundAt(): JsonField<OffsetDateTime> = lastInboundAt

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [metrics].
     *
     * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<Metrics> = metrics

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [ContactChannel].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .channel()
         * .createdAt()
         * .identifier()
         * .isPrimary()
         * .verified()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactChannel]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var channel: JsonField<Channel>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var identifier: JsonField<String>? = null
        private var isPrimary: JsonField<Boolean>? = null
        private var verified: JsonField<Boolean>? = null
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var lastInboundAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var metrics: JsonField<Metrics> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactChannel: ContactChannel) = apply {
            id = contactChannel.id
            channel = contactChannel.channel
            createdAt = contactChannel.createdAt
            identifier = contactChannel.identifier
            isPrimary = contactChannel.isPrimary
            verified = contactChannel.verified
            countryCode = contactChannel.countryCode
            label = contactChannel.label
            lastInboundAt = contactChannel.lastInboundAt
            metadata = contactChannel.metadata
            metrics = contactChannel.metrics
            updatedAt = contactChannel.updatedAt
            additionalProperties = contactChannel.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Channel type. */
        fun channel(channel: Channel) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [Channel] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Channel identifier (phone number or email address). */
        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        /**
         * Sets [Builder.identifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        /** Whether this is the primary channel for its type. */
        fun isPrimary(isPrimary: Boolean) = isPrimary(JsonField.of(isPrimary))

        /**
         * Sets [Builder.isPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPrimary] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPrimary(isPrimary: JsonField<Boolean>) = apply { this.isPrimary = isPrimary }

        /** Whether this channel has been verified. */
        fun verified(verified: Boolean) = verified(JsonField.of(verified))

        /**
         * Sets [Builder.verified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verified] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun verified(verified: JsonField<Boolean>) = apply { this.verified = verified }

        /** ISO country code for phone numbers. */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** Optional label for the channel. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Last time a message was received on this channel. */
        fun lastInboundAt(lastInboundAt: OffsetDateTime) =
            lastInboundAt(JsonField.of(lastInboundAt))

        /**
         * Sets [Builder.lastInboundAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastInboundAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastInboundAt(lastInboundAt: JsonField<OffsetDateTime>) = apply {
            this.lastInboundAt = lastInboundAt
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Delivery metrics for this channel. */
        fun metrics(metrics: Metrics) = metrics(JsonField.of(metrics))

        /**
         * Sets [Builder.metrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metrics] with a well-typed [Metrics] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ContactChannel].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .channel()
         * .createdAt()
         * .identifier()
         * .isPrimary()
         * .verified()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactChannel =
            ContactChannel(
                checkRequired("id", id),
                checkRequired("channel", channel),
                checkRequired("createdAt", createdAt),
                checkRequired("identifier", identifier),
                checkRequired("isPrimary", isPrimary),
                checkRequired("verified", verified),
                countryCode,
                label,
                lastInboundAt,
                metadata,
                metrics,
                updatedAt,
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
    fun validate(): ContactChannel = apply {
        if (validated) {
            return@apply
        }

        id()
        channel().validate()
        createdAt()
        identifier()
        isPrimary()
        verified()
        countryCode()
        label()
        lastInboundAt()
        metadata().ifPresent { it.validate() }
        metrics().ifPresent { it.validate() }
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (channel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (identifier.asKnown().isPresent) 1 else 0) +
            (if (isPrimary.asKnown().isPresent) 1 else 0) +
            (if (verified.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (lastInboundAt.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (metrics.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Channel type. */
    class Channel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SMS = of("sms")

            @JvmField val WHATSAPP = of("whatsapp")

            @JvmField val EMAIL = of("email")

            @JvmField val TELEGRAM = of("telegram")

            @JvmField val INSTAGRAM = of("instagram")

            @JvmField val MESSENGER = of("messenger")

            @JvmField val VOICE = of("voice")

            @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
        }

        /** An enum containing [Channel]'s known values. */
        enum class Known {
            SMS,
            WHATSAPP,
            EMAIL,
            TELEGRAM,
            INSTAGRAM,
            MESSENGER,
            VOICE,
        }

        /**
         * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS,
            WHATSAPP,
            EMAIL,
            TELEGRAM,
            INSTAGRAM,
            MESSENGER,
            VOICE,
            /** An enum member indicating that [Channel] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SMS -> Value.SMS
                WHATSAPP -> Value.WHATSAPP
                EMAIL -> Value.EMAIL
                TELEGRAM -> Value.TELEGRAM
                INSTAGRAM -> Value.INSTAGRAM
                MESSENGER -> Value.MESSENGER
                VOICE -> Value.VOICE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ZavudevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SMS -> Known.SMS
                WHATSAPP -> Known.WHATSAPP
                EMAIL -> Known.EMAIL
                TELEGRAM -> Known.TELEGRAM
                INSTAGRAM -> Known.INSTAGRAM
                MESSENGER -> Known.MESSENGER
                VOICE -> Known.VOICE
                else -> throw ZavudevInvalidDataException("Unknown Channel: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ZavudevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { ZavudevInvalidDataException("Value is not a String") }

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
        fun validate(): Channel = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Channel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** Delivery metrics for this channel. */
    class Metrics
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val avgDeliveryTimeMs: JsonField<Double>,
        private val failureCount: JsonField<Long>,
        private val lastSuccessAt: JsonField<OffsetDateTime>,
        private val successCount: JsonField<Long>,
        private val totalAttempts: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("avgDeliveryTimeMs")
            @ExcludeMissing
            avgDeliveryTimeMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("failureCount")
            @ExcludeMissing
            failureCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lastSuccessAt")
            @ExcludeMissing
            lastSuccessAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("successCount")
            @ExcludeMissing
            successCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalAttempts")
            @ExcludeMissing
            totalAttempts: JsonField<Long> = JsonMissing.of(),
        ) : this(
            avgDeliveryTimeMs,
            failureCount,
            lastSuccessAt,
            successCount,
            totalAttempts,
            mutableMapOf(),
        )

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun avgDeliveryTimeMs(): Optional<Double> =
            avgDeliveryTimeMs.getOptional("avgDeliveryTimeMs")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun failureCount(): Optional<Long> = failureCount.getOptional("failureCount")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastSuccessAt(): Optional<OffsetDateTime> = lastSuccessAt.getOptional("lastSuccessAt")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun successCount(): Optional<Long> = successCount.getOptional("successCount")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalAttempts(): Optional<Long> = totalAttempts.getOptional("totalAttempts")

        /**
         * Returns the raw JSON value of [avgDeliveryTimeMs].
         *
         * Unlike [avgDeliveryTimeMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avgDeliveryTimeMs")
        @ExcludeMissing
        fun _avgDeliveryTimeMs(): JsonField<Double> = avgDeliveryTimeMs

        /**
         * Returns the raw JSON value of [failureCount].
         *
         * Unlike [failureCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failureCount")
        @ExcludeMissing
        fun _failureCount(): JsonField<Long> = failureCount

        /**
         * Returns the raw JSON value of [lastSuccessAt].
         *
         * Unlike [lastSuccessAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastSuccessAt")
        @ExcludeMissing
        fun _lastSuccessAt(): JsonField<OffsetDateTime> = lastSuccessAt

        /**
         * Returns the raw JSON value of [successCount].
         *
         * Unlike [successCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("successCount")
        @ExcludeMissing
        fun _successCount(): JsonField<Long> = successCount

        /**
         * Returns the raw JSON value of [totalAttempts].
         *
         * Unlike [totalAttempts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalAttempts")
        @ExcludeMissing
        fun _totalAttempts(): JsonField<Long> = totalAttempts

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

            /** Returns a mutable builder for constructing an instance of [Metrics]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metrics]. */
        class Builder internal constructor() {

            private var avgDeliveryTimeMs: JsonField<Double> = JsonMissing.of()
            private var failureCount: JsonField<Long> = JsonMissing.of()
            private var lastSuccessAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var successCount: JsonField<Long> = JsonMissing.of()
            private var totalAttempts: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metrics: Metrics) = apply {
                avgDeliveryTimeMs = metrics.avgDeliveryTimeMs
                failureCount = metrics.failureCount
                lastSuccessAt = metrics.lastSuccessAt
                successCount = metrics.successCount
                totalAttempts = metrics.totalAttempts
                additionalProperties = metrics.additionalProperties.toMutableMap()
            }

            fun avgDeliveryTimeMs(avgDeliveryTimeMs: Double) =
                avgDeliveryTimeMs(JsonField.of(avgDeliveryTimeMs))

            /**
             * Sets [Builder.avgDeliveryTimeMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgDeliveryTimeMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgDeliveryTimeMs(avgDeliveryTimeMs: JsonField<Double>) = apply {
                this.avgDeliveryTimeMs = avgDeliveryTimeMs
            }

            fun failureCount(failureCount: Long) = failureCount(JsonField.of(failureCount))

            /**
             * Sets [Builder.failureCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failureCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failureCount(failureCount: JsonField<Long>) = apply {
                this.failureCount = failureCount
            }

            fun lastSuccessAt(lastSuccessAt: OffsetDateTime) =
                lastSuccessAt(JsonField.of(lastSuccessAt))

            /**
             * Sets [Builder.lastSuccessAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastSuccessAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastSuccessAt(lastSuccessAt: JsonField<OffsetDateTime>) = apply {
                this.lastSuccessAt = lastSuccessAt
            }

            fun successCount(successCount: Long) = successCount(JsonField.of(successCount))

            /**
             * Sets [Builder.successCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.successCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun successCount(successCount: JsonField<Long>) = apply {
                this.successCount = successCount
            }

            fun totalAttempts(totalAttempts: Long) = totalAttempts(JsonField.of(totalAttempts))

            /**
             * Sets [Builder.totalAttempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalAttempts] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalAttempts(totalAttempts: JsonField<Long>) = apply {
                this.totalAttempts = totalAttempts
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
             * Returns an immutable instance of [Metrics].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metrics =
                Metrics(
                    avgDeliveryTimeMs,
                    failureCount,
                    lastSuccessAt,
                    successCount,
                    totalAttempts,
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
        fun validate(): Metrics = apply {
            if (validated) {
                return@apply
            }

            avgDeliveryTimeMs()
            failureCount()
            lastSuccessAt()
            successCount()
            totalAttempts()
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
            (if (avgDeliveryTimeMs.asKnown().isPresent) 1 else 0) +
                (if (failureCount.asKnown().isPresent) 1 else 0) +
                (if (lastSuccessAt.asKnown().isPresent) 1 else 0) +
                (if (successCount.asKnown().isPresent) 1 else 0) +
                (if (totalAttempts.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metrics &&
                avgDeliveryTimeMs == other.avgDeliveryTimeMs &&
                failureCount == other.failureCount &&
                lastSuccessAt == other.lastSuccessAt &&
                successCount == other.successCount &&
                totalAttempts == other.totalAttempts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                avgDeliveryTimeMs,
                failureCount,
                lastSuccessAt,
                successCount,
                totalAttempts,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metrics{avgDeliveryTimeMs=$avgDeliveryTimeMs, failureCount=$failureCount, lastSuccessAt=$lastSuccessAt, successCount=$successCount, totalAttempts=$totalAttempts, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactChannel &&
            id == other.id &&
            channel == other.channel &&
            createdAt == other.createdAt &&
            identifier == other.identifier &&
            isPrimary == other.isPrimary &&
            verified == other.verified &&
            countryCode == other.countryCode &&
            label == other.label &&
            lastInboundAt == other.lastInboundAt &&
            metadata == other.metadata &&
            metrics == other.metrics &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            channel,
            createdAt,
            identifier,
            isPrimary,
            verified,
            countryCode,
            label,
            lastInboundAt,
            metadata,
            metrics,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactChannel{id=$id, channel=$channel, createdAt=$createdAt, identifier=$identifier, isPrimary=$isPrimary, verified=$verified, countryCode=$countryCode, label=$label, lastInboundAt=$lastInboundAt, metadata=$metadata, metrics=$metrics, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
