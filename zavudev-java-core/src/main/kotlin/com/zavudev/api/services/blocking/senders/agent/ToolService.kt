// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.tools.ToolCreateParams
import com.zavudev.api.models.senders.agent.tools.ToolCreateResponse
import com.zavudev.api.models.senders.agent.tools.ToolDeleteParams
import com.zavudev.api.models.senders.agent.tools.ToolListPage
import com.zavudev.api.models.senders.agent.tools.ToolListParams
import com.zavudev.api.models.senders.agent.tools.ToolListTestRunsParams
import com.zavudev.api.models.senders.agent.tools.ToolListTestRunsResponse
import com.zavudev.api.models.senders.agent.tools.ToolRetrieveParams
import com.zavudev.api.models.senders.agent.tools.ToolRetrieveResponse
import com.zavudev.api.models.senders.agent.tools.ToolTestParams
import com.zavudev.api.models.senders.agent.tools.ToolTestResponse
import com.zavudev.api.models.senders.agent.tools.ToolUpdateParams
import com.zavudev.api.models.senders.agent.tools.ToolUpdateResponse
import com.zavudev.api.services.blocking.senders.agent.tools.WebhookService
import java.util.function.Consumer

interface ToolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService

    fun webhook(): WebhookService

    /** Create a new tool for an agent. Tools allow the agent to call external webhooks. */
    fun create(senderId: String, params: ToolCreateParams): ToolCreateResponse =
        create(senderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        senderId: String,
        params: ToolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolCreateResponse = create(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see create */
    fun create(params: ToolCreateParams): ToolCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ToolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolCreateResponse

    /** Get a specific tool. */
    fun retrieve(toolId: String, params: ToolRetrieveParams): ToolRetrieveResponse =
        retrieve(toolId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        toolId: String,
        params: ToolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolRetrieveResponse = retrieve(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ToolRetrieveParams): ToolRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ToolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolRetrieveResponse

    /** Update a tool. */
    fun update(toolId: String, params: ToolUpdateParams): ToolUpdateResponse =
        update(toolId, params, RequestOptions.none())

    /** @see update */
    fun update(
        toolId: String,
        params: ToolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolUpdateResponse = update(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see update */
    fun update(params: ToolUpdateParams): ToolUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ToolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolUpdateResponse

    /** List tools for an agent. */
    fun list(senderId: String): ToolListPage = list(senderId, ToolListParams.none())

    /** @see list */
    fun list(
        senderId: String,
        params: ToolListParams = ToolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListPage = list(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see list */
    fun list(senderId: String, params: ToolListParams = ToolListParams.none()): ToolListPage =
        list(senderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ToolListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListPage

    /** @see list */
    fun list(params: ToolListParams): ToolListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(senderId: String, requestOptions: RequestOptions): ToolListPage =
        list(senderId, ToolListParams.none(), requestOptions)

    /** Delete a tool. */
    fun delete(toolId: String, params: ToolDeleteParams) =
        delete(toolId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toolId: String,
        params: ToolDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ToolDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ToolDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Recent runs of this tool triggered from the test endpoint, newest first. Covers manual tests
     * only: a tool called by an agent during a real conversation is not recorded here.
     */
    fun listTestRuns(toolId: String, params: ToolListTestRunsParams): ToolListTestRunsResponse =
        listTestRuns(toolId, params, RequestOptions.none())

    /** @see listTestRuns */
    fun listTestRuns(
        toolId: String,
        params: ToolListTestRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListTestRunsResponse =
        listTestRuns(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see listTestRuns */
    fun listTestRuns(params: ToolListTestRunsParams): ToolListTestRunsResponse =
        listTestRuns(params, RequestOptions.none())

    /** @see listTestRuns */
    fun listTestRuns(
        params: ToolListTestRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListTestRunsResponse

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
    fun test(toolId: String, params: ToolTestParams): ToolTestResponse =
        test(toolId, params, RequestOptions.none())

    /** @see test */
    fun test(
        toolId: String,
        params: ToolTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolTestResponse = test(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see test */
    fun test(params: ToolTestParams): ToolTestResponse = test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: ToolTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolTestResponse

    /** A view of [ToolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService.WithRawResponse

        fun webhook(): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent/tools`, but is
         * otherwise the same as [ToolService.create].
         */
        @MustBeClosed
        fun create(
            senderId: String,
            params: ToolCreateParams,
        ): HttpResponseFor<ToolCreateResponse> = create(senderId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            senderId: String,
            params: ToolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolCreateResponse> =
            create(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ToolCreateParams): HttpResponseFor<ToolCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ToolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/tools/{toolId}`, but is
         * otherwise the same as [ToolService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            toolId: String,
            params: ToolRetrieveParams,
        ): HttpResponseFor<ToolRetrieveResponse> = retrieve(toolId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            toolId: String,
            params: ToolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolRetrieveResponse> =
            retrieve(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ToolRetrieveParams): HttpResponseFor<ToolRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ToolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}/agent/tools/{toolId}`, but
         * is otherwise the same as [ToolService.update].
         */
        @MustBeClosed
        fun update(toolId: String, params: ToolUpdateParams): HttpResponseFor<ToolUpdateResponse> =
            update(toolId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            toolId: String,
            params: ToolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolUpdateResponse> =
            update(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ToolUpdateParams): HttpResponseFor<ToolUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ToolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/tools`, but is
         * otherwise the same as [ToolService.list].
         */
        @MustBeClosed
        fun list(senderId: String): HttpResponseFor<ToolListPage> =
            list(senderId, ToolListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            senderId: String,
            params: ToolListParams = ToolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListPage> =
            list(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            senderId: String,
            params: ToolListParams = ToolListParams.none(),
        ): HttpResponseFor<ToolListPage> = list(senderId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ToolListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ToolListParams): HttpResponseFor<ToolListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(senderId: String, requestOptions: RequestOptions): HttpResponseFor<ToolListPage> =
            list(senderId, ToolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}/agent/tools/{toolId}`, but
         * is otherwise the same as [ToolService.delete].
         */
        @MustBeClosed
        fun delete(toolId: String, params: ToolDeleteParams): HttpResponse =
            delete(toolId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            toolId: String,
            params: ToolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ToolDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ToolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/senders/{senderId}/agent/tools/{toolId}/test-runs`, but is otherwise the same as
         * [ToolService.listTestRuns].
         */
        @MustBeClosed
        fun listTestRuns(
            toolId: String,
            params: ToolListTestRunsParams,
        ): HttpResponseFor<ToolListTestRunsResponse> =
            listTestRuns(toolId, params, RequestOptions.none())

        /** @see listTestRuns */
        @MustBeClosed
        fun listTestRuns(
            toolId: String,
            params: ToolListTestRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListTestRunsResponse> =
            listTestRuns(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see listTestRuns */
        @MustBeClosed
        fun listTestRuns(
            params: ToolListTestRunsParams
        ): HttpResponseFor<ToolListTestRunsResponse> = listTestRuns(params, RequestOptions.none())

        /** @see listTestRuns */
        @MustBeClosed
        fun listTestRuns(
            params: ToolListTestRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListTestRunsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent/tools/{toolId}/test`,
         * but is otherwise the same as [ToolService.test].
         */
        @MustBeClosed
        fun test(toolId: String, params: ToolTestParams): HttpResponseFor<ToolTestResponse> =
            test(toolId, params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            toolId: String,
            params: ToolTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolTestResponse> =
            test(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(params: ToolTestParams): HttpResponseFor<ToolTestResponse> =
            test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: ToolTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolTestResponse>
    }
}
