// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.number10dlc

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.number10dlc.campaigns.CampaignCreateParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignCreateResponse
import com.zavudev.api.models.number10dlc.campaigns.CampaignDeleteParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignListPageAsync
import com.zavudev.api.models.number10dlc.campaigns.CampaignListParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignRetrieveParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignRetrieveResponse
import com.zavudev.api.models.number10dlc.campaigns.CampaignSubmitParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignSubmitResponse
import com.zavudev.api.models.number10dlc.campaigns.CampaignSyncStatusParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignSyncStatusResponse
import com.zavudev.api.models.number10dlc.campaigns.CampaignUpdateParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignUpdateResponse
import com.zavudev.api.services.async.number10dlc.campaigns.PhoneNumberServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CampaignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync

    fun phoneNumbers(): PhoneNumberServiceAsync

    /**
     * Create a 10DLC campaign under an existing brand. The campaign starts in draft status. Submit
     * it for carrier review using the submit endpoint.
     */
    fun create(params: CampaignCreateParams): CompletableFuture<CampaignCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CampaignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignCreateResponse>

    /** Get 10DLC campaign */
    fun retrieve(campaignId: String): CompletableFuture<CampaignRetrieveResponse> =
        retrieve(campaignId, CampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveResponse> =
        retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
    ): CompletableFuture<CampaignRetrieveResponse> =
        retrieve(campaignId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: CampaignRetrieveParams): CompletableFuture<CampaignRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveResponse> =
        retrieve(campaignId, CampaignRetrieveParams.none(), requestOptions)

    /** Update a 10DLC campaign in draft status. Cannot update after submission. */
    fun update(campaignId: String): CompletableFuture<CampaignUpdateResponse> =
        update(campaignId, CampaignUpdateParams.none())

    /** @see update */
    fun update(
        campaignId: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignUpdateResponse> =
        update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see update */
    fun update(
        campaignId: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
    ): CompletableFuture<CampaignUpdateResponse> = update(campaignId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignUpdateResponse>

    /** @see update */
    fun update(params: CampaignUpdateParams): CompletableFuture<CampaignUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignUpdateResponse> =
        update(campaignId, CampaignUpdateParams.none(), requestOptions)

    /** List 10DLC campaign registrations for this project. */
    fun list(): CompletableFuture<CampaignListPageAsync> = list(CampaignListParams.none())

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignListPageAsync>

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none()
    ): CompletableFuture<CampaignListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CampaignListPageAsync> =
        list(CampaignListParams.none(), requestOptions)

    /** Delete 10DLC campaign */
    fun delete(campaignId: String): CompletableFuture<Void?> =
        delete(campaignId, CampaignDeleteParams.none())

    /** @see delete */
    fun delete(
        campaignId: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see delete */
    fun delete(
        campaignId: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(campaignId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CampaignDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CampaignDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(campaignId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(campaignId, CampaignDeleteParams.none(), requestOptions)

    /**
     * Submit a draft campaign for carrier review. The campaign must be in draft status and its
     * brand must be verified. TCR's one-time registration fee is charged from your balance at
     * submission ($15 for standard use cases, $2 for LOW_VOLUME), passed through at cost and
     * refunded if the carrier rejects it. Once approved, the campaign's monthly TCR fee ($10
     * standard, $2 LOW_VOLUME) is charged from your balance while the campaign is active — see
     * registrationCostCents and monthlyFeeCents on the campaign object.
     */
    fun submit(campaignId: String): CompletableFuture<CampaignSubmitResponse> =
        submit(campaignId, CampaignSubmitParams.none())

    /** @see submit */
    fun submit(
        campaignId: String,
        params: CampaignSubmitParams = CampaignSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignSubmitResponse> =
        submit(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see submit */
    fun submit(
        campaignId: String,
        params: CampaignSubmitParams = CampaignSubmitParams.none(),
    ): CompletableFuture<CampaignSubmitResponse> = submit(campaignId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: CampaignSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignSubmitResponse>

    /** @see submit */
    fun submit(params: CampaignSubmitParams): CompletableFuture<CampaignSubmitResponse> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignSubmitResponse> =
        submit(campaignId, CampaignSubmitParams.none(), requestOptions)

    /**
     * Sync the campaign status with the registration provider. Use this to check for approval
     * updates after submission.
     */
    fun syncStatus(campaignId: String): CompletableFuture<CampaignSyncStatusResponse> =
        syncStatus(campaignId, CampaignSyncStatusParams.none())

    /** @see syncStatus */
    fun syncStatus(
        campaignId: String,
        params: CampaignSyncStatusParams = CampaignSyncStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignSyncStatusResponse> =
        syncStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see syncStatus */
    fun syncStatus(
        campaignId: String,
        params: CampaignSyncStatusParams = CampaignSyncStatusParams.none(),
    ): CompletableFuture<CampaignSyncStatusResponse> =
        syncStatus(campaignId, params, RequestOptions.none())

    /** @see syncStatus */
    fun syncStatus(
        params: CampaignSyncStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignSyncStatusResponse>

    /** @see syncStatus */
    fun syncStatus(
        params: CampaignSyncStatusParams
    ): CompletableFuture<CampaignSyncStatusResponse> = syncStatus(params, RequestOptions.none())

    /** @see syncStatus */
    fun syncStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignSyncStatusResponse> =
        syncStatus(campaignId, CampaignSyncStatusParams.none(), requestOptions)

    /**
     * A view of [CampaignServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse

        fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/campaigns`, but is otherwise the same as
         * [CampaignServiceAsync.create].
         */
        fun create(
            params: CampaignCreateParams
        ): CompletableFuture<HttpResponseFor<CampaignCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/campaigns/{campaignId}`, but is otherwise
         * the same as [CampaignServiceAsync.retrieve].
         */
        fun retrieve(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveResponse>> =
            retrieve(campaignId, CampaignRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveResponse>> =
            retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveResponse>> =
            retrieve(campaignId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CampaignRetrieveParams
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveResponse>> =
            retrieve(campaignId, CampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/10dlc/campaigns/{campaignId}`, but is
         * otherwise the same as [CampaignServiceAsync.update].
         */
        fun update(campaignId: String): CompletableFuture<HttpResponseFor<CampaignUpdateResponse>> =
            update(campaignId, CampaignUpdateParams.none())

        /** @see update */
        fun update(
            campaignId: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignUpdateResponse>> =
            update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see update */
        fun update(
            campaignId: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignUpdateResponse>> =
            update(campaignId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignUpdateResponse>>

        /** @see update */
        fun update(
            params: CampaignUpdateParams
        ): CompletableFuture<HttpResponseFor<CampaignUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignUpdateResponse>> =
            update(campaignId, CampaignUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/campaigns`, but is otherwise the same as
         * [CampaignServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CampaignListPageAsync>> =
            list(CampaignListParams.none())

        /** @see list */
        fun list(
            params: CampaignListParams = CampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>>

        /** @see list */
        fun list(
            params: CampaignListParams = CampaignListParams.none()
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>> =
            list(CampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/10dlc/campaigns/{campaignId}`, but is
         * otherwise the same as [CampaignServiceAsync.delete].
         */
        fun delete(campaignId: String): CompletableFuture<HttpResponse> =
            delete(campaignId, CampaignDeleteParams.none())

        /** @see delete */
        fun delete(
            campaignId: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see delete */
        fun delete(
            campaignId: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(campaignId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CampaignDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(campaignId, CampaignDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/campaigns/{campaignId}/submit`, but is
         * otherwise the same as [CampaignServiceAsync.submit].
         */
        fun submit(campaignId: String): CompletableFuture<HttpResponseFor<CampaignSubmitResponse>> =
            submit(campaignId, CampaignSubmitParams.none())

        /** @see submit */
        fun submit(
            campaignId: String,
            params: CampaignSubmitParams = CampaignSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignSubmitResponse>> =
            submit(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see submit */
        fun submit(
            campaignId: String,
            params: CampaignSubmitParams = CampaignSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignSubmitResponse>> =
            submit(campaignId, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: CampaignSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignSubmitResponse>>

        /** @see submit */
        fun submit(
            params: CampaignSubmitParams
        ): CompletableFuture<HttpResponseFor<CampaignSubmitResponse>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignSubmitResponse>> =
            submit(campaignId, CampaignSubmitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/campaigns/{campaignId}/sync`, but is
         * otherwise the same as [CampaignServiceAsync.syncStatus].
         */
        fun syncStatus(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignSyncStatusResponse>> =
            syncStatus(campaignId, CampaignSyncStatusParams.none())

        /** @see syncStatus */
        fun syncStatus(
            campaignId: String,
            params: CampaignSyncStatusParams = CampaignSyncStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignSyncStatusResponse>> =
            syncStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see syncStatus */
        fun syncStatus(
            campaignId: String,
            params: CampaignSyncStatusParams = CampaignSyncStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignSyncStatusResponse>> =
            syncStatus(campaignId, params, RequestOptions.none())

        /** @see syncStatus */
        fun syncStatus(
            params: CampaignSyncStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignSyncStatusResponse>>

        /** @see syncStatus */
        fun syncStatus(
            params: CampaignSyncStatusParams
        ): CompletableFuture<HttpResponseFor<CampaignSyncStatusResponse>> =
            syncStatus(params, RequestOptions.none())

        /** @see syncStatus */
        fun syncStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignSyncStatusResponse>> =
            syncStatus(campaignId, CampaignSyncStatusParams.none(), requestOptions)
    }
}
