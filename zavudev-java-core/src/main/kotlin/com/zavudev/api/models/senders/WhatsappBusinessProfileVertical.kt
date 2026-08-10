// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.errors.ZavudevInvalidDataException

/** Business category for WhatsApp Business profile. */
class WhatsappBusinessProfileVertical
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val UNDEFINED = of("UNDEFINED")

        @JvmField val OTHER = of("OTHER")

        @JvmField val AUTO = of("AUTO")

        @JvmField val BEAUTY = of("BEAUTY")

        @JvmField val APPAREL = of("APPAREL")

        @JvmField val EDU = of("EDU")

        @JvmField val ENTERTAIN = of("ENTERTAIN")

        @JvmField val EVENT_PLAN = of("EVENT_PLAN")

        @JvmField val FINANCE = of("FINANCE")

        @JvmField val GROCERY = of("GROCERY")

        @JvmField val GOVT = of("GOVT")

        @JvmField val HOTEL = of("HOTEL")

        @JvmField val HEALTH = of("HEALTH")

        @JvmField val NONPROFIT = of("NONPROFIT")

        @JvmField val PROF_SERVICES = of("PROF_SERVICES")

        @JvmField val RETAIL = of("RETAIL")

        @JvmField val TRAVEL = of("TRAVEL")

        @JvmField val RESTAURANT = of("RESTAURANT")

        @JvmField val NOT_A_BIZ = of("NOT_A_BIZ")

        @JvmStatic fun of(value: String) = WhatsappBusinessProfileVertical(JsonField.of(value))
    }

    /** An enum containing [WhatsappBusinessProfileVertical]'s known values. */
    enum class Known {
        UNDEFINED,
        OTHER,
        AUTO,
        BEAUTY,
        APPAREL,
        EDU,
        ENTERTAIN,
        EVENT_PLAN,
        FINANCE,
        GROCERY,
        GOVT,
        HOTEL,
        HEALTH,
        NONPROFIT,
        PROF_SERVICES,
        RETAIL,
        TRAVEL,
        RESTAURANT,
        NOT_A_BIZ,
    }

    /**
     * An enum containing [WhatsappBusinessProfileVertical]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [WhatsappBusinessProfileVertical] can contain an unknown value in a couple of
     * cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        UNDEFINED,
        OTHER,
        AUTO,
        BEAUTY,
        APPAREL,
        EDU,
        ENTERTAIN,
        EVENT_PLAN,
        FINANCE,
        GROCERY,
        GOVT,
        HOTEL,
        HEALTH,
        NONPROFIT,
        PROF_SERVICES,
        RETAIL,
        TRAVEL,
        RESTAURANT,
        NOT_A_BIZ,
        /**
         * An enum member indicating that [WhatsappBusinessProfileVertical] was instantiated with an
         * unknown value.
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
            UNDEFINED -> Value.UNDEFINED
            OTHER -> Value.OTHER
            AUTO -> Value.AUTO
            BEAUTY -> Value.BEAUTY
            APPAREL -> Value.APPAREL
            EDU -> Value.EDU
            ENTERTAIN -> Value.ENTERTAIN
            EVENT_PLAN -> Value.EVENT_PLAN
            FINANCE -> Value.FINANCE
            GROCERY -> Value.GROCERY
            GOVT -> Value.GOVT
            HOTEL -> Value.HOTEL
            HEALTH -> Value.HEALTH
            NONPROFIT -> Value.NONPROFIT
            PROF_SERVICES -> Value.PROF_SERVICES
            RETAIL -> Value.RETAIL
            TRAVEL -> Value.TRAVEL
            RESTAURANT -> Value.RESTAURANT
            NOT_A_BIZ -> Value.NOT_A_BIZ
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
            UNDEFINED -> Known.UNDEFINED
            OTHER -> Known.OTHER
            AUTO -> Known.AUTO
            BEAUTY -> Known.BEAUTY
            APPAREL -> Known.APPAREL
            EDU -> Known.EDU
            ENTERTAIN -> Known.ENTERTAIN
            EVENT_PLAN -> Known.EVENT_PLAN
            FINANCE -> Known.FINANCE
            GROCERY -> Known.GROCERY
            GOVT -> Known.GOVT
            HOTEL -> Known.HOTEL
            HEALTH -> Known.HEALTH
            NONPROFIT -> Known.NONPROFIT
            PROF_SERVICES -> Known.PROF_SERVICES
            RETAIL -> Known.RETAIL
            TRAVEL -> Known.TRAVEL
            RESTAURANT -> Known.RESTAURANT
            NOT_A_BIZ -> Known.NOT_A_BIZ
            else ->
                throw ZavudevInvalidDataException("Unknown WhatsappBusinessProfileVertical: $value")
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
    fun validate(): WhatsappBusinessProfileVertical = apply {
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

        return other is WhatsappBusinessProfileVertical && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
