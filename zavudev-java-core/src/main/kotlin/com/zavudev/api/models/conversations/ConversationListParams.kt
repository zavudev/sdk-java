// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.fasterxml.jackson.annotation.JsonCreator
import com.zavudev.api.core.Enum
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.Params
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List inbox threads, most recently active first. A conversation groups every message with one
 * contact across channels, which is what you need to build an inbox: `GET /v1/messages` returns a
 * flat log with no thread to hang it on.
 *
 * Use `senderId` to scope the list to a single number, and `channel` to keep only threads that have
 * carried that channel.
 */
class ConversationListParams
private constructor(
    private val channel: Channel?,
    private val cursor: String?,
    private val limit: Long?,
    private val search: String?,
    private val senderId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Keep only threads that have carried this channel. */
    fun channel(): Optional<Channel> = Optional.ofNullable(channel)

    /** Opaque cursor from a previous response's `nextCursor`. Do not construct it. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * Search threads by identity: phone number (any format — `+1 (555) 123-4567` and `15551234567`
     * both match), email address (full or local part), WhatsApp group subject, WhatsApp username,
     * or BSUID. Matching is by whole word, with prefix matching on the last term, so `mar` finds
     * `maria@example.com` and `+1555` finds `+15551234567`; a fragment from the middle or end of a
     * number (`4567`) does not match.
     *
     * It does **not** search message bodies — only who the thread is with.
     *
     * Results come back ranked by relevance rather than by recency, so the usual "most recently
     * active first" ordering does not apply while `q` is set. `senderId` and `channel` still narrow
     * the results, and `cursor` paginates them as usual. An empty or whitespace-only `q` returns no
     * items rather than the full list.
     */
    fun search(): Optional<String> = Optional.ofNullable(search)

    /** Keep only threads last handled by this sender. */
    fun senderId(): Optional<String> = Optional.ofNullable(senderId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ConversationListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ConversationListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationListParams]. */
    class Builder internal constructor() {

        private var channel: Channel? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var search: String? = null
        private var senderId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(conversationListParams: ConversationListParams) = apply {
            channel = conversationListParams.channel
            cursor = conversationListParams.cursor
            limit = conversationListParams.limit
            search = conversationListParams.search
            senderId = conversationListParams.senderId
            additionalHeaders = conversationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = conversationListParams.additionalQueryParams.toBuilder()
        }

        /** Keep only threads that have carried this channel. */
        fun channel(channel: Channel?) = apply { this.channel = channel }

        /** Alias for calling [Builder.channel] with `channel.orElse(null)`. */
        fun channel(channel: Optional<Channel>) = channel(channel.getOrNull())

        /** Opaque cursor from a previous response's `nextCursor`. Do not construct it. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /**
         * Search threads by identity: phone number (any format — `+1 (555) 123-4567` and
         * `15551234567` both match), email address (full or local part), WhatsApp group subject,
         * WhatsApp username, or BSUID. Matching is by whole word, with prefix matching on the last
         * term, so `mar` finds `maria@example.com` and `+1555` finds `+15551234567`; a fragment
         * from the middle or end of a number (`4567`) does not match.
         *
         * It does **not** search message bodies — only who the thread is with.
         *
         * Results come back ranked by relevance rather than by recency, so the usual "most recently
         * active first" ordering does not apply while `q` is set. `senderId` and `channel` still
         * narrow the results, and `cursor` paginates them as usual. An empty or whitespace-only `q`
         * returns no items rather than the full list.
         */
        fun search(search: String?) = apply { this.search = search }

        /** Alias for calling [Builder.search] with `search.orElse(null)`. */
        fun search(search: Optional<String>) = search(search.getOrNull())

        /** Keep only threads last handled by this sender. */
        fun senderId(senderId: String?) = apply { this.senderId = senderId }

        /** Alias for calling [Builder.senderId] with `senderId.orElse(null)`. */
        fun senderId(senderId: Optional<String>) = senderId(senderId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ConversationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConversationListParams =
            ConversationListParams(
                channel,
                cursor,
                limit,
                search,
                senderId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                channel?.let { put("channel", it.toString()) }
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                search?.let { put("search", it) }
                senderId?.let { put("senderId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Keep only threads that have carried this channel. */
    class Channel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SMS = of("sms")

            @JvmField val SMS_ONEWAY = of("sms_oneway")

            @JvmField val WHATSAPP = of("whatsapp")

            @JvmField val EMAIL = of("email")

            @JvmField val TELEGRAM = of("telegram")

            @JvmField val INSTAGRAM = of("instagram")

            @JvmField val MESSENGER = of("messenger")

            @JvmField val VOICE = of("voice")

            @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
        }

        /** An enum containing [Channel]'s known values. */
        enum class Known {
            SMS,
            SMS_ONEWAY,
            WHATSAPP,
            EMAIL,
            TELEGRAM,
            INSTAGRAM,
            MESSENGER,
            VOICE,
        }

        /**
         * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS,
            SMS_ONEWAY,
            WHATSAPP,
            EMAIL,
            TELEGRAM,
            INSTAGRAM,
            MESSENGER,
            VOICE,
            /** An enum member indicating that [Channel] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SMS -> Value.SMS
                SMS_ONEWAY -> Value.SMS_ONEWAY
                WHATSAPP -> Value.WHATSAPP
                EMAIL -> Value.EMAIL
                TELEGRAM -> Value.TELEGRAM
                INSTAGRAM -> Value.INSTAGRAM
                MESSENGER -> Value.MESSENGER
                VOICE -> Value.VOICE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ZavudevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SMS -> Known.SMS
                SMS_ONEWAY -> Known.SMS_ONEWAY
                WHATSAPP -> Known.WHATSAPP
                EMAIL -> Known.EMAIL
                TELEGRAM -> Known.TELEGRAM
                INSTAGRAM -> Known.INSTAGRAM
                MESSENGER -> Known.MESSENGER
                VOICE -> Known.VOICE
                else -> throw ZavudevInvalidDataException("Unknown Channel: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ZavudevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { ZavudevInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Channel = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Channel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationListParams &&
            channel == other.channel &&
            cursor == other.cursor &&
            limit == other.limit &&
            search == other.search &&
            senderId == other.senderId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            channel,
            cursor,
            limit,
            search,
            senderId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ConversationListParams{channel=$channel, cursor=$cursor, limit=$limit, search=$search, senderId=$senderId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
