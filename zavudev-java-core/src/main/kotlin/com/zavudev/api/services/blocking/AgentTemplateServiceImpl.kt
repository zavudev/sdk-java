// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.handlers.errorBodyHandler
import com.zavudev.api.core.handlers.errorHandler
import com.zavudev.api.core.handlers.jsonHandler
import com.zavudev.api.core.http.HttpMethod
import com.zavudev.api.core.http.HttpRequest
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponse.Handler
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.core.http.parseable
import com.zavudev.api.core.prepare
import com.zavudev.api.models.agenttemplates.AgentTemplateListParams
import com.zavudev.api.models.agenttemplates.AgentTemplateListResponse
import com.zavudev.api.models.agenttemplates.AgentTemplateRetrieveParams
import com.zavudev.api.models.agenttemplates.AgentTemplateRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AgentTemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentTemplateService {

    private val withRawResponse: AgentTemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgentTemplateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentTemplateService =
        AgentTemplateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AgentTemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): AgentTemplateRetrieveResponse =
        // get /v1/agent-templates/{templateId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AgentTemplateListParams,
        requestOptions: RequestOptions,
    ): AgentTemplateListResponse =
        // get /v1/agent-templates
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentTemplateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentTemplateService.WithRawResponse =
            AgentTemplateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AgentTemplateRetrieveResponse> =
            jsonHandler<AgentTemplateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AgentTemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentTemplateRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agent-templates", params._pathParam(0))
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

        private val listHandler: Handler<AgentTemplateListResponse> =
            jsonHandler<AgentTemplateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AgentTemplateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentTemplateListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agent-templates")
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
            }
        }
    }
}
