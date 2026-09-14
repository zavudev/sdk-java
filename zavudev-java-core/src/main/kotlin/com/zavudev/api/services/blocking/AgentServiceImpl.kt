// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

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
import com.zavudev.api.models.agents.AgentCreateParams
import com.zavudev.api.models.agents.AgentCreateResponse
import com.zavudev.api.models.agents.AgentDeleteParams
import com.zavudev.api.models.agents.AgentListPage
import com.zavudev.api.models.agents.AgentListPageResponse
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
import com.zavudev.api.services.blocking.agents.SenderServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentService {

    private val withRawResponse: AgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val senders: SenderService by lazy { SenderServiceImpl(clientOptions) }

    override fun withRawResponse(): AgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService =
        AgentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun senders(): SenderService = senders

    override fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): AgentCreateResponse =
        // post /v1/agents
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions,
    ): AgentRetrieveResponse =
        // get /v1/agents/{agentId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions,
    ): AgentUpdateResponse =
        // patch /v1/agents/{agentId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AgentListParams, requestOptions: RequestOptions): AgentListPage =
        // get /v1/agents
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/agents/{agentId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listVoices(
        params: AgentListVoicesParams,
        requestOptions: RequestOptions,
    ): AgentListVoicesResponse =
        // get /v1/agents/voices
        withRawResponse().listVoices(params, requestOptions).parse()

    override fun test(params: AgentTestParams, requestOptions: RequestOptions): AgentTestResponse =
        // post /v1/agents/{agentId}/test
        withRawResponse().test(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val senders: SenderService.WithRawResponse by lazy {
            SenderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentService.WithRawResponse =
            AgentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun senders(): SenderService.WithRawResponse = senders

        private val createHandler: Handler<AgentCreateResponse> =
            jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agents")
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

        private val retrieveHandler: Handler<AgentRetrieveResponse> =
            jsonHandler<AgentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agents", params._pathParam(0))
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

        private val updateHandler: Handler<AgentUpdateResponse> =
            jsonHandler<AgentUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agents", params._pathParam(0))
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

        private val listHandler: Handler<AgentListPageResponse> =
            jsonHandler<AgentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AgentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agents")
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
                        AgentListPage.builder()
                            .service(AgentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agents", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listVoicesHandler: Handler<AgentListVoicesResponse> =
            jsonHandler<AgentListVoicesResponse>(clientOptions.jsonMapper)

        override fun listVoices(
            params: AgentListVoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentListVoicesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agents", "voices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listVoicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val testHandler: Handler<AgentTestResponse> =
            jsonHandler<AgentTestResponse>(clientOptions.jsonMapper)

        override fun test(
            params: AgentTestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentTestResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agents", params._pathParam(0), "test")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { testHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
