// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Content for non-text broadcast message types. */
class BroadcastContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filename: JsonField<String>,
    private val mediaId: JsonField<String>,
    private val mediaUrl: JsonField<String>,
    private val mimeType: JsonField<String>,
    private val templateButtonVariables: JsonField<TemplateButtonVariables>,
    private val templateHeaderVariables: JsonField<TemplateHeaderVariables>,
    private val templateId: JsonField<String>,
    private val templateVariables: JsonField<TemplateVariables>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaId") @ExcludeMissing mediaId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mediaUrl") @ExcludeMissing mediaUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mimeType") @ExcludeMissing mimeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("templateButtonVariables")
        @ExcludeMissing
        templateButtonVariables: JsonField<TemplateButtonVariables> = JsonMissing.of(),
        @JsonProperty("templateHeaderVariables")
        @ExcludeMissing
        templateHeaderVariables: JsonField<TemplateHeaderVariables> = JsonMissing.of(),
        @JsonProperty("templateId")
        @ExcludeMissing
        templateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("templateVariables")
        @ExcludeMissing
        templateVariables: JsonField<TemplateVariables> = JsonMissing.of(),
    ) : this(
        filename,
        mediaId,
        mediaUrl,
        mimeType,
        templateButtonVariables,
        templateHeaderVariables,
        templateId,
        templateVariables,
        mutableMapOf(),
    )

    /**
     * Filename for documents.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * Media ID if already uploaded.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaId(): Optional<String> = mediaId.getOptional("mediaId")

    /**
     * URL of the media file.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = mediaUrl.getOptional("mediaUrl")

    /**
     * MIME type of the media.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mimeType(): Optional<String> = mimeType.getOptional("mimeType")

    /**
     * Default button variables for dynamic URL/OTP buttons. Keys are the button index (0, 1, 2).
     * Per-contact values override these.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateButtonVariables(): Optional<TemplateButtonVariables> =
        templateButtonVariables.getOptional("templateButtonVariables")

    /**
     * Default value for a text-header variable, keyed by `1` (can be overridden per contact). If
     * omitted, Zavu resolves the header from `templateVariables` by the header placeholder's name.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateHeaderVariables(): Optional<TemplateHeaderVariables> =
        templateHeaderVariables.getOptional("templateHeaderVariables")

    /**
     * Template ID for template messages.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateId(): Optional<String> = templateId.getOptional("templateId")

    /**
     * Default body variables (can be overridden per contact). Key them to match the template body:
     * by position (`1`, `2`, ...) for positional templates, or by name (e.g. `customer_name`) for
     * named templates. Zavu detects the template's format and sends the correct payload to Meta. Do
     * not mix positional and named keys.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateVariables(): Optional<TemplateVariables> =
        templateVariables.getOptional("templateVariables")

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * Returns the raw JSON value of [mediaId].
     *
     * Unlike [mediaId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaId") @ExcludeMissing fun _mediaId(): JsonField<String> = mediaId

    /**
     * Returns the raw JSON value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaUrl") @ExcludeMissing fun _mediaUrl(): JsonField<String> = mediaUrl

    /**
     * Returns the raw JSON value of [mimeType].
     *
     * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mimeType") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

    /**
     * Returns the raw JSON value of [templateButtonVariables].
     *
     * Unlike [templateButtonVariables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("templateButtonVariables")
    @ExcludeMissing
    fun _templateButtonVariables(): JsonField<TemplateButtonVariables> = templateButtonVariables

    /**
     * Returns the raw JSON value of [templateHeaderVariables].
     *
     * Unlike [templateHeaderVariables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("templateHeaderVariables")
    @ExcludeMissing
    fun _templateHeaderVariables(): JsonField<TemplateHeaderVariables> = templateHeaderVariables

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templateId") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

    /**
     * Returns the raw JSON value of [templateVariables].
     *
     * Unlike [templateVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("templateVariables")
    @ExcludeMissing
    fun _templateVariables(): JsonField<TemplateVariables> = templateVariables

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

        /** Returns a mutable builder for constructing an instance of [BroadcastContent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BroadcastContent]. */
    class Builder internal constructor() {

        private var filename: JsonField<String> = JsonMissing.of()
        private var mediaId: JsonField<String> = JsonMissing.of()
        private var mediaUrl: JsonField<String> = JsonMissing.of()
        private var mimeType: JsonField<String> = JsonMissing.of()
        private var templateButtonVariables: JsonField<TemplateButtonVariables> = JsonMissing.of()
        private var templateHeaderVariables: JsonField<TemplateHeaderVariables> = JsonMissing.of()
        private var templateId: JsonField<String> = JsonMissing.of()
        private var templateVariables: JsonField<TemplateVariables> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(broadcastContent: BroadcastContent) = apply {
            filename = broadcastContent.filename
            mediaId = broadcastContent.mediaId
            mediaUrl = broadcastContent.mediaUrl
            mimeType = broadcastContent.mimeType
            templateButtonVariables = broadcastContent.templateButtonVariables
            templateHeaderVariables = broadcastContent.templateHeaderVariables
            templateId = broadcastContent.templateId
            templateVariables = broadcastContent.templateVariables
            additionalProperties = broadcastContent.additionalProperties.toMutableMap()
        }

        /** Filename for documents. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** Media ID if already uploaded. */
        fun mediaId(mediaId: String) = mediaId(JsonField.of(mediaId))

        /**
         * Sets [Builder.mediaId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaId(mediaId: JsonField<String>) = apply { this.mediaId = mediaId }

        /** URL of the media file. */
        fun mediaUrl(mediaUrl: String) = mediaUrl(JsonField.of(mediaUrl))

        /**
         * Sets [Builder.mediaUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: JsonField<String>) = apply { this.mediaUrl = mediaUrl }

        /** MIME type of the media. */
        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /**
         * Sets [Builder.mimeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

        /**
         * Default button variables for dynamic URL/OTP buttons. Keys are the button index (0, 1,
         * 2). Per-contact values override these.
         */
        fun templateButtonVariables(templateButtonVariables: TemplateButtonVariables) =
            templateButtonVariables(JsonField.of(templateButtonVariables))

        /**
         * Sets [Builder.templateButtonVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateButtonVariables] with a well-typed
         * [TemplateButtonVariables] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun templateButtonVariables(templateButtonVariables: JsonField<TemplateButtonVariables>) =
            apply {
                this.templateButtonVariables = templateButtonVariables
            }

        /**
         * Default value for a text-header variable, keyed by `1` (can be overridden per contact).
         * If omitted, Zavu resolves the header from `templateVariables` by the header placeholder's
         * name.
         */
        fun templateHeaderVariables(templateHeaderVariables: TemplateHeaderVariables) =
            templateHeaderVariables(JsonField.of(templateHeaderVariables))

        /**
         * Sets [Builder.templateHeaderVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateHeaderVariables] with a well-typed
         * [TemplateHeaderVariables] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun templateHeaderVariables(templateHeaderVariables: JsonField<TemplateHeaderVariables>) =
            apply {
                this.templateHeaderVariables = templateHeaderVariables
            }

        /** Template ID for template messages. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /**
         * Default body variables (can be overridden per contact). Key them to match the template
         * body: by position (`1`, `2`, ...) for positional templates, or by name (e.g.
         * `customer_name`) for named templates. Zavu detects the template's format and sends the
         * correct payload to Meta. Do not mix positional and named keys.
         */
        fun templateVariables(templateVariables: TemplateVariables) =
            templateVariables(JsonField.of(templateVariables))

        /**
         * Sets [Builder.templateVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateVariables] with a well-typed [TemplateVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun templateVariables(templateVariables: JsonField<TemplateVariables>) = apply {
            this.templateVariables = templateVariables
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
         * Returns an immutable instance of [BroadcastContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BroadcastContent =
            BroadcastContent(
                filename,
                mediaId,
                mediaUrl,
                mimeType,
                templateButtonVariables,
                templateHeaderVariables,
                templateId,
                templateVariables,
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
    fun validate(): BroadcastContent = apply {
        if (validated) {
            return@apply
        }

        filename()
        mediaId()
        mediaUrl()
        mimeType()
        templateButtonVariables().ifPresent { it.validate() }
        templateHeaderVariables().ifPresent { it.validate() }
        templateId()
        templateVariables().ifPresent { it.validate() }
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
        (if (filename.asKnown().isPresent) 1 else 0) +
            (if (mediaId.asKnown().isPresent) 1 else 0) +
            (if (mediaUrl.asKnown().isPresent) 1 else 0) +
            (if (mimeType.asKnown().isPresent) 1 else 0) +
            (templateButtonVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (templateHeaderVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (if (templateId.asKnown().isPresent) 1 else 0) +
            (templateVariables.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Default button variables for dynamic URL/OTP buttons. Keys are the button index (0, 1, 2).
     * Per-contact values override these.
     */
    class TemplateButtonVariables
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

            /**
             * Returns a mutable builder for constructing an instance of [TemplateButtonVariables].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateButtonVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateButtonVariables: TemplateButtonVariables) = apply {
                additionalProperties = templateButtonVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateButtonVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateButtonVariables =
                TemplateButtonVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateButtonVariables = apply {
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

            return other is TemplateButtonVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TemplateButtonVariables{additionalProperties=$additionalProperties}"
    }

    /**
     * Default value for a text-header variable, keyed by `1` (can be overridden per contact). If
     * omitted, Zavu resolves the header from `templateVariables` by the header placeholder's name.
     */
    class TemplateHeaderVariables
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

            /**
             * Returns a mutable builder for constructing an instance of [TemplateHeaderVariables].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateHeaderVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateHeaderVariables: TemplateHeaderVariables) = apply {
                additionalProperties = templateHeaderVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateHeaderVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateHeaderVariables =
                TemplateHeaderVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateHeaderVariables = apply {
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

            return other is TemplateHeaderVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TemplateHeaderVariables{additionalProperties=$additionalProperties}"
    }

    /**
     * Default body variables (can be overridden per contact). Key them to match the template body:
     * by position (`1`, `2`, ...) for positional templates, or by name (e.g. `customer_name`) for
     * named templates. Zavu detects the template's format and sends the correct payload to Meta. Do
     * not mix positional and named keys.
     */
    class TemplateVariables
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

            /** Returns a mutable builder for constructing an instance of [TemplateVariables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateVariables: TemplateVariables) = apply {
                additionalProperties = templateVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateVariables = TemplateVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateVariables = apply {
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

            return other is TemplateVariables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TemplateVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BroadcastContent &&
            filename == other.filename &&
            mediaId == other.mediaId &&
            mediaUrl == other.mediaUrl &&
            mimeType == other.mimeType &&
            templateButtonVariables == other.templateButtonVariables &&
            templateHeaderVariables == other.templateHeaderVariables &&
            templateId == other.templateId &&
            templateVariables == other.templateVariables &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            filename,
            mediaId,
            mediaUrl,
            mimeType,
            templateButtonVariables,
            templateHeaderVariables,
            templateId,
            templateVariables,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BroadcastContent{filename=$filename, mediaId=$mediaId, mediaUrl=$mediaUrl, mimeType=$mimeType, templateButtonVariables=$templateButtonVariables, templateHeaderVariables=$templateHeaderVariables, templateId=$templateId, templateVariables=$templateVariables, additionalProperties=$additionalProperties}"
}
