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
import com.zavudev.api.models.contacts.Contact
import com.zavudev.api.models.contacts.ContactCreateParams
import com.zavudev.api.models.contacts.ContactDeleteParams
import com.zavudev.api.models.contacts.ContactListPageAsync
import com.zavudev.api.models.contacts.ContactListPageResponse
import com.zavudev.api.models.contacts.ContactListParams
import com.zavudev.api.models.contacts.ContactMergeParams
import com.zavudev.api.models.contacts.ContactRetrieveByPhoneParams
import com.zavudev.api.models.contacts.ContactRetrieveParams
import com.zavudev.api.models.contacts.ContactUpdateParams
import com.zavudev.api.services.async.contacts.ChannelServiceAsync
import com.zavudev.api.services.async.contacts.ChannelServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ContactServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ContactServiceAsync {

    private val withRawResponse: ContactServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val channels: ChannelServiceAsync by lazy { ChannelServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ContactServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactServiceAsync =
        ContactServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun channels(): ChannelServiceAsync = channels

    override fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Contact> =
        // post /v1/contacts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Contact> =
        // get /v1/contacts/{contactId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Contact> =
        // patch /v1/contacts/{contactId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ContactListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactListPageAsync> =
        // get /v1/contacts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ContactDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/contacts/{contactId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun merge(
        params: ContactMergeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Contact> =
        // post /v1/contacts/{contactId}/merge
        withRawResponse().merge(params, requestOptions).thenApply { it.parse() }

    override fun retrieveByPhone(
        params: ContactRetrieveByPhoneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Contact> =
        // get /v1/contacts/phone/{phoneNumber}
        withRawResponse().retrieveByPhone(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContactServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val channels: ChannelServiceAsync.WithRawResponse by lazy {
            ChannelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactServiceAsync.WithRawResponse =
            ContactServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun channels(): ChannelServiceAsync.WithRawResponse = channels

        private val createHandler: Handler<Contact> = jsonHandler<Contact>(clientOptions.jsonMapper)

        override fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contacts")
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

        private val retrieveHandler: Handler<Contact> =
            jsonHandler<Contact>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contacts", params._pathParam(0))
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

        private val updateHandler: Handler<Contact> = jsonHandler<Contact>(clientOptions.jsonMapper)

        override fun update(
            params: ContactUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contacts", params._pathParam(0))
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

        private val listHandler: Handler<ContactListPageResponse> =
            jsonHandler<ContactListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ContactListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contacts")
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
                                ContactListPageAsync.builder()
                                    .service(ContactServiceAsyncImpl(clientOptions))
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
            params: ContactDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contacts", params._pathParam(0))
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

        private val mergeHandler: Handler<Contact> = jsonHandler<Contact>(clientOptions.jsonMapper)

        override fun merge(
            params: ContactMergeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contacts", params._pathParam(0), "merge")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { mergeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveByPhoneHandler: Handler<Contact> =
            jsonHandler<Contact>(clientOptions.jsonMapper)

        override fun retrieveByPhone(
            params: ContactRetrieveByPhoneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contacts", "phone", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveByPhoneHandler.handle(it) }
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
