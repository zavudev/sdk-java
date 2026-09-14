// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders

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
import com.zavudev.api.models.senders.telegram.TelegramConnectParams
import com.zavudev.api.models.senders.telegram.TelegramConnectResponse
import com.zavudev.api.models.senders.telegram.TelegramDisconnectParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TelegramServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TelegramServiceAsync {

    private val withRawResponse: TelegramServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TelegramServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramServiceAsync =
        TelegramServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun connect(
        params: TelegramConnectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelegramConnectResponse> =
        // post /v1/senders/{senderId}/telegram
        withRawResponse().connect(params, requestOptions).thenApply { it.parse() }

    override fun disconnect(
        params: TelegramDisconnectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/senders/{senderId}/telegram
        withRawResponse().disconnect(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelegramServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelegramServiceAsync.WithRawResponse =
            TelegramServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val connectHandler: Handler<TelegramConnectResponse> =
            jsonHandler<TelegramConnectResponse>(clientOptions.jsonMapper)

        override fun connect(
            params: TelegramConnectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelegramConnectResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { connectHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val disconnectHandler: Handler<Void?> = emptyHandler()

        override fun disconnect(
            params: TelegramDisconnectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { disconnectHandler.handle(it) }
                    }
                }
        }
    }
}
