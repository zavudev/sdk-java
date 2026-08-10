// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.tools.ToolCreateParams
import com.zavudev.api.models.senders.agent.tools.ToolCreateResponse
import com.zavudev.api.models.senders.agent.tools.ToolDeleteParams
import com.zavudev.api.models.senders.agent.tools.ToolListPageAsync
import com.zavudev.api.models.senders.agent.tools.ToolListParams
import com.zavudev.api.models.senders.agent.tools.ToolRetrieveParams
import com.zavudev.api.models.senders.agent.tools.ToolRetrieveResponse
import com.zavudev.api.models.senders.agent.tools.ToolTestParams
import com.zavudev.api.models.senders.agent.tools.ToolTestResponse
import com.zavudev.api.models.senders.agent.tools.ToolUpdateParams
import com.zavudev.api.models.senders.agent.tools.ToolUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ToolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync

    /** Create a new tool for an agent. Tools allow the agent to call external webhooks. */
    fun create(senderId: String, params: ToolCreateParams): CompletableFuture<ToolCreateResponse> =
        create(senderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        senderId: String,
        params: ToolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolCreateResponse> =
        create(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see create */
    fun create(params: ToolCreateParams): CompletableFuture<ToolCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ToolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolCreateResponse>

    /** Get a specific tool. */
    fun retrieve(
        toolId: String,
        params: ToolRetrieveParams,
    ): CompletableFuture<ToolRetrieveResponse> = retrieve(toolId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        toolId: String,
        params: ToolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolRetrieveResponse> =
        retrieve(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ToolRetrieveParams): CompletableFuture<ToolRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ToolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolRetrieveResponse>

    /** Update a tool. */
    fun update(toolId: String, params: ToolUpdateParams): CompletableFuture<ToolUpdateResponse> =
        update(toolId, params, RequestOptions.none())

    /** @see update */
    fun update(
        toolId: String,
        params: ToolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolUpdateResponse> =
        update(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see update */
    fun update(params: ToolUpdateParams): CompletableFuture<ToolUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ToolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolUpdateResponse>

    /** List tools for an agent. */
    fun list(senderId: String): CompletableFuture<ToolListPageAsync> =
        list(senderId, ToolListParams.none())

    /** @see list */
    fun list(
        senderId: String,
        params: ToolListParams = ToolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolListPageAsync> =
        list(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see list */
    fun list(
        senderId: String,
        params: ToolListParams = ToolListParams.none(),
    ): CompletableFuture<ToolListPageAsync> = list(senderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ToolListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolListPageAsync>

    /** @see list */
    fun list(params: ToolListParams): CompletableFuture<ToolListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolListPageAsync> = list(senderId, ToolListParams.none(), requestOptions)

    /** Delete a tool. */
    fun delete(toolId: String, params: ToolDeleteParams): CompletableFuture<Void?> =
        delete(toolId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toolId: String,
        params: ToolDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ToolDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ToolDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Run a tool with the parameters you supply and return what it answered.
     *
     * The call is synchronous: the response carries the tool's status, body, and duration, so a
     * green result is evidence the tool ran rather than evidence it was accepted. Each run is also
     * recorded and readable afterwards via `GET
     * /v1/senders/{senderId}/agent/tools/{toolId}/test-runs`.
     *
     * A tool that answers with an error is reported as a run with `success: false` — the endpoint
     * itself still returns 200. This fires the tool's real webhook, so a test has whatever side
     * effects the tool has.
     */
    fun test(toolId: String, params: ToolTestParams): CompletableFuture<ToolTestResponse> =
        test(toolId, params, RequestOptions.none())

    /** @see test */
    fun test(
        toolId: String,
        params: ToolTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolTestResponse> =
        test(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see test */
    fun test(params: ToolTestParams): CompletableFuture<ToolTestResponse> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: ToolTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolTestResponse>

    /** A view of [ToolServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent/tools`, but is
         * otherwise the same as [ToolServiceAsync.create].
         */
        fun create(
            senderId: String,
            params: ToolCreateParams,
        ): CompletableFuture<HttpResponseFor<ToolCreateResponse>> =
            create(senderId, params, RequestOptions.none())

        /** @see create */
        fun create(
            senderId: String,
            params: ToolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolCreateResponse>> =
            create(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ToolCreateParams
        ): CompletableFuture<HttpResponseFor<ToolCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ToolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/tools/{toolId}`, but is
         * otherwise the same as [ToolServiceAsync.retrieve].
         */
        fun retrieve(
            toolId: String,
            params: ToolRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>> =
            retrieve(toolId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            toolId: String,
            params: ToolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>> =
            retrieve(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ToolRetrieveParams
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ToolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}/agent/tools/{toolId}`, but
         * is otherwise the same as [ToolServiceAsync.update].
         */
        fun update(
            toolId: String,
            params: ToolUpdateParams,
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>> =
            update(toolId, params, RequestOptions.none())

        /** @see update */
        fun update(
            toolId: String,
            params: ToolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>> =
            update(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ToolUpdateParams
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ToolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/tools`, but is
         * otherwise the same as [ToolServiceAsync.list].
         */
        fun list(senderId: String): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(senderId, ToolListParams.none())

        /** @see list */
        fun list(
            senderId: String,
            params: ToolListParams = ToolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see list */
        fun list(
            senderId: String,
            params: ToolListParams = ToolListParams.none(),
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(senderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ToolListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>>

        /** @see list */
        fun list(params: ToolListParams): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(senderId, ToolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}/agent/tools/{toolId}`, but
         * is otherwise the same as [ToolServiceAsync.delete].
         */
        fun delete(toolId: String, params: ToolDeleteParams): CompletableFuture<HttpResponse> =
            delete(toolId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            toolId: String,
            params: ToolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ToolDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ToolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent/tools/{toolId}/test`,
         * but is otherwise the same as [ToolServiceAsync.test].
         */
        fun test(
            toolId: String,
            params: ToolTestParams,
        ): CompletableFuture<HttpResponseFor<ToolTestResponse>> =
            test(toolId, params, RequestOptions.none())

        /** @see test */
        fun test(
            toolId: String,
            params: ToolTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolTestResponse>> =
            test(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see test */
        fun test(params: ToolTestParams): CompletableFuture<HttpResponseFor<ToolTestResponse>> =
            test(params, RequestOptions.none())

        /** @see test */
        fun test(
            params: ToolTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolTestResponse>>
    }
}
