// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.Params
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Send a message to a recipient via SMS or WhatsApp.
 *
 * **Channel selection:**
 * - If `channel` is omitted and `messageType` is `text`, defaults to SMS
 * - If `messageType` is anything other than `text`, WhatsApp is used automatically
 *
 * **WhatsApp 24-hour window:**
 * - Free-form messages (non-template) require an open 24h window
 * - Window opens when the user messages you first
 * - Use template messages to initiate conversations outside the window
 *
 * **Plan allowances and email billing:**
 * - WhatsApp, Telegram, Instagram and Messenger share an allowance of 2,000 messages per month on
 *   Free. Over it, sends return 429 with code `a2p_limit_exceeded` and upgrade details; the counter
 *   resets on the 1st of each month. Paid plans have no message caps
 * - Email is billed from your prepaid balance in 1,000-message blocks: $0.40 per 1,000
 *   transactional emails, $0.80 per 1,000 marketing (broadcast) emails. A block is charged when
 *   your monthly count crosses each 1,000 boundary, and at zero balance email sends return 402 with
 *   code `insufficient_balance`. Free teams start with $2 of credit and additionally cap at 3,000
 *   emails/month and 100/day. Teams on earlier plans keep their original email quotas instead
 * - SMS and voice are billed per message from your balance on every plan
 *
 * **Account verification and daily limits:**
 * - A brand-new account can send on every channel immediately, but `sms`, `sms_oneway` and `voice`
 *   reach only the phone numbers the project has verified. Sending elsewhere returns `403` with
 *   code `destination_not_verified`; `details.verifiedNumbers` lists the numbers that are
 *   reachable. A number is verified from the dashboard's Sandbox screen: generate a code and send
 *   the pre-filled WhatsApp message from that phone to Zavu's sandbox number. One verification
 *   covers WhatsApp, SMS and calls, up to 5 numbers per project. To send to any destination, do any
 *   one of these: verify your identity, add a payment method, settle a deposit, or subscribe to a
 *   paid plan. Business verification (KYB) is never required to send
 * - Daily ceilings apply per channel group and rise with verification. An account that has verified
 *   nothing: 25/day across `sms` + `sms_oneway`, 5/day for `voice`, 100/day across WhatsApp,
 *   Telegram, Instagram and Messenger combined. Past that floor: 200/day for SMS, or 10,000/day
 *   once identity or business verification is approved (or a higher limit agreed for your account);
 *   50/day voice and 250/day conversational on Free. **Paid plans have no voice or conversational
 *   daily ceiling.** Over a ceiling, sends return `429` with code `daily_limit_exceeded` and
 *   `details.limit`; the count resets at 00:00 UTC
 * - The daily ceiling never reduces the monthly allowance: 100/day on the conversational group
 *   still reaches the 2,000 monthly A2P messages Free includes
 * - Email needs no account verification here: a sender with a verified domain sends from day one,
 *   within the plan quota (100/day and 3,000/month on Free). Over the daily quota it returns `429`
 *   with code `daily_limit_exceeded`. Email broadcasts are the exception: they need the account
 *   past the sandbox level, see `POST /v1/broadcasts/{broadcastId}/send`
 * - Full reference: https://docs.zavu.dev/concepts/sending-limits
 *
 * **Email recipient pre-flight:** Email messages are validated automatically before dispatch. Sends
 * that would be a guaranteed hard bounce are failed instead of sent, protecting your bounce rate:
 * the message transitions to `failed` (visible via `GET /v1/messages/{messageId}` and the
 * `message.failed` webhook) with `errorCode` set to `EMAIL_INVALID_RECIPIENT` (malformed address),
 * `EMAIL_DOMAIN_NOT_FOUND` (recipient domain has no MX or A records), or
 * `EMAIL_RECIPIENT_SUPPRESSED` (address is on your suppression list after a previous bounce or
 * complaint). Advisory signals (role addresses, disposable domains) do not block sends — check them
 * beforehand with `POST /v1/introspect/email`.
 */
