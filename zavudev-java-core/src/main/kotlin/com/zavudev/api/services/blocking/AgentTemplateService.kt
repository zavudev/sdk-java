// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.agenttemplates.AgentTemplateListParams
import com.zavudev.api.models.agenttemplates.AgentTemplateListResponse
import com.zavudev.api.models.agenttemplates.AgentTemplateRetrieveParams
import com.zavudev.api.models.agenttemplates.AgentTemplateRetrieveResponse
import java.util.function.Consumer

interface AgentTemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentTemplateService

    /**
     * Fetch a single factory agent fully rendered: the function files to scaffold (an `index.ts`
     * that declares the agent with `defineAgent` and its skills with `defineTool`) plus the secrets
     * it needs. This is what `npx zavudev agents pull <id>` writes to disk before `npx zavudev
     * deploy`.
     */
    fun retrieve(templateId: String): AgentTemplateRetrieveResponse =
        retrieve(templateId, AgentTemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: AgentTemplateRetrieveParams = AgentTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentTemplateRetrieveResponse =
        retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: AgentTemplateRetrieveParams = AgentTemplateRetrieveParams.none(),
    ): AgentTemplateRetrieveResponse = retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentTemplateRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AgentTemplateRetrieveParams): AgentTemplateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        requestOptions: RequestOptions,
    ): AgentTemplateRetrieveResponse =
        retrieve(templateId, AgentTemplateRetrieveParams.none(), requestOptions)

    /**
     * List the factory agents available to scaffold with `npx zavudev agents pull`. Each entry is a
     * ready-made voice or text agent (system prompt, skills, and — for voice agents — a co-located
     * voice config).
     */
    fun list(): AgentTemplateListResponse = list(AgentTemplateListParams.none())

    /** @see list */
    fun list(
        params: AgentTemplateListParams = AgentTemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentTemplateListResponse

    /** @see list */
    fun list(
        params: AgentTemplateListParams = AgentTemplateListParams.none()
    ): AgentTemplateListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentTemplateListResponse =
        list(AgentTemplateListParams.none(), requestOptions)

    /**
     * A view of [AgentTemplateService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentTemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/agent-templates/{templateId}`, but is otherwise
         * the same as [AgentTemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(templateId: String): HttpResponseFor<AgentTemplateRetrieveResponse> =
            retrieve(templateId, AgentTemplateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: AgentTemplateRetrieveParams = AgentTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentTemplateRetrieveResponse> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: AgentTemplateRetrieveParams = AgentTemplateRetrieveParams.none(),
        ): HttpResponseFor<AgentTemplateRetrieveResponse> =
            retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentTemplateRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentTemplateRetrieveParams
        ): HttpResponseFor<AgentTemplateRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentTemplateRetrieveResponse> =
            retrieve(templateId, AgentTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/agent-templates`, but is otherwise the same as
         * [AgentTemplateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AgentTemplateListResponse> =
            list(AgentTemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentTemplateListParams = AgentTemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentTemplateListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentTemplateListParams = AgentTemplateListParams.none()
        ): HttpResponseFor<AgentTemplateListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentTemplateListResponse> =
            list(AgentTemplateListParams.none(), requestOptions)
    }
}
