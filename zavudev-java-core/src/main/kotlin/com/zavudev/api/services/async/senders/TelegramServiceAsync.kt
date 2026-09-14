// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.telegram.TelegramConnectParams
import com.zavudev.api.models.senders.telegram.TelegramConnectResponse
import com.zavudev.api.models.senders.telegram.TelegramDisconnectParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TelegramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramServiceAsync

    /**
     * Connect a Telegram bot to a sender. Provide the bot token from @BotFather; Zavu validates it,
     * registers the webhook, and routes the sender's Telegram messages through it.
     */
    fun connect(
        senderId: String,
        params: TelegramConnectParams,
    ): CompletableFuture<TelegramConnectResponse> = connect(senderId, params, RequestOptions.none())

    /** @see connect */
    fun connect(
        senderId: String,
        params: TelegramConnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelegramConnectResponse> =
        connect(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see connect */
    fun connect(params: TelegramConnectParams): CompletableFuture<TelegramConnectResponse> =
        connect(params, RequestOptions.none())

    /** @see connect */
    fun connect(
        params: TelegramConnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelegramConnectResponse>

    /** Disconnect Telegram from a sender and remove the webhook. */
    fun disconnect(senderId: String): CompletableFuture<Void?> =
        disconnect(senderId, TelegramDisconnectParams.none())

    /** @see disconnect */
    fun disconnect(
        senderId: String,
        params: TelegramDisconnectParams = TelegramDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        disconnect(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see disconnect */
    fun disconnect(
        senderId: String,
        params: TelegramDisconnectParams = TelegramDisconnectParams.none(),
    ): CompletableFuture<Void?> = disconnect(senderId, params, RequestOptions.none())

    /** @see disconnect */
    fun disconnect(
        params: TelegramDisconnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see disconnect */
    fun disconnect(params: TelegramDisconnectParams): CompletableFuture<Void?> =
        disconnect(params, RequestOptions.none())

    /** @see disconnect */
    fun disconnect(senderId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        disconnect(senderId, TelegramDisconnectParams.none(), requestOptions)

    /**
     * A view of [TelegramServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelegramServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/telegram`, but is otherwise
         * the same as [TelegramServiceAsync.connect].
         */
        fun connect(
            senderId: String,
            params: TelegramConnectParams,
        ): CompletableFuture<HttpResponseFor<TelegramConnectResponse>> =
            connect(senderId, params, RequestOptions.none())

        /** @see connect */
        fun connect(
            senderId: String,
            params: TelegramConnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelegramConnectResponse>> =
            connect(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see connect */
        fun connect(
            params: TelegramConnectParams
        ): CompletableFuture<HttpResponseFor<TelegramConnectResponse>> =
            connect(params, RequestOptions.none())

        /** @see connect */
        fun connect(
            params: TelegramConnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelegramConnectResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}/telegram`, but is
         * otherwise the same as [TelegramServiceAsync.disconnect].
         */
        fun disconnect(senderId: String): CompletableFuture<HttpResponse> =
            disconnect(senderId, TelegramDisconnectParams.none())

        /** @see disconnect */
        fun disconnect(
            senderId: String,
            params: TelegramDisconnectParams = TelegramDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            disconnect(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see disconnect */
        fun disconnect(
            senderId: String,
            params: TelegramDisconnectParams = TelegramDisconnectParams.none(),
        ): CompletableFuture<HttpResponse> = disconnect(senderId, params, RequestOptions.none())

        /** @see disconnect */
        fun disconnect(
            params: TelegramDisconnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see disconnect */
        fun disconnect(params: TelegramDisconnectParams): CompletableFuture<HttpResponse> =
            disconnect(params, RequestOptions.none())

        /** @see disconnect */
        fun disconnect(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            disconnect(senderId, TelegramDisconnectParams.none(), requestOptions)
    }
}
