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
import com.zavudev.api.models.senders.Sender
import com.zavudev.api.models.senders.SenderCreateParams
import com.zavudev.api.models.senders.SenderDeleteParams
import com.zavudev.api.models.senders.SenderGetProfileParams
import com.zavudev.api.models.senders.SenderListPage
import com.zavudev.api.models.senders.SenderListPageResponse
import com.zavudev.api.models.senders.SenderListParams
import com.zavudev.api.models.senders.SenderRegenerateWebhookSecretParams
import com.zavudev.api.models.senders.SenderRetrieveParams
import com.zavudev.api.models.senders.SenderUpdateParams
import com.zavudev.api.models.senders.SenderUpdateProfileParams
import com.zavudev.api.models.senders.SenderUpdateProfileResponse
import com.zavudev.api.models.senders.SenderUploadProfilePictureParams
import com.zavudev.api.models.senders.SenderUploadProfilePictureResponse
import com.zavudev.api.models.senders.WebhookSecretResponse
import com.zavudev.api.models.senders.WhatsappBusinessProfileResponse
import com.zavudev.api.services.blocking.senders.AgentService
import com.zavudev.api.services.blocking.senders.AgentServiceImpl
import com.zavudev.api.services.blocking.senders.TelegramService
import com.zavudev.api.services.blocking.senders.TelegramServiceImpl
import com.zavudev.api.services.blocking.senders.WhatsappSyncService
import com.zavudev.api.services.blocking.senders.WhatsappSyncServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SenderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SenderService {

    private val withRawResponse: SenderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agent: AgentService by lazy { AgentServiceImpl(clientOptions) }

    private val whatsappSync: WhatsappSyncService by lazy { WhatsappSyncServiceImpl(clientOptions) }

    private val telegram: TelegramService by lazy { TelegramServiceImpl(clientOptions) }

    override fun withRawResponse(): SenderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SenderService =
        SenderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agent(): AgentService = agent

    override fun whatsappSync(): WhatsappSyncService = whatsappSync

    override fun telegram(): TelegramService = telegram

    override fun create(params: SenderCreateParams, requestOptions: RequestOptions): Sender =
        // post /v1/senders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: SenderRetrieveParams, requestOptions: RequestOptions): Sender =
        // get /v1/senders/{senderId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: SenderUpdateParams, requestOptions: RequestOptions): Sender =
        // patch /v1/senders/{senderId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: SenderListParams, requestOptions: RequestOptions): SenderListPage =
        // get /v1/senders
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SenderDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/senders/{senderId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun getProfile(
        params: SenderGetProfileParams,
        requestOptions: RequestOptions,
    ): WhatsappBusinessProfileResponse =
        // get /v1/senders/{senderId}/profile
        withRawResponse().getProfile(params, requestOptions).parse()

    override fun regenerateWebhookSecret(
        params: SenderRegenerateWebhookSecretParams,
        requestOptions: RequestOptions,
    ): WebhookSecretResponse =
        // post /v1/senders/{senderId}/webhook/secret
        withRawResponse().regenerateWebhookSecret(params, requestOptions).parse()

    override fun updateProfile(
        params: SenderUpdateProfileParams,
        requestOptions: RequestOptions,
    ): SenderUpdateProfileResponse =
        // patch /v1/senders/{senderId}/profile
        withRawResponse().updateProfile(params, requestOptions).parse()

    override fun uploadProfilePicture(
        params: SenderUploadProfilePictureParams,
        requestOptions: RequestOptions,
    ): SenderUploadProfilePictureResponse =
        // post /v1/senders/{senderId}/profile/picture
        withRawResponse().uploadProfilePicture(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SenderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val agent: AgentService.WithRawResponse by lazy {
            AgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val whatsappSync: WhatsappSyncService.WithRawResponse by lazy {
            WhatsappSyncServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val telegram: TelegramService.WithRawResponse by lazy {
            TelegramServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SenderService.WithRawResponse =
            SenderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun agent(): AgentService.WithRawResponse = agent

        override fun whatsappSync(): WhatsappSyncService.WithRawResponse = whatsappSync

        override fun telegram(): TelegramService.WithRawResponse = telegram

        private val createHandler: Handler<Sender> = jsonHandler<Sender>(clientOptions.jsonMapper)

        override fun create(
            params: SenderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Sender> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders")
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

        private val retrieveHandler: Handler<Sender> = jsonHandler<Sender>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SenderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Sender> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0))
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

        private val updateHandler: Handler<Sender> = jsonHandler<Sender>(clientOptions.jsonMapper)

        override fun update(
            params: SenderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Sender> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0))
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

        private val listHandler: Handler<SenderListPageResponse> =
            jsonHandler<SenderListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SenderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SenderListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders")
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
                        SenderListPage.builder()
                            .service(SenderServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SenderDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getProfileHandler: Handler<WhatsappBusinessProfileResponse> =
            jsonHandler<WhatsappBusinessProfileResponse>(clientOptions.jsonMapper)

        override fun getProfile(
            params: SenderGetProfileParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappBusinessProfileResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "profile")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getProfileHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val regenerateWebhookSecretHandler: Handler<WebhookSecretResponse> =
            jsonHandler<WebhookSecretResponse>(clientOptions.jsonMapper)

        override fun regenerateWebhookSecret(
            params: SenderRegenerateWebhookSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookSecretResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "webhook", "secret")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { regenerateWebhookSecretHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateProfileHandler: Handler<SenderUpdateProfileResponse> =
            jsonHandler<SenderUpdateProfileResponse>(clientOptions.jsonMapper)

        override fun updateProfile(
            params: SenderUpdateProfileParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SenderUpdateProfileResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "profile")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateProfileHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadProfilePictureHandler: Handler<SenderUploadProfilePictureResponse> =
            jsonHandler<SenderUploadProfilePictureResponse>(clientOptions.jsonMapper)

        override fun uploadProfilePicture(
            params: SenderUploadProfilePictureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SenderUploadProfilePictureResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("senderId", params.senderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "senders", params._pathParam(0), "profile", "picture")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadProfilePictureHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
