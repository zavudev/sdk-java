// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Content for non-text message types (WhatsApp and Telegram). */
class MessageContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buttons: JsonField<List<Button>>,
    private val contacts: JsonField<List<Contact>>,
    private val ctaDisplayText: JsonField<String>,
    private val ctaHeaderMediaUrl: JsonField<String>,
    private val ctaHeaderText: JsonField<String>,
    private val ctaHeaderType: JsonField<CtaHeaderType>,
    private val ctaUrl: JsonField<String>,
    private val emoji: JsonField<String>,
    private val filename: JsonField<String>,
    private val footerText: JsonField<String>,
    private val latitude: JsonField<Double>,
    private val listButton: JsonField<String>,
    private val locationAddress: JsonField<String>,
    private val locationName: JsonField<String>,
    private val longitude: JsonField<Double>,
    private val mediaId: JsonField<String>,
    private val mediaUrl: JsonField<String>,
    private val mimeType: JsonField<String>,
    private val reactToMessageId: JsonField<String>,
    private val replyToFrom: JsonField<String>,
    private val replyToMessageId: JsonField<String>,
    private val replyToMessageType: JsonField<String>,
    private val replyToProviderMessageId: JsonField<String>,
    private val replyToText: JsonField<String>,
    private val sections: JsonField<List<Section>>,
    private val templateButtonVariables: JsonField<TemplateButtonVariables>,
    private val templateHeaderVariables: JsonField<TemplateHeaderVariables>,
    private val templateId: JsonField<String>,
    private val templateVariables: JsonField<TemplateVariables>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("buttons")
        @ExcludeMissing
        buttons: JsonField<List<Button>> = JsonMissing.of(),
        @JsonProperty("contacts")
        @ExcludeMissing
        contacts: JsonField<List<Contact>> = JsonMissing.of(),
        @JsonProperty("ctaDisplayText")
        @ExcludeMissing
        ctaDisplayText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ctaHeaderMediaUrl")
        @ExcludeMissing
        ctaHeaderMediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ctaHeaderText")
        @ExcludeMissing
        ctaHeaderText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ctaHeaderType")
        @ExcludeMissing
        ctaHeaderType: JsonField<CtaHeaderType> = JsonMissing.of(),
        @JsonProperty("ctaUrl") @ExcludeMissing ctaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emoji") @ExcludeMissing emoji: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("footerText")
        @ExcludeMissing
        footerText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latitude") @ExcludeMissing latitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("listButton")
        @ExcludeMissing
        listButton: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locationAddress")
        @ExcludeMissing
        locationAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locationName")
        @ExcludeMissing
        locationName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("longitude") @ExcludeMissing longitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mediaId") @ExcludeMissing mediaId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaUrl") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mimeType") @ExcludeMissing mimeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reactToMessageId")
        @ExcludeMissing
        reactToMessageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replyToFrom")
        @ExcludeMissing
        replyToFrom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replyToMessageId")
        @ExcludeMissing
        replyToMessageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replyToMessageType")
        @ExcludeMissing
        replyToMessageType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replyToProviderMessageId")
        @ExcludeMissing
        replyToProviderMessageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replyToText")
        @ExcludeMissing
        replyToText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sections")
        @ExcludeMissing
        sections: JsonField<List<Section>> = JsonMissing.of(),
        @JsonProperty("templateButtonVariables")
        @ExcludeMissing
        templateButtonVariables: JsonField<TemplateButtonVariables> = JsonMissing.of(),
        @JsonProperty("templateHeaderVariables")
        @ExcludeMissing
        templateHeaderVariables: JsonField<TemplateHeaderVariables> = JsonMissing.of(),
        @JsonProperty("templateId")
        @ExcludeMissing
        templateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("templateVariables")
        @ExcludeMissing
        templateVariables: JsonField<TemplateVariables> = JsonMissing.of(),
    ) : this(
        buttons,
        contacts,
        ctaDisplayText,
        ctaHeaderMediaUrl,
        ctaHeaderText,
        ctaHeaderType,
        ctaUrl,
        emoji,
        filename,
        footerText,
        latitude,
        listButton,
        locationAddress,
        locationName,
        longitude,
        mediaId,
        mediaUrl,
        mimeType,
        reactToMessageId,
        replyToFrom,
        replyToMessageId,
        replyToMessageType,
        replyToProviderMessageId,
        replyToText,
        sections,
        templateButtonVariables,
        templateHeaderVariables,
        templateId,
        templateVariables,
        mutableMapOf(),
    )

    /**
     * Interactive buttons (max 3).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun buttons(): Optional<List<Button>> = buttons.getOptional("buttons")

    /**
     * Contact cards for contact messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contacts(): Optional<List<Contact>> = contacts.getOptional("contacts")

    /**
     * Button label for cta_url messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ctaDisplayText(): Optional<String> = ctaDisplayText.getOptional("ctaDisplayText")

    /**
     * Public HTTPS URL of the header media when ctaHeaderType is 'image', 'video', or 'document'.
     * WhatsApp fetches this URL — it must be publicly reachable and return the declared content
     * type.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ctaHeaderMediaUrl(): Optional<String> = ctaHeaderMediaUrl.getOptional("ctaHeaderMediaUrl")

    /**
     * Header text when ctaHeaderType is 'text'.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ctaHeaderText(): Optional<String> = ctaHeaderText.getOptional("ctaHeaderText")

    /**
     * Optional header type for cta_url messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ctaHeaderType(): Optional<CtaHeaderType> = ctaHeaderType.getOptional("ctaHeaderType")

    /**
     * Destination URL opened in the device's default browser when the button is tapped. Used with
     * messageType=cta_url. WhatsApp requires HTTPS in production.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ctaUrl(): Optional<String> = ctaUrl.getOptional("ctaUrl")

    /**
     * Emoji for reaction messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emoji(): Optional<String> = emoji.getOptional("emoji")

    /**
     * Filename for documents.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * Optional footer text for cta_url messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun footerText(): Optional<String> = footerText.getOptional("footerText")

    /**
     * Latitude for location messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latitude(): Optional<Double> = latitude.getOptional("latitude")

    /**
     * Button text for list messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listButton(): Optional<String> = listButton.getOptional("listButton")

    /**
     * Address of the location.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locationAddress(): Optional<String> = locationAddress.getOptional("locationAddress")

    /**
     * Name of the location.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locationName(): Optional<String> = locationName.getOptional("locationName")

    /**
     * Longitude for location messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun longitude(): Optional<Double> = longitude.getOptional("longitude")

    /**
     * WhatsApp media ID if already uploaded.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaId(): Optional<String> = mediaId.getOptional("mediaId")

    /**
     * URL of the media file (for image, video, audio, document, sticker).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = mediaUrl.getOptional("mediaUrl")

    /**
     * MIME type of the media.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mimeType(): Optional<String> = mimeType.getOptional("mimeType")

    /**
     * Message ID to react to.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reactToMessageId(): Optional<String> = reactToMessageId.getOptional("reactToMessageId")

    /**
     * Sender of the quoted message (phone number in E.164 format).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyToFrom(): Optional<String> = replyToFrom.getOptional("replyToFrom")

    /**
     * Zavu message ID of the quoted message this message replies to. Present on inbound messages
     * that quote an earlier message. Omitted when the quoted message is not found in Zavu (e.g. an
     * old or unknown message) — use replyToProviderMessageId in that case.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyToMessageId(): Optional<String> = replyToMessageId.getOptional("replyToMessageId")

    /**
     * Type of the quoted message (text, image, video, etc.).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyToMessageType(): Optional<String> =
        replyToMessageType.getOptional("replyToMessageType")

    /**
     * Provider message ID (WhatsApp WAMID) of the quoted message. Present whenever an inbound
     * message is a reply, even if the quoted message is not stored in Zavu.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyToProviderMessageId(): Optional<String> =
        replyToProviderMessageId.getOptional("replyToProviderMessageId")

    /**
     * Truncated snippet of the quoted message's text, for display. Empty when the quoted message
     * has no text (e.g. media).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyToText(): Optional<String> = replyToText.getOptional("replyToText")

    /**
     * Sections for list messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sections(): Optional<List<Section>> = sections.getOptional("sections")

    /**
     * Variables for dynamic button placeholders (URL buttons and OTP buttons). Keys are the button
     * index (0, 1, 2) in the template's `buttons` array — not the placeholder name. Values
     * substitute the `{{1}}` placeholder inside that button's URL.
     *
     * **WhatsApp constraints:**
     * - URL buttons only accept `{{1}}` — positional, numeric, no whitespace, no name. Named
     *   placeholders like `{{token}}` are stored as literal URL text by Meta and cannot be
     *   substituted.
     * - At most one placeholder per URL button.
     * - A template may have at most three buttons.
     * - Static URL buttons (no placeholder) and `quick_reply` buttons are not included here.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateButtonVariables(): Optional<TemplateButtonVariables> =
        templateButtonVariables.getOptional("templateButtonVariables")

    /**
     * Value for a text-header variable, keyed by `1` (WhatsApp text headers allow at most one
     * variable). Optional override. If omitted, Zavu resolves the header from `templateVariables`
     * using the header placeholder's name (e.g. `novios`). Static text headers need no value.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateHeaderVariables(): Optional<TemplateHeaderVariables> =
        templateHeaderVariables.getOptional("templateHeaderVariables")

    /**
     * Template ID for template messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateId(): Optional<String> = templateId.getOptional("templateId")

    /**
     * Variables for body placeholders. Key them to match the template body: by position (`1`, `2`,
     * ...) for positional templates, or by name (e.g. `customer_name`) for named templates. Zavu
     * detects the template's format and sends the correct payload to Meta. Named keys also resolve
     * a named text-header variable. Do not mix positional and named keys in the same request.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateVariables(): Optional<TemplateVariables> =
        templateVariables.getOptional("templateVariables")

    /**
     * Returns the raw JSON value of [buttons].
     *
     * Unlike [buttons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buttons") @ExcludeMissing fun _buttons(): JsonField<List<Button>> = buttons

    /**
     * Returns the raw JSON value of [contacts].
     *
     * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contacts") @ExcludeMissing fun _contacts(): JsonField<List<Contact>> = contacts

    /**
     * Returns the raw JSON value of [ctaDisplayText].
     *
     * Unlike [ctaDisplayText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ctaDisplayText")
    @ExcludeMissing
    fun _ctaDisplayText(): JsonField<String> = ctaDisplayText

    /**
     * Returns the raw JSON value of [ctaHeaderMediaUrl].
     *
     * Unlike [ctaHeaderMediaUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ctaHeaderMediaUrl")
    @ExcludeMissing
    fun _ctaHeaderMediaUrl(): JsonField<String> = ctaHeaderMediaUrl

    /**
     * Returns the raw JSON value of [ctaHeaderText].
     *
     * Unlike [ctaHeaderText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ctaHeaderText")
    @ExcludeMissing
    fun _ctaHeaderText(): JsonField<String> = ctaHeaderText

    /**
     * Returns the raw JSON value of [ctaHeaderType].
     *
     * Unlike [ctaHeaderType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ctaHeaderType")
    @ExcludeMissing
    fun _ctaHeaderType(): JsonField<CtaHeaderType> = ctaHeaderType

    /**
     * Returns the raw JSON value of [ctaUrl].
     *
     * Unlike [ctaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ctaUrl") @ExcludeMissing fun _ctaUrl(): JsonField<String> = ctaUrl

    /**
     * Returns the raw JSON value of [emoji].
     *
     * Unlike [emoji], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emoji") @ExcludeMissing fun _emoji(): JsonField<String> = emoji

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * Returns the raw JSON value of [footerText].
     *
     * Unlike [footerText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("footerText") @ExcludeMissing fun _footerText(): JsonField<String> = footerText

    /**
     * Returns the raw JSON value of [latitude].
     *
     * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

    /**
     * Returns the raw JSON value of [listButton].
     *
     * Unlike [listButton], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listButton") @ExcludeMissing fun _listButton(): JsonField<String> = listButton

    /**
     * Returns the raw JSON value of [locationAddress].
     *
     * Unlike [locationAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locationAddress")
    @ExcludeMissing
    fun _locationAddress(): JsonField<String> = locationAddress

    /**
     * Returns the raw JSON value of [locationName].
     *
     * Unlike [locationName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locationName")
    @ExcludeMissing
    fun _locationName(): JsonField<String> = locationName

    /**
     * Returns the raw JSON value of [longitude].
     *
     * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<Double> = longitude

    /**
     * Returns the raw JSON value of [mediaId].
     *
     * Unlike [mediaId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaId") @ExcludeMissing fun _mediaId(): JsonField<String> = mediaId

    /**
     * Returns the raw JSON value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaUrl") @ExcludeMissing fun _mediaUrl(): JsonField<String> = mediaUrl

    /**
     * Returns the raw JSON value of [mimeType].
     *
     * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mimeType") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

    /**
     * Returns the raw JSON value of [reactToMessageId].
     *
     * Unlike [reactToMessageId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reactToMessageId")
    @ExcludeMissing
    fun _reactToMessageId(): JsonField<String> = reactToMessageId

    /**
     * Returns the raw JSON value of [replyToFrom].
     *
     * Unlike [replyToFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("replyToFrom") @ExcludeMissing fun _replyToFrom(): JsonField<String> = replyToFrom

    /**
     * Returns the raw JSON value of [replyToMessageId].
     *
     * Unlike [replyToMessageId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("replyToMessageId")
    @ExcludeMissing
    fun _replyToMessageId(): JsonField<String> = replyToMessageId

    /**
     * Returns the raw JSON value of [replyToMessageType].
     *
     * Unlike [replyToMessageType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("replyToMessageType")
    @ExcludeMissing
    fun _replyToMessageType(): JsonField<String> = replyToMessageType

    /**
     * Returns the raw JSON value of [replyToProviderMessageId].
     *
     * Unlike [replyToProviderMessageId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("replyToProviderMessageId")
    @ExcludeMissing
    fun _replyToProviderMessageId(): JsonField<String> = replyToProviderMessageId

    /**
     * Returns the raw JSON value of [replyToText].
     *
     * Unlike [replyToText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("replyToText") @ExcludeMissing fun _replyToText(): JsonField<String> = replyToText

    /**
     * Returns the raw JSON value of [sections].
     *
     * Unlike [sections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sections") @ExcludeMissing fun _sections(): JsonField<List<Section>> = sections

    /**
     * Returns the raw JSON value of [templateButtonVariables].
     *
     * Unlike [templateButtonVariables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("templateButtonVariables")
    @ExcludeMissing
    fun _templateButtonVariables(): JsonField<TemplateButtonVariables> = templateButtonVariables

    /**
     * Returns the raw JSON value of [templateHeaderVariables].
     *
     * Unlike [templateHeaderVariables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("templateHeaderVariables")
    @ExcludeMissing
    fun _templateHeaderVariables(): JsonField<TemplateHeaderVariables> = templateHeaderVariables

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templateId") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

    /**
     * Returns the raw JSON value of [templateVariables].
     *
     * Unlike [templateVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("templateVariables")
    @ExcludeMissing
    fun _templateVariables(): JsonField<TemplateVariables> = templateVariables

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

        /** Returns a mutable builder for constructing an instance of [MessageContent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageContent]. */
    class Builder internal constructor() {

        private var buttons: JsonField<MutableList<Button>>? = null
        private var contacts: JsonField<MutableList<Contact>>? = null
        private var ctaDisplayText: JsonField<String> = JsonMissing.of()
        private var ctaHeaderMediaUrl: JsonField<String> = JsonMissing.of()
        private var ctaHeaderText: JsonField<String> = JsonMissing.of()
        private var ctaHeaderType: JsonField<CtaHeaderType> = JsonMissing.of()
        private var ctaUrl: JsonField<String> = JsonMissing.of()
        private var emoji: JsonField<String> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var footerText: JsonField<String> = JsonMissing.of()
        private var latitude: JsonField<Double> = JsonMissing.of()
        private var listButton: JsonField<String> = JsonMissing.of()
        private var locationAddress: JsonField<String> = JsonMissing.of()
        private var locationName: JsonField<String> = JsonMissing.of()
        private var longitude: JsonField<Double> = JsonMissing.of()
        private var mediaId: JsonField<String> = JsonMissing.of()
        private var mediaUrl: JsonField<String> = JsonMissing.of()
        private var mimeType: JsonField<String> = JsonMissing.of()
        private var reactToMessageId: JsonField<String> = JsonMissing.of()
        private var replyToFrom: JsonField<String> = JsonMissing.of()
        private var replyToMessageId: JsonField<String> = JsonMissing.of()
        private var replyToMessageType: JsonField<String> = JsonMissing.of()
        private var replyToProviderMessageId: JsonField<String> = JsonMissing.of()
        private var replyToText: JsonField<String> = JsonMissing.of()
        private var sections: JsonField<MutableList<Section>>? = null
        private var templateButtonVariables: JsonField<TemplateButtonVariables> = JsonMissing.of()
        private var templateHeaderVariables: JsonField<TemplateHeaderVariables> = JsonMissing.of()
        private var templateId: JsonField<String> = JsonMissing.of()
        private var templateVariables: JsonField<TemplateVariables> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageContent: MessageContent) = apply {
            buttons = messageContent.buttons.map { it.toMutableList() }
            contacts = messageContent.contacts.map { it.toMutableList() }
            ctaDisplayText = messageContent.ctaDisplayText
            ctaHeaderMediaUrl = messageContent.ctaHeaderMediaUrl
            ctaHeaderText = messageContent.ctaHeaderText
            ctaHeaderType = messageContent.ctaHeaderType
            ctaUrl = messageContent.ctaUrl
            emoji = messageContent.emoji
            filename = messageContent.filename
            footerText = messageContent.footerText
            latitude = messageContent.latitude
            listButton = messageContent.listButton
            locationAddress = messageContent.locationAddress
            locationName = messageContent.locationName
            longitude = messageContent.longitude
            mediaId = messageContent.mediaId
            mediaUrl = messageContent.mediaUrl
            mimeType = messageContent.mimeType
            reactToMessageId = messageContent.reactToMessageId
            replyToFrom = messageContent.replyToFrom
            replyToMessageId = messageContent.replyToMessageId
            replyToMessageType = messageContent.replyToMessageType
            replyToProviderMessageId = messageContent.replyToProviderMessageId
            replyToText = messageContent.replyToText
            sections = messageContent.sections.map { it.toMutableList() }
            templateButtonVariables = messageContent.templateButtonVariables
            templateHeaderVariables = messageContent.templateHeaderVariables
            templateId = messageContent.templateId
            templateVariables = messageContent.templateVariables
            additionalProperties = messageContent.additionalProperties.toMutableMap()
        }

        /** Interactive buttons (max 3). */
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

        /** Contact cards for contact messages. */
        fun contacts(contacts: List<Contact>) = contacts(JsonField.of(contacts))

        /**
         * Sets [Builder.contacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contacts] with a well-typed `List<Contact>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contacts(contacts: JsonField<List<Contact>>) = apply {
            this.contacts = contacts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Contact] to [contacts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContact(contact: Contact) = apply {
            contacts =
                (contacts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contacts", it).add(contact)
                }
        }

        /** Button label for cta_url messages. */
        fun ctaDisplayText(ctaDisplayText: String) = ctaDisplayText(JsonField.of(ctaDisplayText))

        /**
         * Sets [Builder.ctaDisplayText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ctaDisplayText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ctaDisplayText(ctaDisplayText: JsonField<String>) = apply {
            this.ctaDisplayText = ctaDisplayText
        }

        /**
         * Public HTTPS URL of the header media when ctaHeaderType is 'image', 'video', or
         * 'document'. WhatsApp fetches this URL — it must be publicly reachable and return the
         * declared content type.
         */
        fun ctaHeaderMediaUrl(ctaHeaderMediaUrl: String) =
            ctaHeaderMediaUrl(JsonField.of(ctaHeaderMediaUrl))

        /**
         * Sets [Builder.ctaHeaderMediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ctaHeaderMediaUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ctaHeaderMediaUrl(ctaHeaderMediaUrl: JsonField<String>) = apply {
            this.ctaHeaderMediaUrl = ctaHeaderMediaUrl
        }

        /** Header text when ctaHeaderType is 'text'. */
        fun ctaHeaderText(ctaHeaderText: String) = ctaHeaderText(JsonField.of(ctaHeaderText))

        /**
         * Sets [Builder.ctaHeaderText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ctaHeaderText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ctaHeaderText(ctaHeaderText: JsonField<String>) = apply {
            this.ctaHeaderText = ctaHeaderText
        }

        /** Optional header type for cta_url messages. */
        fun ctaHeaderType(ctaHeaderType: CtaHeaderType) = ctaHeaderType(JsonField.of(ctaHeaderType))

        /**
         * Sets [Builder.ctaHeaderType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ctaHeaderType] with a well-typed [CtaHeaderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ctaHeaderType(ctaHeaderType: JsonField<CtaHeaderType>) = apply {
            this.ctaHeaderType = ctaHeaderType
        }

        /**
         * Destination URL opened in the device's default browser when the button is tapped. Used
         * with messageType=cta_url. WhatsApp requires HTTPS in production.
         */
        fun ctaUrl(ctaUrl: String) = ctaUrl(JsonField.of(ctaUrl))

        /**
         * Sets [Builder.ctaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ctaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ctaUrl(ctaUrl: JsonField<String>) = apply { this.ctaUrl = ctaUrl }

        /** Emoji for reaction messages. */
        fun emoji(emoji: String) = emoji(JsonField.of(emoji))

        /**
         * Sets [Builder.emoji] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emoji] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emoji(emoji: JsonField<String>) = apply { this.emoji = emoji }

        /** Filename for documents. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** Optional footer text for cta_url messages. */
        fun footerText(footerText: String) = footerText(JsonField.of(footerText))

        /**
         * Sets [Builder.footerText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footerText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun footerText(footerText: JsonField<String>) = apply { this.footerText = footerText }

        /** Latitude for location messages. */
        fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

        /**
         * Sets [Builder.latitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latitude] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

        /** Button text for list messages. */
        fun listButton(listButton: String) = listButton(JsonField.of(listButton))

        /**
         * Sets [Builder.listButton] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listButton] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun listButton(listButton: JsonField<String>) = apply { this.listButton = listButton }

        /** Address of the location. */
        fun locationAddress(locationAddress: String) =
            locationAddress(JsonField.of(locationAddress))

        /**
         * Sets [Builder.locationAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locationAddress(locationAddress: JsonField<String>) = apply {
            this.locationAddress = locationAddress
        }

        /** Name of the location. */
        fun locationName(locationName: String) = locationName(JsonField.of(locationName))

        /**
         * Sets [Builder.locationName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locationName(locationName: JsonField<String>) = apply {
            this.locationName = locationName
        }

        /** Longitude for location messages. */
        fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

        /**
         * Sets [Builder.longitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

        /** WhatsApp media ID if already uploaded. */
        fun mediaId(mediaId: String) = mediaId(JsonField.of(mediaId))

        /**
         * Sets [Builder.mediaId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaId(mediaId: JsonField<String>) = apply { this.mediaId = mediaId }

        /** URL of the media file (for image, video, audio, document, sticker). */
        fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

        /** MIME type of the media. */
        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /**
         * Sets [Builder.mimeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

        /** Message ID to react to. */
        fun reactToMessageId(reactToMessageId: String) =
            reactToMessageId(JsonField.of(reactToMessageId))

        /**
         * Sets [Builder.reactToMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reactToMessageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reactToMessageId(reactToMessageId: JsonField<String>) = apply {
            this.reactToMessageId = reactToMessageId
        }

        /** Sender of the quoted message (phone number in E.164 format). */
        fun replyToFrom(replyToFrom: String) = replyToFrom(JsonField.of(replyToFrom))

        /**
         * Sets [Builder.replyToFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyToFrom] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun replyToFrom(replyToFrom: JsonField<String>) = apply { this.replyToFrom = replyToFrom }

        /**
         * Zavu message ID of the quoted message this message replies to. Present on inbound
         * messages that quote an earlier message. Omitted when the quoted message is not found in
         * Zavu (e.g. an old or unknown message) — use replyToProviderMessageId in that case.
         */
        fun replyToMessageId(replyToMessageId: String) =
            replyToMessageId(JsonField.of(replyToMessageId))

        /**
         * Sets [Builder.replyToMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyToMessageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replyToMessageId(replyToMessageId: JsonField<String>) = apply {
            this.replyToMessageId = replyToMessageId
        }

        /** Type of the quoted message (text, image, video, etc.). */
        fun replyToMessageType(replyToMessageType: String) =
            replyToMessageType(JsonField.of(replyToMessageType))

        /**
         * Sets [Builder.replyToMessageType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyToMessageType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replyToMessageType(replyToMessageType: JsonField<String>) = apply {
            this.replyToMessageType = replyToMessageType
        }

        /**
         * Provider message ID (WhatsApp WAMID) of the quoted message. Present whenever an inbound
         * message is a reply, even if the quoted message is not stored in Zavu.
         */
        fun replyToProviderMessageId(replyToProviderMessageId: String) =
            replyToProviderMessageId(JsonField.of(replyToProviderMessageId))

        /**
         * Sets [Builder.replyToProviderMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyToProviderMessageId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun replyToProviderMessageId(replyToProviderMessageId: JsonField<String>) = apply {
            this.replyToProviderMessageId = replyToProviderMessageId
        }

        /**
         * Truncated snippet of the quoted message's text, for display. Empty when the quoted
         * message has no text (e.g. media).
         */
        fun replyToText(replyToText: String) = replyToText(JsonField.of(replyToText))

        /**
         * Sets [Builder.replyToText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyToText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun replyToText(replyToText: JsonField<String>) = apply { this.replyToText = replyToText }

        /** Sections for list messages. */
        fun sections(sections: List<Section>) = sections(JsonField.of(sections))

        /**
         * Sets [Builder.sections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sections] with a well-typed `List<Section>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sections(sections: JsonField<List<Section>>) = apply {
            this.sections = sections.map { it.toMutableList() }
        }

        /**
         * Adds a single [Section] to [sections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSection(section: Section) = apply {
            sections =
                (sections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sections", it).add(section)
                }
        }

        /**
         * Variables for dynamic button placeholders (URL buttons and OTP buttons). Keys are the
         * button index (0, 1, 2) in the template's `buttons` array — not the placeholder name.
         * Values substitute the `{{1}}` placeholder inside that button's URL.
         *
         * **WhatsApp constraints:**
         * - URL buttons only accept `{{1}}` — positional, numeric, no whitespace, no name. Named
         *   placeholders like `{{token}}` are stored as literal URL text by Meta and cannot be
         *   substituted.
         * - At most one placeholder per URL button.
         * - A template may have at most three buttons.
         * - Static URL buttons (no placeholder) and `quick_reply` buttons are not included here.
         */
        fun templateButtonVariables(templateButtonVariables: TemplateButtonVariables) =
            templateButtonVariables(JsonField.of(templateButtonVariables))

        /**
         * Sets [Builder.templateButtonVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateButtonVariables] with a well-typed
         * [TemplateButtonVariables] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun templateButtonVariables(templateButtonVariables: JsonField<TemplateButtonVariables>) =
            apply {
                this.templateButtonVariables = templateButtonVariables
            }

        /**
         * Value for a text-header variable, keyed by `1` (WhatsApp text headers allow at most one
         * variable). Optional override. If omitted, Zavu resolves the header from
         * `templateVariables` using the header placeholder's name (e.g. `novios`). Static text
         * headers need no value.
         */
        fun templateHeaderVariables(templateHeaderVariables: TemplateHeaderVariables) =
            templateHeaderVariables(JsonField.of(templateHeaderVariables))

        /**
         * Sets [Builder.templateHeaderVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateHeaderVariables] with a well-typed
         * [TemplateHeaderVariables] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun templateHeaderVariables(templateHeaderVariables: JsonField<TemplateHeaderVariables>) =
            apply {
                this.templateHeaderVariables = templateHeaderVariables
            }

        /** Template ID for template messages. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /**
         * Variables for body placeholders. Key them to match the template body: by position (`1`,
         * `2`, ...) for positional templates, or by name (e.g. `customer_name`) for named
         * templates. Zavu detects the template's format and sends the correct payload to Meta.
         * Named keys also resolve a named text-header variable. Do not mix positional and named
         * keys in the same request.
         */
        fun templateVariables(templateVariables: TemplateVariables) =
            templateVariables(JsonField.of(templateVariables))

        /**
         * Sets [Builder.templateVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateVariables] with a well-typed [TemplateVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun templateVariables(templateVariables: JsonField<TemplateVariables>) = apply {
            this.templateVariables = templateVariables
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
         * Returns an immutable instance of [MessageContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageContent =
            MessageContent(
                (buttons ?: JsonMissing.of()).map { it.toImmutable() },
                (contacts ?: JsonMissing.of()).map { it.toImmutable() },
                ctaDisplayText,
                ctaHeaderMediaUrl,
                ctaHeaderText,
                ctaHeaderType,
                ctaUrl,
                emoji,
                filename,
                footerText,
                latitude,
                listButton,
                locationAddress,
                locationName,
                longitude,
                mediaId,
                mediaUrl,
                mimeType,
                reactToMessageId,
                replyToFrom,
                replyToMessageId,
                replyToMessageType,
                replyToProviderMessageId,
                replyToText,
                (sections ?: JsonMissing.of()).map { it.toImmutable() },
                templateButtonVariables,
                templateHeaderVariables,
                templateId,
                templateVariables,
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
    fun validate(): MessageContent = apply {
        if (validated) {
            return@apply
        }

        buttons().ifPresent { it.forEach { it.validate() } }
        contacts().ifPresent { it.forEach { it.validate() } }
        ctaDisplayText()
        ctaHeaderMediaUrl()
        ctaHeaderText()
        ctaHeaderType().ifPresent { it.validate() }
        ctaUrl()
        emoji()
        filename()
        footerText()
        latitude()
        listButton()
        locationAddress()
        locationName()
        longitude()
        mediaId()
        mediaUrl()
        mimeType()
        reactToMessageId()
        replyToFrom()
        replyToMessageId()
        replyToMessageType()
        replyToProviderMessageId()
        replyToText()
        sections().ifPresent { it.forEach { it.validate() } }
        templateButtonVariables().ifPresent { it.validate() }
        templateHeaderVariables().ifPresent { it.validate() }
        templateId()
        templateVariables().ifPresent { it.validate() }
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
        (buttons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (ctaDisplayText.asKnown().isPresent) 1 else 0) +
            (if (ctaHeaderMediaUrl.asKnown().isPresent) 1 else 0) +
            (if (ctaHeaderText.asKnown().isPresent) 1 else 0) +
            (ctaHeaderType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ctaUrl.asKnown().isPresent) 1 else 0) +
            (if (emoji.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0) +
            (if (footerText.asKnown().isPresent) 1 else 0) +
            (if (latitude.asKnown().isPresent) 1 else 0) +
            (if (listButton.asKnown().isPresent) 1 else 0) +
            (if (locationAddress.asKnown().isPresent) 1 else 0) +
            (if (locationName.asKnown().isPresent) 1 else 0) +
            (if (longitude.asKnown().isPresent) 1 else 0) +
            (if (mediaId.asKnown().isPresent) 1 else 0) +
            (if (mediaUrl.asKnown().isPresent) 1 else 0) +
            (if (mimeType.asKnown().isPresent) 1 else 0) +
            (if (reactToMessageId.asKnown().isPresent) 1 else 0) +
            (if (replyToFrom.asKnown().isPresent) 1 else 0) +
            (if (replyToMessageId.asKnown().isPresent) 1 else 0) +
            (if (replyToMessageType.asKnown().isPresent) 1 else 0) +
            (if (replyToProviderMessageId.asKnown().isPresent) 1 else 0) +
            (if (replyToText.asKnown().isPresent) 1 else 0) +
            (sections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (templateButtonVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (templateHeaderVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (if (templateId.asKnown().isPresent) 1 else 0) +
            (templateVariables.asKnown().getOrNull()?.validity() ?: 0)

    class Button
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(id, title, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
             * .id()
             * .title()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Button]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var title: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(button: Button) = apply {
                id = button.id
                title = button.title
                additionalProperties = button.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * .id()
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Button =
                Button(
                    checkRequired("id", id),
                    checkRequired("title", title),
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

            id()
            title()
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
            (if (id.asKnown().isPresent) 1 else 0) + (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Button &&
                id == other.id &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, title, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Button{id=$id, title=$title, additionalProperties=$additionalProperties}"
    }

    class Contact
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val phones: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phones")
            @ExcludeMissing
            phones: JsonField<List<String>> = JsonMissing.of(),
        ) : this(name, phones, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phones(): Optional<List<String>> = phones.getOptional("phones")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [phones].
         *
         * Unlike [phones], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phones") @ExcludeMissing fun _phones(): JsonField<List<String>> = phones

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

            /** Returns a mutable builder for constructing an instance of [Contact]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Contact]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var phones: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contact: Contact) = apply {
                name = contact.name
                phones = contact.phones.map { it.toMutableList() }
                additionalProperties = contact.additionalProperties.toMutableMap()
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

            fun phones(phones: List<String>) = phones(JsonField.of(phones))

            /**
             * Sets [Builder.phones] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phones] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phones(phones: JsonField<List<String>>) = apply {
                this.phones = phones.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [phones].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhone(phone: String) = apply {
                phones =
                    (phones ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phones", it).add(phone)
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
             * Returns an immutable instance of [Contact].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Contact =
                Contact(
                    name,
                    (phones ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Contact = apply {
            if (validated) {
                return@apply
            }

            name()
            phones()
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
            (if (name.asKnown().isPresent) 1 else 0) + (phones.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Contact &&
                name == other.name &&
                phones == other.phones &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, phones, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Contact{name=$name, phones=$phones, additionalProperties=$additionalProperties}"
    }

    /** Optional header type for cta_url messages. */
    class CtaHeaderType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmStatic fun of(value: String) = CtaHeaderType(JsonField.of(value))
        }

        /** An enum containing [CtaHeaderType]'s known values. */
        enum class Known {
            TEXT,
            IMAGE,
            VIDEO,
            DOCUMENT,
        }

        /**
         * An enum containing [CtaHeaderType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CtaHeaderType] can contain an unknown value in a couple of cases:
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
             * An enum member indicating that [CtaHeaderType] was instantiated with an unknown
             * value.
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
                else -> throw ZavudevInvalidDataException("Unknown CtaHeaderType: $value")
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
        fun validate(): CtaHeaderType = apply {
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

            return other is CtaHeaderType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Section
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val rows: JsonField<List<Row>>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("rows") @ExcludeMissing rows: JsonField<List<Row>> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(rows, title, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rows(): List<Row> = rows.getRequired("rows")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * Returns the raw JSON value of [rows].
         *
         * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
             * Returns a mutable builder for constructing an instance of [Section].
             *
             * The following fields are required:
             * ```java
             * .rows()
             * .title()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Section]. */
        class Builder internal constructor() {

            private var rows: JsonField<MutableList<Row>>? = null
            private var title: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(section: Section) = apply {
                rows = section.rows.map { it.toMutableList() }
                title = section.title
                additionalProperties = section.additionalProperties.toMutableMap()
            }

            fun rows(rows: List<Row>) = rows(JsonField.of(rows))

            /**
             * Sets [Builder.rows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rows] with a well-typed `List<Row>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rows(rows: JsonField<List<Row>>) = apply {
                this.rows = rows.map { it.toMutableList() }
            }

            /**
             * Adds a single [Row] to [rows].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRow(row: Row) = apply {
                rows =
                    (rows ?: JsonField.of(mutableListOf())).also { checkKnown("rows", it).add(row) }
            }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Section].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .rows()
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Section =
                Section(
                    checkRequired("rows", rows).map { it.toImmutable() },
                    checkRequired("title", title),
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
        fun validate(): Section = apply {
            if (validated) {
                return@apply
            }

            rows().forEach { it.validate() }
            title()
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
            (rows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        class Row
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val title: JsonField<String>,
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
            ) : this(id, title, description, mutableMapOf())

            /**
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun title(): String = title.getRequired("title")

            /**
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
                 * Returns a mutable builder for constructing an instance of [Row].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .title()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Row]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var title: JsonField<String>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(row: Row) = apply {
                    id = row.id
                    title = row.title
                    description = row.description
                    additionalProperties = row.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
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
                 * Returns an immutable instance of [Row].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .title()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Row =
                    Row(
                        checkRequired("id", id),
                        checkRequired("title", title),
                        description,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Row = apply {
                if (validated) {
                    return@apply
                }

                id()
                title()
                description()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Row &&
                    id == other.id &&
                    title == other.title &&
                    description == other.description &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, title, description, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Row{id=$id, title=$title, description=$description, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Section &&
                rows == other.rows &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(rows, title, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Section{rows=$rows, title=$title, additionalProperties=$additionalProperties}"
    }

    /**
     * Variables for dynamic button placeholders (URL buttons and OTP buttons). Keys are the button
     * index (0, 1, 2) in the template's `buttons` array — not the placeholder name. Values
     * substitute the `{{1}}` placeholder inside that button's URL.
     *
     * **WhatsApp constraints:**
     * - URL buttons only accept `{{1}}` — positional, numeric, no whitespace, no name. Named
     *   placeholders like `{{token}}` are stored as literal URL text by Meta and cannot be
     *   substituted.
     * - At most one placeholder per URL button.
     * - A template may have at most three buttons.
     * - Static URL buttons (no placeholder) and `quick_reply` buttons are not included here.
     */
    class TemplateButtonVariables
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

            /**
             * Returns a mutable builder for constructing an instance of [TemplateButtonVariables].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateButtonVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateButtonVariables: TemplateButtonVariables) = apply {
                additionalProperties = templateButtonVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateButtonVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateButtonVariables =
                TemplateButtonVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateButtonVariables = apply {
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

            return other is TemplateButtonVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TemplateButtonVariables{additionalProperties=$additionalProperties}"
    }

    /**
     * Value for a text-header variable, keyed by `1` (WhatsApp text headers allow at most one
     * variable). Optional override. If omitted, Zavu resolves the header from `templateVariables`
     * using the header placeholder's name (e.g. `novios`). Static text headers need no value.
     */
    class TemplateHeaderVariables
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

            /**
             * Returns a mutable builder for constructing an instance of [TemplateHeaderVariables].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateHeaderVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateHeaderVariables: TemplateHeaderVariables) = apply {
                additionalProperties = templateHeaderVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateHeaderVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateHeaderVariables =
                TemplateHeaderVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateHeaderVariables = apply {
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

            return other is TemplateHeaderVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TemplateHeaderVariables{additionalProperties=$additionalProperties}"
    }

    /**
     * Variables for body placeholders. Key them to match the template body: by position (`1`, `2`,
     * ...) for positional templates, or by name (e.g. `customer_name`) for named templates. Zavu
     * detects the template's format and sends the correct payload to Meta. Named keys also resolve
     * a named text-header variable. Do not mix positional and named keys in the same request.
     */
    class TemplateVariables
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

            /** Returns a mutable builder for constructing an instance of [TemplateVariables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateVariables: TemplateVariables) = apply {
                additionalProperties = templateVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateVariables = TemplateVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateVariables = apply {
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

            return other is TemplateVariables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TemplateVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageContent &&
            buttons == other.buttons &&
            contacts == other.contacts &&
            ctaDisplayText == other.ctaDisplayText &&
            ctaHeaderMediaUrl == other.ctaHeaderMediaUrl &&
            ctaHeaderText == other.ctaHeaderText &&
            ctaHeaderType == other.ctaHeaderType &&
            ctaUrl == other.ctaUrl &&
            emoji == other.emoji &&
            filename == other.filename &&
            footerText == other.footerText &&
            latitude == other.latitude &&
            listButton == other.listButton &&
            locationAddress == other.locationAddress &&
            locationName == other.locationName &&
            longitude == other.longitude &&
            mediaId == other.mediaId &&
            mediaUrl == other.mediaUrl &&
            mimeType == other.mimeType &&
            reactToMessageId == other.reactToMessageId &&
            replyToFrom == other.replyToFrom &&
            replyToMessageId == other.replyToMessageId &&
            replyToMessageType == other.replyToMessageType &&
            replyToProviderMessageId == other.replyToProviderMessageId &&
            replyToText == other.replyToText &&
            sections == other.sections &&
            templateButtonVariables == other.templateButtonVariables &&
            templateHeaderVariables == other.templateHeaderVariables &&
            templateId == other.templateId &&
            templateVariables == other.templateVariables &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            buttons,
            contacts,
            ctaDisplayText,
            ctaHeaderMediaUrl,
            ctaHeaderText,
            ctaHeaderType,
            ctaUrl,
            emoji,
            filename,
            footerText,
            latitude,
            listButton,
            locationAddress,
            locationName,
            longitude,
            mediaId,
            mediaUrl,
            mimeType,
            reactToMessageId,
            replyToFrom,
            replyToMessageId,
            replyToMessageType,
            replyToProviderMessageId,
            replyToText,
            sections,
            templateButtonVariables,
            templateHeaderVariables,
            templateId,
            templateVariables,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageContent{buttons=$buttons, contacts=$contacts, ctaDisplayText=$ctaDisplayText, ctaHeaderMediaUrl=$ctaHeaderMediaUrl, ctaHeaderText=$ctaHeaderText, ctaHeaderType=$ctaHeaderType, ctaUrl=$ctaUrl, emoji=$emoji, filename=$filename, footerText=$footerText, latitude=$latitude, listButton=$listButton, locationAddress=$locationAddress, locationName=$locationName, longitude=$longitude, mediaId=$mediaId, mediaUrl=$mediaUrl, mimeType=$mimeType, reactToMessageId=$reactToMessageId, replyToFrom=$replyToFrom, replyToMessageId=$replyToMessageId, replyToMessageType=$replyToMessageType, replyToProviderMessageId=$replyToProviderMessageId, replyToText=$replyToText, sections=$sections, templateButtonVariables=$templateButtonVariables, templateHeaderVariables=$templateHeaderVariables, templateId=$templateId, templateVariables=$templateVariables, additionalProperties=$additionalProperties}"
}
