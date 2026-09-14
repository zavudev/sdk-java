// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.triggers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.Params
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Subscribe a function to one or more event types, optionally scoped to specific senders. Provide
 * eventTypes and senderIds (use null in senderIds for all senders); a trigger is created for each
 * event type and sender combination.
 *
 * The special event type `cron` runs the function on a schedule instead of a messaging event:
 * include a `cron` field with a 5-field UTC cron expression (minimum granularity one minute). A
 * cron trigger ignores the sender axis, and a function may hold several cron triggers with
 * different expressions. The function receives an event with `type: "cron"` and `data.cron`.
 */
class TriggerCreateParams
private constructor(
    private val functionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun functionId(): Optional<String> = Optional.ofNullable(functionId)

    /**
     * Event types to subscribe to.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTypes(): List<String> = body.eventTypes()

    /**
     * Senders to scope the triggers to. Use null for all senders.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderIds(): List<String?> = body.senderIds()

    /**
     * Required when eventTypes includes `cron`: a 5-field cron expression (minute hour day-of-month
     * month day-of-week), evaluated in UTC.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cron(): Optional<String> = body.cron()

    /**
     * Returns the raw JSON value of [eventTypes].
     *
     * Unlike [eventTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventTypes(): JsonField<List<String>> = body._eventTypes()

    /**
     * Returns the raw JSON value of [senderIds].
     *
     * Unlike [senderIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _senderIds(): JsonField<List<String?>> = body._senderIds()

    /**
     * Returns the raw JSON value of [cron].
     *
     * Unlike [cron], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cron(): JsonField<String> = body._cron()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TriggerCreateParams].
         *
         * The following fields are required:
         * ```java
         * .eventTypes()
         * .senderIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TriggerCreateParams]. */
    class Builder internal constructor() {

        private var functionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(triggerCreateParams: TriggerCreateParams) = apply {
            functionId = triggerCreateParams.functionId
            body = triggerCreateParams.body.toBuilder()
            additionalHeaders = triggerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = triggerCreateParams.additionalQueryParams.toBuilder()
        }

        fun functionId(functionId: String?) = apply { this.functionId = functionId }

        /** Alias for calling [Builder.functionId] with `functionId.orElse(null)`. */
        fun functionId(functionId: Optional<String>) = functionId(functionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [eventTypes]
         * - [senderIds]
         * - [cron]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Event types to subscribe to. */
        fun eventTypes(eventTypes: List<String>) = apply { body.eventTypes(eventTypes) }

        /**
         * Sets [Builder.eventTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTypes(eventTypes: JsonField<List<String>>) = apply { body.eventTypes(eventTypes) }

        /**
         * Adds a single [String] to [eventTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventType(eventType: String) = apply { body.addEventType(eventType) }

        /** Senders to scope the triggers to. Use null for all senders. */
        fun senderIds(senderIds: List<String?>) = apply { body.senderIds(senderIds) }

        /**
         * Sets [Builder.senderIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderIds] with a well-typed `List<String?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderIds(senderIds: JsonField<List<String?>>) = apply { body.senderIds(senderIds) }

        /**
         * Adds a single [String] to [senderIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSenderId(senderId: String) = apply { body.addSenderId(senderId) }

        /**
         * Required when eventTypes includes `cron`: a 5-field cron expression (minute hour
         * day-of-month month day-of-week), evaluated in UTC.
         */
        fun cron(cron: String) = apply { body.cron(cron) }

        /**
         * Sets [Builder.cron] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cron] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cron(cron: JsonField<String>) = apply { body.cron(cron) }

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
         * Returns an immutable instance of [TriggerCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventTypes()
         * .senderIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TriggerCreateParams =
            TriggerCreateParams(
                functionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> functionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val eventTypes: JsonField<List<String>>,
        private val senderIds: JsonField<List<String?>>,
        private val cron: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("eventTypes")
            @ExcludeMissing
            eventTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("senderIds")
            @ExcludeMissing
            senderIds: JsonField<List<String?>> = JsonMissing.of(),
            @JsonProperty("cron") @ExcludeMissing cron: JsonField<String> = JsonMissing.of(),
        ) : this(eventTypes, senderIds, cron, mutableMapOf())

        /**
         * Event types to subscribe to.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventTypes(): List<String> = eventTypes.getRequired("eventTypes")

        /**
         * Senders to scope the triggers to. Use null for all senders.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun senderIds(): List<String?> = senderIds.getRequired("senderIds")

        /**
         * Required when eventTypes includes `cron`: a 5-field cron expression (minute hour
         * day-of-month month day-of-week), evaluated in UTC.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cron(): Optional<String> = cron.getOptional("cron")

        /**
         * Returns the raw JSON value of [eventTypes].
         *
         * Unlike [eventTypes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eventTypes")
        @ExcludeMissing
        fun _eventTypes(): JsonField<List<String>> = eventTypes

        /**
         * Returns the raw JSON value of [senderIds].
         *
         * Unlike [senderIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senderIds")
        @ExcludeMissing
        fun _senderIds(): JsonField<List<String?>> = senderIds

        /**
         * Returns the raw JSON value of [cron].
         *
         * Unlike [cron], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cron") @ExcludeMissing fun _cron(): JsonField<String> = cron

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .eventTypes()
             * .senderIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var eventTypes: JsonField<MutableList<String>>? = null
            private var senderIds: JsonField<MutableList<String?>>? = null
            private var cron: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                eventTypes = body.eventTypes.map { it.toMutableList() }
                senderIds = body.senderIds.map { it.toMutableList() }
                cron = body.cron
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Event types to subscribe to. */
            fun eventTypes(eventTypes: List<String>) = eventTypes(JsonField.of(eventTypes))

            /**
             * Sets [Builder.eventTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventTypes] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventTypes(eventTypes: JsonField<List<String>>) = apply {
                this.eventTypes = eventTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [eventTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEventType(eventType: String) = apply {
                eventTypes =
                    (eventTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eventTypes", it).add(eventType)
                    }
            }

            /** Senders to scope the triggers to. Use null for all senders. */
            fun senderIds(senderIds: List<String?>) = senderIds(JsonField.of(senderIds))

            /**
             * Sets [Builder.senderIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderIds] with a well-typed `List<String?>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderIds(senderIds: JsonField<List<String?>>) = apply {
                this.senderIds = senderIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [senderIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSenderId(senderId: String) = apply {
                senderIds =
                    (senderIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("senderIds", it).add(senderId)
                    }
            }

            /**
             * Required when eventTypes includes `cron`: a 5-field cron expression (minute hour
             * day-of-month month day-of-week), evaluated in UTC.
             */
            fun cron(cron: String) = cron(JsonField.of(cron))

            /**
             * Sets [Builder.cron] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cron] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cron(cron: JsonField<String>) = apply { this.cron = cron }

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
             *
             * The following fields are required:
             * ```java
             * .eventTypes()
             * .senderIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("eventTypes", eventTypes).map { it.toImmutable() },
                    checkRequired("senderIds", senderIds).map { it.toImmutable() },
                    cron,
                    additionalProperties.toMutableMap(),
                )
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

            eventTypes()
            senderIds()
            cron()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (eventTypes.asKnown().getOrNull()?.size ?: 0) +
                (senderIds.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() }
                    ?: 0) +
                (if (cron.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                eventTypes == other.eventTypes &&
                senderIds == other.senderIds &&
                cron == other.cron &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(eventTypes, senderIds, cron, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{eventTypes=$eventTypes, senderIds=$senderIds, cron=$cron, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TriggerCreateParams &&
            functionId == other.functionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(functionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TriggerCreateParams{functionId=$functionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
