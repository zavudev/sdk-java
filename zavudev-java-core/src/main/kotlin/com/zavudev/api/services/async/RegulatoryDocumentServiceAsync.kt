// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentDeleteParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListPageAsync
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentRetrieveParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentRetrieveResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentUploadUrlParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentUploadUrlResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RegulatoryDocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegulatoryDocumentServiceAsync

    /**
     * Create a regulatory document record after uploading the file. Use the upload-url endpoint
     * first to get an upload URL.
     */
    fun create(
        params: RegulatoryDocumentCreateParams
    ): CompletableFuture<RegulatoryDocumentCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RegulatoryDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegulatoryDocumentCreateResponse>

    /** Get a specific regulatory document. */
    fun retrieve(documentId: String): CompletableFuture<RegulatoryDocumentRetrieveResponse> =
        retrieve(documentId, RegulatoryDocumentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        params: RegulatoryDocumentRetrieveParams = RegulatoryDocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegulatoryDocumentRetrieveResponse> =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        params: RegulatoryDocumentRetrieveParams = RegulatoryDocumentRetrieveParams.none(),
    ): CompletableFuture<RegulatoryDocumentRetrieveResponse> =
        retrieve(documentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RegulatoryDocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegulatoryDocumentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RegulatoryDocumentRetrieveParams
    ): CompletableFuture<RegulatoryDocumentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RegulatoryDocumentRetrieveResponse> =
        retrieve(documentId, RegulatoryDocumentRetrieveParams.none(), requestOptions)

    /** List regulatory documents for this project. */
    fun list(): CompletableFuture<RegulatoryDocumentListPageAsync> =
        list(RegulatoryDocumentListParams.none())

    /** @see list */
    fun list(
        params: RegulatoryDocumentListParams = RegulatoryDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegulatoryDocumentListPageAsync>

    /** @see list */
    fun list(
        params: RegulatoryDocumentListParams = RegulatoryDocumentListParams.none()
    ): CompletableFuture<RegulatoryDocumentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RegulatoryDocumentListPageAsync> =
        list(RegulatoryDocumentListParams.none(), requestOptions)

    /** Delete a regulatory document. Cannot delete verified documents. */
    fun delete(documentId: String): CompletableFuture<Void?> =
        delete(documentId, RegulatoryDocumentDeleteParams.none())

    /** @see delete */
    fun delete(
        documentId: String,
        params: RegulatoryDocumentDeleteParams = RegulatoryDocumentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        documentId: String,
        params: RegulatoryDocumentDeleteParams = RegulatoryDocumentDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(documentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RegulatoryDocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RegulatoryDocumentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(documentId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(documentId, RegulatoryDocumentDeleteParams.none(), requestOptions)

    /**
     * Get a presigned URL to upload a document file. After uploading, use the storageId to create
     * the document record.
     */
    fun uploadUrl(): CompletableFuture<RegulatoryDocumentUploadUrlResponse> =
        uploadUrl(RegulatoryDocumentUploadUrlParams.none())

    /** @see uploadUrl */
    fun uploadUrl(
        params: RegulatoryDocumentUploadUrlParams = RegulatoryDocumentUploadUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegulatoryDocumentUploadUrlResponse>

    /** @see uploadUrl */
    fun uploadUrl(
        params: RegulatoryDocumentUploadUrlParams = RegulatoryDocumentUploadUrlParams.none()
    ): CompletableFuture<RegulatoryDocumentUploadUrlResponse> =
        uploadUrl(params, RequestOptions.none())

    /** @see uploadUrl */
    fun uploadUrl(
        requestOptions: RequestOptions
    ): CompletableFuture<RegulatoryDocumentUploadUrlResponse> =
        uploadUrl(RegulatoryDocumentUploadUrlParams.none(), requestOptions)

    /**
     * A view of [RegulatoryDocumentServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegulatoryDocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/documents`, but is otherwise the same as
         * [RegulatoryDocumentServiceAsync.create].
         */
        fun create(
            params: RegulatoryDocumentCreateParams
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RegulatoryDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/documents/{documentId}`, but is otherwise the
         * same as [RegulatoryDocumentServiceAsync.retrieve].
         */
        fun retrieve(
            documentId: String
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentRetrieveResponse>> =
            retrieve(documentId, RegulatoryDocumentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            documentId: String,
            params: RegulatoryDocumentRetrieveParams = RegulatoryDocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentRetrieveResponse>> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            documentId: String,
            params: RegulatoryDocumentRetrieveParams = RegulatoryDocumentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentRetrieveResponse>> =
            retrieve(documentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RegulatoryDocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RegulatoryDocumentRetrieveParams
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentRetrieveResponse>> =
            retrieve(documentId, RegulatoryDocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/documents`, but is otherwise the same as
         * [RegulatoryDocumentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RegulatoryDocumentListPageAsync>> =
            list(RegulatoryDocumentListParams.none())

        /** @see list */
        fun list(
            params: RegulatoryDocumentListParams = RegulatoryDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentListPageAsync>>

        /** @see list */
        fun list(
            params: RegulatoryDocumentListParams = RegulatoryDocumentListParams.none()
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentListPageAsync>> =
            list(RegulatoryDocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/documents/{documentId}`, but is otherwise the
         * same as [RegulatoryDocumentServiceAsync.delete].
         */
        fun delete(documentId: String): CompletableFuture<HttpResponse> =
            delete(documentId, RegulatoryDocumentDeleteParams.none())

        /** @see delete */
        fun delete(
            documentId: String,
            params: RegulatoryDocumentDeleteParams = RegulatoryDocumentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            documentId: String,
            params: RegulatoryDocumentDeleteParams = RegulatoryDocumentDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(documentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RegulatoryDocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RegulatoryDocumentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(documentId, RegulatoryDocumentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/documents/upload-url`, but is otherwise the
         * same as [RegulatoryDocumentServiceAsync.uploadUrl].
         */
        fun uploadUrl(): CompletableFuture<HttpResponseFor<RegulatoryDocumentUploadUrlResponse>> =
            uploadUrl(RegulatoryDocumentUploadUrlParams.none())

        /** @see uploadUrl */
        fun uploadUrl(
            params: RegulatoryDocumentUploadUrlParams = RegulatoryDocumentUploadUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentUploadUrlResponse>>

        /** @see uploadUrl */
        fun uploadUrl(
            params: RegulatoryDocumentUploadUrlParams = RegulatoryDocumentUploadUrlParams.none()
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentUploadUrlResponse>> =
            uploadUrl(params, RequestOptions.none())

        /** @see uploadUrl */
        fun uploadUrl(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentUploadUrlResponse>> =
            uploadUrl(RegulatoryDocumentUploadUrlParams.none(), requestOptions)
    }
}
