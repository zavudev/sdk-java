// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.number10dlc.campaigns

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberAssignParams
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberAssignResponse
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberListParams
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberListResponse
import com.zavudev.api.models.number10dlc.campaigns.phonenumbers.PhoneNumberUnassignParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync

    /** List phone numbers assigned to a 10DLC campaign. */
    fun list(campaignId: String): CompletableFuture<PhoneNumberListResponse> =
        list(campaignId, PhoneNumberListParams.none())

    /** @see list */
    fun list(
        campaignId: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListResponse> =
        list(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see list */
    fun list(
        campaignId: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
    ): CompletableFuture<PhoneNumberListResponse> = list(campaignId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListResponse>

    /** @see list */
    fun list(params: PhoneNumberListParams): CompletableFuture<PhoneNumberListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberListResponse> =
        list(campaignId, PhoneNumberListParams.none(), requestOptions)

    /**
     * Assign a US phone number to an approved 10DLC campaign. The campaign must be in approved
     * status.
     */
    fun assign(
        campaignId: String,
        params: PhoneNumberAssignParams,
    ): CompletableFuture<PhoneNumberAssignResponse> =
        assign(campaignId, params, RequestOptions.none())

    /** @see assign */
    fun assign(
        campaignId: String,
        params: PhoneNumberAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignResponse> =
        assign(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see assign */
    fun assign(params: PhoneNumberAssignParams): CompletableFuture<PhoneNumberAssignResponse> =
        assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(
        params: PhoneNumberAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignResponse>

    /** Remove a phone number assignment from a 10DLC campaign. */
    fun unassign(
        assignmentId: String,
        params: PhoneNumberUnassignParams,
    ): CompletableFuture<Void?> = unassign(assignmentId, params, RequestOptions.none())

    /** @see unassign */
    fun unassign(
        assignmentId: String,
        params: PhoneNumberUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unassign(params.toBuilder().assignmentId(assignmentId).build(), requestOptions)

    /** @see unassign */
    fun unassign(params: PhoneNumberUnassignParams): CompletableFuture<Void?> =
        unassign(params, RequestOptions.none())

    /** @see unassign */
    fun unassign(
        params: PhoneNumberUnassignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [PhoneNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): PhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/10dlc/campaigns/{campaignId}/phone-numbers`, but
         * is otherwise the same as [PhoneNumberServiceAsync.list].
         */
        fun list(campaignId: String): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(campaignId, PhoneNumberListParams.none())

        /** @see list */
        fun list(
            campaignId: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see list */
        fun list(
            campaignId: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(campaignId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>>

        /** @see list */
        fun list(
            params: PhoneNumberListParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(campaignId, PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/10dlc/campaigns/{campaignId}/phone-numbers`,
         * but is otherwise the same as [PhoneNumberServiceAsync.assign].
         */
        fun assign(
            campaignId: String,
            params: PhoneNumberAssignParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignResponse>> =
            assign(campaignId, params, RequestOptions.none())

        /** @see assign */
        fun assign(
            campaignId: String,
            params: PhoneNumberAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignResponse>> =
            assign(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see assign */
        fun assign(
            params: PhoneNumberAssignParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignResponse>> =
            assign(params, RequestOptions.none())

        /** @see assign */
        fun assign(
            params: PhoneNumberAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/10dlc/campaigns/{campaignId}/phone-numbers/{assignmentId}`, but is otherwise the same
         * as [PhoneNumberServiceAsync.unassign].
         */
        fun unassign(
            assignmentId: String,
            params: PhoneNumberUnassignParams,
        ): CompletableFuture<HttpResponse> = unassign(assignmentId, params, RequestOptions.none())

        /** @see unassign */
        fun unassign(
            assignmentId: String,
            params: PhoneNumberUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unassign(params.toBuilder().assignmentId(assignmentId).build(), requestOptions)

        /** @see unassign */
        fun unassign(params: PhoneNumberUnassignParams): CompletableFuture<HttpResponse> =
            unassign(params, RequestOptions.none())

        /** @see unassign */
        fun unassign(
            params: PhoneNumberUnassignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
