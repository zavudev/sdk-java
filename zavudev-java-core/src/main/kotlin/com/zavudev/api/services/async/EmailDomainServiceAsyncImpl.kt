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
import com.zavudev.api.models.emaildomains.EmailDomainCreateParams
import com.zavudev.api.models.emaildomains.EmailDomainCreateResponse
import com.zavudev.api.models.emaildomains.EmailDomainDeleteParams
import com.zavudev.api.models.emaildomains.EmailDomainListParams
import com.zavudev.api.models.emaildomains.EmailDomainListResponse
import com.zavudev.api.models.emaildomains.EmailDomainRetrieveParams
import com.zavudev.api.models.emaildomains.EmailDomainRetrieveResponse
import com.zavudev.api.models.emaildomains.EmailDomainVerifyParams
import com.zavudev.api.models.emaildomains.EmailDomainVerifyResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmailDomainServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailDomainServiceAsync {

    private val withRawResponse: EmailDomainServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailDomainServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailDomainServiceAsync =
        EmailDomainServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EmailDomainCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainCreateResponse> =
        // post /v1/email-domains
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EmailDomainRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainRetrieveResponse> =
        // get /v1/email-domains/{domainId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EmailDomainListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainListResponse> =
        // get /v1/email-domains
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EmailDomainDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/email-domains/{domainId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun verify(
        params: EmailDomainVerifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainVerifyResponse> =
        // post /v1/email-domains/{domainId}/verify
        withRawResponse().verify(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailDomainServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailDomainServiceAsync.WithRawResponse =
            EmailDomainServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmailDomainCreateResponse> =
            jsonHandler<EmailDomainCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailDomainCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "email-domains")
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

        private val retrieveHandler: Handler<EmailDomainRetrieveResponse> =
            jsonHandler<EmailDomainRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailDomainRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("domainId", params.domainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "email-domains", params._pathParam(0))
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

        private val listHandler: Handler<EmailDomainListResponse> =
            jsonHandler<EmailDomainListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailDomainListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "email-domains")
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
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EmailDomainDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("domainId", params.domainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "email-domains", params._pathParam(0))
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

        private val verifyHandler: Handler<EmailDomainVerifyResponse> =
            jsonHandler<EmailDomainVerifyResponse>(clientOptions.jsonMapper)

        override fun verify(
            params: EmailDomainVerifyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainVerifyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("domainId", params.domainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "email-domains", params._pathParam(0), "verify")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { verifyHandler.handle(it) }
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
