// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

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
import com.zavudev.api.models.broadcasts.BroadcastCancelParams
import com.zavudev.api.models.broadcasts.BroadcastCancelResponse
import com.zavudev.api.models.broadcasts.BroadcastCreateParams
import com.zavudev.api.models.broadcasts.BroadcastCreateResponse
import com.zavudev.api.models.broadcasts.BroadcastDeleteParams
import com.zavudev.api.models.broadcasts.BroadcastEscalateReviewParams
import com.zavudev.api.models.broadcasts.BroadcastEscalateReviewResponse
import com.zavudev.api.models.broadcasts.BroadcastListPage
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
import com.zavudev.api.services.blocking.broadcasts.ContactService
import com.zavudev.api.services.blocking.broadcasts.ContactServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BroadcastServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BroadcastService {

    private val withRawResponse: BroadcastService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contacts: ContactService by lazy { ContactServiceImpl(clientOptions) }

    override fun withRawResponse(): BroadcastService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService =
        BroadcastServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun contacts(): ContactService = contacts

    override fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions,
    ): BroadcastCreateResponse =
        // post /v1/broadcasts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions,
    ): BroadcastRetrieveResponse =
        // get /v1/broadcasts/{broadcastId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions,
    ): BroadcastUpdateResponse =
        // patch /v1/broadcasts/{broadcastId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BroadcastListParams,
        requestOptions: RequestOptions,
    ): BroadcastListPage =
        // get /v1/broadcasts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BroadcastDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/broadcasts/{broadcastId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun cancel(
        params: BroadcastCancelParams,
        requestOptions: RequestOptions,
    ): BroadcastCancelResponse =
        // post /v1/broadcasts/{broadcastId}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun escalateReview(
        params: BroadcastEscalateReviewParams,
        requestOptions: RequestOptions,
    ): BroadcastEscalateReviewResponse =
        // post /v1/broadcasts/{broadcastId}/escalate
        withRawResponse().escalateReview(params, requestOptions).parse()

    override fun progress(
        params: BroadcastProgressParams,
        requestOptions: RequestOptions,
    ): BroadcastProgress =
        // get /v1/broadcasts/{broadcastId}/progress
        withRawResponse().progress(params, requestOptions).parse()

    override fun reschedule(
        params: BroadcastRescheduleParams,
        requestOptions: RequestOptions,
    ): BroadcastRescheduleResponse =
        // patch /v1/broadcasts/{broadcastId}/schedule
        withRawResponse().reschedule(params, requestOptions).parse()

    override fun retryReview(
        params: BroadcastRetryReviewParams,
        requestOptions: RequestOptions,
    ): BroadcastRetryReviewResponse =
        // post /v1/broadcasts/{broadcastId}/retry-review
        withRawResponse().retryReview(params, requestOptions).parse()

    override fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions,
    ): BroadcastSendResponse =
        // post /v1/broadcasts/{broadcastId}/send
        withRawResponse().send(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BroadcastService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val contacts: ContactService.WithRawResponse by lazy {
            ContactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastService.WithRawResponse =
            BroadcastServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun contacts(): ContactService.WithRawResponse = contacts

        private val createHandler: Handler<BroadcastCreateResponse> =
            jsonHandler<BroadcastCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts")
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

        private val retrieveHandler: Handler<BroadcastRetrieveResponse> =
            jsonHandler<BroadcastRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0))
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

        private val updateHandler: Handler<BroadcastUpdateResponse> =
            jsonHandler<BroadcastUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastUpdateResponse> {
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

        private val listHandler: Handler<BroadcastListPageResponse> =
            jsonHandler<BroadcastListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BroadcastListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts")
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
                        BroadcastListPage.builder()
                            .service(BroadcastServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BroadcastDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val cancelHandler: Handler<BroadcastCancelResponse> =
            jsonHandler<BroadcastCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: BroadcastCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastCancelResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val escalateReviewHandler: Handler<BroadcastEscalateReviewResponse> =
            jsonHandler<BroadcastEscalateReviewResponse>(clientOptions.jsonMapper)

        override fun escalateReview(
            params: BroadcastEscalateReviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastEscalateReviewResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { escalateReviewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val progressHandler: Handler<BroadcastProgress> =
            jsonHandler<BroadcastProgress>(clientOptions.jsonMapper)

        override fun progress(
            params: BroadcastProgressParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastProgress> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "broadcasts", params._pathParam(0), "progress")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { progressHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rescheduleHandler: Handler<BroadcastRescheduleResponse> =
            jsonHandler<BroadcastRescheduleResponse>(clientOptions.jsonMapper)

        override fun reschedule(
            params: BroadcastRescheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastRescheduleResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { rescheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retryReviewHandler: Handler<BroadcastRetryReviewResponse> =
            jsonHandler<BroadcastRetryReviewResponse>(clientOptions.jsonMapper)

        override fun retryReview(
            params: BroadcastRetryReviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastRetryReviewResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retryReviewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<BroadcastSendResponse> =
            jsonHandler<BroadcastSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastSendResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
