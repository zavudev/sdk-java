// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.Params
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a 10DLC campaign in draft status. Cannot update after submission. */
class CampaignUpdateParams
private constructor(
    private val campaignId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun campaignId(): Optional<String> = Optional.ofNullable(campaignId)

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun helpMessage(): Optional<String> = body.helpMessage()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageFlow(): Optional<String> = body.messageFlow()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optInKeywords(): Optional<List<String>> = body.optInKeywords()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optOutKeywords(): Optional<List<String>> = body.optOutKeywords()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sampleMessages(): Optional<List<String>> = body.sampleMessages()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [helpMessage].
     *
     * Unlike [helpMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _helpMessage(): JsonField<String> = body._helpMessage()

    /**
     * Returns the raw JSON value of [messageFlow].
     *
     * Unlike [messageFlow], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messageFlow(): JsonField<String> = body._messageFlow()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [optInKeywords].
     *
     * Unlike [optInKeywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _optInKeywords(): JsonField<List<String>> = body._optInKeywords()

    /**
     * Returns the raw JSON value of [optOutKeywords].
     *
     * Unlike [optOutKeywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _optOutKeywords(): JsonField<List<String>> = body._optOutKeywords()

    /**
     * Returns the raw JSON value of [sampleMessages].
     *
     * Unlike [sampleMessages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sampleMessages(): JsonField<List<String>> = body._sampleMessages()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CampaignUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CampaignUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignUpdateParams]. */
    class Builder internal constructor() {

        private var campaignId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignUpdateParams: CampaignUpdateParams) = apply {
            campaignId = campaignUpdateParams.campaignId
            body = campaignUpdateParams.body.toBuilder()
            additionalHeaders = campaignUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignUpdateParams.additionalQueryParams.toBuilder()
        }

        fun campaignId(campaignId: String?) = apply { this.campaignId = campaignId }

        /** Alias for calling [Builder.campaignId] with `campaignId.orElse(null)`. */
        fun campaignId(campaignId: Optional<String>) = campaignId(campaignId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [helpMessage]
         * - [messageFlow]
         * - [name]
         * - [optInKeywords]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun helpMessage(helpMessage: String) = apply { body.helpMessage(helpMessage) }

        /**
         * Sets [Builder.helpMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun helpMessage(helpMessage: JsonField<String>) = apply { body.helpMessage(helpMessage) }

        fun messageFlow(messageFlow: String) = apply { body.messageFlow(messageFlow) }

        /**
         * Sets [Builder.messageFlow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageFlow] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageFlow(messageFlow: JsonField<String>) = apply { body.messageFlow(messageFlow) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun optInKeywords(optInKeywords: List<String>) = apply { body.optInKeywords(optInKeywords) }

        /**
         * Sets [Builder.optInKeywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optInKeywords] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optInKeywords(optInKeywords: JsonField<List<String>>) = apply {
            body.optInKeywords(optInKeywords)
        }

        /**
         * Adds a single [String] to [optInKeywords].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOptInKeyword(optInKeyword: String) = apply { body.addOptInKeyword(optInKeyword) }

        fun optOutKeywords(optOutKeywords: List<String>) = apply {
            body.optOutKeywords(optOutKeywords)
        }

        /**
         * Sets [Builder.optOutKeywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optOutKeywords] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optOutKeywords(optOutKeywords: JsonField<List<String>>) = apply {
            body.optOutKeywords(optOutKeywords)
        }

        /**
         * Adds a single [String] to [optOutKeywords].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOptOutKeyword(optOutKeyword: String) = apply { body.addOptOutKeyword(optOutKeyword) }

        fun sampleMessages(sampleMessages: List<String>) = apply {
            body.sampleMessages(sampleMessages)
        }

        /**
         * Sets [Builder.sampleMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sampleMessages] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sampleMessages(sampleMessages: JsonField<List<String>>) = apply {
            body.sampleMessages(sampleMessages)
        }

        /**
         * Adds a single [String] to [sampleMessages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSampleMessage(sampleMessage: String) = apply { body.addSampleMessage(sampleMessage) }

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
         * Returns an immutable instance of [CampaignUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CampaignUpdateParams =
            CampaignUpdateParams(
                campaignId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> campaignId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val helpMessage: JsonField<String>,
        private val messageFlow: JsonField<String>,
        private val name: JsonField<String>,
        private val optInKeywords: JsonField<List<String>>,
        private val optOutKeywords: JsonField<List<String>>,
        private val sampleMessages: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("helpMessage")
            @ExcludeMissing
            helpMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("messageFlow")
            @ExcludeMissing
            messageFlow: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optInKeywords")
            @ExcludeMissing
            optInKeywords: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("optOutKeywords")
            @ExcludeMissing
            optOutKeywords: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("sampleMessages")
            @ExcludeMissing
            sampleMessages: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            description,
            helpMessage,
            messageFlow,
            name,
            optInKeywords,
            optOutKeywords,
            sampleMessages,
            mutableMapOf(),
        )

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun helpMessage(): Optional<String> = helpMessage.getOptional("helpMessage")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageFlow(): Optional<String> = messageFlow.getOptional("messageFlow")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optInKeywords(): Optional<List<String>> = optInKeywords.getOptional("optInKeywords")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun optOutKeywords(): Optional<List<String>> = optOutKeywords.getOptional("optOutKeywords")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sampleMessages(): Optional<List<String>> = sampleMessages.getOptional("sampleMessages")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [helpMessage].
         *
         * Unlike [helpMessage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("helpMessage")
        @ExcludeMissing
        fun _helpMessage(): JsonField<String> = helpMessage

        /**
         * Returns the raw JSON value of [messageFlow].
         *
         * Unlike [messageFlow], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messageFlow")
        @ExcludeMissing
        fun _messageFlow(): JsonField<String> = messageFlow

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [optInKeywords].
         *
         * Unlike [optInKeywords], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("optInKeywords")
        @ExcludeMissing
        fun _optInKeywords(): JsonField<List<String>> = optInKeywords

        /**
         * Returns the raw JSON value of [optOutKeywords].
         *
         * Unlike [optOutKeywords], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("optOutKeywords")
        @ExcludeMissing
        fun _optOutKeywords(): JsonField<List<String>> = optOutKeywords

        /**
         * Returns the raw JSON value of [sampleMessages].
         *
         * Unlike [sampleMessages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampleMessages")
        @ExcludeMissing
        fun _sampleMessages(): JsonField<List<String>> = sampleMessages

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

            private var description: JsonField<String> = JsonMissing.of()
            private var helpMessage: JsonField<String> = JsonMissing.of()
            private var messageFlow: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var optInKeywords: JsonField<MutableList<String>>? = null
            private var optOutKeywords: JsonField<MutableList<String>>? = null
            private var sampleMessages: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                helpMessage = body.helpMessage
                messageFlow = body.messageFlow
                name = body.name
                optInKeywords = body.optInKeywords.map { it.toMutableList() }
                optOutKeywords = body.optOutKeywords.map { it.toMutableList() }
                sampleMessages = body.sampleMessages.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun helpMessage(helpMessage: String) = helpMessage(JsonField.of(helpMessage))

            /**
             * Sets [Builder.helpMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.helpMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun helpMessage(helpMessage: JsonField<String>) = apply {
                this.helpMessage = helpMessage
            }

            fun messageFlow(messageFlow: String) = messageFlow(JsonField.of(messageFlow))

            /**
             * Sets [Builder.messageFlow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageFlow] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageFlow(messageFlow: JsonField<String>) = apply {
                this.messageFlow = messageFlow
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

            fun optInKeywords(optInKeywords: List<String>) =
                optInKeywords(JsonField.of(optInKeywords))

            /**
             * Sets [Builder.optInKeywords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optInKeywords] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun optInKeywords(optInKeywords: JsonField<List<String>>) = apply {
                this.optInKeywords = optInKeywords.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [optInKeywords].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOptInKeyword(optInKeyword: String) = apply {
                optInKeywords =
                    (optInKeywords ?: JsonField.of(mutableListOf())).also {
                        checkKnown("optInKeywords", it).add(optInKeyword)
                    }
            }

            fun optOutKeywords(optOutKeywords: List<String>) =
                optOutKeywords(JsonField.of(optOutKeywords))

            /**
             * Sets [Builder.optOutKeywords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optOutKeywords] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun optOutKeywords(optOutKeywords: JsonField<List<String>>) = apply {
                this.optOutKeywords = optOutKeywords.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [optOutKeywords].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOptOutKeyword(optOutKeyword: String) = apply {
                optOutKeywords =
                    (optOutKeywords ?: JsonField.of(mutableListOf())).also {
                        checkKnown("optOutKeywords", it).add(optOutKeyword)
                    }
            }

            fun sampleMessages(sampleMessages: List<String>) =
                sampleMessages(JsonField.of(sampleMessages))

            /**
             * Sets [Builder.sampleMessages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sampleMessages] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sampleMessages(sampleMessages: JsonField<List<String>>) = apply {
                this.sampleMessages = sampleMessages.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [sampleMessages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSampleMessage(sampleMessage: String) = apply {
                sampleMessages =
                    (sampleMessages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sampleMessages", it).add(sampleMessage)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    description,
                    helpMessage,
                    messageFlow,
                    name,
                    (optInKeywords ?: JsonMissing.of()).map { it.toImmutable() },
                    (optOutKeywords ?: JsonMissing.of()).map { it.toImmutable() },
                    (sampleMessages ?: JsonMissing.of()).map { it.toImmutable() },
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

            description()
            helpMessage()
            messageFlow()
            name()
            optInKeywords()
            optOutKeywords()
            sampleMessages()
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
            (if (description.asKnown().isPresent) 1 else 0) +
                (if (helpMessage.asKnown().isPresent) 1 else 0) +
                (if (messageFlow.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (optInKeywords.asKnown().getOrNull()?.size ?: 0) +
                (optOutKeywords.asKnown().getOrNull()?.size ?: 0) +
                (sampleMessages.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                description == other.description &&
                helpMessage == other.helpMessage &&
                messageFlow == other.messageFlow &&
                name == other.name &&
                optInKeywords == other.optInKeywords &&
                optOutKeywords == other.optOutKeywords &&
                sampleMessages == other.sampleMessages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                helpMessage,
                messageFlow,
                name,
                optInKeywords,
                optOutKeywords,
                sampleMessages,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, helpMessage=$helpMessage, messageFlow=$messageFlow, name=$name, optInKeywords=$optInKeywords, optOutKeywords=$optOutKeywords, sampleMessages=$sampleMessages, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignUpdateParams &&
            campaignId == other.campaignId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(campaignId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CampaignUpdateParams{campaignId=$campaignId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
