// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.Params
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Start sending the broadcast immediately or schedule for later.
 *
 * **The account must be past the sandbox level to send, except on WhatsApp.** An account that has
 * verified nothing is refused with `403` and code `kyc_required` on every channel other than
 * `whatsapp`. Any one of these lifts it: identity verification (KYC), a saved payment method, a
 * settled deposit, or a paid plan. Business verification (KYB) is not required to broadcast; it
 * gates 10DLC registration only. A `whatsapp` broadcast is exempt: it can only be built on a
 * template, and Meta vets the business and the content when it approves that template, so an
 * unapproved template is refused instead. `smart` is not exempt, since it can route a contact to
 * SMS or email. Drafts can be created, edited and kept without any check. Every send path
 * (dashboard, API and CLI) enforces the same rule.
 *
 * **Daily ceilings apply per recipient.** Each message a broadcast sends counts against the
 * channel's daily ceiling (see `POST /v1/messages`). Once the ceiling is reached, the remaining
 * recipients are marked `failed` with `errorCode` `DAILY_LIMIT_EXCEEDED`; they are not retried the
 * next day.
 *
 * **Review depends on the channel, and cannot be bypassed.** A draft is submitted to automated
 * content review here; it does not go straight out. A WhatsApp broadcast built on a Meta-approved
 * template skips review (Meta already vetted the content) and begins sending. An email broadcast
 * sends as soon as the automated review passes. Every other channel moves to `pending_admin_review`
 * and waits for a person. If the review rejects it, use PATCH to edit the content then call POST
 * /retry-review.
 *
 * Calling this on a broadcast that is already `approved` or `scheduled` sends or reschedules it
 * directly, since it has already been reviewed. Reserves the estimated cost from your balance.
 */
class BroadcastSendParams
private constructor(
    private val broadcastId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun broadcastId(): Optional<String> = Optional.ofNullable(broadcastId)

    /**
     * Schedule for future delivery. Omit to send immediately.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledAt(): Optional<OffsetDateTime> = body.scheduledAt()

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scheduledAt(): JsonField<OffsetDateTime> = body._scheduledAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BroadcastSendParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BroadcastSendParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BroadcastSendParams]. */
    class Builder internal constructor() {

        private var broadcastId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(broadcastSendParams: BroadcastSendParams) = apply {
            broadcastId = broadcastSendParams.broadcastId
            body = broadcastSendParams.body.toBuilder()
            additionalHeaders = broadcastSendParams.additionalHeaders.toBuilder()
            additionalQueryParams = broadcastSendParams.additionalQueryParams.toBuilder()
        }

        fun broadcastId(broadcastId: String?) = apply { this.broadcastId = broadcastId }

        /** Alias for calling [Builder.broadcastId] with `broadcastId.orElse(null)`. */
        fun broadcastId(broadcastId: Optional<String>) = broadcastId(broadcastId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [scheduledAt]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Schedule for future delivery. Omit to send immediately. */
        fun scheduledAt(scheduledAt: OffsetDateTime) = apply { body.scheduledAt(scheduledAt) }

        /**
         * Sets [Builder.scheduledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            body.scheduledAt(scheduledAt)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [BroadcastSendParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BroadcastSendParams =
            BroadcastSendParams(
                broadcastId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> broadcastId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scheduledAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scheduledAt")
            @ExcludeMissing
            scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(scheduledAt, mutableMapOf())

        /**
         * Schedule for future delivery. Omit to send immediately.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scheduledAt(): Optional<OffsetDateTime> = scheduledAt.getOptional("scheduledAt")

        /**
         * Returns the raw JSON value of [scheduledAt].
         *
         * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scheduledAt")
        @ExcludeMissing
        fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                scheduledAt = body.scheduledAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Schedule for future delivery. Omit to send immediately. */
            fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

            /**
             * Sets [Builder.scheduledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
                this.scheduledAt = scheduledAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(scheduledAt, additionalProperties.toMutableMap())
        }

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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            scheduledAt()
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
        @JvmSynthetic internal fun validity(): Int = (if (scheduledAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                scheduledAt == other.scheduledAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(scheduledAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{scheduledAt=$scheduledAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BroadcastSendParams &&
            broadcastId == other.broadcastId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(broadcastId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BroadcastSendParams{broadcastId=$broadcastId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
