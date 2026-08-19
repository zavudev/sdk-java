// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.messages.MessageListAttachmentsParams
import com.zavudev.api.models.messages.MessageListAttachmentsResponse
import com.zavudev.api.models.messages.MessageListPageAsync
import com.zavudev.api.models.messages.MessageListParams
import com.zavudev.api.models.messages.MessageReactParams
import com.zavudev.api.models.messages.MessageResponse
import com.zavudev.api.models.messages.MessageRetrieveParams
import com.zavudev.api.models.messages.MessageSendParams
import com.zavudev.api.models.messages.MessageShowTypingParams
import com.zavudev.api.models.messages.MessageShowTypingResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync

    /** Get message by ID */
    fun retrieve(messageId: String): CompletableFuture<MessageResponse> =
        retrieve(messageId, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageResponse> =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): CompletableFuture<MessageResponse> = retrieve(messageId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageResponse>

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): CompletableFuture<MessageResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageResponse> =
        retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

    /** List messages previously sent by this project. */
    fun list(): CompletableFuture<MessageListPageAsync> = list(MessageListParams.none())

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListPageAsync>

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none()
    ): CompletableFuture<MessageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessageListPageAsync> =
        list(MessageListParams.none(), requestOptions)

    /**
     * List the stored file attachments for an email message and get a short-lived signed
     * `downloadUrl` for each. Works for both inbound emails (received via `message.inbound`) and
     * outbound emails you sent with attachments. Messages without stored attachments (including
     * SMS, WhatsApp, and other channels) return an empty list. Each `downloadUrl` is generated
     * fresh per request and expires — fetch the file promptly and do not cache the URL.
     */
    fun listAttachments(messageId: String): CompletableFuture<MessageListAttachmentsResponse> =
        listAttachments(messageId, MessageListAttachmentsParams.none())

    /** @see listAttachments */
    fun listAttachments(
        messageId: String,
        params: MessageListAttachmentsParams = MessageListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListAttachmentsResponse> =
        listAttachments(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see listAttachments */
    fun listAttachments(
        messageId: String,
        params: MessageListAttachmentsParams = MessageListAttachmentsParams.none(),
    ): CompletableFuture<MessageListAttachmentsResponse> =
        listAttachments(messageId, params, RequestOptions.none())

    /** @see listAttachments */
    fun listAttachments(
        params: MessageListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListAttachmentsResponse>

    /** @see listAttachments */
    fun listAttachments(
        params: MessageListAttachmentsParams
    ): CompletableFuture<MessageListAttachmentsResponse> =
        listAttachments(params, RequestOptions.none())

    /** @see listAttachments */
    fun listAttachments(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListAttachmentsResponse> =
        listAttachments(messageId, MessageListAttachmentsParams.none(), requestOptions)

    /**
     * Send an emoji reaction to an existing WhatsApp message. Reactions are only supported for
     * WhatsApp messages.
     */
    fun react(messageId: String, params: MessageReactParams): CompletableFuture<MessageResponse> =
        react(messageId, params, RequestOptions.none())

    /** @see react */
    fun react(
        messageId: String,
        params: MessageReactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageResponse> =
        react(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see react */
    fun react(params: MessageReactParams): CompletableFuture<MessageResponse> =
        react(params, RequestOptions.none())

    /** @see react */
    fun react(
        params: MessageReactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageResponse>

    /**
     * Send a message to a recipient via SMS or WhatsApp.
     *
     * **Channel selection:**
     * - If `channel` is omitted and `messageType` is `text`, defaults to SMS
     * - If `messageType` is anything other than `text`, WhatsApp is used automatically
     *
     * **WhatsApp 24-hour window:**
     * - Free-form messages (non-template) require an open 24h window
     * - Window opens when the user messages you first
     * - Use template messages to initiate conversations outside the window
     *
     * **Plan allowances and email billing:**
     * - WhatsApp, Telegram, Instagram and Messenger share an allowance of 2,000 messages per month
     *   on Free. Over it, sends return 429 with code `a2p_limit_exceeded` and upgrade details; the
     *   counter resets on the 1st of each month. Paid plans have no message caps
     * - Email is billed from your prepaid balance in 1,000-message blocks: $0.40 per 1,000
     *   transactional emails, $0.80 per 1,000 marketing (broadcast) emails. A block is charged when
     *   your monthly count crosses each 1,000 boundary, and at zero balance email sends return 402
     *   with code `insufficient_balance`. Free teams start with $2 of credit and additionally cap
     *   at 3,000 emails/month and 100/day. Teams on earlier plans keep their original email quotas
     *   instead
     * - SMS and voice are billed per message from your balance on every plan
     *
     * **Email recipient pre-flight:** Email messages are validated automatically before dispatch.
     * Sends that would be a guaranteed hard bounce are failed instead of sent, protecting your
     * bounce rate: the message transitions to `failed` (visible via `GET /v1/messages/{messageId}`
     * and the `message.failed` webhook) with `errorCode` set to `EMAIL_INVALID_RECIPIENT`
     * (malformed address), `EMAIL_DOMAIN_NOT_FOUND` (recipient domain has no MX or A records), or
     * `EMAIL_RECIPIENT_SUPPRESSED` (address is on your suppression list after a previous bounce or
     * complaint). Advisory signals (role addresses, disposable domains) do not block sends — check
     * them beforehand with `POST /v1/introspect/email`.
     */
    fun send(params: MessageSendParams): CompletableFuture<MessageResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageResponse>

    /**
     * Mark an inbound WhatsApp message as read and display a typing indicator to the user while you
     * prepare a response. The indicator is automatically dismissed when you send a reply, or after
     * 25 seconds — whichever comes first. Only valid for inbound WhatsApp messages. Use this when a
     * reply will take more than a couple of seconds (LLM agent, tool call, lookup) to improve the
     * recipient's experience.
     */
    fun showTyping(messageId: String): CompletableFuture<MessageShowTypingResponse> =
        showTyping(messageId, MessageShowTypingParams.none())

    /** @see showTyping */
    fun showTyping(
        messageId: String,
        params: MessageShowTypingParams = MessageShowTypingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageShowTypingResponse> =
        showTyping(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see showTyping */
    fun showTyping(
        messageId: String,
        params: MessageShowTypingParams = MessageShowTypingParams.none(),
    ): CompletableFuture<MessageShowTypingResponse> =
        showTyping(messageId, params, RequestOptions.none())

    /** @see showTyping */
    fun showTyping(
        params: MessageShowTypingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageShowTypingResponse>

    /** @see showTyping */
    fun showTyping(params: MessageShowTypingParams): CompletableFuture<MessageShowTypingResponse> =
        showTyping(params, RequestOptions.none())

    /** @see showTyping */
    fun showTyping(
        messageId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageShowTypingResponse> =
        showTyping(messageId, MessageShowTypingParams.none(), requestOptions)

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/messages/{messageId}`, but is otherwise the same
         * as [MessageServiceAsync.retrieve].
         */
        fun retrieve(messageId: String): CompletableFuture<HttpResponseFor<MessageResponse>> =
            retrieve(messageId, MessageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageResponse>> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageResponse>> =
            retrieve(messageId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessageResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageResponse>> =
            retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/messages`, but is otherwise the same as
         * [MessageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(MessageListParams.none())

        /** @see list */
        fun list(
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>>

        /** @see list */
        fun list(
            params: MessageListParams = MessageListParams.none()
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/messages/{messageId}/attachments`, but is
         * otherwise the same as [MessageServiceAsync.listAttachments].
         */
        fun listAttachments(
            messageId: String
        ): CompletableFuture<HttpResponseFor<MessageListAttachmentsResponse>> =
            listAttachments(messageId, MessageListAttachmentsParams.none())

        /** @see listAttachments */
        fun listAttachments(
            messageId: String,
            params: MessageListAttachmentsParams = MessageListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListAttachmentsResponse>> =
            listAttachments(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see listAttachments */
        fun listAttachments(
            messageId: String,
            params: MessageListAttachmentsParams = MessageListAttachmentsParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageListAttachmentsResponse>> =
            listAttachments(messageId, params, RequestOptions.none())

        /** @see listAttachments */
        fun listAttachments(
            params: MessageListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListAttachmentsResponse>>

        /** @see listAttachments */
        fun listAttachments(
            params: MessageListAttachmentsParams
        ): CompletableFuture<HttpResponseFor<MessageListAttachmentsResponse>> =
            listAttachments(params, RequestOptions.none())

        /** @see listAttachments */
        fun listAttachments(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListAttachmentsResponse>> =
            listAttachments(messageId, MessageListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/messages/{messageId}/reactions`, but is
         * otherwise the same as [MessageServiceAsync.react].
         */
        fun react(
            messageId: String,
            params: MessageReactParams,
        ): CompletableFuture<HttpResponseFor<MessageResponse>> =
            react(messageId, params, RequestOptions.none())

        /** @see react */
        fun react(
            messageId: String,
            params: MessageReactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageResponse>> =
            react(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see react */
        fun react(params: MessageReactParams): CompletableFuture<HttpResponseFor<MessageResponse>> =
            react(params, RequestOptions.none())

        /** @see react */
        fun react(
            params: MessageReactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/messages`, but is otherwise the same as
         * [MessageServiceAsync.send].
         */
        fun send(params: MessageSendParams): CompletableFuture<HttpResponseFor<MessageResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/messages/{messageId}/typing`, but is otherwise
         * the same as [MessageServiceAsync.showTyping].
         */
        fun showTyping(
            messageId: String
        ): CompletableFuture<HttpResponseFor<MessageShowTypingResponse>> =
            showTyping(messageId, MessageShowTypingParams.none())

        /** @see showTyping */
        fun showTyping(
            messageId: String,
            params: MessageShowTypingParams = MessageShowTypingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageShowTypingResponse>> =
            showTyping(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see showTyping */
        fun showTyping(
            messageId: String,
            params: MessageShowTypingParams = MessageShowTypingParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageShowTypingResponse>> =
            showTyping(messageId, params, RequestOptions.none())

        /** @see showTyping */
        fun showTyping(
            params: MessageShowTypingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageShowTypingResponse>>

        /** @see showTyping */
        fun showTyping(
            params: MessageShowTypingParams
        ): CompletableFuture<HttpResponseFor<MessageShowTypingResponse>> =
            showTyping(params, RequestOptions.none())

        /** @see showTyping */
        fun showTyping(
            messageId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageShowTypingResponse>> =
            showTyping(messageId, MessageShowTypingParams.none(), requestOptions)
    }
}
