// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PhoneNumberCapabilities
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mms: JsonField<Boolean>,
    private val sms: JsonField<Boolean>,
    private val voice: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mms") @ExcludeMissing mms: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sms") @ExcludeMissing sms: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("voice") @ExcludeMissing voice: JsonField<Boolean> = JsonMissing.of(),
    ) : this(mms, sms, voice, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mms(): Optional<Boolean> = mms.getOptional("mms")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sms(): Optional<Boolean> = sms.getOptional("sms")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voice(): Optional<Boolean> = voice.getOptional("voice")

    /**
     * Returns the raw JSON value of [mms].
     *
     * Unlike [mms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mms") @ExcludeMissing fun _mms(): JsonField<Boolean> = mms

    /**
     * Returns the raw JSON value of [sms].
     *
     * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sms") @ExcludeMissing fun _sms(): JsonField<Boolean> = sms

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<Boolean> = voice

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

        /** Returns a mutable builder for constructing an instance of [PhoneNumberCapabilities]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberCapabilities]. */
    class Builder internal constructor() {

        private var mms: JsonField<Boolean> = JsonMissing.of()
        private var sms: JsonField<Boolean> = JsonMissing.of()
        private var voice: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneNumberCapabilities: PhoneNumberCapabilities) = apply {
            mms = phoneNumberCapabilities.mms
            sms = phoneNumberCapabilities.sms
            voice = phoneNumberCapabilities.voice
            additionalProperties = phoneNumberCapabilities.additionalProperties.toMutableMap()
        }

        fun mms(mms: Boolean) = mms(JsonField.of(mms))

        /**
         * Sets [Builder.mms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mms] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mms(mms: JsonField<Boolean>) = apply { this.mms = mms }

        fun sms(sms: Boolean) = sms(JsonField.of(sms))

        /**
         * Sets [Builder.sms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sms] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sms(sms: JsonField<Boolean>) = apply { this.sms = sms }

        fun voice(voice: Boolean) = voice(JsonField.of(voice))

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun voice(voice: JsonField<Boolean>) = apply { this.voice = voice }

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
         * Returns an immutable instance of [PhoneNumberCapabilities].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberCapabilities =
            PhoneNumberCapabilities(mms, sms, voice, additionalProperties.toMutableMap())
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
    fun validate(): PhoneNumberCapabilities = apply {
        if (validated) {
            return@apply
        }

        mms()
        sms()
        voice()
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
        (if (mms.asKnown().isPresent) 1 else 0) +
            (if (sms.asKnown().isPresent) 1 else 0) +
            (if (voice.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberCapabilities &&
            mms == other.mms &&
            sms == other.sms &&
            voice == other.voice &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(mms, sms, voice, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneNumberCapabilities{mms=$mms, sms=$sms, voice=$voice, additionalProperties=$additionalProperties}"
}
