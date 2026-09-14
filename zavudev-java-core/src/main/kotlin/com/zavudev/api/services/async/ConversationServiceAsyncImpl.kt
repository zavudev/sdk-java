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
import com.zavudev.api.models.conversations.ConversationListMessagesPageAsync
import com.zavudev.api.models.conversations.ConversationListMessagesPageResponse
import com.zavudev.api.models.conversations.ConversationListMessagesParams
import com.zavudev.api.models.conversations.ConversationListPageAsync
import com.zavudev.api.models.conversations.ConversationListPageResponse
import com.zavudev.api.models.conversations.ConversationListParams
import com.zavudev.api.models.conversations.ConversationMarkAsReadParams
import com.zavudev.api.models.conversations.ConversationMarkAsReadResponse
import com.zavudev.api.models.conversations.ConversationRetrieveParams
import com.zavudev.api.models.conversations.ConversationRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConversationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversationServiceAsync {

    private val withRawResponse: ConversationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationServiceAsync =
        ConversationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ConversationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationRetrieveResponse> =
        // get /v1/conversations/{conversationId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ConversationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationListPageAsync> =
        // get /v1/conversations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listMessages(
        params: ConversationListMessagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationListMessagesPageAsync> =
        // get /v1/conversations/{conversationId}/messages
        withRawResponse().listMessages(params, requestOptions).thenApply { it.parse() }

    override fun markAsRead(
        params: ConversationMarkAsReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationMarkAsReadResponse> =
        // post /v1/conversations/{conversationId}/read
        withRawResponse().markAsRead(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationServiceAsync.WithRawResponse =
            ConversationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ConversationRetrieveResponse> =
            jsonHandler<ConversationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConversationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "conversations", params._pathParam(0))
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

        private val listHandler: Handler<ConversationListPageResponse> =
            jsonHandler<ConversationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConversationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "conversations")
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
                                ConversationListPageAsync.builder()
                                    .service(ConversationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listMessagesHandler: Handler<ConversationListMessagesPageResponse> =
            jsonHandler<ConversationListMessagesPageResponse>(clientOptions.jsonMapper)

        override fun listMessages(
            params: ConversationListMessagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationListMessagesPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "conversations", params._pathParam(0), "messages")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listMessagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ConversationListMessagesPageAsync.builder()
                                    .service(ConversationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val markAsReadHandler: Handler<ConversationMarkAsReadResponse> =
            jsonHandler<ConversationMarkAsReadResponse>(clientOptions.jsonMapper)

        override fun markAsRead(
            params: ConversationMarkAsReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationMarkAsReadResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "conversations", params._pathParam(0), "read")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { markAsReadHandler.handle(it) }
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
