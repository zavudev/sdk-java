// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.regulatorydocuments

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

class RegulatoryDocumentUploadUrlResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val uploadUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("uploadUrl") @ExcludeMissing uploadUrl: JsonField<String> = JsonMissing.of()
    ) : this(uploadUrl, mutableMapOf())

    /**
     * Pre-signed URL for uploading the file.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uploadUrl(): String = uploadUrl.getRequired("uploadUrl")

    /**
     * Returns the raw JSON value of [uploadUrl].
     *
     * Unlike [uploadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uploadUrl") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

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
         * [RegulatoryDocumentUploadUrlResponse].
         *
         * The following fields are required:
         * ```java
         * .uploadUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RegulatoryDocumentUploadUrlResponse]. */
    class Builder internal constructor() {

        private var uploadUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            regulatoryDocumentUploadUrlResponse: RegulatoryDocumentUploadUrlResponse
        ) = apply {
            uploadUrl = regulatoryDocumentUploadUrlResponse.uploadUrl
            additionalProperties =
                regulatoryDocumentUploadUrlResponse.additionalProperties.toMutableMap()
        }

        /** Pre-signed URL for uploading the file. */
        fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

        /**
         * Sets [Builder.uploadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

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
         * Returns an immutable instance of [RegulatoryDocumentUploadUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .uploadUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RegulatoryDocumentUploadUrlResponse =
            RegulatoryDocumentUploadUrlResponse(
                checkRequired("uploadUrl", uploadUrl),
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
    fun validate(): RegulatoryDocumentUploadUrlResponse = apply {
        if (validated) {
            return@apply
        }

        uploadUrl()
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
    @JvmSynthetic internal fun validity(): Int = (if (uploadUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RegulatoryDocumentUploadUrlResponse &&
            uploadUrl == other.uploadUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(uploadUrl, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RegulatoryDocumentUploadUrlResponse{uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"
}
