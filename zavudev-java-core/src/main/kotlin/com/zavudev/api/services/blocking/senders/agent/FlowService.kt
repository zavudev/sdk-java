// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.flows.FlowCreateParams
import com.zavudev.api.models.senders.agent.flows.FlowCreateResponse
import com.zavudev.api.models.senders.agent.flows.FlowDeleteParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateResponse
import com.zavudev.api.models.senders.agent.flows.FlowListPage
import com.zavudev.api.models.senders.agent.flows.FlowListParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveResponse
import com.zavudev.api.models.senders.agent.flows.FlowUpdateParams
import com.zavudev.api.models.senders.agent.flows.FlowUpdateResponse
import java.util.function.Consumer

interface FlowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlowService

    /** Create a new flow for an agent. */
    fun create(senderId: String, params: FlowCreateParams): FlowCreateResponse =
        create(senderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        senderId: String,
        params: FlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowCreateResponse = create(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see create */
    fun create(params: FlowCreateParams): FlowCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowCreateResponse

    /** Get a specific flow. */
    fun retrieve(flowId: String, params: FlowRetrieveParams): FlowRetrieveResponse =
        retrieve(flowId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        flowId: String,
        params: FlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowRetrieveResponse = retrieve(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: FlowRetrieveParams): FlowRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowRetrieveResponse

    /** Update a flow. */
    fun update(flowId: String, params: FlowUpdateParams): FlowUpdateResponse =
        update(flowId, params, RequestOptions.none())

    /** @see update */
    fun update(
        flowId: String,
        params: FlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowUpdateResponse = update(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see update */
    fun update(params: FlowUpdateParams): FlowUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowUpdateResponse

    /** List flows for an agent. */
    fun list(senderId: String): FlowListPage = list(senderId, FlowListParams.none())

    /** @see list */
    fun list(
        senderId: String,
        params: FlowListParams = FlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowListPage = list(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see list */
    fun list(senderId: String, params: FlowListParams = FlowListParams.none()): FlowListPage =
        list(senderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FlowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowListPage

    /** @see list */
    fun list(params: FlowListParams): FlowListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(senderId: String, requestOptions: RequestOptions): FlowListPage =
        list(senderId, FlowListParams.none(), requestOptions)

    /** Delete a flow. Cannot delete flows with active sessions. */
    fun delete(flowId: String, params: FlowDeleteParams) =
        delete(flowId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        flowId: String,
        params: FlowDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FlowDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FlowDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Create a copy of an existing flow with a new name. */
    fun duplicate(flowId: String, params: FlowDuplicateParams): FlowDuplicateResponse =
        duplicate(flowId, params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        flowId: String,
        params: FlowDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowDuplicateResponse = duplicate(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see duplicate */
    fun duplicate(params: FlowDuplicateParams): FlowDuplicateResponse =
        duplicate(params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        params: FlowDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlowDuplicateResponse

    /** A view of [FlowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent/flows`, but is
         * otherwise the same as [FlowService.create].
         */
        @MustBeClosed
        fun create(
            senderId: String,
            params: FlowCreateParams,
        ): HttpResponseFor<FlowCreateResponse> = create(senderId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            senderId: String,
            params: FlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowCreateResponse> =
            create(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: FlowCreateParams): HttpResponseFor<FlowCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/flows/{flowId}`, but is
         * otherwise the same as [FlowService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            flowId: String,
            params: FlowRetrieveParams,
        ): HttpResponseFor<FlowRetrieveResponse> = retrieve(flowId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            flowId: String,
            params: FlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowRetrieveResponse> =
            retrieve(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FlowRetrieveParams): HttpResponseFor<FlowRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}/agent/flows/{flowId}`, but
         * is otherwise the same as [FlowService.update].
         */
        @MustBeClosed
        fun update(flowId: String, params: FlowUpdateParams): HttpResponseFor<FlowUpdateResponse> =
            update(flowId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            flowId: String,
            params: FlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowUpdateResponse> =
            update(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FlowUpdateParams): HttpResponseFor<FlowUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/flows`, but is
         * otherwise the same as [FlowService.list].
         */
        @MustBeClosed
        fun list(senderId: String): HttpResponseFor<FlowListPage> =
            list(senderId, FlowListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            senderId: String,
            params: FlowListParams = FlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowListPage> =
            list(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            senderId: String,
            params: FlowListParams = FlowListParams.none(),
        ): HttpResponseFor<FlowListPage> = list(senderId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FlowListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: FlowListParams): HttpResponseFor<FlowListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(senderId: String, requestOptions: RequestOptions): HttpResponseFor<FlowListPage> =
            list(senderId, FlowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}/agent/flows/{flowId}`, but
         * is otherwise the same as [FlowService.delete].
         */
        @MustBeClosed
        fun delete(flowId: String, params: FlowDeleteParams): HttpResponse =
            delete(flowId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            flowId: String,
            params: FlowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: FlowDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FlowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/senders/{senderId}/agent/flows/{flowId}/duplicate`, but is otherwise the same as
         * [FlowService.duplicate].
         */
        @MustBeClosed
        fun duplicate(
            flowId: String,
            params: FlowDuplicateParams,
        ): HttpResponseFor<FlowDuplicateResponse> = duplicate(flowId, params, RequestOptions.none())

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            flowId: String,
            params: FlowDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowDuplicateResponse> =
            duplicate(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(params: FlowDuplicateParams): HttpResponseFor<FlowDuplicateResponse> =
            duplicate(params, RequestOptions.none())

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            params: FlowDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlowDuplicateResponse>
    }
}
