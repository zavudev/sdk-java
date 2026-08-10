// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Webhook configuration for the sender. */
class SenderWebhook
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val active: JsonField<Boolean>,
    private val events: JsonField<List<WebhookEvent>>,
    private val signatureVersion: JsonField<SignatureVersion>,
    private val url: JsonField<String>,
    private val secret: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<WebhookEvent>> = JsonMissing.of(),
        @JsonProperty("signatureVersion")
        @ExcludeMissing
        signatureVersion: JsonField<SignatureVersion> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secret") @ExcludeMissing secret: JsonField<String> = JsonMissing.of(),
    ) : this(active, events, signatureVersion, url, secret, mutableMapOf())

    /**
     * Whether the webhook is active.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun active(): Boolean = active.getRequired("active")

    /**
     * List of events the webhook is subscribed to.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<WebhookEvent> = events.getRequired("events")

    /**
     * Which `X-Zavu-Signature` scheme this receiver is sent.
     * - `v1`: `v1=HMAC_SHA256(secret, body)`. The scheme used before this was configurable.
     *   Existing webhooks stay on it until you move them.
     * - `v2`: `v2=HMAC_SHA256(secret, "{t}.{body}")`. The current scheme, and the default for new
     *   senders. It signs the timestamp together with the body.
     * - `v1+v2`: both signatures, sharing one `t`. The migration setting: a receiver reading either
     *   one works, so you can deploy and confirm your new verifier before switching over.
     *
     * Moving from `v1` straight to `v2` returns `400`. Set `v1+v2` first. See
     * https://docs.zavu.dev/guides/receiving-messages/signature-migration
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signatureVersion(): SignatureVersion = signatureVersion.getRequired("signatureVersion")

    /**
     * HTTPS URL that will receive webhook events.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Webhook secret for signature verification. Only returned on create or regenerate.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secret(): Optional<String> = secret.getOptional("secret")

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<WebhookEvent>> = events

    /**
     * Returns the raw JSON value of [signatureVersion].
     *
     * Unlike [signatureVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("signatureVersion")
    @ExcludeMissing
    fun _signatureVersion(): JsonField<SignatureVersion> = signatureVersion

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [secret].
     *
     * Unlike [secret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

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
         * Returns a mutable builder for constructing an instance of [SenderWebhook].
         *
         * The following fields are required:
         * ```java
         * .active()
         * .events()
         * .signatureVersion()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SenderWebhook]. */
    class Builder internal constructor() {

        private var active: JsonField<Boolean>? = null
        private var events: JsonField<MutableList<WebhookEvent>>? = null
        private var signatureVersion: JsonField<SignatureVersion>? = null
        private var url: JsonField<String>? = null
        private var secret: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(senderWebhook: SenderWebhook) = apply {
            active = senderWebhook.active
            events = senderWebhook.events.map { it.toMutableList() }
            signatureVersion = senderWebhook.signatureVersion
            url = senderWebhook.url
            secret = senderWebhook.secret
            additionalProperties = senderWebhook.additionalProperties.toMutableMap()
        }

        /** Whether the webhook is active. */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /** List of events the webhook is subscribed to. */
        fun events(events: List<WebhookEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<WebhookEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<WebhookEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [WebhookEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: WebhookEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /**
         * Which `X-Zavu-Signature` scheme this receiver is sent.
         * - `v1`: `v1=HMAC_SHA256(secret, body)`. The scheme used before this was configurable.
         *   Existing webhooks stay on it until you move them.
         * - `v2`: `v2=HMAC_SHA256(secret, "{t}.{body}")`. The current scheme, and the default for
         *   new senders. It signs the timestamp together with the body.
         * - `v1+v2`: both signatures, sharing one `t`. The migration setting: a receiver reading
         *   either one works, so you can deploy and confirm your new verifier before switching
         *   over.
         *
         * Moving from `v1` straight to `v2` returns `400`. Set `v1+v2` first. See
         * https://docs.zavu.dev/guides/receiving-messages/signature-migration
         */
        fun signatureVersion(signatureVersion: SignatureVersion) =
            signatureVersion(JsonField.of(signatureVersion))

        /**
         * Sets [Builder.signatureVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signatureVersion] with a well-typed [SignatureVersion]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun signatureVersion(signatureVersion: JsonField<SignatureVersion>) = apply {
            this.signatureVersion = signatureVersion
        }

        /** HTTPS URL that will receive webhook events. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Webhook secret for signature verification. Only returned on create or regenerate. */
        fun secret(secret: String) = secret(JsonField.of(secret))

        /**
         * Sets [Builder.secret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secret] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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
         * Returns an immutable instance of [SenderWebhook].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .active()
         * .events()
         * .signatureVersion()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SenderWebhook =
            SenderWebhook(
                checkRequired("active", active),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("signatureVersion", signatureVersion),
                checkRequired("url", url),
                secret,
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
    fun validate(): SenderWebhook = apply {
        if (validated) {
            return@apply
        }

        active()
        events().forEach { it.validate() }
        signatureVersion().validate()
        url()
        secret()
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
        (if (active.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (signatureVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (secret.asKnown().isPresent) 1 else 0)

    /**
     * Which `X-Zavu-Signature` scheme this receiver is sent.
     * - `v1`: `v1=HMAC_SHA256(secret, body)`. The scheme used before this was configurable.
     *   Existing webhooks stay on it until you move them.
     * - `v2`: `v2=HMAC_SHA256(secret, "{t}.{body}")`. The current scheme, and the default for new
     *   senders. It signs the timestamp together with the body.
     * - `v1+v2`: both signatures, sharing one `t`. The migration setting: a receiver reading either
     *   one works, so you can deploy and confirm your new verifier before switching over.
     *
     * Moving from `v1` straight to `v2` returns `400`. Set `v1+v2` first. See
     * https://docs.zavu.dev/guides/receiving-messages/signature-migration
     */
    class SignatureVersion @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val V1 = of("v1")

            @JvmField val V1_V2 = of("v1+v2")

            @JvmField val V2 = of("v2")

            @JvmStatic fun of(value: String) = SignatureVersion(JsonField.of(value))
        }

        /** An enum containing [SignatureVersion]'s known values. */
        enum class Known {
            V1,
            V1_V2,
            V2,
        }

        /**
         * An enum containing [SignatureVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SignatureVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            V1,
            V1_V2,
            V2,
            /**
             * An enum member indicating that [SignatureVersion] was instantiated with an unknown
             * value.
             */
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
                V1 -> Value.V1
                V1_V2 -> Value.V1_V2
                V2 -> Value.V2
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
                V1 -> Known.V1
                V1_V2 -> Known.V1_V2
                V2 -> Known.V2
                else -> throw ZavudevInvalidDataException("Unknown SignatureVersion: $value")
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
        fun validate(): SignatureVersion = apply {
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

            return other is SignatureVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SenderWebhook &&
            active == other.active &&
            events == other.events &&
            signatureVersion == other.signatureVersion &&
            url == other.url &&
            secret == other.secret &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(active, events, signatureVersion, url, secret, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SenderWebhook{active=$active, events=$events, signatureVersion=$signatureVersion, url=$url, secret=$secret, additionalProperties=$additionalProperties}"
}
