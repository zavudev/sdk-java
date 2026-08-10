// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentExecution
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val agentId: JsonField<String>,
    private val cost: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val inputTokens: JsonField<Long>,
    private val latencyMs: JsonField<Long>,
    private val outputTokens: JsonField<Long>,
    private val status: JsonField<AgentExecutionStatus>,
    private val errorMessage: JsonField<String>,
    private val inboundMessageId: JsonField<String>,
    private val knowledgeChunksUsed: JsonField<Long>,
    private val responseMessageId: JsonField<String>,
    private val responseText: JsonField<String>,
    private val toolCalls: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agentId") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inputTokens")
        @ExcludeMissing
        inputTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("latencyMs") @ExcludeMissing latencyMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("outputTokens")
        @ExcludeMissing
        outputTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<AgentExecutionStatus> = JsonMissing.of(),
        @JsonProperty("errorMessage")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inboundMessageId")
        @ExcludeMissing
        inboundMessageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("knowledgeChunksUsed")
        @ExcludeMissing
        knowledgeChunksUsed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("responseMessageId")
        @ExcludeMissing
        responseMessageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("responseText")
        @ExcludeMissing
        responseText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toolCalls") @ExcludeMissing toolCalls: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        agentId,
        cost,
        createdAt,
        inputTokens,
        latencyMs,
        outputTokens,
        status,
        errorMessage,
        inboundMessageId,
        knowledgeChunksUsed,
        responseMessageId,
        responseText,
        toolCalls,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): String = agentId.getRequired("agentId")

    /**
     * Cost in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cost(): Double = cost.getRequired("cost")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputTokens(): Long = inputTokens.getRequired("inputTokens")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun latencyMs(): Long = latencyMs.getRequired("latencyMs")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputTokens(): Long = outputTokens.getRequired("outputTokens")

    /**
     * Status of an agent execution.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): AgentExecutionStatus = status.getRequired("status")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundMessageId(): Optional<String> = inboundMessageId.getOptional("inboundMessageId")

    /**
     * Knowledge-base chunks retrieved for this answer. Zero on an agent that has documents attached
     * means the reply was not grounded in them, which is otherwise indistinguishable from a correct
     * answer in this record. Absent on executions recorded before this field existed, which is not
     * the same as zero.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun knowledgeChunksUsed(): Optional<Long> =
        knowledgeChunksUsed.getOptional("knowledgeChunksUsed")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseMessageId(): Optional<String> = responseMessageId.getOptional("responseMessageId")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseText(): Optional<String> = responseText.getOptional("responseText")

    /**
     * Tools the agent called while producing this reply. Zero on an agent that has tools configured
     * means it answered without calling any — the case where a reply says it will look something up
     * and nothing ever reaches your endpoint. Absent on executions recorded before this field
     * existed, which is not the same as zero.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolCalls(): Optional<Long> = toolCalls.getOptional("toolCalls")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentId") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [inputTokens].
     *
     * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputTokens") @ExcludeMissing fun _inputTokens(): JsonField<Long> = inputTokens

    /**
     * Returns the raw JSON value of [latencyMs].
     *
     * Unlike [latencyMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latencyMs") @ExcludeMissing fun _latencyMs(): JsonField<Long> = latencyMs

    /**
     * Returns the raw JSON value of [outputTokens].
     *
     * Unlike [outputTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputTokens")
    @ExcludeMissing
    fun _outputTokens(): JsonField<Long> = outputTokens

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<AgentExecutionStatus> = status

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorMessage")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [inboundMessageId].
     *
     * Unlike [inboundMessageId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inboundMessageId")
    @ExcludeMissing
    fun _inboundMessageId(): JsonField<String> = inboundMessageId

    /**
     * Returns the raw JSON value of [knowledgeChunksUsed].
     *
     * Unlike [knowledgeChunksUsed], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("knowledgeChunksUsed")
    @ExcludeMissing
    fun _knowledgeChunksUsed(): JsonField<Long> = knowledgeChunksUsed

    /**
     * Returns the raw JSON value of [responseMessageId].
     *
     * Unlike [responseMessageId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("responseMessageId")
    @ExcludeMissing
    fun _responseMessageId(): JsonField<String> = responseMessageId

    /**
     * Returns the raw JSON value of [responseText].
     *
     * Unlike [responseText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("responseText")
    @ExcludeMissing
    fun _responseText(): JsonField<String> = responseText

    /**
     * Returns the raw JSON value of [toolCalls].
     *
     * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toolCalls") @ExcludeMissing fun _toolCalls(): JsonField<Long> = toolCalls

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
         * Returns a mutable builder for constructing an instance of [AgentExecution].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agentId()
         * .cost()
         * .createdAt()
         * .inputTokens()
         * .latencyMs()
         * .outputTokens()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentExecution]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var agentId: JsonField<String>? = null
        private var cost: JsonField<Double>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var inputTokens: JsonField<Long>? = null
        private var latencyMs: JsonField<Long>? = null
        private var outputTokens: JsonField<Long>? = null
        private var status: JsonField<AgentExecutionStatus>? = null
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var inboundMessageId: JsonField<String> = JsonMissing.of()
        private var knowledgeChunksUsed: JsonField<Long> = JsonMissing.of()
        private var responseMessageId: JsonField<String> = JsonMissing.of()
        private var responseText: JsonField<String> = JsonMissing.of()
        private var toolCalls: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentExecution: AgentExecution) = apply {
            id = agentExecution.id
            agentId = agentExecution.agentId
            cost = agentExecution.cost
            createdAt = agentExecution.createdAt
            inputTokens = agentExecution.inputTokens
            latencyMs = agentExecution.latencyMs
            outputTokens = agentExecution.outputTokens
            status = agentExecution.status
            errorMessage = agentExecution.errorMessage
            inboundMessageId = agentExecution.inboundMessageId
            knowledgeChunksUsed = agentExecution.knowledgeChunksUsed
            responseMessageId = agentExecution.responseMessageId
            responseText = agentExecution.responseText
            toolCalls = agentExecution.toolCalls
            additionalProperties = agentExecution.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        /** Cost in USD. */
        fun cost(cost: Double) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

        /**
         * Sets [Builder.inputTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputTokens(inputTokens: JsonField<Long>) = apply { this.inputTokens = inputTokens }

        fun latencyMs(latencyMs: Long) = latencyMs(JsonField.of(latencyMs))

        /**
         * Sets [Builder.latencyMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latencyMs(latencyMs: JsonField<Long>) = apply { this.latencyMs = latencyMs }

        fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

        /**
         * Sets [Builder.outputTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outputTokens(outputTokens: JsonField<Long>) = apply { this.outputTokens = outputTokens }

        /** Status of an agent execution. */
        fun status(status: AgentExecutionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [AgentExecutionStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<AgentExecutionStatus>) = apply { this.status = status }

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

        fun inboundMessageId(inboundMessageId: String) =
            inboundMessageId(JsonField.of(inboundMessageId))

        /**
         * Sets [Builder.inboundMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundMessageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inboundMessageId(inboundMessageId: JsonField<String>) = apply {
            this.inboundMessageId = inboundMessageId
        }

        /**
         * Knowledge-base chunks retrieved for this answer. Zero on an agent that has documents
         * attached means the reply was not grounded in them, which is otherwise indistinguishable
         * from a correct answer in this record. Absent on executions recorded before this field
         * existed, which is not the same as zero.
         */
        fun knowledgeChunksUsed(knowledgeChunksUsed: Long?) =
            knowledgeChunksUsed(JsonField.ofNullable(knowledgeChunksUsed))

        /**
         * Alias for [Builder.knowledgeChunksUsed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun knowledgeChunksUsed(knowledgeChunksUsed: Long) =
            knowledgeChunksUsed(knowledgeChunksUsed as Long?)

        /**
         * Alias for calling [Builder.knowledgeChunksUsed] with `knowledgeChunksUsed.orElse(null)`.
         */
        fun knowledgeChunksUsed(knowledgeChunksUsed: Optional<Long>) =
            knowledgeChunksUsed(knowledgeChunksUsed.getOrNull())

        /**
         * Sets [Builder.knowledgeChunksUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.knowledgeChunksUsed] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun knowledgeChunksUsed(knowledgeChunksUsed: JsonField<Long>) = apply {
            this.knowledgeChunksUsed = knowledgeChunksUsed
        }

        fun responseMessageId(responseMessageId: String?) =
            responseMessageId(JsonField.ofNullable(responseMessageId))

        /** Alias for calling [Builder.responseMessageId] with `responseMessageId.orElse(null)`. */
        fun responseMessageId(responseMessageId: Optional<String>) =
            responseMessageId(responseMessageId.getOrNull())

        /**
         * Sets [Builder.responseMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseMessageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseMessageId(responseMessageId: JsonField<String>) = apply {
            this.responseMessageId = responseMessageId
        }

        fun responseText(responseText: String?) = responseText(JsonField.ofNullable(responseText))

        /** Alias for calling [Builder.responseText] with `responseText.orElse(null)`. */
        fun responseText(responseText: Optional<String>) = responseText(responseText.getOrNull())

        /**
         * Sets [Builder.responseText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun responseText(responseText: JsonField<String>) = apply {
            this.responseText = responseText
        }

        /**
         * Tools the agent called while producing this reply. Zero on an agent that has tools
         * configured means it answered without calling any — the case where a reply says it will
         * look something up and nothing ever reaches your endpoint. Absent on executions recorded
         * before this field existed, which is not the same as zero.
         */
        fun toolCalls(toolCalls: Long?) = toolCalls(JsonField.ofNullable(toolCalls))

        /**
         * Alias for [Builder.toolCalls].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun toolCalls(toolCalls: Long) = toolCalls(toolCalls as Long?)

        /** Alias for calling [Builder.toolCalls] with `toolCalls.orElse(null)`. */
        fun toolCalls(toolCalls: Optional<Long>) = toolCalls(toolCalls.getOrNull())

        /**
         * Sets [Builder.toolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolCalls] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun toolCalls(toolCalls: JsonField<Long>) = apply { this.toolCalls = toolCalls }

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
         * Returns an immutable instance of [AgentExecution].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agentId()
         * .cost()
         * .createdAt()
         * .inputTokens()
         * .latencyMs()
         * .outputTokens()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentExecution =
            AgentExecution(
                checkRequired("id", id),
                checkRequired("agentId", agentId),
                checkRequired("cost", cost),
                checkRequired("createdAt", createdAt),
                checkRequired("inputTokens", inputTokens),
                checkRequired("latencyMs", latencyMs),
                checkRequired("outputTokens", outputTokens),
                checkRequired("status", status),
                errorMessage,
                inboundMessageId,
                knowledgeChunksUsed,
                responseMessageId,
                responseText,
                toolCalls,
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
    fun validate(): AgentExecution = apply {
        if (validated) {
            return@apply
        }

        id()
        agentId()
        cost()
        createdAt()
        inputTokens()
        latencyMs()
        outputTokens()
        status().validate()
        errorMessage()
        inboundMessageId()
        knowledgeChunksUsed()
        responseMessageId()
        responseText()
        toolCalls()
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
            (if (agentId.asKnown().isPresent) 1 else 0) +
            (if (cost.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (inputTokens.asKnown().isPresent) 1 else 0) +
            (if (latencyMs.asKnown().isPresent) 1 else 0) +
            (if (outputTokens.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (inboundMessageId.asKnown().isPresent) 1 else 0) +
            (if (knowledgeChunksUsed.asKnown().isPresent) 1 else 0) +
            (if (responseMessageId.asKnown().isPresent) 1 else 0) +
            (if (responseText.asKnown().isPresent) 1 else 0) +
            (if (toolCalls.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentExecution &&
            id == other.id &&
            agentId == other.agentId &&
            cost == other.cost &&
            createdAt == other.createdAt &&
            inputTokens == other.inputTokens &&
            latencyMs == other.latencyMs &&
            outputTokens == other.outputTokens &&
            status == other.status &&
            errorMessage == other.errorMessage &&
            inboundMessageId == other.inboundMessageId &&
            knowledgeChunksUsed == other.knowledgeChunksUsed &&
            responseMessageId == other.responseMessageId &&
            responseText == other.responseText &&
            toolCalls == other.toolCalls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agentId,
            cost,
            createdAt,
            inputTokens,
            latencyMs,
            outputTokens,
            status,
            errorMessage,
            inboundMessageId,
            knowledgeChunksUsed,
            responseMessageId,
            responseText,
            toolCalls,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentExecution{id=$id, agentId=$agentId, cost=$cost, createdAt=$createdAt, inputTokens=$inputTokens, latencyMs=$latencyMs, outputTokens=$outputTokens, status=$status, errorMessage=$errorMessage, inboundMessageId=$inboundMessageId, knowledgeChunksUsed=$knowledgeChunksUsed, responseMessageId=$responseMessageId, responseText=$responseText, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
}
