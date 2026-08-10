// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.errors.ZavudevInvalidDataException

/** Broadcast delivery channel. Use 'smart' for per-contact intelligent routing. */
class BroadcastChannel @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val SMART = of("smart")

        @JvmField val SMS = of("sms")

        @JvmField val SMS_ONEWAY = of("sms_oneway")

        @JvmField val WHATSAPP = of("whatsapp")

        @JvmField val TELEGRAM = of("telegram")

        @JvmField val EMAIL = of("email")

        @JvmStatic fun of(value: String) = BroadcastChannel(JsonField.of(value))
    }

    /** An enum containing [BroadcastChannel]'s known values. */
    enum class Known {
        SMART,
        SMS,
        SMS_ONEWAY,
        WHATSAPP,
        TELEGRAM,
        EMAIL,
    }

    /**
     * An enum containing [BroadcastChannel]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [BroadcastChannel] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SMART,
        SMS,
        SMS_ONEWAY,
        WHATSAPP,
        TELEGRAM,
        EMAIL,
        /**
         * An enum member indicating that [BroadcastChannel] was instantiated with an unknown value.
         */
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
            SMART -> Value.SMART
            SMS -> Value.SMS
            SMS_ONEWAY -> Value.SMS_ONEWAY
            WHATSAPP -> Value.WHATSAPP
            TELEGRAM -> Value.TELEGRAM
            EMAIL -> Value.EMAIL
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
            SMART -> Known.SMART
            SMS -> Known.SMS
            SMS_ONEWAY -> Known.SMS_ONEWAY
            WHATSAPP -> Known.WHATSAPP
            TELEGRAM -> Known.TELEGRAM
            EMAIL -> Known.EMAIL
            else -> throw ZavudevInvalidDataException("Unknown BroadcastChannel: $value")
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
    fun validate(): BroadcastChannel = apply {
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

        return other is BroadcastChannel && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
