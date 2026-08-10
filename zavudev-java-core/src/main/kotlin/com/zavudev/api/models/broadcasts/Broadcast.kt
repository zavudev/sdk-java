// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Broadcast
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val channel: JsonField<BroadcastChannel>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val messageType: JsonField<BroadcastMessageType>,
    private val name: JsonField<String>,
    private val status: JsonField<BroadcastStatus>,
    private val totalContacts: JsonField<Long>,
    private val actualCost: JsonField<Double>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val content: JsonField<BroadcastContent>,
    private val deliveredCount: JsonField<Long>,
    private val emailSubject: JsonField<String>,
    private val estimatedCost: JsonField<Double>,
    private val failedCount: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
    private val pendingCount: JsonField<Long>,
    private val reservedAmount: JsonField<Double>,
    private val reviewAttempts: JsonField<Long>,
    private val reviewResult: JsonField<ReviewResult>,
    private val scheduledAt: JsonField<OffsetDateTime>,
    private val senderId: JsonField<String>,
    private val sendingCount: JsonField<Long>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val text: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel")
        @ExcludeMissing
        channel: JsonField<BroadcastChannel> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("messageType")
        @ExcludeMissing
        messageType: JsonField<BroadcastMessageType> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<BroadcastStatus> = JsonMissing.of(),
        @JsonProperty("totalContacts")
        @ExcludeMissing
        totalContacts: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("actualCost")
        @ExcludeMissing
        actualCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("completedAt")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<BroadcastContent> = JsonMissing.of(),
        @JsonProperty("deliveredCount")
        @ExcludeMissing
        deliveredCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("emailSubject")
        @ExcludeMissing
        emailSubject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("estimatedCost")
        @ExcludeMissing
        estimatedCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("failedCount")
        @ExcludeMissing
        failedCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("pendingCount")
        @ExcludeMissing
        pendingCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reservedAmount")
        @ExcludeMissing
        reservedAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reviewAttempts")
        @ExcludeMissing
        reviewAttempts: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reviewResult")
        @ExcludeMissing
        reviewResult: JsonField<ReviewResult> = JsonMissing.of(),
        @JsonProperty("scheduledAt")
        @ExcludeMissing
        scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("senderId") @ExcludeMissing senderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sendingCount")
        @ExcludeMissing
        sendingCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("startedAt")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        channel,
        createdAt,
        messageType,
        name,
        status,
        totalContacts,
        actualCost,
        completedAt,
        content,
        deliveredCount,
        emailSubject,
        estimatedCost,
        failedCount,
        metadata,
        pendingCount,
        reservedAmount,
        reviewAttempts,
        reviewResult,
        scheduledAt,
        senderId,
        sendingCount,
        startedAt,
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
     * Broadcast delivery channel. Use 'smart' for per-contact intelligent routing.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): BroadcastChannel = channel.getRequired("channel")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Type of message for broadcast.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageType(): BroadcastMessageType = messageType.getRequired("messageType")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Current status of the broadcast.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): BroadcastStatus = status.getRequired("status")

    /**
     * Total number of contacts in the broadcast.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalContacts(): Long = totalContacts.getRequired("totalContacts")

    /**
     * Actual cost so far in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actualCost(): Optional<Double> = actualCost.getOptional("actualCost")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completedAt")

    /**
     * Content for non-text broadcast message types.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<BroadcastContent> = content.getOptional("content")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveredCount(): Optional<Long> = deliveredCount.getOptional("deliveredCount")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailSubject(): Optional<String> = emailSubject.getOptional("emailSubject")

    /**
     * Estimated total cost in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun estimatedCost(): Optional<Double> = estimatedCost.getOptional("estimatedCost")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedCount(): Optional<Long> = failedCount.getOptional("failedCount")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingCount(): Optional<Long> = pendingCount.getOptional("pendingCount")

    /**
     * Amount reserved from balance in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reservedAmount(): Optional<Double> = reservedAmount.getOptional("reservedAmount")

    /**
     * Number of review attempts (max 3).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewAttempts(): Optional<Long> = reviewAttempts.getOptional("reviewAttempts")

    /**
     * AI content review result.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewResult(): Optional<ReviewResult> = reviewResult.getOptional("reviewResult")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledAt(): Optional<OffsetDateTime> = scheduledAt.getOptional("scheduledAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderId(): Optional<String> = senderId.getOptional("senderId")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendingCount(): Optional<Long> = sendingCount.getOptional("sendingCount")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("startedAt")

    /**
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
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<BroadcastChannel> = channel

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
    fun _messageType(): JsonField<BroadcastMessageType> = messageType

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<BroadcastStatus> = status

    /**
     * Returns the raw JSON value of [totalContacts].
     *
     * Unlike [totalContacts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalContacts")
    @ExcludeMissing
    fun _totalContacts(): JsonField<Long> = totalContacts

    /**
     * Returns the raw JSON value of [actualCost].
     *
     * Unlike [actualCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actualCost") @ExcludeMissing fun _actualCost(): JsonField<Double> = actualCost

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completedAt")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<BroadcastContent> = content

    /**
     * Returns the raw JSON value of [deliveredCount].
     *
     * Unlike [deliveredCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deliveredCount")
    @ExcludeMissing
    fun _deliveredCount(): JsonField<Long> = deliveredCount

    /**
     * Returns the raw JSON value of [emailSubject].
     *
     * Unlike [emailSubject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailSubject")
    @ExcludeMissing
    fun _emailSubject(): JsonField<String> = emailSubject

    /**
     * Returns the raw JSON value of [estimatedCost].
     *
     * Unlike [estimatedCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("estimatedCost")
    @ExcludeMissing
    fun _estimatedCost(): JsonField<Double> = estimatedCost

    /**
     * Returns the raw JSON value of [failedCount].
     *
     * Unlike [failedCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failedCount") @ExcludeMissing fun _failedCount(): JsonField<Long> = failedCount

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [pendingCount].
     *
     * Unlike [pendingCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pendingCount")
    @ExcludeMissing
    fun _pendingCount(): JsonField<Long> = pendingCount

    /**
     * Returns the raw JSON value of [reservedAmount].
     *
     * Unlike [reservedAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reservedAmount")
    @ExcludeMissing
    fun _reservedAmount(): JsonField<Double> = reservedAmount

    /**
     * Returns the raw JSON value of [reviewAttempts].
     *
     * Unlike [reviewAttempts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewAttempts")
    @ExcludeMissing
    fun _reviewAttempts(): JsonField<Long> = reviewAttempts

    /**
     * Returns the raw JSON value of [reviewResult].
     *
     * Unlike [reviewResult], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewResult")
    @ExcludeMissing
    fun _reviewResult(): JsonField<ReviewResult> = reviewResult

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduledAt")
    @ExcludeMissing
    fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

    /**
     * Returns the raw JSON value of [senderId].
     *
     * Unlike [senderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senderId") @ExcludeMissing fun _senderId(): JsonField<String> = senderId

    /**
     * Returns the raw JSON value of [sendingCount].
     *
     * Unlike [sendingCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sendingCount")
    @ExcludeMissing
    fun _sendingCount(): JsonField<Long> = sendingCount

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startedAt")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

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
         * Returns a mutable builder for constructing an instance of [Broadcast].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .channel()
         * .createdAt()
         * .messageType()
         * .name()
         * .status()
         * .totalContacts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Broadcast]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var channel: JsonField<BroadcastChannel>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var messageType: JsonField<BroadcastMessageType>? = null
        private var name: JsonField<String>? = null
        private var status: JsonField<BroadcastStatus>? = null
        private var totalContacts: JsonField<Long>? = null
        private var actualCost: JsonField<Double> = JsonMissing.of()
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var content: JsonField<BroadcastContent> = JsonMissing.of()
        private var deliveredCount: JsonField<Long> = JsonMissing.of()
        private var emailSubject: JsonField<String> = JsonMissing.of()
        private var estimatedCost: JsonField<Double> = JsonMissing.of()
        private var failedCount: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var pendingCount: JsonField<Long> = JsonMissing.of()
        private var reservedAmount: JsonField<Double> = JsonMissing.of()
        private var reviewAttempts: JsonField<Long> = JsonMissing.of()
        private var reviewResult: JsonField<ReviewResult> = JsonMissing.of()
        private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var senderId: JsonField<String> = JsonMissing.of()
        private var sendingCount: JsonField<Long> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(broadcast: Broadcast) = apply {
            id = broadcast.id
            channel = broadcast.channel
            createdAt = broadcast.createdAt
            messageType = broadcast.messageType
            name = broadcast.name
            status = broadcast.status
            totalContacts = broadcast.totalContacts
            actualCost = broadcast.actualCost
            completedAt = broadcast.completedAt
            content = broadcast.content
            deliveredCount = broadcast.deliveredCount
            emailSubject = broadcast.emailSubject
            estimatedCost = broadcast.estimatedCost
            failedCount = broadcast.failedCount
            metadata = broadcast.metadata
            pendingCount = broadcast.pendingCount
            reservedAmount = broadcast.reservedAmount
            reviewAttempts = broadcast.reviewAttempts
            reviewResult = broadcast.reviewResult
            scheduledAt = broadcast.scheduledAt
            senderId = broadcast.senderId
            sendingCount = broadcast.sendingCount
            startedAt = broadcast.startedAt
            text = broadcast.text
            updatedAt = broadcast.updatedAt
            additionalProperties = broadcast.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Broadcast delivery channel. Use 'smart' for per-contact intelligent routing. */
        fun channel(channel: BroadcastChannel) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [BroadcastChannel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channel(channel: JsonField<BroadcastChannel>) = apply { this.channel = channel }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Type of message for broadcast. */
        fun messageType(messageType: BroadcastMessageType) = messageType(JsonField.of(messageType))

        /**
         * Sets [Builder.messageType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageType] with a well-typed [BroadcastMessageType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messageType(messageType: JsonField<BroadcastMessageType>) = apply {
            this.messageType = messageType
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Current status of the broadcast. */
        fun status(status: BroadcastStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [BroadcastStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<BroadcastStatus>) = apply { this.status = status }

        /** Total number of contacts in the broadcast. */
        fun totalContacts(totalContacts: Long) = totalContacts(JsonField.of(totalContacts))

        /**
         * Sets [Builder.totalContacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalContacts] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalContacts(totalContacts: JsonField<Long>) = apply {
            this.totalContacts = totalContacts
        }

        /** Actual cost so far in USD. */
        fun actualCost(actualCost: Double?) = actualCost(JsonField.ofNullable(actualCost))

        /**
         * Alias for [Builder.actualCost].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun actualCost(actualCost: Double) = actualCost(actualCost as Double?)

        /** Alias for calling [Builder.actualCost] with `actualCost.orElse(null)`. */
        fun actualCost(actualCost: Optional<Double>) = actualCost(actualCost.getOrNull())

        /**
         * Sets [Builder.actualCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actualCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actualCost(actualCost: JsonField<Double>) = apply { this.actualCost = actualCost }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /** Content for non-text broadcast message types. */
        fun content(content: BroadcastContent) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [BroadcastContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<BroadcastContent>) = apply { this.content = content }

        fun deliveredCount(deliveredCount: Long) = deliveredCount(JsonField.of(deliveredCount))

        /**
         * Sets [Builder.deliveredCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveredCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deliveredCount(deliveredCount: JsonField<Long>) = apply {
            this.deliveredCount = deliveredCount
        }

        fun emailSubject(emailSubject: String) = emailSubject(JsonField.of(emailSubject))

        /**
         * Sets [Builder.emailSubject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailSubject] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailSubject(emailSubject: JsonField<String>) = apply {
            this.emailSubject = emailSubject
        }

        /** Estimated total cost in USD. */
        fun estimatedCost(estimatedCost: Double?) =
            estimatedCost(JsonField.ofNullable(estimatedCost))

        /**
         * Alias for [Builder.estimatedCost].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun estimatedCost(estimatedCost: Double) = estimatedCost(estimatedCost as Double?)

        /** Alias for calling [Builder.estimatedCost] with `estimatedCost.orElse(null)`. */
        fun estimatedCost(estimatedCost: Optional<Double>) =
            estimatedCost(estimatedCost.getOrNull())

        /**
         * Sets [Builder.estimatedCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estimatedCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun estimatedCost(estimatedCost: JsonField<Double>) = apply {
            this.estimatedCost = estimatedCost
        }

        fun failedCount(failedCount: Long) = failedCount(JsonField.of(failedCount))

        /**
         * Sets [Builder.failedCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failedCount(failedCount: JsonField<Long>) = apply { this.failedCount = failedCount }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun pendingCount(pendingCount: Long) = pendingCount(JsonField.of(pendingCount))

        /**
         * Sets [Builder.pendingCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pendingCount(pendingCount: JsonField<Long>) = apply { this.pendingCount = pendingCount }

        /** Amount reserved from balance in USD. */
        fun reservedAmount(reservedAmount: Double?) =
            reservedAmount(JsonField.ofNullable(reservedAmount))

        /**
         * Alias for [Builder.reservedAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reservedAmount(reservedAmount: Double) = reservedAmount(reservedAmount as Double?)

        /** Alias for calling [Builder.reservedAmount] with `reservedAmount.orElse(null)`. */
        fun reservedAmount(reservedAmount: Optional<Double>) =
            reservedAmount(reservedAmount.getOrNull())

        /**
         * Sets [Builder.reservedAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reservedAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reservedAmount(reservedAmount: JsonField<Double>) = apply {
            this.reservedAmount = reservedAmount
        }

        /** Number of review attempts (max 3). */
        fun reviewAttempts(reviewAttempts: Long?) =
            reviewAttempts(JsonField.ofNullable(reviewAttempts))

        /**
         * Alias for [Builder.reviewAttempts].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reviewAttempts(reviewAttempts: Long) = reviewAttempts(reviewAttempts as Long?)

        /** Alias for calling [Builder.reviewAttempts] with `reviewAttempts.orElse(null)`. */
        fun reviewAttempts(reviewAttempts: Optional<Long>) =
            reviewAttempts(reviewAttempts.getOrNull())

        /**
         * Sets [Builder.reviewAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewAttempts] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reviewAttempts(reviewAttempts: JsonField<Long>) = apply {
            this.reviewAttempts = reviewAttempts
        }

        /** AI content review result. */
        fun reviewResult(reviewResult: ReviewResult?) =
            reviewResult(JsonField.ofNullable(reviewResult))

        /** Alias for calling [Builder.reviewResult] with `reviewResult.orElse(null)`. */
        fun reviewResult(reviewResult: Optional<ReviewResult>) =
            reviewResult(reviewResult.getOrNull())

        /**
         * Sets [Builder.reviewResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewResult] with a well-typed [ReviewResult] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewResult(reviewResult: JsonField<ReviewResult>) = apply {
            this.reviewResult = reviewResult
        }

        fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

        /**
         * Sets [Builder.scheduledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
        }

        fun senderId(senderId: String) = senderId(JsonField.of(senderId))

        /**
         * Sets [Builder.senderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senderId(senderId: JsonField<String>) = apply { this.senderId = senderId }

        fun sendingCount(sendingCount: Long) = sendingCount(JsonField.of(sendingCount))

        /**
         * Sets [Builder.sendingCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendingCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sendingCount(sendingCount: JsonField<Long>) = apply { this.sendingCount = sendingCount }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

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
         * Returns an immutable instance of [Broadcast].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .channel()
         * .createdAt()
         * .messageType()
         * .name()
         * .status()
         * .totalContacts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Broadcast =
            Broadcast(
                checkRequired("id", id),
                checkRequired("channel", channel),
                checkRequired("createdAt", createdAt),
                checkRequired("messageType", messageType),
                checkRequired("name", name),
                checkRequired("status", status),
                checkRequired("totalContacts", totalContacts),
                actualCost,
                completedAt,
                content,
                deliveredCount,
                emailSubject,
                estimatedCost,
                failedCount,
                metadata,
                pendingCount,
                reservedAmount,
                reviewAttempts,
                reviewResult,
                scheduledAt,
                senderId,
                sendingCount,
                startedAt,
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
    fun validate(): Broadcast = apply {
        if (validated) {
            return@apply
        }

        id()
        channel().validate()
        createdAt()
        messageType().validate()
        name()
        status().validate()
        totalContacts()
        actualCost()
        completedAt()
        content().ifPresent { it.validate() }
        deliveredCount()
        emailSubject()
        estimatedCost()
        failedCount()
        metadata().ifPresent { it.validate() }
        pendingCount()
        reservedAmount()
        reviewAttempts()
        reviewResult().ifPresent { it.validate() }
        scheduledAt()
        senderId()
        sendingCount()
        startedAt()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalContacts.asKnown().isPresent) 1 else 0) +
            (if (actualCost.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (content.asKnown().getOrNull()?.validity() ?: 0) +
            (if (deliveredCount.asKnown().isPresent) 1 else 0) +
            (if (emailSubject.asKnown().isPresent) 1 else 0) +
            (if (estimatedCost.asKnown().isPresent) 1 else 0) +
            (if (failedCount.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (pendingCount.asKnown().isPresent) 1 else 0) +
            (if (reservedAmount.asKnown().isPresent) 1 else 0) +
            (if (reviewAttempts.asKnown().isPresent) 1 else 0) +
            (reviewResult.asKnown().getOrNull()?.validity() ?: 0) +
            (if (scheduledAt.asKnown().isPresent) 1 else 0) +
            (if (senderId.asKnown().isPresent) 1 else 0) +
            (if (sendingCount.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
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

    /** AI content review result. */
    class ReviewResult
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val categories: JsonField<List<String>>,
        private val flaggedContent: JsonField<List<String>>,
        private val reasoning: JsonField<String>,
        private val reviewedAt: JsonField<OffsetDateTime>,
        private val score: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("flaggedContent")
            @ExcludeMissing
            flaggedContent: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("reasoning")
            @ExcludeMissing
            reasoning: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reviewedAt")
            @ExcludeMissing
            reviewedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
        ) : this(categories, flaggedContent, reasoning, reviewedAt, score, mutableMapOf())

        /**
         * Policy categories violated, if any.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun categories(): Optional<List<String>> = categories.getOptional("categories")

        /**
         * Problematic text fragments, if any.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun flaggedContent(): Optional<List<String>> = flaggedContent.getOptional("flaggedContent")

        /**
         * Explanation of the review decision.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reasoning(): Optional<String> = reasoning.getOptional("reasoning")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reviewedAt(): Optional<OffsetDateTime> = reviewedAt.getOptional("reviewedAt")

        /**
         * Content safety score from 0.0 to 1.0, where 1.0 is completely safe.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<List<String>> = categories

        /**
         * Returns the raw JSON value of [flaggedContent].
         *
         * Unlike [flaggedContent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("flaggedContent")
        @ExcludeMissing
        fun _flaggedContent(): JsonField<List<String>> = flaggedContent

        /**
         * Returns the raw JSON value of [reasoning].
         *
         * Unlike [reasoning], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reasoning") @ExcludeMissing fun _reasoning(): JsonField<String> = reasoning

        /**
         * Returns the raw JSON value of [reviewedAt].
         *
         * Unlike [reviewedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reviewedAt")
        @ExcludeMissing
        fun _reviewedAt(): JsonField<OffsetDateTime> = reviewedAt

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

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

            /** Returns a mutable builder for constructing an instance of [ReviewResult]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReviewResult]. */
        class Builder internal constructor() {

            private var categories: JsonField<MutableList<String>>? = null
            private var flaggedContent: JsonField<MutableList<String>>? = null
            private var reasoning: JsonField<String> = JsonMissing.of()
            private var reviewedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reviewResult: ReviewResult) = apply {
                categories = reviewResult.categories.map { it.toMutableList() }
                flaggedContent = reviewResult.flaggedContent.map { it.toMutableList() }
                reasoning = reviewResult.reasoning
                reviewedAt = reviewResult.reviewedAt
                score = reviewResult.score
                additionalProperties = reviewResult.additionalProperties.toMutableMap()
            }

            /** Policy categories violated, if any. */
            fun categories(categories: List<String>) = categories(JsonField.of(categories))

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categories(categories: JsonField<List<String>>) = apply {
                this.categories = categories.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [categories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCategory(category: String) = apply {
                categories =
                    (categories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("categories", it).add(category)
                    }
            }

            /** Problematic text fragments, if any. */
            fun flaggedContent(flaggedContent: List<String>?) =
                flaggedContent(JsonField.ofNullable(flaggedContent))

            /** Alias for calling [Builder.flaggedContent] with `flaggedContent.orElse(null)`. */
            fun flaggedContent(flaggedContent: Optional<List<String>>) =
                flaggedContent(flaggedContent.getOrNull())

            /**
             * Sets [Builder.flaggedContent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flaggedContent] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun flaggedContent(flaggedContent: JsonField<List<String>>) = apply {
                this.flaggedContent = flaggedContent.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.flaggedContent].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFlaggedContent(flaggedContent: String) = apply {
                this.flaggedContent =
                    (this.flaggedContent ?: JsonField.of(mutableListOf())).also {
                        checkKnown("flaggedContent", it).add(flaggedContent)
                    }
            }

            /** Explanation of the review decision. */
            fun reasoning(reasoning: String) = reasoning(JsonField.of(reasoning))

            /**
             * Sets [Builder.reasoning] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasoning] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasoning(reasoning: JsonField<String>) = apply { this.reasoning = reasoning }

            fun reviewedAt(reviewedAt: OffsetDateTime) = reviewedAt(JsonField.of(reviewedAt))

            /**
             * Sets [Builder.reviewedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reviewedAt(reviewedAt: JsonField<OffsetDateTime>) = apply {
                this.reviewedAt = reviewedAt
            }

            /** Content safety score from 0.0 to 1.0, where 1.0 is completely safe. */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

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
             * Returns an immutable instance of [ReviewResult].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ReviewResult =
                ReviewResult(
                    (categories ?: JsonMissing.of()).map { it.toImmutable() },
                    (flaggedContent ?: JsonMissing.of()).map { it.toImmutable() },
                    reasoning,
                    reviewedAt,
                    score,
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
        fun validate(): ReviewResult = apply {
            if (validated) {
                return@apply
            }

            categories()
            flaggedContent()
            reasoning()
            reviewedAt()
            score()
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
            (categories.asKnown().getOrNull()?.size ?: 0) +
                (flaggedContent.asKnown().getOrNull()?.size ?: 0) +
                (if (reasoning.asKnown().isPresent) 1 else 0) +
                (if (reviewedAt.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReviewResult &&
                categories == other.categories &&
                flaggedContent == other.flaggedContent &&
                reasoning == other.reasoning &&
                reviewedAt == other.reviewedAt &&
                score == other.score &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                categories,
                flaggedContent,
                reasoning,
                reviewedAt,
                score,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReviewResult{categories=$categories, flaggedContent=$flaggedContent, reasoning=$reasoning, reviewedAt=$reviewedAt, score=$score, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Broadcast &&
            id == other.id &&
            channel == other.channel &&
            createdAt == other.createdAt &&
            messageType == other.messageType &&
            name == other.name &&
            status == other.status &&
            totalContacts == other.totalContacts &&
            actualCost == other.actualCost &&
            completedAt == other.completedAt &&
            content == other.content &&
            deliveredCount == other.deliveredCount &&
            emailSubject == other.emailSubject &&
            estimatedCost == other.estimatedCost &&
            failedCount == other.failedCount &&
            metadata == other.metadata &&
            pendingCount == other.pendingCount &&
            reservedAmount == other.reservedAmount &&
            reviewAttempts == other.reviewAttempts &&
            reviewResult == other.reviewResult &&
            scheduledAt == other.scheduledAt &&
            senderId == other.senderId &&
            sendingCount == other.sendingCount &&
            startedAt == other.startedAt &&
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
            name,
            status,
            totalContacts,
            actualCost,
            completedAt,
            content,
            deliveredCount,
            emailSubject,
            estimatedCost,
            failedCount,
            metadata,
            pendingCount,
            reservedAmount,
            reviewAttempts,
            reviewResult,
            scheduledAt,
            senderId,
            sendingCount,
            startedAt,
            text,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Broadcast{id=$id, channel=$channel, createdAt=$createdAt, messageType=$messageType, name=$name, status=$status, totalContacts=$totalContacts, actualCost=$actualCost, completedAt=$completedAt, content=$content, deliveredCount=$deliveredCount, emailSubject=$emailSubject, estimatedCost=$estimatedCost, failedCount=$failedCount, metadata=$metadata, pendingCount=$pendingCount, reservedAmount=$reservedAmount, reviewAttempts=$reviewAttempts, reviewResult=$reviewResult, scheduledAt=$scheduledAt, senderId=$senderId, sendingCount=$sendingCount, startedAt=$startedAt, text=$text, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
