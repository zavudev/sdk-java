// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases.documents

import com.zavudev.api.core.Params
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a single document from a knowledge base. */
class DocumentRetrieveDocumentParams
private constructor(
    private val senderId: String,
    private val kbId: String,
    private val docId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun senderId(): String = senderId

    fun kbId(): String = kbId

    fun docId(): Optional<String> = Optional.ofNullable(docId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DocumentRetrieveDocumentParams].
         *
         * The following fields are required:
         * ```java
         * .senderId()
         * .kbId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentRetrieveDocumentParams]. */
    class Builder internal constructor() {

        private var senderId: String? = null
        private var kbId: String? = null
        private var docId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentRetrieveDocumentParams: DocumentRetrieveDocumentParams) = apply {
            senderId = documentRetrieveDocumentParams.senderId
            kbId = documentRetrieveDocumentParams.kbId
            docId = documentRetrieveDocumentParams.docId
            additionalHeaders = documentRetrieveDocumentParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentRetrieveDocumentParams.additionalQueryParams.toBuilder()
        }

        fun senderId(senderId: String) = apply { this.senderId = senderId }

        fun kbId(kbId: String) = apply { this.kbId = kbId }

        fun docId(docId: String?) = apply { this.docId = docId }

        /** Alias for calling [Builder.docId] with `docId.orElse(null)`. */
        fun docId(docId: Optional<String>) = docId(docId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DocumentRetrieveDocumentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .senderId()
         * .kbId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentRetrieveDocumentParams =
            DocumentRetrieveDocumentParams(
                checkRequired("senderId", senderId),
                checkRequired("kbId", kbId),
                docId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> senderId
            1 -> kbId
            2 -> docId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentRetrieveDocumentParams &&
            senderId == other.senderId &&
            kbId == other.kbId &&
            docId == other.docId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(senderId, kbId, docId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentRetrieveDocumentParams{senderId=$senderId, kbId=$kbId, docId=$docId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
