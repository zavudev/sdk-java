// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
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
import com.zavudev.api.models.introspect.IntrospectValidatePhoneParams
import com.zavudev.api.models.introspect.IntrospectValidatePhoneResponse
import java.util.function.Consumer

class IntrospectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IntrospectService {

    private val withRawResponse: IntrospectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntrospectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntrospectService =
        IntrospectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun validatePhone(
        params: IntrospectValidatePhoneParams,
        requestOptions: RequestOptions,
    ): IntrospectValidatePhoneResponse =
        // post /v1/introspect/phone
        withRawResponse().validatePhone(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntrospectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntrospectService.WithRawResponse =
            IntrospectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val validatePhoneHandler: Handler<IntrospectValidatePhoneResponse> =
            jsonHandler<IntrospectValidatePhoneResponse>(clientOptions.jsonMapper)

        override fun validatePhone(
            params: IntrospectValidatePhoneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrospectValidatePhoneResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "introspect", "phone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validatePhoneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
