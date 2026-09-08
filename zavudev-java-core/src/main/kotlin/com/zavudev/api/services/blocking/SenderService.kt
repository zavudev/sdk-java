// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.Sender
import com.zavudev.api.models.senders.SenderCreateParams
import com.zavudev.api.models.senders.SenderDeleteParams
import com.zavudev.api.models.senders.SenderGetProfileParams
import com.zavudev.api.models.senders.SenderListPage
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
import com.zavudev.api.services.blocking.senders.TelegramService
import com.zavudev.api.services.blocking.senders.WhatsappSyncService
import java.util.function.Consumer

interface SenderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SenderService

    fun agent(): AgentService

    fun whatsappSync(): WhatsappSyncService

    fun telegram(): TelegramService

    /** Create sender */
    fun create(params: SenderCreateParams): Sender = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SenderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Sender

    /** Get sender */
    fun retrieve(senderId: String): Sender = retrieve(senderId, SenderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        params: SenderRetrieveParams = SenderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Sender = retrieve(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        params: SenderRetrieveParams = SenderRetrieveParams.none(),
    ): Sender = retrieve(senderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SenderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Sender

    /** @see retrieve */
    fun retrieve(params: SenderRetrieveParams): Sender = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(senderId: String, requestOptions: RequestOptions): Sender =
        retrieve(senderId, SenderRetrieveParams.none(), requestOptions)

    /** Update sender */
    fun update(senderId: String): Sender = update(senderId, SenderUpdateParams.none())

    /** @see update */
    fun update(
        senderId: String,
        params: SenderUpdateParams = SenderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Sender = update(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see update */
    fun update(senderId: String, params: SenderUpdateParams = SenderUpdateParams.none()): Sender =
        update(senderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SenderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Sender

    /** @see update */
    fun update(params: SenderUpdateParams): Sender = update(params, RequestOptions.none())

    /** @see update */
    fun update(senderId: String, requestOptions: RequestOptions): Sender =
        update(senderId, SenderUpdateParams.none(), requestOptions)

    /** List senders */
    fun list(): SenderListPage = list(SenderListParams.none())

    /** @see list */
    fun list(
        params: SenderListParams = SenderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SenderListPage

    /** @see list */
    fun list(params: SenderListParams = SenderListParams.none()): SenderListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SenderListPage =
        list(SenderListParams.none(), requestOptions)

    /** Delete sender */
    fun delete(senderId: String) = delete(senderId, SenderDeleteParams.none())

    /** @see delete */
    fun delete(
        senderId: String,
        params: SenderDeleteParams = SenderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see delete */
    fun delete(senderId: String, params: SenderDeleteParams = SenderDeleteParams.none()) =
        delete(senderId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SenderDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SenderDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(senderId: String, requestOptions: RequestOptions) =
        delete(senderId, SenderDeleteParams.none(), requestOptions)

    /**
     * Get the WhatsApp Business profile for a sender. The sender must have a WhatsApp Business
     * Account connected.
     */
    fun getProfile(senderId: String): WhatsappBusinessProfileResponse =
        getProfile(senderId, SenderGetProfileParams.none())

    /** @see getProfile */
    fun getProfile(
        senderId: String,
        params: SenderGetProfileParams = SenderGetProfileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappBusinessProfileResponse =
        getProfile(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see getProfile */
    fun getProfile(
        senderId: String,
        params: SenderGetProfileParams = SenderGetProfileParams.none(),
    ): WhatsappBusinessProfileResponse = getProfile(senderId, params, RequestOptions.none())

    /** @see getProfile */
    fun getProfile(
        params: SenderGetProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappBusinessProfileResponse

    /** @see getProfile */
    fun getProfile(params: SenderGetProfileParams): WhatsappBusinessProfileResponse =
        getProfile(params, RequestOptions.none())

    /** @see getProfile */
    fun getProfile(
        senderId: String,
        requestOptions: RequestOptions,
    ): WhatsappBusinessProfileResponse =
        getProfile(senderId, SenderGetProfileParams.none(), requestOptions)

    /**
     * Regenerate the webhook secret for a sender. The old secret will be invalidated immediately.
     */
    fun regenerateWebhookSecret(senderId: String): WebhookSecretResponse =
        regenerateWebhookSecret(senderId, SenderRegenerateWebhookSecretParams.none())

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        senderId: String,
        params: SenderRegenerateWebhookSecretParams = SenderRegenerateWebhookSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSecretResponse =
        regenerateWebhookSecret(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        senderId: String,
        params: SenderRegenerateWebhookSecretParams = SenderRegenerateWebhookSecretParams.none(),
    ): WebhookSecretResponse = regenerateWebhookSecret(senderId, params, RequestOptions.none())

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        params: SenderRegenerateWebhookSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSecretResponse

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        params: SenderRegenerateWebhookSecretParams
    ): WebhookSecretResponse = regenerateWebhookSecret(params, RequestOptions.none())

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        senderId: String,
        requestOptions: RequestOptions,
    ): WebhookSecretResponse =
        regenerateWebhookSecret(
            senderId,
            SenderRegenerateWebhookSecretParams.none(),
            requestOptions,
        )

    /**
     * Update the WhatsApp Business profile for a sender. The sender must have a WhatsApp Business
     * Account connected.
     */
    fun updateProfile(senderId: String): SenderUpdateProfileResponse =
        updateProfile(senderId, SenderUpdateProfileParams.none())

    /** @see updateProfile */
    fun updateProfile(
        senderId: String,
        params: SenderUpdateProfileParams = SenderUpdateProfileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SenderUpdateProfileResponse =
        updateProfile(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see updateProfile */
    fun updateProfile(
        senderId: String,
        params: SenderUpdateProfileParams = SenderUpdateProfileParams.none(),
    ): SenderUpdateProfileResponse = updateProfile(senderId, params, RequestOptions.none())

    /** @see updateProfile */
    fun updateProfile(
        params: SenderUpdateProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SenderUpdateProfileResponse

    /** @see updateProfile */
    fun updateProfile(params: SenderUpdateProfileParams): SenderUpdateProfileResponse =
        updateProfile(params, RequestOptions.none())

    /** @see updateProfile */
    fun updateProfile(
        senderId: String,
        requestOptions: RequestOptions,
    ): SenderUpdateProfileResponse =
        updateProfile(senderId, SenderUpdateProfileParams.none(), requestOptions)

    /**
     * Upload a new profile picture for the WhatsApp Business profile. The image will be uploaded to
     * Meta and set as the profile picture.
     */
    fun uploadProfilePicture(
        senderId: String,
        params: SenderUploadProfilePictureParams,
    ): SenderUploadProfilePictureResponse =
        uploadProfilePicture(senderId, params, RequestOptions.none())

    /** @see uploadProfilePicture */
    fun uploadProfilePicture(
        senderId: String,
        params: SenderUploadProfilePictureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SenderUploadProfilePictureResponse =
        uploadProfilePicture(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see uploadProfilePicture */
    fun uploadProfilePicture(
        params: SenderUploadProfilePictureParams
    ): SenderUploadProfilePictureResponse = uploadProfilePicture(params, RequestOptions.none())

    /** @see uploadProfilePicture */
    fun uploadProfilePicture(
        params: SenderUploadProfilePictureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SenderUploadProfilePictureResponse

    /** A view of [SenderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SenderService.WithRawResponse

        fun agent(): AgentService.WithRawResponse

        fun whatsappSync(): WhatsappSyncService.WithRawResponse

        fun telegram(): TelegramService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders`, but is otherwise the same as
         * [SenderService.create].
         */
        @MustBeClosed
        fun create(params: SenderCreateParams): HttpResponseFor<Sender> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SenderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Sender>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}`, but is otherwise the same
         * as [SenderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(senderId: String): HttpResponseFor<Sender> =
            retrieve(senderId, SenderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            senderId: String,
            params: SenderRetrieveParams = SenderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Sender> =
            retrieve(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            senderId: String,
            params: SenderRetrieveParams = SenderRetrieveParams.none(),
        ): HttpResponseFor<Sender> = retrieve(senderId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SenderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Sender>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SenderRetrieveParams): HttpResponseFor<Sender> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(senderId: String, requestOptions: RequestOptions): HttpResponseFor<Sender> =
            retrieve(senderId, SenderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}`, but is otherwise the same
         * as [SenderService.update].
         */
        @MustBeClosed
        fun update(senderId: String): HttpResponseFor<Sender> =
            update(senderId, SenderUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            senderId: String,
            params: SenderUpdateParams = SenderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Sender> =
            update(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            senderId: String,
            params: SenderUpdateParams = SenderUpdateParams.none(),
        ): HttpResponseFor<Sender> = update(senderId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SenderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Sender>

        /** @see update */
        @MustBeClosed
        fun update(params: SenderUpdateParams): HttpResponseFor<Sender> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(senderId: String, requestOptions: RequestOptions): HttpResponseFor<Sender> =
            update(senderId, SenderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/senders`, but is otherwise the same as
         * [SenderService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SenderListPage> = list(SenderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SenderListParams = SenderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SenderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SenderListParams = SenderListParams.none()
        ): HttpResponseFor<SenderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SenderListPage> =
            list(SenderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}`, but is otherwise the
         * same as [SenderService.delete].
         */
        @MustBeClosed
        fun delete(senderId: String): HttpResponse = delete(senderId, SenderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            senderId: String,
            params: SenderDeleteParams = SenderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            senderId: String,
            params: SenderDeleteParams = SenderDeleteParams.none(),
        ): HttpResponse = delete(senderId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SenderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SenderDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(senderId: String, requestOptions: RequestOptions): HttpResponse =
            delete(senderId, SenderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/profile`, but is otherwise
         * the same as [SenderService.getProfile].
         */
        @MustBeClosed
        fun getProfile(senderId: String): HttpResponseFor<WhatsappBusinessProfileResponse> =
            getProfile(senderId, SenderGetProfileParams.none())

        /** @see getProfile */
        @MustBeClosed
        fun getProfile(
            senderId: String,
            params: SenderGetProfileParams = SenderGetProfileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappBusinessProfileResponse> =
            getProfile(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see getProfile */
        @MustBeClosed
        fun getProfile(
            senderId: String,
            params: SenderGetProfileParams = SenderGetProfileParams.none(),
        ): HttpResponseFor<WhatsappBusinessProfileResponse> =
            getProfile(senderId, params, RequestOptions.none())

        /** @see getProfile */
        @MustBeClosed
        fun getProfile(
            params: SenderGetProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappBusinessProfileResponse>

        /** @see getProfile */
        @MustBeClosed
        fun getProfile(
            params: SenderGetProfileParams
        ): HttpResponseFor<WhatsappBusinessProfileResponse> =
            getProfile(params, RequestOptions.none())

        /** @see getProfile */
        @MustBeClosed
        fun getProfile(
            senderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappBusinessProfileResponse> =
            getProfile(senderId, SenderGetProfileParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/webhook/secret`, but is
         * otherwise the same as [SenderService.regenerateWebhookSecret].
         */
        @MustBeClosed
        fun regenerateWebhookSecret(senderId: String): HttpResponseFor<WebhookSecretResponse> =
            regenerateWebhookSecret(senderId, SenderRegenerateWebhookSecretParams.none())

        /** @see regenerateWebhookSecret */
        @MustBeClosed
        fun regenerateWebhookSecret(
            senderId: String,
            params: SenderRegenerateWebhookSecretParams =
                SenderRegenerateWebhookSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSecretResponse> =
            regenerateWebhookSecret(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see regenerateWebhookSecret */
        @MustBeClosed
        fun regenerateWebhookSecret(
            senderId: String,
            params: SenderRegenerateWebhookSecretParams = SenderRegenerateWebhookSecretParams.none(),
        ): HttpResponseFor<WebhookSecretResponse> =
            regenerateWebhookSecret(senderId, params, RequestOptions.none())

        /** @see regenerateWebhookSecret */
        @MustBeClosed
        fun regenerateWebhookSecret(
            params: SenderRegenerateWebhookSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSecretResponse>

        /** @see regenerateWebhookSecret */
        @MustBeClosed
        fun regenerateWebhookSecret(
            params: SenderRegenerateWebhookSecretParams
        ): HttpResponseFor<WebhookSecretResponse> =
            regenerateWebhookSecret(params, RequestOptions.none())

        /** @see regenerateWebhookSecret */
        @MustBeClosed
        fun regenerateWebhookSecret(
            senderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookSecretResponse> =
            regenerateWebhookSecret(
                senderId,
                SenderRegenerateWebhookSecretParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}/profile`, but is otherwise
         * the same as [SenderService.updateProfile].
         */
        @MustBeClosed
        fun updateProfile(senderId: String): HttpResponseFor<SenderUpdateProfileResponse> =
            updateProfile(senderId, SenderUpdateProfileParams.none())

        /** @see updateProfile */
        @MustBeClosed
        fun updateProfile(
            senderId: String,
            params: SenderUpdateProfileParams = SenderUpdateProfileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SenderUpdateProfileResponse> =
            updateProfile(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see updateProfile */
        @MustBeClosed
        fun updateProfile(
            senderId: String,
            params: SenderUpdateProfileParams = SenderUpdateProfileParams.none(),
        ): HttpResponseFor<SenderUpdateProfileResponse> =
            updateProfile(senderId, params, RequestOptions.none())

        /** @see updateProfile */
        @MustBeClosed
        fun updateProfile(
            params: SenderUpdateProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SenderUpdateProfileResponse>

        /** @see updateProfile */
        @MustBeClosed
        fun updateProfile(
            params: SenderUpdateProfileParams
        ): HttpResponseFor<SenderUpdateProfileResponse> =
            updateProfile(params, RequestOptions.none())

        /** @see updateProfile */
        @MustBeClosed
        fun updateProfile(
            senderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SenderUpdateProfileResponse> =
            updateProfile(senderId, SenderUpdateProfileParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/profile/picture`, but is
         * otherwise the same as [SenderService.uploadProfilePicture].
         */
        @MustBeClosed
        fun uploadProfilePicture(
            senderId: String,
            params: SenderUploadProfilePictureParams,
        ): HttpResponseFor<SenderUploadProfilePictureResponse> =
            uploadProfilePicture(senderId, params, RequestOptions.none())

        /** @see uploadProfilePicture */
        @MustBeClosed
        fun uploadProfilePicture(
            senderId: String,
            params: SenderUploadProfilePictureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SenderUploadProfilePictureResponse> =
            uploadProfilePicture(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see uploadProfilePicture */
        @MustBeClosed
        fun uploadProfilePicture(
            params: SenderUploadProfilePictureParams
        ): HttpResponseFor<SenderUploadProfilePictureResponse> =
            uploadProfilePicture(params, RequestOptions.none())

        /** @see uploadProfilePicture */
        @MustBeClosed
        fun uploadProfilePicture(
            params: SenderUploadProfilePictureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SenderUploadProfilePictureResponse>
    }
}
