// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.errors.ZavudevInvalidDataException

/**
 * Type of message. Non-text types are supported by WhatsApp and Telegram (varies by type).
 *
 * `location_request` asks the recipient to share their location and is WhatsApp-only. It takes no
 * `content` object — the prompt goes in `text` (max 1024 characters) and the button label is fixed
 * by WhatsApp. The recipient's answer arrives as an inbound `location` message whose
 * `content.replyToMessageId` is the ID of the request.
 *
 * `request_contact_info` asks the recipient to share their phone number and is WhatsApp-only. Like
 * `location_request` it takes no `content` object — the prompt goes in `text` (max 1024 characters)
 * and WhatsApp renders a fixed **Share Contact Info** button. The answer arrives as an inbound
 * `contact` message. Use it to recover the phone number of a contact who adopted a WhatsApp
 * username and is only known by their business-scoped user ID (BSUID); when they share it, Zavu
 * automatically links the phone number to that contact.
 */
class MessageType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val TEXT = of("text")

        @JvmField val IMAGE = of("image")

        @JvmField val VIDEO = of("video")

        @JvmField val AUDIO = of("audio")

        @JvmField val DOCUMENT = of("document")

        @JvmField val STICKER = of("sticker")

        @JvmField val LOCATION = of("location")

        @JvmField val CONTACT = of("contact")

        @JvmField val BUTTONS = of("buttons")

        @JvmField val LIST = of("list")

        @JvmField val CTA_URL = of("cta_url")

        @JvmField val REQUEST_CONTACT_INFO = of("request_contact_info")

        @JvmField val LOCATION_REQUEST = of("location_request")

        @JvmField val REACTION = of("reaction")

        @JvmField val TEMPLATE = of("template")

        @JvmStatic fun of(value: String) = MessageType(JsonField.of(value))
    }

    /** An enum containing [MessageType]'s known values. */
    enum class Known {
        TEXT,
        IMAGE,
        VIDEO,
        AUDIO,
        DOCUMENT,
        STICKER,
        LOCATION,
        CONTACT,
        BUTTONS,
        LIST,
        CTA_URL,
        REQUEST_CONTACT_INFO,
        LOCATION_REQUEST,
        REACTION,
        TEMPLATE,
    }

    /**
     * An enum containing [MessageType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [MessageType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        TEXT,
        IMAGE,
        VIDEO,
        AUDIO,
        DOCUMENT,
        STICKER,
        LOCATION,
        CONTACT,
        BUTTONS,
        LIST,
        CTA_URL,
        REQUEST_CONTACT_INFO,
        LOCATION_REQUEST,
        REACTION,
        TEMPLATE,
        /** An enum member indicating that [MessageType] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            TEXT -> Value.TEXT
            IMAGE -> Value.IMAGE
            VIDEO -> Value.VIDEO
            AUDIO -> Value.AUDIO
            DOCUMENT -> Value.DOCUMENT
            STICKER -> Value.STICKER
            LOCATION -> Value.LOCATION
            CONTACT -> Value.CONTACT
            BUTTONS -> Value.BUTTONS
            LIST -> Value.LIST
            CTA_URL -> Value.CTA_URL
            REQUEST_CONTACT_INFO -> Value.REQUEST_CONTACT_INFO
            LOCATION_REQUEST -> Value.LOCATION_REQUEST
            REACTION -> Value.REACTION
            TEMPLATE -> Value.TEMPLATE
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws ZavudevInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            TEXT -> Known.TEXT
            IMAGE -> Known.IMAGE
            VIDEO -> Known.VIDEO
            AUDIO -> Known.AUDIO
            DOCUMENT -> Known.DOCUMENT
            STICKER -> Known.STICKER
            LOCATION -> Known.LOCATION
            CONTACT -> Known.CONTACT
            BUTTONS -> Known.BUTTONS
            LIST -> Known.LIST
            CTA_URL -> Known.CTA_URL
            REQUEST_CONTACT_INFO -> Known.REQUEST_CONTACT_INFO
            LOCATION_REQUEST -> Known.LOCATION_REQUEST
            REACTION -> Known.REACTION
            TEMPLATE -> Known.TEMPLATE
            else -> throw ZavudevInvalidDataException("Unknown MessageType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws ZavudevInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { ZavudevInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): MessageType = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
