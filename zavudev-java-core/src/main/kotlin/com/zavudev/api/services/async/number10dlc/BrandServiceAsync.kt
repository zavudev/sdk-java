// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.number10dlc

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.number10dlc.brands.BrandCreateParams
import com.zavudev.api.models.number10dlc.brands.BrandCreateResponse
import com.zavudev.api.models.number10dlc.brands.BrandDeleteParams
import com.zavudev.api.models.number10dlc.brands.BrandListPageAsync
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync

    /**
     * Create a 10DLC brand registration. The brand starts in draft status. Submit it for review
     * using the submit endpoint.
     */
    fun create(params: BrandCreateParams): CompletableFuture<BrandCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandCreateResponse>

    /** Get 10DLC brand */
    fun retrieve(brandId: String): CompletableFuture<BrandRetrieveResponse> =
        retrieve(brandId, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): CompletableFuture<BrandRetrieveResponse> = retrieve(brandId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveResponse> =
        retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

    /** Update a 10DLC brand in draft status. Cannot update after submission. */
    fun update(brandId: String): CompletableFuture<BrandUpdateResponse> =
        update(brandId, BrandUpdateParams.none())

    /** @see update */
    fun update(
        brandId: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandUpdateResponse> =
        update(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see update */
    fun update(
        brandId: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
    ): CompletableFuture<BrandUpdateResponse> = update(brandId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandUpdateResponse>

    /** @see update */
    fun update(params: BrandUpdateParams): CompletableFuture<BrandUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        brandId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandUpdateResponse> =
        update(brandId, BrandUpdateParams.none(), requestOptions)

    /** List 10DLC brand registrations for this project. */
    fun list(): CompletableFuture<BrandListPageAsync> = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandListPageAsync>

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none()
    ): CompletableFuture<BrandListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BrandListPageAsync> =
        list(BrandListParams.none(), requestOptions)

    /** Delete 10DLC brand */
    fun delete(brandId: String): CompletableFuture<Void?> =
        delete(brandId, BrandDeleteParams.none())

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(brandId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BrandDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BrandDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(brandId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(brandId, BrandDeleteParams.none(), requestOptions)

    /** List available use cases for 10DLC campaign registration. */
    fun listUseCases(): CompletableFuture<BrandListUseCasesResponse> =
        listUseCases(BrandListUseCasesParams.none())

    /** @see listUseCases */
    fun listUseCases(
        params: BrandListUseCasesParams = BrandListUseCasesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandListUseCasesResponse>

    /** @see listUseCases */
    fun listUseCases(
        params: BrandListUseCasesParams = BrandListUseCasesParams.none()
    ): CompletableFuture<BrandListUseCasesResponse> = listUseCases(params, RequestOptions.none())

    /** @see listUseCases */
    fun listUseCases(requestOptions: RequestOptions): CompletableFuture<BrandListUseCasesResponse> =
        listUseCases(BrandListUseCasesParams.none(), requestOptions)

    /**
     * Submit a draft brand to The Campaign Registry (TCR) for vetting. The brand must be in draft
     * status. TCR's one-time $4 brand registration fee is charged from your balance at submission
     * (passed through at cost) and refunded if the carrier rejects the registration. A team that
     * already paid this fee through the compliance flow is not charged again. Campaign registration
     * is billed separately when a campaign is submitted.
     */
    fun submit(brandId: String): CompletableFuture<BrandSubmitResponse> =
        submit(brandId, BrandSubmitParams.none())

    /** @see submit */
    fun submit(
        brandId: String,
        params: BrandSubmitParams = BrandSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandSubmitResponse> =
        submit(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see submit */
    fun submit(
        brandId: String,
        params: BrandSubmitParams = BrandSubmitParams.none(),
    ): CompletableFuture<BrandSubmitResponse> = submit(brandId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: BrandSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandSubmitResponse>

    /** @see submit */
    fun submit(params: BrandSubmitParams): CompletableFuture<BrandSubmitResponse> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        brandId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandSubmitResponse> =
        submit(brandId, BrandSubmitParams.none(), requestOptions)

    /**
     * Sync the brand status with the registration provider. Use this to check for approval updates
     * after submission.
     */
    fun syncStatus(brandId: String): CompletableFuture<BrandSyncStatusResponse> =
        syncStatus(brandId, BrandSyncStatusParams.none())

    /** @see syncStatus */
    fun syncStatus(
        brandId: String,
        params: BrandSyncStatusParams = BrandSyncStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandSyncStatusResponse> =
        syncStatus(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see syncStatus */
    fun syncStatus(
        brandId: String,
        params: BrandSyncStatusParams = BrandSyncStatusParams.none(),
    ): CompletableFuture<BrandSyncStatusResponse> =
        syncStatus(brandId, params, RequestOptions.none())

    /** @see syncStatus */
    fun syncStatus(
        params: BrandSyncStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandSyncStatusResponse>

    /** @see syncStatus */
    fun syncStatus(params: BrandSyncStatusParams): CompletableFuture<BrandSyncStatusResponse> =
        syncStatus(params, RequestOptions.none())

    /** @see syncStatus */
    fun syncStatus(
        brandId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandSyncStatusResponse> =
        syncStatus(brandId, BrandSyncStatusParams.none(), requestOptions)

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/brands`, but is otherwise the same as
         * [BrandServiceAsync.create].
         */
        fun create(
            params: BrandCreateParams
        ): CompletableFuture<HttpResponseFor<BrandCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/brands/{brandId}`, but is otherwise the
         * same as [BrandServiceAsync.retrieve].
         */
        fun retrieve(brandId: String): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(brandId, BrandRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(brandId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/10dlc/brands/{brandId}`, but is otherwise the
         * same as [BrandServiceAsync.update].
         */
        fun update(brandId: String): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(brandId, BrandUpdateParams.none())

        /** @see update */
        fun update(
            brandId: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see update */
        fun update(
            brandId: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(brandId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>>

        /** @see update */
        fun update(
            params: BrandUpdateParams
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(brandId, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/brands`, but is otherwise the same as
         * [BrandServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BrandListPageAsync>> =
            list(BrandListParams.none())

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandListPageAsync>>

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): CompletableFuture<HttpResponseFor<BrandListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrandListPageAsync>> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/10dlc/brands/{brandId}`, but is otherwise the
         * same as [BrandServiceAsync.delete].
         */
        fun delete(brandId: String): CompletableFuture<HttpResponse> =
            delete(brandId, BrandDeleteParams.none())

        /** @see delete */
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see delete */
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(brandId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BrandDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BrandDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(brandId, BrandDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/brands/use-cases`, but is otherwise the
         * same as [BrandServiceAsync.listUseCases].
         */
        fun listUseCases(): CompletableFuture<HttpResponseFor<BrandListUseCasesResponse>> =
            listUseCases(BrandListUseCasesParams.none())

        /** @see listUseCases */
        fun listUseCases(
            params: BrandListUseCasesParams = BrandListUseCasesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandListUseCasesResponse>>

        /** @see listUseCases */
        fun listUseCases(
            params: BrandListUseCasesParams = BrandListUseCasesParams.none()
        ): CompletableFuture<HttpResponseFor<BrandListUseCasesResponse>> =
            listUseCases(params, RequestOptions.none())

        /** @see listUseCases */
        fun listUseCases(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrandListUseCasesResponse>> =
            listUseCases(BrandListUseCasesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/brands/{brandId}/submit`, but is
         * otherwise the same as [BrandServiceAsync.submit].
         */
        fun submit(brandId: String): CompletableFuture<HttpResponseFor<BrandSubmitResponse>> =
            submit(brandId, BrandSubmitParams.none())

        /** @see submit */
        fun submit(
            brandId: String,
            params: BrandSubmitParams = BrandSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandSubmitResponse>> =
            submit(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see submit */
        fun submit(
            brandId: String,
            params: BrandSubmitParams = BrandSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandSubmitResponse>> =
            submit(brandId, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: BrandSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandSubmitResponse>>

        /** @see submit */
        fun submit(
            params: BrandSubmitParams
        ): CompletableFuture<HttpResponseFor<BrandSubmitResponse>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandSubmitResponse>> =
            submit(brandId, BrandSubmitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/brands/{brandId}/sync`, but is otherwise
         * the same as [BrandServiceAsync.syncStatus].
         */
        fun syncStatus(
            brandId: String
        ): CompletableFuture<HttpResponseFor<BrandSyncStatusResponse>> =
            syncStatus(brandId, BrandSyncStatusParams.none())

        /** @see syncStatus */
        fun syncStatus(
            brandId: String,
            params: BrandSyncStatusParams = BrandSyncStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandSyncStatusResponse>> =
            syncStatus(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see syncStatus */
        fun syncStatus(
            brandId: String,
            params: BrandSyncStatusParams = BrandSyncStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandSyncStatusResponse>> =
            syncStatus(brandId, params, RequestOptions.none())

        /** @see syncStatus */
        fun syncStatus(
            params: BrandSyncStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandSyncStatusResponse>>

        /** @see syncStatus */
        fun syncStatus(
            params: BrandSyncStatusParams
        ): CompletableFuture<HttpResponseFor<BrandSyncStatusResponse>> =
            syncStatus(params, RequestOptions.none())

        /** @see syncStatus */
        fun syncStatus(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandSyncStatusResponse>> =
            syncStatus(brandId, BrandSyncStatusParams.none(), requestOptions)
    }
}
