// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.errors.ZavudevInvalidDataException

/** Current status of the broadcast. */
class BroadcastStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val DRAFT = of("draft")

        @JvmField val PENDING_REVIEW = of("pending_review")

        @JvmField val APPROVED = of("approved")

        @JvmField val REJECTED = of("rejected")

        @JvmField val ESCALATED = of("escalated")

        @JvmField val REJECTED_FINAL = of("rejected_final")

        @JvmField val SCHEDULED = of("scheduled")

        @JvmField val SENDING = of("sending")

        @JvmField val PAUSED = of("paused")

        @JvmField val COMPLETED = of("completed")

        @JvmField val CANCELLED = of("cancelled")

        @JvmField val FAILED = of("failed")

        @JvmStatic fun of(value: String) = BroadcastStatus(JsonField.of(value))
    }

    /** An enum containing [BroadcastStatus]'s known values. */
    enum class Known {
        DRAFT,
        PENDING_REVIEW,
        APPROVED,
        REJECTED,
        ESCALATED,
        REJECTED_FINAL,
        SCHEDULED,
        SENDING,
        PAUSED,
        COMPLETED,
        CANCELLED,
        FAILED,
    }

    /**
     * An enum containing [BroadcastStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [BroadcastStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DRAFT,
        PENDING_REVIEW,
        APPROVED,
        REJECTED,
        ESCALATED,
        REJECTED_FINAL,
        SCHEDULED,
        SENDING,
        PAUSED,
        COMPLETED,
        CANCELLED,
        FAILED,
        /**
         * An enum member indicating that [BroadcastStatus] was instantiated with an unknown value.
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
            DRAFT -> Value.DRAFT
            PENDING_REVIEW -> Value.PENDING_REVIEW
            APPROVED -> Value.APPROVED
            REJECTED -> Value.REJECTED
            ESCALATED -> Value.ESCALATED
            REJECTED_FINAL -> Value.REJECTED_FINAL
            SCHEDULED -> Value.SCHEDULED
            SENDING -> Value.SENDING
            PAUSED -> Value.PAUSED
            COMPLETED -> Value.COMPLETED
            CANCELLED -> Value.CANCELLED
            FAILED -> Value.FAILED
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
            DRAFT -> Known.DRAFT
            PENDING_REVIEW -> Known.PENDING_REVIEW
            APPROVED -> Known.APPROVED
            REJECTED -> Known.REJECTED
            ESCALATED -> Known.ESCALATED
            REJECTED_FINAL -> Known.REJECTED_FINAL
            SCHEDULED -> Known.SCHEDULED
            SENDING -> Known.SENDING
            PAUSED -> Known.PAUSED
            COMPLETED -> Known.COMPLETED
            CANCELLED -> Known.CANCELLED
            FAILED -> Known.FAILED
            else -> throw ZavudevInvalidDataException("Unknown BroadcastStatus: $value")
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
    fun validate(): BroadcastStatus = apply {
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

        return other is BroadcastStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
