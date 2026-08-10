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
import com.zavudev.api.core.Params
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update sender */
class SenderUpdateParams
private constructor(
    private val senderId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun senderId(): Optional<String> = Optional.ofNullable(senderId)

    /**
     * Attach or change the sender's email from-address (e.g. noreply@yourdomain.com). The domain
     * must be a verified email domain in your project.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailAddress(): Optional<String> = body.emailAddress()

    /**
     * Enable or disable domain catch-all. When enabled (with emailReceivingEnabled true), this
     * sender receives email for any address at its domain. Ignored (treated as false) if receiving
     * is not enabled.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailCatchAllEnabled(): Optional<Boolean> = body.emailCatchAllEnabled()

    /**
     * ID of the verified email domain to attach. Optional — resolved from `emailAddress`'s domain
     * when omitted.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailDomainId(): Optional<String> = body.emailDomainId()

    /**
     * Display name shown in the recipient's inbox for the email channel.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailFromName(): Optional<String> = body.emailFromName()

    /**
     * Enable or disable inbound email receiving for this sender.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailReceivingEnabled(): Optional<Boolean> = body.emailReceivingEnabled()

    /**
     * Turn the one-way SMS channel on or off. Enabling needs nothing else and takes effect
     * immediately; disabling removes the channel from the sender. Confirm with the `channels` array
     * on the response.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableSmsOneway(): Optional<Boolean> = body.enableSmsOneway()

    /**
     * Turn the voice channel on or off. The sender must already have a phone number provisioned for
     * calls; enabling it otherwise returns 400 instead of storing a flag that changes nothing.
     * Confirm with the `channels` array on the response.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableVoice(): Optional<Boolean> = body.enableVoice()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun setAsDefault(): Optional<Boolean> = body.setAsDefault()

    /**
     * Whether the webhook is active.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookActive(): Optional<Boolean> = body.webhookActive()

    /**
     * Events to subscribe to.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookEvents(): Optional<List<WebhookEvent>> = body.webhookEvents()

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
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookSignatureVersion(): Optional<WebhookSignatureVersion> =
        body.webhookSignatureVersion()

    /**
     * HTTPS URL for webhook events. Set to null to remove webhook.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [emailAddress].
     *
     * Unlike [emailAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emailAddress(): JsonField<String> = body._emailAddress()

    /**
     * Returns the raw JSON value of [emailCatchAllEnabled].
     *
     * Unlike [emailCatchAllEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _emailCatchAllEnabled(): JsonField<Boolean> = body._emailCatchAllEnabled()

    /**
     * Returns the raw JSON value of [emailDomainId].
     *
     * Unlike [emailDomainId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emailDomainId(): JsonField<String> = body._emailDomainId()

    /**
     * Returns the raw JSON value of [emailFromName].
     *
     * Unlike [emailFromName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emailFromName(): JsonField<String> = body._emailFromName()

    /**
     * Returns the raw JSON value of [emailReceivingEnabled].
     *
     * Unlike [emailReceivingEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _emailReceivingEnabled(): JsonField<Boolean> = body._emailReceivingEnabled()

    /**
     * Returns the raw JSON value of [enableSmsOneway].
     *
     * Unlike [enableSmsOneway], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enableSmsOneway(): JsonField<Boolean> = body._enableSmsOneway()

    /**
     * Returns the raw JSON value of [enableVoice].
     *
     * Unlike [enableVoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enableVoice(): JsonField<Boolean> = body._enableVoice()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [setAsDefault].
     *
     * Unlike [setAsDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _setAsDefault(): JsonField<Boolean> = body._setAsDefault()

    /**
     * Returns the raw JSON value of [webhookActive].
     *
     * Unlike [webhookActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookActive(): JsonField<Boolean> = body._webhookActive()

    /**
     * Returns the raw JSON value of [webhookEvents].
     *
     * Unlike [webhookEvents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookEvents(): JsonField<List<WebhookEvent>> = body._webhookEvents()

    /**
     * Returns the raw JSON value of [webhookSignatureVersion].
     *
     * Unlike [webhookSignatureVersion], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _webhookSignatureVersion(): JsonField<WebhookSignatureVersion> =
        body._webhookSignatureVersion()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SenderUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SenderUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SenderUpdateParams]. */
    class Builder internal constructor() {

        private var senderId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(senderUpdateParams: SenderUpdateParams) = apply {
            senderId = senderUpdateParams.senderId
            body = senderUpdateParams.body.toBuilder()
            additionalHeaders = senderUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = senderUpdateParams.additionalQueryParams.toBuilder()
        }

        fun senderId(senderId: String?) = apply { this.senderId = senderId }

        /** Alias for calling [Builder.senderId] with `senderId.orElse(null)`. */
        fun senderId(senderId: Optional<String>) = senderId(senderId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [emailAddress]
         * - [emailCatchAllEnabled]
         * - [emailDomainId]
         * - [emailFromName]
         * - [emailReceivingEnabled]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Attach or change the sender's email from-address (e.g. noreply@yourdomain.com). The
         * domain must be a verified email domain in your project.
         */
        fun emailAddress(emailAddress: String) = apply { body.emailAddress(emailAddress) }

        /**
         * Sets [Builder.emailAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailAddress(emailAddress: JsonField<String>) = apply {
            body.emailAddress(emailAddress)
        }

        /**
         * Enable or disable domain catch-all. When enabled (with emailReceivingEnabled true), this
         * sender receives email for any address at its domain. Ignored (treated as false) if
         * receiving is not enabled.
         */
        fun emailCatchAllEnabled(emailCatchAllEnabled: Boolean) = apply {
            body.emailCatchAllEnabled(emailCatchAllEnabled)
        }

        /**
         * Sets [Builder.emailCatchAllEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailCatchAllEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailCatchAllEnabled(emailCatchAllEnabled: JsonField<Boolean>) = apply {
            body.emailCatchAllEnabled(emailCatchAllEnabled)
        }

        /**
         * ID of the verified email domain to attach. Optional — resolved from `emailAddress`'s
         * domain when omitted.
         */
        fun emailDomainId(emailDomainId: String) = apply { body.emailDomainId(emailDomainId) }

        /**
         * Sets [Builder.emailDomainId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailDomainId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailDomainId(emailDomainId: JsonField<String>) = apply {
            body.emailDomainId(emailDomainId)
        }

        /** Display name shown in the recipient's inbox for the email channel. */
        fun emailFromName(emailFromName: String) = apply { body.emailFromName(emailFromName) }

        /**
         * Sets [Builder.emailFromName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailFromName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailFromName(emailFromName: JsonField<String>) = apply {
            body.emailFromName(emailFromName)
        }

        /** Enable or disable inbound email receiving for this sender. */
        fun emailReceivingEnabled(emailReceivingEnabled: Boolean) = apply {
            body.emailReceivingEnabled(emailReceivingEnabled)
        }

        /**
         * Sets [Builder.emailReceivingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailReceivingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailReceivingEnabled(emailReceivingEnabled: JsonField<Boolean>) = apply {
            body.emailReceivingEnabled(emailReceivingEnabled)
        }

        /**
         * Turn the one-way SMS channel on or off. Enabling needs nothing else and takes effect
         * immediately; disabling removes the channel from the sender. Confirm with the `channels`
         * array on the response.
         */
        fun enableSmsOneway(enableSmsOneway: Boolean) = apply {
            body.enableSmsOneway(enableSmsOneway)
        }

        /**
         * Sets [Builder.enableSmsOneway] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableSmsOneway] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableSmsOneway(enableSmsOneway: JsonField<Boolean>) = apply {
            body.enableSmsOneway(enableSmsOneway)
        }

        /**
         * Turn the voice channel on or off. The sender must already have a phone number provisioned
         * for calls; enabling it otherwise returns 400 instead of storing a flag that changes
         * nothing. Confirm with the `channels` array on the response.
         */
        fun enableVoice(enableVoice: Boolean) = apply { body.enableVoice(enableVoice) }

        /**
         * Sets [Builder.enableVoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableVoice] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enableVoice(enableVoice: JsonField<Boolean>) = apply { body.enableVoice(enableVoice) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun setAsDefault(setAsDefault: Boolean) = apply { body.setAsDefault(setAsDefault) }

        /**
         * Sets [Builder.setAsDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setAsDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun setAsDefault(setAsDefault: JsonField<Boolean>) = apply {
            body.setAsDefault(setAsDefault)
        }

        /** Whether the webhook is active. */
        fun webhookActive(webhookActive: Boolean) = apply { body.webhookActive(webhookActive) }

        /**
         * Sets [Builder.webhookActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookActive] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookActive(webhookActive: JsonField<Boolean>) = apply {
            body.webhookActive(webhookActive)
        }

        /** Events to subscribe to. */
        fun webhookEvents(webhookEvents: List<WebhookEvent>) = apply {
            body.webhookEvents(webhookEvents)
        }

        /**
         * Sets [Builder.webhookEvents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEvents] with a well-typed `List<WebhookEvent>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookEvents(webhookEvents: JsonField<List<WebhookEvent>>) = apply {
            body.webhookEvents(webhookEvents)
        }

        /**
         * Adds a single [WebhookEvent] to [webhookEvents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebhookEvent(webhookEvent: WebhookEvent) = apply {
            body.addWebhookEvent(webhookEvent)
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
        fun webhookSignatureVersion(webhookSignatureVersion: WebhookSignatureVersion) = apply {
            body.webhookSignatureVersion(webhookSignatureVersion)
        }

        /**
         * Sets [Builder.webhookSignatureVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookSignatureVersion] with a well-typed
         * [WebhookSignatureVersion] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun webhookSignatureVersion(webhookSignatureVersion: JsonField<WebhookSignatureVersion>) =
            apply {
                body.webhookSignatureVersion(webhookSignatureVersion)
            }

        /** HTTPS URL for webhook events. Set to null to remove webhook. */
        fun webhookUrl(webhookUrl: String?) = apply { body.webhookUrl(webhookUrl) }

        /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
        fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SenderUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SenderUpdateParams =
            SenderUpdateParams(
                senderId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> senderId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val emailAddress: JsonField<String>,
        private val emailCatchAllEnabled: JsonField<Boolean>,
        private val emailDomainId: JsonField<String>,
        private val emailFromName: JsonField<String>,
        private val emailReceivingEnabled: JsonField<Boolean>,
        private val enableSmsOneway: JsonField<Boolean>,
        private val enableVoice: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val setAsDefault: JsonField<Boolean>,
        private val webhookActive: JsonField<Boolean>,
        private val webhookEvents: JsonField<List<WebhookEvent>>,
        private val webhookSignatureVersion: JsonField<WebhookSignatureVersion>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("emailAddress")
            @ExcludeMissing
            emailAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emailCatchAllEnabled")
            @ExcludeMissing
            emailCatchAllEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("emailDomainId")
            @ExcludeMissing
            emailDomainId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emailFromName")
            @ExcludeMissing
            emailFromName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emailReceivingEnabled")
            @ExcludeMissing
            emailReceivingEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("enableSmsOneway")
            @ExcludeMissing
            enableSmsOneway: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("enableVoice")
            @ExcludeMissing
            enableVoice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("setAsDefault")
            @ExcludeMissing
            setAsDefault: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("webhookActive")
            @ExcludeMissing
            webhookActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("webhookEvents")
            @ExcludeMissing
            webhookEvents: JsonField<List<WebhookEvent>> = JsonMissing.of(),
            @JsonProperty("webhookSignatureVersion")
            @ExcludeMissing
            webhookSignatureVersion: JsonField<WebhookSignatureVersion> = JsonMissing.of(),
            @JsonProperty("webhookUrl")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            emailAddress,
            emailCatchAllEnabled,
            emailDomainId,
            emailFromName,
            emailReceivingEnabled,
            enableSmsOneway,
            enableVoice,
            name,
            setAsDefault,
            webhookActive,
            webhookEvents,
            webhookSignatureVersion,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * Attach or change the sender's email from-address (e.g. noreply@yourdomain.com). The
         * domain must be a verified email domain in your project.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailAddress(): Optional<String> = emailAddress.getOptional("emailAddress")

        /**
         * Enable or disable domain catch-all. When enabled (with emailReceivingEnabled true), this
         * sender receives email for any address at its domain. Ignored (treated as false) if
         * receiving is not enabled.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailCatchAllEnabled(): Optional<Boolean> =
            emailCatchAllEnabled.getOptional("emailCatchAllEnabled")

        /**
         * ID of the verified email domain to attach. Optional — resolved from `emailAddress`'s
         * domain when omitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailDomainId(): Optional<String> = emailDomainId.getOptional("emailDomainId")

        /**
         * Display name shown in the recipient's inbox for the email channel.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailFromName(): Optional<String> = emailFromName.getOptional("emailFromName")

        /**
         * Enable or disable inbound email receiving for this sender.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailReceivingEnabled(): Optional<Boolean> =
            emailReceivingEnabled.getOptional("emailReceivingEnabled")

        /**
         * Turn the one-way SMS channel on or off. Enabling needs nothing else and takes effect
         * immediately; disabling removes the channel from the sender. Confirm with the `channels`
         * array on the response.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableSmsOneway(): Optional<Boolean> = enableSmsOneway.getOptional("enableSmsOneway")

        /**
         * Turn the voice channel on or off. The sender must already have a phone number provisioned
         * for calls; enabling it otherwise returns 400 instead of storing a flag that changes
         * nothing. Confirm with the `channels` array on the response.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableVoice(): Optional<Boolean> = enableVoice.getOptional("enableVoice")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun setAsDefault(): Optional<Boolean> = setAsDefault.getOptional("setAsDefault")

        /**
         * Whether the webhook is active.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookActive(): Optional<Boolean> = webhookActive.getOptional("webhookActive")

        /**
         * Events to subscribe to.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookEvents(): Optional<List<WebhookEvent>> =
            webhookEvents.getOptional("webhookEvents")

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
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookSignatureVersion(): Optional<WebhookSignatureVersion> =
            webhookSignatureVersion.getOptional("webhookSignatureVersion")

        /**
         * HTTPS URL for webhook events. Set to null to remove webhook.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhookUrl")

        /**
         * Returns the raw JSON value of [emailAddress].
         *
         * Unlike [emailAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emailAddress")
        @ExcludeMissing
        fun _emailAddress(): JsonField<String> = emailAddress

        /**
         * Returns the raw JSON value of [emailCatchAllEnabled].
         *
         * Unlike [emailCatchAllEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("emailCatchAllEnabled")
        @ExcludeMissing
        fun _emailCatchAllEnabled(): JsonField<Boolean> = emailCatchAllEnabled

        /**
         * Returns the raw JSON value of [emailDomainId].
         *
         * Unlike [emailDomainId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emailDomainId")
        @ExcludeMissing
        fun _emailDomainId(): JsonField<String> = emailDomainId

        /**
         * Returns the raw JSON value of [emailFromName].
         *
         * Unlike [emailFromName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emailFromName")
        @ExcludeMissing
        fun _emailFromName(): JsonField<String> = emailFromName

        /**
         * Returns the raw JSON value of [emailReceivingEnabled].
         *
         * Unlike [emailReceivingEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("emailReceivingEnabled")
        @ExcludeMissing
        fun _emailReceivingEnabled(): JsonField<Boolean> = emailReceivingEnabled

        /**
         * Returns the raw JSON value of [enableSmsOneway].
         *
         * Unlike [enableSmsOneway], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enableSmsOneway")
        @ExcludeMissing
        fun _enableSmsOneway(): JsonField<Boolean> = enableSmsOneway

        /**
         * Returns the raw JSON value of [enableVoice].
         *
         * Unlike [enableVoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enableVoice")
        @ExcludeMissing
        fun _enableVoice(): JsonField<Boolean> = enableVoice

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [setAsDefault].
         *
         * Unlike [setAsDefault], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("setAsDefault")
        @ExcludeMissing
        fun _setAsDefault(): JsonField<Boolean> = setAsDefault

        /**
         * Returns the raw JSON value of [webhookActive].
         *
         * Unlike [webhookActive], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhookActive")
        @ExcludeMissing
        fun _webhookActive(): JsonField<Boolean> = webhookActive

        /**
         * Returns the raw JSON value of [webhookEvents].
         *
         * Unlike [webhookEvents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhookEvents")
        @ExcludeMissing
        fun _webhookEvents(): JsonField<List<WebhookEvent>> = webhookEvents

        /**
         * Returns the raw JSON value of [webhookSignatureVersion].
         *
         * Unlike [webhookSignatureVersion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhookSignatureVersion")
        @ExcludeMissing
        fun _webhookSignatureVersion(): JsonField<WebhookSignatureVersion> = webhookSignatureVersion

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhookUrl")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var emailAddress: JsonField<String> = JsonMissing.of()
            private var emailCatchAllEnabled: JsonField<Boolean> = JsonMissing.of()
            private var emailDomainId: JsonField<String> = JsonMissing.of()
            private var emailFromName: JsonField<String> = JsonMissing.of()
            private var emailReceivingEnabled: JsonField<Boolean> = JsonMissing.of()
            private var enableSmsOneway: JsonField<Boolean> = JsonMissing.of()
            private var enableVoice: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var setAsDefault: JsonField<Boolean> = JsonMissing.of()
            private var webhookActive: JsonField<Boolean> = JsonMissing.of()
            private var webhookEvents: JsonField<MutableList<WebhookEvent>>? = null
            private var webhookSignatureVersion: JsonField<WebhookSignatureVersion> =
                JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                emailAddress = body.emailAddress
                emailCatchAllEnabled = body.emailCatchAllEnabled
                emailDomainId = body.emailDomainId
                emailFromName = body.emailFromName
                emailReceivingEnabled = body.emailReceivingEnabled
                enableSmsOneway = body.enableSmsOneway
                enableVoice = body.enableVoice
                name = body.name
                setAsDefault = body.setAsDefault
                webhookActive = body.webhookActive
                webhookEvents = body.webhookEvents.map { it.toMutableList() }
                webhookSignatureVersion = body.webhookSignatureVersion
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Attach or change the sender's email from-address (e.g. noreply@yourdomain.com). The
             * domain must be a verified email domain in your project.
             */
            fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

            /**
             * Sets [Builder.emailAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailAddress(emailAddress: JsonField<String>) = apply {
                this.emailAddress = emailAddress
            }

            /**
             * Enable or disable domain catch-all. When enabled (with emailReceivingEnabled true),
             * this sender receives email for any address at its domain. Ignored (treated as false)
             * if receiving is not enabled.
             */
            fun emailCatchAllEnabled(emailCatchAllEnabled: Boolean) =
                emailCatchAllEnabled(JsonField.of(emailCatchAllEnabled))

            /**
             * Sets [Builder.emailCatchAllEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailCatchAllEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun emailCatchAllEnabled(emailCatchAllEnabled: JsonField<Boolean>) = apply {
                this.emailCatchAllEnabled = emailCatchAllEnabled
            }

            /**
             * ID of the verified email domain to attach. Optional — resolved from `emailAddress`'s
             * domain when omitted.
             */
            fun emailDomainId(emailDomainId: String) = emailDomainId(JsonField.of(emailDomainId))

            /**
             * Sets [Builder.emailDomainId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailDomainId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailDomainId(emailDomainId: JsonField<String>) = apply {
                this.emailDomainId = emailDomainId
            }

            /** Display name shown in the recipient's inbox for the email channel. */
            fun emailFromName(emailFromName: String) = emailFromName(JsonField.of(emailFromName))

            /**
             * Sets [Builder.emailFromName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailFromName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailFromName(emailFromName: JsonField<String>) = apply {
                this.emailFromName = emailFromName
            }

            /** Enable or disable inbound email receiving for this sender. */
            fun emailReceivingEnabled(emailReceivingEnabled: Boolean) =
                emailReceivingEnabled(JsonField.of(emailReceivingEnabled))

            /**
             * Sets [Builder.emailReceivingEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailReceivingEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun emailReceivingEnabled(emailReceivingEnabled: JsonField<Boolean>) = apply {
                this.emailReceivingEnabled = emailReceivingEnabled
            }

            /**
             * Turn the one-way SMS channel on or off. Enabling needs nothing else and takes effect
             * immediately; disabling removes the channel from the sender. Confirm with the
             * `channels` array on the response.
             */
            fun enableSmsOneway(enableSmsOneway: Boolean) =
                enableSmsOneway(JsonField.of(enableSmsOneway))

            /**
             * Sets [Builder.enableSmsOneway] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableSmsOneway] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableSmsOneway(enableSmsOneway: JsonField<Boolean>) = apply {
                this.enableSmsOneway = enableSmsOneway
            }

            /**
             * Turn the voice channel on or off. The sender must already have a phone number
             * provisioned for calls; enabling it otherwise returns 400 instead of storing a flag
             * that changes nothing. Confirm with the `channels` array on the response.
             */
            fun enableVoice(enableVoice: Boolean) = enableVoice(JsonField.of(enableVoice))

            /**
             * Sets [Builder.enableVoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableVoice] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableVoice(enableVoice: JsonField<Boolean>) = apply {
                this.enableVoice = enableVoice
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun setAsDefault(setAsDefault: Boolean) = setAsDefault(JsonField.of(setAsDefault))

            /**
             * Sets [Builder.setAsDefault] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setAsDefault] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun setAsDefault(setAsDefault: JsonField<Boolean>) = apply {
                this.setAsDefault = setAsDefault
            }

            /** Whether the webhook is active. */
            fun webhookActive(webhookActive: Boolean) = webhookActive(JsonField.of(webhookActive))

            /**
             * Sets [Builder.webhookActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookActive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookActive(webhookActive: JsonField<Boolean>) = apply {
                this.webhookActive = webhookActive
            }

            /** Events to subscribe to. */
            fun webhookEvents(webhookEvents: List<WebhookEvent>) =
                webhookEvents(JsonField.of(webhookEvents))

            /**
             * Sets [Builder.webhookEvents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookEvents] with a well-typed
             * `List<WebhookEvent>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun webhookEvents(webhookEvents: JsonField<List<WebhookEvent>>) = apply {
                this.webhookEvents = webhookEvents.map { it.toMutableList() }
            }

            /**
             * Adds a single [WebhookEvent] to [webhookEvents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWebhookEvent(webhookEvent: WebhookEvent) = apply {
                webhookEvents =
                    (webhookEvents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("webhookEvents", it).add(webhookEvent)
                    }
            }

            /**
             * Which `X-Zavu-Signature` scheme this receiver is sent.
             * - `v1`: `v1=HMAC_SHA256(secret, body)`. The scheme used before this was configurable.
             *   Existing webhooks stay on it until you move them.
             * - `v2`: `v2=HMAC_SHA256(secret, "{t}.{body}")`. The current scheme, and the default
             *   for new senders. It signs the timestamp together with the body.
             * - `v1+v2`: both signatures, sharing one `t`. The migration setting: a receiver
             *   reading either one works, so you can deploy and confirm your new verifier before
             *   switching over.
             *
             * Moving from `v1` straight to `v2` returns `400`. Set `v1+v2` first. See
             * https://docs.zavu.dev/guides/receiving-messages/signature-migration
             */
            fun webhookSignatureVersion(webhookSignatureVersion: WebhookSignatureVersion) =
                webhookSignatureVersion(JsonField.of(webhookSignatureVersion))

            /**
             * Sets [Builder.webhookSignatureVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookSignatureVersion] with a well-typed
             * [WebhookSignatureVersion] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun webhookSignatureVersion(
                webhookSignatureVersion: JsonField<WebhookSignatureVersion>
            ) = apply { this.webhookSignatureVersion = webhookSignatureVersion }

            /** HTTPS URL for webhook events. Set to null to remove webhook. */
            fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

            /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
            fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    emailAddress,
                    emailCatchAllEnabled,
                    emailDomainId,
                    emailFromName,
                    emailReceivingEnabled,
                    enableSmsOneway,
                    enableVoice,
                    name,
                    setAsDefault,
                    webhookActive,
                    (webhookEvents ?: JsonMissing.of()).map { it.toImmutable() },
                    webhookSignatureVersion,
                    webhookUrl,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            emailAddress()
            emailCatchAllEnabled()
            emailDomainId()
            emailFromName()
            emailReceivingEnabled()
            enableSmsOneway()
            enableVoice()
            name()
            setAsDefault()
            webhookActive()
            webhookEvents().ifPresent { it.forEach { it.validate() } }
            webhookSignatureVersion().ifPresent { it.validate() }
            webhookUrl()
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
            (if (emailAddress.asKnown().isPresent) 1 else 0) +
                (if (emailCatchAllEnabled.asKnown().isPresent) 1 else 0) +
                (if (emailDomainId.asKnown().isPresent) 1 else 0) +
                (if (emailFromName.asKnown().isPresent) 1 else 0) +
                (if (emailReceivingEnabled.asKnown().isPresent) 1 else 0) +
                (if (enableSmsOneway.asKnown().isPresent) 1 else 0) +
                (if (enableVoice.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (setAsDefault.asKnown().isPresent) 1 else 0) +
                (if (webhookActive.asKnown().isPresent) 1 else 0) +
                (webhookEvents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (webhookSignatureVersion.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                emailAddress == other.emailAddress &&
                emailCatchAllEnabled == other.emailCatchAllEnabled &&
                emailDomainId == other.emailDomainId &&
                emailFromName == other.emailFromName &&
                emailReceivingEnabled == other.emailReceivingEnabled &&
                enableSmsOneway == other.enableSmsOneway &&
                enableVoice == other.enableVoice &&
                name == other.name &&
                setAsDefault == other.setAsDefault &&
                webhookActive == other.webhookActive &&
                webhookEvents == other.webhookEvents &&
                webhookSignatureVersion == other.webhookSignatureVersion &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                emailAddress,
                emailCatchAllEnabled,
                emailDomainId,
                emailFromName,
                emailReceivingEnabled,
                enableSmsOneway,
                enableVoice,
                name,
                setAsDefault,
                webhookActive,
                webhookEvents,
                webhookSignatureVersion,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{emailAddress=$emailAddress, emailCatchAllEnabled=$emailCatchAllEnabled, emailDomainId=$emailDomainId, emailFromName=$emailFromName, emailReceivingEnabled=$emailReceivingEnabled, enableSmsOneway=$enableSmsOneway, enableVoice=$enableVoice, name=$name, setAsDefault=$setAsDefault, webhookActive=$webhookActive, webhookEvents=$webhookEvents, webhookSignatureVersion=$webhookSignatureVersion, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

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
    class WebhookSignatureVersion
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = WebhookSignatureVersion(JsonField.of(value))
        }

        /** An enum containing [WebhookSignatureVersion]'s known values. */
        enum class Known {
            V1,
            V1_V2,
            V2,
        }

        /**
         * An enum containing [WebhookSignatureVersion]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [WebhookSignatureVersion] can contain an unknown value in a couple of
         * cases:
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
             * An enum member indicating that [WebhookSignatureVersion] was instantiated with an
             * unknown value.
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
                else -> throw ZavudevInvalidDataException("Unknown WebhookSignatureVersion: $value")
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
        fun validate(): WebhookSignatureVersion = apply {
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

            return other is WebhookSignatureVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SenderUpdateParams &&
            senderId == other.senderId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(senderId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SenderUpdateParams{senderId=$senderId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
