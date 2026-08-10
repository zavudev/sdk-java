// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncRetrieveParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncRetrieveResponse
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartContactsSyncParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartContactsSyncResponse
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartHistorySyncParams
import com.zavudev.api.models.senders.whatsappsync.WhatsappSyncStartHistorySyncResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WhatsappSyncServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappSyncServiceAsync

    /**
     * Get the current sync status for a sender's WhatsApp coexistence account. Only available for
     * senders connected in coexistence mode (WhatsApp Business App + Cloud API).
     */
    fun retrieve(senderId: String): CompletableFuture<WhatsappSyncRetrieveResponse> =
        retrieve(senderId, WhatsappSyncRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        params: WhatsappSyncRetrieveParams = WhatsappSyncRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappSyncRetrieveResponse> =
        retrieve(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        params: WhatsappSyncRetrieveParams = WhatsappSyncRetrieveParams.none(),
    ): CompletableFuture<WhatsappSyncRetrieveResponse> =
        retrieve(senderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WhatsappSyncRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappSyncRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: WhatsappSyncRetrieveParams
    ): CompletableFuture<WhatsappSyncRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappSyncRetrieveResponse> =
        retrieve(senderId, WhatsappSyncRetrieveParams.none(), requestOptions)

    /**
     * Initiate contact names sync from the WhatsApp Business App. This imports contact names stored
     * in the app to Zavu. Only available for coexistence accounts with active status.
     */
    fun startContactsSync(
        senderId: String
    ): CompletableFuture<WhatsappSyncStartContactsSyncResponse> =
        startContactsSync(senderId, WhatsappSyncStartContactsSyncParams.none())

    /** @see startContactsSync */
    fun startContactsSync(
        senderId: String,
        params: WhatsappSyncStartContactsSyncParams = WhatsappSyncStartContactsSyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappSyncStartContactsSyncResponse> =
        startContactsSync(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see startContactsSync */
    fun startContactsSync(
        senderId: String,
        params: WhatsappSyncStartContactsSyncParams = WhatsappSyncStartContactsSyncParams.none(),
    ): CompletableFuture<WhatsappSyncStartContactsSyncResponse> =
        startContactsSync(senderId, params, RequestOptions.none())

    /** @see startContactsSync */
    fun startContactsSync(
        params: WhatsappSyncStartContactsSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappSyncStartContactsSyncResponse>

    /** @see startContactsSync */
    fun startContactsSync(
        params: WhatsappSyncStartContactsSyncParams
    ): CompletableFuture<WhatsappSyncStartContactsSyncResponse> =
        startContactsSync(params, RequestOptions.none())

    /** @see startContactsSync */
    fun startContactsSync(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappSyncStartContactsSyncResponse> =
        startContactsSync(senderId, WhatsappSyncStartContactsSyncParams.none(), requestOptions)

    /**
     * Initiate message history sync from the WhatsApp Business App. This sends a request to the
     * account owner to approve sharing their conversation history. Only available for coexistence
     * accounts with active status.
     */
    fun startHistorySync(
        senderId: String
    ): CompletableFuture<WhatsappSyncStartHistorySyncResponse> =
        startHistorySync(senderId, WhatsappSyncStartHistorySyncParams.none())

    /** @see startHistorySync */
    fun startHistorySync(
        senderId: String,
        params: WhatsappSyncStartHistorySyncParams = WhatsappSyncStartHistorySyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappSyncStartHistorySyncResponse> =
        startHistorySync(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see startHistorySync */
    fun startHistorySync(
        senderId: String,
        params: WhatsappSyncStartHistorySyncParams = WhatsappSyncStartHistorySyncParams.none(),
    ): CompletableFuture<WhatsappSyncStartHistorySyncResponse> =
        startHistorySync(senderId, params, RequestOptions.none())

    /** @see startHistorySync */
    fun startHistorySync(
        params: WhatsappSyncStartHistorySyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappSyncStartHistorySyncResponse>

    /** @see startHistorySync */
    fun startHistorySync(
        params: WhatsappSyncStartHistorySyncParams
    ): CompletableFuture<WhatsappSyncStartHistorySyncResponse> =
        startHistorySync(params, RequestOptions.none())

    /** @see startHistorySync */
    fun startHistorySync(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappSyncStartHistorySyncResponse> =
        startHistorySync(senderId, WhatsappSyncStartHistorySyncParams.none(), requestOptions)

    /**
     * A view of [WhatsappSyncServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappSyncServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/whatsapp-sync`, but is
         * otherwise the same as [WhatsappSyncServiceAsync.retrieve].
         */
        fun retrieve(
            senderId: String
        ): CompletableFuture<HttpResponseFor<WhatsappSyncRetrieveResponse>> =
            retrieve(senderId, WhatsappSyncRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            params: WhatsappSyncRetrieveParams = WhatsappSyncRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncRetrieveResponse>> =
            retrieve(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            params: WhatsappSyncRetrieveParams = WhatsappSyncRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncRetrieveResponse>> =
            retrieve(senderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WhatsappSyncRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WhatsappSyncRetrieveParams
        ): CompletableFuture<HttpResponseFor<WhatsappSyncRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappSyncRetrieveResponse>> =
            retrieve(senderId, WhatsappSyncRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/whatsapp-sync/contacts`, but
         * is otherwise the same as [WhatsappSyncServiceAsync.startContactsSync].
         */
        fun startContactsSync(
            senderId: String
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartContactsSyncResponse>> =
            startContactsSync(senderId, WhatsappSyncStartContactsSyncParams.none())

        /** @see startContactsSync */
        fun startContactsSync(
            senderId: String,
            params: WhatsappSyncStartContactsSyncParams =
                WhatsappSyncStartContactsSyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartContactsSyncResponse>> =
            startContactsSync(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see startContactsSync */
        fun startContactsSync(
            senderId: String,
            params: WhatsappSyncStartContactsSyncParams = WhatsappSyncStartContactsSyncParams.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartContactsSyncResponse>> =
            startContactsSync(senderId, params, RequestOptions.none())

        /** @see startContactsSync */
        fun startContactsSync(
            params: WhatsappSyncStartContactsSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartContactsSyncResponse>>

        /** @see startContactsSync */
        fun startContactsSync(
            params: WhatsappSyncStartContactsSyncParams
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartContactsSyncResponse>> =
            startContactsSync(params, RequestOptions.none())

        /** @see startContactsSync */
        fun startContactsSync(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartContactsSyncResponse>> =
            startContactsSync(senderId, WhatsappSyncStartContactsSyncParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/whatsapp-sync/history`, but
         * is otherwise the same as [WhatsappSyncServiceAsync.startHistorySync].
         */
        fun startHistorySync(
            senderId: String
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartHistorySyncResponse>> =
            startHistorySync(senderId, WhatsappSyncStartHistorySyncParams.none())

        /** @see startHistorySync */
        fun startHistorySync(
            senderId: String,
            params: WhatsappSyncStartHistorySyncParams = WhatsappSyncStartHistorySyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartHistorySyncResponse>> =
            startHistorySync(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see startHistorySync */
        fun startHistorySync(
            senderId: String,
            params: WhatsappSyncStartHistorySyncParams = WhatsappSyncStartHistorySyncParams.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartHistorySyncResponse>> =
            startHistorySync(senderId, params, RequestOptions.none())

        /** @see startHistorySync */
        fun startHistorySync(
            params: WhatsappSyncStartHistorySyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartHistorySyncResponse>>

        /** @see startHistorySync */
        fun startHistorySync(
            params: WhatsappSyncStartHistorySyncParams
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartHistorySyncResponse>> =
            startHistorySync(params, RequestOptions.none())

        /** @see startHistorySync */
        fun startHistorySync(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappSyncStartHistorySyncResponse>> =
            startHistorySync(senderId, WhatsappSyncStartHistorySyncParams.none(), requestOptions)
    }
}
