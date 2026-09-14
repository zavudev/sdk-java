// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.messages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class MessageListAttachmentsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
         * [MessageListAttachmentsResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageListAttachmentsResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageListAttachmentsResponse: MessageListAttachmentsResponse) = apply {
            items = messageListAttachmentsResponse.items.map { it.toMutableList() }
            additionalProperties =
                messageListAttachmentsResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
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
         * Returns an immutable instance of [MessageListAttachmentsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageListAttachmentsResponse =
            MessageListAttachmentsResponse(
                checkRequired("items", items).map { it.toImmutable() },
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
    fun validate(): MessageListAttachmentsResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** A stored file attachment for an email message (inbound or outbound). */
    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val contentId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val downloadUrl: JsonField<String>,
        private val filename: JsonField<String>,
        private val isInline: JsonField<Boolean>,
        private val mimeType: JsonField<String>,
        private val size: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contentId")
            @ExcludeMissing
            contentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("downloadUrl")
            @ExcludeMissing
            downloadUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isInline")
            @ExcludeMissing
            isInline: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("mimeType")
            @ExcludeMissing
            mimeType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            contentId,
            createdAt,
            downloadUrl,
            filename,
            isInline,
            mimeType,
            size,
            mutableMapOf(),
        )

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Content-ID for inline attachments (referenced in the HTML body as `cid:<contentId>`).
         * Null for regular attachments.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentId(): Optional<String> = contentId.getOptional("contentId")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Short-lived signed URL to download the attachment bytes. Freshly generated on each
         * request and expires; do not cache it. Null if the stored file is no longer available.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun downloadUrl(): Optional<String> = downloadUrl.getOptional("downloadUrl")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String = filename.getRequired("filename")

        /**
         * Whether the attachment is inline (embedded in the HTML body) rather than a regular
         * attachment.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isInline(): Boolean = isInline.getRequired("isInline")

        /**
         * MIME type of the attachment.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mimeType(): String = mimeType.getRequired("mimeType")

        /**
         * Size of the attachment in bytes.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun size(): Long = size.getRequired("size")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [contentId].
         *
         * Unlike [contentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contentId") @ExcludeMissing fun _contentId(): JsonField<String> = contentId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [downloadUrl].
         *
         * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("downloadUrl")
        @ExcludeMissing
        fun _downloadUrl(): JsonField<String> = downloadUrl

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [isInline].
         *
         * Unlike [isInline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isInline") @ExcludeMissing fun _isInline(): JsonField<Boolean> = isInline

        /**
         * Returns the raw JSON value of [mimeType].
         *
         * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mimeType") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

        /**
         * Returns the raw JSON value of [size].
         *
         * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .contentId()
             * .createdAt()
             * .downloadUrl()
             * .filename()
             * .isInline()
             * .mimeType()
             * .size()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var contentId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var downloadUrl: JsonField<String>? = null
            private var filename: JsonField<String>? = null
            private var isInline: JsonField<Boolean>? = null
            private var mimeType: JsonField<String>? = null
            private var size: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                contentId = item.contentId
                createdAt = item.createdAt
                downloadUrl = item.downloadUrl
                filename = item.filename
                isInline = item.isInline
                mimeType = item.mimeType
                size = item.size
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Content-ID for inline attachments (referenced in the HTML body as `cid:<contentId>`).
             * Null for regular attachments.
             */
            fun contentId(contentId: String?) = contentId(JsonField.ofNullable(contentId))

            /** Alias for calling [Builder.contentId] with `contentId.orElse(null)`. */
            fun contentId(contentId: Optional<String>) = contentId(contentId.getOrNull())

            /**
             * Sets [Builder.contentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentId(contentId: JsonField<String>) = apply { this.contentId = contentId }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Short-lived signed URL to download the attachment bytes. Freshly generated on each
             * request and expires; do not cache it. Null if the stored file is no longer available.
             */
            fun downloadUrl(downloadUrl: String?) = downloadUrl(JsonField.ofNullable(downloadUrl))

            /** Alias for calling [Builder.downloadUrl] with `downloadUrl.orElse(null)`. */
            fun downloadUrl(downloadUrl: Optional<String>) = downloadUrl(downloadUrl.getOrNull())

            /**
             * Sets [Builder.downloadUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.downloadUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun downloadUrl(downloadUrl: JsonField<String>) = apply {
                this.downloadUrl = downloadUrl
            }

            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /**
             * Whether the attachment is inline (embedded in the HTML body) rather than a regular
             * attachment.
             */
            fun isInline(isInline: Boolean) = isInline(JsonField.of(isInline))

            /**
             * Sets [Builder.isInline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isInline] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isInline(isInline: JsonField<Boolean>) = apply { this.isInline = isInline }

            /** MIME type of the attachment. */
            fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

            /**
             * Sets [Builder.mimeType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mimeType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

            /** Size of the attachment in bytes. */
            fun size(size: Long) = size(JsonField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Long>) = apply { this.size = size }

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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .contentId()
             * .createdAt()
             * .downloadUrl()
             * .filename()
             * .isInline()
             * .mimeType()
             * .size()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("contentId", contentId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("downloadUrl", downloadUrl),
                    checkRequired("filename", filename),
                    checkRequired("isInline", isInline),
                    checkRequired("mimeType", mimeType),
                    checkRequired("size", size),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            id()
            contentId()
            createdAt()
            downloadUrl()
            filename()
            isInline()
            mimeType()
            size()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (contentId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (downloadUrl.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (isInline.asKnown().isPresent) 1 else 0) +
                (if (mimeType.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                contentId == other.contentId &&
                createdAt == other.createdAt &&
                downloadUrl == other.downloadUrl &&
                filename == other.filename &&
                isInline == other.isInline &&
                mimeType == other.mimeType &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                contentId,
                createdAt,
                downloadUrl,
                filename,
                isInline,
                mimeType,
                size,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, contentId=$contentId, createdAt=$createdAt, downloadUrl=$downloadUrl, filename=$filename, isInline=$isInline, mimeType=$mimeType, size=$size, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageListAttachmentsResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageListAttachmentsResponse{items=$items, additionalProperties=$additionalProperties}"
}
