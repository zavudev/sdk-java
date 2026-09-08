// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
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
 * Run the agent's prompt, model and knowledge base against a message and return the reply instead
 * of delivering it. Writes nothing and charges nothing, so it is safe to call repeatedly while
 * iterating on a prompt.
 *
 * Note that a dry run never **executes** tools — running them would cause real side effects. Live
 * conversations on every channel do call them. When the agent has enabled tools, that gap is
 * reported in `warnings` rather than silently producing an answer that looks like a tool call
 * happened.
 */
class AgentTestParams
private constructor(
    private val agentId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun agentId(): Optional<String> = Optional.ofNullable(agentId)

    /**
     * What to say to the agent.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = body.message()

    /**
     * Run the tools the agent calls instead of reporting the choice and stopping.
     *
     * Off by default because a tool handler talks to the outside world: a rehearsal that charges a
     * card is not a rehearsal. Turn it on to exercise the loop that actually matters — the model
     * picks a tool, the handler answers, the model replies with the result — without sending a
     * message to anyone. What ran comes back in `executedToolCalls`.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executeTools(): Optional<Boolean> = body.executeTools()

    /**
     * Prior turns, oldest first, to exercise multi-turn behaviour without persisting a thread.
     * Trimmed to the agent's context window.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun history(): Optional<List<History>> = body.history()

    /**
     * Set false to skip retrieval and isolate prompt behaviour from the knowledge base.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useKnowledgeBase(): Optional<Boolean> = body.useKnowledgeBase()

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _message(): JsonField<String> = body._message()

    /**
     * Returns the raw JSON value of [executeTools].
     *
     * Unlike [executeTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _executeTools(): JsonField<Boolean> = body._executeTools()

    /**
     * Returns the raw JSON value of [history].
     *
     * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _history(): JsonField<List<History>> = body._history()

    /**
     * Returns the raw JSON value of [useKnowledgeBase].
     *
     * Unlike [useKnowledgeBase], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _useKnowledgeBase(): JsonField<Boolean> = body._useKnowledgeBase()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentTestParams].
         *
         * The following fields are required:
         * ```java
         * .message()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentTestParams]. */
    class Builder internal constructor() {

        private var agentId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(agentTestParams: AgentTestParams) = apply {
            agentId = agentTestParams.agentId
            body = agentTestParams.body.toBuilder()
            additionalHeaders = agentTestParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentTestParams.additionalQueryParams.toBuilder()
        }

        fun agentId(agentId: String?) = apply { this.agentId = agentId }

        /** Alias for calling [Builder.agentId] with `agentId.orElse(null)`. */
        fun agentId(agentId: Optional<String>) = agentId(agentId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [message]
         * - [executeTools]
         * - [history]
         * - [useKnowledgeBase]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** What to say to the agent. */
        fun message(message: String) = apply { body.message(message) }

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { body.message(message) }

        /**
         * Run the tools the agent calls instead of reporting the choice and stopping.
         *
         * Off by default because a tool handler talks to the outside world: a rehearsal that
         * charges a card is not a rehearsal. Turn it on to exercise the loop that actually matters
         * — the model picks a tool, the handler answers, the model replies with the result —
         * without sending a message to anyone. What ran comes back in `executedToolCalls`.
         */
        fun executeTools(executeTools: Boolean) = apply { body.executeTools(executeTools) }

        /**
         * Sets [Builder.executeTools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executeTools] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executeTools(executeTools: JsonField<Boolean>) = apply {
            body.executeTools(executeTools)
        }

        /**
         * Prior turns, oldest first, to exercise multi-turn behaviour without persisting a thread.
         * Trimmed to the agent's context window.
         */
        fun history(history: List<History>) = apply { body.history(history) }

        /**
         * Sets [Builder.history] to an arbitrary JSON value.
         *
         * You should usually call [Builder.history] with a well-typed `List<History>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun history(history: JsonField<List<History>>) = apply { body.history(history) }

        /**
         * Adds a single [History] to [Builder.history].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHistory(history: History) = apply { body.addHistory(history) }

        /** Set false to skip retrieval and isolate prompt behaviour from the knowledge base. */
        fun useKnowledgeBase(useKnowledgeBase: Boolean) = apply {
            body.useKnowledgeBase(useKnowledgeBase)
        }

        /**
         * Sets [Builder.useKnowledgeBase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useKnowledgeBase] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useKnowledgeBase(useKnowledgeBase: JsonField<Boolean>) = apply {
            body.useKnowledgeBase(useKnowledgeBase)
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
         * Returns an immutable instance of [AgentTestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .message()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentTestParams =
            AgentTestParams(
                agentId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> agentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Run the agent and return what it would say. Nothing is delivered to anyone, no execution is
     * recorded, and nothing is charged.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val message: JsonField<String>,
        private val executeTools: JsonField<Boolean>,
        private val history: JsonField<List<History>>,
        private val useKnowledgeBase: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("executeTools")
            @ExcludeMissing
            executeTools: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("history")
            @ExcludeMissing
            history: JsonField<List<History>> = JsonMissing.of(),
            @JsonProperty("useKnowledgeBase")
            @ExcludeMissing
            useKnowledgeBase: JsonField<Boolean> = JsonMissing.of(),
        ) : this(message, executeTools, history, useKnowledgeBase, mutableMapOf())

        /**
         * What to say to the agent.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Run the tools the agent calls instead of reporting the choice and stopping.
         *
         * Off by default because a tool handler talks to the outside world: a rehearsal that
         * charges a card is not a rehearsal. Turn it on to exercise the loop that actually matters
         * — the model picks a tool, the handler answers, the model replies with the result —
         * without sending a message to anyone. What ran comes back in `executedToolCalls`.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun executeTools(): Optional<Boolean> = executeTools.getOptional("executeTools")

        /**
         * Prior turns, oldest first, to exercise multi-turn behaviour without persisting a thread.
         * Trimmed to the agent's context window.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun history(): Optional<List<History>> = history.getOptional("history")

        /**
         * Set false to skip retrieval and isolate prompt behaviour from the knowledge base.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useKnowledgeBase(): Optional<Boolean> = useKnowledgeBase.getOptional("useKnowledgeBase")

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [executeTools].
         *
         * Unlike [executeTools], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("executeTools")
        @ExcludeMissing
        fun _executeTools(): JsonField<Boolean> = executeTools

        /**
         * Returns the raw JSON value of [history].
         *
         * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<List<History>> = history

        /**
         * Returns the raw JSON value of [useKnowledgeBase].
         *
         * Unlike [useKnowledgeBase], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("useKnowledgeBase")
        @ExcludeMissing
        fun _useKnowledgeBase(): JsonField<Boolean> = useKnowledgeBase

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
             * .message()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var message: JsonField<String>? = null
            private var executeTools: JsonField<Boolean> = JsonMissing.of()
            private var history: JsonField<MutableList<History>>? = null
            private var useKnowledgeBase: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                message = body.message
                executeTools = body.executeTools
                history = body.history.map { it.toMutableList() }
                useKnowledgeBase = body.useKnowledgeBase
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** What to say to the agent. */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /**
             * Run the tools the agent calls instead of reporting the choice and stopping.
             *
             * Off by default because a tool handler talks to the outside world: a rehearsal that
             * charges a card is not a rehearsal. Turn it on to exercise the loop that actually
             * matters — the model picks a tool, the handler answers, the model replies with the
             * result — without sending a message to anyone. What ran comes back in
             * `executedToolCalls`.
             */
            fun executeTools(executeTools: Boolean) = executeTools(JsonField.of(executeTools))

            /**
             * Sets [Builder.executeTools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.executeTools] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun executeTools(executeTools: JsonField<Boolean>) = apply {
                this.executeTools = executeTools
            }

            /**
             * Prior turns, oldest first, to exercise multi-turn behaviour without persisting a
             * thread. Trimmed to the agent's context window.
             */
            fun history(history: List<History>) = history(JsonField.of(history))

            /**
             * Sets [Builder.history] to an arbitrary JSON value.
             *
             * You should usually call [Builder.history] with a well-typed `List<History>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun history(history: JsonField<List<History>>) = apply {
                this.history = history.map { it.toMutableList() }
            }

            /**
             * Adds a single [History] to [Builder.history].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addHistory(history: History) = apply {
                this.history =
                    (this.history ?: JsonField.of(mutableListOf())).also {
                        checkKnown("history", it).add(history)
                    }
            }

            /** Set false to skip retrieval and isolate prompt behaviour from the knowledge base. */
            fun useKnowledgeBase(useKnowledgeBase: Boolean) =
                useKnowledgeBase(JsonField.of(useKnowledgeBase))

            /**
             * Sets [Builder.useKnowledgeBase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useKnowledgeBase] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useKnowledgeBase(useKnowledgeBase: JsonField<Boolean>) = apply {
                this.useKnowledgeBase = useKnowledgeBase
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
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("message", message),
                    executeTools,
                    (history ?: JsonMissing.of()).map { it.toImmutable() },
                    useKnowledgeBase,
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

            message()
            executeTools()
            history().ifPresent { it.forEach { it.validate() } }
            useKnowledgeBase()
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
            (if (message.asKnown().isPresent) 1 else 0) +
                (if (executeTools.asKnown().isPresent) 1 else 0) +
                (history.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (useKnowledgeBase.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                message == other.message &&
                executeTools == other.executeTools &&
                history == other.history &&
                useKnowledgeBase == other.useKnowledgeBase &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(message, executeTools, history, useKnowledgeBase, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{message=$message, executeTools=$executeTools, history=$history, useKnowledgeBase=$useKnowledgeBase, additionalProperties=$additionalProperties}"
    }

    class History
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val content: JsonField<String>,
        private val role: JsonField<Role>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
        ) : this(content, role, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): String = content.getRequired("content")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun role(): Role = role.getRequired("role")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

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
             * Returns a mutable builder for constructing an instance of [History].
             *
             * The following fields are required:
             * ```java
             * .content()
             * .role()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [History]. */
        class Builder internal constructor() {

            private var content: JsonField<String>? = null
            private var role: JsonField<Role>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(history: History) = apply {
                content = history.content
                role = history.role
                additionalProperties = history.additionalProperties.toMutableMap()
            }

            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            fun role(role: Role) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [Role] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<Role>) = apply { this.role = role }

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
             * Returns an immutable instance of [History].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .content()
             * .role()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): History =
                History(
                    checkRequired("content", content),
                    checkRequired("role", role),
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
        fun validate(): History = apply {
            if (validated) {
                return@apply
            }

            content()
            role().validate()
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
            (if (content.asKnown().isPresent) 1 else 0) +
                (role.asKnown().getOrNull()?.validity() ?: 0)

        class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val USER = of("user")

                @JvmField val ASSISTANT = of("assistant")

                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
            }

            /** An enum containing [Role]'s known values. */
            enum class Known {
                USER,
                ASSISTANT,
            }

            /**
             * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Role] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USER,
                ASSISTANT,
                /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                    USER -> Value.USER
                    ASSISTANT -> Value.ASSISTANT
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
                    USER -> Known.USER
                    ASSISTANT -> Known.ASSISTANT
                    else -> throw ZavudevInvalidDataException("Unknown Role: $value")
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

            return other is History &&
                content == other.content &&
                role == other.role &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(content, role, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "History{content=$content, role=$role, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentTestParams &&
            agentId == other.agentId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(agentId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentTestParams{agentId=$agentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
