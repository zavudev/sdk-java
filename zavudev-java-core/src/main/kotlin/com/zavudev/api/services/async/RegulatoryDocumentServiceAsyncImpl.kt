// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

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
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentDeleteParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListPageAsync
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListPageResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentRetrieveParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentRetrieveResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentUploadUrlParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentUploadUrlResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RegulatoryDocumentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RegulatoryDocumentServiceAsync {

    private val withRawResponse: RegulatoryDocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegulatoryDocumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RegulatoryDocumentServiceAsync =
        RegulatoryDocumentServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: RegulatoryDocumentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RegulatoryDocumentCreateResponse> =
        // post /v1/documents
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RegulatoryDocumentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RegulatoryDocumentRetrieveResponse> =
        // get /v1/documents/{documentId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RegulatoryDocumentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RegulatoryDocumentListPageAsync> =
        // get /v1/documents
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RegulatoryDocumentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/documents/{documentId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun uploadUrl(
        params: RegulatoryDocumentUploadUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RegulatoryDocumentUploadUrlResponse> =
        // post /v1/documents/upload-url
        withRawResponse().uploadUrl(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegulatoryDocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegulatoryDocumentServiceAsync.WithRawResponse =
            RegulatoryDocumentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RegulatoryDocumentCreateResponse> =
            jsonHandler<RegulatoryDocumentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RegulatoryDocumentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents")
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

        private val retrieveHandler: Handler<RegulatoryDocumentRetrieveResponse> =
            jsonHandler<RegulatoryDocumentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RegulatoryDocumentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents", params._pathParam(0))
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

        private val listHandler: Handler<RegulatoryDocumentListPageResponse> =
            jsonHandler<RegulatoryDocumentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RegulatoryDocumentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents")
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
                                RegulatoryDocumentListPageAsync.builder()
                                    .service(RegulatoryDocumentServiceAsyncImpl(clientOptions))
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
            params: RegulatoryDocumentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents", params._pathParam(0))
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

        private val uploadUrlHandler: Handler<RegulatoryDocumentUploadUrlResponse> =
            jsonHandler<RegulatoryDocumentUploadUrlResponse>(clientOptions.jsonMapper)

        override fun uploadUrl(
            params: RegulatoryDocumentUploadUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RegulatoryDocumentUploadUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents", "upload-url")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadUrlHandler.handle(it) }
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