class MessageSendParams
private constructor(
    private val zavuSender: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun zavuSender(): Optional<String> = Optional.ofNullable(zavuSender)

    /**
     * Recipient phone number in E.164 format, email address, WhatsApp business-scoped user ID
     * (BSUID, e.g. `US.13491208655302741918`), or numeric chat ID (for
     * Telegram/Instagram/Messenger). A BSUID is routed to WhatsApp and sent via the `recipient`
     * field; use it to message a contact who adopted a username and whose phone number is hidden.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * Email attachments. Only supported when channel is 'email'. Maximum 40MB total size.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachments(): Optional<List<Attachment>> = body.attachments()

    /**
     * Delivery channel. Use 'auto' for intelligent routing. If omitted, channel is auto-selected
     * based on sender capabilities and recipient type. For email recipients, defaults to 'email'.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channel(): Optional<Channel> = body.channel()

    /**
     * Additional content for non-text message types.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<MessageContent> = body.content()

    /**
     * Whether to enable automatic fallback to SMS if WhatsApp fails. Defaults to true.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbackEnabled(): Optional<Boolean> = body.fallbackEnabled()

    /**
     * HTML body for email messages. If provided, email will be sent as multipart with both text and
     * HTML.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun htmlBody(): Optional<String> = body.htmlBody()

    /**
     * Optional idempotency key to avoid duplicate sends.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = body.idempotencyKey()

    /**
     * Type of message. Defaults to 'text'.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageType(): Optional<MessageType> = body.messageType()

    /**
     * Arbitrary metadata to associate with the message.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Reply-To email address for email messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyTo(): Optional<String> = body.replyTo()

    /**
     * Email subject line. Required when channel is 'email' or recipient is an email address.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = body.subject()

    /**
     * Text body for text messages or caption for media messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

    /**
     * Language code for voice text-to-speech (e.g., 'en-US', 'es-ES', 'pt-BR'). If omitted,
     * language is auto-detected from recipient's country code.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voiceLanguage(): Optional<String> = body.voiceLanguage()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attachments(): JsonField<List<Attachment>> = body._attachments()

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _channel(): JsonField<Channel> = body._channel()

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _content(): JsonField<MessageContent> = body._content()

    /**
     * Returns the raw JSON value of [fallbackEnabled].
     *
     * Unlike [fallbackEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fallbackEnabled(): JsonField<Boolean> = body._fallbackEnabled()

    /**
     * Returns the raw JSON value of [htmlBody].
     *
     * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _htmlBody(): JsonField<String> = body._htmlBody()

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idempotencyKey(): JsonField<String> = body._idempotencyKey()

    /**
     * Returns the raw JSON value of [messageType].
     *
     * Unlike [messageType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messageType(): JsonField<MessageType> = body._messageType()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _replyTo(): JsonField<String> = body._replyTo()

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subject(): JsonField<String> = body._subject()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [voiceLanguage].
     *
     * Unlike [voiceLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voiceLanguage(): JsonField<String> = body._voiceLanguage()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageSendParams].
         *
         * The following fields are required:
         * ```java
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageSendParams]. */
    class Builder internal constructor() {

        private var zavuSender: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageSendParams: MessageSendParams) = apply {
            zavuSender = messageSendParams.zavuSender
            body = messageSendParams.body.toBuilder()
            additionalHeaders = messageSendParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageSendParams.additionalQueryParams.toBuilder()
        }

        fun zavuSender(zavuSender: String?) = apply { this.zavuSender = zavuSender }

        /** Alias for calling [Builder.zavuSender] with `zavuSender.orElse(null)`. */
        fun zavuSender(zavuSender: Optional<String>) = zavuSender(zavuSender.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [to]
         * - [attachments]
         * - [channel]
         * - [content]
         * - [fallbackEnabled]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Recipient phone number in E.164 format, email address, WhatsApp business-scoped user ID
         * (BSUID, e.g. `US.13491208655302741918`), or numeric chat ID (for
         * Telegram/Instagram/Messenger). A BSUID is routed to WhatsApp and sent via the `recipient`
         * field; use it to message a contact who adopted a username and whose phone number is
         * hidden.
         */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        /** Email attachments. Only supported when channel is 'email'. Maximum 40MB total size. */
        fun attachments(attachments: List<Attachment>) = apply { body.attachments(attachments) }

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<Attachment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<List<Attachment>>) = apply {
            body.attachments(attachments)
        }

        /**
         * Adds a single [Attachment] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: Attachment) = apply { body.addAttachment(attachment) }

        /**
         * Delivery channel. Use 'auto' for intelligent routing. If omitted, channel is
         * auto-selected based on sender capabilities and recipient type. For email recipients,
         * defaults to 'email'.
         */
        fun channel(channel: Channel) = apply { body.channel(channel) }

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [Channel] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<Channel>) = apply { body.channel(channel) }

        /** Additional content for non-text message types. */
        fun content(content: MessageContent) = apply { body.content(content) }

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [MessageContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<MessageContent>) = apply { body.content(content) }

        /** Whether to enable automatic fallback to SMS if WhatsApp fails. Defaults to true. */
        fun fallbackEnabled(fallbackEnabled: Boolean) = apply {
            body.fallbackEnabled(fallbackEnabled)
        }

        /**
         * Sets [Builder.fallbackEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbackEnabled(fallbackEnabled: JsonField<Boolean>) = apply {
            body.fallbackEnabled(fallbackEnabled)
        }

        /**
         * HTML body for email messages. If provided, email will be sent as multipart with both text
         * and HTML.
         */
        fun htmlBody(htmlBody: String) = apply { body.htmlBody(htmlBody) }

        /**
         * Sets [Builder.htmlBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun htmlBody(htmlBody: JsonField<String>) = apply { body.htmlBody(htmlBody) }

        /** Optional idempotency key to avoid duplicate sends. */
        fun idempotencyKey(idempotencyKey: String) = apply { body.idempotencyKey(idempotencyKey) }

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            body.idempotencyKey(idempotencyKey)
        }

        /** Type of message. Defaults to 'text'. */
        fun messageType(messageType: MessageType) = apply { body.messageType(messageType) }

        /**
         * Sets [Builder.messageType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageType] with a well-typed [MessageType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageType(messageType: JsonField<MessageType>) = apply {
            body.messageType(messageType)
        }

        /** Arbitrary metadata to associate with the message. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Reply-To email address for email messages. */
        fun replyTo(replyTo: String) = apply { body.replyTo(replyTo) }

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun replyTo(replyTo: JsonField<String>) = apply { body.replyTo(replyTo) }

        /**
         * Email subject line. Required when channel is 'email' or recipient is an email address.
         */
        fun subject(subject: String) = apply { body.subject(subject) }

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { body.subject(subject) }

        /** Text body for text messages or caption for media messages. */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        /**
         * Language code for voice text-to-speech (e.g., 'en-US', 'es-ES', 'pt-BR'). If omitted,
         * language is auto-detected from recipient's country code.
         */
        fun voiceLanguage(voiceLanguage: String) = apply { body.voiceLanguage(voiceLanguage) }

        /**
         * Sets [Builder.voiceLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceLanguage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voiceLanguage(voiceLanguage: JsonField<String>) = apply {
            body.voiceLanguage(voiceLanguage)
        }

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
         * Returns an immutable instance of [MessageSendParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageSendParams =
            MessageSendParams(
                zavuSender,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                zavuSender?.let { put("Zavu-Sender", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body to send a message. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val to: JsonField<String>,
        private val attachments: JsonField<List<Attachment>>,
        private val channel: JsonField<Channel>,
        private val content: JsonField<MessageContent>,
        private val fallbackEnabled: JsonField<Boolean>,
        private val htmlBody: JsonField<String>,
        private val idempotencyKey: JsonField<String>,
        private val messageType: JsonField<MessageType>,
        private val metadata: JsonField<Metadata>,
        private val replyTo: JsonField<String>,
        private val subject: JsonField<String>,
        private val text: JsonField<String>,
        private val voiceLanguage: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attachments")
            @ExcludeMissing
            attachments: JsonField<List<Attachment>> = JsonMissing.of(),
            @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
            @JsonProperty("content")
            @ExcludeMissing
            content: JsonField<MessageContent> = JsonMissing.of(),
            @JsonProperty("fallbackEnabled")
            @ExcludeMissing
            fallbackEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("htmlBody")
            @ExcludeMissing
            htmlBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idempotencyKey")
            @ExcludeMissing
            idempotencyKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("messageType")
            @ExcludeMissing
            messageType: JsonField<MessageType> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("replyTo") @ExcludeMissing replyTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voiceLanguage")
            @ExcludeMissing
            voiceLanguage: JsonField<String> = JsonMissing.of(),
        ) : this(
            to,
            attachments,
            channel,
            content,
            fallbackEnabled,
            htmlBody,
            idempotencyKey,
            messageType,
            metadata,
            replyTo,
            subject,
            text,
            voiceLanguage,
            mutableMapOf(),
        )

        /**
         * Recipient phone number in E.164 format, email address, WhatsApp business-scoped user ID
         * (BSUID, e.g. `US.13491208655302741918`), or numeric chat ID (for
         * Telegram/Instagram/Messenger). A BSUID is routed to WhatsApp and sent via the `recipient`
         * field; use it to message a contact who adopted a username and whose phone number is
         * hidden.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("to")

        /**
         * Email attachments. Only supported when channel is 'email'. Maximum 40MB total size.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attachments(): Optional<List<Attachment>> = attachments.getOptional("attachments")

        /**
         * Delivery channel. Use 'auto' for intelligent routing. If omitted, channel is
         * auto-selected based on sender capabilities and recipient type. For email recipients,
         * defaults to 'email'.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channel(): Optional<Channel> = channel.getOptional("channel")

        /**
         * Additional content for non-text message types.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<MessageContent> = content.getOptional("content")

        /**
         * Whether to enable automatic fallback to SMS if WhatsApp fails. Defaults to true.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fallbackEnabled(): Optional<Boolean> = fallbackEnabled.getOptional("fallbackEnabled")

        /**
         * HTML body for email messages. If provided, email will be sent as multipart with both text
         * and HTML.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun htmlBody(): Optional<String> = htmlBody.getOptional("htmlBody")

        /**
         * Optional idempotency key to avoid duplicate sends.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotencyKey")

        /**
         * Type of message. Defaults to 'text'.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageType(): Optional<MessageType> = messageType.getOptional("messageType")

        /**
         * Arbitrary metadata to associate with the message.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Reply-To email address for email messages.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replyTo(): Optional<String> = replyTo.getOptional("replyTo")

        /**
         * Email subject line. Required when channel is 'email' or recipient is an email address.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subject(): Optional<String> = subject.getOptional("subject")

        /**
         * Text body for text messages or caption for media messages.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Language code for voice text-to-speech (e.g., 'en-US', 'es-ES', 'pt-BR'). If omitted,
         * language is auto-detected from recipient's country code.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceLanguage(): Optional<String> = voiceLanguage.getOptional("voiceLanguage")

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [attachments].
         *
         * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attachments")
        @ExcludeMissing
        fun _attachments(): JsonField<List<Attachment>> = attachments

        /**
         * Returns the raw JSON value of [channel].
         *
         * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<MessageContent> = content

        /**
         * Returns the raw JSON value of [fallbackEnabled].
         *
         * Unlike [fallbackEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fallbackEnabled")
        @ExcludeMissing
        fun _fallbackEnabled(): JsonField<Boolean> = fallbackEnabled

        /**
         * Returns the raw JSON value of [htmlBody].
         *
         * Unlike [htmlBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("htmlBody") @ExcludeMissing fun _htmlBody(): JsonField<String> = htmlBody

        /**
         * Returns the raw JSON value of [idempotencyKey].
         *
         * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idempotencyKey")
        @ExcludeMissing
        fun _idempotencyKey(): JsonField<String> = idempotencyKey

        /**
         * Returns the raw JSON value of [messageType].
         *
         * Unlike [messageType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messageType")
        @ExcludeMissing
        fun _messageType(): JsonField<MessageType> = messageType

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [replyTo].
         *
         * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("replyTo") @ExcludeMissing fun _replyTo(): JsonField<String> = replyTo

        /**
         * Returns the raw JSON value of [subject].
         *
         * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [voiceLanguage].
         *
         * Unlike [voiceLanguage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voiceLanguage")
        @ExcludeMissing
        fun _voiceLanguage(): JsonField<String> = voiceLanguage

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var to: JsonField<String>? = null
            private var attachments: JsonField<MutableList<Attachment>>? = null
            private var channel: JsonField<Channel> = JsonMissing.of()
            private var content: JsonField<MessageContent> = JsonMissing.of()
            private var fallbackEnabled: JsonField<Boolean> = JsonMissing.of()
            private var htmlBody: JsonField<String> = JsonMissing.of()
            private var idempotencyKey: JsonField<String> = JsonMissing.of()
            private var messageType: JsonField<MessageType> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var replyTo: JsonField<String> = JsonMissing.of()
            private var subject: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var voiceLanguage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                to = body.to
                attachments = body.attachments.map { it.toMutableList() }
                channel = body.channel
                content = body.content
                fallbackEnabled = body.fallbackEnabled
                htmlBody = body.htmlBody
                idempotencyKey = body.idempotencyKey
                messageType = body.messageType
                metadata = body.metadata
                replyTo = body.replyTo
                subject = body.subject
                text = body.text
                voiceLanguage = body.voiceLanguage
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Recipient phone number in E.164 format, email address, WhatsApp business-scoped user
             * ID (BSUID, e.g. `US.13491208655302741918`), or numeric chat ID (for
             * Telegram/Instagram/Messenger). A BSUID is routed to WhatsApp and sent via the
             * `recipient` field; use it to message a contact who adopted a username and whose phone
             * number is hidden.
             */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /**
             * Email attachments. Only supported when channel is 'email'. Maximum 40MB total size.
             */
            fun attachments(attachments: List<Attachment>) = attachments(JsonField.of(attachments))

            /**
             * Sets [Builder.attachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachments] with a well-typed `List<Attachment>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun attachments(attachments: JsonField<List<Attachment>>) = apply {
                this.attachments = attachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Attachment] to [attachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttachment(attachment: Attachment) = apply {
                attachments =
                    (attachments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attachments", it).add(attachment)
                    }
            }

            /**
             * Delivery channel. Use 'auto' for intelligent routing. If omitted, channel is
             * auto-selected based on sender capabilities and recipient type. For email recipients,
             * defaults to 'email'.
             */
            fun channel(channel: Channel) = channel(JsonField.of(channel))

            /**
             * Sets [Builder.channel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channel] with a well-typed [Channel] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

            /** Additional content for non-text message types. */
            fun content(content: MessageContent) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [MessageContent] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<MessageContent>) = apply { this.content = content }

            /** Whether to enable automatic fallback to SMS if WhatsApp fails. Defaults to true. */
            fun fallbackEnabled(fallbackEnabled: Boolean) =
                fallbackEnabled(JsonField.of(fallbackEnabled))

            /**
             * Sets [Builder.fallbackEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbackEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbackEnabled(fallbackEnabled: JsonField<Boolean>) = apply {
                this.fallbackEnabled = fallbackEnabled
            }

            /**
             * HTML body for email messages. If provided, email will be sent as multipart with both
             * text and HTML.
             */
            fun htmlBody(htmlBody: String) = htmlBody(JsonField.of(htmlBody))

            /**
             * Sets [Builder.htmlBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.htmlBody] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun htmlBody(htmlBody: JsonField<String>) = apply { this.htmlBody = htmlBody }

            /** Optional idempotency key to avoid duplicate sends. */
            fun idempotencyKey(idempotencyKey: String) =
                idempotencyKey(JsonField.of(idempotencyKey))

            /**
             * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
                this.idempotencyKey = idempotencyKey
            }

            /** Type of message. Defaults to 'text'. */
            fun messageType(messageType: MessageType) = messageType(JsonField.of(messageType))

            /**
             * Sets [Builder.messageType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageType] with a well-typed [MessageType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageType(messageType: JsonField<MessageType>) = apply {
                this.messageType = messageType
            }

            /** Arbitrary metadata to associate with the message. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Reply-To email address for email messages. */
            fun replyTo(replyTo: String) = replyTo(JsonField.of(replyTo))

            /**
             * Sets [Builder.replyTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replyTo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replyTo(replyTo: JsonField<String>) = apply { this.replyTo = replyTo }

            /**
             * Email subject line. Required when channel is 'email' or recipient is an email
             * address.
             */
            fun subject(subject: String) = subject(JsonField.of(subject))

            /**
             * Sets [Builder.subject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subject] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subject(subject: JsonField<String>) = apply { this.subject = subject }

            /** Text body for text messages or caption for media messages. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * Language code for voice text-to-speech (e.g., 'en-US', 'es-ES', 'pt-BR'). If omitted,
             * language is auto-detected from recipient's country code.
             */
            fun voiceLanguage(voiceLanguage: String) = voiceLanguage(JsonField.of(voiceLanguage))

            /**
             * Sets [Builder.voiceLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceLanguage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceLanguage(voiceLanguage: JsonField<String>) = apply {
                this.voiceLanguage = voiceLanguage
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("to", to),
                    (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                    channel,
                    content,
                    fallbackEnabled,
                    htmlBody,
                    idempotencyKey,
                    messageType,
                    metadata,
                    replyTo,
                    subject,
                    text,
                    voiceLanguage,
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

            to()
            attachments().ifPresent { it.forEach { it.validate() } }
            channel().ifPresent { it.validate() }
            content().ifPresent { it.validate() }
            fallbackEnabled()
            htmlBody()
            idempotencyKey()
            messageType().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            replyTo()
            subject()
            text()
            voiceLanguage()
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
            (if (to.asKnown().isPresent) 1 else 0) +
                (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (channel.asKnown().getOrNull()?.validity() ?: 0) +
                (content.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fallbackEnabled.asKnown().isPresent) 1 else 0) +
                (if (htmlBody.asKnown().isPresent) 1 else 0) +
                (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
                (messageType.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (replyTo.asKnown().isPresent) 1 else 0) +
                (if (subject.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (voiceLanguage.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                to == other.to &&
                attachments == other.attachments &&
                channel == other.channel &&
                content == other.content &&
                fallbackEnabled == other.fallbackEnabled &&
                htmlBody == other.htmlBody &&
                idempotencyKey == other.idempotencyKey &&
                messageType == other.messageType &&
                metadata == other.metadata &&
                replyTo == other.replyTo &&
                subject == other.subject &&
                text == other.text &&
                voiceLanguage == other.voiceLanguage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                to,
                attachments,
                channel,
                content,
                fallbackEnabled,
                htmlBody,
                idempotencyKey,
                messageType,
                metadata,
                replyTo,
                subject,
                text,
                voiceLanguage,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{to=$to, attachments=$attachments, channel=$channel, content=$content, fallbackEnabled=$fallbackEnabled, htmlBody=$htmlBody, idempotencyKey=$idempotencyKey, messageType=$messageType, metadata=$metadata, replyTo=$replyTo, subject=$subject, text=$text, voiceLanguage=$voiceLanguage, additionalProperties=$additionalProperties}"
    }

    /** Email attachment. Provide either `content` (base64) or `path` (URL), not both. */
    class Attachment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val filename: JsonField<String>,
        private val content: JsonField<String>,
        private val contentId: JsonField<String>,
        private val contentType: JsonField<String>,
        private val path: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content_id")
            @ExcludeMissing
            contentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        ) : this(filename, content, contentId, contentType, path, mutableMapOf())

        /**
         * Name of the attached file.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * Content of the attached file as a Base64-encoded string.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * Content ID for inline images. Reference in HTML as `<img src="cid:your_content_id">`.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentId(): Optional<String> = contentId.getOptional("content_id")

        /**
         * MIME type of the attachment. If not set, will be derived from the filename.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("content_type")

        /**
         * URL where the attachment file is hosted. The server will fetch the file.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun path(): Optional<String> = path.getOptional("path")

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [contentId].
         *
         * Unlike [contentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_id") @ExcludeMissing fun _contentId(): JsonField<String> = contentId

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

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
             * Returns a mutable builder for constructing an instance of [Attachment].
             *
             * The following fields are required:
             * ```java
             * .filename()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attachment]. */
        class Builder internal constructor() {

            private var filename: JsonField<String>? = null
            private var content: JsonField<String> = JsonMissing.of()
            private var contentId: JsonField<String> = JsonMissing.of()
            private var contentType: JsonField<String> = JsonMissing.of()
            private var path: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attachment: Attachment) = apply {
                filename = attachment.filename
                content = attachment.content
                contentId = attachment.contentId
                contentType = attachment.contentType
                path = attachment.path
                additionalProperties = attachment.additionalProperties.toMutableMap()
            }

            /** Name of the attached file. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** Content of the attached file as a Base64-encoded string. */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /**
             * Content ID for inline images. Reference in HTML as `<img src="cid:your_content_id">`.
             */
            fun contentId(contentId: String) = contentId(JsonField.of(contentId))

            /**
             * Sets [Builder.contentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentId(contentId: JsonField<String>) = apply { this.contentId = contentId }

            /** MIME type of the attachment. If not set, will be derived from the filename. */
            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

            /** URL where the attachment file is hosted. The server will fetch the file. */
            fun path(path: String) = path(JsonField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

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
             * Returns an immutable instance of [Attachment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .filename()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attachment =
                Attachment(
                    checkRequired("filename", filename),
                    content,
                    contentId,
                    contentType,
                    path,
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
        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            filename()
            content()
            contentId()
            contentType()
            path()
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
            (if (filename.asKnown().isPresent) 1 else 0) +
                (if (content.asKnown().isPresent) 1 else 0) +
                (if (contentId.asKnown().isPresent) 1 else 0) +
                (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (path.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                filename == other.filename &&
                content == other.content &&
                contentId == other.contentId &&
                contentType == other.contentType &&
                path == other.path &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(filename, content, contentId, contentType, path, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attachment{filename=$filename, content=$content, contentId=$contentId, contentType=$contentType, path=$path, additionalProperties=$additionalProperties}"
    }

    /** Arbitrary metadata to associate with the message. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageSendParams &&
            zavuSender == other.zavuSender &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(zavuSender, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageSendParams{zavuSender=$zavuSender, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
