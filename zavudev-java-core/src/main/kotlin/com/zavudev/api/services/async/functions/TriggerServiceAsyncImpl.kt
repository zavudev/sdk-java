// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.functions

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
import com.zavudev.api.models.functions.triggers.TriggerCreateParams
import com.zavudev.api.models.functions.triggers.TriggerCreateResponse
import com.zavudev.api.models.functions.triggers.TriggerDeleteParams
import com.zavudev.api.models.functions.triggers.TriggerListParams
import com.zavudev.api.models.functions.triggers.TriggerListResponse
import com.zavudev.api.models.functions.triggers.TriggerUpdateParams
import com.zavudev.api.models.functions.triggers.TriggerUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TriggerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TriggerServiceAsync {

    private val withRawResponse: TriggerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TriggerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerServiceAsync =
        TriggerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TriggerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TriggerCreateResponse> =
        // post /v1/functions/{functionId}/triggers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TriggerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TriggerUpdateResponse> =
        // patch /v1/functions/triggers/{triggerId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TriggerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TriggerListResponse> =
        // get /v1/functions/{functionId}/triggers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TriggerDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/functions/triggers/{triggerId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TriggerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TriggerServiceAsync.WithRawResponse =
            TriggerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TriggerCreateResponse> =
            jsonHandler<TriggerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TriggerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> {
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

        private val updateHandler: Handler<TriggerUpdateResponse> =
            jsonHandler<TriggerUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TriggerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TriggerUpdateResponse>> {
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

        private val listHandler: Handler<TriggerListResponse> =
            jsonHandler<TriggerListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TriggerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TriggerListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", params._pathParam(0), "triggers")
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
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TriggerDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
    }
}
