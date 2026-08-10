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
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Message
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val channel: JsonField<Channel>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val messageType: JsonField<MessageType>,
    private val status: JsonField<MessageStatus>,
    private val to: JsonField<String>,
    private val content: JsonField<MessageContent>,
    private val conversationId: JsonField<String>,
    private val cost: JsonField<Double>,
    private val costProvider: JsonField<Double>,
    private val costTotal: JsonField<Double>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val from: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val providerMessageId: JsonField<String>,
    private val senderId: JsonField<String>,
    private val text: JsonField<String>,
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
        @JsonProperty("messageType")
        @ExcludeMissing
        messageType: JsonField<MessageType> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<MessageStatus> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<MessageContent> = JsonMissing.of(),
        @JsonProperty("conversationId")
        @ExcludeMissing
        conversationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("costProvider")
        @ExcludeMissing
        costProvider: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("costTotal") @ExcludeMissing costTotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("errorCode") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("errorMessage")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("providerMessageId")
        @ExcludeMissing
        providerMessageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senderId") @ExcludeMissing senderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        channel,
        createdAt,
        messageType,
        status,
        to,
        content,
        conversationId,
        cost,
        costProvider,
        costTotal,
        errorCode,
        errorMessage,
        from,
        metadata,
        providerMessageId,
        senderId,
        text,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Delivery channel. Use 'auto' for intelligent routing.
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
     * Type of message. Non-text types are supported by WhatsApp and Telegram (varies by type).
     *
     * `location_request` asks the recipient to share their location and is WhatsApp-only. It takes
     * no `content` object — the prompt goes in `text` (max 1024 characters) and the button label is
     * fixed by WhatsApp. The recipient's answer arrives as an inbound `location` message whose
     * `content.replyToMessageId` is the ID of the request.
     *
     * `request_contact_info` asks the recipient to share their phone number and is WhatsApp-only.
     * Like `location_request` it takes no `content` object — the prompt goes in `text` (max 1024
     * characters) and WhatsApp renders a fixed **Share Contact Info** button. The answer arrives as
     * an inbound `contact` message. Use it to recover the phone number of a contact who adopted a
     * WhatsApp username and is only known by their business-scoped user ID (BSUID); when they share
     * it, Zavu automatically links the phone number to that contact.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageType(): MessageType = messageType.getRequired("messageType")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): MessageStatus = status.getRequired("status")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = to.getRequired("to")

    /**
     * Content for non-text message types (WhatsApp and Telegram).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<MessageContent> = content.getOptional("content")

    /**
     * ID of the conversation (inbox thread) this message belongs to. Use it to build a direct
     * dashboard link: `https://dashboard.zavu.dev/{locale}/inbox?conv={conversationId}`. Omitted
     * only on legacy messages created before conversation threading.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationId(): Optional<String> = conversationId.getOptional("conversationId")

    /**
     * Zavu platform charge in USD for this message. Messaging is billed against your plan's monthly
     * limits plus usage-based overage.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cost(): Optional<Double> = cost.getOptional("cost")

    /**
     * Carrier and delivery cost in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun costProvider(): Optional<Double> = costProvider.getOptional("costProvider")

    /**
     * Total cost in USD (platform charge + delivery cost).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun costTotal(): Optional<Double> = costTotal.getOptional("costTotal")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorCode(): Optional<String> = errorCode.getOptional("errorCode")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = from.getOptional("from")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Message ID from the delivery provider.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerMessageId(): Optional<String> = providerMessageId.getOptional("providerMessageId")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderId(): Optional<String> = senderId.getOptional("senderId")

    /**
     * Text content or caption.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

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
     * Returns the raw JSON value of [messageType].
     *
     * Unlike [messageType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messageType")
    @ExcludeMissing
    fun _messageType(): JsonField<MessageType> = messageType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<MessageStatus> = status

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<MessageContent> = content

    /**
     * Returns the raw JSON value of [conversationId].
     *
     * Unlike [conversationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversationId")
    @ExcludeMissing
    fun _conversationId(): JsonField<String> = conversationId

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

    /**
     * Returns the raw JSON value of [costProvider].
     *
     * Unlike [costProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("costProvider")
    @ExcludeMissing
    fun _costProvider(): JsonField<Double> = costProvider

    /**
     * Returns the raw JSON value of [costTotal].
     *
     * Unlike [costTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("costTotal") @ExcludeMissing fun _costTotal(): JsonField<Double> = costTotal

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorCode") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorMessage")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [providerMessageId].
     *
     * Unlike [providerMessageId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("providerMessageId")
    @ExcludeMissing
    fun _providerMessageId(): JsonField<String> = providerMessageId

    /**
     * Returns the raw JSON value of [senderId].
     *
     * Unlike [senderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senderId") @ExcludeMissing fun _senderId(): JsonField<String> = senderId

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
         * Returns a mutable builder for constructing an instance of [Message].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .channel()
         * .createdAt()
         * .messageType()
         * .status()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Message]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var channel: JsonField<Channel>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var messageType: JsonField<MessageType>? = null
        private var status: JsonField<MessageStatus>? = null
        private var to: JsonField<String>? = null
        private var content: JsonField<MessageContent> = JsonMissing.of()
        private var conversationId: JsonField<String> = JsonMissing.of()
        private var cost: JsonField<Double> = JsonMissing.of()
        private var costProvider: JsonField<Double> = JsonMissing.of()
        private var costTotal: JsonField<Double> = JsonMissing.of()
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var from: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var providerMessageId: JsonField<String> = JsonMissing.of()
        private var senderId: JsonField<String> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(message: Message) = apply {
            id = message.id
            channel = message.channel
            createdAt = message.createdAt
            messageType = message.messageType
            status = message.status
            to = message.to
            content = message.content
            conversationId = message.conversationId
            cost = message.cost
            costProvider = message.costProvider
            costTotal = message.costTotal
            errorCode = message.errorCode
            errorMessage = message.errorMessage
            from = message.from
            metadata = message.metadata
            providerMessageId = message.providerMessageId
            senderId = message.senderId
            text = message.text
            updatedAt = message.updatedAt
            additionalProperties = message.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Delivery channel. Use 'auto' for intelligent routing. */
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

        /**
         * Type of message. Non-text types are supported by WhatsApp and Telegram (varies by type).
         *
         * `location_request` asks the recipient to share their location and is WhatsApp-only. It
         * takes no `content` object — the prompt goes in `text` (max 1024 characters) and the
         * button label is fixed by WhatsApp. The recipient's answer arrives as an inbound
         * `location` message whose `content.replyToMessageId` is the ID of the request.
         *
         * `request_contact_info` asks the recipient to share their phone number and is
         * WhatsApp-only. Like `location_request` it takes no `content` object — the prompt goes in
         * `text` (max 1024 characters) and WhatsApp renders a fixed **Share Contact Info** button.
         * The answer arrives as an inbound `contact` message. Use it to recover the phone number of
         * a contact who adopted a WhatsApp username and is only known by their business-scoped user
         * ID (BSUID); when they share it, Zavu automatically links the phone number to that
         * contact.
         */
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

        fun status(status: MessageStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [MessageStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<MessageStatus>) = apply { this.status = status }

        fun to(to: String) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** Content for non-text message types (WhatsApp and Telegram). */
        fun content(content: MessageContent) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [MessageContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<MessageContent>) = apply { this.content = content }

        /**
         * ID of the conversation (inbox thread) this message belongs to. Use it to build a direct
         * dashboard link: `https://dashboard.zavu.dev/{locale}/inbox?conv={conversationId}`.
         * Omitted only on legacy messages created before conversation threading.
         */
        fun conversationId(conversationId: String) = conversationId(JsonField.of(conversationId))

        /**
         * Sets [Builder.conversationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversationId(conversationId: JsonField<String>) = apply {
            this.conversationId = conversationId
        }

        /**
         * Zavu platform charge in USD for this message. Messaging is billed against your plan's
         * monthly limits plus usage-based overage.
         */
        fun cost(cost: Double?) = cost(JsonField.ofNullable(cost))

        /**
         * Alias for [Builder.cost].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cost(cost: Double) = cost(cost as Double?)

        /** Alias for calling [Builder.cost] with `cost.orElse(null)`. */
        fun cost(cost: Optional<Double>) = cost(cost.getOrNull())

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

        /** Carrier and delivery cost in USD. */
        fun costProvider(costProvider: Double?) = costProvider(JsonField.ofNullable(costProvider))

        /**
         * Alias for [Builder.costProvider].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun costProvider(costProvider: Double) = costProvider(costProvider as Double?)

        /** Alias for calling [Builder.costProvider] with `costProvider.orElse(null)`. */
        fun costProvider(costProvider: Optional<Double>) = costProvider(costProvider.getOrNull())

        /**
         * Sets [Builder.costProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costProvider] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun costProvider(costProvider: JsonField<Double>) = apply {
            this.costProvider = costProvider
        }

        /** Total cost in USD (platform charge + delivery cost). */
        fun costTotal(costTotal: Double?) = costTotal(JsonField.ofNullable(costTotal))

        /**
         * Alias for [Builder.costTotal].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun costTotal(costTotal: Double) = costTotal(costTotal as Double?)

        /** Alias for calling [Builder.costTotal] with `costTotal.orElse(null)`. */
        fun costTotal(costTotal: Optional<Double>) = costTotal(costTotal.getOrNull())

        /**
         * Sets [Builder.costTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costTotal] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun costTotal(costTotal: JsonField<Double>) = apply { this.costTotal = costTotal }

        fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

        /** Alias for calling [Builder.errorCode] with `errorCode.orElse(null)`. */
        fun errorCode(errorCode: Optional<String>) = errorCode(errorCode.getOrNull())

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
        fun errorMessage(errorMessage: Optional<String>) = errorMessage(errorMessage.getOrNull())

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Message ID from the delivery provider. */
        fun providerMessageId(providerMessageId: String) =
            providerMessageId(JsonField.of(providerMessageId))

        /**
         * Sets [Builder.providerMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerMessageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerMessageId(providerMessageId: JsonField<String>) = apply {
            this.providerMessageId = providerMessageId
        }

        fun senderId(senderId: String) = senderId(JsonField.of(senderId))

        /**
         * Sets [Builder.senderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senderId(senderId: JsonField<String>) = apply { this.senderId = senderId }

        /** Text content or caption. */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

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
         * Returns an immutable instance of [Message].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .channel()
         * .createdAt()
         * .messageType()
         * .status()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Message =
            Message(
                checkRequired("id", id),
                checkRequired("channel", channel),
                checkRequired("createdAt", createdAt),
                checkRequired("messageType", messageType),
                checkRequired("status", status),
                checkRequired("to", to),
                content,
                conversationId,
                cost,
                costProvider,
                costTotal,
                errorCode,
                errorMessage,
                from,
                metadata,
                providerMessageId,
                senderId,
                text,
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
    fun validate(): Message = apply {
        if (validated) {
            return@apply
        }

        id()
        channel().validate()
        createdAt()
        messageType().validate()
        status().validate()
        to()
        content().ifPresent { it.validate() }
        conversationId()
        cost()
        costProvider()
        costTotal()
        errorCode()
        errorMessage()
        from()
        metadata().ifPresent { it.validate() }
        providerMessageId()
        senderId()
        text()
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
            (messageType.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (to.asKnown().isPresent) 1 else 0) +
            (content.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conversationId.asKnown().isPresent) 1 else 0) +
            (if (cost.asKnown().isPresent) 1 else 0) +
            (if (costProvider.asKnown().isPresent) 1 else 0) +
            (if (costTotal.asKnown().isPresent) 1 else 0) +
            (if (errorCode.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (from.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (providerMessageId.asKnown().isPresent) 1 else 0) +
            (if (senderId.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

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

        return other is Message &&
            id == other.id &&
            channel == other.channel &&
            createdAt == other.createdAt &&
            messageType == other.messageType &&
            status == other.status &&
            to == other.to &&
            content == other.content &&
            conversationId == other.conversationId &&
            cost == other.cost &&
            costProvider == other.costProvider &&
            costTotal == other.costTotal &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            from == other.from &&
            metadata == other.metadata &&
            providerMessageId == other.providerMessageId &&
            senderId == other.senderId &&
            text == other.text &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            channel,
            createdAt,
            messageType,
            status,
            to,
            content,
            conversationId,
            cost,
            costProvider,
            costTotal,
            errorCode,
            errorMessage,
            from,
            metadata,
            providerMessageId,
            senderId,
            text,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Message{id=$id, channel=$channel, createdAt=$createdAt, messageType=$messageType, status=$status, to=$to, content=$content, conversationId=$conversationId, cost=$cost, costProvider=$costProvider, costTotal=$costTotal, errorCode=$errorCode, errorMessage=$errorMessage, from=$from, metadata=$metadata, providerMessageId=$providerMessageId, senderId=$senderId, text=$text, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
