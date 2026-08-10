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
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Template
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val body: JsonField<String>,
    private val category: JsonField<WhatsappCategory>,
    private val language: JsonField<String>,
    private val name: JsonField<String>,
    private val addSecurityRecommendation: JsonField<Boolean>,
    private val buttons: JsonField<List<Button>>,
    private val codeExpirationMinutes: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val footer: JsonField<String>,
    private val headerContent: JsonField<String>,
    private val headerType: JsonField<String>,
    private val instagramBody: JsonField<String>,
    private val smsBody: JsonField<String>,
    private val status: JsonField<Status>,
    private val telegramBody: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val variables: JsonField<List<String>>,
    private val whatsapp: JsonField<Whatsapp>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<WhatsappCategory> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("footer") @ExcludeMissing footer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headerContent")
        @ExcludeMissing
        headerContent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headerType")
        @ExcludeMissing
        headerType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instagramBody")
        @ExcludeMissing
        instagramBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("smsBody") @ExcludeMissing smsBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("telegramBody")
        @ExcludeMissing
        telegramBody: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("variables")
        @ExcludeMissing
        variables: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("whatsapp") @ExcludeMissing whatsapp: JsonField<Whatsapp> = JsonMissing.of(),
    ) : this(
        id,
        body,
        category,
        language,
        name,
        addSecurityRecommendation,
        buttons,
        codeExpirationMinutes,
        createdAt,
        footer,
        headerContent,
        headerType,
        instagramBody,
        smsBody,
        status,
        telegramBody,
        updatedAt,
        variables,
        whatsapp,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Default template body with variables: positional ({{1}}, {{2}}) or named ({{customer_name}},
     * {{contact.first_name}}). Templates created in Zavu are submitted to Meta as positional;
     * templates imported from a WhatsApp Business Account keep their original format (named or
     * positional). Used when no channel-specific body is set.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun body(): String = body.getRequired("body")

    /**
     * WhatsApp template category.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): WhatsappCategory = category.getRequired("category")

    /**
     * Language code.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun language(): String = language.getRequired("language")

    /**
     * Template name. For WhatsApp, must match the approved template name in Meta.
     *
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
     * Template buttons.
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
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Footer text for the template.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun footer(): Optional<String> = footer.getOptional("footer")

    /**
     * Header content (text or media URL).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headerContent(): Optional<String> = headerContent.getOptional("headerContent")

    /**
     * Type of header (text, image, video, document).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headerType(): Optional<String> = headerType.getOptional("headerType")

    /**
     * Channel-specific body for Instagram messages. Falls back to `body` if not set.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instagramBody(): Optional<String> = instagramBody.getOptional("instagramBody")

    /**
     * Channel-specific body for SMS messages. Falls back to `body` if not set.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun smsBody(): Optional<String> = smsBody.getOptional("smsBody")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Channel-specific body for Telegram messages. Falls back to `body` if not set.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun telegramBody(): Optional<String> = telegramBody.getOptional("telegramBody")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * List of variable names for documentation.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun variables(): Optional<List<String>> = variables.getOptional("variables")

    /**
     * WhatsApp-specific template information.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whatsapp(): Optional<Whatsapp> = whatsapp.getOptional("whatsapp")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<String> = body

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category")
    @ExcludeMissing
    fun _category(): JsonField<WhatsappCategory> = category

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
     * Unlike [codeExpirationMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("codeExpirationMinutes")
    @ExcludeMissing
    fun _codeExpirationMinutes(): JsonField<Long> = codeExpirationMinutes

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [footer].
     *
     * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<String> = footer

    /**
     * Returns the raw JSON value of [headerContent].
     *
     * Unlike [headerContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headerContent")
    @ExcludeMissing
    fun _headerContent(): JsonField<String> = headerContent

    /**
     * Returns the raw JSON value of [headerType].
     *
     * Unlike [headerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headerType") @ExcludeMissing fun _headerType(): JsonField<String> = headerType

    /**
     * Returns the raw JSON value of [instagramBody].
     *
     * Unlike [instagramBody], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [telegramBody].
     *
     * Unlike [telegramBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("telegramBody")
    @ExcludeMissing
    fun _telegramBody(): JsonField<String> = telegramBody

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variables") @ExcludeMissing fun _variables(): JsonField<List<String>> = variables

    /**
     * Returns the raw JSON value of [whatsapp].
     *
     * Unlike [whatsapp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("whatsapp") @ExcludeMissing fun _whatsapp(): JsonField<Whatsapp> = whatsapp

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
         * Returns a mutable builder for constructing an instance of [Template].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .body()
         * .category()
         * .language()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Template]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var body: JsonField<String>? = null
        private var category: JsonField<WhatsappCategory>? = null
        private var language: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var addSecurityRecommendation: JsonField<Boolean> = JsonMissing.of()
        private var buttons: JsonField<MutableList<Button>>? = null
        private var codeExpirationMinutes: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var footer: JsonField<String> = JsonMissing.of()
        private var headerContent: JsonField<String> = JsonMissing.of()
        private var headerType: JsonField<String> = JsonMissing.of()
        private var instagramBody: JsonField<String> = JsonMissing.of()
        private var smsBody: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var telegramBody: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var variables: JsonField<MutableList<String>>? = null
        private var whatsapp: JsonField<Whatsapp> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(template: Template) = apply {
            id = template.id
            body = template.body
            category = template.category
            language = template.language
            name = template.name
            addSecurityRecommendation = template.addSecurityRecommendation
            buttons = template.buttons.map { it.toMutableList() }
            codeExpirationMinutes = template.codeExpirationMinutes
            createdAt = template.createdAt
            footer = template.footer
            headerContent = template.headerContent
            headerType = template.headerType
            instagramBody = template.instagramBody
            smsBody = template.smsBody
            status = template.status
            telegramBody = template.telegramBody
            updatedAt = template.updatedAt
            variables = template.variables.map { it.toMutableList() }
            whatsapp = template.whatsapp
            additionalProperties = template.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Default template body with variables: positional ({{1}}, {{2}}) or named
         * ({{customer_name}}, {{contact.first_name}}). Templates created in Zavu are submitted to
         * Meta as positional; templates imported from a WhatsApp Business Account keep their
         * original format (named or positional). Used when no channel-specific body is set.
         */
        fun body(body: String) = body(JsonField.of(body))

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: JsonField<String>) = apply { this.body = body }

        /** WhatsApp template category. */
        fun category(category: WhatsappCategory) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [WhatsappCategory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun category(category: JsonField<WhatsappCategory>) = apply { this.category = category }

        /** Language code. */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /** Template name. For WhatsApp, must match the approved template name in Meta. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Add 'Do not share this code' disclaimer. Only for AUTHENTICATION templates. */
        fun addSecurityRecommendation(addSecurityRecommendation: Boolean) =
            addSecurityRecommendation(JsonField.of(addSecurityRecommendation))

        /**
         * Sets [Builder.addSecurityRecommendation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addSecurityRecommendation] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addSecurityRecommendation(addSecurityRecommendation: JsonField<Boolean>) = apply {
            this.addSecurityRecommendation = addSecurityRecommendation
        }

        /** Template buttons. */
        fun buttons(buttons: List<Button>) = buttons(JsonField.of(buttons))

        /**
         * Sets [Builder.buttons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttons] with a well-typed `List<Button>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.codeExpirationMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun codeExpirationMinutes(codeExpirationMinutes: JsonField<Long>) = apply {
            this.codeExpirationMinutes = codeExpirationMinutes
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Footer text for the template. */
        fun footer(footer: String) = footer(JsonField.of(footer))

        /**
         * Sets [Builder.footer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun footer(footer: JsonField<String>) = apply { this.footer = footer }

        /** Header content (text or media URL). */
        fun headerContent(headerContent: String) = headerContent(JsonField.of(headerContent))

        /**
         * Sets [Builder.headerContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerContent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headerContent(headerContent: JsonField<String>) = apply {
            this.headerContent = headerContent
        }

        /** Type of header (text, image, video, document). */
        fun headerType(headerType: String) = headerType(JsonField.of(headerType))

        /**
         * Sets [Builder.headerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headerType(headerType: JsonField<String>) = apply { this.headerType = headerType }

        /** Channel-specific body for Instagram messages. Falls back to `body` if not set. */
        fun instagramBody(instagramBody: String) = instagramBody(JsonField.of(instagramBody))

        /**
         * Sets [Builder.instagramBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instagramBody] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instagramBody(instagramBody: JsonField<String>) = apply {
            this.instagramBody = instagramBody
        }

        /** Channel-specific body for SMS messages. Falls back to `body` if not set. */
        fun smsBody(smsBody: String) = smsBody(JsonField.of(smsBody))

        /**
         * Sets [Builder.smsBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.smsBody] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun smsBody(smsBody: JsonField<String>) = apply { this.smsBody = smsBody }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Channel-specific body for Telegram messages. Falls back to `body` if not set. */
        fun telegramBody(telegramBody: String) = telegramBody(JsonField.of(telegramBody))

        /**
         * Sets [Builder.telegramBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telegramBody] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun telegramBody(telegramBody: JsonField<String>) = apply {
            this.telegramBody = telegramBody
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** List of variable names for documentation. */
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

        /** WhatsApp-specific template information. */
        fun whatsapp(whatsapp: Whatsapp) = whatsapp(JsonField.of(whatsapp))

        /**
         * Sets [Builder.whatsapp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whatsapp] with a well-typed [Whatsapp] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun whatsapp(whatsapp: JsonField<Whatsapp>) = apply { this.whatsapp = whatsapp }

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
         * Returns an immutable instance of [Template].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .body()
         * .category()
         * .language()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Template =
            Template(
                checkRequired("id", id),
                checkRequired("body", body),
                checkRequired("category", category),
                checkRequired("language", language),
                checkRequired("name", name),
                addSecurityRecommendation,
                (buttons ?: JsonMissing.of()).map { it.toImmutable() },
                codeExpirationMinutes,
                createdAt,
                footer,
                headerContent,
                headerType,
                instagramBody,
                smsBody,
                status,
                telegramBody,
                updatedAt,
                (variables ?: JsonMissing.of()).map { it.toImmutable() },
                whatsapp,
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
    fun validate(): Template = apply {
        if (validated) {
            return@apply
        }

        id()
        body()
        category().validate()
        language()
        name()
        addSecurityRecommendation()
        buttons().ifPresent { it.forEach { it.validate() } }
        codeExpirationMinutes()
        createdAt()
        footer()
        headerContent()
        headerType()
        instagramBody()
        smsBody()
        status().ifPresent { it.validate() }
        telegramBody()
        updatedAt()
        variables()
        whatsapp().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (body.asKnown().isPresent) 1 else 0) +
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (addSecurityRecommendation.asKnown().isPresent) 1 else 0) +
            (buttons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (codeExpirationMinutes.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (footer.asKnown().isPresent) 1 else 0) +
            (if (headerContent.asKnown().isPresent) 1 else 0) +
            (if (headerType.asKnown().isPresent) 1 else 0) +
            (if (instagramBody.asKnown().isPresent) 1 else 0) +
            (if (smsBody.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (telegramBody.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (variables.asKnown().getOrNull()?.size ?: 0) +
            (whatsapp.asKnown().getOrNull()?.validity() ?: 0)

    class Button
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val example: JsonField<String>,
        private val otpType: JsonField<OtpType>,
        private val packageName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val signatureHash: JsonField<String>,
        private val text: JsonField<String>,
        private val type: JsonField<Type>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            example,
            otpType,
            packageName,
            phoneNumber,
            signatureHash,
            text,
            type,
            url,
            mutableMapOf(),
        )

        /**
         * Sample value used to substitute `{{1}}` in the URL when submitting the template to Meta
         * for review. Only present for dynamic URL buttons.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun example(): Optional<String> = example.getOptional("example")

        /**
         * OTP button type. Required when type is 'otp'.
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
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Button]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Button]. */
        class Builder internal constructor() {

            private var example: JsonField<String> = JsonMissing.of()
            private var otpType: JsonField<OtpType> = JsonMissing.of()
            private var packageName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var signatureHash: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(button: Button) = apply {
                example = button.example
                otpType = button.otpType
                packageName = button.packageName
                phoneNumber = button.phoneNumber
                signatureHash = button.signatureHash
                text = button.text
                type = button.type
                url = button.url
                additionalProperties = button.additionalProperties.toMutableMap()
            }

            /**
             * Sample value used to substitute `{{1}}` in the URL when submitting the template to
             * Meta for review. Only present for dynamic URL buttons.
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

            /** OTP button type. Required when type is 'otp'. */
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

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             */
            fun build(): Button =
                Button(
                    example,
                    otpType,
                    packageName,
                    phoneNumber,
                    signatureHash,
                    text,
                    type,
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

            example()
            otpType().ifPresent { it.validate() }
            packageName()
            phoneNumber()
            signatureHash()
            text()
            type().ifPresent { it.validate() }
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
            (if (example.asKnown().isPresent) 1 else 0) +
                (otpType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (packageName.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (signatureHash.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        /** OTP button type. Required when type is 'otp'. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Button &&
                example == other.example &&
                otpType == other.otpType &&
                packageName == other.packageName &&
                phoneNumber == other.phoneNumber &&
                signatureHash == other.signatureHash &&
                text == other.text &&
                type == other.type &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                example,
                otpType,
                packageName,
                phoneNumber,
                signatureHash,
                text,
                type,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Button{example=$example, otpType=$otpType, packageName=$packageName, phoneNumber=$phoneNumber, signatureHash=$signatureHash, text=$text, type=$type, url=$url, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DRAFT = of("draft")

            @JvmField val PENDING = of("pending")

            @JvmField val APPROVED = of("approved")

            @JvmField val REJECTED = of("rejected")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            PENDING,
            APPROVED,
            REJECTED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            PENDING,
            APPROVED,
            REJECTED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                DRAFT -> Value.DRAFT
                PENDING -> Value.PENDING
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
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
                DRAFT -> Known.DRAFT
                PENDING -> Known.PENDING
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                else -> throw ZavudevInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** WhatsApp-specific template information. */
    class Whatsapp
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val namespace: JsonField<String>,
        private val status: JsonField<String>,
        private val templateName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("namespace")
            @ExcludeMissing
            namespace: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("templateName")
            @ExcludeMissing
            templateName: JsonField<String> = JsonMissing.of(),
        ) : this(namespace, status, templateName, mutableMapOf())

        /**
         * WhatsApp Business Account namespace.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun namespace(): Optional<String> = namespace.getOptional("namespace")

        /**
         * WhatsApp approval status.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * WhatsApp template name.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateName(): Optional<String> = templateName.getOptional("templateName")

        /**
         * Returns the raw JSON value of [namespace].
         *
         * Unlike [namespace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("namespace") @ExcludeMissing fun _namespace(): JsonField<String> = namespace

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [templateName].
         *
         * Unlike [templateName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("templateName")
        @ExcludeMissing
        fun _templateName(): JsonField<String> = templateName

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

            /** Returns a mutable builder for constructing an instance of [Whatsapp]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Whatsapp]. */
        class Builder internal constructor() {

            private var namespace: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var templateName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(whatsapp: Whatsapp) = apply {
                namespace = whatsapp.namespace
                status = whatsapp.status
                templateName = whatsapp.templateName
                additionalProperties = whatsapp.additionalProperties.toMutableMap()
            }

            /** WhatsApp Business Account namespace. */
            fun namespace(namespace: String) = namespace(JsonField.of(namespace))

            /**
             * Sets [Builder.namespace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.namespace] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun namespace(namespace: JsonField<String>) = apply { this.namespace = namespace }

            /** WhatsApp approval status. */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** WhatsApp template name. */
            fun templateName(templateName: String) = templateName(JsonField.of(templateName))

            /**
             * Sets [Builder.templateName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateName(templateName: JsonField<String>) = apply {
                this.templateName = templateName
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
             * Returns an immutable instance of [Whatsapp].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Whatsapp =
                Whatsapp(namespace, status, templateName, additionalProperties.toMutableMap())
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
        fun validate(): Whatsapp = apply {
            if (validated) {
                return@apply
            }

            namespace()
            status()
            templateName()
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
            (if (namespace.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (templateName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Whatsapp &&
                namespace == other.namespace &&
                status == other.status &&
                templateName == other.templateName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(namespace, status, templateName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Whatsapp{namespace=$namespace, status=$status, templateName=$templateName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Template &&
            id == other.id &&
            body == other.body &&
            category == other.category &&
            language == other.language &&
            name == other.name &&
            addSecurityRecommendation == other.addSecurityRecommendation &&
            buttons == other.buttons &&
            codeExpirationMinutes == other.codeExpirationMinutes &&
            createdAt == other.createdAt &&
            footer == other.footer &&
            headerContent == other.headerContent &&
            headerType == other.headerType &&
            instagramBody == other.instagramBody &&
            smsBody == other.smsBody &&
            status == other.status &&
            telegramBody == other.telegramBody &&
            updatedAt == other.updatedAt &&
            variables == other.variables &&
            whatsapp == other.whatsapp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            body,
            category,
            language,
            name,
            addSecurityRecommendation,
            buttons,
            codeExpirationMinutes,
            createdAt,
            footer,
            headerContent,
            headerType,
            instagramBody,
            smsBody,
            status,
            telegramBody,
            updatedAt,
            variables,
            whatsapp,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Template{id=$id, body=$body, category=$category, language=$language, name=$name, addSecurityRecommendation=$addSecurityRecommendation, buttons=$buttons, codeExpirationMinutes=$codeExpirationMinutes, createdAt=$createdAt, footer=$footer, headerContent=$headerContent, headerType=$headerType, instagramBody=$instagramBody, smsBody=$smsBody, status=$status, telegramBody=$telegramBody, updatedAt=$updatedAt, variables=$variables, whatsapp=$whatsapp, additionalProperties=$additionalProperties}"
}
