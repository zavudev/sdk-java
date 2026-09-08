// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders

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
import com.zavudev.api.models.senders.telegram.TelegramConnectParams
import com.zavudev.api.models.senders.telegram.TelegramConnectResponse
import com.zavudev.api.models.senders.telegram.TelegramDisconnectParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TelegramServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TelegramService {

    private val withRawResponse: TelegramService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TelegramService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramService =
        TelegramServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun connect(
        params: TelegramConnectParams,
        requestOptions: RequestOptions,
    ): TelegramConnectResponse =
        // post /v1/senders/{senderId}/telegram
        withRawResponse().connect(params, requestOptions).parse()

    override fun disconnect(params: TelegramDisconnectParams, requestOptions: RequestOptions) {
        // delete /v1/senders/{senderId}/telegram
        withRawResponse().disconnect(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelegramService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelegramService.WithRawResponse =
            TelegramServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val connectHandler: Handler<TelegramConnectResponse> =
            jsonHandler<TelegramConnectResponse>(clientOptions.jsonMapper)

        override fun connect(
            params: TelegramConnectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelegramConnectResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "telegram")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { connectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val disconnectHandler: Handler<Void?> = emptyHandler()

        override fun disconnect(
            params: TelegramDisconnectParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "telegram")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { disconnectHandler.handle(it) }
            }
        }
    }
}
