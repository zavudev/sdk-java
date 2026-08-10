// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

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
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListPageAsync
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListPageResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateResponse
import com.zavudev.api.services.async.senders.agent.knowledgebases.DocumentServiceAsync
import com.zavudev.api.services.async.senders.agent.knowledgebases.DocumentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class KnowledgeBaseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    KnowledgeBaseServiceAsync {

    private val withRawResponse: KnowledgeBaseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): KnowledgeBaseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeBaseServiceAsync =
        KnowledgeBaseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentServiceAsync = documents

    override fun create(
        params: KnowledgeBaseCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseCreateResponse> =
        // post /v1/senders/{senderId}/agent/knowledge-bases
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: KnowledgeBaseRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseRetrieveResponse> =
        // get /v1/senders/{senderId}/agent/knowledge-bases/{kbId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: KnowledgeBaseUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseUpdateResponse> =
        // patch /v1/senders/{senderId}/agent/knowledge-bases/{kbId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: KnowledgeBaseListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseListPageAsync> =
        // get /v1/senders/{senderId}/agent/knowledge-bases
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: KnowledgeBaseDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/senders/{senderId}/agent/knowledge-bases/{kbId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KnowledgeBaseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeBaseServiceAsync.WithRawResponse =
            KnowledgeBaseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        private val createHandler: Handler<KnowledgeBaseCreateResponse> =
            jsonHandler<KnowledgeBaseCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: KnowledgeBaseCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "knowledge-bases",
                    )
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

        private val retrieveHandler: Handler<KnowledgeBaseRetrieveResponse> =
            jsonHandler<KnowledgeBaseRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: KnowledgeBaseRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("kbId", params.kbId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "knowledge-bases",
                        params._pathParam(1),
                    )
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

        private val updateHandler: Handler<KnowledgeBaseUpdateResponse> =
            jsonHandler<KnowledgeBaseUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: KnowledgeBaseUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("kbId", params.kbId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "knowledge-bases",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<KnowledgeBaseListPageResponse> =
            jsonHandler<KnowledgeBaseListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: KnowledgeBaseListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "knowledge-bases",
                    )
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
                                KnowledgeBaseListPageAsync.builder()
                                    .service(KnowledgeBaseServiceAsyncImpl(clientOptions))
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
            params: KnowledgeBaseDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("kbId", params.kbId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "senders",
                        params._pathParam(0),
                        "agent",
                        "knowledge-bases",
                        params._pathParam(1),
                    )
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
