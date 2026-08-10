// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent

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
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListPage
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListPageResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateResponse
import com.zavudev.api.services.blocking.senders.agent.knowledgebases.DocumentService
import com.zavudev.api.services.blocking.senders.agent.knowledgebases.DocumentServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class KnowledgeBaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    KnowledgeBaseService {

    private val withRawResponse: KnowledgeBaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    override fun withRawResponse(): KnowledgeBaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeBaseService =
        KnowledgeBaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentService = documents

    override fun create(
        params: KnowledgeBaseCreateParams,
        requestOptions: RequestOptions,
    ): KnowledgeBaseCreateResponse =
        // post /v1/senders/{senderId}/agent/knowledge-bases
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: KnowledgeBaseRetrieveParams,
        requestOptions: RequestOptions,
    ): KnowledgeBaseRetrieveResponse =
        // get /v1/senders/{senderId}/agent/knowledge-bases/{kbId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: KnowledgeBaseUpdateParams,
        requestOptions: RequestOptions,
    ): KnowledgeBaseUpdateResponse =
        // patch /v1/senders/{senderId}/agent/knowledge-bases/{kbId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: KnowledgeBaseListParams,
        requestOptions: RequestOptions,
    ): KnowledgeBaseListPage =
        // get /v1/senders/{senderId}/agent/knowledge-bases
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: KnowledgeBaseDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/senders/{senderId}/agent/knowledge-bases/{kbId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KnowledgeBaseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeBaseService.WithRawResponse =
            KnowledgeBaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentService.WithRawResponse = documents

        private val createHandler: Handler<KnowledgeBaseCreateResponse> =
            jsonHandler<KnowledgeBaseCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: KnowledgeBaseCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseCreateResponse> {
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

        private val retrieveHandler: Handler<KnowledgeBaseRetrieveResponse> =
            jsonHandler<KnowledgeBaseRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: KnowledgeBaseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseRetrieveResponse> {
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

        private val updateHandler: Handler<KnowledgeBaseUpdateResponse> =
            jsonHandler<KnowledgeBaseUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: KnowledgeBaseUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseUpdateResponse> {
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

        private val listHandler: Handler<KnowledgeBaseListPageResponse> =
            jsonHandler<KnowledgeBaseListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: KnowledgeBaseListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseListPage> {
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
                        KnowledgeBaseListPage.builder()
                            .service(KnowledgeBaseServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: KnowledgeBaseDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
