// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.conversations.ConversationListMessagesPageAsync
import com.zavudev.api.models.conversations.ConversationListMessagesParams
import com.zavudev.api.models.conversations.ConversationListPageAsync
import com.zavudev.api.models.conversations.ConversationListParams
import com.zavudev.api.models.conversations.ConversationMarkAsReadParams
import com.zavudev.api.models.conversations.ConversationMarkAsReadResponse
import com.zavudev.api.models.conversations.ConversationRetrieveParams
import com.zavudev.api.models.conversations.ConversationRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConversationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationServiceAsync

    /** Get conversation */
    fun retrieve(conversationId: String): CompletableFuture<ConversationRetrieveResponse> =
        retrieve(conversationId, ConversationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationRetrieveResponse> =
        retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
    ): CompletableFuture<ConversationRetrieveResponse> =
        retrieve(conversationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConversationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: ConversationRetrieveParams
    ): CompletableFuture<ConversationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationRetrieveResponse> =
        retrieve(conversationId, ConversationRetrieveParams.none(), requestOptions)

    /**
     * List inbox threads, most recently active first. A conversation groups every message with one
     * contact across channels, which is what you need to build an inbox: `GET /v1/messages` returns
     * a flat log with no thread to hang it on.
     *
     * Use `senderId` to scope the list to a single number, and `channel` to keep only threads that
     * have carried that channel.
     */
    fun list(): CompletableFuture<ConversationListPageAsync> = list(ConversationListParams.none())

    /** @see list */
    fun list(
        params: ConversationListParams = ConversationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationListPageAsync>

    /** @see list */
    fun list(
        params: ConversationListParams = ConversationListParams.none()
    ): CompletableFuture<ConversationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ConversationListPageAsync> =
        list(ConversationListParams.none(), requestOptions)

    /**
     * Messages in this thread, newest first, across every channel it has carried. Reply with `POST
     * /v1/messages`, passing the conversation's `senderId` as the `Zavu-Sender` header so the
     * answer leaves from the number the contact already knows.
     */
    fun listMessages(conversationId: String): CompletableFuture<ConversationListMessagesPageAsync> =
        listMessages(conversationId, ConversationListMessagesParams.none())

    /** @see listMessages */
    fun listMessages(
        conversationId: String,
        params: ConversationListMessagesParams = ConversationListMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationListMessagesPageAsync> =
        listMessages(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see listMessages */
    fun listMessages(
        conversationId: String,
        params: ConversationListMessagesParams = ConversationListMessagesParams.none(),
    ): CompletableFuture<ConversationListMessagesPageAsync> =
        listMessages(conversationId, params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        params: ConversationListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationListMessagesPageAsync>

    /** @see listMessages */
    fun listMessages(
        params: ConversationListMessagesParams
    ): CompletableFuture<ConversationListMessagesPageAsync> =
        listMessages(params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationListMessagesPageAsync> =
        listMessages(conversationId, ConversationListMessagesParams.none(), requestOptions)

    /**
     * Reset the thread's `unreadCount` to zero. Marks the thread read in your own inbox only: it
     * does not send a read receipt to the contact.
     */
    fun markAsRead(conversationId: String): CompletableFuture<ConversationMarkAsReadResponse> =
        markAsRead(conversationId, ConversationMarkAsReadParams.none())

    /** @see markAsRead */
    fun markAsRead(
        conversationId: String,
        params: ConversationMarkAsReadParams = ConversationMarkAsReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationMarkAsReadResponse> =
        markAsRead(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see markAsRead */
    fun markAsRead(
        conversationId: String,
        params: ConversationMarkAsReadParams = ConversationMarkAsReadParams.none(),
    ): CompletableFuture<ConversationMarkAsReadResponse> =
        markAsRead(conversationId, params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        params: ConversationMarkAsReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationMarkAsReadResponse>

    /** @see markAsRead */
    fun markAsRead(
        params: ConversationMarkAsReadParams
    ): CompletableFuture<ConversationMarkAsReadResponse> = markAsRead(params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationMarkAsReadResponse> =
        markAsRead(conversationId, ConversationMarkAsReadParams.none(), requestOptions)

    /**
     * A view of [ConversationServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConversationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/conversations/{conversationId}`, but is
         * otherwise the same as [ConversationServiceAsync.retrieve].
         */
        fun retrieve(
            conversationId: String
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(conversationId, ConversationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(conversationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ConversationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ConversationRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(conversationId, ConversationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/conversations`, but is otherwise the same as
         * [ConversationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ConversationListPageAsync>> =
            list(ConversationListParams.none())

        /** @see list */
        fun list(
            params: ConversationListParams = ConversationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationListPageAsync>>

        /** @see list */
        fun list(
            params: ConversationListParams = ConversationListParams.none()
        ): CompletableFuture<HttpResponseFor<ConversationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConversationListPageAsync>> =
            list(ConversationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/conversations/{conversationId}/messages`, but is
         * otherwise the same as [ConversationServiceAsync.listMessages].
         */
        fun listMessages(
            conversationId: String
        ): CompletableFuture<HttpResponseFor<ConversationListMessagesPageAsync>> =
            listMessages(conversationId, ConversationListMessagesParams.none())

        /** @see listMessages */
        fun listMessages(
            conversationId: String,
            params: ConversationListMessagesParams = ConversationListMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationListMessagesPageAsync>> =
            listMessages(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see listMessages */
        fun listMessages(
            conversationId: String,
            params: ConversationListMessagesParams = ConversationListMessagesParams.none(),
        ): CompletableFuture<HttpResponseFor<ConversationListMessagesPageAsync>> =
            listMessages(conversationId, params, RequestOptions.none())

        /** @see listMessages */
        fun listMessages(
            params: ConversationListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationListMessagesPageAsync>>

        /** @see listMessages */
        fun listMessages(
            params: ConversationListMessagesParams
        ): CompletableFuture<HttpResponseFor<ConversationListMessagesPageAsync>> =
            listMessages(params, RequestOptions.none())

        /** @see listMessages */
        fun listMessages(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationListMessagesPageAsync>> =
            listMessages(conversationId, ConversationListMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/conversations/{conversationId}/read`, but is
         * otherwise the same as [ConversationServiceAsync.markAsRead].
         */
        fun markAsRead(
            conversationId: String
        ): CompletableFuture<HttpResponseFor<ConversationMarkAsReadResponse>> =
            markAsRead(conversationId, ConversationMarkAsReadParams.none())

        /** @see markAsRead */
        fun markAsRead(
            conversationId: String,
            params: ConversationMarkAsReadParams = ConversationMarkAsReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationMarkAsReadResponse>> =
            markAsRead(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see markAsRead */
        fun markAsRead(
            conversationId: String,
            params: ConversationMarkAsReadParams = ConversationMarkAsReadParams.none(),
        ): CompletableFuture<HttpResponseFor<ConversationMarkAsReadResponse>> =
            markAsRead(conversationId, params, RequestOptions.none())

        /** @see markAsRead */
        fun markAsRead(
            params: ConversationMarkAsReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationMarkAsReadResponse>>

        /** @see markAsRead */
        fun markAsRead(
            params: ConversationMarkAsReadParams
        ): CompletableFuture<HttpResponseFor<ConversationMarkAsReadResponse>> =
            markAsRead(params, RequestOptions.none())

        /** @see markAsRead */
        fun markAsRead(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationMarkAsReadResponse>> =
            markAsRead(conversationId, ConversationMarkAsReadParams.none(), requestOptions)
    }
}
