// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.executions

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
import com.zavudev.api.models.senders.agent.AgentExecution
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ExecutionRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val execution: JsonField<AgentExecution>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("execution")
        @ExcludeMissing
        execution: JsonField<AgentExecution> = JsonMissing.of()
    ) : this(execution, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun execution(): AgentExecution = execution.getRequired("execution")

    /**
     * Returns the raw JSON value of [execution].
     *
     * Unlike [execution], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution")
    @ExcludeMissing
    fun _execution(): JsonField<AgentExecution> = execution

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
         * Returns a mutable builder for constructing an instance of [ExecutionRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .execution()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExecutionRetrieveResponse]. */
    class Builder internal constructor() {

        private var execution: JsonField<AgentExecution>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(executionRetrieveResponse: ExecutionRetrieveResponse) = apply {
            execution = executionRetrieveResponse.execution
            additionalProperties = executionRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun execution(execution: AgentExecution) = execution(JsonField.of(execution))

        /**
         * Sets [Builder.execution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.execution] with a well-typed [AgentExecution] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun execution(execution: JsonField<AgentExecution>) = apply { this.execution = execution }

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
         * Returns an immutable instance of [ExecutionRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .execution()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExecutionRetrieveResponse =
            ExecutionRetrieveResponse(
                checkRequired("execution", execution),
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
    fun validate(): ExecutionRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        execution().validate()
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
    @JvmSynthetic internal fun validity(): Int = (execution.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExecutionRetrieveResponse &&
            execution == other.execution &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(execution, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExecutionRetrieveResponse{execution=$execution, additionalProperties=$additionalProperties}"
}
