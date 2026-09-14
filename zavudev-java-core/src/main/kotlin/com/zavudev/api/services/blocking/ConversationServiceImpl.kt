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
import com.zavudev.api.models.conversations.ConversationListMessagesPage
import com.zavudev.api.models.conversations.ConversationListMessagesPageResponse
import com.zavudev.api.models.conversations.ConversationListMessagesParams
import com.zavudev.api.models.conversations.ConversationListPage
import com.zavudev.api.models.conversations.ConversationListPageResponse
import com.zavudev.api.models.conversations.ConversationListParams
import com.zavudev.api.models.conversations.ConversationMarkAsReadParams
import com.zavudev.api.models.conversations.ConversationMarkAsReadResponse
import com.zavudev.api.models.conversations.ConversationRetrieveParams
import com.zavudev.api.models.conversations.ConversationRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConversationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversationService {

    private val withRawResponse: ConversationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationService =
        ConversationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ConversationRetrieveParams,
        requestOptions: RequestOptions,
    ): ConversationRetrieveResponse =
        // get /v1/conversations/{conversationId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ConversationListParams,
        requestOptions: RequestOptions,
    ): ConversationListPage =
        // get /v1/conversations
        withRawResponse().list(params, requestOptions).parse()

    override fun listMessages(
        params: ConversationListMessagesParams,
        requestOptions: RequestOptions,
    ): ConversationListMessagesPage =
        // get /v1/conversations/{conversationId}/messages
        withRawResponse().listMessages(params, requestOptions).parse()

    override fun markAsRead(
        params: ConversationMarkAsReadParams,
        requestOptions: RequestOptions,
    ): ConversationMarkAsReadResponse =
        // post /v1/conversations/{conversationId}/read
        withRawResponse().markAsRead(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationService.WithRawResponse =
            ConversationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ConversationRetrieveResponse> =
            jsonHandler<ConversationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConversationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "conversations", params._pathParam(0))
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

        private val listHandler: Handler<ConversationListPageResponse> =
            jsonHandler<ConversationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConversationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "conversations")
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
                        ConversationListPage.builder()
                            .service(ConversationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listMessagesHandler: Handler<ConversationListMessagesPageResponse> =
            jsonHandler<ConversationListMessagesPageResponse>(clientOptions.jsonMapper)

        override fun listMessages(
            params: ConversationListMessagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationListMessagesPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "conversations", params._pathParam(0), "messages")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listMessagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ConversationListMessagesPage.builder()
                            .service(ConversationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val markAsReadHandler: Handler<ConversationMarkAsReadResponse> =
            jsonHandler<ConversationMarkAsReadResponse>(clientOptions.jsonMapper)

        override fun markAsRead(
            params: ConversationMarkAsReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationMarkAsReadResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
