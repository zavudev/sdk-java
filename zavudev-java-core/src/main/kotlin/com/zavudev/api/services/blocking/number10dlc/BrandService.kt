// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.number10dlc

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.number10dlc.brands.BrandCreateParams
import com.zavudev.api.models.number10dlc.brands.BrandCreateResponse
import com.zavudev.api.models.number10dlc.brands.BrandDeleteParams
import com.zavudev.api.models.number10dlc.brands.BrandListPage
import com.zavudev.api.models.number10dlc.brands.BrandListParams
import com.zavudev.api.models.number10dlc.brands.BrandListUseCasesParams
import com.zavudev.api.models.number10dlc.brands.BrandListUseCasesResponse
import com.zavudev.api.models.number10dlc.brands.BrandRetrieveParams
import com.zavudev.api.models.number10dlc.brands.BrandRetrieveResponse
import com.zavudev.api.models.number10dlc.brands.BrandSubmitParams
import com.zavudev.api.models.number10dlc.brands.BrandSubmitResponse
import com.zavudev.api.models.number10dlc.brands.BrandSyncStatusParams
import com.zavudev.api.models.number10dlc.brands.BrandSyncStatusResponse
import com.zavudev.api.models.number10dlc.brands.BrandUpdateParams
import com.zavudev.api.models.number10dlc.brands.BrandUpdateResponse
import java.util.function.Consumer

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService

    /**
     * Create a 10DLC brand registration. The brand starts in draft status. Submit it for review
     * using the submit endpoint.
     */
    fun create(params: BrandCreateParams): BrandCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandCreateResponse

    /** Get 10DLC brand */
    fun retrieve(brandId: String): BrandRetrieveResponse =
        retrieve(brandId, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveResponse = retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): BrandRetrieveResponse = retrieve(brandId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): BrandRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(brandId: String, requestOptions: RequestOptions): BrandRetrieveResponse =
        retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

    /** Update a 10DLC brand in draft status. Cannot update after submission. */
    fun update(brandId: String): BrandUpdateResponse = update(brandId, BrandUpdateParams.none())

    /** @see update */
    fun update(
        brandId: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateResponse = update(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see update */
    fun update(
        brandId: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
    ): BrandUpdateResponse = update(brandId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateResponse

    /** @see update */
    fun update(params: BrandUpdateParams): BrandUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(brandId: String, requestOptions: RequestOptions): BrandUpdateResponse =
        update(brandId, BrandUpdateParams.none(), requestOptions)

    /** List 10DLC brand registrations for this project. */
    fun list(): BrandListPage = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandListPage

    /** @see list */
    fun list(params: BrandListParams = BrandListParams.none()): BrandListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BrandListPage =
        list(BrandListParams.none(), requestOptions)

    /** Delete 10DLC brand */
    fun delete(brandId: String) = delete(brandId, BrandDeleteParams.none())

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see delete */
    fun delete(brandId: String, params: BrandDeleteParams = BrandDeleteParams.none()) =
        delete(brandId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BrandDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: BrandDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(brandId: String, requestOptions: RequestOptions) =
        delete(brandId, BrandDeleteParams.none(), requestOptions)

    /** List available use cases for 10DLC campaign registration. */
    fun listUseCases(): BrandListUseCasesResponse = listUseCases(BrandListUseCasesParams.none())

    /** @see listUseCases */
    fun listUseCases(
        params: BrandListUseCasesParams = BrandListUseCasesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandListUseCasesResponse

    /** @see listUseCases */
    fun listUseCases(
        params: BrandListUseCasesParams = BrandListUseCasesParams.none()
    ): BrandListUseCasesResponse = listUseCases(params, RequestOptions.none())

    /** @see listUseCases */
    fun listUseCases(requestOptions: RequestOptions): BrandListUseCasesResponse =
        listUseCases(BrandListUseCasesParams.none(), requestOptions)

    /**
     * Submit a draft brand to The Campaign Registry (TCR) for vetting. The brand must be in draft
     * status. TCR's one-time $4 brand registration fee is charged from your balance at submission
     * (passed through at cost) and refunded if the carrier rejects the registration. A team that
     * already paid this fee through the compliance flow is not charged again. Campaign registration
     * is billed separately when a campaign is submitted.
     */
    fun submit(brandId: String): BrandSubmitResponse = submit(brandId, BrandSubmitParams.none())

    /** @see submit */
    fun submit(
        brandId: String,
        params: BrandSubmitParams = BrandSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandSubmitResponse = submit(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see submit */
    fun submit(
        brandId: String,
        params: BrandSubmitParams = BrandSubmitParams.none(),
    ): BrandSubmitResponse = submit(brandId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: BrandSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandSubmitResponse

    /** @see submit */
    fun submit(params: BrandSubmitParams): BrandSubmitResponse =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(brandId: String, requestOptions: RequestOptions): BrandSubmitResponse =
        submit(brandId, BrandSubmitParams.none(), requestOptions)

    /**
     * Sync the brand status with the registration provider. Use this to check for approval updates
     * after submission.
     */
    fun syncStatus(brandId: String): BrandSyncStatusResponse =
        syncStatus(brandId, BrandSyncStatusParams.none())

    /** @see syncStatus */
    fun syncStatus(
        brandId: String,
        params: BrandSyncStatusParams = BrandSyncStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandSyncStatusResponse =
        syncStatus(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see syncStatus */
    fun syncStatus(
        brandId: String,
        params: BrandSyncStatusParams = BrandSyncStatusParams.none(),
    ): BrandSyncStatusResponse = syncStatus(brandId, params, RequestOptions.none())

    /** @see syncStatus */
    fun syncStatus(
        params: BrandSyncStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandSyncStatusResponse

    /** @see syncStatus */
    fun syncStatus(params: BrandSyncStatusParams): BrandSyncStatusResponse =
        syncStatus(params, RequestOptions.none())

    /** @see syncStatus */
    fun syncStatus(brandId: String, requestOptions: RequestOptions): BrandSyncStatusResponse =
        syncStatus(brandId, BrandSyncStatusParams.none(), requestOptions)

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/brands`, but is otherwise the same as
         * [BrandService.create].
         */
        @MustBeClosed
        fun create(params: BrandCreateParams): HttpResponseFor<BrandCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/brands/{brandId}`, but is otherwise the
         * same as [BrandService.retrieve].
         */
        @MustBeClosed
        fun retrieve(brandId: String): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(brandId, BrandRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): HttpResponseFor<BrandRetrieveResponse> = retrieve(brandId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BrandRetrieveParams): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/10dlc/brands/{brandId}`, but is otherwise the
         * same as [BrandService.update].
         */
        @MustBeClosed
        fun update(brandId: String): HttpResponseFor<BrandUpdateResponse> =
            update(brandId, BrandUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            brandId: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateResponse> =
            update(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            brandId: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
        ): HttpResponseFor<BrandUpdateResponse> = update(brandId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: BrandUpdateParams): HttpResponseFor<BrandUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandUpdateResponse> =
            update(brandId, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/brands`, but is otherwise the same as
         * [BrandService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BrandListPage> = list(BrandListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: BrandListParams = BrandListParams.none()): HttpResponseFor<BrandListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BrandListPage> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/10dlc/brands/{brandId}`, but is otherwise the
         * same as [BrandService.delete].
         */
        @MustBeClosed
        fun delete(brandId: String): HttpResponse = delete(brandId, BrandDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
        ): HttpResponse = delete(brandId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BrandDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BrandDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(brandId: String, requestOptions: RequestOptions): HttpResponse =
            delete(brandId, BrandDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/brands/use-cases`, but is otherwise the
         * same as [BrandService.listUseCases].
         */
        @MustBeClosed
        fun listUseCases(): HttpResponseFor<BrandListUseCasesResponse> =
            listUseCases(BrandListUseCasesParams.none())

        /** @see listUseCases */
        @MustBeClosed
        fun listUseCases(
            params: BrandListUseCasesParams = BrandListUseCasesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandListUseCasesResponse>

        /** @see listUseCases */
        @MustBeClosed
        fun listUseCases(
            params: BrandListUseCasesParams = BrandListUseCasesParams.none()
        ): HttpResponseFor<BrandListUseCasesResponse> = listUseCases(params, RequestOptions.none())

        /** @see listUseCases */
        @MustBeClosed
        fun listUseCases(
            requestOptions: RequestOptions
        ): HttpResponseFor<BrandListUseCasesResponse> =
            listUseCases(BrandListUseCasesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/brands/{brandId}/submit`, but is
         * otherwise the same as [BrandService.submit].
         */
        @MustBeClosed
        fun submit(brandId: String): HttpResponseFor<BrandSubmitResponse> =
            submit(brandId, BrandSubmitParams.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            brandId: String,
            params: BrandSubmitParams = BrandSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandSubmitResponse> =
            submit(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(
            brandId: String,
            params: BrandSubmitParams = BrandSubmitParams.none(),
        ): HttpResponseFor<BrandSubmitResponse> = submit(brandId, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: BrandSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandSubmitResponse>

        /** @see submit */
        @MustBeClosed
        fun submit(params: BrandSubmitParams): HttpResponseFor<BrandSubmitResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandSubmitResponse> =
            submit(brandId, BrandSubmitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/brands/{brandId}/sync`, but is otherwise
         * the same as [BrandService.syncStatus].
         */
        @MustBeClosed
        fun syncStatus(brandId: String): HttpResponseFor<BrandSyncStatusResponse> =
            syncStatus(brandId, BrandSyncStatusParams.none())

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            brandId: String,
            params: BrandSyncStatusParams = BrandSyncStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandSyncStatusResponse> =
            syncStatus(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            brandId: String,
            params: BrandSyncStatusParams = BrandSyncStatusParams.none(),
        ): HttpResponseFor<BrandSyncStatusResponse> =
            syncStatus(brandId, params, RequestOptions.none())

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            params: BrandSyncStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandSyncStatusResponse>

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(params: BrandSyncStatusParams): HttpResponseFor<BrandSyncStatusResponse> =
            syncStatus(params, RequestOptions.none())

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandSyncStatusResponse> =
            syncStatus(brandId, BrandSyncStatusParams.none(), requestOptions)
    }
}
