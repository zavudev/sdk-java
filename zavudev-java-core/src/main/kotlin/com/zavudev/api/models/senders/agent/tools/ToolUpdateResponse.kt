// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

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
import kotlin.jvm.optionals.getOrNull

class ToolUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val tool: JsonField<AgentTool>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("tool") @ExcludeMissing tool: JsonField<AgentTool> = JsonMissing.of()
    ) : this(tool, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tool(): AgentTool = tool.getRequired("tool")

    /**
     * Returns the raw JSON value of [tool].
     *
     * Unlike [tool], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool") @ExcludeMissing fun _tool(): JsonField<AgentTool> = tool

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
         * Returns a mutable builder for constructing an instance of [ToolUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .tool()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolUpdateResponse]. */
    class Builder internal constructor() {

        private var tool: JsonField<AgentTool>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolUpdateResponse: ToolUpdateResponse) = apply {
            tool = toolUpdateResponse.tool
            additionalProperties = toolUpdateResponse.additionalProperties.toMutableMap()
        }

        fun tool(tool: AgentTool) = tool(JsonField.of(tool))

        /**
         * Sets [Builder.tool] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tool] with a well-typed [AgentTool] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tool(tool: JsonField<AgentTool>) = apply { this.tool = tool }

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
         * Returns an immutable instance of [ToolUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .tool()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolUpdateResponse =
            ToolUpdateResponse(checkRequired("tool", tool), additionalProperties.toMutableMap())
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
    fun validate(): ToolUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        tool().validate()
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
    @JvmSynthetic internal fun validity(): Int = (tool.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolUpdateResponse &&
            tool == other.tool &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(tool, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolUpdateResponse{tool=$tool, additionalProperties=$additionalProperties}"
}
