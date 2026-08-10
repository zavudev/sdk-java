// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent.knowledgebases

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentCreateResponse
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentListPage
import com.zavudev.api.models.senders.agent.knowledgebases.documents.DocumentListParams
import java.util.function.Consumer

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService

    /** Add a document to a knowledge base. The document will be automatically processed for RAG. */
    fun create(kbId: String, params: DocumentCreateParams): DocumentCreateResponse =
        create(kbId, params, RequestOptions.none())

    /** @see create */
    fun create(
        kbId: String,
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentCreateResponse = create(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see create */
    fun create(params: DocumentCreateParams): DocumentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentCreateResponse

    /** List documents in a knowledge base. */
    fun list(kbId: String, params: DocumentListParams): DocumentListPage =
        list(kbId, params, RequestOptions.none())

    /** @see list */
    fun list(
        kbId: String,
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage = list(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see list */
    fun list(params: DocumentListParams): DocumentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage

    /** Delete a document from a knowledge base. */
    fun delete(docId: String, params: DocumentDeleteParams) =
        delete(docId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        docId: String,
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see delete */
    fun delete(params: DocumentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DocumentDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}/documents`, but is otherwise the same
         * as [DocumentService.create].
         */
        @MustBeClosed
        fun create(
            kbId: String,
            params: DocumentCreateParams,
        ): HttpResponseFor<DocumentCreateResponse> = create(kbId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            kbId: String,
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentCreateResponse> =
            create(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: DocumentCreateParams): HttpResponseFor<DocumentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}/documents`, but is otherwise the same
         * as [DocumentService.list].
         */
        @MustBeClosed
        fun list(kbId: String, params: DocumentListParams): HttpResponseFor<DocumentListPage> =
            list(kbId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            kbId: String,
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPage> =
            list(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: DocumentListParams): HttpResponseFor<DocumentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}/documents/{docId}`, but is otherwise
         * the same as [DocumentService.delete].
         */
        @MustBeClosed
        fun delete(docId: String, params: DocumentDeleteParams): HttpResponse =
            delete(docId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            docId: String,
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: DocumentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
