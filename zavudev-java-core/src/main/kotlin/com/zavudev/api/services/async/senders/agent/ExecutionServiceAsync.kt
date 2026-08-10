// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.executions.ExecutionListPageAsync
import com.zavudev.api.models.senders.agent.executions.ExecutionListParams
import com.zavudev.api.models.senders.agent.executions.ExecutionRetrieveParams
import com.zavudev.api.models.senders.agent.executions.ExecutionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExecutionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExecutionServiceAsync

    /**
     * Fetch full details for one execution — including `errorMessage`, `errorCode`, and
     * `responseText`. Use this to debug failures surfaced by the list endpoint.
     */
    fun retrieve(
        executionId: String,
        params: ExecutionRetrieveParams,
    ): CompletableFuture<ExecutionRetrieveResponse> =
        retrieve(executionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        executionId: String,
        params: ExecutionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecutionRetrieveResponse> =
        retrieve(params.toBuilder().executionId(executionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ExecutionRetrieveParams): CompletableFuture<ExecutionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExecutionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecutionRetrieveResponse>

    /**
     * List recent agent executions with pagination.
     *
     * An execution is one inbound message answered by the agent, so this covers the messaging
     * channels only. Voice calls are never listed here regardless of how many the agent handled.
     * Use `GET /v1/calls` (and `GET /v1/calls/{callId}` for the transcript) for voice.
     */
    fun list(senderId: String): CompletableFuture<ExecutionListPageAsync> =
        list(senderId, ExecutionListParams.none())

    /** @see list */
    fun list(
        senderId: String,
        params: ExecutionListParams = ExecutionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecutionListPageAsync> =
        list(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see list */
    fun list(
        senderId: String,
        params: ExecutionListParams = ExecutionListParams.none(),
    ): CompletableFuture<ExecutionListPageAsync> = list(senderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExecutionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecutionListPageAsync>

    /** @see list */
    fun list(params: ExecutionListParams): CompletableFuture<ExecutionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExecutionListPageAsync> =
        list(senderId, ExecutionListParams.none(), requestOptions)

    /**
     * A view of [ExecutionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExecutionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/senders/{senderId}/agent/executions/{executionId}`, but is otherwise the same as
         * [ExecutionServiceAsync.retrieve].
         */
        fun retrieve(
            executionId: String,
            params: ExecutionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ExecutionRetrieveResponse>> =
            retrieve(executionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            executionId: String,
            params: ExecutionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecutionRetrieveResponse>> =
            retrieve(params.toBuilder().executionId(executionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ExecutionRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExecutionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ExecutionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecutionRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/executions`, but is
         * otherwise the same as [ExecutionServiceAsync.list].
         */
        fun list(senderId: String): CompletableFuture<HttpResponseFor<ExecutionListPageAsync>> =
            list(senderId, ExecutionListParams.none())

        /** @see list */
        fun list(
            senderId: String,
            params: ExecutionListParams = ExecutionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecutionListPageAsync>> =
            list(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see list */
        fun list(
            senderId: String,
            params: ExecutionListParams = ExecutionListParams.none(),
        ): CompletableFuture<HttpResponseFor<ExecutionListPageAsync>> =
            list(senderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ExecutionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecutionListPageAsync>>

        /** @see list */
        fun list(
            params: ExecutionListParams
        ): CompletableFuture<HttpResponseFor<ExecutionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExecutionListPageAsync>> =
            list(senderId, ExecutionListParams.none(), requestOptions)
    }
}
