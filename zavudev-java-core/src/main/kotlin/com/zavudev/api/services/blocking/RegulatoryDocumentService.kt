// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentDeleteParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListPage
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentRetrieveParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentRetrieveResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentUploadUrlParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentUploadUrlResponse
import java.util.function.Consumer

interface RegulatoryDocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegulatoryDocumentService

    /**
     * Create a regulatory document record after uploading the file. Use the upload-url endpoint
     * first to get an upload URL.
     */
    fun create(params: RegulatoryDocumentCreateParams): RegulatoryDocumentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RegulatoryDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegulatoryDocumentCreateResponse

    /** Get a specific regulatory document. */
    fun retrieve(documentId: String): RegulatoryDocumentRetrieveResponse =
        retrieve(documentId, RegulatoryDocumentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        params: RegulatoryDocumentRetrieveParams = RegulatoryDocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegulatoryDocumentRetrieveResponse =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        params: RegulatoryDocumentRetrieveParams = RegulatoryDocumentRetrieveParams.none(),
    ): RegulatoryDocumentRetrieveResponse = retrieve(documentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RegulatoryDocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegulatoryDocumentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RegulatoryDocumentRetrieveParams): RegulatoryDocumentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        requestOptions: RequestOptions,
    ): RegulatoryDocumentRetrieveResponse =
        retrieve(documentId, RegulatoryDocumentRetrieveParams.none(), requestOptions)

    /** List regulatory documents for this project. */
    fun list(): RegulatoryDocumentListPage = list(RegulatoryDocumentListParams.none())

    /** @see list */
    fun list(
        params: RegulatoryDocumentListParams = RegulatoryDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegulatoryDocumentListPage

    /** @see list */
    fun list(
        params: RegulatoryDocumentListParams = RegulatoryDocumentListParams.none()
    ): RegulatoryDocumentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RegulatoryDocumentListPage =
        list(RegulatoryDocumentListParams.none(), requestOptions)

    /** Delete a regulatory document. Cannot delete verified documents. */
    fun delete(documentId: String) = delete(documentId, RegulatoryDocumentDeleteParams.none())

    /** @see delete */
    fun delete(
        documentId: String,
        params: RegulatoryDocumentDeleteParams = RegulatoryDocumentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        documentId: String,
        params: RegulatoryDocumentDeleteParams = RegulatoryDocumentDeleteParams.none(),
    ) = delete(documentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RegulatoryDocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: RegulatoryDocumentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(documentId: String, requestOptions: RequestOptions) =
        delete(documentId, RegulatoryDocumentDeleteParams.none(), requestOptions)

    /**
     * Get a presigned URL to upload a document file. After uploading, use the storageId to create
     * the document record.
     */
    fun uploadUrl(): RegulatoryDocumentUploadUrlResponse =
        uploadUrl(RegulatoryDocumentUploadUrlParams.none())

    /** @see uploadUrl */
    fun uploadUrl(
        params: RegulatoryDocumentUploadUrlParams = RegulatoryDocumentUploadUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegulatoryDocumentUploadUrlResponse

    /** @see uploadUrl */
    fun uploadUrl(
        params: RegulatoryDocumentUploadUrlParams = RegulatoryDocumentUploadUrlParams.none()
    ): RegulatoryDocumentUploadUrlResponse = uploadUrl(params, RequestOptions.none())

    /** @see uploadUrl */
    fun uploadUrl(requestOptions: RequestOptions): RegulatoryDocumentUploadUrlResponse =
        uploadUrl(RegulatoryDocumentUploadUrlParams.none(), requestOptions)

    /**
     * A view of [RegulatoryDocumentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegulatoryDocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/documents`, but is otherwise the same as
         * [RegulatoryDocumentService.create].
         */
        @MustBeClosed
        fun create(
            params: RegulatoryDocumentCreateParams
        ): HttpResponseFor<RegulatoryDocumentCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RegulatoryDocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegulatoryDocumentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/documents/{documentId}`, but is otherwise the
         * same as [RegulatoryDocumentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(documentId: String): HttpResponseFor<RegulatoryDocumentRetrieveResponse> =
            retrieve(documentId, RegulatoryDocumentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            params: RegulatoryDocumentRetrieveParams = RegulatoryDocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegulatoryDocumentRetrieveResponse> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            params: RegulatoryDocumentRetrieveParams = RegulatoryDocumentRetrieveParams.none(),
        ): HttpResponseFor<RegulatoryDocumentRetrieveResponse> =
            retrieve(documentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RegulatoryDocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegulatoryDocumentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RegulatoryDocumentRetrieveParams
        ): HttpResponseFor<RegulatoryDocumentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegulatoryDocumentRetrieveResponse> =
            retrieve(documentId, RegulatoryDocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/documents`, but is otherwise the same as
         * [RegulatoryDocumentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RegulatoryDocumentListPage> =
            list(RegulatoryDocumentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RegulatoryDocumentListParams = RegulatoryDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegulatoryDocumentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RegulatoryDocumentListParams = RegulatoryDocumentListParams.none()
        ): HttpResponseFor<RegulatoryDocumentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RegulatoryDocumentListPage> =
            list(RegulatoryDocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/documents/{documentId}`, but is otherwise the
         * same as [RegulatoryDocumentService.delete].
         */
        @MustBeClosed
        fun delete(documentId: String): HttpResponse =
            delete(documentId, RegulatoryDocumentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            documentId: String,
            params: RegulatoryDocumentDeleteParams = RegulatoryDocumentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            documentId: String,
            params: RegulatoryDocumentDeleteParams = RegulatoryDocumentDeleteParams.none(),
        ): HttpResponse = delete(documentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RegulatoryDocumentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RegulatoryDocumentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(documentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(documentId, RegulatoryDocumentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/documents/upload-url`, but is otherwise the
         * same as [RegulatoryDocumentService.uploadUrl].
         */
        @MustBeClosed
        fun uploadUrl(): HttpResponseFor<RegulatoryDocumentUploadUrlResponse> =
            uploadUrl(RegulatoryDocumentUploadUrlParams.none())

        /** @see uploadUrl */
        @MustBeClosed
        fun uploadUrl(
            params: RegulatoryDocumentUploadUrlParams = RegulatoryDocumentUploadUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegulatoryDocumentUploadUrlResponse>

        /** @see uploadUrl */
        @MustBeClosed
        fun uploadUrl(
            params: RegulatoryDocumentUploadUrlParams = RegulatoryDocumentUploadUrlParams.none()
        ): HttpResponseFor<RegulatoryDocumentUploadUrlResponse> =
            uploadUrl(params, RequestOptions.none())

        /** @see uploadUrl */
        @MustBeClosed
        fun uploadUrl(
            requestOptions: RequestOptions
        ): HttpResponseFor<RegulatoryDocumentUploadUrlResponse> =
            uploadUrl(RegulatoryDocumentUploadUrlParams.none(), requestOptions)
    }
}
