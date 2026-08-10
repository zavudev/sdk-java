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
import com.zavudev.api.models.broadcasts.BroadcastCancelParams
import com.zavudev.api.models.broadcasts.BroadcastCancelResponse
import com.zavudev.api.models.broadcasts.BroadcastCreateParams
import com.zavudev.api.models.broadcasts.BroadcastCreateResponse
import com.zavudev.api.models.broadcasts.BroadcastDeleteParams
import com.zavudev.api.models.broadcasts.BroadcastEscalateReviewParams
import com.zavudev.api.models.broadcasts.BroadcastEscalateReviewResponse
import com.zavudev.api.models.broadcasts.BroadcastListPageAsync
import com.zavudev.api.models.broadcasts.BroadcastListPageResponse
import com.zavudev.api.models.broadcasts.BroadcastListParams
import com.zavudev.api.models.broadcasts.BroadcastProgress
import com.zavudev.api.models.broadcasts.BroadcastProgressParams
import com.zavudev.api.models.broadcasts.BroadcastRescheduleParams
import com.zavudev.api.models.broadcasts.BroadcastRescheduleResponse
import com.zavudev.api.models.broadcasts.BroadcastRetrieveParams
import com.zavudev.api.models.broadcasts.BroadcastRetrieveResponse
import com.zavudev.api.models.broadcasts.BroadcastRetryReviewParams
import com.zavudev.api.models.broadcasts.BroadcastRetryReviewResponse
import com.zavudev.api.models.broadcasts.BroadcastSendParams
import com.zavudev.api.models.broadcasts.BroadcastSendResponse
import com.zavudev.api.models.broadcasts.BroadcastUpdateParams
import com.zavudev.api.models.broadcasts.BroadcastUpdateResponse
import com.zavudev.api.services.async.broadcasts.ContactServiceAsync
import com.zavudev.api.services.async.broadcasts.ContactServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BroadcastServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BroadcastServiceAsync {

    private val withRawResponse: BroadcastServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contacts: ContactServiceAsync by lazy { ContactServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BroadcastServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastServiceAsync =
        BroadcastServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun contacts(): ContactServiceAsync = contacts

    override fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastCreateResponse> =
        // post /v1/broadcasts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastRetrieveResponse> =
        // get /v1/broadcasts/{broadcastId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastUpdateResponse> =
        // patch /v1/broadcasts/{broadcastId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BroadcastListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastListPageAsync> =
        // get /v1/broadcasts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BroadcastDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/broadcasts/{broadcastId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun cancel(
        params: BroadcastCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastCancelResponse> =
        // post /v1/broadcasts/{broadcastId}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun escalateReview(
        params: BroadcastEscalateReviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastEscalateReviewResponse> =
        // post /v1/broadcasts/{broadcastId}/escalate
        withRawResponse().escalateReview(params, requestOptions).thenApply { it.parse() }

    override fun progress(
        params: BroadcastProgressParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastProgress> =
        // get /v1/broadcasts/{broadcastId}/progress
        withRawResponse().progress(params, requestOptions).thenApply { it.parse() }

    override fun reschedule(
        params: BroadcastRescheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastRescheduleResponse> =
        // patch /v1/broadcasts/{broadcastId}/schedule
        withRawResponse().reschedule(params, requestOptions).thenApply { it.parse() }

    override fun retryReview(
        params: BroadcastRetryReviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastRetryReviewResponse> =
        // post /v1/broadcasts/{broadcastId}/retry-review
        withRawResponse().retryReview(params, requestOptions).thenApply { it.parse() }

    override fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastSendResponse> =
        // post /v1/broadcasts/{broadcastId}/send
        withRawResponse().send(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BroadcastServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val contacts: ContactServiceAsync.WithRawResponse by lazy {
            ContactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastServiceAsync.WithRawResponse =
            BroadcastServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun contacts(): ContactServiceAsync.WithRawResponse = contacts

        private val createHandler: Handler<BroadcastCreateResponse> =
            jsonHandler<BroadcastCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts")
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

        private val retrieveHandler: Handler<BroadcastRetrieveResponse> =
            jsonHandler<BroadcastRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0))
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

        private val updateHandler: Handler<BroadcastUpdateResponse> =
            jsonHandler<BroadcastUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0))
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

        private val listHandler: Handler<BroadcastListPageResponse> =
            jsonHandler<BroadcastListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BroadcastListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts")
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
                                BroadcastListPageAsync.builder()
                                    .service(BroadcastServiceAsyncImpl(clientOptions))
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
            params: BroadcastDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0))
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

        private val cancelHandler: Handler<BroadcastCancelResponse> =
            jsonHandler<BroadcastCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: BroadcastCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastCancelResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val escalateReviewHandler: Handler<BroadcastEscalateReviewResponse> =
            jsonHandler<BroadcastEscalateReviewResponse>(clientOptions.jsonMapper)

        override fun escalateReview(
            params: BroadcastEscalateReviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastEscalateReviewResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0), "escalate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { escalateReviewHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val progressHandler: Handler<BroadcastProgress> =
            jsonHandler<BroadcastProgress>(clientOptions.jsonMapper)

        override fun progress(
            params: BroadcastProgressParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastProgress>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0), "progress")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { progressHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val rescheduleHandler: Handler<BroadcastRescheduleResponse> =
            jsonHandler<BroadcastRescheduleResponse>(clientOptions.jsonMapper)

        override fun reschedule(
            params: BroadcastRescheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastRescheduleResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0), "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { rescheduleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retryReviewHandler: Handler<BroadcastRetryReviewResponse> =
            jsonHandler<BroadcastRetryReviewResponse>(clientOptions.jsonMapper)

        override fun retryReview(
            params: BroadcastRetryReviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastRetryReviewResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0), "retry-review")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retryReviewHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendHandler: Handler<BroadcastSendResponse> =
            jsonHandler<BroadcastSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0), "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendHandler.handle(it) }
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
