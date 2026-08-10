// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders

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
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncRetrieveParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncRetrieveResponse
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartContactsSyncParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartContactsSyncResponse
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartHistorySyncParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartHistorySyncResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WhatsappSyncServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappSyncServiceAsync {

    private val withRawResponse: WhatsappSyncServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappSyncServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappSyncServiceAsync =
        WhatsappSyncServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: WhatsappSyncRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappSyncRetrieveResponse> =
        // get /v1/senders/{senderId}/whatsapp-sync
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun startContactsSync(
        params: WhatsappSyncStartContactsSyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappSyncStartContactsSyncResponse> =
        // post /v1/senders/{senderId}/whatsapp-sync/contacts
        withRawResponse().startContactsSync(params, requestOptions).thenApply { it.parse() }

    override fun startHistorySync(
        params: WhatsappSyncStartHistorySyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappSyncStartHistorySyncResponse> =
        // post /v1/senders/{senderId}/whatsapp-sync/history
        withRawResponse().startHistorySync(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappSyncServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappSyncServiceAsync.WithRawResponse =
            WhatsappSyncServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<WhatsappSyncRetrieveResponse> =
            jsonHandler<WhatsappSyncRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WhatsappSyncRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappSyncRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "whatsapp-sync")
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

        private val startContactsSyncHandler: Handler<WhatsappSyncStartContactsSyncResponse> =
            jsonHandler<WhatsappSyncStartContactsSyncResponse>(clientOptions.jsonMapper)

        override fun startContactsSync(
            params: WhatsappSyncStartContactsSyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartContactsSyncResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startContactsSyncHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startHistorySyncHandler: Handler<WhatsappSyncStartHistorySyncResponse> =
            jsonHandler<WhatsappSyncStartHistorySyncResponse>(clientOptions.jsonMapper)

        override fun startHistorySync(
            params: WhatsappSyncStartHistorySyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartHistorySyncResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
