// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

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

class Contact
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val availableChannels: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val metadata: JsonField<Metadata>,
    private val verified: JsonField<Boolean>,
    private val channels: JsonField<List<ContactChannel>>,
    private val countryCode: JsonField<String>,
    private val defaultChannel: JsonField<DefaultChannel>,
    private val displayName: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val primaryEmail: JsonField<String>,
    private val primaryPhone: JsonField<String>,
    private val profileName: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("availableChannels")
        @ExcludeMissing
        availableChannels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("verified") @ExcludeMissing verified: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("channels")
        @ExcludeMissing
        channels: JsonField<List<ContactChannel>> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultChannel")
        @ExcludeMissing
        defaultChannel: JsonField<DefaultChannel> = JsonMissing.of(),
        @JsonProperty("displayName")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryEmail")
        @ExcludeMissing
        primaryEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primaryPhone")
        @ExcludeMissing
        primaryPhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("profileName")
        @ExcludeMissing
        profileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        availableChannels,
        createdAt,
        metadata,
        verified,
        channels,
        countryCode,
        defaultChannel,
        displayName,
        phoneNumber,
        primaryEmail,
        primaryPhone,
        profileName,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * List of available messaging channels for this contact.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableChannels(): List<String> = availableChannels.getRequired("availableChannels")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Whether this contact has been verified.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verified(): Boolean = verified.getRequired("verified")

    /**
     * All communication channels for this contact.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<List<ContactChannel>> = channels.getOptional("channels")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * Preferred channel for this contact.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultChannel(): Optional<DefaultChannel> = defaultChannel.getOptional("defaultChannel")

    /**
     * Display name for the contact.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("displayName")

    /**
     * DEPRECATED: Use primaryPhone instead. Primary phone number in E.164 format.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phoneNumber")

    /**
     * Primary email address.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryEmail(): Optional<String> = primaryEmail.getOptional("primaryEmail")

    /**
     * Primary phone number in E.164 format.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryPhone(): Optional<String> = primaryPhone.getOptional("primaryPhone")

    /**
     * Contact's WhatsApp profile name. Only available for WhatsApp contacts.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profileName(): Optional<String> = profileName.getOptional("profileName")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [availableChannels].
     *
     * Unlike [availableChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("availableChannels")
    @ExcludeMissing
    fun _availableChannels(): JsonField<List<String>> = availableChannels

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [verified].
     *
     * Unlike [verified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verified") @ExcludeMissing fun _verified(): JsonField<Boolean> = verified

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels")
    @ExcludeMissing
    fun _channels(): JsonField<List<ContactChannel>> = channels

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [defaultChannel].
     *
     * Unlike [defaultChannel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultChannel")
    @ExcludeMissing
    fun _defaultChannel(): JsonField<DefaultChannel> = defaultChannel

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayName") @ExcludeMissing fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [primaryEmail].
     *
     * Unlike [primaryEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryEmail")
    @ExcludeMissing
    fun _primaryEmail(): JsonField<String> = primaryEmail

    /**
     * Returns the raw JSON value of [primaryPhone].
     *
     * Unlike [primaryPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primaryPhone")
    @ExcludeMissing
    fun _primaryPhone(): JsonField<String> = primaryPhone

    /**
     * Returns the raw JSON value of [profileName].
     *
     * Unlike [profileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profileName") @ExcludeMissing fun _profileName(): JsonField<String> = profileName

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [Contact].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .availableChannels()
         * .createdAt()
         * .metadata()
         * .verified()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Contact]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var availableChannels: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var metadata: JsonField<Metadata>? = null
        private var verified: JsonField<Boolean>? = null
        private var channels: JsonField<MutableList<ContactChannel>>? = null
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var defaultChannel: JsonField<DefaultChannel> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var primaryEmail: JsonField<String> = JsonMissing.of()
        private var primaryPhone: JsonField<String> = JsonMissing.of()
        private var profileName: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contact: Contact) = apply {
            id = contact.id
            availableChannels = contact.availableChannels.map { it.toMutableList() }
            createdAt = contact.createdAt
            metadata = contact.metadata
            verified = contact.verified
            channels = contact.channels.map { it.toMutableList() }
            countryCode = contact.countryCode
            defaultChannel = contact.defaultChannel
            displayName = contact.displayName
            phoneNumber = contact.phoneNumber
            primaryEmail = contact.primaryEmail
            primaryPhone = contact.primaryPhone
            profileName = contact.profileName
            updatedAt = contact.updatedAt
            additionalProperties = contact.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** List of available messaging channels for this contact. */
        fun availableChannels(availableChannels: List<String>) =
            availableChannels(JsonField.of(availableChannels))

        /**
         * Sets [Builder.availableChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableChannels] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun availableChannels(availableChannels: JsonField<List<String>>) = apply {
            this.availableChannels = availableChannels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [availableChannels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAvailableChannel(availableChannel: String) = apply {
            availableChannels =
                (availableChannels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("availableChannels", it).add(availableChannel)
                }
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

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Whether this contact has been verified. */
        fun verified(verified: Boolean) = verified(JsonField.of(verified))

        /**
         * Sets [Builder.verified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verified] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun verified(verified: JsonField<Boolean>) = apply { this.verified = verified }

        /** All communication channels for this contact. */
        fun channels(channels: List<ContactChannel>) = channels(JsonField.of(channels))

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed `List<ContactChannel>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channels(channels: JsonField<List<ContactChannel>>) = apply {
            this.channels = channels.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactChannel] to [channels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannel(channel: ContactChannel) = apply {
            channels =
                (channels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("channels", it).add(channel)
                }
        }

        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** Preferred channel for this contact. */
        fun defaultChannel(defaultChannel: DefaultChannel) =
            defaultChannel(JsonField.of(defaultChannel))

        /**
         * Sets [Builder.defaultChannel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultChannel] with a well-typed [DefaultChannel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultChannel(defaultChannel: JsonField<DefaultChannel>) = apply {
            this.defaultChannel = defaultChannel
        }

        /** Display name for the contact. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** DEPRECATED: Use primaryPhone instead. Primary phone number in E.164 format. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Primary email address. */
        fun primaryEmail(primaryEmail: String) = primaryEmail(JsonField.of(primaryEmail))

        /**
         * Sets [Builder.primaryEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryEmail(primaryEmail: JsonField<String>) = apply {
            this.primaryEmail = primaryEmail
        }

        /** Primary phone number in E.164 format. */
        fun primaryPhone(primaryPhone: String) = primaryPhone(JsonField.of(primaryPhone))

        /**
         * Sets [Builder.primaryPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryPhone(primaryPhone: JsonField<String>) = apply {
            this.primaryPhone = primaryPhone
        }

        /** Contact's WhatsApp profile name. Only available for WhatsApp contacts. */
        fun profileName(profileName: String?) = profileName(JsonField.ofNullable(profileName))

        /** Alias for calling [Builder.profileName] with `profileName.orElse(null)`. */
        fun profileName(profileName: Optional<String>) = profileName(profileName.getOrNull())

        /**
         * Sets [Builder.profileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun profileName(profileName: JsonField<String>) = apply { this.profileName = profileName }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         *
         * The following fields are required:
         * ```java
         * .id()
         * .availableChannels()
         * .createdAt()
         * .metadata()
         * .verified()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Contact =
            Contact(
                checkRequired("id", id),
                checkRequired("availableChannels", availableChannels).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("metadata", metadata),
                checkRequired("verified", verified),
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                countryCode,
                defaultChannel,
                displayName,
                phoneNumber,
                primaryEmail,
                primaryPhone,
                profileName,
                updatedAt,
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
    fun validate(): Contact = apply {
        if (validated) {
            return@apply
        }

        id()
        availableChannels()
        createdAt()
        metadata().validate()
        verified()
        channels().ifPresent { it.forEach { it.validate() } }
        countryCode()
        defaultChannel().ifPresent { it.validate() }
        displayName()
        phoneNumber()
        primaryEmail()
        primaryPhone()
        profileName()
        updatedAt()
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
            (availableChannels.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (verified.asKnown().isPresent) 1 else 0) +
            (channels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (defaultChannel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (primaryEmail.asKnown().isPresent) 1 else 0) +
            (if (primaryPhone.asKnown().isPresent) 1 else 0) +
            (if (profileName.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** Preferred channel for this contact. */
    class DefaultChannel @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SMS = of("sms")

            @JvmField val WHATSAPP = of("whatsapp")

            @JvmField val TELEGRAM = of("telegram")

            @JvmField val EMAIL = of("email")

            @JvmField val INSTAGRAM = of("instagram")

            @JvmField val MESSENGER = of("messenger")

            @JvmField val VOICE = of("voice")

            @JvmStatic fun of(value: String) = DefaultChannel(JsonField.of(value))
        }

        /** An enum containing [DefaultChannel]'s known values. */
        enum class Known {
            SMS,
            WHATSAPP,
            TELEGRAM,
            EMAIL,
            INSTAGRAM,
            MESSENGER,
            VOICE,
        }

        /**
         * An enum containing [DefaultChannel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DefaultChannel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS,
            WHATSAPP,
            TELEGRAM,
            EMAIL,
            INSTAGRAM,
            MESSENGER,
            VOICE,
            /**
             * An enum member indicating that [DefaultChannel] was instantiated with an unknown
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
                SMS -> Value.SMS
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ZavudevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SMS -> Known.SMS
                WHATSAPP -> Known.WHATSAPP
                TELEGRAM -> Known.TELEGRAM
                EMAIL -> Known.EMAIL
                INSTAGRAM -> Known.INSTAGRAM
                MESSENGER -> Known.MESSENGER
                VOICE -> Known.VOICE
                else -> throw ZavudevInvalidDataException("Unknown DefaultChannel: $value")
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
        fun validate(): DefaultChannel = apply {
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

            return other is DefaultChannel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Contact &&
            id == other.id &&
            availableChannels == other.availableChannels &&
            createdAt == other.createdAt &&
            metadata == other.metadata &&
            verified == other.verified &&
            channels == other.channels &&
            countryCode == other.countryCode &&
            defaultChannel == other.defaultChannel &&
            displayName == other.displayName &&
            phoneNumber == other.phoneNumber &&
            primaryEmail == other.primaryEmail &&
            primaryPhone == other.primaryPhone &&
            profileName == other.profileName &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            availableChannels,
            createdAt,
            metadata,
            verified,
            channels,
            countryCode,
            defaultChannel,
            displayName,
            phoneNumber,
            primaryEmail,
            primaryPhone,
            profileName,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Contact{id=$id, availableChannels=$availableChannels, createdAt=$createdAt, metadata=$metadata, verified=$verified, channels=$channels, countryCode=$countryCode, defaultChannel=$defaultChannel, displayName=$displayName, phoneNumber=$phoneNumber, primaryEmail=$primaryEmail, primaryPhone=$primaryPhone, profileName=$profileName, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
