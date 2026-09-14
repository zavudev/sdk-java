// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.errors.ZavudevInvalidDataException

/**
 * Type of event that triggers the webhook.
 *
 * **Message lifecycle events:**
 * - `message.queued`: Message created and queued for sending. `data.status` = `queued`
 * - `message.sent`: Message accepted by the provider. `data.status` = `sent`
 * - `message.delivered`: Message delivered to recipient. `data.status` = `delivered`
 * - `message.read`: Message was read by the recipient (WhatsApp only). `data.status` = `read`
 * - `message.failed`: Message failed to send. `data.status` = `failed`
 *
 * **Inbound events:**
 * - `message.inbound`: New message received from a contact. `data.conversationId` is the inbox
 *   thread id (deep-link with `https://dashboard.zavu.dev/{locale}/inbox?conv={conversationId}`);
 *   it is `null` while the conversation row is still being created (the first message of a
 *   brand-new thread, or several near-simultaneous first messages), where `conversation.new`
 *   carries the id instead — `GET /v1/messages/{messageId}` always has it. Reactions are delivered
 *   as `message.inbound` with `messageType='reaction'`. When the contact replied to (quoted) an
 *   earlier message, `data.content` carries the reply context: `replyToMessageId`,
 *   `replyToProviderMessageId`, `replyToFrom`, `replyToText`, and `replyToMessageType`.
 *   `data.providerTimestamp` is the provider's original receive time in Unix milliseconds (the
 *   moment the channel received the message from the contact — WhatsApp, Telegram, Instagram,
 *   Messenger; `null` for SMS and email). Compare it against the top-level `timestamp` (when Zavu
 *   dispatched the webhook) to detect and ignore delayed deliveries. When the conversation was
 *   opened from a Click-to-WhatsApp ad or post, `data.referral` carries the ad attribution —
 *   including `ctwaClid`, the identifier Meta's Conversions API needs to credit a conversion back
 *   to that ad. WhatsApp only, and only on the first message of the thread: it is absent from every
 *   later message, so persist it when it arrives.
 * - `message.unsupported`: Received a message type that is not supported
 *
 * **Broadcast events:**
 * - `broadcast.status_changed`: Broadcast status changed (pending_review, approved, rejected,
 *   sending, completed, cancelled)
 *
 * **Other events:**
 * - `conversation.new`: New conversation started with a contact. `data` carries `conversationId`
 *   (the inbox thread id — deep-link with
 *   `https://dashboard.zavu.dev/{locale}/inbox?conv={conversationId}`), the `phoneNumber` or
 *   `email` key, `channel`, `firstMessageId`, `firstMessageText`, and `profileName`.
 * - `template.status_changed`: WhatsApp template approval status changed
 *
 * **Partner events:**
 * - `invitation.status_changed`: A partner invitation status changed (pending, in_progress,
 *   completed, cancelled, failed). `data` carries `invitationId`, `clientName`, `clientEmail`,
 *   `connectionType` (`whatsapp_waba` or `messenger`), `previousStatus`, and `currentStatus`. On
 *   `completed` it also carries `senderId` and `connectedAccount` (`channel`, `id`, `name`) — the
 *   WhatsApp number or Facebook Page that was linked. On `failed` it carries `failureReason`; the
 *   invitation link stays usable, so a client can retry it.
 *
 * **Voice Agent events:** For every voice event, `data` carries `callId`, `direction`, `from`,
 * `to`, `status`, `durationSeconds`, `endReason`, and `transcriptAvailable`. The terminal events
 * (`call.completed`, `call.failed`) additionally carry `cost` — what the call was billed, in USD,
 * combining telephony and the managed voice pipeline — and `currency`. They are dispatched after
 * the call is charged, so `cost` is populated rather than zero; telephony can still be settling on
 * an outbound call, in which case `GET /v1/calls/{callId}` holds the reconciled figure.
 * - `call.initiated`: An outbound call was created and is dialing, or an inbound call was received.
 *   `data.status` = `ringing`
 * - `call.answered`: The call was answered and the voice agent is connected. `data.status` =
 *   `in_progress`
 * - `call.completed`: The call ended after a conversation. `data.status` = `completed`;
 *   `durationSeconds` and `endReason` describe how it ended, and `transcriptAvailable` indicates
 *   whether a transcript can be fetched.
 * - `call.failed`: The call could not be completed (busy, no answer, canceled, or an error).
 *   `data.status` is the terminal status and `endReason` explains the cause.
 *
 * **Custom domain events:**
 * - `domain.verified`: A custom email domain passed verification (DKIM, and SPF/DMARC/MAIL FROM if
 *   enhanced records are enabled)
 * - `domain.failed`: A custom email domain failed verification or is partially verified
 */
