// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

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
import com.zavudev.api.core.prepareAsync
import com.zavudev.api.models.urls.UrlListVerifiedPageAsync
import com.zavudev.api.models.urls.UrlListVerifiedPageResponse
import com.zavudev.api.models.urls.UrlListVerifiedParams
import com.zavudev.api.models.urls.UrlRetrieveDetailsParams
import com.zavudev.api.models.urls.UrlRetrieveDetailsResponse
import com.zavudev.api.models.urls.UrlSubmitForVerificationParams
import com.zavudev.api.models.urls.UrlSubmitForVerificationResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UrlServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UrlServiceAsync {

    private val withRawResponse: UrlServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UrlServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlServiceAsync =
        UrlServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listVerified(
        params: UrlListVerifiedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlListVerifiedPageAsync> =
        // get /v1/urls
        withRawResponse().listVerified(params, requestOptions).thenApply { it.parse() }

    override fun retrieveDetails(
        params: UrlRetrieveDetailsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlRetrieveDetailsResponse> =
        // get /v1/urls/{urlId}
        withRawResponse().retrieveDetails(params, requestOptions).thenApply { it.parse() }

    override fun submitForVerification(
        params: UrlSubmitForVerificationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlSubmitForVerificationResponse> =
        // post /v1/urls
        withRawResponse().submitForVerification(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UrlServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UrlServiceAsync.WithRawResponse =
            UrlServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listVerifiedHandler: Handler<UrlListVerifiedPageResponse> =
            jsonHandler<UrlListVerifiedPageResponse>(clientOptions.jsonMapper)

        override fun listVerified(
            params: UrlListVerifiedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlListVerifiedPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "urls")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listVerifiedHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                UrlListVerifiedPageAsync.builder()
                                    .service(UrlServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveDetailsHandler: Handler<UrlRetrieveDetailsResponse> =
            jsonHandler<UrlRetrieveDetailsResponse>(clientOptions.jsonMapper)

        override fun retrieveDetails(
            params: UrlRetrieveDetailsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlRetrieveDetailsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("urlId", params.urlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "urls", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveDetailsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitForVerificationHandler: Handler<UrlSubmitForVerificationResponse> =
            jsonHandler<UrlSubmitForVerificationResponse>(clientOptions.jsonMapper)

        override fun submitForVerification(
            params: UrlSubmitForVerificationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlSubmitForVerificationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "urls")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitForVerificationHandler.handle(it) }
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
