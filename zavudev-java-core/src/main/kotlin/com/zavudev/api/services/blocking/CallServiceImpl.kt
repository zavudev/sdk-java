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
import com.zavudev.api.core.http.json
import com.zavudev.api.core.http.parseable
import com.zavudev.api.core.prepare
import com.zavudev.api.models.calls.CallCreateParams
import com.zavudev.api.models.calls.CallCreateResponse
import com.zavudev.api.models.calls.CallHangupParams
import com.zavudev.api.models.calls.CallHangupResponse
import com.zavudev.api.models.calls.CallListPage
import com.zavudev.api.models.calls.CallListPageResponse
import com.zavudev.api.models.calls.CallListParams
import com.zavudev.api.models.calls.CallRetrieveParams
import com.zavudev.api.models.calls.CallRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallServiceImpl internal constructor(private val clientOptions: ClientOptions) : CallService {

    private val withRawResponse: CallService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService =
        CallServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CallCreateParams,
        requestOptions: RequestOptions,
    ): CallCreateResponse =
        // post /v1/calls
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions,
    ): CallRetrieveResponse =
        // get /v1/calls/{callId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: CallListParams, requestOptions: RequestOptions): CallListPage =
        // get /v1/calls
        withRawResponse().list(params, requestOptions).parse()

    override fun hangup(
        params: CallHangupParams,
        requestOptions: RequestOptions,
    ): CallHangupResponse =
        // post /v1/calls/{callId}/hangup
        withRawResponse().hangup(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallService.WithRawResponse =
            CallServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CallCreateResponse> =
            jsonHandler<CallCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CallCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "calls")
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

        private val retrieveHandler: Handler<CallRetrieveResponse> =
            jsonHandler<CallRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callId", params.callId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "calls", params._pathParam(0))
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

        private val listHandler: Handler<CallListPageResponse> =
            jsonHandler<CallListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CallListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "calls")
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
                        CallListPage.builder()
                            .service(CallServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val hangupHandler: Handler<CallHangupResponse> =
            jsonHandler<CallHangupResponse>(clientOptions.jsonMapper)

        override fun hangup(
            params: CallHangupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallHangupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callId", params.callId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "calls", params._pathParam(0), "hangup")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { hangupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
