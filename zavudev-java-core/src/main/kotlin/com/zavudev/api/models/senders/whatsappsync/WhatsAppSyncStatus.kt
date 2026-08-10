// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.whatsappsync

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.checkRequired
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** WhatsApp coexistence sync status. */
class WhatsAppSyncStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contacts: JsonField<WhatsAppSyncContacts>,
    private val history: JsonField<WhatsAppSyncHistory>,
    private val isCoexistence: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contacts")
        @ExcludeMissing
        contacts: JsonField<WhatsAppSyncContacts> = JsonMissing.of(),
        @JsonProperty("history")
        @ExcludeMissing
        history: JsonField<WhatsAppSyncHistory> = JsonMissing.of(),
        @JsonProperty("isCoexistence")
        @ExcludeMissing
        isCoexistence: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(contacts, history, isCoexistence, status, mutableMapOf())

    /**
     * Contacts sync status details.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contacts(): WhatsAppSyncContacts = contacts.getRequired("contacts")

    /**
     * History sync status details.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun history(): WhatsAppSyncHistory = history.getRequired("history")

    /**
     * Whether the account is in coexistence mode.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCoexistence(): Boolean = isCoexistence.getRequired("isCoexistence")

    /**
     * WhatsApp account status.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Returns the raw JSON value of [contacts].
     *
     * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contacts")
    @ExcludeMissing
    fun _contacts(): JsonField<WhatsAppSyncContacts> = contacts

    /**
     * Returns the raw JSON value of [history].
     *
     * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("history")
    @ExcludeMissing
    fun _history(): JsonField<WhatsAppSyncHistory> = history

    /**
     * Returns the raw JSON value of [isCoexistence].
     *
     * Unlike [isCoexistence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isCoexistence")
    @ExcludeMissing
    fun _isCoexistence(): JsonField<Boolean> = isCoexistence

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [WhatsAppSyncStatus].
         *
         * The following fields are required:
         * ```java
         * .contacts()
         * .history()
         * .isCoexistence()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsAppSyncStatus]. */
    class Builder internal constructor() {

        private var contacts: JsonField<WhatsAppSyncContacts>? = null
        private var history: JsonField<WhatsAppSyncHistory>? = null
        private var isCoexistence: JsonField<Boolean>? = null
        private var status: JsonField<Status>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsAppSyncStatus: WhatsAppSyncStatus) = apply {
            contacts = whatsAppSyncStatus.contacts
            history = whatsAppSyncStatus.history
            isCoexistence = whatsAppSyncStatus.isCoexistence
            status = whatsAppSyncStatus.status
            additionalProperties = whatsAppSyncStatus.additionalProperties.toMutableMap()
        }

        /** Contacts sync status details. */
        fun contacts(contacts: WhatsAppSyncContacts) = contacts(JsonField.of(contacts))

        /**
         * Sets [Builder.contacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contacts] with a well-typed [WhatsAppSyncContacts] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contacts(contacts: JsonField<WhatsAppSyncContacts>) = apply { this.contacts = contacts }

        /** History sync status details. */
        fun history(history: WhatsAppSyncHistory) = history(JsonField.of(history))

        /**
         * Sets [Builder.history] to an arbitrary JSON value.
         *
         * You should usually call [Builder.history] with a well-typed [WhatsAppSyncHistory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun history(history: JsonField<WhatsAppSyncHistory>) = apply { this.history = history }

        /** Whether the account is in coexistence mode. */
        fun isCoexistence(isCoexistence: Boolean) = isCoexistence(JsonField.of(isCoexistence))

        /**
         * Sets [Builder.isCoexistence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCoexistence] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isCoexistence(isCoexistence: JsonField<Boolean>) = apply {
            this.isCoexistence = isCoexistence
        }

        /** WhatsApp account status. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [WhatsAppSyncStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contacts()
         * .history()
         * .isCoexistence()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WhatsAppSyncStatus =
            WhatsAppSyncStatus(
                checkRequired("contacts", contacts),
                checkRequired("history", history),
                checkRequired("isCoexistence", isCoexistence),
                checkRequired("status", status),
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
    fun validate(): WhatsAppSyncStatus = apply {
        if (validated) {
            return@apply
        }

        contacts().validate()
        history().validate()
        isCoexistence()
        status().validate()
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
        (contacts.asKnown().getOrNull()?.validity() ?: 0) +
            (history.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isCoexistence.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /** WhatsApp account status. */
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

            @JvmField val PENDING_VERIFICATION = of("pending_verification")

            @JvmField val PENDING_REGISTRATION = of("pending_registration")

            @JvmField val ACTIVE = of("active")

            @JvmField val DISCONNECTED = of("disconnected")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING_VERIFICATION,
            PENDING_REGISTRATION,
            ACTIVE,
            DISCONNECTED,
            ERROR,
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
            PENDING_VERIFICATION,
            PENDING_REGISTRATION,
            ACTIVE,
            DISCONNECTED,
            ERROR,
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
                PENDING_VERIFICATION -> Value.PENDING_VERIFICATION
                PENDING_REGISTRATION -> Value.PENDING_REGISTRATION
                ACTIVE -> Value.ACTIVE
                DISCONNECTED -> Value.DISCONNECTED
                ERROR -> Value.ERROR
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
                PENDING_VERIFICATION -> Known.PENDING_VERIFICATION
                PENDING_REGISTRATION -> Known.PENDING_REGISTRATION
                ACTIVE -> Known.ACTIVE
                DISCONNECTED -> Known.DISCONNECTED
                ERROR -> Known.ERROR
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsAppSyncStatus &&
            contacts == other.contacts &&
            history == other.history &&
            isCoexistence == other.isCoexistence &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contacts, history, isCoexistence, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsAppSyncStatus{contacts=$contacts, history=$history, isCoexistence=$isCoexistence, status=$status, additionalProperties=$additionalProperties}"
}
