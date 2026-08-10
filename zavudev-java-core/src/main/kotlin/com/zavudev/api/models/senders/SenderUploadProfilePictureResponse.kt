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
import com.zavudev.api.core.checkRequired
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SenderUploadProfilePictureResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val profile: JsonField<WhatsappBusinessProfile>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("profile")
        @ExcludeMissing
        profile: JsonField<WhatsappBusinessProfile> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(profile, success, mutableMapOf())

    /**
     * WhatsApp Business profile information.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun profile(): WhatsappBusinessProfile = profile.getRequired("profile")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Returns the raw JSON value of [profile].
     *
     * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile")
    @ExcludeMissing
    fun _profile(): JsonField<WhatsappBusinessProfile> = profile

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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
         * Returns a mutable builder for constructing an instance of
         * [SenderUploadProfilePictureResponse].
         *
         * The following fields are required:
         * ```java
         * .profile()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SenderUploadProfilePictureResponse]. */
    class Builder internal constructor() {

        private var profile: JsonField<WhatsappBusinessProfile>? = null
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(senderUploadProfilePictureResponse: SenderUploadProfilePictureResponse) =
            apply {
                profile = senderUploadProfilePictureResponse.profile
                success = senderUploadProfilePictureResponse.success
                additionalProperties =
                    senderUploadProfilePictureResponse.additionalProperties.toMutableMap()
            }

        /** WhatsApp Business profile information. */
        fun profile(profile: WhatsappBusinessProfile) = profile(JsonField.of(profile))

        /**
         * Sets [Builder.profile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profile] with a well-typed [WhatsappBusinessProfile]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun profile(profile: JsonField<WhatsappBusinessProfile>) = apply { this.profile = profile }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [SenderUploadProfilePictureResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .profile()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SenderUploadProfilePictureResponse =
            SenderUploadProfilePictureResponse(
                checkRequired("profile", profile),
                checkRequired("success", success),
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
    fun validate(): SenderUploadProfilePictureResponse = apply {
        if (validated) {
            return@apply
        }

        profile().validate()
        success()
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
        (profile.asKnown().getOrNull()?.validity() ?: 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SenderUploadProfilePictureResponse &&
            profile == other.profile &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(profile, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SenderUploadProfilePictureResponse{profile=$profile, success=$success, additionalProperties=$additionalProperties}"
}
