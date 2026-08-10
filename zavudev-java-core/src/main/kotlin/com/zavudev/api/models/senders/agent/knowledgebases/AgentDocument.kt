// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AgentDocument
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val chunkCount: JsonField<Long>,
    private val contentLength: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val isProcessed: JsonField<Boolean>,
    private val knowledgeBaseId: JsonField<String>,
    private val title: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chunkCount") @ExcludeMissing chunkCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contentLength")
        @ExcludeMissing
        contentLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("isProcessed")
        @ExcludeMissing
        isProcessed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("knowledgeBaseId")
        @ExcludeMissing
        knowledgeBaseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        chunkCount,
        contentLength,
        createdAt,
        isProcessed,
        knowledgeBaseId,
        title,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Number of chunks created from this document.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chunkCount(): Long = chunkCount.getRequired("chunkCount")

    /**
     * Length of the document content in characters.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentLength(): Long = contentLength.getRequired("contentLength")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Whether the document has been processed for RAG.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isProcessed(): Boolean = isProcessed.getRequired("isProcessed")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun knowledgeBaseId(): String = knowledgeBaseId.getRequired("knowledgeBaseId")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [chunkCount].
     *
     * Unlike [chunkCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunkCount") @ExcludeMissing fun _chunkCount(): JsonField<Long> = chunkCount

    /**
     * Returns the raw JSON value of [contentLength].
     *
     * Unlike [contentLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentLength")
    @ExcludeMissing
    fun _contentLength(): JsonField<Long> = contentLength

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [isProcessed].
     *
     * Unlike [isProcessed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isProcessed")
    @ExcludeMissing
    fun _isProcessed(): JsonField<Boolean> = isProcessed

    /**
     * Returns the raw JSON value of [knowledgeBaseId].
     *
     * Unlike [knowledgeBaseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("knowledgeBaseId")
    @ExcludeMissing
    fun _knowledgeBaseId(): JsonField<String> = knowledgeBaseId

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
         * Returns a mutable builder for constructing an instance of [AgentDocument].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chunkCount()
         * .contentLength()
         * .createdAt()
         * .isProcessed()
         * .knowledgeBaseId()
         * .title()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentDocument]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var chunkCount: JsonField<Long>? = null
        private var contentLength: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isProcessed: JsonField<Boolean>? = null
        private var knowledgeBaseId: JsonField<String>? = null
        private var title: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentDocument: AgentDocument) = apply {
            id = agentDocument.id
            chunkCount = agentDocument.chunkCount
            contentLength = agentDocument.contentLength
            createdAt = agentDocument.createdAt
            isProcessed = agentDocument.isProcessed
            knowledgeBaseId = agentDocument.knowledgeBaseId
            title = agentDocument.title
            updatedAt = agentDocument.updatedAt
            additionalProperties = agentDocument.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Number of chunks created from this document. */
        fun chunkCount(chunkCount: Long) = chunkCount(JsonField.of(chunkCount))

        /**
         * Sets [Builder.chunkCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chunkCount(chunkCount: JsonField<Long>) = apply { this.chunkCount = chunkCount }

        /** Length of the document content in characters. */
        fun contentLength(contentLength: Long) = contentLength(JsonField.of(contentLength))

        /**
         * Sets [Builder.contentLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentLength] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentLength(contentLength: JsonField<Long>) = apply {
            this.contentLength = contentLength
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

        /** Whether the document has been processed for RAG. */
        fun isProcessed(isProcessed: Boolean) = isProcessed(JsonField.of(isProcessed))

        /**
         * Sets [Builder.isProcessed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isProcessed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isProcessed(isProcessed: JsonField<Boolean>) = apply { this.isProcessed = isProcessed }

        fun knowledgeBaseId(knowledgeBaseId: String) =
            knowledgeBaseId(JsonField.of(knowledgeBaseId))

        /**
         * Sets [Builder.knowledgeBaseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.knowledgeBaseId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun knowledgeBaseId(knowledgeBaseId: JsonField<String>) = apply {
            this.knowledgeBaseId = knowledgeBaseId
        }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [AgentDocument].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chunkCount()
         * .contentLength()
         * .createdAt()
         * .isProcessed()
         * .knowledgeBaseId()
         * .title()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentDocument =
            AgentDocument(
                checkRequired("id", id),
                checkRequired("chunkCount", chunkCount),
                checkRequired("contentLength", contentLength),
                checkRequired("createdAt", createdAt),
                checkRequired("isProcessed", isProcessed),
                checkRequired("knowledgeBaseId", knowledgeBaseId),
                checkRequired("title", title),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): AgentDocument = apply {
        if (validated) {
            return@apply
        }

        id()
        chunkCount()
        contentLength()
        createdAt()
        isProcessed()
        knowledgeBaseId()
        title()
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
            (if (chunkCount.asKnown().isPresent) 1 else 0) +
            (if (contentLength.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (isProcessed.asKnown().isPresent) 1 else 0) +
            (if (knowledgeBaseId.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentDocument &&
            id == other.id &&
            chunkCount == other.chunkCount &&
            contentLength == other.contentLength &&
            createdAt == other.createdAt &&
            isProcessed == other.isProcessed &&
            knowledgeBaseId == other.knowledgeBaseId &&
            title == other.title &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            chunkCount,
            contentLength,
            createdAt,
            isProcessed,
            knowledgeBaseId,
            title,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentDocument{id=$id, chunkCount=$chunkCount, contentLength=$contentLength, createdAt=$createdAt, isProcessed=$isProcessed, knowledgeBaseId=$knowledgeBaseId, title=$title, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
