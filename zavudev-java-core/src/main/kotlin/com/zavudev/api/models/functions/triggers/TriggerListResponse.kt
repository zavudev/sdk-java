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
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TriggerListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val triggers: JsonField<List<Trigger>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("triggers")
        @ExcludeMissing
        triggers: JsonField<List<Trigger>> = JsonMissing.of()
    ) : this(triggers, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun triggers(): List<Trigger> = triggers.getRequired("triggers")

    /**
     * Returns the raw JSON value of [triggers].
     *
     * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggers") @ExcludeMissing fun _triggers(): JsonField<List<Trigger>> = triggers

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
         * Returns a mutable builder for constructing an instance of [TriggerListResponse].
         *
         * The following fields are required:
         * ```java
         * .triggers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TriggerListResponse]. */
    class Builder internal constructor() {

        private var triggers: JsonField<MutableList<Trigger>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(triggerListResponse: TriggerListResponse) = apply {
            triggers = triggerListResponse.triggers.map { it.toMutableList() }
            additionalProperties = triggerListResponse.additionalProperties.toMutableMap()
        }

        fun triggers(triggers: List<Trigger>) = triggers(JsonField.of(triggers))

        /**
         * Sets [Builder.triggers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggers] with a well-typed `List<Trigger>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun triggers(triggers: JsonField<List<Trigger>>) = apply {
            this.triggers = triggers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Trigger] to [triggers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrigger(trigger: Trigger) = apply {
            triggers =
                (triggers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("triggers", it).add(trigger)
                }
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
         * Returns an immutable instance of [TriggerListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .triggers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TriggerListResponse =
            TriggerListResponse(
                checkRequired("triggers", triggers).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TriggerListResponse = apply {
        if (validated) {
            return@apply
        }

        triggers().forEach { it.validate() }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (triggers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** A subscription that runs a Zavu Function when a messaging event fires. */
    class Trigger
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val eventType: JsonField<String>,
        private val functionId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val cron: JsonField<String>,
        private val lastRunAt: JsonField<OffsetDateTime>,
        private val nextRunAt: JsonField<OffsetDateTime>,
        private val senderId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("eventType")
            @ExcludeMissing
            eventType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("functionId")
            @ExcludeMissing
            functionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cron") @ExcludeMissing cron: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastRunAt")
            @ExcludeMissing
            lastRunAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("nextRunAt")
            @ExcludeMissing
            nextRunAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("senderId") @ExcludeMissing senderId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            active,
            createdAt,
            eventType,
            functionId,
            updatedAt,
            cron,
            lastRunAt,
            nextRunAt,
            senderId,
            mutableMapOf(),
        )

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean = active.getRequired("active")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Event type that fires the function. See GET /v1/functions/event-types for the supported
         * list. The special type `cron` fires on a schedule instead of a messaging event and
         * carries a `cron` expression.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): String = eventType.getRequired("eventType")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun functionId(): String = functionId.getRequired("functionId")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * 5-field cron expression (minute hour day-of-month month day-of-week), evaluated in UTC.
         * Present only on `cron` triggers.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cron(): Optional<String> = cron.getOptional("cron")

        /**
         * Last time the schedule fired. Null until the first fire.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastRunAt(): Optional<OffsetDateTime> = lastRunAt.getOptional("lastRunAt")

        /**
         * Next scheduled fire time. Present only on `cron` triggers.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextRunAt(): Optional<OffsetDateTime> = nextRunAt.getOptional("nextRunAt")

        /**
         * Restrict the trigger to a single sender. Null means all senders in the project.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun senderId(): Optional<String> = senderId.getOptional("senderId")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eventType") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

        /**
         * Returns the raw JSON value of [functionId].
         *
         * Unlike [functionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("functionId")
        @ExcludeMissing
        fun _functionId(): JsonField<String> = functionId

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [cron].
         *
         * Unlike [cron], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cron") @ExcludeMissing fun _cron(): JsonField<String> = cron

        /**
         * Returns the raw JSON value of [lastRunAt].
         *
         * Unlike [lastRunAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastRunAt")
        @ExcludeMissing
        fun _lastRunAt(): JsonField<OffsetDateTime> = lastRunAt

        /**
         * Returns the raw JSON value of [nextRunAt].
         *
         * Unlike [nextRunAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nextRunAt")
        @ExcludeMissing
        fun _nextRunAt(): JsonField<OffsetDateTime> = nextRunAt

        /**
         * Returns the raw JSON value of [senderId].
         *
         * Unlike [senderId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senderId") @ExcludeMissing fun _senderId(): JsonField<String> = senderId

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
             * Returns a mutable builder for constructing an instance of [Trigger].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .active()
             * .createdAt()
             * .eventType()
             * .functionId()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Trigger]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var active: JsonField<Boolean>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var eventType: JsonField<String>? = null
            private var functionId: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var cron: JsonField<String> = JsonMissing.of()
            private var lastRunAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var nextRunAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var senderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trigger: Trigger) = apply {
                id = trigger.id
                active = trigger.active
                createdAt = trigger.createdAt
                eventType = trigger.eventType
                functionId = trigger.functionId
                updatedAt = trigger.updatedAt
                cron = trigger.cron
                lastRunAt = trigger.lastRunAt
                nextRunAt = trigger.nextRunAt
                senderId = trigger.senderId
                additionalProperties = trigger.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Event type that fires the function. See GET /v1/functions/event-types for the
             * supported list. The special type `cron` fires on a schedule instead of a messaging
             * event and carries a `cron` expression.
             */
            fun eventType(eventType: String) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

            fun functionId(functionId: String) = functionId(JsonField.of(functionId))

            /**
             * Sets [Builder.functionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functionId(functionId: JsonField<String>) = apply { this.functionId = functionId }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * 5-field cron expression (minute hour day-of-month month day-of-week), evaluated in
             * UTC. Present only on `cron` triggers.
             */
            fun cron(cron: String?) = cron(JsonField.ofNullable(cron))

            /** Alias for calling [Builder.cron] with `cron.orElse(null)`. */
            fun cron(cron: Optional<String>) = cron(cron.getOrNull())

            /**
             * Sets [Builder.cron] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cron] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cron(cron: JsonField<String>) = apply { this.cron = cron }

            /** Last time the schedule fired. Null until the first fire. */
            fun lastRunAt(lastRunAt: OffsetDateTime?) = lastRunAt(JsonField.ofNullable(lastRunAt))

            /** Alias for calling [Builder.lastRunAt] with `lastRunAt.orElse(null)`. */
            fun lastRunAt(lastRunAt: Optional<OffsetDateTime>) = lastRunAt(lastRunAt.getOrNull())

            /**
             * Sets [Builder.lastRunAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastRunAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastRunAt(lastRunAt: JsonField<OffsetDateTime>) = apply {
                this.lastRunAt = lastRunAt
            }

            /** Next scheduled fire time. Present only on `cron` triggers. */
            fun nextRunAt(nextRunAt: OffsetDateTime?) = nextRunAt(JsonField.ofNullable(nextRunAt))

            /** Alias for calling [Builder.nextRunAt] with `nextRunAt.orElse(null)`. */
            fun nextRunAt(nextRunAt: Optional<OffsetDateTime>) = nextRunAt(nextRunAt.getOrNull())

            /**
             * Sets [Builder.nextRunAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextRunAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextRunAt(nextRunAt: JsonField<OffsetDateTime>) = apply {
                this.nextRunAt = nextRunAt
            }

            /** Restrict the trigger to a single sender. Null means all senders in the project. */
            fun senderId(senderId: String?) = senderId(JsonField.ofNullable(senderId))

            /** Alias for calling [Builder.senderId] with `senderId.orElse(null)`. */
            fun senderId(senderId: Optional<String>) = senderId(senderId.getOrNull())

            /**
             * Sets [Builder.senderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderId(senderId: JsonField<String>) = apply { this.senderId = senderId }

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
             * Returns an immutable instance of [Trigger].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .active()
             * .createdAt()
             * .eventType()
             * .functionId()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Trigger =
                Trigger(
                    checkRequired("id", id),
                    checkRequired("active", active),
                    checkRequired("createdAt", createdAt),
                    checkRequired("eventType", eventType),
                    checkRequired("functionId", functionId),
                    checkRequired("updatedAt", updatedAt),
                    cron,
                    lastRunAt,
                    nextRunAt,
                    senderId,
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
        fun validate(): Trigger = apply {
            if (validated) {
                return@apply
            }

            id()
            active()
            createdAt()
            eventType()
            functionId()
            updatedAt()
            cron()
            lastRunAt()
            nextRunAt()
            senderId()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (active.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (eventType.asKnown().isPresent) 1 else 0) +
                (if (functionId.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (cron.asKnown().isPresent) 1 else 0) +
                (if (lastRunAt.asKnown().isPresent) 1 else 0) +
                (if (nextRunAt.asKnown().isPresent) 1 else 0) +
                (if (senderId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trigger &&
                id == other.id &&
                active == other.active &&
                createdAt == other.createdAt &&
                eventType == other.eventType &&
                functionId == other.functionId &&
                updatedAt == other.updatedAt &&
                cron == other.cron &&
                lastRunAt == other.lastRunAt &&
                nextRunAt == other.nextRunAt &&
                senderId == other.senderId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                active,
                createdAt,
                eventType,
                functionId,
                updatedAt,
                cron,
                lastRunAt,
                nextRunAt,
                senderId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trigger{id=$id, active=$active, createdAt=$createdAt, eventType=$eventType, functionId=$functionId, updatedAt=$updatedAt, cron=$cron, lastRunAt=$lastRunAt, nextRunAt=$nextRunAt, senderId=$senderId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TriggerListResponse &&
            triggers == other.triggers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(triggers, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TriggerListResponse{triggers=$triggers, additionalProperties=$additionalProperties}"
}
