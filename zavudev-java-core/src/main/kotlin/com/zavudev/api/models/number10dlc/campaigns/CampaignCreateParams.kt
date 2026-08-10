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
 * Create a 10DLC campaign under an existing brand. The campaign starts in draft status. Submit it
 * for carrier review using the submit endpoint.
 */
class CampaignCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun affiliateMarketing(): Boolean = body.affiliateMarketing()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ageGated(): Boolean = body.ageGated()

    /**
     * ID of the brand to create this campaign under.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = body.brandId()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = body.description()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun directLending(): Boolean = body.directLending()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddedLink(): Boolean = body.embeddedLink()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddedPhone(): Boolean = body.embeddedPhone()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numberPooling(): Boolean = body.numberPooling()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sampleMessages(): List<String> = body.sampleMessages()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberHelp(): Boolean = body.subscriberHelp()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberOptIn(): Boolean = body.subscriberOptIn()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberOptOut(): Boolean = body.subscriberOptOut()

    /**
     * Campaign use case (e.g., ACCOUNT_NOTIFICATION, MARKETING, 2FA).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useCase(): String = body.useCase()

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
    fun subUseCases(): Optional<List<String>> = body.subUseCases()

    /**
     * Returns the raw JSON value of [affiliateMarketing].
     *
     * Unlike [affiliateMarketing], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _affiliateMarketing(): JsonField<Boolean> = body._affiliateMarketing()

    /**
     * Returns the raw JSON value of [ageGated].
     *
     * Unlike [ageGated], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ageGated(): JsonField<Boolean> = body._ageGated()

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _brandId(): JsonField<String> = body._brandId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [directLending].
     *
     * Unlike [directLending], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _directLending(): JsonField<Boolean> = body._directLending()

    /**
     * Returns the raw JSON value of [embeddedLink].
     *
     * Unlike [embeddedLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _embeddedLink(): JsonField<Boolean> = body._embeddedLink()

    /**
     * Returns the raw JSON value of [embeddedPhone].
     *
     * Unlike [embeddedPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _embeddedPhone(): JsonField<Boolean> = body._embeddedPhone()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [numberPooling].
     *
     * Unlike [numberPooling], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numberPooling(): JsonField<Boolean> = body._numberPooling()

    /**
     * Returns the raw JSON value of [sampleMessages].
     *
     * Unlike [sampleMessages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sampleMessages(): JsonField<List<String>> = body._sampleMessages()

    /**
     * Returns the raw JSON value of [subscriberHelp].
     *
     * Unlike [subscriberHelp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subscriberHelp(): JsonField<Boolean> = body._subscriberHelp()

    /**
     * Returns the raw JSON value of [subscriberOptIn].
     *
     * Unlike [subscriberOptIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subscriberOptIn(): JsonField<Boolean> = body._subscriberOptIn()

    /**
     * Returns the raw JSON value of [subscriberOptOut].
     *
     * Unlike [subscriberOptOut], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _subscriberOptOut(): JsonField<Boolean> = body._subscriberOptOut()

    /**
     * Returns the raw JSON value of [useCase].
     *
     * Unlike [useCase], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _useCase(): JsonField<String> = body._useCase()

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
     * Returns the raw JSON value of [subUseCases].
     *
     * Unlike [subUseCases], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subUseCases(): JsonField<List<String>> = body._subUseCases()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CampaignCreateParams].
         *
         * The following fields are required:
         * ```java
         * .affiliateMarketing()
         * .ageGated()
         * .brandId()
         * .description()
         * .directLending()
         * .embeddedLink()
         * .embeddedPhone()
         * .name()
         * .numberPooling()
         * .sampleMessages()
         * .subscriberHelp()
         * .subscriberOptIn()
         * .subscriberOptOut()
         * .useCase()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CampaignCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(campaignCreateParams: CampaignCreateParams) = apply {
            body = campaignCreateParams.body.toBuilder()
            additionalHeaders = campaignCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = campaignCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [affiliateMarketing]
         * - [ageGated]
         * - [brandId]
         * - [description]
         * - [directLending]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun affiliateMarketing(affiliateMarketing: Boolean) = apply {
            body.affiliateMarketing(affiliateMarketing)
        }

        /**
         * Sets [Builder.affiliateMarketing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.affiliateMarketing] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun affiliateMarketing(affiliateMarketing: JsonField<Boolean>) = apply {
            body.affiliateMarketing(affiliateMarketing)
        }

        fun ageGated(ageGated: Boolean) = apply { body.ageGated(ageGated) }

        /**
         * Sets [Builder.ageGated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ageGated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ageGated(ageGated: JsonField<Boolean>) = apply { body.ageGated(ageGated) }

        /** ID of the brand to create this campaign under. */
        fun brandId(brandId: String) = apply { body.brandId(brandId) }

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { body.brandId(brandId) }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun directLending(directLending: Boolean) = apply { body.directLending(directLending) }

        /**
         * Sets [Builder.directLending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directLending] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun directLending(directLending: JsonField<Boolean>) = apply {
            body.directLending(directLending)
        }

        fun embeddedLink(embeddedLink: Boolean) = apply { body.embeddedLink(embeddedLink) }

        /**
         * Sets [Builder.embeddedLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddedLink] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun embeddedLink(embeddedLink: JsonField<Boolean>) = apply {
            body.embeddedLink(embeddedLink)
        }

        fun embeddedPhone(embeddedPhone: Boolean) = apply { body.embeddedPhone(embeddedPhone) }

        /**
         * Sets [Builder.embeddedPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddedPhone] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddedPhone(embeddedPhone: JsonField<Boolean>) = apply {
            body.embeddedPhone(embeddedPhone)
        }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun numberPooling(numberPooling: Boolean) = apply { body.numberPooling(numberPooling) }

        /**
         * Sets [Builder.numberPooling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberPooling] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numberPooling(numberPooling: JsonField<Boolean>) = apply {
            body.numberPooling(numberPooling)
        }

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

        fun subscriberHelp(subscriberHelp: Boolean) = apply { body.subscriberHelp(subscriberHelp) }

        /**
         * Sets [Builder.subscriberHelp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberHelp] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberHelp(subscriberHelp: JsonField<Boolean>) = apply {
            body.subscriberHelp(subscriberHelp)
        }

        fun subscriberOptIn(subscriberOptIn: Boolean) = apply {
            body.subscriberOptIn(subscriberOptIn)
        }

        /**
         * Sets [Builder.subscriberOptIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberOptIn] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberOptIn(subscriberOptIn: JsonField<Boolean>) = apply {
            body.subscriberOptIn(subscriberOptIn)
        }

        fun subscriberOptOut(subscriberOptOut: Boolean) = apply {
            body.subscriberOptOut(subscriberOptOut)
        }

        /**
         * Sets [Builder.subscriberOptOut] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberOptOut] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberOptOut(subscriberOptOut: JsonField<Boolean>) = apply {
            body.subscriberOptOut(subscriberOptOut)
        }

        /** Campaign use case (e.g., ACCOUNT_NOTIFICATION, MARKETING, 2FA). */
        fun useCase(useCase: String) = apply { body.useCase(useCase) }

        /**
         * Sets [Builder.useCase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun useCase(useCase: JsonField<String>) = apply { body.useCase(useCase) }

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

        fun subUseCases(subUseCases: List<String>) = apply { body.subUseCases(subUseCases) }

        /**
         * Sets [Builder.subUseCases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subUseCases] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subUseCases(subUseCases: JsonField<List<String>>) = apply {
            body.subUseCases(subUseCases)
        }

        /**
         * Adds a single [String] to [subUseCases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubUseCase(subUseCase: String) = apply { body.addSubUseCase(subUseCase) }

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
         * Returns an immutable instance of [CampaignCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .affiliateMarketing()
         * .ageGated()
         * .brandId()
         * .description()
         * .directLending()
         * .embeddedLink()
         * .embeddedPhone()
         * .name()
         * .numberPooling()
         * .sampleMessages()
         * .subscriberHelp()
         * .subscriberOptIn()
         * .subscriberOptOut()
         * .useCase()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CampaignCreateParams =
            CampaignCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val affiliateMarketing: JsonField<Boolean>,
        private val ageGated: JsonField<Boolean>,
        private val brandId: JsonField<String>,
        private val description: JsonField<String>,
        private val directLending: JsonField<Boolean>,
        private val embeddedLink: JsonField<Boolean>,
        private val embeddedPhone: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val numberPooling: JsonField<Boolean>,
        private val sampleMessages: JsonField<List<String>>,
        private val subscriberHelp: JsonField<Boolean>,
        private val subscriberOptIn: JsonField<Boolean>,
        private val subscriberOptOut: JsonField<Boolean>,
        private val useCase: JsonField<String>,
        private val helpMessage: JsonField<String>,
        private val messageFlow: JsonField<String>,
        private val optInKeywords: JsonField<List<String>>,
        private val optOutKeywords: JsonField<List<String>>,
        private val subUseCases: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("affiliateMarketing")
            @ExcludeMissing
            affiliateMarketing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("ageGated")
            @ExcludeMissing
            ageGated: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("directLending")
            @ExcludeMissing
            directLending: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("embeddedLink")
            @ExcludeMissing
            embeddedLink: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("embeddedPhone")
            @ExcludeMissing
            embeddedPhone: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numberPooling")
            @ExcludeMissing
            numberPooling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sampleMessages")
            @ExcludeMissing
            sampleMessages: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("subscriberHelp")
            @ExcludeMissing
            subscriberHelp: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscriberOptIn")
            @ExcludeMissing
            subscriberOptIn: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscriberOptOut")
            @ExcludeMissing
            subscriberOptOut: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("useCase") @ExcludeMissing useCase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("helpMessage")
            @ExcludeMissing
            helpMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("messageFlow")
            @ExcludeMissing
            messageFlow: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optInKeywords")
            @ExcludeMissing
            optInKeywords: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("optOutKeywords")
            @ExcludeMissing
            optOutKeywords: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("subUseCases")
            @ExcludeMissing
            subUseCases: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            affiliateMarketing,
            ageGated,
            brandId,
            description,
            directLending,
            embeddedLink,
            embeddedPhone,
            name,
            numberPooling,
            sampleMessages,
            subscriberHelp,
            subscriberOptIn,
            subscriberOptOut,
            useCase,
            helpMessage,
            messageFlow,
            optInKeywords,
            optOutKeywords,
            subUseCases,
            mutableMapOf(),
        )

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun affiliateMarketing(): Boolean = affiliateMarketing.getRequired("affiliateMarketing")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ageGated(): Boolean = ageGated.getRequired("ageGated")

        /**
         * ID of the brand to create this campaign under.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun brandId(): String = brandId.getRequired("brandId")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun directLending(): Boolean = directLending.getRequired("directLending")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun embeddedLink(): Boolean = embeddedLink.getRequired("embeddedLink")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun embeddedPhone(): Boolean = embeddedPhone.getRequired("embeddedPhone")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numberPooling(): Boolean = numberPooling.getRequired("numberPooling")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sampleMessages(): List<String> = sampleMessages.getRequired("sampleMessages")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriberHelp(): Boolean = subscriberHelp.getRequired("subscriberHelp")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriberOptIn(): Boolean = subscriberOptIn.getRequired("subscriberOptIn")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriberOptOut(): Boolean = subscriberOptOut.getRequired("subscriberOptOut")

        /**
         * Campaign use case (e.g., ACCOUNT_NOTIFICATION, MARKETING, 2FA).
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun useCase(): String = useCase.getRequired("useCase")

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
        fun subUseCases(): Optional<List<String>> = subUseCases.getOptional("subUseCases")

        /**
         * Returns the raw JSON value of [affiliateMarketing].
         *
         * Unlike [affiliateMarketing], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("affiliateMarketing")
        @ExcludeMissing
        fun _affiliateMarketing(): JsonField<Boolean> = affiliateMarketing

        /**
         * Returns the raw JSON value of [ageGated].
         *
         * Unlike [ageGated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ageGated") @ExcludeMissing fun _ageGated(): JsonField<Boolean> = ageGated

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [directLending].
         *
         * Unlike [directLending], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("directLending")
        @ExcludeMissing
        fun _directLending(): JsonField<Boolean> = directLending

        /**
         * Returns the raw JSON value of [embeddedLink].
         *
         * Unlike [embeddedLink], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embeddedLink")
        @ExcludeMissing
        fun _embeddedLink(): JsonField<Boolean> = embeddedLink

        /**
         * Returns the raw JSON value of [embeddedPhone].
         *
         * Unlike [embeddedPhone], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embeddedPhone")
        @ExcludeMissing
        fun _embeddedPhone(): JsonField<Boolean> = embeddedPhone

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [numberPooling].
         *
         * Unlike [numberPooling], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("numberPooling")
        @ExcludeMissing
        fun _numberPooling(): JsonField<Boolean> = numberPooling

        /**
         * Returns the raw JSON value of [sampleMessages].
         *
         * Unlike [sampleMessages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampleMessages")
        @ExcludeMissing
        fun _sampleMessages(): JsonField<List<String>> = sampleMessages

        /**
         * Returns the raw JSON value of [subscriberHelp].
         *
         * Unlike [subscriberHelp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriberHelp")
        @ExcludeMissing
        fun _subscriberHelp(): JsonField<Boolean> = subscriberHelp

        /**
         * Returns the raw JSON value of [subscriberOptIn].
         *
         * Unlike [subscriberOptIn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriberOptIn")
        @ExcludeMissing
        fun _subscriberOptIn(): JsonField<Boolean> = subscriberOptIn

        /**
         * Returns the raw JSON value of [subscriberOptOut].
         *
         * Unlike [subscriberOptOut], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriberOptOut")
        @ExcludeMissing
        fun _subscriberOptOut(): JsonField<Boolean> = subscriberOptOut

        /**
         * Returns the raw JSON value of [useCase].
         *
         * Unlike [useCase], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("useCase") @ExcludeMissing fun _useCase(): JsonField<String> = useCase

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
         * Returns the raw JSON value of [subUseCases].
         *
         * Unlike [subUseCases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subUseCases")
        @ExcludeMissing
        fun _subUseCases(): JsonField<List<String>> = subUseCases

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
             * .affiliateMarketing()
             * .ageGated()
             * .brandId()
             * .description()
             * .directLending()
             * .embeddedLink()
             * .embeddedPhone()
             * .name()
             * .numberPooling()
             * .sampleMessages()
             * .subscriberHelp()
             * .subscriberOptIn()
             * .subscriberOptOut()
             * .useCase()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var affiliateMarketing: JsonField<Boolean>? = null
            private var ageGated: JsonField<Boolean>? = null
            private var brandId: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var directLending: JsonField<Boolean>? = null
            private var embeddedLink: JsonField<Boolean>? = null
            private var embeddedPhone: JsonField<Boolean>? = null
            private var name: JsonField<String>? = null
            private var numberPooling: JsonField<Boolean>? = null
            private var sampleMessages: JsonField<MutableList<String>>? = null
            private var subscriberHelp: JsonField<Boolean>? = null
            private var subscriberOptIn: JsonField<Boolean>? = null
            private var subscriberOptOut: JsonField<Boolean>? = null
            private var useCase: JsonField<String>? = null
            private var helpMessage: JsonField<String> = JsonMissing.of()
            private var messageFlow: JsonField<String> = JsonMissing.of()
            private var optInKeywords: JsonField<MutableList<String>>? = null
            private var optOutKeywords: JsonField<MutableList<String>>? = null
            private var subUseCases: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                affiliateMarketing = body.affiliateMarketing
                ageGated = body.ageGated
                brandId = body.brandId
                description = body.description
                directLending = body.directLending
                embeddedLink = body.embeddedLink
                embeddedPhone = body.embeddedPhone
                name = body.name
                numberPooling = body.numberPooling
                sampleMessages = body.sampleMessages.map { it.toMutableList() }
                subscriberHelp = body.subscriberHelp
                subscriberOptIn = body.subscriberOptIn
                subscriberOptOut = body.subscriberOptOut
                useCase = body.useCase
                helpMessage = body.helpMessage
                messageFlow = body.messageFlow
                optInKeywords = body.optInKeywords.map { it.toMutableList() }
                optOutKeywords = body.optOutKeywords.map { it.toMutableList() }
                subUseCases = body.subUseCases.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun affiliateMarketing(affiliateMarketing: Boolean) =
                affiliateMarketing(JsonField.of(affiliateMarketing))

            /**
             * Sets [Builder.affiliateMarketing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.affiliateMarketing] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun affiliateMarketing(affiliateMarketing: JsonField<Boolean>) = apply {
                this.affiliateMarketing = affiliateMarketing
            }

            fun ageGated(ageGated: Boolean) = ageGated(JsonField.of(ageGated))

            /**
             * Sets [Builder.ageGated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ageGated] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ageGated(ageGated: JsonField<Boolean>) = apply { this.ageGated = ageGated }

            /** ID of the brand to create this campaign under. */
            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

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

            fun directLending(directLending: Boolean) = directLending(JsonField.of(directLending))

            /**
             * Sets [Builder.directLending] to an arbitrary JSON value.
             *
             * You should usually call [Builder.directLending] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun directLending(directLending: JsonField<Boolean>) = apply {
                this.directLending = directLending
            }

            fun embeddedLink(embeddedLink: Boolean) = embeddedLink(JsonField.of(embeddedLink))

            /**
             * Sets [Builder.embeddedLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddedLink] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddedLink(embeddedLink: JsonField<Boolean>) = apply {
                this.embeddedLink = embeddedLink
            }

            fun embeddedPhone(embeddedPhone: Boolean) = embeddedPhone(JsonField.of(embeddedPhone))

            /**
             * Sets [Builder.embeddedPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddedPhone] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddedPhone(embeddedPhone: JsonField<Boolean>) = apply {
                this.embeddedPhone = embeddedPhone
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

            fun numberPooling(numberPooling: Boolean) = numberPooling(JsonField.of(numberPooling))

            /**
             * Sets [Builder.numberPooling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberPooling] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numberPooling(numberPooling: JsonField<Boolean>) = apply {
                this.numberPooling = numberPooling
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

            fun subscriberHelp(subscriberHelp: Boolean) =
                subscriberHelp(JsonField.of(subscriberHelp))

            /**
             * Sets [Builder.subscriberHelp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriberHelp] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriberHelp(subscriberHelp: JsonField<Boolean>) = apply {
                this.subscriberHelp = subscriberHelp
            }

            fun subscriberOptIn(subscriberOptIn: Boolean) =
                subscriberOptIn(JsonField.of(subscriberOptIn))

            /**
             * Sets [Builder.subscriberOptIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriberOptIn] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriberOptIn(subscriberOptIn: JsonField<Boolean>) = apply {
                this.subscriberOptIn = subscriberOptIn
            }

            fun subscriberOptOut(subscriberOptOut: Boolean) =
                subscriberOptOut(JsonField.of(subscriberOptOut))

            /**
             * Sets [Builder.subscriberOptOut] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriberOptOut] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriberOptOut(subscriberOptOut: JsonField<Boolean>) = apply {
                this.subscriberOptOut = subscriberOptOut
            }

            /** Campaign use case (e.g., ACCOUNT_NOTIFICATION, MARKETING, 2FA). */
            fun useCase(useCase: String) = useCase(JsonField.of(useCase))

            /**
             * Sets [Builder.useCase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useCase] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useCase(useCase: JsonField<String>) = apply { this.useCase = useCase }

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

            fun subUseCases(subUseCases: List<String>) = subUseCases(JsonField.of(subUseCases))

            /**
             * Sets [Builder.subUseCases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subUseCases] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subUseCases(subUseCases: JsonField<List<String>>) = apply {
                this.subUseCases = subUseCases.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [subUseCases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubUseCase(subUseCase: String) = apply {
                subUseCases =
                    (subUseCases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subUseCases", it).add(subUseCase)
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
             *
             * The following fields are required:
             * ```java
             * .affiliateMarketing()
             * .ageGated()
             * .brandId()
             * .description()
             * .directLending()
             * .embeddedLink()
             * .embeddedPhone()
             * .name()
             * .numberPooling()
             * .sampleMessages()
             * .subscriberHelp()
             * .subscriberOptIn()
             * .subscriberOptOut()
             * .useCase()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("affiliateMarketing", affiliateMarketing),
                    checkRequired("ageGated", ageGated),
                    checkRequired("brandId", brandId),
                    checkRequired("description", description),
                    checkRequired("directLending", directLending),
                    checkRequired("embeddedLink", embeddedLink),
                    checkRequired("embeddedPhone", embeddedPhone),
                    checkRequired("name", name),
                    checkRequired("numberPooling", numberPooling),
                    checkRequired("sampleMessages", sampleMessages).map { it.toImmutable() },
                    checkRequired("subscriberHelp", subscriberHelp),
                    checkRequired("subscriberOptIn", subscriberOptIn),
                    checkRequired("subscriberOptOut", subscriberOptOut),
                    checkRequired("useCase", useCase),
                    helpMessage,
                    messageFlow,
                    (optInKeywords ?: JsonMissing.of()).map { it.toImmutable() },
                    (optOutKeywords ?: JsonMissing.of()).map { it.toImmutable() },
                    (subUseCases ?: JsonMissing.of()).map { it.toImmutable() },
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

            affiliateMarketing()
            ageGated()
            brandId()
            description()
            directLending()
            embeddedLink()
            embeddedPhone()
            name()
            numberPooling()
            sampleMessages()
            subscriberHelp()
            subscriberOptIn()
            subscriberOptOut()
            useCase()
            helpMessage()
            messageFlow()
            optInKeywords()
            optOutKeywords()
            subUseCases()
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
            (if (affiliateMarketing.asKnown().isPresent) 1 else 0) +
                (if (ageGated.asKnown().isPresent) 1 else 0) +
                (if (brandId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (directLending.asKnown().isPresent) 1 else 0) +
                (if (embeddedLink.asKnown().isPresent) 1 else 0) +
                (if (embeddedPhone.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (numberPooling.asKnown().isPresent) 1 else 0) +
                (sampleMessages.asKnown().getOrNull()?.size ?: 0) +
                (if (subscriberHelp.asKnown().isPresent) 1 else 0) +
                (if (subscriberOptIn.asKnown().isPresent) 1 else 0) +
                (if (subscriberOptOut.asKnown().isPresent) 1 else 0) +
                (if (useCase.asKnown().isPresent) 1 else 0) +
                (if (helpMessage.asKnown().isPresent) 1 else 0) +
                (if (messageFlow.asKnown().isPresent) 1 else 0) +
                (optInKeywords.asKnown().getOrNull()?.size ?: 0) +
                (optOutKeywords.asKnown().getOrNull()?.size ?: 0) +
                (subUseCases.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                affiliateMarketing == other.affiliateMarketing &&
                ageGated == other.ageGated &&
                brandId == other.brandId &&
                description == other.description &&
                directLending == other.directLending &&
                embeddedLink == other.embeddedLink &&
                embeddedPhone == other.embeddedPhone &&
                name == other.name &&
                numberPooling == other.numberPooling &&
                sampleMessages == other.sampleMessages &&
                subscriberHelp == other.subscriberHelp &&
                subscriberOptIn == other.subscriberOptIn &&
                subscriberOptOut == other.subscriberOptOut &&
                useCase == other.useCase &&
                helpMessage == other.helpMessage &&
                messageFlow == other.messageFlow &&
                optInKeywords == other.optInKeywords &&
                optOutKeywords == other.optOutKeywords &&
                subUseCases == other.subUseCases &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                affiliateMarketing,
                ageGated,
                brandId,
                description,
                directLending,
                embeddedLink,
                embeddedPhone,
                name,
                numberPooling,
                sampleMessages,
                subscriberHelp,
                subscriberOptIn,
                subscriberOptOut,
                useCase,
                helpMessage,
                messageFlow,
                optInKeywords,
                optOutKeywords,
                subUseCases,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{affiliateMarketing=$affiliateMarketing, ageGated=$ageGated, brandId=$brandId, description=$description, directLending=$directLending, embeddedLink=$embeddedLink, embeddedPhone=$embeddedPhone, name=$name, numberPooling=$numberPooling, sampleMessages=$sampleMessages, subscriberHelp=$subscriberHelp, subscriberOptIn=$subscriberOptIn, subscriberOptOut=$subscriberOptOut, useCase=$useCase, helpMessage=$helpMessage, messageFlow=$messageFlow, optInKeywords=$optInKeywords, optOutKeywords=$optOutKeywords, subUseCases=$subUseCases, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CampaignCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