class WebhookEvent @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val MESSAGE_QUEUED = of("message.queued")

        @JvmField val MESSAGE_SENT = of("message.sent")

        @JvmField val MESSAGE_DELIVERED = of("message.delivered")

        @JvmField val MESSAGE_READ = of("message.read")

        @JvmField val MESSAGE_STATUS = of("message.status")

        @JvmField val MESSAGE_FAILED = of("message.failed")

        @JvmField val MESSAGE_INBOUND = of("message.inbound")

        @JvmField val MESSAGE_UNSUPPORTED = of("message.unsupported")

        @JvmField val BROADCAST_STATUS_CHANGED = of("broadcast.status_changed")

        @JvmField val CONVERSATION_NEW = of("conversation.new")

        @JvmField val TEMPLATE_STATUS_CHANGED = of("template.status_changed")

        @JvmField val INVITATION_STATUS_CHANGED = of("invitation.status_changed")

        @JvmField val CALL_INITIATED = of("call.initiated")

        @JvmField val CALL_ANSWERED = of("call.answered")

        @JvmField val CALL_COMPLETED = of("call.completed")

        @JvmField val CALL_FAILED = of("call.failed")

        @JvmField val DOMAIN_VERIFIED = of("domain.verified")

        @JvmField val DOMAIN_FAILED = of("domain.failed")

        @JvmStatic fun of(value: String) = WebhookEvent(JsonField.of(value))
    }

    /** An enum containing [WebhookEvent]'s known values. */
    enum class Known {
        MESSAGE_QUEUED,
        MESSAGE_SENT,
        MESSAGE_DELIVERED,
        MESSAGE_READ,
        MESSAGE_STATUS,
        MESSAGE_FAILED,
        MESSAGE_INBOUND,
        MESSAGE_UNSUPPORTED,
        BROADCAST_STATUS_CHANGED,
        CONVERSATION_NEW,
        TEMPLATE_STATUS_CHANGED,
        INVITATION_STATUS_CHANGED,
        CALL_INITIATED,
        CALL_ANSWERED,
        CALL_COMPLETED,
        CALL_FAILED,
        DOMAIN_VERIFIED,
        DOMAIN_FAILED,
    }

    /**
     * An enum containing [WebhookEvent]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [WebhookEvent] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        MESSAGE_QUEUED,
        MESSAGE_SENT,
        MESSAGE_DELIVERED,
        MESSAGE_READ,
        MESSAGE_STATUS,
        MESSAGE_FAILED,
        MESSAGE_INBOUND,
        MESSAGE_UNSUPPORTED,
        BROADCAST_STATUS_CHANGED,
        CONVERSATION_NEW,
        TEMPLATE_STATUS_CHANGED,
        INVITATION_STATUS_CHANGED,
        CALL_INITIATED,
        CALL_ANSWERED,
        CALL_COMPLETED,
        CALL_FAILED,
        DOMAIN_VERIFIED,
        DOMAIN_FAILED,
        /** An enum member indicating that [WebhookEvent] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            MESSAGE_QUEUED -> Value.MESSAGE_QUEUED
            MESSAGE_SENT -> Value.MESSAGE_SENT
            MESSAGE_DELIVERED -> Value.MESSAGE_DELIVERED
            MESSAGE_READ -> Value.MESSAGE_READ
            MESSAGE_STATUS -> Value.MESSAGE_STATUS
            MESSAGE_FAILED -> Value.MESSAGE_FAILED
            MESSAGE_INBOUND -> Value.MESSAGE_INBOUND
            MESSAGE_UNSUPPORTED -> Value.MESSAGE_UNSUPPORTED
            BROADCAST_STATUS_CHANGED -> Value.BROADCAST_STATUS_CHANGED
            CONVERSATION_NEW -> Value.CONVERSATION_NEW
            TEMPLATE_STATUS_CHANGED -> Value.TEMPLATE_STATUS_CHANGED
            INVITATION_STATUS_CHANGED -> Value.INVITATION_STATUS_CHANGED
            CALL_INITIATED -> Value.CALL_INITIATED
            CALL_ANSWERED -> Value.CALL_ANSWERED
            CALL_COMPLETED -> Value.CALL_COMPLETED
            CALL_FAILED -> Value.CALL_FAILED
            DOMAIN_VERIFIED -> Value.DOMAIN_VERIFIED
            DOMAIN_FAILED -> Value.DOMAIN_FAILED
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws ZavudevInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            MESSAGE_QUEUED -> Known.MESSAGE_QUEUED
            MESSAGE_SENT -> Known.MESSAGE_SENT
            MESSAGE_DELIVERED -> Known.MESSAGE_DELIVERED
            MESSAGE_READ -> Known.MESSAGE_READ
            MESSAGE_STATUS -> Known.MESSAGE_STATUS
            MESSAGE_FAILED -> Known.MESSAGE_FAILED
            MESSAGE_INBOUND -> Known.MESSAGE_INBOUND
            MESSAGE_UNSUPPORTED -> Known.MESSAGE_UNSUPPORTED
            BROADCAST_STATUS_CHANGED -> Known.BROADCAST_STATUS_CHANGED
            CONVERSATION_NEW -> Known.CONVERSATION_NEW
            TEMPLATE_STATUS_CHANGED -> Known.TEMPLATE_STATUS_CHANGED
            INVITATION_STATUS_CHANGED -> Known.INVITATION_STATUS_CHANGED
            CALL_INITIATED -> Known.CALL_INITIATED
            CALL_ANSWERED -> Known.CALL_ANSWERED
            CALL_COMPLETED -> Known.CALL_COMPLETED
            CALL_FAILED -> Known.CALL_FAILED
            DOMAIN_VERIFIED -> Known.DOMAIN_VERIFIED
            DOMAIN_FAILED -> Known.DOMAIN_FAILED
            else -> throw ZavudevInvalidDataException("Unknown WebhookEvent: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws ZavudevInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { ZavudevInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): WebhookEvent = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ZavudevInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookEvent && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
