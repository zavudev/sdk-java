// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.telegram.TelegramConnectParams
import com.zavudev.api.models.senders.telegram.TelegramConnectResponse
import com.zavudev.api.models.senders.telegram.TelegramDisconnectParams
import java.util.function.Consumer

interface TelegramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramService

    /**
     * Connect a Telegram bot to a sender. Provide the bot token from @BotFather; Zavu validates it,
     * registers the webhook, and routes the sender's Telegram messages through it.
     */
    fun connect(senderId: String, params: TelegramConnectParams): TelegramConnectResponse =
        connect(senderId, params, RequestOptions.none())

    /** @see connect */
    fun connect(
        senderId: String,
        params: TelegramConnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelegramConnectResponse =
        connect(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see connect */
    fun connect(params: TelegramConnectParams): TelegramConnectResponse =
        connect(params, RequestOptions.none())

    /** @see connect */
    fun connect(
        params: TelegramConnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelegramConnectResponse

    /** Disconnect Telegram from a sender and remove the webhook. */
    fun disconnect(senderId: String) = disconnect(senderId, TelegramDisconnectParams.none())

    /** @see disconnect */
    fun disconnect(
        senderId: String,
        params: TelegramDisconnectParams = TelegramDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = disconnect(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see disconnect */
    fun disconnect(
        senderId: String,
        params: TelegramDisconnectParams = TelegramDisconnectParams.none(),
    ) = disconnect(senderId, params, RequestOptions.none())

    /** @see disconnect */
    fun disconnect(
        params: TelegramDisconnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see disconnect */
    fun disconnect(params: TelegramDisconnectParams) = disconnect(params, RequestOptions.none())

    /** @see disconnect */
    fun disconnect(senderId: String, requestOptions: RequestOptions) =
        disconnect(senderId, TelegramDisconnectParams.none(), requestOptions)

    /** A view of [TelegramService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/telegram`, but is otherwise
         * the same as [TelegramService.connect].
         */
        @MustBeClosed
        fun connect(
            senderId: String,
            params: TelegramConnectParams,
        ): HttpResponseFor<TelegramConnectResponse> =
            connect(senderId, params, RequestOptions.none())

        /** @see connect */
        @MustBeClosed
        fun connect(
            senderId: String,
            params: TelegramConnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelegramConnectResponse> =
            connect(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see connect */
        @MustBeClosed
        fun connect(params: TelegramConnectParams): HttpResponseFor<TelegramConnectResponse> =
            connect(params, RequestOptions.none())

        /** @see connect */
        @MustBeClosed
        fun connect(
            params: TelegramConnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelegramConnectResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/senders/{senderId}/telegram`, but is
         * otherwise the same as [TelegramService.disconnect].
         */
        @MustBeClosed
        fun disconnect(senderId: String): HttpResponse =
            disconnect(senderId, TelegramDisconnectParams.none())

        /** @see disconnect */
        @MustBeClosed
        fun disconnect(
            senderId: String,
            params: TelegramDisconnectParams = TelegramDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = disconnect(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see disconnect */
        @MustBeClosed
        fun disconnect(
            senderId: String,
            params: TelegramDisconnectParams = TelegramDisconnectParams.none(),
        ): HttpResponse = disconnect(senderId, params, RequestOptions.none())

        /** @see disconnect */
        @MustBeClosed
        fun disconnect(
            params: TelegramDisconnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see disconnect */
        @MustBeClosed
        fun disconnect(params: TelegramDisconnectParams): HttpResponse =
            disconnect(params, RequestOptions.none())

        /** @see disconnect */
        @MustBeClosed
        fun disconnect(senderId: String, requestOptions: RequestOptions): HttpResponse =
            disconnect(senderId, TelegramDisconnectParams.none(), requestOptions)
    }
}
