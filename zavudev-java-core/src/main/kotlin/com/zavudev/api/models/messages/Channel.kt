// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.errors.ZavudevInvalidDataException

/** Delivery channel. Use 'auto' for intelligent routing. */
class Channel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val AUTO = of("auto")

        @JvmField val SMS = of("sms")

        @JvmField val SMS_ONEWAY = of("sms_oneway")

        @JvmField val WHATSAPP = of("whatsapp")

        @JvmField val TELEGRAM = of("telegram")

        @JvmField val EMAIL = of("email")

        @JvmField val INSTAGRAM = of("instagram")

        @JvmField val MESSENGER = of("messenger")

        @JvmField val VOICE = of("voice")

        @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
    }

    /** An enum containing [Channel]'s known values. */
    enum class Known {
        AUTO,
        SMS,
        SMS_ONEWAY,
        WHATSAPP,
        TELEGRAM,
        EMAIL,
        INSTAGRAM,
        MESSENGER,
        VOICE,
    }

    /**
     * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Channel] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AUTO,
        SMS,
        SMS_ONEWAY,
        WHATSAPP,
        TELEGRAM,
        EMAIL,
        INSTAGRAM,
        MESSENGER,
        VOICE,
        /** An enum member indicating that [Channel] was instantiated with an unknown value. */
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
            AUTO -> Value.AUTO
            SMS -> Value.SMS
            SMS_ONEWAY -> Value.SMS_ONEWAY
            WHATSAPP -> Value.WHATSAPP
            TELEGRAM -> Value.TELEGRAM
            EMAIL -> Value.EMAIL
            INSTAGRAM -> Value.INSTAGRAM
            MESSENGER -> Value.MESSENGER
            VOICE -> Value.VOICE
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
            AUTO -> Known.AUTO
            SMS -> Known.SMS
            SMS_ONEWAY -> Known.SMS_ONEWAY
            WHATSAPP -> Known.WHATSAPP
            TELEGRAM -> Known.TELEGRAM
            EMAIL -> Known.EMAIL
            INSTAGRAM -> Known.INSTAGRAM
            MESSENGER -> Known.MESSENGER
            VOICE -> Known.VOICE
            else -> throw ZavudevInvalidDataException("Unknown Channel: $value")
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
    fun validate(): Channel = apply {
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

        return other is Channel && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
