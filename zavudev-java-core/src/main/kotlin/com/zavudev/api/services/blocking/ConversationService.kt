// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.conversations.ConversationListMessagesPage
import com.zavudev.api.models.conversations.ConversationListMessagesParams
import com.zavudev.api.models.conversations.ConversationListPage
import com.zavudev.api.models.conversations.ConversationListParams
import com.zavudev.api.models.conversations.ConversationMarkAsReadParams
import com.zavudev.api.models.conversations.ConversationMarkAsReadResponse
import com.zavudev.api.models.conversations.ConversationRetrieveParams
import com.zavudev.api.models.conversations.ConversationRetrieveResponse
import java.util.function.Consumer

interface ConversationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationService

    /** Get conversation */
    fun retrieve(conversationId: String): ConversationRetrieveResponse =
        retrieve(conversationId, ConversationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationRetrieveResponse =
        retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
    ): ConversationRetrieveResponse = retrieve(conversationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConversationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ConversationRetrieveParams): ConversationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        requestOptions: RequestOptions,
    ): ConversationRetrieveResponse =
        retrieve(conversationId, ConversationRetrieveParams.none(), requestOptions)

    /**
     * List inbox threads, most recently active first. A conversation groups every message with one
     * contact across channels, which is what you need to build an inbox: `GET /v1/messages` returns
     * a flat log with no thread to hang it on.
     *
     * Use `senderId` to scope the list to a single number, and `channel` to keep only threads that
     * have carried that channel.
     */
    fun list(): ConversationListPage = list(ConversationListParams.none())

    /** @see list */
    fun list(
        params: ConversationListParams = ConversationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationListPage

    /** @see list */
    fun list(params: ConversationListParams = ConversationListParams.none()): ConversationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ConversationListPage =
        list(ConversationListParams.none(), requestOptions)

    /**
     * Messages in this thread, newest first, across every channel it has carried. Reply with `POST
     * /v1/messages`, passing the conversation's `senderId` as the `Zavu-Sender` header so the
     * answer leaves from the number the contact already knows.
     */
    fun listMessages(conversationId: String): ConversationListMessagesPage =
        listMessages(conversationId, ConversationListMessagesParams.none())

    /** @see listMessages */
    fun listMessages(
        conversationId: String,
        params: ConversationListMessagesParams = ConversationListMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationListMessagesPage =
        listMessages(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see listMessages */
    fun listMessages(
        conversationId: String,
        params: ConversationListMessagesParams = ConversationListMessagesParams.none(),
    ): ConversationListMessagesPage = listMessages(conversationId, params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        params: ConversationListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationListMessagesPage

    /** @see listMessages */
    fun listMessages(params: ConversationListMessagesParams): ConversationListMessagesPage =
        listMessages(params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        conversationId: String,
        requestOptions: RequestOptions,
    ): ConversationListMessagesPage =
        listMessages(conversationId, ConversationListMessagesParams.none(), requestOptions)

    /**
     * Reset the thread's `unreadCount` to zero. Marks the thread read in your own inbox only: it
     * does not send a read receipt to the contact.
     */
    fun markAsRead(conversationId: String): ConversationMarkAsReadResponse =
        markAsRead(conversationId, ConversationMarkAsReadParams.none())

    /** @see markAsRead */
    fun markAsRead(
        conversationId: String,
        params: ConversationMarkAsReadParams = ConversationMarkAsReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationMarkAsReadResponse =
        markAsRead(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see markAsRead */
    fun markAsRead(
        conversationId: String,
        params: ConversationMarkAsReadParams = ConversationMarkAsReadParams.none(),
    ): ConversationMarkAsReadResponse = markAsRead(conversationId, params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        params: ConversationMarkAsReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationMarkAsReadResponse

    /** @see markAsRead */
    fun markAsRead(params: ConversationMarkAsReadParams): ConversationMarkAsReadResponse =
        markAsRead(params, RequestOptions.none())

    /** @see markAsRead */
    fun markAsRead(
        conversationId: String,
        requestOptions: RequestOptions,
    ): ConversationMarkAsReadResponse =
        markAsRead(conversationId, ConversationMarkAsReadParams.none(), requestOptions)

    /**
     * A view of [ConversationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/conversations/{conversationId}`, but is
         * otherwise the same as [ConversationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(conversationId: String): HttpResponseFor<ConversationRetrieveResponse> =
            retrieve(conversationId, ConversationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationRetrieveResponse> =
            retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
        ): HttpResponseFor<ConversationRetrieveResponse> =
            retrieve(conversationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConversationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConversationRetrieveParams
        ): HttpResponseFor<ConversationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationRetrieveResponse> =
            retrieve(conversationId, ConversationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/conversations`, but is otherwise the same as
         * [ConversationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ConversationListPage> = list(ConversationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConversationListParams = ConversationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConversationListParams = ConversationListParams.none()
        ): HttpResponseFor<ConversationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConversationListPage> =
            list(ConversationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/conversations/{conversationId}/messages`, but is
         * otherwise the same as [ConversationService.listMessages].
         */
        @MustBeClosed
        fun listMessages(conversationId: String): HttpResponseFor<ConversationListMessagesPage> =
            listMessages(conversationId, ConversationListMessagesParams.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            conversationId: String,
            params: ConversationListMessagesParams = ConversationListMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationListMessagesPage> =
            listMessages(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            conversationId: String,
            params: ConversationListMessagesParams = ConversationListMessagesParams.none(),
        ): HttpResponseFor<ConversationListMessagesPage> =
            listMessages(conversationId, params, RequestOptions.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            params: ConversationListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationListMessagesPage>

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            params: ConversationListMessagesParams
        ): HttpResponseFor<ConversationListMessagesPage> =
            listMessages(params, RequestOptions.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationListMessagesPage> =
            listMessages(conversationId, ConversationListMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/conversations/{conversationId}/read`, but is
         * otherwise the same as [ConversationService.markAsRead].
         */
        @MustBeClosed
        fun markAsRead(conversationId: String): HttpResponseFor<ConversationMarkAsReadResponse> =
            markAsRead(conversationId, ConversationMarkAsReadParams.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            conversationId: String,
            params: ConversationMarkAsReadParams = ConversationMarkAsReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationMarkAsReadResponse> =
            markAsRead(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            conversationId: String,
            params: ConversationMarkAsReadParams = ConversationMarkAsReadParams.none(),
        ): HttpResponseFor<ConversationMarkAsReadResponse> =
            markAsRead(conversationId, params, RequestOptions.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            params: ConversationMarkAsReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationMarkAsReadResponse>

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            params: ConversationMarkAsReadParams
        ): HttpResponseFor<ConversationMarkAsReadResponse> =
            markAsRead(params, RequestOptions.none())

        /** @see markAsRead */
        @MustBeClosed
        fun markAsRead(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationMarkAsReadResponse> =
            markAsRead(conversationId, ConversationMarkAsReadParams.none(), requestOptions)
    }
}
