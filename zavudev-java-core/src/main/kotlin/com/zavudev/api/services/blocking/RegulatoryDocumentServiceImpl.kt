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
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentCreateResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentDeleteParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListPage
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListPageResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentListParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentRetrieveParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentRetrieveResponse
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentUploadUrlParams
import com.zavudev.api.models.regulatorydocuments.RegulatoryDocumentUploadUrlResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RegulatoryDocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RegulatoryDocumentService {

    private val withRawResponse: RegulatoryDocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegulatoryDocumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegulatoryDocumentService =
        RegulatoryDocumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RegulatoryDocumentCreateParams,
        requestOptions: RequestOptions,
    ): RegulatoryDocumentCreateResponse =
        // post /v1/documents
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RegulatoryDocumentRetrieveParams,
        requestOptions: RequestOptions,
    ): RegulatoryDocumentRetrieveResponse =
        // get /v1/documents/{documentId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RegulatoryDocumentListParams,
        requestOptions: RequestOptions,
    ): RegulatoryDocumentListPage =
        // get /v1/documents
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RegulatoryDocumentDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/documents/{documentId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun uploadUrl(
        params: RegulatoryDocumentUploadUrlParams,
        requestOptions: RequestOptions,
    ): RegulatoryDocumentUploadUrlResponse =
        // post /v1/documents/upload-url
        withRawResponse().uploadUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegulatoryDocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegulatoryDocumentService.WithRawResponse =
            RegulatoryDocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RegulatoryDocumentCreateResponse> =
            jsonHandler<RegulatoryDocumentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RegulatoryDocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegulatoryDocumentCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents")
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

        private val retrieveHandler: Handler<RegulatoryDocumentRetrieveResponse> =
            jsonHandler<RegulatoryDocumentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RegulatoryDocumentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegulatoryDocumentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents", params._pathParam(0))
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

        private val listHandler: Handler<RegulatoryDocumentListPageResponse> =
            jsonHandler<RegulatoryDocumentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RegulatoryDocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegulatoryDocumentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents")
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
                        RegulatoryDocumentListPage.builder()
                            .service(RegulatoryDocumentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RegulatoryDocumentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val uploadUrlHandler: Handler<RegulatoryDocumentUploadUrlResponse> =
            jsonHandler<RegulatoryDocumentUploadUrlResponse>(clientOptions.jsonMapper)

        override fun uploadUrl(
            params: RegulatoryDocumentUploadUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegulatoryDocumentUploadUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "documents", "upload-url")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
