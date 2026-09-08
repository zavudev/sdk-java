// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.messages.MessageListAttachmentsParams
import com.zavudev.api.models.messages.MessageListAttachmentsResponse
import com.zavudev.api.models.messages.MessageListPage
import com.zavudev.api.models.messages.MessageListParams
import com.zavudev.api.models.messages.MessageReactParams
import com.zavudev.api.models.messages.MessageResponse
import com.zavudev.api.models.messages.MessageRetrieveParams
import com.zavudev.api.models.messages.MessageSendParams
import com.zavudev.api.models.messages.MessageShowTypingParams
import com.zavudev.api.models.messages.MessageShowTypingResponse
import java.util.function.Consumer

interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService

    /** Get message by ID */
    fun retrieve(messageId: String): MessageResponse =
        retrieve(messageId, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageResponse = retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messageId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): MessageResponse = retrieve(messageId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageResponse

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): MessageResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(messageId: String, requestOptions: RequestOptions): MessageResponse =
        retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

    /** List messages previously sent by this project. */
    fun list(): MessageListPage = list(MessageListParams.none())

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListPage

    /** @see list */
    fun list(params: MessageListParams = MessageListParams.none()): MessageListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessageListPage =
        list(MessageListParams.none(), requestOptions)

    /**
     * List the stored file attachments for an email message and get a short-lived signed
     * `downloadUrl` for each. Works for both inbound emails (received via `message.inbound`) and
     * outbound emails you sent with attachments. Messages without stored attachments (including
     * SMS, WhatsApp, and other channels) return an empty list. Each `downloadUrl` is generated
     * fresh per request and expires — fetch the file promptly and do not cache the URL.
     */
    fun listAttachments(messageId: String): MessageListAttachmentsResponse =
        listAttachments(messageId, MessageListAttachmentsParams.none())

    /** @see listAttachments */
    fun listAttachments(
        messageId: String,
        params: MessageListAttachmentsParams = MessageListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListAttachmentsResponse =
        listAttachments(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see listAttachments */
    fun listAttachments(
        messageId: String,
        params: MessageListAttachmentsParams = MessageListAttachmentsParams.none(),
    ): MessageListAttachmentsResponse = listAttachments(messageId, params, RequestOptions.none())

    /** @see listAttachments */
    fun listAttachments(
        params: MessageListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListAttachmentsResponse

    /** @see listAttachments */
    fun listAttachments(params: MessageListAttachmentsParams): MessageListAttachmentsResponse =
        listAttachments(params, RequestOptions.none())

    /** @see listAttachments */
    fun listAttachments(
        messageId: String,
        requestOptions: RequestOptions,
    ): MessageListAttachmentsResponse =
        listAttachments(messageId, MessageListAttachmentsParams.none(), requestOptions)

    /**
     * Send an emoji reaction to an existing WhatsApp message. Reactions are only supported for
     * WhatsApp messages.
     */
    fun react(messageId: String, params: MessageReactParams): MessageResponse =
        react(messageId, params, RequestOptions.none())

    /** @see react */
    fun react(
        messageId: String,
        params: MessageReactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageResponse = react(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see react */
    fun react(params: MessageReactParams): MessageResponse = react(params, RequestOptions.none())

    /** @see react */
    fun react(
        params: MessageReactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageResponse

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
     * **Account verification and daily limits:**
     * - A brand-new account can send on every channel immediately, but `sms`, `sms_oneway` and
     *   `voice` reach only the phone numbers the project has verified. Sending elsewhere returns
     *   `403` with code `destination_not_verified`; `details.verifiedNumbers` lists the numbers
     *   that are reachable. A number is verified from the dashboard's Sandbox screen: generate a
     *   code and send the pre-filled WhatsApp message from that phone to Zavu's sandbox number. One
     *   verification covers WhatsApp, SMS and calls, up to 5 numbers per project. To send to any
     *   destination, do any one of these: verify your identity, add a payment method, settle a
     *   deposit, or subscribe to a paid plan. Business verification (KYB) is never required to send
     * - Daily ceilings apply per channel group and rise with verification. An account that has
     *   verified nothing: 25/day across `sms` + `sms_oneway`, 5/day for `voice`, 100/day across
     *   WhatsApp, Telegram, Instagram and Messenger combined. Past that floor: 200/day for SMS, or
     *   10,000/day once identity or business verification is approved (or a higher limit agreed for
     *   your account); 50/day voice and 250/day conversational on Free. **Paid plans have no voice
     *   or conversational daily ceiling.** Over a ceiling, sends return `429` with code
     *   `daily_limit_exceeded` and `details.limit`; the count resets at 00:00 UTC
     * - The daily ceiling never reduces the monthly allowance: 100/day on the conversational group
     *   still reaches the 2,000 monthly A2P messages Free includes
     * - Email needs no account verification here: a sender with a verified domain sends from day
     *   one, within the plan quota (100/day and 3,000/month on Free). Over the daily quota it
     *   returns `429` with code `daily_limit_exceeded`. Email broadcasts are the exception: they
     *   need the account past the unverified level, see `POST /v1/broadcasts/{broadcastId}/send`
     * - Full reference: https://docs.zavu.dev/concepts/sending-limits
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
    fun send(params: MessageSendParams): MessageResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageResponse

    /**
     * Mark an inbound WhatsApp message as read and display a typing indicator to the user while you
     * prepare a response. The indicator is automatically dismissed when you send a reply, or after
     * 25 seconds — whichever comes first. Only valid for inbound WhatsApp messages. Use this when a
     * reply will take more than a couple of seconds (LLM agent, tool call, lookup) to improve the
     * recipient's experience.
     */
    fun showTyping(messageId: String): MessageShowTypingResponse =
        showTyping(messageId, MessageShowTypingParams.none())

    /** @see showTyping */
    fun showTyping(
        messageId: String,
        params: MessageShowTypingParams = MessageShowTypingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageShowTypingResponse =
        showTyping(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see showTyping */
    fun showTyping(
        messageId: String,
        params: MessageShowTypingParams = MessageShowTypingParams.none(),
    ): MessageShowTypingResponse = showTyping(messageId, params, RequestOptions.none())

    /** @see showTyping */
    fun showTyping(
        params: MessageShowTypingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageShowTypingResponse

    /** @see showTyping */
    fun showTyping(params: MessageShowTypingParams): MessageShowTypingResponse =
        showTyping(params, RequestOptions.none())

    /** @see showTyping */
    fun showTyping(messageId: String, requestOptions: RequestOptions): MessageShowTypingResponse =
        showTyping(messageId, MessageShowTypingParams.none(), requestOptions)

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/messages/{messageId}`, but is otherwise the same
         * as [MessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(messageId: String): HttpResponseFor<MessageResponse> =
            retrieve(messageId, MessageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageResponse> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): HttpResponseFor<MessageResponse> = retrieve(messageId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MessageRetrieveParams): HttpResponseFor<MessageResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageResponse> =
            retrieve(messageId, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/messages`, but is otherwise the same as
         * [MessageService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MessageListPage> = list(MessageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams = MessageListParams.none()
        ): HttpResponseFor<MessageListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessageListPage> =
            list(MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/messages/{messageId}/attachments`, but is
         * otherwise the same as [MessageService.listAttachments].
         */
        @MustBeClosed
        fun listAttachments(messageId: String): HttpResponseFor<MessageListAttachmentsResponse> =
            listAttachments(messageId, MessageListAttachmentsParams.none())

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            messageId: String,
            params: MessageListAttachmentsParams = MessageListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListAttachmentsResponse> =
            listAttachments(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            messageId: String,
            params: MessageListAttachmentsParams = MessageListAttachmentsParams.none(),
        ): HttpResponseFor<MessageListAttachmentsResponse> =
            listAttachments(messageId, params, RequestOptions.none())

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            params: MessageListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListAttachmentsResponse>

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            params: MessageListAttachmentsParams
        ): HttpResponseFor<MessageListAttachmentsResponse> =
            listAttachments(params, RequestOptions.none())

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageListAttachmentsResponse> =
            listAttachments(messageId, MessageListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/messages/{messageId}/reactions`, but is
         * otherwise the same as [MessageService.react].
         */
        @MustBeClosed
        fun react(messageId: String, params: MessageReactParams): HttpResponseFor<MessageResponse> =
            react(messageId, params, RequestOptions.none())

        /** @see react */
        @MustBeClosed
        fun react(
            messageId: String,
            params: MessageReactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageResponse> =
            react(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see react */
        @MustBeClosed
        fun react(params: MessageReactParams): HttpResponseFor<MessageResponse> =
            react(params, RequestOptions.none())

        /** @see react */
        @MustBeClosed
        fun react(
            params: MessageReactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageResponse>

        /**
         * Returns a raw HTTP response for `post /v1/messages`, but is otherwise the same as
         * [MessageService.send].
         */
        @MustBeClosed
        fun send(params: MessageSendParams): HttpResponseFor<MessageResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageResponse>

        /**
         * Returns a raw HTTP response for `post /v1/messages/{messageId}/typing`, but is otherwise
         * the same as [MessageService.showTyping].
         */
        @MustBeClosed
        fun showTyping(messageId: String): HttpResponseFor<MessageShowTypingResponse> =
            showTyping(messageId, MessageShowTypingParams.none())

        /** @see showTyping */
        @MustBeClosed
        fun showTyping(
            messageId: String,
            params: MessageShowTypingParams = MessageShowTypingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageShowTypingResponse> =
            showTyping(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see showTyping */
        @MustBeClosed
        fun showTyping(
            messageId: String,
            params: MessageShowTypingParams = MessageShowTypingParams.none(),
        ): HttpResponseFor<MessageShowTypingResponse> =
            showTyping(messageId, params, RequestOptions.none())

        /** @see showTyping */
        @MustBeClosed
        fun showTyping(
            params: MessageShowTypingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageShowTypingResponse>

        /** @see showTyping */
        @MustBeClosed
        fun showTyping(
            params: MessageShowTypingParams
        ): HttpResponseFor<MessageShowTypingResponse> = showTyping(params, RequestOptions.none())

        /** @see showTyping */
        @MustBeClosed
        fun showTyping(
            messageId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageShowTypingResponse> =
            showTyping(messageId, MessageShowTypingParams.none(), requestOptions)
    }
}
