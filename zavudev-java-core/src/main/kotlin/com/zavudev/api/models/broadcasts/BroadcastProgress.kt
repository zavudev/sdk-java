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
import com.zavudev.api.core.checkRequired
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BroadcastProgress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val broadcastId: JsonField<String>,
    private val delivered: JsonField<Long>,
    private val failed: JsonField<Long>,
    private val pending: JsonField<Long>,
    private val percentComplete: JsonField<Double>,
    private val sending: JsonField<Long>,
    private val skipped: JsonField<Long>,
    private val status: JsonField<BroadcastStatus>,
    private val total: JsonField<Long>,
    private val actualCost: JsonField<Double>,
    private val estimatedCompletionAt: JsonField<OffsetDateTime>,
    private val estimatedCost: JsonField<Double>,
    private val reservedAmount: JsonField<Double>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("broadcastId")
        @ExcludeMissing
        broadcastId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("delivered") @ExcludeMissing delivered: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("failed") @ExcludeMissing failed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pending") @ExcludeMissing pending: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("percentComplete")
        @ExcludeMissing
        percentComplete: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sending") @ExcludeMissing sending: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("skipped") @ExcludeMissing skipped: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<BroadcastStatus> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("actualCost")
        @ExcludeMissing
        actualCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("estimatedCompletionAt")
        @ExcludeMissing
        estimatedCompletionAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("estimatedCost")
        @ExcludeMissing
        estimatedCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reservedAmount")
        @ExcludeMissing
        reservedAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("startedAt")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        broadcastId,
        delivered,
        failed,
        pending,
        percentComplete,
        sending,
        skipped,
        status,
        total,
        actualCost,
        estimatedCompletionAt,
        estimatedCost,
        reservedAmount,
        startedAt,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun broadcastId(): String = broadcastId.getRequired("broadcastId")

    /**
     * Successfully delivered.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun delivered(): Long = delivered.getRequired("delivered")

    /**
     * Failed to deliver.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun failed(): Long = failed.getRequired("failed")

    /**
     * Not yet queued for sending.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pending(): Long = pending.getRequired("pending")

    /**
     * Percentage complete (0-100).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentComplete(): Double = percentComplete.getRequired("percentComplete")

    /**
     * Currently being sent.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sending(): Long = sending.getRequired("sending")

    /**
     * Skipped (broadcast cancelled).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun skipped(): Long = skipped.getRequired("skipped")

    /**
     * Current status of the broadcast.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): BroadcastStatus = status.getRequired("status")

    /**
     * Total contacts in broadcast.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Long = total.getRequired("total")

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
    fun estimatedCompletionAt(): Optional<OffsetDateTime> =
        estimatedCompletionAt.getOptional("estimatedCompletionAt")

    /**
     * Estimated total cost in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun estimatedCost(): Optional<Double> = estimatedCost.getOptional("estimatedCost")

    /**
     * Amount reserved from balance in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reservedAmount(): Optional<Double> = reservedAmount.getOptional("reservedAmount")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("startedAt")

    /**
     * Returns the raw JSON value of [broadcastId].
     *
     * Unlike [broadcastId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("broadcastId") @ExcludeMissing fun _broadcastId(): JsonField<String> = broadcastId

    /**
     * Returns the raw JSON value of [delivered].
     *
     * Unlike [delivered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delivered") @ExcludeMissing fun _delivered(): JsonField<Long> = delivered

    /**
     * Returns the raw JSON value of [failed].
     *
     * Unlike [failed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed") @ExcludeMissing fun _failed(): JsonField<Long> = failed

    /**
     * Returns the raw JSON value of [pending].
     *
     * Unlike [pending], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending") @ExcludeMissing fun _pending(): JsonField<Long> = pending

    /**
     * Returns the raw JSON value of [percentComplete].
     *
     * Unlike [percentComplete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percentComplete")
    @ExcludeMissing
    fun _percentComplete(): JsonField<Double> = percentComplete

    /**
     * Returns the raw JSON value of [sending].
     *
     * Unlike [sending], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sending") @ExcludeMissing fun _sending(): JsonField<Long> = sending

    /**
     * Returns the raw JSON value of [skipped].
     *
     * Unlike [skipped], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skipped") @ExcludeMissing fun _skipped(): JsonField<Long> = skipped

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<BroadcastStatus> = status

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

    /**
     * Returns the raw JSON value of [actualCost].
     *
     * Unlike [actualCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actualCost") @ExcludeMissing fun _actualCost(): JsonField<Double> = actualCost

    /**
     * Returns the raw JSON value of [estimatedCompletionAt].
     *
     * Unlike [estimatedCompletionAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("estimatedCompletionAt")
    @ExcludeMissing
    fun _estimatedCompletionAt(): JsonField<OffsetDateTime> = estimatedCompletionAt

    /**
     * Returns the raw JSON value of [estimatedCost].
     *
     * Unlike [estimatedCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("estimatedCost")
    @ExcludeMissing
    fun _estimatedCost(): JsonField<Double> = estimatedCost

    /**
     * Returns the raw JSON value of [reservedAmount].
     *
     * Unlike [reservedAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reservedAmount")
    @ExcludeMissing
    fun _reservedAmount(): JsonField<Double> = reservedAmount

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [BroadcastProgress].
         *
         * The following fields are required:
         * ```java
         * .broadcastId()
         * .delivered()
         * .failed()
         * .pending()
         * .percentComplete()
         * .sending()
         * .skipped()
         * .status()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BroadcastProgress]. */
    class Builder internal constructor() {

        private var broadcastId: JsonField<String>? = null
        private var delivered: JsonField<Long>? = null
        private var failed: JsonField<Long>? = null
        private var pending: JsonField<Long>? = null
        private var percentComplete: JsonField<Double>? = null
        private var sending: JsonField<Long>? = null
        private var skipped: JsonField<Long>? = null
        private var status: JsonField<BroadcastStatus>? = null
        private var total: JsonField<Long>? = null
        private var actualCost: JsonField<Double> = JsonMissing.of()
        private var estimatedCompletionAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var estimatedCost: JsonField<Double> = JsonMissing.of()
        private var reservedAmount: JsonField<Double> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(broadcastProgress: BroadcastProgress) = apply {
            broadcastId = broadcastProgress.broadcastId
            delivered = broadcastProgress.delivered
            failed = broadcastProgress.failed
            pending = broadcastProgress.pending
            percentComplete = broadcastProgress.percentComplete
            sending = broadcastProgress.sending
            skipped = broadcastProgress.skipped
            status = broadcastProgress.status
            total = broadcastProgress.total
            actualCost = broadcastProgress.actualCost
            estimatedCompletionAt = broadcastProgress.estimatedCompletionAt
            estimatedCost = broadcastProgress.estimatedCost
            reservedAmount = broadcastProgress.reservedAmount
            startedAt = broadcastProgress.startedAt
            additionalProperties = broadcastProgress.additionalProperties.toMutableMap()
        }

        fun broadcastId(broadcastId: String) = broadcastId(JsonField.of(broadcastId))

        /**
         * Sets [Builder.broadcastId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.broadcastId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun broadcastId(broadcastId: JsonField<String>) = apply { this.broadcastId = broadcastId }

        /** Successfully delivered. */
        fun delivered(delivered: Long) = delivered(JsonField.of(delivered))

        /**
         * Sets [Builder.delivered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delivered] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun delivered(delivered: JsonField<Long>) = apply { this.delivered = delivered }

        /** Failed to deliver. */
        fun failed(failed: Long) = failed(JsonField.of(failed))

        /**
         * Sets [Builder.failed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun failed(failed: JsonField<Long>) = apply { this.failed = failed }

        /** Not yet queued for sending. */
        fun pending(pending: Long) = pending(JsonField.of(pending))

        /**
         * Sets [Builder.pending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pending] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pending(pending: JsonField<Long>) = apply { this.pending = pending }

        /** Percentage complete (0-100). */
        fun percentComplete(percentComplete: Double) =
            percentComplete(JsonField.of(percentComplete))

        /**
         * Sets [Builder.percentComplete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentComplete] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun percentComplete(percentComplete: JsonField<Double>) = apply {
            this.percentComplete = percentComplete
        }

        /** Currently being sent. */
        fun sending(sending: Long) = sending(JsonField.of(sending))

        /**
         * Sets [Builder.sending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sending] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sending(sending: JsonField<Long>) = apply { this.sending = sending }

        /** Skipped (broadcast cancelled). */
        fun skipped(skipped: Long) = skipped(JsonField.of(skipped))

        /**
         * Sets [Builder.skipped] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipped] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun skipped(skipped: JsonField<Long>) = apply { this.skipped = skipped }

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

        /** Total contacts in broadcast. */
        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

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

        fun estimatedCompletionAt(estimatedCompletionAt: OffsetDateTime) =
            estimatedCompletionAt(JsonField.of(estimatedCompletionAt))

        /**
         * Sets [Builder.estimatedCompletionAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estimatedCompletionAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun estimatedCompletionAt(estimatedCompletionAt: JsonField<OffsetDateTime>) = apply {
            this.estimatedCompletionAt = estimatedCompletionAt
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

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

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
         * Returns an immutable instance of [BroadcastProgress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .broadcastId()
         * .delivered()
         * .failed()
         * .pending()
         * .percentComplete()
         * .sending()
         * .skipped()
         * .status()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BroadcastProgress =
            BroadcastProgress(
                checkRequired("broadcastId", broadcastId),
                checkRequired("delivered", delivered),
                checkRequired("failed", failed),
                checkRequired("pending", pending),
                checkRequired("percentComplete", percentComplete),
                checkRequired("sending", sending),
                checkRequired("skipped", skipped),
                checkRequired("status", status),
                checkRequired("total", total),
                actualCost,
                estimatedCompletionAt,
                estimatedCost,
                reservedAmount,
                startedAt,
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
    fun validate(): BroadcastProgress = apply {
        if (validated) {
            return@apply
        }

        broadcastId()
        delivered()
        failed()
        pending()
        percentComplete()
        sending()
        skipped()
        status().validate()
        total()
        actualCost()
        estimatedCompletionAt()
        estimatedCost()
        reservedAmount()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (broadcastId.asKnown().isPresent) 1 else 0) +
            (if (delivered.asKnown().isPresent) 1 else 0) +
            (if (failed.asKnown().isPresent) 1 else 0) +
            (if (pending.asKnown().isPresent) 1 else 0) +
            (if (percentComplete.asKnown().isPresent) 1 else 0) +
            (if (sending.asKnown().isPresent) 1 else 0) +
            (if (skipped.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (total.asKnown().isPresent) 1 else 0) +
            (if (actualCost.asKnown().isPresent) 1 else 0) +
            (if (estimatedCompletionAt.asKnown().isPresent) 1 else 0) +
            (if (estimatedCost.asKnown().isPresent) 1 else 0) +
            (if (reservedAmount.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BroadcastProgress &&
            broadcastId == other.broadcastId &&
            delivered == other.delivered &&
            failed == other.failed &&
            pending == other.pending &&
            percentComplete == other.percentComplete &&
            sending == other.sending &&
            skipped == other.skipped &&
            status == other.status &&
            total == other.total &&
            actualCost == other.actualCost &&
            estimatedCompletionAt == other.estimatedCompletionAt &&
            estimatedCost == other.estimatedCost &&
            reservedAmount == other.reservedAmount &&
            startedAt == other.startedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            broadcastId,
            delivered,
            failed,
            pending,
            percentComplete,
            sending,
            skipped,
            status,
            total,
            actualCost,
            estimatedCompletionAt,
            estimatedCost,
            reservedAmount,
            startedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BroadcastProgress{broadcastId=$broadcastId, delivered=$delivered, failed=$failed, pending=$pending, percentComplete=$percentComplete, sending=$sending, skipped=$skipped, status=$status, total=$total, actualCost=$actualCost, estimatedCompletionAt=$estimatedCompletionAt, estimatedCost=$estimatedCost, reservedAmount=$reservedAmount, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
