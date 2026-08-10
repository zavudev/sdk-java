// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** WhatsApp Business profile information. */
class WhatsappBusinessProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val about: JsonField<String>,
    private val address: JsonField<String>,
    private val description: JsonField<String>,
    private val email: JsonField<String>,
    private val profilePictureUrl: JsonField<String>,
    private val vertical: JsonField<WhatsappBusinessProfileVertical>,
    private val websites: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("about") @ExcludeMissing about: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("profilePictureUrl")
        @ExcludeMissing
        profilePictureUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vertical")
        @ExcludeMissing
        vertical: JsonField<WhatsappBusinessProfileVertical> = JsonMissing.of(),
        @JsonProperty("websites")
        @ExcludeMissing
        websites: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        about,
        address,
        description,
        email,
        profilePictureUrl,
        vertical,
        websites,
        mutableMapOf(),
    )

    /**
     * Short description of the business (max 139 characters).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun about(): Optional<String> = about.getOptional("about")

    /**
     * Physical address of the business (max 256 characters).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<String> = address.getOptional("address")

    /**
     * Extended description of the business (max 512 characters).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Business email address.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * URL of the business profile picture.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profilePictureUrl(): Optional<String> = profilePictureUrl.getOptional("profilePictureUrl")

    /**
     * Business category for WhatsApp Business profile.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vertical(): Optional<WhatsappBusinessProfileVertical> = vertical.getOptional("vertical")

    /**
     * Business website URLs (maximum 2).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun websites(): Optional<List<String>> = websites.getOptional("websites")

    /**
     * Returns the raw JSON value of [about].
     *
     * Unlike [about], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("about") @ExcludeMissing fun _about(): JsonField<String> = about

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [profilePictureUrl].
     *
     * Unlike [profilePictureUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("profilePictureUrl")
    @ExcludeMissing
    fun _profilePictureUrl(): JsonField<String> = profilePictureUrl

    /**
     * Returns the raw JSON value of [vertical].
     *
     * Unlike [vertical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vertical")
    @ExcludeMissing
    fun _vertical(): JsonField<WhatsappBusinessProfileVertical> = vertical

    /**
     * Returns the raw JSON value of [websites].
     *
     * Unlike [websites], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("websites") @ExcludeMissing fun _websites(): JsonField<List<String>> = websites

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

        /** Returns a mutable builder for constructing an instance of [WhatsappBusinessProfile]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappBusinessProfile]. */
    class Builder internal constructor() {

        private var about: JsonField<String> = JsonMissing.of()
        private var address: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var profilePictureUrl: JsonField<String> = JsonMissing.of()
        private var vertical: JsonField<WhatsappBusinessProfileVertical> = JsonMissing.of()
        private var websites: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappBusinessProfile: WhatsappBusinessProfile) = apply {
            about = whatsappBusinessProfile.about
            address = whatsappBusinessProfile.address
            description = whatsappBusinessProfile.description
            email = whatsappBusinessProfile.email
            profilePictureUrl = whatsappBusinessProfile.profilePictureUrl
            vertical = whatsappBusinessProfile.vertical
            websites = whatsappBusinessProfile.websites.map { it.toMutableList() }
            additionalProperties = whatsappBusinessProfile.additionalProperties.toMutableMap()
        }

        /** Short description of the business (max 139 characters). */
        fun about(about: String) = about(JsonField.of(about))

        /**
         * Sets [Builder.about] to an arbitrary JSON value.
         *
         * You should usually call [Builder.about] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun about(about: JsonField<String>) = apply { this.about = about }

        /** Physical address of the business (max 256 characters). */
        fun address(address: String) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { this.address = address }

        /** Extended description of the business (max 512 characters). */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Business email address. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** URL of the business profile picture. */
        fun profilePictureUrl(profilePictureUrl: String) =
            profilePictureUrl(JsonField.of(profilePictureUrl))

        /**
         * Sets [Builder.profilePictureUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profilePictureUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun profilePictureUrl(profilePictureUrl: JsonField<String>) = apply {
            this.profilePictureUrl = profilePictureUrl
        }

        /** Business category for WhatsApp Business profile. */
        fun vertical(vertical: WhatsappBusinessProfileVertical) = vertical(JsonField.of(vertical))

        /**
         * Sets [Builder.vertical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vertical] with a well-typed
         * [WhatsappBusinessProfileVertical] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun vertical(vertical: JsonField<WhatsappBusinessProfileVertical>) = apply {
            this.vertical = vertical
        }

        /** Business website URLs (maximum 2). */
        fun websites(websites: List<String>) = websites(JsonField.of(websites))

        /**
         * Sets [Builder.websites] to an arbitrary JSON value.
         *
         * You should usually call [Builder.websites] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun websites(websites: JsonField<List<String>>) = apply {
            this.websites = websites.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [websites].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebsite(website: String) = apply {
            websites =
                (websites ?: JsonField.of(mutableListOf())).also {
                    checkKnown("websites", it).add(website)
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
         * Returns an immutable instance of [WhatsappBusinessProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WhatsappBusinessProfile =
            WhatsappBusinessProfile(
                about,
                address,
                description,
                email,
                profilePictureUrl,
                vertical,
                (websites ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): WhatsappBusinessProfile = apply {
        if (validated) {
            return@apply
        }

        about()
        address()
        description()
        email()
        profilePictureUrl()
        vertical().ifPresent { it.validate() }
        websites()
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
        (if (about.asKnown().isPresent) 1 else 0) +
            (if (address.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (profilePictureUrl.asKnown().isPresent) 1 else 0) +
            (vertical.asKnown().getOrNull()?.validity() ?: 0) +
            (websites.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappBusinessProfile &&
            about == other.about &&
            address == other.address &&
            description == other.description &&
            email == other.email &&
            profilePictureUrl == other.profilePictureUrl &&
            vertical == other.vertical &&
            websites == other.websites &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            about,
            address,
            description,
            email,
            profilePictureUrl,
            vertical,
            websites,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappBusinessProfile{about=$about, address=$address, description=$description, email=$email, profilePictureUrl=$profilePictureUrl, vertical=$vertical, websites=$websites, additionalProperties=$additionalProperties}"
}
