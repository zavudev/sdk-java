// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.flows.FlowCreateParams
import com.zavudev.api.models.senders.agent.flows.FlowCreateResponse
import com.zavudev.api.models.senders.agent.flows.FlowDeleteParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateResponse
import com.zavudev.api.models.senders.agent.flows.FlowListPageAsync
import com.zavudev.api.models.senders.agent.flows.FlowListParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveResponse
import com.zavudev.api.models.senders.agent.flows.FlowUpdateParams
import com.zavudev.api.models.senders.agent.flows.FlowUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FlowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlowServiceAsync

    /** Create a new flow for an agent. */
    fun create(senderId: String, params: FlowCreateParams): CompletableFuture<FlowCreateResponse> =
        create(senderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        senderId: String,
        params: FlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowCreateResponse> =
        create(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see create */
    fun create(params: FlowCreateParams): CompletableFuture<FlowCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowCreateResponse>

    /** Get a specific flow. */
    fun retrieve(
        flowId: String,
        params: FlowRetrieveParams,
    ): CompletableFuture<FlowRetrieveResponse> = retrieve(flowId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        flowId: String,
        params: FlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowRetrieveResponse> =
        retrieve(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: FlowRetrieveParams): CompletableFuture<FlowRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowRetrieveResponse>

    /** Update a flow. */
    fun update(flowId: String, params: FlowUpdateParams): CompletableFuture<FlowUpdateResponse> =
        update(flowId, params, RequestOptions.none())

    /** @see update */
    fun update(
        flowId: String,
        params: FlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowUpdateResponse> =
        update(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see update */
    fun update(params: FlowUpdateParams): CompletableFuture<FlowUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowUpdateResponse>

    /** List flows for an agent. */
    fun list(senderId: String): CompletableFuture<FlowListPageAsync> =
        list(senderId, FlowListParams.none())

    /** @see list */
    fun list(
        senderId: String,
        params: FlowListParams = FlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowListPageAsync> =
        list(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see list */
    fun list(
        senderId: String,
        params: FlowListParams = FlowListParams.none(),
    ): CompletableFuture<FlowListPageAsync> = list(senderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FlowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowListPageAsync>

    /** @see list */
    fun list(params: FlowListParams): CompletableFuture<FlowListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FlowListPageAsync> = list(senderId, FlowListParams.none(), requestOptions)

    /** Delete a flow. Cannot delete flows with active sessions. */
    fun delete(flowId: String, params: FlowDeleteParams): CompletableFuture<Void?> =
        delete(flowId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        flowId: String,
        params: FlowDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FlowDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FlowDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Create a copy of an existing flow with a new name. */
    fun duplicate(
        flowId: String,
        params: FlowDuplicateParams,
    ): CompletableFuture<FlowDuplicateResponse> = duplicate(flowId, params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        flowId: String,
        params: FlowDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowDuplicateResponse> =
        duplicate(params.toBuilder().flowId(flowId).build(), requestOptions)

    /** @see duplicate */
    fun duplicate(params: FlowDuplicateParams): CompletableFuture<FlowDuplicateResponse> =
        duplicate(params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        params: FlowDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlowDuplicateResponse>

    /** A view of [FlowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent/flows`, but is
         * otherwise the same as [FlowServiceAsync.create].
         */
        fun create(
            senderId: String,
            params: FlowCreateParams,
        ): CompletableFuture<HttpResponseFor<FlowCreateResponse>> =
            create(senderId, params, RequestOptions.none())

        /** @see create */
        fun create(
            senderId: String,
            params: FlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowCreateResponse>> =
            create(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see create */
        fun create(
            params: FlowCreateParams
        ): CompletableFuture<HttpResponseFor<FlowCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/flows/{flowId}`, but is
         * otherwise the same as [FlowServiceAsync.retrieve].
         */
        fun retrieve(
            flowId: String,
            params: FlowRetrieveParams,
        ): CompletableFuture<HttpResponseFor<FlowRetrieveResponse>> =
            retrieve(flowId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            flowId: String,
            params: FlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowRetrieveResponse>> =
            retrieve(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: FlowRetrieveParams
        ): CompletableFuture<HttpResponseFor<FlowRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}/agent/flows/{flowId}`, but
         * is otherwise the same as [FlowServiceAsync.update].
         */
        fun update(
            flowId: String,
            params: FlowUpdateParams,
        ): CompletableFuture<HttpResponseFor<FlowUpdateResponse>> =
            update(flowId, params, RequestOptions.none())

        /** @see update */
        fun update(
            flowId: String,
            params: FlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowUpdateResponse>> =
            update(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see update */
        fun update(
            params: FlowUpdateParams
        ): CompletableFuture<HttpResponseFor<FlowUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/flows`, but is
         * otherwise the same as [FlowServiceAsync.list].
         */
        fun list(senderId: String): CompletableFuture<HttpResponseFor<FlowListPageAsync>> =
            list(senderId, FlowListParams.none())

        /** @see list */
        fun list(
            senderId: String,
            params: FlowListParams = FlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowListPageAsync>> =
            list(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see list */
        fun list(
            senderId: String,
            params: FlowListParams = FlowListParams.none(),
        ): CompletableFuture<HttpResponseFor<FlowListPageAsync>> =
            list(senderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FlowListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowListPageAsync>>

        /** @see list */
        fun list(params: FlowListParams): CompletableFuture<HttpResponseFor<FlowListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlowListPageAsync>> =
            list(senderId, FlowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}/agent/flows/{flowId}`, but
         * is otherwise the same as [FlowServiceAsync.delete].
         */
        fun delete(flowId: String, params: FlowDeleteParams): CompletableFuture<HttpResponse> =
            delete(flowId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            flowId: String,
            params: FlowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see delete */
        fun delete(params: FlowDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FlowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/senders/{senderId}/agent/flows/{flowId}/duplicate`, but is otherwise the same as
         * [FlowServiceAsync.duplicate].
         */
        fun duplicate(
            flowId: String,
            params: FlowDuplicateParams,
        ): CompletableFuture<HttpResponseFor<FlowDuplicateResponse>> =
            duplicate(flowId, params, RequestOptions.none())

        /** @see duplicate */
        fun duplicate(
            flowId: String,
            params: FlowDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowDuplicateResponse>> =
            duplicate(params.toBuilder().flowId(flowId).build(), requestOptions)

        /** @see duplicate */
        fun duplicate(
            params: FlowDuplicateParams
        ): CompletableFuture<HttpResponseFor<FlowDuplicateResponse>> =
            duplicate(params, RequestOptions.none())

        /** @see duplicate */
        fun duplicate(
            params: FlowDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlowDuplicateResponse>>
    }
}
