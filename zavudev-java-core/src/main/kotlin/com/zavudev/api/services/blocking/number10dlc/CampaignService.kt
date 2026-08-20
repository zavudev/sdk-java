// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.number10dlc

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.number10dlc.campaigns.CampaignCreateParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignCreateResponse
import com.zavudev.api.models.number10dlc.campaigns.CampaignDeleteParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignListPage
import com.zavudev.api.models.number10dlc.campaigns.CampaignListParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignRetrieveParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignRetrieveResponse
import com.zavudev.api.models.number10dlc.campaigns.CampaignSubmitParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignSubmitResponse
import com.zavudev.api.models.number10dlc.campaigns.CampaignSyncStatusParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignSyncStatusResponse
import com.zavudev.api.models.number10dlc.campaigns.CampaignUpdateParams
import com.zavudev.api.models.number10dlc.campaigns.CampaignUpdateResponse
import com.zavudev.api.services.blocking.number10dlc.campaigns.PhoneNumberService
import java.util.function.Consumer

interface CampaignService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService

    fun phoneNumbers(): PhoneNumberService

    /**
     * Create a 10DLC campaign under an existing brand. The campaign starts in draft status. Submit
     * it for carrier review using the submit endpoint.
     */
    fun create(params: CampaignCreateParams): CampaignCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CampaignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignCreateResponse

    /** Get 10DLC campaign */
    fun retrieve(campaignId: String): CampaignRetrieveResponse =
        retrieve(campaignId, CampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveResponse =
        retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
    ): CampaignRetrieveResponse = retrieve(campaignId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CampaignRetrieveParams): CampaignRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(campaignId: String, requestOptions: RequestOptions): CampaignRetrieveResponse =
        retrieve(campaignId, CampaignRetrieveParams.none(), requestOptions)

    /** Update a 10DLC campaign in draft status. Cannot update after submission. */
    fun update(campaignId: String): CampaignUpdateResponse =
        update(campaignId, CampaignUpdateParams.none())

    /** @see update */
    fun update(
        campaignId: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignUpdateResponse =
        update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see update */
    fun update(
        campaignId: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
    ): CampaignUpdateResponse = update(campaignId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignUpdateResponse

    /** @see update */
    fun update(params: CampaignUpdateParams): CampaignUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(campaignId: String, requestOptions: RequestOptions): CampaignUpdateResponse =
        update(campaignId, CampaignUpdateParams.none(), requestOptions)

    /** List 10DLC campaign registrations for this project. */
    fun list(): CampaignListPage = list(CampaignListParams.none())

    /** @see list */
    fun list(
        params: CampaignListParams = CampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignListPage

    /** @see list */
    fun list(params: CampaignListParams = CampaignListParams.none()): CampaignListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CampaignListPage =
        list(CampaignListParams.none(), requestOptions)

    /** Delete 10DLC campaign */
    fun delete(campaignId: String) = delete(campaignId, CampaignDeleteParams.none())

    /** @see delete */
    fun delete(
        campaignId: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see delete */
    fun delete(campaignId: String, params: CampaignDeleteParams = CampaignDeleteParams.none()) =
        delete(campaignId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CampaignDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CampaignDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(campaignId: String, requestOptions: RequestOptions) =
        delete(campaignId, CampaignDeleteParams.none(), requestOptions)

    /**
     * The team must have an approved Business Verification (KYB): submitting without one returns
     * `403` with code `kyb_required`. Submit a draft campaign for carrier review. The campaign must
     * be in draft status and its brand must be verified. TCR's one-time registration fee is charged
     * from your balance at submission ($15 for standard use cases, $2 for LOW_VOLUME), passed
     * through at cost and refunded if the carrier rejects it. Once approved, the campaign's monthly
     * TCR fee ($10 standard, $2 LOW_VOLUME) is charged from your balance while the campaign is
     * active — see registrationCostCents and monthlyFeeCents on the campaign object.
     */
    fun submit(campaignId: String): CampaignSubmitResponse =
        submit(campaignId, CampaignSubmitParams.none())

    /** @see submit */
    fun submit(
        campaignId: String,
        params: CampaignSubmitParams = CampaignSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignSubmitResponse =
        submit(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see submit */
    fun submit(
        campaignId: String,
        params: CampaignSubmitParams = CampaignSubmitParams.none(),
    ): CampaignSubmitResponse = submit(campaignId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: CampaignSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignSubmitResponse

    /** @see submit */
    fun submit(params: CampaignSubmitParams): CampaignSubmitResponse =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(campaignId: String, requestOptions: RequestOptions): CampaignSubmitResponse =
        submit(campaignId, CampaignSubmitParams.none(), requestOptions)

    /**
     * Sync the campaign status with the registration provider. Use this to check for approval
     * updates after submission.
     */
    fun syncStatus(campaignId: String): CampaignSyncStatusResponse =
        syncStatus(campaignId, CampaignSyncStatusParams.none())

    /** @see syncStatus */
    fun syncStatus(
        campaignId: String,
        params: CampaignSyncStatusParams = CampaignSyncStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignSyncStatusResponse =
        syncStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see syncStatus */
    fun syncStatus(
        campaignId: String,
        params: CampaignSyncStatusParams = CampaignSyncStatusParams.none(),
    ): CampaignSyncStatusResponse = syncStatus(campaignId, params, RequestOptions.none())

    /** @see syncStatus */
    fun syncStatus(
        params: CampaignSyncStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignSyncStatusResponse

    /** @see syncStatus */
    fun syncStatus(params: CampaignSyncStatusParams): CampaignSyncStatusResponse =
        syncStatus(params, RequestOptions.none())

    /** @see syncStatus */
    fun syncStatus(campaignId: String, requestOptions: RequestOptions): CampaignSyncStatusResponse =
        syncStatus(campaignId, CampaignSyncStatusParams.none(), requestOptions)

    /** A view of [CampaignService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService.WithRawResponse

        fun phoneNumbers(): PhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/campaigns`, but is otherwise the same as
         * [CampaignService.create].
         */
        @MustBeClosed
        fun create(params: CampaignCreateParams): HttpResponseFor<CampaignCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/campaigns/{campaignId}`, but is otherwise
         * the same as [CampaignService.retrieve].
         */
        @MustBeClosed
        fun retrieve(campaignId: String): HttpResponseFor<CampaignRetrieveResponse> =
            retrieve(campaignId, CampaignRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveResponse> =
            retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        ): HttpResponseFor<CampaignRetrieveResponse> =
            retrieve(campaignId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CampaignRetrieveParams): HttpResponseFor<CampaignRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveResponse> =
            retrieve(campaignId, CampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/10dlc/campaigns/{campaignId}`, but is
         * otherwise the same as [CampaignService.update].
         */
        @MustBeClosed
        fun update(campaignId: String): HttpResponseFor<CampaignUpdateResponse> =
            update(campaignId, CampaignUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignUpdateResponse> =
            update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
        ): HttpResponseFor<CampaignUpdateResponse> =
            update(campaignId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: CampaignUpdateParams): HttpResponseFor<CampaignUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignUpdateResponse> =
            update(campaignId, CampaignUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/campaigns`, but is otherwise the same as
         * [CampaignService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CampaignListPage> = list(CampaignListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CampaignListParams = CampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CampaignListParams = CampaignListParams.none()
        ): HttpResponseFor<CampaignListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CampaignListPage> =
            list(CampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/10dlc/campaigns/{campaignId}`, but is
         * otherwise the same as [CampaignService.delete].
         */
        @MustBeClosed
        fun delete(campaignId: String): HttpResponse =
            delete(campaignId, CampaignDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            campaignId: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            campaignId: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
        ): HttpResponse = delete(campaignId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CampaignDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(campaignId: String, requestOptions: RequestOptions): HttpResponse =
            delete(campaignId, CampaignDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/campaigns/{campaignId}/submit`, but is
         * otherwise the same as [CampaignService.submit].
         */
        @MustBeClosed
        fun submit(campaignId: String): HttpResponseFor<CampaignSubmitResponse> =
            submit(campaignId, CampaignSubmitParams.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            campaignId: String,
            params: CampaignSubmitParams = CampaignSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignSubmitResponse> =
            submit(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(
            campaignId: String,
            params: CampaignSubmitParams = CampaignSubmitParams.none(),
        ): HttpResponseFor<CampaignSubmitResponse> =
            submit(campaignId, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: CampaignSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignSubmitResponse>

        /** @see submit */
        @MustBeClosed
        fun submit(params: CampaignSubmitParams): HttpResponseFor<CampaignSubmitResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignSubmitResponse> =
            submit(campaignId, CampaignSubmitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/campaigns/{campaignId}/sync`, but is
         * otherwise the same as [CampaignService.syncStatus].
         */
        @MustBeClosed
        fun syncStatus(campaignId: String): HttpResponseFor<CampaignSyncStatusResponse> =
            syncStatus(campaignId, CampaignSyncStatusParams.none())

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            campaignId: String,
            params: CampaignSyncStatusParams = CampaignSyncStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignSyncStatusResponse> =
            syncStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            campaignId: String,
            params: CampaignSyncStatusParams = CampaignSyncStatusParams.none(),
        ): HttpResponseFor<CampaignSyncStatusResponse> =
            syncStatus(campaignId, params, RequestOptions.none())

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            params: CampaignSyncStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignSyncStatusResponse>

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            params: CampaignSyncStatusParams
        ): HttpResponseFor<CampaignSyncStatusResponse> = syncStatus(params, RequestOptions.none())

        /** @see syncStatus */
        @MustBeClosed
        fun syncStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignSyncStatusResponse> =
            syncStatus(campaignId, CampaignSyncStatusParams.none(), requestOptions)
    }
}
