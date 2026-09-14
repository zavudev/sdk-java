// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.functions

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
import com.zavudev.api.models.functions.triggers.TriggerCreateParams
import com.zavudev.api.models.functions.triggers.TriggerCreateResponse
import com.zavudev.api.models.functions.triggers.TriggerDeleteParams
import com.zavudev.api.models.functions.triggers.TriggerListParams
import com.zavudev.api.models.functions.triggers.TriggerListResponse
import com.zavudev.api.models.functions.triggers.TriggerUpdateParams
import com.zavudev.api.models.functions.triggers.TriggerUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TriggerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TriggerService {

    private val withRawResponse: TriggerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TriggerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerService =
        TriggerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TriggerCreateParams,
        requestOptions: RequestOptions,
    ): TriggerCreateResponse =
        // post /v1/functions/{functionId}/triggers
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: TriggerUpdateParams,
        requestOptions: RequestOptions,
    ): TriggerUpdateResponse =
        // patch /v1/functions/triggers/{triggerId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TriggerListParams,
        requestOptions: RequestOptions,
    ): TriggerListResponse =
        // get /v1/functions/{functionId}/triggers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TriggerDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/functions/triggers/{triggerId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TriggerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TriggerService.WithRawResponse =
            TriggerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TriggerCreateResponse> =
            jsonHandler<TriggerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TriggerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TriggerCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", params._pathParam(0), "triggers")
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

        private val updateHandler: Handler<TriggerUpdateResponse> =
            jsonHandler<TriggerUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TriggerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TriggerUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("triggerId", params.triggerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", "triggers", params._pathParam(0))
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

        private val listHandler: Handler<TriggerListResponse> =
            jsonHandler<TriggerListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TriggerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TriggerListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", params._pathParam(0), "triggers")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TriggerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("triggerId", params.triggerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", "triggers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
