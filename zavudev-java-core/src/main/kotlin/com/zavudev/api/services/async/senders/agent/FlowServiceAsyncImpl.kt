// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.handlers.emptyHandler
import com.zavudev.api.core.handlers.errorBodyHandler
import com.zavudev.api.core.handlers.errorHandler
import com.zavudev.api.core.handlers.jsonHandler
import com.zavudev.api.core.http.HttpMethod
import com.zavudev.api.core.http.HttpRequest
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponse.Handler
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.core.http.json
import com.zavudev.api.core.http.parseable
import com.zavudev.api.core.prepareAsync
import com.zavudev.api.models.senders.agent.flows.FlowCreateParams
import com.zavudev.api.models.senders.agent.flows.FlowCreateResponse
import com.zavudev.api.models.senders.agent.flows.FlowDeleteParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateResponse
import com.zavudev.api.models.senders.agent.flows.FlowListPageAsync
import com.zavudev.api.models.senders.agent.flows.FlowListPageResponse
import com.zavudev.api.models.senders.agent.flows.FlowListParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveResponse
import com.zavudev.api.models.senders.agent.flows.FlowUpdateParams
import com.zavudev.api.models.senders.agent.flows.FlowUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FlowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FlowServiceAsync {

    private val withRawResponse: FlowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FlowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlowServiceAsync =
        FlowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FlowCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FlowCreateResponse> =
        // post /v1/senders/{senderId}/agent/flows
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FlowRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FlowRetrieveResponse> =
        // get /v1/senders/{senderId}/agent/flows/{flowId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FlowUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FlowUpdateResponse> =
        // patch /v1/senders/{senderId}/agent/flows/{flowId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FlowListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FlowListPageAsync> =
        // get /v1/senders/{senderId}/agent/flows
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FlowDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/senders/{senderId}/agent/flows/{flowId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun duplicate(
        params: FlowDuplicateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FlowDuplicateResponse> =
        // post /v1/senders/{senderId}/agent/flows/{flowId}/duplicate
        withRawResponse().duplicate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FlowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FlowServiceAsync.WithRawResponse =
            FlowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FlowCreateResponse> =
            jsonHandler<FlowCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FlowCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlowCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "agent", "flows")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<FlowRetrieveResponse> =
            jsonHandler<FlowRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FlowRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlowRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flowId", params.flowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "flows",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<FlowUpdateResponse> =
            jsonHandler<FlowUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FlowUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlowUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flowId", params.flowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "flows",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<FlowListPageResponse> =
            jsonHandler<FlowListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FlowListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlowListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "agent", "flows")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                FlowListPageAsync.builder()
                                    .service(FlowServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FlowDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flowId", params.flowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "flows",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val duplicateHandler: Handler<FlowDuplicateResponse> =
            jsonHandler<FlowDuplicateResponse>(clientOptions.jsonMapper)

        override fun duplicate(
            params: FlowDuplicateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlowDuplicateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flowId", params.flowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "flows",
                        params._pathParam(1),
                        "duplicate",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { duplicateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
