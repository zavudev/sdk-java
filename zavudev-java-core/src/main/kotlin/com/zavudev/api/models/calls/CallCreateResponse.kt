// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CallCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val call: JsonField<Call>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("call") @ExcludeMissing call: JsonField<Call> = JsonMissing.of()
    ) : this(call, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun call(): Call = call.getRequired("call")

    /**
     * Returns the raw JSON value of [call].
     *
     * Unlike [call], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call") @ExcludeMissing fun _call(): JsonField<Call> = call

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
         * Returns a mutable builder for constructing an instance of [CallCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .call()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallCreateResponse]. */
    class Builder internal constructor() {

        private var call: JsonField<Call>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(callCreateResponse: CallCreateResponse) = apply {
            call = callCreateResponse.call
            additionalProperties = callCreateResponse.additionalProperties.toMutableMap()
        }

        fun call(call: Call) = call(JsonField.of(call))

        /**
         * Sets [Builder.call] to an arbitrary JSON value.
         *
         * You should usually call [Builder.call] with a well-typed [Call] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun call(call: JsonField<Call>) = apply { this.call = call }

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
         * Returns an immutable instance of [CallCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .call()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallCreateResponse =
            CallCreateResponse(checkRequired("call", call), additionalProperties.toMutableMap())
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
    fun validate(): CallCreateResponse = apply {
        if (validated) {
            return@apply
        }

        call().validate()
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
    @JvmSynthetic internal fun validity(): Int = (call.asKnown().getOrNull()?.validity() ?: 0)

    class Call
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val direction: JsonField<Direction>,
        private val from: JsonField<String>,
        private val status: JsonField<Status>,
        private val to: JsonField<String>,
        private val answeredAt: JsonField<OffsetDateTime>,
        private val cost: JsonField<Double>,
        private val durationSeconds: JsonField<Long>,
        private val endedAt: JsonField<OffsetDateTime>,
        private val endReason: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val transcript: JsonField<List<Transcript>>,
        private val turnCount: JsonField<Long>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("answeredAt")
            @ExcludeMissing
            answeredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("durationSeconds")
            @ExcludeMissing
            durationSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("endedAt")
            @ExcludeMissing
            endedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("endReason")
            @ExcludeMissing
            endReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("transcript")
            @ExcludeMissing
            transcript: JsonField<List<Transcript>> = JsonMissing.of(),
            @JsonProperty("turnCount")
            @ExcludeMissing
            turnCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            direction,
            from,
            status,
            to,
            answeredAt,
            cost,
            durationSeconds,
            endedAt,
            endReason,
            metadata,
            transcript,
            turnCount,
            updatedAt,
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
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Whether the call was placed by Zavu (outbound) or received from a caller (inbound).
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): Direction = direction.getRequired("direction")

        /**
         * Caller phone number in E.164 format. Your sender's number for outbound calls; the
         * caller's number for inbound calls.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("from")

        /**
         * Lifecycle status of a voice call.
         * - `queued`: outbound call created, not yet dialing.
         * - `ringing`: dialing (outbound) or received and ringing (inbound).
         * - `in_progress`: answered, the agent is connected.
         * - `completed`: ended after a conversation.
         * - `failed`: could not be completed.
         * - `busy`: the line was busy.
         * - `no_answer`: rang but was not answered.
         * - `canceled`: canceled before it was answered.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Callee phone number in E.164 format.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("to")

        /**
         * When the call was answered.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun answeredAt(): Optional<OffsetDateTime> = answeredAt.getOptional("answeredAt")

        /**
         * Total cost of the call in USD, combining the managed voice pipeline per-minute charge and
         * telephony. Available once the call has ended.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<Double> = cost.getOptional("cost")

        /**
         * Billable talk time in seconds, measured from answer to hangup.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationSeconds(): Optional<Long> = durationSeconds.getOptional("durationSeconds")

        /**
         * When the call ended.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endedAt(): Optional<OffsetDateTime> = endedAt.getOptional("endedAt")

        /**
         * Why the call ended (e.g. `agent_ended`, `max_duration`, `transfer`, `hangup`). Present
         * once the call is no longer active.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endReason(): Optional<String> = endReason.getOptional("endReason")

        /**
         * Arbitrary metadata you attached when creating the call.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Ordered transcript of the call. Included when retrieving a single call; omitted from list
         * responses.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transcript(): Optional<List<Transcript>> = transcript.getOptional("transcript")

        /**
         * Number of conversation turns exchanged during the call.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun turnCount(): Optional<Long> = turnCount.getOptional("turnCount")

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [answeredAt].
         *
         * Unlike [answeredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("answeredAt")
        @ExcludeMissing
        fun _answeredAt(): JsonField<OffsetDateTime> = answeredAt

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

        /**
         * Returns the raw JSON value of [durationSeconds].
         *
         * Unlike [durationSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("durationSeconds")
        @ExcludeMissing
        fun _durationSeconds(): JsonField<Long> = durationSeconds

        /**
         * Returns the raw JSON value of [endedAt].
         *
         * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endedAt") @ExcludeMissing fun _endedAt(): JsonField<OffsetDateTime> = endedAt

        /**
         * Returns the raw JSON value of [endReason].
         *
         * Unlike [endReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endReason") @ExcludeMissing fun _endReason(): JsonField<String> = endReason

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [transcript].
         *
         * Unlike [transcript], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transcript")
        @ExcludeMissing
        fun _transcript(): JsonField<List<Transcript>> = transcript

        /**
         * Returns the raw JSON value of [turnCount].
         *
         * Unlike [turnCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("turnCount") @ExcludeMissing fun _turnCount(): JsonField<Long> = turnCount

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
             * Returns a mutable builder for constructing an instance of [Call].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .direction()
             * .from()
             * .status()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Call]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var direction: JsonField<Direction>? = null
            private var from: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var to: JsonField<String>? = null
            private var answeredAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cost: JsonField<Double> = JsonMissing.of()
            private var durationSeconds: JsonField<Long> = JsonMissing.of()
            private var endedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endReason: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var transcript: JsonField<MutableList<Transcript>>? = null
            private var turnCount: JsonField<Long> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(call: Call) = apply {
                id = call.id
                createdAt = call.createdAt
                direction = call.direction
                from = call.from
                status = call.status
                to = call.to
                answeredAt = call.answeredAt
                cost = call.cost
                durationSeconds = call.durationSeconds
                endedAt = call.endedAt
                endReason = call.endReason
                metadata = call.metadata
                transcript = call.transcript.map { it.toMutableList() }
                turnCount = call.turnCount
                updatedAt = call.updatedAt
                additionalProperties = call.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Whether the call was placed by Zavu (outbound) or received from a caller (inbound).
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /**
             * Caller phone number in E.164 format. Your sender's number for outbound calls; the
             * caller's number for inbound calls.
             */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /**
             * Lifecycle status of a voice call.
             * - `queued`: outbound call created, not yet dialing.
             * - `ringing`: dialing (outbound) or received and ringing (inbound).
             * - `in_progress`: answered, the agent is connected.
             * - `completed`: ended after a conversation.
             * - `failed`: could not be completed.
             * - `busy`: the line was busy.
             * - `no_answer`: rang but was not answered.
             * - `canceled`: canceled before it was answered.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Callee phone number in E.164 format. */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /** When the call was answered. */
            fun answeredAt(answeredAt: OffsetDateTime?) =
                answeredAt(JsonField.ofNullable(answeredAt))

            /** Alias for calling [Builder.answeredAt] with `answeredAt.orElse(null)`. */
            fun answeredAt(answeredAt: Optional<OffsetDateTime>) =
                answeredAt(answeredAt.getOrNull())

            /**
             * Sets [Builder.answeredAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.answeredAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun answeredAt(answeredAt: JsonField<OffsetDateTime>) = apply {
                this.answeredAt = answeredAt
            }

            /**
             * Total cost of the call in USD, combining the managed voice pipeline per-minute charge
             * and telephony. Available once the call has ended.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

            /** Billable talk time in seconds, measured from answer to hangup. */
            fun durationSeconds(durationSeconds: Long?) =
                durationSeconds(JsonField.ofNullable(durationSeconds))

            /**
             * Alias for [Builder.durationSeconds].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun durationSeconds(durationSeconds: Long) = durationSeconds(durationSeconds as Long?)

            /** Alias for calling [Builder.durationSeconds] with `durationSeconds.orElse(null)`. */
            fun durationSeconds(durationSeconds: Optional<Long>) =
                durationSeconds(durationSeconds.getOrNull())

            /**
             * Sets [Builder.durationSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationSeconds(durationSeconds: JsonField<Long>) = apply {
                this.durationSeconds = durationSeconds
            }

            /** When the call ended. */
            fun endedAt(endedAt: OffsetDateTime?) = endedAt(JsonField.ofNullable(endedAt))

            /** Alias for calling [Builder.endedAt] with `endedAt.orElse(null)`. */
            fun endedAt(endedAt: Optional<OffsetDateTime>) = endedAt(endedAt.getOrNull())

            /**
             * Sets [Builder.endedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endedAt(endedAt: JsonField<OffsetDateTime>) = apply { this.endedAt = endedAt }

            /**
             * Why the call ended (e.g. `agent_ended`, `max_duration`, `transfer`, `hangup`).
             * Present once the call is no longer active.
             */
            fun endReason(endReason: String?) = endReason(JsonField.ofNullable(endReason))

            /** Alias for calling [Builder.endReason] with `endReason.orElse(null)`. */
            fun endReason(endReason: Optional<String>) = endReason(endReason.getOrNull())

            /**
             * Sets [Builder.endReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endReason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endReason(endReason: JsonField<String>) = apply { this.endReason = endReason }

            /** Arbitrary metadata you attached when creating the call. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Ordered transcript of the call. Included when retrieving a single call; omitted from
             * list responses.
             */
            fun transcript(transcript: List<Transcript>) = transcript(JsonField.of(transcript))

            /**
             * Sets [Builder.transcript] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcript] with a well-typed `List<Transcript>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transcript(transcript: JsonField<List<Transcript>>) = apply {
                this.transcript = transcript.map { it.toMutableList() }
            }

            /**
             * Adds a single [Transcript] to [Builder.transcript].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTranscript(transcript: Transcript) = apply {
                this.transcript =
                    (this.transcript ?: JsonField.of(mutableListOf())).also {
                        checkKnown("transcript", it).add(transcript)
                    }
            }

            /** Number of conversation turns exchanged during the call. */
            fun turnCount(turnCount: Long?) = turnCount(JsonField.ofNullable(turnCount))

            /**
             * Alias for [Builder.turnCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun turnCount(turnCount: Long) = turnCount(turnCount as Long?)

            /** Alias for calling [Builder.turnCount] with `turnCount.orElse(null)`. */
            fun turnCount(turnCount: Optional<Long>) = turnCount(turnCount.getOrNull())

            /**
             * Sets [Builder.turnCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turnCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun turnCount(turnCount: JsonField<Long>) = apply { this.turnCount = turnCount }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Call].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .direction()
             * .from()
             * .status()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Call =
                Call(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("direction", direction),
                    checkRequired("from", from),
                    checkRequired("status", status),
                    checkRequired("to", to),
                    answeredAt,
                    cost,
                    durationSeconds,
                    endedAt,
                    endReason,
                    metadata,
                    (transcript ?: JsonMissing.of()).map { it.toImmutable() },
                    turnCount,
                    updatedAt,
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
        fun validate(): Call = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            direction().validate()
            from()
            status().validate()
            to()
            answeredAt()
            cost()
            durationSeconds()
            endedAt()
            endReason()
            metadata().ifPresent { it.validate() }
            transcript().ifPresent { it.forEach { it.validate() } }
            turnCount()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (if (answeredAt.asKnown().isPresent) 1 else 0) +
                (if (cost.asKnown().isPresent) 1 else 0) +
                (if (durationSeconds.asKnown().isPresent) 1 else 0) +
                (if (endedAt.asKnown().isPresent) 1 else 0) +
                (if (endReason.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (transcript.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (turnCount.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** Whether the call was placed by Zavu (outbound) or received from a caller (inbound). */
        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INBOUND = of("inbound")

                @JvmField val OUTBOUND = of("outbound")

                @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
            }

            /** An enum containing [Direction]'s known values. */
            enum class Known {
                INBOUND,
                OUTBOUND,
            }

            /**
             * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Direction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INBOUND,
                OUTBOUND,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INBOUND -> Value.INBOUND
                    OUTBOUND -> Value.OUTBOUND
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ZavudevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INBOUND -> Known.INBOUND
                    OUTBOUND -> Known.OUTBOUND
                    else -> throw ZavudevInvalidDataException("Unknown Direction: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ZavudevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ZavudevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Direction = apply {
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

                return other is Direction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Lifecycle status of a voice call.
         * - `queued`: outbound call created, not yet dialing.
         * - `ringing`: dialing (outbound) or received and ringing (inbound).
         * - `in_progress`: answered, the agent is connected.
         * - `completed`: ended after a conversation.
         * - `failed`: could not be completed.
         * - `busy`: the line was busy.
         * - `no_answer`: rang but was not answered.
         * - `canceled`: canceled before it was answered.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val QUEUED = of("queued")

                @JvmField val RINGING = of("ringing")

                @JvmField val IN_PROGRESS = of("in_progress")

                @JvmField val COMPLETED = of("completed")

                @JvmField val FAILED = of("failed")

                @JvmField val BUSY = of("busy")

                @JvmField val NO_ANSWER = of("no_answer")

                @JvmField val CANCELED = of("canceled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                QUEUED,
                RINGING,
                IN_PROGRESS,
                COMPLETED,
                FAILED,
                BUSY,
                NO_ANSWER,
                CANCELED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                QUEUED,
                RINGING,
                IN_PROGRESS,
                COMPLETED,
                FAILED,
                BUSY,
                NO_ANSWER,
                CANCELED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    QUEUED -> Value.QUEUED
                    RINGING -> Value.RINGING
                    IN_PROGRESS -> Value.IN_PROGRESS
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    BUSY -> Value.BUSY
                    NO_ANSWER -> Value.NO_ANSWER
                    CANCELED -> Value.CANCELED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ZavudevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    QUEUED -> Known.QUEUED
                    RINGING -> Known.RINGING
                    IN_PROGRESS -> Known.IN_PROGRESS
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    BUSY -> Known.BUSY
                    NO_ANSWER -> Known.NO_ANSWER
                    CANCELED -> Known.CANCELED
                    else -> throw ZavudevInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ZavudevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ZavudevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Arbitrary metadata you attached when creating the call. */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        /** A single turn in a voice call transcript. */
        class Transcript
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val role: JsonField<Role>,
            private val seq: JsonField<Long>,
            private val text: JsonField<String>,
            private val endedAt: JsonField<OffsetDateTime>,
            private val startedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
                @JsonProperty("seq") @ExcludeMissing seq: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("endedAt")
                @ExcludeMissing
                endedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("startedAt")
                @ExcludeMissing
                startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(role, seq, text, endedAt, startedAt, mutableMapOf())

            /**
             * Who produced the turn. `tool` records a tool call the agent made during the
             * conversation.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun role(): Role = role.getRequired("role")

            /**
             * Ordinal position of the turn within the call, starting at 0.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun seq(): Long = seq.getRequired("seq")

            /**
             * Transcribed speech for `user` and `assistant` turns, or a JSON summary of the tool
             * call for `tool` turns.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun text(): String = text.getRequired("text")

            /**
             * When the turn ended.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endedAt(): Optional<OffsetDateTime> = endedAt.getOptional("endedAt")

            /**
             * When the turn started.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("startedAt")

            /**
             * Returns the raw JSON value of [role].
             *
             * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            /**
             * Returns the raw JSON value of [seq].
             *
             * Unlike [seq], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("seq") @ExcludeMissing fun _seq(): JsonField<Long> = seq

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            /**
             * Returns the raw JSON value of [endedAt].
             *
             * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("endedAt")
            @ExcludeMissing
            fun _endedAt(): JsonField<OffsetDateTime> = endedAt

            /**
             * Returns the raw JSON value of [startedAt].
             *
             * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("startedAt")
            @ExcludeMissing
            fun _startedAt(): JsonField<OffsetDateTime> = startedAt

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
                 * Returns a mutable builder for constructing an instance of [Transcript].
                 *
                 * The following fields are required:
                 * ```java
                 * .role()
                 * .seq()
                 * .text()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Transcript]. */
            class Builder internal constructor() {

                private var role: JsonField<Role>? = null
                private var seq: JsonField<Long>? = null
                private var text: JsonField<String>? = null
                private var endedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transcript: Transcript) = apply {
                    role = transcript.role
                    seq = transcript.seq
                    text = transcript.text
                    endedAt = transcript.endedAt
                    startedAt = transcript.startedAt
                    additionalProperties = transcript.additionalProperties.toMutableMap()
                }

                /**
                 * Who produced the turn. `tool` records a tool call the agent made during the
                 * conversation.
                 */
                fun role(role: Role) = role(JsonField.of(role))

                /**
                 * Sets [Builder.role] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.role] with a well-typed [Role] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<Role>) = apply { this.role = role }

                /** Ordinal position of the turn within the call, starting at 0. */
                fun seq(seq: Long) = seq(JsonField.of(seq))

                /**
                 * Sets [Builder.seq] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.seq] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun seq(seq: JsonField<Long>) = apply { this.seq = seq }

                /**
                 * Transcribed speech for `user` and `assistant` turns, or a JSON summary of the
                 * tool call for `tool` turns.
                 */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                /** When the turn ended. */
                fun endedAt(endedAt: OffsetDateTime?) = endedAt(JsonField.ofNullable(endedAt))

                /** Alias for calling [Builder.endedAt] with `endedAt.orElse(null)`. */
                fun endedAt(endedAt: Optional<OffsetDateTime>) = endedAt(endedAt.getOrNull())

                /**
                 * Sets [Builder.endedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endedAt(endedAt: JsonField<OffsetDateTime>) = apply { this.endedAt = endedAt }

                /** When the turn started. */
                fun startedAt(startedAt: OffsetDateTime?) =
                    startedAt(JsonField.ofNullable(startedAt))

                /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
                fun startedAt(startedAt: Optional<OffsetDateTime>) =
                    startedAt(startedAt.getOrNull())

                /**
                 * Sets [Builder.startedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply {
                    this.startedAt = startedAt
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Transcript].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .role()
                 * .seq()
                 * .text()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Transcript =
                    Transcript(
                        checkRequired("role", role),
                        checkRequired("seq", seq),
                        checkRequired("text", text),
                        endedAt,
                        startedAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Transcript = apply {
                if (validated) {
                    return@apply
                }

                role().validate()
                seq()
                text()
                endedAt()
                startedAt()
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
                (role.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (seq.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0) +
                    (if (endedAt.asKnown().isPresent) 1 else 0) +
                    (if (startedAt.asKnown().isPresent) 1 else 0)

            /**
             * Who produced the turn. `tool` records a tool call the agent made during the
             * conversation.
             */
            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val USER = of("user")

                    @JvmField val ASSISTANT = of("assistant")

                    @JvmField val TOOL = of("tool")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    USER,
                    ASSISTANT,
                    TOOL,
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USER,
                    ASSISTANT,
                    TOOL,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        ASSISTANT -> Value.ASSISTANT
                        TOOL -> Value.TOOL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ZavudevInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        ASSISTANT -> Known.ASSISTANT
                        TOOL -> Known.TOOL
                        else -> throw ZavudevInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ZavudevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        ZavudevInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ZavudevInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Role = apply {
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

                    return other is Role && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Transcript &&
                    role == other.role &&
                    seq == other.seq &&
                    text == other.text &&
                    endedAt == other.endedAt &&
                    startedAt == other.startedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(role, seq, text, endedAt, startedAt, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Transcript{role=$role, seq=$seq, text=$text, endedAt=$endedAt, startedAt=$startedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Call &&
                id == other.id &&
                createdAt == other.createdAt &&
                direction == other.direction &&
                from == other.from &&
                status == other.status &&
                to == other.to &&
                answeredAt == other.answeredAt &&
                cost == other.cost &&
                durationSeconds == other.durationSeconds &&
                endedAt == other.endedAt &&
                endReason == other.endReason &&
                metadata == other.metadata &&
                transcript == other.transcript &&
                turnCount == other.turnCount &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                direction,
                from,
                status,
                to,
                answeredAt,
                cost,
                durationSeconds,
                endedAt,
                endReason,
                metadata,
                transcript,
                turnCount,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Call{id=$id, createdAt=$createdAt, direction=$direction, from=$from, status=$status, to=$to, answeredAt=$answeredAt, cost=$cost, durationSeconds=$durationSeconds, endedAt=$endedAt, endReason=$endReason, metadata=$metadata, transcript=$transcript, turnCount=$turnCount, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallCreateResponse &&
            call == other.call &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(call, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CallCreateResponse{call=$call, additionalProperties=$additionalProperties}"
}
