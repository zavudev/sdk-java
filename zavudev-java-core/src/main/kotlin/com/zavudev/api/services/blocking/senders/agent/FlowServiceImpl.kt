// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent

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
import com.zavudev.api.core.prepare
import com.zavudev.api.models.senders.agent.flows.FlowCreateParams
import com.zavudev.api.models.senders.agent.flows.FlowCreateResponse
import com.zavudev.api.models.senders.agent.flows.FlowDeleteParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateResponse
import com.zavudev.api.models.senders.agent.flows.FlowListPage
import com.zavudev.api.models.senders.agent.flows.FlowListPageResponse
import com.zavudev.api.models.senders.agent.flows.FlowListParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveResponse
import com.zavudev.api.models.senders.agent.flows.FlowUpdateParams
import com.zavudev.api.models.senders.agent.flows.FlowUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FlowServiceImpl internal constructor(private val clientOptions: ClientOptions) : FlowService {

    private val withRawResponse: FlowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FlowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FlowService =
        FlowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FlowCreateParams,
        requestOptions: RequestOptions,
    ): FlowCreateResponse =
        // post /v1/senders/{senderId}/agent/flows
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FlowRetrieveParams,
        requestOptions: RequestOptions,
    ): FlowRetrieveResponse =
        // get /v1/senders/{senderId}/agent/flows/{flowId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: FlowUpdateParams,
        requestOptions: RequestOptions,
    ): FlowUpdateResponse =
        // patch /v1/senders/{senderId}/agent/flows/{flowId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: FlowListParams, requestOptions: RequestOptions): FlowListPage =
        // get /v1/senders/{senderId}/agent/flows
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: FlowDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/senders/{senderId}/agent/flows/{flowId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun duplicate(
        params: FlowDuplicateParams,
        requestOptions: RequestOptions,
    ): FlowDuplicateResponse =
        // post /v1/senders/{senderId}/agent/flows/{flowId}/duplicate
        withRawResponse().duplicate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FlowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FlowService.WithRawResponse =
            FlowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FlowCreateResponse> =
            jsonHandler<FlowCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FlowCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlowCreateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<FlowRetrieveResponse> =
            jsonHandler<FlowRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FlowRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlowRetrieveResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<FlowUpdateResponse> =
            jsonHandler<FlowUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FlowUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlowUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<FlowListPageResponse> =
            jsonHandler<FlowListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FlowListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlowListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "agent", "flows")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        FlowListPage.builder()
                            .service(FlowServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FlowDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val duplicateHandler: Handler<FlowDuplicateResponse> =
            jsonHandler<FlowDuplicateResponse>(clientOptions.jsonMapper)

        override fun duplicate(
            params: FlowDuplicateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FlowDuplicateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
