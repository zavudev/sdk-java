// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.agents.AgentCreateParams
import com.zavudev.api.models.agents.AgentCreateResponse
import com.zavudev.api.models.agents.AgentDeleteParams
import com.zavudev.api.models.agents.AgentListPageAsync
import com.zavudev.api.models.agents.AgentListParams
import com.zavudev.api.models.agents.AgentListVoicesParams
import com.zavudev.api.models.agents.AgentListVoicesResponse
import com.zavudev.api.models.agents.AgentRetrieveParams
import com.zavudev.api.models.agents.AgentRetrieveResponse
import com.zavudev.api.models.agents.AgentTestParams
import com.zavudev.api.models.agents.AgentTestResponse
import com.zavudev.api.models.agents.AgentUpdateParams
import com.zavudev.api.models.agents.AgentUpdateResponse
import com.zavudev.api.services.async.agents.SenderServiceAsync
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

    fun senders(): SenderServiceAsync

    /**
     * Create an agent without a sender. It is created disabled; connect a sender and enable it when
     * you are ready for it to answer.
     *
     * **Sub-resources.** An agent's tools, flows and knowledge bases are reachable at
     * `/v1/agents/{agentId}/tools`, `/v1/agents/{agentId}/flows` and
     * `/v1/agents/{agentId}/knowledge-bases`, mirroring the sender-scoped routes documented under
     * `/v1/senders/{senderId}/agent/...` exactly. Use the agent-scoped form while the agent has no
     * sender: the sender-scoped one cannot address it.
     */
    fun create(params: AgentCreateParams): CompletableFuture<AgentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentCreateResponse>

    /** Get an agent */
    fun retrieve(agentId: String): CompletableFuture<AgentRetrieveResponse> =
        retrieve(agentId, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentRetrieveResponse> =
        retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): CompletableFuture<AgentRetrieveResponse> = retrieve(agentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): CompletableFuture<AgentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        agentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentRetrieveResponse> =
        retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

    /** Update an agent */
    fun update(agentId: String): CompletableFuture<AgentUpdateResponse> =
        update(agentId, AgentUpdateParams.none())

    /** @see update */
    fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentUpdateResponse> =
        update(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see update */
    fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
    ): CompletableFuture<AgentUpdateResponse> = update(agentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentUpdateResponse>

    /** @see update */
    fun update(params: AgentUpdateParams): CompletableFuture<AgentUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        agentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentUpdateResponse> =
        update(agentId, AgentUpdateParams.none(), requestOptions)

    /**
     * Every agent in the project, newest first — including agents that are not connected to any
     * sender yet, which the sender-scoped routes cannot reach. Each item carries `senderIds`, the
     * senders the agent answers on.
     */
    fun list(): CompletableFuture<AgentListPageAsync> = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentListPageAsync>

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none()
    ): CompletableFuture<AgentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgentListPageAsync> =
        list(AgentListParams.none(), requestOptions)

    /** Delete an agent */
    fun delete(agentId: String): CompletableFuture<Void?> =
        delete(agentId, AgentDeleteParams.none())

    /** @see delete */
    fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(agentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AgentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(agentId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(agentId, AgentDeleteParams.none(), requestOptions)

    /**
     * The voices an agent can speak with, for `voice.ttsVoiceId`. Filter by `language` to get the
     * ones that speak it; a voice can still be used with `language: auto`, where the agent follows
     * the caller and keeps the chosen voice.
     */
    fun listVoices(): CompletableFuture<AgentListVoicesResponse> =
        listVoices(AgentListVoicesParams.none())

    /** @see listVoices */
    fun listVoices(
        params: AgentListVoicesParams = AgentListVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentListVoicesResponse>

    /** @see listVoices */
    fun listVoices(
        params: AgentListVoicesParams = AgentListVoicesParams.none()
    ): CompletableFuture<AgentListVoicesResponse> = listVoices(params, RequestOptions.none())

    /** @see listVoices */
    fun listVoices(requestOptions: RequestOptions): CompletableFuture<AgentListVoicesResponse> =
        listVoices(AgentListVoicesParams.none(), requestOptions)

    /**
     * Run the agent's prompt, model and knowledge base against a message and return the reply
     * instead of delivering it. Writes nothing and charges nothing, so it is safe to call
     * repeatedly while iterating on a prompt.
     *
     * Note that a dry run never **executes** tools — running them would cause real side effects.
     * Live conversations on every channel do call them. When the agent has enabled tools, that gap
     * is reported in `warnings` rather than silently producing an answer that looks like a tool
     * call happened.
     */
    fun test(agentId: String, params: AgentTestParams): CompletableFuture<AgentTestResponse> =
        test(agentId, params, RequestOptions.none())

    /** @see test */
    fun test(
        agentId: String,
        params: AgentTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentTestResponse> =
        test(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see test */
    fun test(params: AgentTestParams): CompletableFuture<AgentTestResponse> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: AgentTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentTestResponse>

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

        fun senders(): SenderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/agents`, but is otherwise the same as
         * [AgentServiceAsync.create].
         */
        fun create(
            params: AgentCreateParams
        ): CompletableFuture<HttpResponseFor<AgentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/agents/{agentId}`, but is otherwise the same as
         * [AgentServiceAsync.retrieve].
         */
        fun retrieve(agentId: String): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(agentId, AgentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(agentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            agentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/agents/{agentId}`, but is otherwise the same
         * as [AgentServiceAsync.update].
         */
        fun update(agentId: String): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(agentId, AgentUpdateParams.none())

        /** @see update */
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see update */
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(agentId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>>

        /** @see update */
        fun update(
            params: AgentUpdateParams
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            agentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(agentId, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/agents`, but is otherwise the same as
         * [AgentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(AgentListParams.none())

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>>

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/agents/{agentId}`, but is otherwise the same
         * as [AgentServiceAsync.delete].
         */
        fun delete(agentId: String): CompletableFuture<HttpResponse> =
            delete(agentId, AgentDeleteParams.none())

        /** @see delete */
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(agentId, params, RequestOptions.none())

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
            agentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(agentId, AgentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/agents/voices`, but is otherwise the same as
         * [AgentServiceAsync.listVoices].
         */
        fun listVoices(): CompletableFuture<HttpResponseFor<AgentListVoicesResponse>> =
            listVoices(AgentListVoicesParams.none())

        /** @see listVoices */
        fun listVoices(
            params: AgentListVoicesParams = AgentListVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentListVoicesResponse>>

        /** @see listVoices */
        fun listVoices(
            params: AgentListVoicesParams = AgentListVoicesParams.none()
        ): CompletableFuture<HttpResponseFor<AgentListVoicesResponse>> =
            listVoices(params, RequestOptions.none())

        /** @see listVoices */
        fun listVoices(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgentListVoicesResponse>> =
            listVoices(AgentListVoicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/agents/{agentId}/test`, but is otherwise the
         * same as [AgentServiceAsync.test].
         */
        fun test(
            agentId: String,
            params: AgentTestParams,
        ): CompletableFuture<HttpResponseFor<AgentTestResponse>> =
            test(agentId, params, RequestOptions.none())

        /** @see test */
        fun test(
            agentId: String,
            params: AgentTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentTestResponse>> =
            test(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see test */
        fun test(params: AgentTestParams): CompletableFuture<HttpResponseFor<AgentTestResponse>> =
            test(params, RequestOptions.none())

        /** @see test */
        fun test(
            params: AgentTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentTestResponse>>
    }
}
