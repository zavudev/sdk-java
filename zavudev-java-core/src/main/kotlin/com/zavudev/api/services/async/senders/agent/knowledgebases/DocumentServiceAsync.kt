// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent.knowledgebases

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentCreateResponse
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentListPageAsync
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    /** Add a document to a knowledge base. The document will be automatically processed for RAG. */
    fun create(
        kbId: String,
        params: DocumentCreateParams,
    ): CompletableFuture<DocumentCreateResponse> = create(kbId, params, RequestOptions.none())

    /** @see create */
    fun create(
        kbId: String,
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateResponse> =
        create(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see create */
    fun create(params: DocumentCreateParams): CompletableFuture<DocumentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateResponse>

    /** List documents in a knowledge base. */
    fun list(kbId: String, params: DocumentListParams): CompletableFuture<DocumentListPageAsync> =
        list(kbId, params, RequestOptions.none())

    /** @see list */
    fun list(
        kbId: String,
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListPageAsync> =
        list(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see list */
    fun list(params: DocumentListParams): CompletableFuture<DocumentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListPageAsync>

    /** Delete a document from a knowledge base. */
    fun delete(docId: String, params: DocumentDeleteParams): CompletableFuture<Void?> =
        delete(docId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        docId: String,
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DocumentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}/documents`, but is otherwise the same
         * as [DocumentServiceAsync.create].
         */
        fun create(
            kbId: String,
            params: DocumentCreateParams,
        ): CompletableFuture<HttpResponseFor<DocumentCreateResponse>> =
            create(kbId, params, RequestOptions.none())

        /** @see create */
        fun create(
            kbId: String,
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateResponse>> =
            create(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see create */
        fun create(
            params: DocumentCreateParams
        ): CompletableFuture<HttpResponseFor<DocumentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}/documents`, but is otherwise the same
         * as [DocumentServiceAsync.list].
         */
        fun list(
            kbId: String,
            params: DocumentListParams,
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(kbId, params, RequestOptions.none())

        /** @see list */
        fun list(
            kbId: String,
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see list */
        fun list(
            params: DocumentListParams
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}/documents/{docId}`, but is otherwise
         * the same as [DocumentServiceAsync.delete].
         */
        fun delete(docId: String, params: DocumentDeleteParams): CompletableFuture<HttpResponse> =
            delete(docId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            docId: String,
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see delete */
        fun delete(params: DocumentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
