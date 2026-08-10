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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentStats
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val errorCount: JsonField<Long>,
    private val successCount: JsonField<Long>,
    private val totalCost: JsonField<Double>,
    private val totalInvocations: JsonField<Long>,
    private val totalTokensUsed: JsonField<Long>,
    private val avgLatencyMs: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("errorCount") @ExcludeMissing errorCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("successCount")
        @ExcludeMissing
        successCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("totalCost") @ExcludeMissing totalCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("totalInvocations")
        @ExcludeMissing
        totalInvocations: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("totalTokensUsed")
        @ExcludeMissing
        totalTokensUsed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("avgLatencyMs")
        @ExcludeMissing
        avgLatencyMs: JsonField<Double> = JsonMissing.of(),
    ) : this(
        errorCount,
        successCount,
        totalCost,
        totalInvocations,
        totalTokensUsed,
        avgLatencyMs,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errorCount(): Long = errorCount.getRequired("errorCount")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun successCount(): Long = successCount.getRequired("successCount")

    /**
     * Total cost in USD.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalCost(): Double = totalCost.getRequired("totalCost")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalInvocations(): Long = totalInvocations.getRequired("totalInvocations")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalTokensUsed(): Long = totalTokensUsed.getRequired("totalTokensUsed")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avgLatencyMs(): Optional<Double> = avgLatencyMs.getOptional("avgLatencyMs")

    /**
     * Returns the raw JSON value of [errorCount].
     *
     * Unlike [errorCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorCount") @ExcludeMissing fun _errorCount(): JsonField<Long> = errorCount

    /**
     * Returns the raw JSON value of [successCount].
     *
     * Unlike [successCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("successCount")
    @ExcludeMissing
    fun _successCount(): JsonField<Long> = successCount

    /**
     * Returns the raw JSON value of [totalCost].
     *
     * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalCost") @ExcludeMissing fun _totalCost(): JsonField<Double> = totalCost

    /**
     * Returns the raw JSON value of [totalInvocations].
     *
     * Unlike [totalInvocations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalInvocations")
    @ExcludeMissing
    fun _totalInvocations(): JsonField<Long> = totalInvocations

    /**
     * Returns the raw JSON value of [totalTokensUsed].
     *
     * Unlike [totalTokensUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalTokensUsed")
    @ExcludeMissing
    fun _totalTokensUsed(): JsonField<Long> = totalTokensUsed

    /**
     * Returns the raw JSON value of [avgLatencyMs].
     *
     * Unlike [avgLatencyMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgLatencyMs")
    @ExcludeMissing
    fun _avgLatencyMs(): JsonField<Double> = avgLatencyMs

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
         * Returns a mutable builder for constructing an instance of [AgentStats].
         *
         * The following fields are required:
         * ```java
         * .errorCount()
         * .successCount()
         * .totalCost()
         * .totalInvocations()
         * .totalTokensUsed()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentStats]. */
    class Builder internal constructor() {

        private var errorCount: JsonField<Long>? = null
        private var successCount: JsonField<Long>? = null
        private var totalCost: JsonField<Double>? = null
        private var totalInvocations: JsonField<Long>? = null
        private var totalTokensUsed: JsonField<Long>? = null
        private var avgLatencyMs: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentStats: AgentStats) = apply {
            errorCount = agentStats.errorCount
            successCount = agentStats.successCount
            totalCost = agentStats.totalCost
            totalInvocations = agentStats.totalInvocations
            totalTokensUsed = agentStats.totalTokensUsed
            avgLatencyMs = agentStats.avgLatencyMs
            additionalProperties = agentStats.additionalProperties.toMutableMap()
        }

        fun errorCount(errorCount: Long) = errorCount(JsonField.of(errorCount))

        /**
         * Sets [Builder.errorCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun errorCount(errorCount: JsonField<Long>) = apply { this.errorCount = errorCount }

        fun successCount(successCount: Long) = successCount(JsonField.of(successCount))

        /**
         * Sets [Builder.successCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.successCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun successCount(successCount: JsonField<Long>) = apply { this.successCount = successCount }

        /** Total cost in USD. */
        fun totalCost(totalCost: Double) = totalCost(JsonField.of(totalCost))

        /**
         * Sets [Builder.totalCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCost(totalCost: JsonField<Double>) = apply { this.totalCost = totalCost }

        fun totalInvocations(totalInvocations: Long) =
            totalInvocations(JsonField.of(totalInvocations))

        /**
         * Sets [Builder.totalInvocations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalInvocations] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalInvocations(totalInvocations: JsonField<Long>) = apply {
            this.totalInvocations = totalInvocations
        }

        fun totalTokensUsed(totalTokensUsed: Long) = totalTokensUsed(JsonField.of(totalTokensUsed))

        /**
         * Sets [Builder.totalTokensUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokensUsed] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokensUsed(totalTokensUsed: JsonField<Long>) = apply {
            this.totalTokensUsed = totalTokensUsed
        }

        fun avgLatencyMs(avgLatencyMs: Double?) = avgLatencyMs(JsonField.ofNullable(avgLatencyMs))

        /**
         * Alias for [Builder.avgLatencyMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun avgLatencyMs(avgLatencyMs: Double) = avgLatencyMs(avgLatencyMs as Double?)

        /** Alias for calling [Builder.avgLatencyMs] with `avgLatencyMs.orElse(null)`. */
        fun avgLatencyMs(avgLatencyMs: Optional<Double>) = avgLatencyMs(avgLatencyMs.getOrNull())

        /**
         * Sets [Builder.avgLatencyMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgLatencyMs] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun avgLatencyMs(avgLatencyMs: JsonField<Double>) = apply {
            this.avgLatencyMs = avgLatencyMs
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
         * Returns an immutable instance of [AgentStats].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .errorCount()
         * .successCount()
         * .totalCost()
         * .totalInvocations()
         * .totalTokensUsed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentStats =
            AgentStats(
                checkRequired("errorCount", errorCount),
                checkRequired("successCount", successCount),
                checkRequired("totalCost", totalCost),
                checkRequired("totalInvocations", totalInvocations),
                checkRequired("totalTokensUsed", totalTokensUsed),
                avgLatencyMs,
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
    fun validate(): AgentStats = apply {
        if (validated) {
            return@apply
        }

        errorCount()
        successCount()
        totalCost()
        totalInvocations()
        totalTokensUsed()
        avgLatencyMs()
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
        (if (errorCount.asKnown().isPresent) 1 else 0) +
            (if (successCount.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalInvocations.asKnown().isPresent) 1 else 0) +
            (if (totalTokensUsed.asKnown().isPresent) 1 else 0) +
            (if (avgLatencyMs.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentStats &&
            errorCount == other.errorCount &&
            successCount == other.successCount &&
            totalCost == other.totalCost &&
            totalInvocations == other.totalInvocations &&
            totalTokensUsed == other.totalTokensUsed &&
            avgLatencyMs == other.avgLatencyMs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            errorCount,
            successCount,
            totalCost,
            totalInvocations,
            totalTokensUsed,
            avgLatencyMs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentStats{errorCount=$errorCount, successCount=$successCount, totalCost=$totalCost, totalInvocations=$totalInvocations, totalTokensUsed=$totalTokensUsed, avgLatencyMs=$avgLatencyMs, additionalProperties=$additionalProperties}"
}
