// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.contacts

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
import com.zavudev.api.models.contacts.channels.ChannelAddParams
import com.zavudev.api.models.contacts.channels.ChannelAddResponse
import com.zavudev.api.models.contacts.channels.ChannelRemoveParams
import com.zavudev.api.models.contacts.channels.ChannelSetPrimaryParams
import com.zavudev.api.models.contacts.channels.ChannelSetPrimaryResponse
import com.zavudev.api.models.contacts.channels.ChannelUpdateParams
import com.zavudev.api.models.contacts.channels.ChannelUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChannelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ChannelService {

    private val withRawResponse: ChannelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChannelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService =
        ChannelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ChannelUpdateParams,
        requestOptions: RequestOptions,
    ): ChannelUpdateResponse =
        // patch /v1/contacts/{contactId}/channels/{channelId}
        withRawResponse().update(params, requestOptions).parse()

    override fun add(params: ChannelAddParams, requestOptions: RequestOptions): ChannelAddResponse =
        // post /v1/contacts/{contactId}/channels
        withRawResponse().add(params, requestOptions).parse()

    override fun remove(params: ChannelRemoveParams, requestOptions: RequestOptions) {
        // delete /v1/contacts/{contactId}/channels/{channelId}
        withRawResponse().remove(params, requestOptions)
    }

    override fun setPrimary(
        params: ChannelSetPrimaryParams,
        requestOptions: RequestOptions,
    ): ChannelSetPrimaryResponse =
        // post /v1/contacts/{contactId}/channels/{channelId}/primary
        withRawResponse().setPrimary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChannelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelService.WithRawResponse =
            ChannelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ChannelUpdateResponse> =
            jsonHandler<ChannelUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ChannelUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "contacts",
                        params._pathParam(0),
                        "channels",
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

        private val addHandler: Handler<ChannelAddResponse> =
            jsonHandler<ChannelAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: ChannelAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelAddResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contacts", params._pathParam(0), "channels")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeHandler: Handler<Void?> = emptyHandler()

        override fun remove(
            params: ChannelRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "contacts",
                        params._pathParam(0),
                        "channels",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { removeHandler.handle(it) }
            }
        }

        private val setPrimaryHandler: Handler<ChannelSetPrimaryResponse> =
            jsonHandler<ChannelSetPrimaryResponse>(clientOptions.jsonMapper)

        override fun setPrimary(
            params: ChannelSetPrimaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelSetPrimaryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelId", params.channelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "contacts",
                        params._pathParam(0),
                        "channels",
                        params._pathParam(1),
                        "primary",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setPrimaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
