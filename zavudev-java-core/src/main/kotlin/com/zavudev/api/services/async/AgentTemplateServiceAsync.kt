// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.agenttemplates.AgentTemplateListParams
import com.zavudev.api.models.agenttemplates.AgentTemplateListResponse
import com.zavudev.api.models.agenttemplates.AgentTemplateRetrieveParams
import com.zavudev.api.models.agenttemplates.AgentTemplateRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AgentTemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentTemplateServiceAsync

    /**
     * Fetch a single factory agent fully rendered: the function files to scaffold (an `index.ts`
     * that declares the agent with `defineAgent` and its skills with `defineTool`) plus the secrets
     * it needs. This is what `npx zavudev agents pull <id>` writes to disk before `npx zavudev
     * deploy`.
     */
    fun retrieve(templateId: String): CompletableFuture<AgentTemplateRetrieveResponse> =
        retrieve(templateId, AgentTemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: AgentTemplateRetrieveParams = AgentTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentTemplateRetrieveResponse> =
        retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: AgentTemplateRetrieveParams = AgentTemplateRetrieveParams.none(),
    ): CompletableFuture<AgentTemplateRetrieveResponse> =
        retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentTemplateRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: AgentTemplateRetrieveParams
    ): CompletableFuture<AgentTemplateRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentTemplateRetrieveResponse> =
        retrieve(templateId, AgentTemplateRetrieveParams.none(), requestOptions)

    /**
     * List the factory agents available to scaffold with `npx zavudev agents pull`. Each entry is a
     * ready-made voice or text agent (system prompt, skills, and — for voice agents — a co-located
     * voice config).
     */
    fun list(): CompletableFuture<AgentTemplateListResponse> = list(AgentTemplateListParams.none())

    /** @see list */
    fun list(
        params: AgentTemplateListParams = AgentTemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentTemplateListResponse>

    /** @see list */
    fun list(
        params: AgentTemplateListParams = AgentTemplateListParams.none()
    ): CompletableFuture<AgentTemplateListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgentTemplateListResponse> =
        list(AgentTemplateListParams.none(), requestOptions)

    /**
     * A view of [AgentTemplateServiceAsync] that provides access to raw HTTP responses for each
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
        ): AgentTemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/agent-templates/{templateId}`, but is otherwise
         * the same as [AgentTemplateServiceAsync.retrieve].
         */
        fun retrieve(
            templateId: String
        ): CompletableFuture<HttpResponseFor<AgentTemplateRetrieveResponse>> =
            retrieve(templateId, AgentTemplateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: AgentTemplateRetrieveParams = AgentTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentTemplateRetrieveResponse>> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: AgentTemplateRetrieveParams = AgentTemplateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentTemplateRetrieveResponse>> =
            retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgentTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentTemplateRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AgentTemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgentTemplateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentTemplateRetrieveResponse>> =
            retrieve(templateId, AgentTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/agent-templates`, but is otherwise the same as
         * [AgentTemplateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AgentTemplateListResponse>> =
            list(AgentTemplateListParams.none())

        /** @see list */
        fun list(
            params: AgentTemplateListParams = AgentTemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentTemplateListResponse>>

        /** @see list */
        fun list(
            params: AgentTemplateListParams = AgentTemplateListParams.none()
        ): CompletableFuture<HttpResponseFor<AgentTemplateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgentTemplateListResponse>> =
            list(AgentTemplateListParams.none(), requestOptions)
    }
}
