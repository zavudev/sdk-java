// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.agents.AgentCreateParams
import com.zavudev.api.models.agents.AgentCreateResponse
import com.zavudev.api.models.agents.AgentDeleteParams
import com.zavudev.api.models.agents.AgentListPage
import com.zavudev.api.models.agents.AgentListParams
import com.zavudev.api.models.agents.AgentListVoicesParams
import com.zavudev.api.models.agents.AgentListVoicesResponse
import com.zavudev.api.models.agents.AgentRetrieveParams
import com.zavudev.api.models.agents.AgentRetrieveResponse
import com.zavudev.api.models.agents.AgentTestParams
import com.zavudev.api.models.agents.AgentTestResponse
import com.zavudev.api.models.agents.AgentUpdateParams
import com.zavudev.api.models.agents.AgentUpdateResponse
import com.zavudev.api.services.blocking.agents.SenderService
import java.util.function.Consumer

interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService

    fun senders(): SenderService

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
    fun create(params: AgentCreateParams): AgentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse

    /** Get an agent */
    fun retrieve(agentId: String): AgentRetrieveResponse =
        retrieve(agentId, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentRetrieveResponse = retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): AgentRetrieveResponse = retrieve(agentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): AgentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(agentId: String, requestOptions: RequestOptions): AgentRetrieveResponse =
        retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

    /** Update an agent */
    fun update(agentId: String): AgentUpdateResponse = update(agentId, AgentUpdateParams.none())

    /** @see update */
    fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentUpdateResponse = update(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see update */
    fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
    ): AgentUpdateResponse = update(agentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentUpdateResponse

    /** @see update */
    fun update(params: AgentUpdateParams): AgentUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(agentId: String, requestOptions: RequestOptions): AgentUpdateResponse =
        update(agentId, AgentUpdateParams.none(), requestOptions)

    /**
     * Every agent in the project, newest first — including agents that are not connected to any
     * sender yet, which the sender-scoped routes cannot reach. Each item carries `senderIds`, the
     * senders the agent answers on.
     */
    fun list(): AgentListPage = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListPage

    /** @see list */
    fun list(params: AgentListParams = AgentListParams.none()): AgentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentListPage =
        list(AgentListParams.none(), requestOptions)

    /** Delete an agent */
    fun delete(agentId: String) = delete(agentId, AgentDeleteParams.none())

    /** @see delete */
    fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see delete */
    fun delete(agentId: String, params: AgentDeleteParams = AgentDeleteParams.none()) =
        delete(agentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: AgentDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AgentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(agentId: String, requestOptions: RequestOptions) =
        delete(agentId, AgentDeleteParams.none(), requestOptions)

    /**
     * The voices an agent can speak with, for `voice.ttsVoiceId`. Filter by `language` to get the
     * ones that speak it; a voice can still be used with `language: auto`, where the agent follows
     * the caller and keeps the chosen voice.
     */
    fun listVoices(): AgentListVoicesResponse = listVoices(AgentListVoicesParams.none())

    /** @see listVoices */
    fun listVoices(
        params: AgentListVoicesParams = AgentListVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListVoicesResponse

    /** @see listVoices */
    fun listVoices(
        params: AgentListVoicesParams = AgentListVoicesParams.none()
    ): AgentListVoicesResponse = listVoices(params, RequestOptions.none())

    /** @see listVoices */
    fun listVoices(requestOptions: RequestOptions): AgentListVoicesResponse =
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
    fun test(agentId: String, params: AgentTestParams): AgentTestResponse =
        test(agentId, params, RequestOptions.none())

    /** @see test */
    fun test(
        agentId: String,
        params: AgentTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentTestResponse = test(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see test */
    fun test(params: AgentTestParams): AgentTestResponse = test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: AgentTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentTestResponse

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService.WithRawResponse

        fun senders(): SenderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/agents`, but is otherwise the same as
         * [AgentService.create].
         */
        @MustBeClosed
        fun create(params: AgentCreateParams): HttpResponseFor<AgentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/agents/{agentId}`, but is otherwise the same as
         * [AgentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(agentId: String): HttpResponseFor<AgentRetrieveResponse> =
            retrieve(agentId, AgentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentRetrieveResponse> =
            retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): HttpResponseFor<AgentRetrieveResponse> = retrieve(agentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AgentRetrieveParams): HttpResponseFor<AgentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentRetrieveResponse> =
            retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/agents/{agentId}`, but is otherwise the same
         * as [AgentService.update].
         */
        @MustBeClosed
        fun update(agentId: String): HttpResponseFor<AgentUpdateResponse> =
            update(agentId, AgentUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentUpdateResponse> =
            update(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): HttpResponseFor<AgentUpdateResponse> = update(agentId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AgentUpdateParams): HttpResponseFor<AgentUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentUpdateResponse> =
            update(agentId, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/agents`, but is otherwise the same as
         * [AgentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AgentListPage> = list(AgentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AgentListParams = AgentListParams.none()): HttpResponseFor<AgentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListPage> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/agents/{agentId}`, but is otherwise the same
         * as [AgentService.delete].
         */
        @MustBeClosed
        fun delete(agentId: String): HttpResponse = delete(agentId, AgentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
        ): HttpResponse = delete(agentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AgentDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(agentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(agentId, AgentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/agents/voices`, but is otherwise the same as
         * [AgentService.listVoices].
         */
        @MustBeClosed
        fun listVoices(): HttpResponseFor<AgentListVoicesResponse> =
            listVoices(AgentListVoicesParams.none())

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(
            params: AgentListVoicesParams = AgentListVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListVoicesResponse>

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(
            params: AgentListVoicesParams = AgentListVoicesParams.none()
        ): HttpResponseFor<AgentListVoicesResponse> = listVoices(params, RequestOptions.none())

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(requestOptions: RequestOptions): HttpResponseFor<AgentListVoicesResponse> =
            listVoices(AgentListVoicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/agents/{agentId}/test`, but is otherwise the
         * same as [AgentService.test].
         */
        @MustBeClosed
        fun test(agentId: String, params: AgentTestParams): HttpResponseFor<AgentTestResponse> =
            test(agentId, params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            agentId: String,
            params: AgentTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentTestResponse> =
            test(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(params: AgentTestParams): HttpResponseFor<AgentTestResponse> =
            test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: AgentTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentTestResponse>
    }
}
