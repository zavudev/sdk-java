// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.errors.ZavudevInvalidDataException

class PhoneNumberType @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val LOCAL = of("local")

        @JvmField val NATIONAL = of("national")

        @JvmField val TOLL_FREE = of("tollFree")

        @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
    }

    /** An enum containing [PhoneNumberType]'s known values. */
    enum class Known {
        LOCAL,
        NATIONAL,
        TOLL_FREE,
    }

    /**
     * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        LOCAL,
        NATIONAL,
        TOLL_FREE,
        /**
         * An enum member indicating that [PhoneNumberType] was instantiated with an unknown value.
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
            LOCAL -> Value.LOCAL
            NATIONAL -> Value.NATIONAL
            TOLL_FREE -> Value.TOLL_FREE
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
            LOCAL -> Known.LOCAL
            NATIONAL -> Known.NATIONAL
            TOLL_FREE -> Known.TOLL_FREE
            else -> throw ZavudevInvalidDataException("Unknown PhoneNumberType: $value")
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
    fun validate(): PhoneNumberType = apply {
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

        return other is PhoneNumberType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
