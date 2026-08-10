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
import com.zavudev.api.models.functions.FunctionCreateParams
import com.zavudev.api.models.functions.FunctionCreateResponse
import com.zavudev.api.models.functions.FunctionDeleteParams
import com.zavudev.api.models.functions.FunctionDeleteResponse
import com.zavudev.api.models.functions.FunctionDeployParams
import com.zavudev.api.models.functions.FunctionDeployResponse
import com.zavudev.api.models.functions.FunctionGetDeploymentParams
import com.zavudev.api.models.functions.FunctionGetDeploymentResponse
import com.zavudev.api.models.functions.FunctionRetrieveParams
import com.zavudev.api.models.functions.FunctionRetrieveResponse
import com.zavudev.api.models.functions.FunctionTailLogsParams
import com.zavudev.api.models.functions.FunctionTailLogsResponse
import com.zavudev.api.models.functions.FunctionUpdateParams
import com.zavudev.api.models.functions.FunctionUpdateResponse
import com.zavudev.api.services.async.functions.SecretServiceAsync
import com.zavudev.api.services.async.functions.SecretServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FunctionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FunctionServiceAsync {

    private val withRawResponse: FunctionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val secrets: SecretServiceAsync by lazy { SecretServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FunctionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionServiceAsync =
        FunctionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun secrets(): SecretServiceAsync = secrets

    override fun create(
        params: FunctionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionCreateResponse> =
        // post /v1/functions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FunctionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionRetrieveResponse> =
        // get /v1/functions/{functionId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FunctionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionUpdateResponse> =
        // patch /v1/functions/{functionId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FunctionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionDeleteResponse> =
        // delete /v1/functions/{functionId}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun deploy(
        params: FunctionDeployParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionDeployResponse> =
        // post /v1/functions/{functionId}/deploy
        withRawResponse().deploy(params, requestOptions).thenApply { it.parse() }

    override fun getDeployment(
        params: FunctionGetDeploymentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionGetDeploymentResponse> =
        // get /v1/functions/deployments/{deploymentId}
        withRawResponse().getDeployment(params, requestOptions).thenApply { it.parse() }

    override fun tailLogs(
        params: FunctionTailLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionTailLogsResponse> =
        // get /v1/functions/{functionId}/logs
        withRawResponse().tailLogs(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FunctionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val secrets: SecretServiceAsync.WithRawResponse by lazy {
            SecretServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionServiceAsync.WithRawResponse =
            FunctionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun secrets(): SecretServiceAsync.WithRawResponse = secrets

        private val createHandler: Handler<FunctionCreateResponse> =
            jsonHandler<FunctionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FunctionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions")
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

        private val retrieveHandler: Handler<FunctionRetrieveResponse> =
            jsonHandler<FunctionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FunctionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", params._pathParam(0))
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

        private val updateHandler: Handler<FunctionUpdateResponse> =
            jsonHandler<FunctionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FunctionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", params._pathParam(0))
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

        private val deleteHandler: Handler<FunctionDeleteResponse> =
            jsonHandler<FunctionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deployHandler: Handler<FunctionDeployResponse> =
            jsonHandler<FunctionDeployResponse>(clientOptions.jsonMapper)

        override fun deploy(
            params: FunctionDeployParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionDeployResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", params._pathParam(0), "deploy")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deployHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDeploymentHandler: Handler<FunctionGetDeploymentResponse> =
            jsonHandler<FunctionGetDeploymentResponse>(clientOptions.jsonMapper)

        override fun getDeployment(
            params: FunctionGetDeploymentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionGetDeploymentResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("deploymentId", params.deploymentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", "deployments", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDeploymentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val tailLogsHandler: Handler<FunctionTailLogsResponse> =
            jsonHandler<FunctionTailLogsResponse>(clientOptions.jsonMapper)

        override fun tailLogs(
            params: FunctionTailLogsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionTailLogsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "functions", params._pathParam(0), "logs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { tailLogsHandler.handle(it) }
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
