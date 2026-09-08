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
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentRetrieveDocumentParams
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentRetrieveDocumentResponse
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentUpdateDocumentParams
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentUpdateDocumentResponse
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

    /** Get a single document from a knowledge base. */
    fun retrieveDocument(
        docId: String,
        params: DocumentRetrieveDocumentParams,
    ): CompletableFuture<DocumentRetrieveDocumentResponse> =
        retrieveDocument(docId, params, RequestOptions.none())

    /** @see retrieveDocument */
    fun retrieveDocument(
        docId: String,
        params: DocumentRetrieveDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetrieveDocumentResponse> =
        retrieveDocument(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieveDocument */
    fun retrieveDocument(
        params: DocumentRetrieveDocumentParams
    ): CompletableFuture<DocumentRetrieveDocumentResponse> =
        retrieveDocument(params, RequestOptions.none())

    /** @see retrieveDocument */
    fun retrieveDocument(
        params: DocumentRetrieveDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetrieveDocumentResponse>

    /** Update a document's title or content. Updating content reprocesses the document for RAG. */
    fun updateDocument(
        docId: String,
        params: DocumentUpdateDocumentParams,
    ): CompletableFuture<DocumentUpdateDocumentResponse> =
        updateDocument(docId, params, RequestOptions.none())

    /** @see updateDocument */
    fun updateDocument(
        docId: String,
        params: DocumentUpdateDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentUpdateDocumentResponse> =
        updateDocument(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see updateDocument */
    fun updateDocument(
        params: DocumentUpdateDocumentParams
    ): CompletableFuture<DocumentUpdateDocumentResponse> =
        updateDocument(params, RequestOptions.none())

    /** @see updateDocument */
    fun updateDocument(
        params: DocumentUpdateDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentUpdateDocumentResponse>

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

        /**
         * Returns a raw HTTP response for `get
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}/documents/{docId}`, but is otherwise
         * the same as [DocumentServiceAsync.retrieveDocument].
         */
        fun retrieveDocument(
            docId: String,
            params: DocumentRetrieveDocumentParams,
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveDocumentResponse>> =
            retrieveDocument(docId, params, RequestOptions.none())

        /** @see retrieveDocument */
        fun retrieveDocument(
            docId: String,
            params: DocumentRetrieveDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveDocumentResponse>> =
            retrieveDocument(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieveDocument */
        fun retrieveDocument(
            params: DocumentRetrieveDocumentParams
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveDocumentResponse>> =
            retrieveDocument(params, RequestOptions.none())

        /** @see retrieveDocument */
        fun retrieveDocument(
            params: DocumentRetrieveDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveDocumentResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}/documents/{docId}`, but is otherwise
         * the same as [DocumentServiceAsync.updateDocument].
         */
        fun updateDocument(
            docId: String,
            params: DocumentUpdateDocumentParams,
        ): CompletableFuture<HttpResponseFor<DocumentUpdateDocumentResponse>> =
            updateDocument(docId, params, RequestOptions.none())

        /** @see updateDocument */
        fun updateDocument(
            docId: String,
            params: DocumentUpdateDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentUpdateDocumentResponse>> =
            updateDocument(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see updateDocument */
        fun updateDocument(
            params: DocumentUpdateDocumentParams
        ): CompletableFuture<HttpResponseFor<DocumentUpdateDocumentResponse>> =
            updateDocument(params, RequestOptions.none())

        /** @see updateDocument */
        fun updateDocument(
            params: DocumentUpdateDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentUpdateDocumentResponse>>
    }
}
