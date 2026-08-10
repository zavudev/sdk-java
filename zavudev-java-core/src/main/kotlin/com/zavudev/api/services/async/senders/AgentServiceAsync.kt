// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.AgentCreateParams
import com.zavudev.api.models.senders.agent.AgentDeleteParams
import com.zavudev.api.models.senders.agent.AgentResponse
import com.zavudev.api.models.senders.agent.AgentRetrieveParams
import com.zavudev.api.models.senders.agent.AgentStats
import com.zavudev.api.models.senders.agent.AgentStatsParams
import com.zavudev.api.models.senders.agent.AgentUpdateParams
import com.zavudev.api.services.async.senders.agent.ExecutionServiceAsync
import com.zavudev.api.services.async.senders.agent.FlowServiceAsync
import com.zavudev.api.services.async.senders.agent.KnowledgeBaseServiceAsync
import com.zavudev.api.services.async.senders.agent.ToolServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync

    fun executions(): ExecutionServiceAsync

    fun flows(): FlowServiceAsync

    fun tools(): ToolServiceAsync

    fun knowledgeBases(): KnowledgeBaseServiceAsync

    /** Create an AI agent for a sender. Each sender can have at most one agent. */
    fun create(senderId: String, params: AgentCreateParams): CompletableFuture<AgentResponse> =
        create(senderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        senderId: String,
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse> =
        create(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see create */
    fun create(params: AgentCreateParams): CompletableFuture<AgentResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse>

    /** Get the AI agent configuration for a sender. */
    fun retrieve(senderId: String): CompletableFuture<AgentResponse> =
        retrieve(senderId, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse> =
        retrieve(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): CompletableFuture<AgentResponse> = retrieve(senderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse>

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): CompletableFuture<AgentResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentResponse> =
        retrieve(senderId, AgentRetrieveParams.none(), requestOptions)

    /** Update an AI agent's configuration. */
    fun update(senderId: String): CompletableFuture<AgentResponse> =
        update(senderId, AgentUpdateParams.none())

    /** @see update */
    fun update(
        senderId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse> =
        update(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see update */
    fun update(
        senderId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
    ): CompletableFuture<AgentResponse> = update(senderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse>

    /** @see update */
    fun update(params: AgentUpdateParams): CompletableFuture<AgentResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(senderId: String, requestOptions: RequestOptions): CompletableFuture<AgentResponse> =
        update(senderId, AgentUpdateParams.none(), requestOptions)

    /** Delete an AI agent. */
    fun delete(senderId: String): CompletableFuture<Void?> =
        delete(senderId, AgentDeleteParams.none())

    /** @see delete */
    fun delete(
        senderId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see delete */
    fun delete(
        senderId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(senderId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AgentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(senderId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(senderId, AgentDeleteParams.none(), requestOptions)

    /**
     * Get statistics for an AI agent including invocations, tokens, and costs.
     *
     * Covers the messaging channels only. Voice calls are not counted here: a call is a multi-turn
     * conversation rather than one inbound message and one reply, so it is recorded as a call, not
     * an execution. An agent that only answers phone calls reports zeros on every field. Use `GET
     * /v1/calls` for voice activity, duration, and cost.
     */
    fun stats(senderId: String): CompletableFuture<AgentStats> =
        stats(senderId, AgentStatsParams.none())

    /** @see stats */
    fun stats(
        senderId: String,
        params: AgentStatsParams = AgentStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentStats> =
        stats(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see stats */
    fun stats(
        senderId: String,
        params: AgentStatsParams = AgentStatsParams.none(),
    ): CompletableFuture<AgentStats> = stats(senderId, params, RequestOptions.none())

    /** @see stats */
    fun stats(
        params: AgentStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentStats>

    /** @see stats */
    fun stats(params: AgentStatsParams): CompletableFuture<AgentStats> =
        stats(params, RequestOptions.none())

    /** @see stats */
    fun stats(senderId: String, requestOptions: RequestOptions): CompletableFuture<AgentStats> =
        stats(senderId, AgentStatsParams.none(), requestOptions)

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse

        fun executions(): ExecutionServiceAsync.WithRawResponse

        fun flows(): FlowServiceAsync.WithRawResponse

        fun tools(): ToolServiceAsync.WithRawResponse

        fun knowledgeBases(): KnowledgeBaseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent`, but is otherwise the
         * same as [AgentServiceAsync.create].
         */
        fun create(
            senderId: String,
            params: AgentCreateParams,
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            create(senderId, params, RequestOptions.none())

        /** @see create */
        fun create(
            senderId: String,
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            create(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see create */
        fun create(params: AgentCreateParams): CompletableFuture<HttpResponseFor<AgentResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent`, but is otherwise the
         * same as [AgentServiceAsync.retrieve].
         */
        fun retrieve(senderId: String): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(senderId, AgentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(senderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(senderId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}/agent`, but is otherwise
         * the same as [AgentServiceAsync.update].
         */
        fun update(senderId: String): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(senderId, AgentUpdateParams.none())

        /** @see update */
        fun update(
            senderId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see update */
        fun update(
            senderId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(senderId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>>

        /** @see update */
        fun update(params: AgentUpdateParams): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(senderId, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}/agent`, but is otherwise
         * the same as [AgentServiceAsync.delete].
         */
        fun delete(senderId: String): CompletableFuture<HttpResponse> =
            delete(senderId, AgentDeleteParams.none())

        /** @see delete */
        fun delete(
            senderId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see delete */
        fun delete(
            senderId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(senderId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AgentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(senderId, AgentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/stats`, but is
         * otherwise the same as [AgentServiceAsync.stats].
         */
        fun stats(senderId: String): CompletableFuture<HttpResponseFor<AgentStats>> =
            stats(senderId, AgentStatsParams.none())

        /** @see stats */
        fun stats(
            senderId: String,
            params: AgentStatsParams = AgentStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentStats>> =
            stats(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see stats */
        fun stats(
            senderId: String,
            params: AgentStatsParams = AgentStatsParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentStats>> =
            stats(senderId, params, RequestOptions.none())

        /** @see stats */
        fun stats(
            params: AgentStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentStats>>

        /** @see stats */
        fun stats(params: AgentStatsParams): CompletableFuture<HttpResponseFor<AgentStats>> =
            stats(params, RequestOptions.none())

        /** @see stats */
        fun stats(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentStats>> =
            stats(senderId, AgentStatsParams.none(), requestOptions)
    }
}
