// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

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

/** Create a WhatsApp message template. Note: Templates must be approved by Meta before use. */
class TemplateCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Default template body. Used when no channel-specific body is set.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun body(): String = body.body()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun language(): String = body.language()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Add 'Do not share this code' disclaimer. Only for AUTHENTICATION templates.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addSecurityRecommendation(): Optional<Boolean> = body.addSecurityRecommendation()

    /**
     * Template buttons (max 3).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun buttons(): Optional<List<Button>> = body.buttons()

    /**
     * Code expiration time in minutes. Only for AUTHENTICATION templates.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun codeExpirationMinutes(): Optional<Long> = body.codeExpirationMinutes()

    /**
     * Footer text for the template.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun footer(): Optional<String> = body.footer()

    /**
     * Header content (text string or media URL).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headerContent(): Optional<String> = body.headerContent()

    /**
     * Type of header for the template.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headerType(): Optional<HeaderType> = body.headerType()

    /**
     * Channel-specific body for Instagram. Falls back to `body` if not set.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instagramBody(): Optional<String> = body.instagramBody()

    /**
     * Channel-specific body for SMS. Falls back to `body` if not set.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun smsBody(): Optional<String> = body.smsBody()

    /**
     * Channel-specific body for Telegram. Falls back to `body` if not set.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telegramBody(): Optional<String> = body.telegramBody()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun variables(): Optional<List<String>> = body.variables()

    /**
     * WhatsApp template category.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whatsappCategory(): Optional<WhatsappCategory> = body.whatsappCategory()

    /**
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _body_(): JsonField<String> = this.body._body_()

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _language(): JsonField<String> = body._language()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [addSecurityRecommendation].
     *
     * Unlike [addSecurityRecommendation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _addSecurityRecommendation(): JsonField<Boolean> = body._addSecurityRecommendation()

    /**
     * Returns the raw JSON value of [buttons].
     *
     * Unlike [buttons], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _buttons(): JsonField<List<Button>> = body._buttons()

    /**
     * Returns the raw JSON value of [codeExpirationMinutes].
     *
     * Unlike [codeExpirationMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _codeExpirationMinutes(): JsonField<Long> = body._codeExpirationMinutes()

    /**
     * Returns the raw JSON value of [footer].
     *
     * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _footer(): JsonField<String> = body._footer()

    /**
     * Returns the raw JSON value of [headerContent].
     *
     * Unlike [headerContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _headerContent(): JsonField<String> = body._headerContent()

    /**
     * Returns the raw JSON value of [headerType].
     *
     * Unlike [headerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _headerType(): JsonField<HeaderType> = body._headerType()

    /**
     * Returns the raw JSON value of [instagramBody].
     *
     * Unlike [instagramBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instagramBody(): JsonField<String> = body._instagramBody()

    /**
     * Returns the raw JSON value of [smsBody].
     *
     * Unlike [smsBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _smsBody(): JsonField<String> = body._smsBody()

    /**
     * Returns the raw JSON value of [telegramBody].
     *
     * Unlike [telegramBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _telegramBody(): JsonField<String> = body._telegramBody()

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _variables(): JsonField<List<String>> = body._variables()

    /**
     * Returns the raw JSON value of [whatsappCategory].
     *
     * Unlike [whatsappCategory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _whatsappCategory(): JsonField<WhatsappCategory> = body._whatsappCategory()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TemplateCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * .language()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplateCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(templateCreateParams: TemplateCreateParams) = apply {
            body = templateCreateParams.body.toBuilder()
            additionalHeaders = templateCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = templateCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [body]
         * - [language]
         * - [name]
         * - [addSecurityRecommendation]
         * - [buttons]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Default template body. Used when no channel-specific body is set. */
        fun body(body: String) = apply { this.body.body(body) }

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: JsonField<String>) = apply { this.body.body(body) }

        fun language(language: String) = apply { body.language(language) }

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { body.language(language) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Add 'Do not share this code' disclaimer. Only for AUTHENTICATION templates. */
        fun addSecurityRecommendation(addSecurityRecommendation: Boolean) = apply {
            body.addSecurityRecommendation(addSecurityRecommendation)
        }

        /**
         * Sets [Builder.addSecurityRecommendation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addSecurityRecommendation] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addSecurityRecommendation(addSecurityRecommendation: JsonField<Boolean>) = apply {
            body.addSecurityRecommendation(addSecurityRecommendation)
        }

        /** Template buttons (max 3). */
        fun buttons(buttons: List<Button>) = apply { body.buttons(buttons) }

        /**
         * Sets [Builder.buttons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttons] with a well-typed `List<Button>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buttons(buttons: JsonField<List<Button>>) = apply { body.buttons(buttons) }

        /**
         * Adds a single [Button] to [buttons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addButton(button: Button) = apply { body.addButton(button) }

        /** Code expiration time in minutes. Only for AUTHENTICATION templates. */
        fun codeExpirationMinutes(codeExpirationMinutes: Long) = apply {
            body.codeExpirationMinutes(codeExpirationMinutes)
        }

        /**
         * Sets [Builder.codeExpirationMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codeExpirationMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun codeExpirationMinutes(codeExpirationMinutes: JsonField<Long>) = apply {
            body.codeExpirationMinutes(codeExpirationMinutes)
        }

        /** Footer text for the template. */
        fun footer(footer: String) = apply { body.footer(footer) }

        /**
         * Sets [Builder.footer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun footer(footer: JsonField<String>) = apply { body.footer(footer) }

        /** Header content (text string or media URL). */
        fun headerContent(headerContent: String) = apply { body.headerContent(headerContent) }

        /**
         * Sets [Builder.headerContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerContent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headerContent(headerContent: JsonField<String>) = apply {
            body.headerContent(headerContent)
        }

        /** Type of header for the template. */
        fun headerType(headerType: HeaderType) = apply { body.headerType(headerType) }

        /**
         * Sets [Builder.headerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerType] with a well-typed [HeaderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun headerType(headerType: JsonField<HeaderType>) = apply { body.headerType(headerType) }

        /** Channel-specific body for Instagram. Falls back to `body` if not set. */
        fun instagramBody(instagramBody: String) = apply { body.instagramBody(instagramBody) }

        /**
         * Sets [Builder.instagramBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instagramBody] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instagramBody(instagramBody: JsonField<String>) = apply {
            body.instagramBody(instagramBody)
        }

        /** Channel-specific body for SMS. Falls back to `body` if not set. */
        fun smsBody(smsBody: String) = apply { body.smsBody(smsBody) }

        /**
         * Sets [Builder.smsBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.smsBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun smsBody(smsBody: JsonField<String>) = apply { body.smsBody(smsBody) }

        /** Channel-specific body for Telegram. Falls back to `body` if not set. */
        fun telegramBody(telegramBody: String) = apply { body.telegramBody(telegramBody) }

        /**
         * Sets [Builder.telegramBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telegramBody] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun telegramBody(telegramBody: JsonField<String>) = apply {
            body.telegramBody(telegramBody)
        }

        fun variables(variables: List<String>) = apply { body.variables(variables) }

        /**
         * Sets [Builder.variables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variables] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun variables(variables: JsonField<List<String>>) = apply { body.variables(variables) }

        /**
         * Adds a single [String] to [variables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVariable(variable: String) = apply { body.addVariable(variable) }

        /** WhatsApp template category. */
        fun whatsappCategory(whatsappCategory: WhatsappCategory) = apply {
            body.whatsappCategory(whatsappCategory)
        }

        /**
         * Sets [Builder.whatsappCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whatsappCategory] with a well-typed [WhatsappCategory]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun whatsappCategory(whatsappCategory: JsonField<WhatsappCategory>) = apply {
            body.whatsappCategory(whatsappCategory)
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
         * Returns an immutable instance of [TemplateCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * .language()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TemplateCreateParams =
            TemplateCreateParams(
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
        private val body: JsonField<String>,
        private val language: JsonField<String>,
        private val name: JsonField<String>,
        private val addSecurityRecommendation: JsonField<Boolean>,
        private val buttons: JsonField<List<Button>>,
        private val codeExpirationMinutes: JsonField<Long>,
        private val footer: JsonField<String>,
        private val headerContent: JsonField<String>,
        private val headerType: JsonField<HeaderType>,
        private val instagramBody: JsonField<String>,
        private val smsBody: JsonField<String>,
        private val telegramBody: JsonField<String>,
        private val variables: JsonField<List<String>>,
        private val whatsappCategory: JsonField<WhatsappCategory>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addSecurityRecommendation")
            @ExcludeMissing
            addSecurityRecommendation: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("buttons")
            @ExcludeMissing
            buttons: JsonField<List<Button>> = JsonMissing.of(),
            @JsonProperty("codeExpirationMinutes")
            @ExcludeMissing
            codeExpirationMinutes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("footer") @ExcludeMissing footer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headerContent")
            @ExcludeMissing
            headerContent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headerType")
            @ExcludeMissing
            headerType: JsonField<HeaderType> = JsonMissing.of(),
            @JsonProperty("instagramBody")
            @ExcludeMissing
            instagramBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("smsBody") @ExcludeMissing smsBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("telegramBody")
            @ExcludeMissing
            telegramBody: JsonField<String> = JsonMissing.of(),
            @JsonProperty("variables")
            @ExcludeMissing
            variables: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("whatsappCategory")
            @ExcludeMissing
            whatsappCategory: JsonField<WhatsappCategory> = JsonMissing.of(),
        ) : this(
            body,
            language,
            name,
            addSecurityRecommendation,
            buttons,
            codeExpirationMinutes,
            footer,
            headerContent,
            headerType,
            instagramBody,
            smsBody,
            telegramBody,
            variables,
            whatsappCategory,
            mutableMapOf(),
        )

        /**
         * Default template body. Used when no channel-specific body is set.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun body(): String = body.getRequired("body")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun language(): String = language.getRequired("language")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Add 'Do not share this code' disclaimer. Only for AUTHENTICATION templates.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addSecurityRecommendation(): Optional<Boolean> =
            addSecurityRecommendation.getOptional("addSecurityRecommendation")

        /**
         * Template buttons (max 3).
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun buttons(): Optional<List<Button>> = buttons.getOptional("buttons")

        /**
         * Code expiration time in minutes. Only for AUTHENTICATION templates.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codeExpirationMinutes(): Optional<Long> =
            codeExpirationMinutes.getOptional("codeExpirationMinutes")

        /**
         * Footer text for the template.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun footer(): Optional<String> = footer.getOptional("footer")

        /**
         * Header content (text string or media URL).
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun headerContent(): Optional<String> = headerContent.getOptional("headerContent")

        /**
         * Type of header for the template.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun headerType(): Optional<HeaderType> = headerType.getOptional("headerType")

        /**
         * Channel-specific body for Instagram. Falls back to `body` if not set.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instagramBody(): Optional<String> = instagramBody.getOptional("instagramBody")

        /**
         * Channel-specific body for SMS. Falls back to `body` if not set.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun smsBody(): Optional<String> = smsBody.getOptional("smsBody")

        /**
         * Channel-specific body for Telegram. Falls back to `body` if not set.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun telegramBody(): Optional<String> = telegramBody.getOptional("telegramBody")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun variables(): Optional<List<String>> = variables.getOptional("variables")

        /**
         * WhatsApp template category.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whatsappCategory(): Optional<WhatsappCategory> =
            whatsappCategory.getOptional("whatsappCategory")

        /**
         * Returns the raw JSON value of [body].
         *
         * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("body") @ExcludeMissing fun _body_(): JsonField<String> = body

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [addSecurityRecommendation].
         *
         * Unlike [addSecurityRecommendation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("addSecurityRecommendation")
        @ExcludeMissing
        fun _addSecurityRecommendation(): JsonField<Boolean> = addSecurityRecommendation

        /**
         * Returns the raw JSON value of [buttons].
         *
         * Unlike [buttons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("buttons") @ExcludeMissing fun _buttons(): JsonField<List<Button>> = buttons

        /**
         * Returns the raw JSON value of [codeExpirationMinutes].
         *
         * Unlike [codeExpirationMinutes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("codeExpirationMinutes")
        @ExcludeMissing
        fun _codeExpirationMinutes(): JsonField<Long> = codeExpirationMinutes

        /**
         * Returns the raw JSON value of [footer].
         *
         * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<String> = footer

        /**
         * Returns the raw JSON value of [headerContent].
         *
         * Unlike [headerContent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("headerContent")
        @ExcludeMissing
        fun _headerContent(): JsonField<String> = headerContent

        /**
         * Returns the raw JSON value of [headerType].
         *
         * Unlike [headerType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headerType")
        @ExcludeMissing
        fun _headerType(): JsonField<HeaderType> = headerType

        /**
         * Returns the raw JSON value of [instagramBody].
         *
         * Unlike [instagramBody], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instagramBody")
        @ExcludeMissing
        fun _instagramBody(): JsonField<String> = instagramBody

        /**
         * Returns the raw JSON value of [smsBody].
         *
         * Unlike [smsBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("smsBody") @ExcludeMissing fun _smsBody(): JsonField<String> = smsBody

        /**
         * Returns the raw JSON value of [telegramBody].
         *
         * Unlike [telegramBody], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("telegramBody")
        @ExcludeMissing
        fun _telegramBody(): JsonField<String> = telegramBody

        /**
         * Returns the raw JSON value of [variables].
         *
         * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("variables")
        @ExcludeMissing
        fun _variables(): JsonField<List<String>> = variables

        /**
         * Returns the raw JSON value of [whatsappCategory].
         *
         * Unlike [whatsappCategory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("whatsappCategory")
        @ExcludeMissing
        fun _whatsappCategory(): JsonField<WhatsappCategory> = whatsappCategory

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
             * .body()
             * .language()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var body: JsonField<String>? = null
            private var language: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var addSecurityRecommendation: JsonField<Boolean> = JsonMissing.of()
            private var buttons: JsonField<MutableList<Button>>? = null
            private var codeExpirationMinutes: JsonField<Long> = JsonMissing.of()
            private var footer: JsonField<String> = JsonMissing.of()
            private var headerContent: JsonField<String> = JsonMissing.of()
            private var headerType: JsonField<HeaderType> = JsonMissing.of()
            private var instagramBody: JsonField<String> = JsonMissing.of()
            private var smsBody: JsonField<String> = JsonMissing.of()
            private var telegramBody: JsonField<String> = JsonMissing.of()
            private var variables: JsonField<MutableList<String>>? = null
            private var whatsappCategory: JsonField<WhatsappCategory> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                this.body = body.body
                language = body.language
                name = body.name
                addSecurityRecommendation = body.addSecurityRecommendation
                buttons = body.buttons.map { it.toMutableList() }
                codeExpirationMinutes = body.codeExpirationMinutes
                footer = body.footer
                headerContent = body.headerContent
                headerType = body.headerType
                instagramBody = body.instagramBody
                smsBody = body.smsBody
                telegramBody = body.telegramBody
                variables = body.variables.map { it.toMutableList() }
                whatsappCategory = body.whatsappCategory
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Default template body. Used when no channel-specific body is set. */
            fun body(body: String) = body(JsonField.of(body))

            /**
             * Sets [Builder.body] to an arbitrary JSON value.
             *
             * You should usually call [Builder.body] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun body(body: JsonField<String>) = apply { this.body = body }

            fun language(language: String) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Add 'Do not share this code' disclaimer. Only for AUTHENTICATION templates. */
            fun addSecurityRecommendation(addSecurityRecommendation: Boolean) =
                addSecurityRecommendation(JsonField.of(addSecurityRecommendation))

            /**
             * Sets [Builder.addSecurityRecommendation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addSecurityRecommendation] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun addSecurityRecommendation(addSecurityRecommendation: JsonField<Boolean>) = apply {
                this.addSecurityRecommendation = addSecurityRecommendation
            }

            /** Template buttons (max 3). */
            fun buttons(buttons: List<Button>) = buttons(JsonField.of(buttons))

            /**
             * Sets [Builder.buttons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buttons] with a well-typed `List<Button>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun buttons(buttons: JsonField<List<Button>>) = apply {
                this.buttons = buttons.map { it.toMutableList() }
            }

            /**
             * Adds a single [Button] to [buttons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addButton(button: Button) = apply {
                buttons =
                    (buttons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("buttons", it).add(button)
                    }
            }

            /** Code expiration time in minutes. Only for AUTHENTICATION templates. */
            fun codeExpirationMinutes(codeExpirationMinutes: Long) =
                codeExpirationMinutes(JsonField.of(codeExpirationMinutes))

            /**
             * Sets [Builder.codeExpirationMinutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeExpirationMinutes] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun codeExpirationMinutes(codeExpirationMinutes: JsonField<Long>) = apply {
                this.codeExpirationMinutes = codeExpirationMinutes
            }

            /** Footer text for the template. */
            fun footer(footer: String) = footer(JsonField.of(footer))

            /**
             * Sets [Builder.footer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.footer] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun footer(footer: JsonField<String>) = apply { this.footer = footer }

            /** Header content (text string or media URL). */
            fun headerContent(headerContent: String) = headerContent(JsonField.of(headerContent))

            /**
             * Sets [Builder.headerContent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headerContent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headerContent(headerContent: JsonField<String>) = apply {
                this.headerContent = headerContent
            }

            /** Type of header for the template. */
            fun headerType(headerType: HeaderType) = headerType(JsonField.of(headerType))

            /**
             * Sets [Builder.headerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headerType] with a well-typed [HeaderType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headerType(headerType: JsonField<HeaderType>) = apply {
                this.headerType = headerType
            }

            /** Channel-specific body for Instagram. Falls back to `body` if not set. */
            fun instagramBody(instagramBody: String) = instagramBody(JsonField.of(instagramBody))

            /**
             * Sets [Builder.instagramBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instagramBody] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instagramBody(instagramBody: JsonField<String>) = apply {
                this.instagramBody = instagramBody
            }

            /** Channel-specific body for SMS. Falls back to `body` if not set. */
            fun smsBody(smsBody: String) = smsBody(JsonField.of(smsBody))

            /**
             * Sets [Builder.smsBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.smsBody] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun smsBody(smsBody: JsonField<String>) = apply { this.smsBody = smsBody }

            /** Channel-specific body for Telegram. Falls back to `body` if not set. */
            fun telegramBody(telegramBody: String) = telegramBody(JsonField.of(telegramBody))

            /**
             * Sets [Builder.telegramBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telegramBody] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun telegramBody(telegramBody: JsonField<String>) = apply {
                this.telegramBody = telegramBody
            }

            fun variables(variables: List<String>) = variables(JsonField.of(variables))

            /**
             * Sets [Builder.variables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.variables] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun variables(variables: JsonField<List<String>>) = apply {
                this.variables = variables.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [variables].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVariable(variable: String) = apply {
                variables =
                    (variables ?: JsonField.of(mutableListOf())).also {
                        checkKnown("variables", it).add(variable)
                    }
            }

            /** WhatsApp template category. */
            fun whatsappCategory(whatsappCategory: WhatsappCategory) =
                whatsappCategory(JsonField.of(whatsappCategory))

            /**
             * Sets [Builder.whatsappCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whatsappCategory] with a well-typed
             * [WhatsappCategory] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun whatsappCategory(whatsappCategory: JsonField<WhatsappCategory>) = apply {
                this.whatsappCategory = whatsappCategory
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
             * .body()
             * .language()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("body", body),
                    checkRequired("language", language),
                    checkRequired("name", name),
                    addSecurityRecommendation,
                    (buttons ?: JsonMissing.of()).map { it.toImmutable() },
                    codeExpirationMinutes,
                    footer,
                    headerContent,
                    headerType,
                    instagramBody,
                    smsBody,
                    telegramBody,
                    (variables ?: JsonMissing.of()).map { it.toImmutable() },
                    whatsappCategory,
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

            body()
            language()
            name()
            addSecurityRecommendation()
            buttons().ifPresent { it.forEach { it.validate() } }
            codeExpirationMinutes()
            footer()
            headerContent()
            headerType().ifPresent { it.validate() }
            instagramBody()
            smsBody()
            telegramBody()
            variables()
            whatsappCategory().ifPresent { it.validate() }
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
            (if (body.asKnown().isPresent) 1 else 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (addSecurityRecommendation.asKnown().isPresent) 1 else 0) +
                (buttons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (codeExpirationMinutes.asKnown().isPresent) 1 else 0) +
                (if (footer.asKnown().isPresent) 1 else 0) +
                (if (headerContent.asKnown().isPresent) 1 else 0) +
                (headerType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (instagramBody.asKnown().isPresent) 1 else 0) +
                (if (smsBody.asKnown().isPresent) 1 else 0) +
                (if (telegramBody.asKnown().isPresent) 1 else 0) +
                (variables.asKnown().getOrNull()?.size ?: 0) +
                (whatsappCategory.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                body == other.body &&
                language == other.language &&
                name == other.name &&
                addSecurityRecommendation == other.addSecurityRecommendation &&
                buttons == other.buttons &&
                codeExpirationMinutes == other.codeExpirationMinutes &&
                footer == other.footer &&
                headerContent == other.headerContent &&
                headerType == other.headerType &&
                instagramBody == other.instagramBody &&
                smsBody == other.smsBody &&
                telegramBody == other.telegramBody &&
                variables == other.variables &&
                whatsappCategory == other.whatsappCategory &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                body,
                language,
                name,
                addSecurityRecommendation,
                buttons,
                codeExpirationMinutes,
                footer,
                headerContent,
                headerType,
                instagramBody,
                smsBody,
                telegramBody,
                variables,
                whatsappCategory,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{body=$body, language=$language, name=$name, addSecurityRecommendation=$addSecurityRecommendation, buttons=$buttons, codeExpirationMinutes=$codeExpirationMinutes, footer=$footer, headerContent=$headerContent, headerType=$headerType, instagramBody=$instagramBody, smsBody=$smsBody, telegramBody=$telegramBody, variables=$variables, whatsappCategory=$whatsappCategory, additionalProperties=$additionalProperties}"
    }

    class Button
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val example: JsonField<String>,
        private val otpType: JsonField<OtpType>,
        private val packageName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val signatureHash: JsonField<String>,
        private val text: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("example") @ExcludeMissing example: JsonField<String> = JsonMissing.of(),
            @JsonProperty("otpType") @ExcludeMissing otpType: JsonField<OtpType> = JsonMissing.of(),
            @JsonProperty("packageName")
            @ExcludeMissing
            packageName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signatureHash")
            @ExcludeMissing
            signatureHash: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            type,
            example,
            otpType,
            packageName,
            phoneNumber,
            signatureHash,
            text,
            url,
            mutableMapOf(),
        )

        /**
         * `request_contact_info` renders a fixed **Share Contact Info** button that asks the
         * recipient to share their phone number — useful when a contact adopted a WhatsApp username
         * and you only know their BSUID. It takes no other fields.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Sample value Meta uses to review templates with a dynamic URL button. Substituted into
         * `{{1}}` of the URL when the template is submitted to Meta. Only meaningful when `url`
         * contains `{{1}}`; ignored for static URLs.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun example(): Optional<String> = example.getOptional("example")

        /**
         * Required when type is 'otp'. COPY_CODE shows copy button, ONE_TAP enables Android
         * autofill.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun otpType(): Optional<OtpType> = otpType.getOptional("otpType")

        /**
         * Android package name. Required for ONE_TAP buttons.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun packageName(): Optional<String> = packageName.getOptional("packageName")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phoneNumber")

        /**
         * Android app signature hash. Required for ONE_TAP buttons.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signatureHash(): Optional<String> = signatureHash.getOptional("signatureHash")

        /**
         * Button label. Required for every type except `request_contact_info`, whose label is fixed
         * by WhatsApp.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Button destination. Use `{{1}}` exactly once for a dynamic URL (e.g.
         * `https://example.com/orders/{{1}}`); WhatsApp only accepts the strict `{{1}}` form.
         * Static URLs must not contain any `{{...}}` placeholder.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [example].
         *
         * Unlike [example], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("example") @ExcludeMissing fun _example(): JsonField<String> = example

        /**
         * Returns the raw JSON value of [otpType].
         *
         * Unlike [otpType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("otpType") @ExcludeMissing fun _otpType(): JsonField<OtpType> = otpType

        /**
         * Returns the raw JSON value of [packageName].
         *
         * Unlike [packageName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("packageName")
        @ExcludeMissing
        fun _packageName(): JsonField<String> = packageName

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [signatureHash].
         *
         * Unlike [signatureHash], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signatureHash")
        @ExcludeMissing
        fun _signatureHash(): JsonField<String> = signatureHash

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
             * Returns a mutable builder for constructing an instance of [Button].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Button]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var example: JsonField<String> = JsonMissing.of()
            private var otpType: JsonField<OtpType> = JsonMissing.of()
            private var packageName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var signatureHash: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(button: Button) = apply {
                type = button.type
                example = button.example
                otpType = button.otpType
                packageName = button.packageName
                phoneNumber = button.phoneNumber
                signatureHash = button.signatureHash
                text = button.text
                url = button.url
                additionalProperties = button.additionalProperties.toMutableMap()
            }

            /**
             * `request_contact_info` renders a fixed **Share Contact Info** button that asks the
             * recipient to share their phone number — useful when a contact adopted a WhatsApp
             * username and you only know their BSUID. It takes no other fields.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Sample value Meta uses to review templates with a dynamic URL button. Substituted
             * into `{{1}}` of the URL when the template is submitted to Meta. Only meaningful when
             * `url` contains `{{1}}`; ignored for static URLs.
             */
            fun example(example: String) = example(JsonField.of(example))

            /**
             * Sets [Builder.example] to an arbitrary JSON value.
             *
             * You should usually call [Builder.example] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun example(example: JsonField<String>) = apply { this.example = example }

            /**
             * Required when type is 'otp'. COPY_CODE shows copy button, ONE_TAP enables Android
             * autofill.
             */
            fun otpType(otpType: OtpType) = otpType(JsonField.of(otpType))

            /**
             * Sets [Builder.otpType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.otpType] with a well-typed [OtpType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun otpType(otpType: JsonField<OtpType>) = apply { this.otpType = otpType }

            /** Android package name. Required for ONE_TAP buttons. */
            fun packageName(packageName: String) = packageName(JsonField.of(packageName))

            /**
             * Sets [Builder.packageName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.packageName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun packageName(packageName: JsonField<String>) = apply {
                this.packageName = packageName
            }

            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Android app signature hash. Required for ONE_TAP buttons. */
            fun signatureHash(signatureHash: String) = signatureHash(JsonField.of(signatureHash))

            /**
             * Sets [Builder.signatureHash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signatureHash] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signatureHash(signatureHash: JsonField<String>) = apply {
                this.signatureHash = signatureHash
            }

            /**
             * Button label. Required for every type except `request_contact_info`, whose label is
             * fixed by WhatsApp.
             */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * Button destination. Use `{{1}}` exactly once for a dynamic URL (e.g.
             * `https://example.com/orders/{{1}}`); WhatsApp only accepts the strict `{{1}}` form.
             * Static URLs must not contain any `{{...}}` placeholder.
             */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Button].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Button =
                Button(
                    checkRequired("type", type),
                    example,
                    otpType,
                    packageName,
                    phoneNumber,
                    signatureHash,
                    text,
                    url,
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
        fun validate(): Button = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            example()
            otpType().ifPresent { it.validate() }
            packageName()
            phoneNumber()
            signatureHash()
            text()
            url()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (example.asKnown().isPresent) 1 else 0) +
                (otpType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (packageName.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (signatureHash.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        /**
         * `request_contact_info` renders a fixed **Share Contact Info** button that asks the
         * recipient to share their phone number — useful when a contact adopted a WhatsApp username
         * and you only know their BSUID. It takes no other fields.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val QUICK_REPLY = of("quick_reply")

                @JvmField val URL = of("url")

                @JvmField val PHONE = of("phone")

                @JvmField val OTP = of("otp")

                @JvmField val REQUEST_CONTACT_INFO = of("request_contact_info")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                QUICK_REPLY,
                URL,
                PHONE,
                OTP,
                REQUEST_CONTACT_INFO,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                QUICK_REPLY,
                URL,
                PHONE,
                OTP,
                REQUEST_CONTACT_INFO,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    QUICK_REPLY -> Value.QUICK_REPLY
                    URL -> Value.URL
                    PHONE -> Value.PHONE
                    OTP -> Value.OTP
                    REQUEST_CONTACT_INFO -> Value.REQUEST_CONTACT_INFO
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
                    QUICK_REPLY -> Known.QUICK_REPLY
                    URL -> Known.URL
                    PHONE -> Known.PHONE
                    OTP -> Known.OTP
                    REQUEST_CONTACT_INFO -> Known.REQUEST_CONTACT_INFO
                    else -> throw ZavudevInvalidDataException("Unknown Type: $value")
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
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Required when type is 'otp'. COPY_CODE shows copy button, ONE_TAP enables Android
         * autofill.
         */
        class OtpType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val COPY_CODE = of("COPY_CODE")

                @JvmField val ONE_TAP = of("ONE_TAP")

                @JvmStatic fun of(value: String) = OtpType(JsonField.of(value))
            }

            /** An enum containing [OtpType]'s known values. */
            enum class Known {
                COPY_CODE,
                ONE_TAP,
            }

            /**
             * An enum containing [OtpType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OtpType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COPY_CODE,
                ONE_TAP,
                /**
                 * An enum member indicating that [OtpType] was instantiated with an unknown value.
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
                    COPY_CODE -> Value.COPY_CODE
                    ONE_TAP -> Value.ONE_TAP
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
                    COPY_CODE -> Known.COPY_CODE
                    ONE_TAP -> Known.ONE_TAP
                    else -> throw ZavudevInvalidDataException("Unknown OtpType: $value")
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
            fun validate(): OtpType = apply {
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

                return other is OtpType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Button &&
                type == other.type &&
                example == other.example &&
                otpType == other.otpType &&
                packageName == other.packageName &&
                phoneNumber == other.phoneNumber &&
                signatureHash == other.signatureHash &&
                text == other.text &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                example,
                otpType,
                packageName,
                phoneNumber,
                signatureHash,
                text,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Button{type=$type, example=$example, otpType=$otpType, packageName=$packageName, phoneNumber=$phoneNumber, signatureHash=$signatureHash, text=$text, url=$url, additionalProperties=$additionalProperties}"
    }

    /** Type of header for the template. */
    class HeaderType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TEXT = of("text")

            @JvmField val IMAGE = of("image")

            @JvmField val VIDEO = of("video")

            @JvmField val DOCUMENT = of("document")

            @JvmStatic fun of(value: String) = HeaderType(JsonField.of(value))
        }

        /** An enum containing [HeaderType]'s known values. */
        enum class Known {
            TEXT,
            IMAGE,
            VIDEO,
            DOCUMENT,
        }

        /**
         * An enum containing [HeaderType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [HeaderType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEXT,
            IMAGE,
            VIDEO,
            DOCUMENT,
            /**
             * An enum member indicating that [HeaderType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TEXT -> Value.TEXT
                IMAGE -> Value.IMAGE
                VIDEO -> Value.VIDEO
                DOCUMENT -> Value.DOCUMENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ZavudevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TEXT -> Known.TEXT
                IMAGE -> Known.IMAGE
                VIDEO -> Known.VIDEO
                DOCUMENT -> Known.DOCUMENT
                else -> throw ZavudevInvalidDataException("Unknown HeaderType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ZavudevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { ZavudevInvalidDataException("Value is not a String") }

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
        fun validate(): HeaderType = apply {
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

            return other is HeaderType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplateCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TemplateCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
