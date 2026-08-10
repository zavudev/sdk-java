// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders

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
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncRetrieveParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncRetrieveResponse
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartContactsSyncParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartContactsSyncResponse
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartHistorySyncParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartHistorySyncResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WhatsappSyncServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappSyncService {

    private val withRawResponse: WhatsappSyncService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappSyncService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappSyncService =
        WhatsappSyncServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: WhatsappSyncRetrieveParams,
        requestOptions: RequestOptions,
    ): WhatsappSyncRetrieveResponse =
        // get /v1/senders/{senderId}/whatsapp-sync
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun startContactsSync(
        params: WhatsappSyncStartContactsSyncParams,
        requestOptions: RequestOptions,
    ): WhatsappSyncStartContactsSyncResponse =
        // post /v1/senders/{senderId}/whatsapp-sync/contacts
        withRawResponse().startContactsSync(params, requestOptions).parse()

    override fun startHistorySync(
        params: WhatsappSyncStartHistorySyncParams,
        requestOptions: RequestOptions,
    ): WhatsappSyncStartHistorySyncResponse =
        // post /v1/senders/{senderId}/whatsapp-sync/history
        withRawResponse().startHistorySync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappSyncService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappSyncService.WithRawResponse =
            WhatsappSyncServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<WhatsappSyncRetrieveResponse> =
            jsonHandler<WhatsappSyncRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WhatsappSyncRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappSyncRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "whatsapp-sync")
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

        private val startContactsSyncHandler: Handler<WhatsappSyncStartContactsSyncResponse> =
            jsonHandler<WhatsappSyncStartContactsSyncResponse>(clientOptions.jsonMapper)

        override fun startContactsSync(
            params: WhatsappSyncStartContactsSyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappSyncStartContactsSyncResponse> {
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
                        "whatsapp-sync",
                        "contacts",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { startContactsSyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val startHistorySyncHandler: Handler<WhatsappSyncStartHistorySyncResponse> =
            jsonHandler<WhatsappSyncStartHistorySyncResponse>(clientOptions.jsonMapper)

        override fun startHistorySync(
            params: WhatsappSyncStartHistorySyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappSyncStartHistorySyncResponse> {
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
                        "whatsapp-sync",
                        "history",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { startHistorySyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
