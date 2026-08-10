// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.introspect

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.errors.ZavudevInvalidDataException

/** Type of phone line. */
class LineType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val MOBILE = of("mobile")

        @JvmField val LANDLINE = of("landline")

        @JvmField val VOIP = of("voip")

        @JvmField val TOLL_FREE = of("toll_free")

        @JvmField val UNKNOWN = of("unknown")

        @JvmStatic fun of(value: String) = LineType(JsonField.of(value))
    }

    /** An enum containing [LineType]'s known values. */
    enum class Known {
        MOBILE,
        LANDLINE,
        VOIP,
        TOLL_FREE,
        UNKNOWN,
    }

    /**
     * An enum containing [LineType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [LineType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        MOBILE,
        LANDLINE,
        VOIP,
        TOLL_FREE,
        UNKNOWN,
        /** An enum member indicating that [LineType] was instantiated with an unknown value. */
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
            MOBILE -> Value.MOBILE
            LANDLINE -> Value.LANDLINE
            VOIP -> Value.VOIP
            TOLL_FREE -> Value.TOLL_FREE
            UNKNOWN -> Value.UNKNOWN
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
            MOBILE -> Known.MOBILE
            LANDLINE -> Known.LANDLINE
            VOIP -> Known.VOIP
            TOLL_FREE -> Known.TOLL_FREE
            UNKNOWN -> Known.UNKNOWN
            else -> throw ZavudevInvalidDataException("Unknown LineType: $value")
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
    fun validate(): LineType = apply {
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

        return other is LineType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
