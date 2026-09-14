// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.Sender
import com.zavudev.api.models.senders.SenderCreateParams
import com.zavudev.api.models.senders.SenderDeleteParams
import com.zavudev.api.models.senders.SenderGetProfileParams
import com.zavudev.api.models.senders.SenderListPageAsync
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
import com.zavudev.api.services.async.senders.AgentServiceAsync
import com.zavudev.api.services.async.senders.TelegramServiceAsync
import com.zavudev.api.services.async.senders.WhatsappSyncServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SenderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SenderServiceAsync

    fun agent(): AgentServiceAsync

    fun whatsappSync(): WhatsappSyncServiceAsync

    fun telegram(): TelegramServiceAsync

    /** Create sender */
    fun create(params: SenderCreateParams): CompletableFuture<Sender> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SenderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Sender>

    /** Get sender */
    fun retrieve(senderId: String): CompletableFuture<Sender> =
        retrieve(senderId, SenderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        params: SenderRetrieveParams = SenderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Sender> =
        retrieve(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        params: SenderRetrieveParams = SenderRetrieveParams.none(),
    ): CompletableFuture<Sender> = retrieve(senderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SenderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Sender>

    /** @see retrieve */
    fun retrieve(params: SenderRetrieveParams): CompletableFuture<Sender> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(senderId: String, requestOptions: RequestOptions): CompletableFuture<Sender> =
        retrieve(senderId, SenderRetrieveParams.none(), requestOptions)

    /** Update sender */
    fun update(senderId: String): CompletableFuture<Sender> =
        update(senderId, SenderUpdateParams.none())

    /** @see update */
    fun update(
        senderId: String,
        params: SenderUpdateParams = SenderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Sender> =
        update(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see update */
    fun update(
        senderId: String,
        params: SenderUpdateParams = SenderUpdateParams.none(),
    ): CompletableFuture<Sender> = update(senderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SenderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Sender>

    /** @see update */
    fun update(params: SenderUpdateParams): CompletableFuture<Sender> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(senderId: String, requestOptions: RequestOptions): CompletableFuture<Sender> =
        update(senderId, SenderUpdateParams.none(), requestOptions)

    /** List senders */
    fun list(): CompletableFuture<SenderListPageAsync> = list(SenderListParams.none())

    /** @see list */
    fun list(
        params: SenderListParams = SenderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SenderListPageAsync>

    /** @see list */
    fun list(
        params: SenderListParams = SenderListParams.none()
    ): CompletableFuture<SenderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SenderListPageAsync> =
        list(SenderListParams.none(), requestOptions)

    /** Delete sender */
    fun delete(senderId: String): CompletableFuture<Void?> =
        delete(senderId, SenderDeleteParams.none())

    /** @see delete */
    fun delete(
        senderId: String,
        params: SenderDeleteParams = SenderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see delete */
    fun delete(
        senderId: String,
        params: SenderDeleteParams = SenderDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(senderId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SenderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SenderDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(senderId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(senderId, SenderDeleteParams.none(), requestOptions)

    /**
     * Get the WhatsApp Business profile for a sender. The sender must have a WhatsApp Business
     * Account connected.
     */
    fun getProfile(senderId: String): CompletableFuture<WhatsappBusinessProfileResponse> =
        getProfile(senderId, SenderGetProfileParams.none())

    /** @see getProfile */
    fun getProfile(
        senderId: String,
        params: SenderGetProfileParams = SenderGetProfileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappBusinessProfileResponse> =
        getProfile(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see getProfile */
    fun getProfile(
        senderId: String,
        params: SenderGetProfileParams = SenderGetProfileParams.none(),
    ): CompletableFuture<WhatsappBusinessProfileResponse> =
        getProfile(senderId, params, RequestOptions.none())

    /** @see getProfile */
    fun getProfile(
        params: SenderGetProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappBusinessProfileResponse>

    /** @see getProfile */
    fun getProfile(
        params: SenderGetProfileParams
    ): CompletableFuture<WhatsappBusinessProfileResponse> =
        getProfile(params, RequestOptions.none())

    /** @see getProfile */
    fun getProfile(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappBusinessProfileResponse> =
        getProfile(senderId, SenderGetProfileParams.none(), requestOptions)

    /**
     * Regenerate the webhook secret for a sender. The old secret will be invalidated immediately.
     */
    fun regenerateWebhookSecret(senderId: String): CompletableFuture<WebhookSecretResponse> =
        regenerateWebhookSecret(senderId, SenderRegenerateWebhookSecretParams.none())

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        senderId: String,
        params: SenderRegenerateWebhookSecretParams = SenderRegenerateWebhookSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookSecretResponse> =
        regenerateWebhookSecret(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        senderId: String,
        params: SenderRegenerateWebhookSecretParams = SenderRegenerateWebhookSecretParams.none(),
    ): CompletableFuture<WebhookSecretResponse> =
        regenerateWebhookSecret(senderId, params, RequestOptions.none())

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        params: SenderRegenerateWebhookSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookSecretResponse>

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        params: SenderRegenerateWebhookSecretParams
    ): CompletableFuture<WebhookSecretResponse> =
        regenerateWebhookSecret(params, RequestOptions.none())

    /** @see regenerateWebhookSecret */
    fun regenerateWebhookSecret(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookSecretResponse> =
        regenerateWebhookSecret(
            senderId,
            SenderRegenerateWebhookSecretParams.none(),
            requestOptions,
        )

    /**
     * Update the WhatsApp Business profile for a sender. The sender must have a WhatsApp Business
     * Account connected.
     */
    fun updateProfile(senderId: String): CompletableFuture<SenderUpdateProfileResponse> =
        updateProfile(senderId, SenderUpdateProfileParams.none())

    /** @see updateProfile */
    fun updateProfile(
        senderId: String,
        params: SenderUpdateProfileParams = SenderUpdateProfileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SenderUpdateProfileResponse> =
        updateProfile(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see updateProfile */
    fun updateProfile(
        senderId: String,
        params: SenderUpdateProfileParams = SenderUpdateProfileParams.none(),
    ): CompletableFuture<SenderUpdateProfileResponse> =
        updateProfile(senderId, params, RequestOptions.none())

    /** @see updateProfile */
    fun updateProfile(
        params: SenderUpdateProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SenderUpdateProfileResponse>

    /** @see updateProfile */
    fun updateProfile(
        params: SenderUpdateProfileParams
    ): CompletableFuture<SenderUpdateProfileResponse> = updateProfile(params, RequestOptions.none())

    /** @see updateProfile */
    fun updateProfile(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SenderUpdateProfileResponse> =
        updateProfile(senderId, SenderUpdateProfileParams.none(), requestOptions)

    /**
     * Upload a new profile picture for the WhatsApp Business profile. The image will be uploaded to
     * Meta and set as the profile picture.
     */
    fun uploadProfilePicture(
        senderId: String,
        params: SenderUploadProfilePictureParams,
    ): CompletableFuture<SenderUploadProfilePictureResponse> =
        uploadProfilePicture(senderId, params, RequestOptions.none())

    /** @see uploadProfilePicture */
    fun uploadProfilePicture(
        senderId: String,
        params: SenderUploadProfilePictureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SenderUploadProfilePictureResponse> =
        uploadProfilePicture(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see uploadProfilePicture */
    fun uploadProfilePicture(
        params: SenderUploadProfilePictureParams
    ): CompletableFuture<SenderUploadProfilePictureResponse> =
        uploadProfilePicture(params, RequestOptions.none())

    /** @see uploadProfilePicture */
    fun uploadProfilePicture(
        params: SenderUploadProfilePictureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SenderUploadProfilePictureResponse>

    /**
     * A view of [SenderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SenderServiceAsync.WithRawResponse

        fun agent(): AgentServiceAsync.WithRawResponse

        fun whatsappSync(): WhatsappSyncServiceAsync.WithRawResponse

        fun telegram(): TelegramServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders`, but is otherwise the same as
         * [SenderServiceAsync.create].
         */
        fun create(params: SenderCreateParams): CompletableFuture<HttpResponseFor<Sender>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SenderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Sender>>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}`, but is otherwise the same
         * as [SenderServiceAsync.retrieve].
         */
        fun retrieve(senderId: String): CompletableFuture<HttpResponseFor<Sender>> =
            retrieve(senderId, SenderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            params: SenderRetrieveParams = SenderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Sender>> =
            retrieve(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            params: SenderRetrieveParams = SenderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Sender>> =
            retrieve(senderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SenderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Sender>>

        /** @see retrieve */
        fun retrieve(params: SenderRetrieveParams): CompletableFuture<HttpResponseFor<Sender>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Sender>> =
            retrieve(senderId, SenderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}`, but is otherwise the same
         * as [SenderServiceAsync.update].
         */
        fun update(senderId: String): CompletableFuture<HttpResponseFor<Sender>> =
            update(senderId, SenderUpdateParams.none())

        /** @see update */
        fun update(
            senderId: String,
            params: SenderUpdateParams = SenderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Sender>> =
            update(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see update */
        fun update(
            senderId: String,
            params: SenderUpdateParams = SenderUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Sender>> =
            update(senderId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SenderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Sender>>

        /** @see update */
        fun update(params: SenderUpdateParams): CompletableFuture<HttpResponseFor<Sender>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Sender>> =
            update(senderId, SenderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/senders`, but is otherwise the same as
         * [SenderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SenderListPageAsync>> =
            list(SenderListParams.none())

        /** @see list */
        fun list(
            params: SenderListParams = SenderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SenderListPageAsync>>

        /** @see list */
        fun list(
            params: SenderListParams = SenderListParams.none()
        ): CompletableFuture<HttpResponseFor<SenderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SenderListPageAsync>> =
            list(SenderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}`, but is otherwise the
         * same as [SenderServiceAsync.delete].
         */
        fun delete(senderId: String): CompletableFuture<HttpResponse> =
            delete(senderId, SenderDeleteParams.none())

        /** @see delete */
        fun delete(
            senderId: String,
            params: SenderDeleteParams = SenderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see delete */
        fun delete(
            senderId: String,
            params: SenderDeleteParams = SenderDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(senderId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SenderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SenderDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(senderId, SenderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/profile`, but is otherwise
         * the same as [SenderServiceAsync.getProfile].
         */
        fun getProfile(
            senderId: String
        ): CompletableFuture<HttpResponseFor<WhatsappBusinessProfileResponse>> =
            getProfile(senderId, SenderGetProfileParams.none())

        /** @see getProfile */
        fun getProfile(
            senderId: String,
            params: SenderGetProfileParams = SenderGetProfileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappBusinessProfileResponse>> =
            getProfile(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see getProfile */
        fun getProfile(
            senderId: String,
            params: SenderGetProfileParams = SenderGetProfileParams.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappBusinessProfileResponse>> =
            getProfile(senderId, params, RequestOptions.none())

        /** @see getProfile */
        fun getProfile(
            params: SenderGetProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappBusinessProfileResponse>>

        /** @see getProfile */
        fun getProfile(
            params: SenderGetProfileParams
        ): CompletableFuture<HttpResponseFor<WhatsappBusinessProfileResponse>> =
            getProfile(params, RequestOptions.none())

        /** @see getProfile */
        fun getProfile(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappBusinessProfileResponse>> =
            getProfile(senderId, SenderGetProfileParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/webhook/secret`, but is
         * otherwise the same as [SenderServiceAsync.regenerateWebhookSecret].
         */
        fun regenerateWebhookSecret(
            senderId: String
        ): CompletableFuture<HttpResponseFor<WebhookSecretResponse>> =
            regenerateWebhookSecret(senderId, SenderRegenerateWebhookSecretParams.none())

        /** @see regenerateWebhookSecret */
        fun regenerateWebhookSecret(
            senderId: String,
            params: SenderRegenerateWebhookSecretParams =
                SenderRegenerateWebhookSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookSecretResponse>> =
            regenerateWebhookSecret(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see regenerateWebhookSecret */
        fun regenerateWebhookSecret(
            senderId: String,
            params: SenderRegenerateWebhookSecretParams = SenderRegenerateWebhookSecretParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookSecretResponse>> =
            regenerateWebhookSecret(senderId, params, RequestOptions.none())

        /** @see regenerateWebhookSecret */
        fun regenerateWebhookSecret(
            params: SenderRegenerateWebhookSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookSecretResponse>>

        /** @see regenerateWebhookSecret */
        fun regenerateWebhookSecret(
            params: SenderRegenerateWebhookSecretParams
        ): CompletableFuture<HttpResponseFor<WebhookSecretResponse>> =
            regenerateWebhookSecret(params, RequestOptions.none())

        /** @see regenerateWebhookSecret */
        fun regenerateWebhookSecret(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookSecretResponse>> =
            regenerateWebhookSecret(
                senderId,
                SenderRegenerateWebhookSecretParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch /v1/senders/{senderId}/profile`, but is otherwise
         * the same as [SenderServiceAsync.updateProfile].
         */
        fun updateProfile(
            senderId: String
        ): CompletableFuture<HttpResponseFor<SenderUpdateProfileResponse>> =
            updateProfile(senderId, SenderUpdateProfileParams.none())

        /** @see updateProfile */
        fun updateProfile(
            senderId: String,
            params: SenderUpdateProfileParams = SenderUpdateProfileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SenderUpdateProfileResponse>> =
            updateProfile(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see updateProfile */
        fun updateProfile(
            senderId: String,
            params: SenderUpdateProfileParams = SenderUpdateProfileParams.none(),
        ): CompletableFuture<HttpResponseFor<SenderUpdateProfileResponse>> =
            updateProfile(senderId, params, RequestOptions.none())

        /** @see updateProfile */
        fun updateProfile(
            params: SenderUpdateProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SenderUpdateProfileResponse>>

        /** @see updateProfile */
        fun updateProfile(
            params: SenderUpdateProfileParams
        ): CompletableFuture<HttpResponseFor<SenderUpdateProfileResponse>> =
            updateProfile(params, RequestOptions.none())

        /** @see updateProfile */
        fun updateProfile(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SenderUpdateProfileResponse>> =
            updateProfile(senderId, SenderUpdateProfileParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/profile/picture`, but is
         * otherwise the same as [SenderServiceAsync.uploadProfilePicture].
         */
        fun uploadProfilePicture(
            senderId: String,
            params: SenderUploadProfilePictureParams,
        ): CompletableFuture<HttpResponseFor<SenderUploadProfilePictureResponse>> =
            uploadProfilePicture(senderId, params, RequestOptions.none())

        /** @see uploadProfilePicture */
        fun uploadProfilePicture(
            senderId: String,
            params: SenderUploadProfilePictureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SenderUploadProfilePictureResponse>> =
            uploadProfilePicture(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see uploadProfilePicture */
        fun uploadProfilePicture(
            params: SenderUploadProfilePictureParams
        ): CompletableFuture<HttpResponseFor<SenderUploadProfilePictureResponse>> =
            uploadProfilePicture(params, RequestOptions.none())

        /** @see uploadProfilePicture */
        fun uploadProfilePicture(
            params: SenderUploadProfilePictureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SenderUploadProfilePictureResponse>>
    }
}
