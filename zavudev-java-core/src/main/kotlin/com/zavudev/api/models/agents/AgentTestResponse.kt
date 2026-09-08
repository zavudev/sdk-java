// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentTestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val error: JsonField<String>,
    private val inputTokens: JsonField<Long>,
    private val knowledgeChunksUsed: JsonField<Long>,
    private val latencyMs: JsonField<Long>,
    private val outputTokens: JsonField<Long>,
    private val success: JsonField<Boolean>,
    private val text: JsonField<String>,
    private val warnings: JsonField<List<String>>,
    private val executedToolCalls: JsonField<List<ExecutedToolCall>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inputTokens")
        @ExcludeMissing
        inputTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("knowledgeChunksUsed")
        @ExcludeMissing
        knowledgeChunksUsed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("latencyMs") @ExcludeMissing latencyMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("outputTokens")
        @ExcludeMissing
        outputTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("warnings")
        @ExcludeMissing
        warnings: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("executedToolCalls")
        @ExcludeMissing
        executedToolCalls: JsonField<List<ExecutedToolCall>> = JsonMissing.of(),
    ) : this(
        error,
        inputTokens,
        knowledgeChunksUsed,
        latencyMs,
        outputTokens,
        success,
        text,
        warnings,
        executedToolCalls,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputTokens(): Long = inputTokens.getRequired("inputTokens")

    /**
     * Knowledge-base chunks retrieved for this message. Zero means the answer was not grounded in
     * your documents.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun knowledgeChunksUsed(): Long = knowledgeChunksUsed.getRequired("knowledgeChunksUsed")

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
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * What the agent would reply.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * Things that are true of this agent but that a dry run cannot prove. Surfaced so a passing dry
     * run is never mistaken for proof that the agent works live.
     * - The agent being disabled.
     * - Enabled tools that were **not offered to the model** here — the model never saw them, so a
     *   reply that looks like a lookup was invented. Live conversations on every channel do offer
     *   them; running them here would cause real side effects.
     * - An agent whose sender has none of the channels it triggers on, which answers every dry run
     *   and no real message.
     * - Contact metadata that exists on a real conversation but not here.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun warnings(): List<String> = warnings.getRequired("warnings")

    /**
     * Tools that actually ran, in order, when the request set `executeTools`. Empty on a normal dry
     * run, where nothing is executed. An entry with `ok: false` means the agent saw an error and
     * answered around it, which is what a customer would have received.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executedToolCalls(): Optional<List<ExecutedToolCall>> =
        executedToolCalls.getOptional("executedToolCalls")

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [inputTokens].
     *
     * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputTokens") @ExcludeMissing fun _inputTokens(): JsonField<Long> = inputTokens

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
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [warnings].
     *
     * Unlike [warnings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("warnings") @ExcludeMissing fun _warnings(): JsonField<List<String>> = warnings

    /**
     * Returns the raw JSON value of [executedToolCalls].
     *
     * Unlike [executedToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("executedToolCalls")
    @ExcludeMissing
    fun _executedToolCalls(): JsonField<List<ExecutedToolCall>> = executedToolCalls

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
         * Returns a mutable builder for constructing an instance of [AgentTestResponse].
         *
         * The following fields are required:
         * ```java
         * .error()
         * .inputTokens()
         * .knowledgeChunksUsed()
         * .latencyMs()
         * .outputTokens()
         * .success()
         * .text()
         * .warnings()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentTestResponse]. */
    class Builder internal constructor() {

        private var error: JsonField<String>? = null
        private var inputTokens: JsonField<Long>? = null
        private var knowledgeChunksUsed: JsonField<Long>? = null
        private var latencyMs: JsonField<Long>? = null
        private var outputTokens: JsonField<Long>? = null
        private var success: JsonField<Boolean>? = null
        private var text: JsonField<String>? = null
        private var warnings: JsonField<MutableList<String>>? = null
        private var executedToolCalls: JsonField<MutableList<ExecutedToolCall>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentTestResponse: AgentTestResponse) = apply {
            error = agentTestResponse.error
            inputTokens = agentTestResponse.inputTokens
            knowledgeChunksUsed = agentTestResponse.knowledgeChunksUsed
            latencyMs = agentTestResponse.latencyMs
            outputTokens = agentTestResponse.outputTokens
            success = agentTestResponse.success
            text = agentTestResponse.text
            warnings = agentTestResponse.warnings.map { it.toMutableList() }
            executedToolCalls = agentTestResponse.executedToolCalls.map { it.toMutableList() }
            additionalProperties = agentTestResponse.additionalProperties.toMutableMap()
        }

        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

        /**
         * Sets [Builder.inputTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputTokens(inputTokens: JsonField<Long>) = apply { this.inputTokens = inputTokens }

        /**
         * Knowledge-base chunks retrieved for this message. Zero means the answer was not grounded
         * in your documents.
         */
        fun knowledgeChunksUsed(knowledgeChunksUsed: Long) =
            knowledgeChunksUsed(JsonField.of(knowledgeChunksUsed))

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

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** What the agent would reply. */
        fun text(text: String?) = text(JsonField.ofNullable(text))

        /** Alias for calling [Builder.text] with `text.orElse(null)`. */
        fun text(text: Optional<String>) = text(text.getOrNull())

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /**
         * Things that are true of this agent but that a dry run cannot prove. Surfaced so a passing
         * dry run is never mistaken for proof that the agent works live.
         * - The agent being disabled.
         * - Enabled tools that were **not offered to the model** here — the model never saw them,
         *   so a reply that looks like a lookup was invented. Live conversations on every channel
         *   do offer them; running them here would cause real side effects.
         * - An agent whose sender has none of the channels it triggers on, which answers every dry
         *   run and no real message.
         * - Contact metadata that exists on a real conversation but not here.
         */
        fun warnings(warnings: List<String>) = warnings(JsonField.of(warnings))

        /**
         * Sets [Builder.warnings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warnings] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun warnings(warnings: JsonField<List<String>>) = apply {
            this.warnings = warnings.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [warnings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWarning(warning: String) = apply {
            warnings =
                (warnings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("warnings", it).add(warning)
                }
        }

        /**
         * Tools that actually ran, in order, when the request set `executeTools`. Empty on a normal
         * dry run, where nothing is executed. An entry with `ok: false` means the agent saw an
         * error and answered around it, which is what a customer would have received.
         */
        fun executedToolCalls(executedToolCalls: List<ExecutedToolCall>) =
            executedToolCalls(JsonField.of(executedToolCalls))

        /**
         * Sets [Builder.executedToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executedToolCalls] with a well-typed
         * `List<ExecutedToolCall>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun executedToolCalls(executedToolCalls: JsonField<List<ExecutedToolCall>>) = apply {
            this.executedToolCalls = executedToolCalls.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExecutedToolCall] to [executedToolCalls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExecutedToolCall(executedToolCall: ExecutedToolCall) = apply {
            executedToolCalls =
                (executedToolCalls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("executedToolCalls", it).add(executedToolCall)
                }
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
         * Returns an immutable instance of [AgentTestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .error()
         * .inputTokens()
         * .knowledgeChunksUsed()
         * .latencyMs()
         * .outputTokens()
         * .success()
         * .text()
         * .warnings()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentTestResponse =
            AgentTestResponse(
                checkRequired("error", error),
                checkRequired("inputTokens", inputTokens),
                checkRequired("knowledgeChunksUsed", knowledgeChunksUsed),
                checkRequired("latencyMs", latencyMs),
                checkRequired("outputTokens", outputTokens),
                checkRequired("success", success),
                checkRequired("text", text),
                checkRequired("warnings", warnings).map { it.toImmutable() },
                (executedToolCalls ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): AgentTestResponse = apply {
        if (validated) {
            return@apply
        }

        error()
        inputTokens()
        knowledgeChunksUsed()
        latencyMs()
        outputTokens()
        success()
        text()
        warnings()
        executedToolCalls().ifPresent { it.forEach { it.validate() } }
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
        (if (error.asKnown().isPresent) 1 else 0) +
            (if (inputTokens.asKnown().isPresent) 1 else 0) +
            (if (knowledgeChunksUsed.asKnown().isPresent) 1 else 0) +
            (if (latencyMs.asKnown().isPresent) 1 else 0) +
            (if (outputTokens.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (warnings.asKnown().getOrNull()?.size ?: 0) +
            (executedToolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class ExecutedToolCall
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val ok: JsonField<Boolean>,
        private val error: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ok") @ExcludeMissing ok: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        ) : this(name, ok, error, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ok(): Boolean = ok.getRequired("ok")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [ok].
         *
         * Unlike [ok], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ok") @ExcludeMissing fun _ok(): JsonField<Boolean> = ok

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
             * Returns a mutable builder for constructing an instance of [ExecutedToolCall].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .ok()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExecutedToolCall]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var ok: JsonField<Boolean>? = null
            private var error: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(executedToolCall: ExecutedToolCall) = apply {
                name = executedToolCall.name
                ok = executedToolCall.ok
                error = executedToolCall.error
                additionalProperties = executedToolCall.additionalProperties.toMutableMap()
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

            fun ok(ok: Boolean) = ok(JsonField.of(ok))

            /**
             * Sets [Builder.ok] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ok] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ok(ok: JsonField<Boolean>) = apply { this.ok = ok }

            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

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
             * Returns an immutable instance of [ExecutedToolCall].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .ok()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExecutedToolCall =
                ExecutedToolCall(
                    checkRequired("name", name),
                    checkRequired("ok", ok),
                    error,
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
        fun validate(): ExecutedToolCall = apply {
            if (validated) {
                return@apply
            }

            name()
            ok()
            error()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (ok.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExecutedToolCall &&
                name == other.name &&
                ok == other.ok &&
                error == other.error &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, ok, error, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExecutedToolCall{name=$name, ok=$ok, error=$error, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentTestResponse &&
            error == other.error &&
            inputTokens == other.inputTokens &&
            knowledgeChunksUsed == other.knowledgeChunksUsed &&
            latencyMs == other.latencyMs &&
            outputTokens == other.outputTokens &&
            success == other.success &&
            text == other.text &&
            warnings == other.warnings &&
            executedToolCalls == other.executedToolCalls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            error,
            inputTokens,
            knowledgeChunksUsed,
            latencyMs,
            outputTokens,
            success,
            text,
            warnings,
            executedToolCalls,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentTestResponse{error=$error, inputTokens=$inputTokens, knowledgeChunksUsed=$knowledgeChunksUsed, latencyMs=$latencyMs, outputTokens=$outputTokens, success=$success, text=$text, warnings=$warnings, executedToolCalls=$executedToolCalls, additionalProperties=$additionalProperties}"
}
