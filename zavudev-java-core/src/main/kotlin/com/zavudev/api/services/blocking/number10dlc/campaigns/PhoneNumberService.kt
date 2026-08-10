// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.number10dlc.campaigns

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberAssignParams
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberAssignResponse
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberListParams
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberListResponse
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberUnassignParams
import java.util.function.Consumer

interface PhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService

    /** List phone numbers assigned to a 10DLC campaign. */
    fun list(campaignId: String): PhoneNumberListResponse =
        list(campaignId, PhoneNumberListParams.none())

    /** @see list */
    fun list(
        campaignId: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListResponse =
        list(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see list */
    fun list(
        campaignId: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
    ): PhoneNumberListResponse = list(campaignId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListResponse

    /** @see list */
    fun list(params: PhoneNumberListParams): PhoneNumberListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(campaignId: String, requestOptions: RequestOptions): PhoneNumberListResponse =
        list(campaignId, PhoneNumberListParams.none(), requestOptions)

    /**
     * Assign a US phone number to an approved 10DLC campaign. The campaign must be in approved
     * status.
     */
    fun assign(campaignId: String, params: PhoneNumberAssignParams): PhoneNumberAssignResponse =
        assign(campaignId, params, RequestOptions.none())

    /** @see assign */
    fun assign(
        campaignId: String,
        params: PhoneNumberAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignResponse =
        assign(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see assign */
    fun assign(params: PhoneNumberAssignParams): PhoneNumberAssignResponse =
        assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(
        params: PhoneNumberAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignResponse

    /** Remove a phone number assignment from a 10DLC campaign. */
    fun unassign(assignmentId: String, params: PhoneNumberUnassignParams) =
        unassign(assignmentId, params, RequestOptions.none())

    /** @see unassign */
    fun unassign(
        assignmentId: String,
        params: PhoneNumberUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unassign(params.toBuilder().assignmentId(assignmentId).build(), requestOptions)

    /** @see unassign */
    fun unassign(params: PhoneNumberUnassignParams) = unassign(params, RequestOptions.none())

    /** @see unassign */
    fun unassign(
        params: PhoneNumberUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [PhoneNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/campaigns/{campaignId}/phone-numbers`, but
         * is otherwise the same as [PhoneNumberService.list].
         */
        @MustBeClosed
        fun list(campaignId: String): HttpResponseFor<PhoneNumberListResponse> =
            list(campaignId, PhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            campaignId: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListResponse> =
            list(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            campaignId: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
        ): HttpResponseFor<PhoneNumberListResponse> =
            list(campaignId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: PhoneNumberListParams): HttpResponseFor<PhoneNumberListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberListResponse> =
            list(campaignId, PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/campaigns/{campaignId}/phone-numbers`,
         * but is otherwise the same as [PhoneNumberService.assign].
         */
        @MustBeClosed
        fun assign(
            campaignId: String,
            params: PhoneNumberAssignParams,
        ): HttpResponseFor<PhoneNumberAssignResponse> =
            assign(campaignId, params, RequestOptions.none())

        /** @see assign */
        @MustBeClosed
        fun assign(
            campaignId: String,
            params: PhoneNumberAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignResponse> =
            assign(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see assign */
        @MustBeClosed
        fun assign(params: PhoneNumberAssignParams): HttpResponseFor<PhoneNumberAssignResponse> =
            assign(params, RequestOptions.none())

        /** @see assign */
        @MustBeClosed
        fun assign(
            params: PhoneNumberAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/10dlc/campaigns/{campaignId}/phone-numbers/{assignmentId}`, but is otherwise the same
         * as [PhoneNumberService.unassign].
         */
        @MustBeClosed
        fun unassign(assignmentId: String, params: PhoneNumberUnassignParams): HttpResponse =
            unassign(assignmentId, params, RequestOptions.none())

        /** @see unassign */
        @MustBeClosed
        fun unassign(
            assignmentId: String,
            params: PhoneNumberUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unassign(params.toBuilder().assignmentId(assignmentId).build(), requestOptions)

        /** @see unassign */
        @MustBeClosed
        fun unassign(params: PhoneNumberUnassignParams): HttpResponse =
            unassign(params, RequestOptions.none())

        /** @see unassign */
        @MustBeClosed
        fun unassign(
            params: PhoneNumberUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
