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
import com.zavudev.api.models.subaccounts.SubAccountCreateParams
import com.zavudev.api.models.subaccounts.SubAccountCreateResponse
import com.zavudev.api.models.subaccounts.SubAccountDeactivateParams
import com.zavudev.api.models.subaccounts.SubAccountDeactivateResponse
import com.zavudev.api.models.subaccounts.SubAccountGetBalanceParams
import com.zavudev.api.models.subaccounts.SubAccountGetBalanceResponse
import com.zavudev.api.models.subaccounts.SubAccountListPage
import com.zavudev.api.models.subaccounts.SubAccountListPageResponse
import com.zavudev.api.models.subaccounts.SubAccountListParams
import com.zavudev.api.models.subaccounts.SubAccountRetrieveParams
import com.zavudev.api.models.subaccounts.SubAccountRetrieveResponse
import com.zavudev.api.models.subaccounts.SubAccountUpdateParams
import com.zavudev.api.models.subaccounts.SubAccountUpdateResponse
import com.zavudev.api.services.blocking.subaccounts.ApiKeyService
import com.zavudev.api.services.blocking.subaccounts.ApiKeyServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubAccountService {

    private val withRawResponse: SubAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val apiKeys: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptions) }

    override fun withRawResponse(): SubAccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubAccountService =
        SubAccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun apiKeys(): ApiKeyService = apiKeys

    override fun create(
        params: SubAccountCreateParams,
        requestOptions: RequestOptions,
    ): SubAccountCreateResponse =
        // post /v1/sub-accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SubAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): SubAccountRetrieveResponse =
        // get /v1/sub-accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SubAccountUpdateParams,
        requestOptions: RequestOptions,
    ): SubAccountUpdateResponse =
        // patch /v1/sub-accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SubAccountListParams,
        requestOptions: RequestOptions,
    ): SubAccountListPage =
        // get /v1/sub-accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun deactivate(
        params: SubAccountDeactivateParams,
        requestOptions: RequestOptions,
    ): SubAccountDeactivateResponse =
        // delete /v1/sub-accounts/{id}
        withRawResponse().deactivate(params, requestOptions).parse()

    override fun getBalance(
        params: SubAccountGetBalanceParams,
        requestOptions: RequestOptions,
    ): SubAccountGetBalanceResponse =
        // get /v1/sub-accounts/{id}/balance
        withRawResponse().getBalance(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubAccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val apiKeys: ApiKeyService.WithRawResponse by lazy {
            ApiKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubAccountService.WithRawResponse =
            SubAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun apiKeys(): ApiKeyService.WithRawResponse = apiKeys

        private val createHandler: Handler<SubAccountCreateResponse> =
            jsonHandler<SubAccountCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SubAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sub-accounts")
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

        private val retrieveHandler: Handler<SubAccountRetrieveResponse> =
            jsonHandler<SubAccountRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sub-accounts", params._pathParam(0))
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

        private val updateHandler: Handler<SubAccountUpdateResponse> =
            jsonHandler<SubAccountUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SubAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sub-accounts", params._pathParam(0))
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

        private val listHandler: Handler<SubAccountListPageResponse> =
            jsonHandler<SubAccountListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sub-accounts")
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
                        SubAccountListPage.builder()
                            .service(SubAccountServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deactivateHandler: Handler<SubAccountDeactivateResponse> =
            jsonHandler<SubAccountDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: SubAccountDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountDeactivateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sub-accounts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deactivateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getBalanceHandler: Handler<SubAccountGetBalanceResponse> =
            jsonHandler<SubAccountGetBalanceResponse>(clientOptions.jsonMapper)

        override fun getBalance(
            params: SubAccountGetBalanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountGetBalanceResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sub-accounts", params._pathParam(0), "balance")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getBalanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
