// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent

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

/** Update an AI agent's configuration. */
class AgentUpdateParams
private constructor(
    private val senderId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun senderId(): Optional<String> = Optional.ofNullable(senderId)

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = body.apiKey()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contextWindowMessages(): Optional<Long> = body.contextWindowMessages()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = body.enabled()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeContactMetadata(): Optional<Boolean> = body.includeContactMetadata()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Optional<Long> = body.maxTokens()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * LLM provider for the AI agent.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<AgentProvider> = body.provider()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = body.systemPrompt()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = body.temperature()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggerOnChannels(): Optional<List<String>> = body.triggerOnChannels()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggerOnMessageTypes(): Optional<List<String>> = body.triggerOnMessageTypes()

    /**
     * Voice Agent configuration. Patch this object to enable voice, change the greeting, or adjust
     * call limits. Requires the Voice Agents feature to be enabled for your team.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voice(): Optional<Voice> = body.voice()

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiKey(): JsonField<String> = body._apiKey()

    /**
     * Returns the raw JSON value of [contextWindowMessages].
     *
     * Unlike [contextWindowMessages], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _contextWindowMessages(): JsonField<Long> = body._contextWindowMessages()

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabled(): JsonField<Boolean> = body._enabled()

    /**
     * Returns the raw JSON value of [includeContactMetadata].
     *
     * Unlike [includeContactMetadata], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _includeContactMetadata(): JsonField<Boolean> = body._includeContactMetadata()

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTokens(): JsonField<Long> = body._maxTokens()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _provider(): JsonField<AgentProvider> = body._provider()

    /**
     * Returns the raw JSON value of [systemPrompt].
     *
     * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _systemPrompt(): JsonField<String> = body._systemPrompt()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

    /**
     * Returns the raw JSON value of [triggerOnChannels].
     *
     * Unlike [triggerOnChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _triggerOnChannels(): JsonField<List<String>> = body._triggerOnChannels()

    /**
     * Returns the raw JSON value of [triggerOnMessageTypes].
     *
     * Unlike [triggerOnMessageTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _triggerOnMessageTypes(): JsonField<List<String>> = body._triggerOnMessageTypes()

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voice(): JsonField<Voice> = body._voice()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AgentUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AgentUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentUpdateParams]. */
    class Builder internal constructor() {

        private var senderId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(agentUpdateParams: AgentUpdateParams) = apply {
            senderId = agentUpdateParams.senderId
            body = agentUpdateParams.body.toBuilder()
            additionalHeaders = agentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = agentUpdateParams.additionalQueryParams.toBuilder()
        }

        fun senderId(senderId: String?) = apply { this.senderId = senderId }

        /** Alias for calling [Builder.senderId] with `senderId.orElse(null)`. */
        fun senderId(senderId: Optional<String>) = senderId(senderId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [apiKey]
         * - [contextWindowMessages]
         * - [enabled]
         * - [includeContactMetadata]
         * - [maxTokens]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun apiKey(apiKey: String) = apply { body.apiKey(apiKey) }

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { body.apiKey(apiKey) }

        fun contextWindowMessages(contextWindowMessages: Long) = apply {
            body.contextWindowMessages(contextWindowMessages)
        }

        /**
         * Sets [Builder.contextWindowMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contextWindowMessages] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contextWindowMessages(contextWindowMessages: JsonField<Long>) = apply {
            body.contextWindowMessages(contextWindowMessages)
        }

        fun enabled(enabled: Boolean) = apply { body.enabled(enabled) }

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { body.enabled(enabled) }

        fun includeContactMetadata(includeContactMetadata: Boolean) = apply {
            body.includeContactMetadata(includeContactMetadata)
        }

        /**
         * Sets [Builder.includeContactMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeContactMetadata] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includeContactMetadata(includeContactMetadata: JsonField<Boolean>) = apply {
            body.includeContactMetadata(includeContactMetadata)
        }

        fun maxTokens(maxTokens: Long?) = apply { body.maxTokens(maxTokens) }

        /**
         * Alias for [Builder.maxTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTokens(maxTokens: Long) = maxTokens(maxTokens as Long?)

        /** Alias for calling [Builder.maxTokens] with `maxTokens.orElse(null)`. */
        fun maxTokens(maxTokens: Optional<Long>) = maxTokens(maxTokens.getOrNull())

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { body.maxTokens(maxTokens) }

        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** LLM provider for the AI agent. */
        fun provider(provider: AgentProvider) = apply { body.provider(provider) }

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [AgentProvider] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun provider(provider: JsonField<AgentProvider>) = apply { body.provider(provider) }

        fun systemPrompt(systemPrompt: String) = apply { body.systemPrompt(systemPrompt) }

        /**
         * Sets [Builder.systemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemPrompt(systemPrompt: JsonField<String>) = apply {
            body.systemPrompt(systemPrompt)
        }

        fun temperature(temperature: Double?) = apply { body.temperature(temperature) }

        /**
         * Alias for [Builder.temperature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun temperature(temperature: Double) = temperature(temperature as Double?)

        /** Alias for calling [Builder.temperature] with `temperature.orElse(null)`. */
        fun temperature(temperature: Optional<Double>) = temperature(temperature.getOrNull())

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { body.temperature(temperature) }

        fun triggerOnChannels(triggerOnChannels: List<String>) = apply {
            body.triggerOnChannels(triggerOnChannels)
        }

        /**
         * Sets [Builder.triggerOnChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggerOnChannels] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun triggerOnChannels(triggerOnChannels: JsonField<List<String>>) = apply {
            body.triggerOnChannels(triggerOnChannels)
        }

        /**
         * Adds a single [String] to [triggerOnChannels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTriggerOnChannel(triggerOnChannel: String) = apply {
            body.addTriggerOnChannel(triggerOnChannel)
        }

        fun triggerOnMessageTypes(triggerOnMessageTypes: List<String>) = apply {
            body.triggerOnMessageTypes(triggerOnMessageTypes)
        }

        /**
         * Sets [Builder.triggerOnMessageTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggerOnMessageTypes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun triggerOnMessageTypes(triggerOnMessageTypes: JsonField<List<String>>) = apply {
            body.triggerOnMessageTypes(triggerOnMessageTypes)
        }

        /**
         * Adds a single [String] to [triggerOnMessageTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTriggerOnMessageType(triggerOnMessageType: String) = apply {
            body.addTriggerOnMessageType(triggerOnMessageType)
        }

        /**
         * Voice Agent configuration. Patch this object to enable voice, change the greeting, or
         * adjust call limits. Requires the Voice Agents feature to be enabled for your team.
         */
        fun voice(voice: Voice) = apply { body.voice(voice) }

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [Voice] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<Voice>) = apply { body.voice(voice) }

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
         * Returns an immutable instance of [AgentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentUpdateParams =
            AgentUpdateParams(
                senderId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> senderId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiKey: JsonField<String>,
        private val contextWindowMessages: JsonField<Long>,
        private val enabled: JsonField<Boolean>,
        private val includeContactMetadata: JsonField<Boolean>,
        private val maxTokens: JsonField<Long>,
        private val model: JsonField<String>,
        private val name: JsonField<String>,
        private val provider: JsonField<AgentProvider>,
        private val systemPrompt: JsonField<String>,
        private val temperature: JsonField<Double>,
        private val triggerOnChannels: JsonField<List<String>>,
        private val triggerOnMessageTypes: JsonField<List<String>>,
        private val voice: JsonField<Voice>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contextWindowMessages")
            @ExcludeMissing
            contextWindowMessages: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("includeContactMetadata")
            @ExcludeMissing
            includeContactMetadata: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("maxTokens")
            @ExcludeMissing
            maxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<AgentProvider> = JsonMissing.of(),
            @JsonProperty("systemPrompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("triggerOnChannels")
            @ExcludeMissing
            triggerOnChannels: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("triggerOnMessageTypes")
            @ExcludeMissing
            triggerOnMessageTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<Voice> = JsonMissing.of(),
        ) : this(
            apiKey,
            contextWindowMessages,
            enabled,
            includeContactMetadata,
            maxTokens,
            model,
            name,
            provider,
            systemPrompt,
            temperature,
            triggerOnChannels,
            triggerOnMessageTypes,
            voice,
            mutableMapOf(),
        )

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = apiKey.getOptional("apiKey")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contextWindowMessages(): Optional<Long> =
            contextWindowMessages.getOptional("contextWindowMessages")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeContactMetadata(): Optional<Boolean> =
            includeContactMetadata.getOptional("includeContactMetadata")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxTokens(): Optional<Long> = maxTokens.getOptional("maxTokens")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * LLM provider for the AI agent.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<AgentProvider> = provider.getOptional("provider")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun systemPrompt(): Optional<String> = systemPrompt.getOptional("systemPrompt")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun temperature(): Optional<Double> = temperature.getOptional("temperature")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun triggerOnChannels(): Optional<List<String>> =
            triggerOnChannels.getOptional("triggerOnChannels")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun triggerOnMessageTypes(): Optional<List<String>> =
            triggerOnMessageTypes.getOptional("triggerOnMessageTypes")

        /**
         * Voice Agent configuration. Patch this object to enable voice, change the greeting, or
         * adjust call limits. Requires the Voice Agents feature to be enabled for your team.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<Voice> = voice.getOptional("voice")

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apiKey") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

        /**
         * Returns the raw JSON value of [contextWindowMessages].
         *
         * Unlike [contextWindowMessages], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("contextWindowMessages")
        @ExcludeMissing
        fun _contextWindowMessages(): JsonField<Long> = contextWindowMessages

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [includeContactMetadata].
         *
         * Unlike [includeContactMetadata], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("includeContactMetadata")
        @ExcludeMissing
        fun _includeContactMetadata(): JsonField<Boolean> = includeContactMetadata

        /**
         * Returns the raw JSON value of [maxTokens].
         *
         * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxTokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider")
        @ExcludeMissing
        fun _provider(): JsonField<AgentProvider> = provider

        /**
         * Returns the raw JSON value of [systemPrompt].
         *
         * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("systemPrompt")
        @ExcludeMissing
        fun _systemPrompt(): JsonField<String> = systemPrompt

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

        /**
         * Returns the raw JSON value of [triggerOnChannels].
         *
         * Unlike [triggerOnChannels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("triggerOnChannels")
        @ExcludeMissing
        fun _triggerOnChannels(): JsonField<List<String>> = triggerOnChannels

        /**
         * Returns the raw JSON value of [triggerOnMessageTypes].
         *
         * Unlike [triggerOnMessageTypes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("triggerOnMessageTypes")
        @ExcludeMissing
        fun _triggerOnMessageTypes(): JsonField<List<String>> = triggerOnMessageTypes

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<Voice> = voice

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var apiKey: JsonField<String> = JsonMissing.of()
            private var contextWindowMessages: JsonField<Long> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var includeContactMetadata: JsonField<Boolean> = JsonMissing.of()
            private var maxTokens: JsonField<Long> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var provider: JsonField<AgentProvider> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var triggerOnChannels: JsonField<MutableList<String>>? = null
            private var triggerOnMessageTypes: JsonField<MutableList<String>>? = null
            private var voice: JsonField<Voice> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                apiKey = body.apiKey
                contextWindowMessages = body.contextWindowMessages
                enabled = body.enabled
                includeContactMetadata = body.includeContactMetadata
                maxTokens = body.maxTokens
                model = body.model
                name = body.name
                provider = body.provider
                systemPrompt = body.systemPrompt
                temperature = body.temperature
                triggerOnChannels = body.triggerOnChannels.map { it.toMutableList() }
                triggerOnMessageTypes = body.triggerOnMessageTypes.map { it.toMutableList() }
                voice = body.voice
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            fun contextWindowMessages(contextWindowMessages: Long) =
                contextWindowMessages(JsonField.of(contextWindowMessages))

            /**
             * Sets [Builder.contextWindowMessages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextWindowMessages] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun contextWindowMessages(contextWindowMessages: JsonField<Long>) = apply {
                this.contextWindowMessages = contextWindowMessages
            }

            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            fun includeContactMetadata(includeContactMetadata: Boolean) =
                includeContactMetadata(JsonField.of(includeContactMetadata))

            /**
             * Sets [Builder.includeContactMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeContactMetadata] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeContactMetadata(includeContactMetadata: JsonField<Boolean>) = apply {
                this.includeContactMetadata = includeContactMetadata
            }

            fun maxTokens(maxTokens: Long?) = maxTokens(JsonField.ofNullable(maxTokens))

            /**
             * Alias for [Builder.maxTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxTokens(maxTokens: Long) = maxTokens(maxTokens as Long?)

            /** Alias for calling [Builder.maxTokens] with `maxTokens.orElse(null)`. */
            fun maxTokens(maxTokens: Optional<Long>) = maxTokens(maxTokens.getOrNull())

            /**
             * Sets [Builder.maxTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** LLM provider for the AI agent. */
            fun provider(provider: AgentProvider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [AgentProvider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<AgentProvider>) = apply { this.provider = provider }

            fun systemPrompt(systemPrompt: String) = systemPrompt(JsonField.of(systemPrompt))

            /**
             * Sets [Builder.systemPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun systemPrompt(systemPrompt: JsonField<String>) = apply {
                this.systemPrompt = systemPrompt
            }

            fun temperature(temperature: Double?) = temperature(JsonField.ofNullable(temperature))

            /**
             * Alias for [Builder.temperature].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun temperature(temperature: Double) = temperature(temperature as Double?)

            /** Alias for calling [Builder.temperature] with `temperature.orElse(null)`. */
            fun temperature(temperature: Optional<Double>) = temperature(temperature.getOrNull())

            /**
             * Sets [Builder.temperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temperature] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temperature(temperature: JsonField<Double>) = apply {
                this.temperature = temperature
            }

            fun triggerOnChannels(triggerOnChannels: List<String>) =
                triggerOnChannels(JsonField.of(triggerOnChannels))

            /**
             * Sets [Builder.triggerOnChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggerOnChannels] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun triggerOnChannels(triggerOnChannels: JsonField<List<String>>) = apply {
                this.triggerOnChannels = triggerOnChannels.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [triggerOnChannels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTriggerOnChannel(triggerOnChannel: String) = apply {
                triggerOnChannels =
                    (triggerOnChannels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("triggerOnChannels", it).add(triggerOnChannel)
                    }
            }

            fun triggerOnMessageTypes(triggerOnMessageTypes: List<String>) =
                triggerOnMessageTypes(JsonField.of(triggerOnMessageTypes))

            /**
             * Sets [Builder.triggerOnMessageTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggerOnMessageTypes] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun triggerOnMessageTypes(triggerOnMessageTypes: JsonField<List<String>>) = apply {
                this.triggerOnMessageTypes = triggerOnMessageTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [triggerOnMessageTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTriggerOnMessageType(triggerOnMessageType: String) = apply {
                triggerOnMessageTypes =
                    (triggerOnMessageTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("triggerOnMessageTypes", it).add(triggerOnMessageType)
                    }
            }

            /**
             * Voice Agent configuration. Patch this object to enable voice, change the greeting, or
             * adjust call limits. Requires the Voice Agents feature to be enabled for your team.
             */
            fun voice(voice: Voice) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [Voice] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun voice(voice: JsonField<Voice>) = apply { this.voice = voice }

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
             */
            fun build(): Body =
                Body(
                    apiKey,
                    contextWindowMessages,
                    enabled,
                    includeContactMetadata,
                    maxTokens,
                    model,
                    name,
                    provider,
                    systemPrompt,
                    temperature,
                    (triggerOnChannels ?: JsonMissing.of()).map { it.toImmutable() },
                    (triggerOnMessageTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    voice,
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

            apiKey()
            contextWindowMessages()
            enabled()
            includeContactMetadata()
            maxTokens()
            model()
            name()
            provider().ifPresent { it.validate() }
            systemPrompt()
            temperature()
            triggerOnChannels()
            triggerOnMessageTypes()
            voice().ifPresent { it.validate() }
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
            (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (contextWindowMessages.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (includeContactMetadata.asKnown().isPresent) 1 else 0) +
                (if (maxTokens.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0) +
                (if (temperature.asKnown().isPresent) 1 else 0) +
                (triggerOnChannels.asKnown().getOrNull()?.size ?: 0) +
                (triggerOnMessageTypes.asKnown().getOrNull()?.size ?: 0) +
                (voice.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                apiKey == other.apiKey &&
                contextWindowMessages == other.contextWindowMessages &&
                enabled == other.enabled &&
                includeContactMetadata == other.includeContactMetadata &&
                maxTokens == other.maxTokens &&
                model == other.model &&
                name == other.name &&
                provider == other.provider &&
                systemPrompt == other.systemPrompt &&
                temperature == other.temperature &&
                triggerOnChannels == other.triggerOnChannels &&
                triggerOnMessageTypes == other.triggerOnMessageTypes &&
                voice == other.voice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                apiKey,
                contextWindowMessages,
                enabled,
                includeContactMetadata,
                maxTokens,
                model,
                name,
                provider,
                systemPrompt,
                temperature,
                triggerOnChannels,
                triggerOnMessageTypes,
                voice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{apiKey=$apiKey, contextWindowMessages=$contextWindowMessages, enabled=$enabled, includeContactMetadata=$includeContactMetadata, maxTokens=$maxTokens, model=$model, name=$name, provider=$provider, systemPrompt=$systemPrompt, temperature=$temperature, triggerOnChannels=$triggerOnChannels, triggerOnMessageTypes=$triggerOnMessageTypes, voice=$voice, additionalProperties=$additionalProperties}"
    }

    /**
     * Voice Agent configuration. Patch this object to enable voice, change the greeting, or adjust
     * call limits. Requires the Voice Agents feature to be enabled for your team.
     */
    class Voice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enabled: JsonField<Boolean>,
        private val greeting: JsonField<String>,
        private val greetings: JsonField<Greetings>,
        private val interruptible: JsonField<Boolean>,
        private val language: JsonField<String>,
        private val maxCallDurationMinutes: JsonField<Long>,
        private val maxIdleSeconds: JsonField<Long>,
        private val model: JsonField<String>,
        private val recordCalls: JsonField<Boolean>,
        private val sttModel: JsonField<String>,
        private val sttProvider: JsonField<String>,
        private val transferPhoneNumber: JsonField<String>,
        private val ttsProvider: JsonField<String>,
        private val ttsVoiceId: JsonField<String>,
        private val voicemailAction: JsonField<VoicemailAction>,
        private val voicemailMessage: JsonField<String>,
        private val voiceSpeed: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("greeting")
            @ExcludeMissing
            greeting: JsonField<String> = JsonMissing.of(),
            @JsonProperty("greetings")
            @ExcludeMissing
            greetings: JsonField<Greetings> = JsonMissing.of(),
            @JsonProperty("interruptible")
            @ExcludeMissing
            interruptible: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maxCallDurationMinutes")
            @ExcludeMissing
            maxCallDurationMinutes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("maxIdleSeconds")
            @ExcludeMissing
            maxIdleSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recordCalls")
            @ExcludeMissing
            recordCalls: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sttModel")
            @ExcludeMissing
            sttModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sttProvider")
            @ExcludeMissing
            sttProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transferPhoneNumber")
            @ExcludeMissing
            transferPhoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ttsProvider")
            @ExcludeMissing
            ttsProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ttsVoiceId")
            @ExcludeMissing
            ttsVoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voicemailAction")
            @ExcludeMissing
            voicemailAction: JsonField<VoicemailAction> = JsonMissing.of(),
            @JsonProperty("voicemailMessage")
            @ExcludeMissing
            voicemailMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voiceSpeed")
            @ExcludeMissing
            voiceSpeed: JsonField<Double> = JsonMissing.of(),
        ) : this(
            enabled,
            greeting,
            greetings,
            interruptible,
            language,
            maxCallDurationMinutes,
            maxIdleSeconds,
            model,
            recordCalls,
            sttModel,
            sttProvider,
            transferPhoneNumber,
            ttsProvider,
            ttsVoiceId,
            voicemailAction,
            voicemailMessage,
            voiceSpeed,
            mutableMapOf(),
        )

        /**
         * Whether the agent handles voice calls. When false, the sender's number is not answered by
         * the voice agent and outbound calls are rejected.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enabled(): Boolean = enabled.getRequired("enabled")

        /**
         * Opening line the agent speaks when the call connects. If omitted, the agent waits for the
         * caller to speak first.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greeting(): Optional<String> = greeting.getOptional("greeting")

        /**
         * Greeting per language, keyed by language code. Used when the caller's language differs
         * from the one `greeting` is written in.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun greetings(): Optional<Greetings> = greetings.getOptional("greetings")

        /**
         * Whether the caller can interrupt the agent while it is speaking (barge-in). When true,
         * the agent stops talking as soon as the caller starts.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptible(): Optional<Boolean> = interruptible.getOptional("interruptible")

        /**
         * BCP-47 language code used for both speech recognition and speech synthesis (e.g. `en`,
         * `es`, `pt-BR`). Auto-detected from the recipient when omitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Hard limit on call length in minutes. The call ends automatically when reached.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxCallDurationMinutes(): Optional<Long> =
            maxCallDurationMinutes.getOptional("maxCallDurationMinutes")

        /**
         * How long the agent waits during silence before ending the call.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxIdleSeconds(): Optional<Long> = maxIdleSeconds.getOptional("maxIdleSeconds")

        /**
         * Model that runs the conversation, co-located in the voice network for lowest latency.
         * Independent of the model used for text messaging. Derived from the agent's text model
         * when omitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Whether the call audio is recorded.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordCalls(): Optional<Boolean> = recordCalls.getOptional("recordCalls")

        /**
         * Speech-recognition model. Uses the default when omitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sttModel(): Optional<String> = sttModel.getOptional("sttModel")

        /**
         * Speech-recognition provider. Uses the default when omitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sttProvider(): Optional<String> = sttProvider.getOptional("sttProvider")

        /**
         * E.164 phone number the agent can transfer the call to. When set, the agent is given a
         * transfer tool it can use to hand the call to a human.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferPhoneNumber(): Optional<String> =
            transferPhoneNumber.getOptional("transferPhoneNumber")

        /**
         * Speech-synthesis provider. Uses the default when omitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ttsProvider(): Optional<String> = ttsProvider.getOptional("ttsProvider")

        /**
         * Identifier of the synthesized voice that speaks. Choose from the voices available in the
         * dashboard. Uses a neutral default when omitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ttsVoiceId(): Optional<String> = ttsVoiceId.getOptional("ttsVoiceId")

        /**
         * What the agent does when an answering machine or voicemail is detected on an outbound
         * call.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voicemailAction(): Optional<VoicemailAction> =
            voicemailAction.getOptional("voicemailAction")

        /**
         * Message spoken when `voicemailAction` is `leave_message`. Falls back to `greeting` when
         * omitted.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voicemailMessage(): Optional<String> = voicemailMessage.getOptional("voicemailMessage")

        /**
         * Speech rate. 1.0 is natural. Only honoured by voices that support rate control; ignored
         * by the others.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceSpeed(): Optional<Double> = voiceSpeed.getOptional("voiceSpeed")

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [greeting].
         *
         * Unlike [greeting], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("greeting") @ExcludeMissing fun _greeting(): JsonField<String> = greeting

        /**
         * Returns the raw JSON value of [greetings].
         *
         * Unlike [greetings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("greetings")
        @ExcludeMissing
        fun _greetings(): JsonField<Greetings> = greetings

        /**
         * Returns the raw JSON value of [interruptible].
         *
         * Unlike [interruptible], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interruptible")
        @ExcludeMissing
        fun _interruptible(): JsonField<Boolean> = interruptible

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [maxCallDurationMinutes].
         *
         * Unlike [maxCallDurationMinutes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maxCallDurationMinutes")
        @ExcludeMissing
        fun _maxCallDurationMinutes(): JsonField<Long> = maxCallDurationMinutes

        /**
         * Returns the raw JSON value of [maxIdleSeconds].
         *
         * Unlike [maxIdleSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maxIdleSeconds")
        @ExcludeMissing
        fun _maxIdleSeconds(): JsonField<Long> = maxIdleSeconds

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [recordCalls].
         *
         * Unlike [recordCalls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recordCalls")
        @ExcludeMissing
        fun _recordCalls(): JsonField<Boolean> = recordCalls

        /**
         * Returns the raw JSON value of [sttModel].
         *
         * Unlike [sttModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sttModel") @ExcludeMissing fun _sttModel(): JsonField<String> = sttModel

        /**
         * Returns the raw JSON value of [sttProvider].
         *
         * Unlike [sttProvider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sttProvider")
        @ExcludeMissing
        fun _sttProvider(): JsonField<String> = sttProvider

        /**
         * Returns the raw JSON value of [transferPhoneNumber].
         *
         * Unlike [transferPhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transferPhoneNumber")
        @ExcludeMissing
        fun _transferPhoneNumber(): JsonField<String> = transferPhoneNumber

        /**
         * Returns the raw JSON value of [ttsProvider].
         *
         * Unlike [ttsProvider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ttsProvider")
        @ExcludeMissing
        fun _ttsProvider(): JsonField<String> = ttsProvider

        /**
         * Returns the raw JSON value of [ttsVoiceId].
         *
         * Unlike [ttsVoiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ttsVoiceId")
        @ExcludeMissing
        fun _ttsVoiceId(): JsonField<String> = ttsVoiceId

        /**
         * Returns the raw JSON value of [voicemailAction].
         *
         * Unlike [voicemailAction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voicemailAction")
        @ExcludeMissing
        fun _voicemailAction(): JsonField<VoicemailAction> = voicemailAction

        /**
         * Returns the raw JSON value of [voicemailMessage].
         *
         * Unlike [voicemailMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voicemailMessage")
        @ExcludeMissing
        fun _voicemailMessage(): JsonField<String> = voicemailMessage

        /**
         * Returns the raw JSON value of [voiceSpeed].
         *
         * Unlike [voiceSpeed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voiceSpeed")
        @ExcludeMissing
        fun _voiceSpeed(): JsonField<Double> = voiceSpeed

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
             * Returns a mutable builder for constructing an instance of [Voice].
             *
             * The following fields are required:
             * ```java
             * .enabled()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Voice]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean>? = null
            private var greeting: JsonField<String> = JsonMissing.of()
            private var greetings: JsonField<Greetings> = JsonMissing.of()
            private var interruptible: JsonField<Boolean> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var maxCallDurationMinutes: JsonField<Long> = JsonMissing.of()
            private var maxIdleSeconds: JsonField<Long> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var recordCalls: JsonField<Boolean> = JsonMissing.of()
            private var sttModel: JsonField<String> = JsonMissing.of()
            private var sttProvider: JsonField<String> = JsonMissing.of()
            private var transferPhoneNumber: JsonField<String> = JsonMissing.of()
            private var ttsProvider: JsonField<String> = JsonMissing.of()
            private var ttsVoiceId: JsonField<String> = JsonMissing.of()
            private var voicemailAction: JsonField<VoicemailAction> = JsonMissing.of()
            private var voicemailMessage: JsonField<String> = JsonMissing.of()
            private var voiceSpeed: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voice: Voice) = apply {
                enabled = voice.enabled
                greeting = voice.greeting
                greetings = voice.greetings
                interruptible = voice.interruptible
                language = voice.language
                maxCallDurationMinutes = voice.maxCallDurationMinutes
                maxIdleSeconds = voice.maxIdleSeconds
                model = voice.model
                recordCalls = voice.recordCalls
                sttModel = voice.sttModel
                sttProvider = voice.sttProvider
                transferPhoneNumber = voice.transferPhoneNumber
                ttsProvider = voice.ttsProvider
                ttsVoiceId = voice.ttsVoiceId
                voicemailAction = voice.voicemailAction
                voicemailMessage = voice.voicemailMessage
                voiceSpeed = voice.voiceSpeed
                additionalProperties = voice.additionalProperties.toMutableMap()
            }

            /**
             * Whether the agent handles voice calls. When false, the sender's number is not
             * answered by the voice agent and outbound calls are rejected.
             */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /**
             * Opening line the agent speaks when the call connects. If omitted, the agent waits for
             * the caller to speak first.
             */
            fun greeting(greeting: String) = greeting(JsonField.of(greeting))

            /**
             * Sets [Builder.greeting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.greeting] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun greeting(greeting: JsonField<String>) = apply { this.greeting = greeting }

            /**
             * Greeting per language, keyed by language code. Used when the caller's language
             * differs from the one `greeting` is written in.
             */
            fun greetings(greetings: Greetings) = greetings(JsonField.of(greetings))

            /**
             * Sets [Builder.greetings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.greetings] with a well-typed [Greetings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun greetings(greetings: JsonField<Greetings>) = apply { this.greetings = greetings }

            /**
             * Whether the caller can interrupt the agent while it is speaking (barge-in). When
             * true, the agent stops talking as soon as the caller starts.
             */
            fun interruptible(interruptible: Boolean) = interruptible(JsonField.of(interruptible))

            /**
             * Sets [Builder.interruptible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptible] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interruptible(interruptible: JsonField<Boolean>) = apply {
                this.interruptible = interruptible
            }

            /**
             * BCP-47 language code used for both speech recognition and speech synthesis (e.g.
             * `en`, `es`, `pt-BR`). Auto-detected from the recipient when omitted.
             */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /** Hard limit on call length in minutes. The call ends automatically when reached. */
            fun maxCallDurationMinutes(maxCallDurationMinutes: Long) =
                maxCallDurationMinutes(JsonField.of(maxCallDurationMinutes))

            /**
             * Sets [Builder.maxCallDurationMinutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxCallDurationMinutes] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maxCallDurationMinutes(maxCallDurationMinutes: JsonField<Long>) = apply {
                this.maxCallDurationMinutes = maxCallDurationMinutes
            }

            /** How long the agent waits during silence before ending the call. */
            fun maxIdleSeconds(maxIdleSeconds: Long) = maxIdleSeconds(JsonField.of(maxIdleSeconds))

            /**
             * Sets [Builder.maxIdleSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxIdleSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxIdleSeconds(maxIdleSeconds: JsonField<Long>) = apply {
                this.maxIdleSeconds = maxIdleSeconds
            }

            /**
             * Model that runs the conversation, co-located in the voice network for lowest latency.
             * Independent of the model used for text messaging. Derived from the agent's text model
             * when omitted.
             */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Whether the call audio is recorded. */
            fun recordCalls(recordCalls: Boolean) = recordCalls(JsonField.of(recordCalls))

            /**
             * Sets [Builder.recordCalls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordCalls] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordCalls(recordCalls: JsonField<Boolean>) = apply {
                this.recordCalls = recordCalls
            }

            /** Speech-recognition model. Uses the default when omitted. */
            fun sttModel(sttModel: String) = sttModel(JsonField.of(sttModel))

            /**
             * Sets [Builder.sttModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sttModel] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sttModel(sttModel: JsonField<String>) = apply { this.sttModel = sttModel }

            /** Speech-recognition provider. Uses the default when omitted. */
            fun sttProvider(sttProvider: String) = sttProvider(JsonField.of(sttProvider))

            /**
             * Sets [Builder.sttProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sttProvider] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sttProvider(sttProvider: JsonField<String>) = apply {
                this.sttProvider = sttProvider
            }

            /**
             * E.164 phone number the agent can transfer the call to. When set, the agent is given a
             * transfer tool it can use to hand the call to a human.
             */
            fun transferPhoneNumber(transferPhoneNumber: String) =
                transferPhoneNumber(JsonField.of(transferPhoneNumber))

            /**
             * Sets [Builder.transferPhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferPhoneNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transferPhoneNumber(transferPhoneNumber: JsonField<String>) = apply {
                this.transferPhoneNumber = transferPhoneNumber
            }

            /** Speech-synthesis provider. Uses the default when omitted. */
            fun ttsProvider(ttsProvider: String) = ttsProvider(JsonField.of(ttsProvider))

            /**
             * Sets [Builder.ttsProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ttsProvider] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttsProvider(ttsProvider: JsonField<String>) = apply {
                this.ttsProvider = ttsProvider
            }

            /**
             * Identifier of the synthesized voice that speaks. Choose from the voices available in
             * the dashboard. Uses a neutral default when omitted.
             */
            fun ttsVoiceId(ttsVoiceId: String) = ttsVoiceId(JsonField.of(ttsVoiceId))

            /**
             * Sets [Builder.ttsVoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ttsVoiceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttsVoiceId(ttsVoiceId: JsonField<String>) = apply { this.ttsVoiceId = ttsVoiceId }

            /**
             * What the agent does when an answering machine or voicemail is detected on an outbound
             * call.
             */
            fun voicemailAction(voicemailAction: VoicemailAction) =
                voicemailAction(JsonField.of(voicemailAction))

            /**
             * Sets [Builder.voicemailAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voicemailAction] with a well-typed [VoicemailAction]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun voicemailAction(voicemailAction: JsonField<VoicemailAction>) = apply {
                this.voicemailAction = voicemailAction
            }

            /**
             * Message spoken when `voicemailAction` is `leave_message`. Falls back to `greeting`
             * when omitted.
             */
            fun voicemailMessage(voicemailMessage: String) =
                voicemailMessage(JsonField.of(voicemailMessage))

            /**
             * Sets [Builder.voicemailMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voicemailMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voicemailMessage(voicemailMessage: JsonField<String>) = apply {
                this.voicemailMessage = voicemailMessage
            }

            /**
             * Speech rate. 1.0 is natural. Only honoured by voices that support rate control;
             * ignored by the others.
             */
            fun voiceSpeed(voiceSpeed: Double) = voiceSpeed(JsonField.of(voiceSpeed))

            /**
             * Sets [Builder.voiceSpeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceSpeed] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceSpeed(voiceSpeed: JsonField<Double>) = apply { this.voiceSpeed = voiceSpeed }

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
             * Returns an immutable instance of [Voice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .enabled()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Voice =
                Voice(
                    checkRequired("enabled", enabled),
                    greeting,
                    greetings,
                    interruptible,
                    language,
                    maxCallDurationMinutes,
                    maxIdleSeconds,
                    model,
                    recordCalls,
                    sttModel,
                    sttProvider,
                    transferPhoneNumber,
                    ttsProvider,
                    ttsVoiceId,
                    voicemailAction,
                    voicemailMessage,
                    voiceSpeed,
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
        fun validate(): Voice = apply {
            if (validated) {
                return@apply
            }

            enabled()
            greeting()
            greetings().ifPresent { it.validate() }
            interruptible()
            language()
            maxCallDurationMinutes()
            maxIdleSeconds()
            model()
            recordCalls()
            sttModel()
            sttProvider()
            transferPhoneNumber()
            ttsProvider()
            ttsVoiceId()
            voicemailAction().ifPresent { it.validate() }
            voicemailMessage()
            voiceSpeed()
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
            (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (greeting.asKnown().isPresent) 1 else 0) +
                (greetings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (interruptible.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (maxCallDurationMinutes.asKnown().isPresent) 1 else 0) +
                (if (maxIdleSeconds.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (recordCalls.asKnown().isPresent) 1 else 0) +
                (if (sttModel.asKnown().isPresent) 1 else 0) +
                (if (sttProvider.asKnown().isPresent) 1 else 0) +
                (if (transferPhoneNumber.asKnown().isPresent) 1 else 0) +
                (if (ttsProvider.asKnown().isPresent) 1 else 0) +
                (if (ttsVoiceId.asKnown().isPresent) 1 else 0) +
                (voicemailAction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (voicemailMessage.asKnown().isPresent) 1 else 0) +
                (if (voiceSpeed.asKnown().isPresent) 1 else 0)

        /**
         * Greeting per language, keyed by language code. Used when the caller's language differs
         * from the one `greeting` is written in.
         */
        class Greetings
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

                /** Returns a mutable builder for constructing an instance of [Greetings]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Greetings]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(greetings: Greetings) = apply {
                    additionalProperties = greetings.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Greetings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Greetings = Greetings(additionalProperties.toImmutable())
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
            fun validate(): Greetings = apply {
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

                return other is Greetings && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Greetings{additionalProperties=$additionalProperties}"
        }

        /**
         * What the agent does when an answering machine or voicemail is detected on an outbound
         * call.
         */
        class VoicemailAction
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val HANGUP = of("hangup")

                @JvmField val LEAVE_MESSAGE = of("leave_message")

                @JvmStatic fun of(value: String) = VoicemailAction(JsonField.of(value))
            }

            /** An enum containing [VoicemailAction]'s known values. */
            enum class Known {
                HANGUP,
                LEAVE_MESSAGE,
            }

            /**
             * An enum containing [VoicemailAction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [VoicemailAction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HANGUP,
                LEAVE_MESSAGE,
                /**
                 * An enum member indicating that [VoicemailAction] was instantiated with an unknown
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
                    HANGUP -> Value.HANGUP
                    LEAVE_MESSAGE -> Value.LEAVE_MESSAGE
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
                    HANGUP -> Known.HANGUP
                    LEAVE_MESSAGE -> Known.LEAVE_MESSAGE
                    else -> throw ZavudevInvalidDataException("Unknown VoicemailAction: $value")
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
            fun validate(): VoicemailAction = apply {
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

                return other is VoicemailAction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Voice &&
                enabled == other.enabled &&
                greeting == other.greeting &&
                greetings == other.greetings &&
                interruptible == other.interruptible &&
                language == other.language &&
                maxCallDurationMinutes == other.maxCallDurationMinutes &&
                maxIdleSeconds == other.maxIdleSeconds &&
                model == other.model &&
                recordCalls == other.recordCalls &&
                sttModel == other.sttModel &&
                sttProvider == other.sttProvider &&
                transferPhoneNumber == other.transferPhoneNumber &&
                ttsProvider == other.ttsProvider &&
                ttsVoiceId == other.ttsVoiceId &&
                voicemailAction == other.voicemailAction &&
                voicemailMessage == other.voicemailMessage &&
                voiceSpeed == other.voiceSpeed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                enabled,
                greeting,
                greetings,
                interruptible,
                language,
                maxCallDurationMinutes,
                maxIdleSeconds,
                model,
                recordCalls,
                sttModel,
                sttProvider,
                transferPhoneNumber,
                ttsProvider,
                ttsVoiceId,
                voicemailAction,
                voicemailMessage,
                voiceSpeed,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Voice{enabled=$enabled, greeting=$greeting, greetings=$greetings, interruptible=$interruptible, language=$language, maxCallDurationMinutes=$maxCallDurationMinutes, maxIdleSeconds=$maxIdleSeconds, model=$model, recordCalls=$recordCalls, sttModel=$sttModel, sttProvider=$sttProvider, transferPhoneNumber=$transferPhoneNumber, ttsProvider=$ttsProvider, ttsVoiceId=$ttsVoiceId, voicemailAction=$voicemailAction, voicemailMessage=$voicemailMessage, voiceSpeed=$voiceSpeed, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentUpdateParams &&
            senderId == other.senderId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(senderId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AgentUpdateParams{senderId=$senderId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
