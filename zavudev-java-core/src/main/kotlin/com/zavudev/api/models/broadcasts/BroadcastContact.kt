// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BroadcastContact
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val recipient: JsonField<String>,
    private val recipientType: JsonField<RecipientType>,
    private val status: JsonField<BroadcastContactStatus>,
    private val cost: JsonField<Double>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val messageId: JsonField<String>,
    private val processedAt: JsonField<OffsetDateTime>,
    private val templateButtonVariables: JsonField<TemplateButtonVariables>,
    private val templateHeaderVariables: JsonField<TemplateHeaderVariables>,
    private val templateVariables: JsonField<TemplateVariables>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("recipient") @ExcludeMissing recipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipientType")
        @ExcludeMissing
        recipientType: JsonField<RecipientType> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<BroadcastContactStatus> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("errorCode") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("errorMessage")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messageId") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processedAt")
        @ExcludeMissing
        processedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("templateButtonVariables")
        @ExcludeMissing
        templateButtonVariables: JsonField<TemplateButtonVariables> = JsonMissing.of(),
        @JsonProperty("templateHeaderVariables")
        @ExcludeMissing
        templateHeaderVariables: JsonField<TemplateHeaderVariables> = JsonMissing.of(),
        @JsonProperty("templateVariables")
        @ExcludeMissing
        templateVariables: JsonField<TemplateVariables> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        recipient,
        recipientType,
        status,
        cost,
        errorCode,
        errorMessage,
        messageId,
        processedAt,
        templateButtonVariables,
        templateHeaderVariables,
        templateVariables,
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
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipient(): String = recipient.getRequired("recipient")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientType(): RecipientType = recipientType.getRequired("recipientType")

    /**
     * Status of a contact within a broadcast.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): BroadcastContactStatus = status.getRequired("status")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cost(): Optional<Double> = cost.getOptional("cost")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorCode(): Optional<String> = errorCode.getOptional("errorCode")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

    /**
     * Associated message ID after processing.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageId(): Optional<String> = messageId.getOptional("messageId")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processedAt(): Optional<OffsetDateTime> = processedAt.getOptional("processedAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateButtonVariables(): Optional<TemplateButtonVariables> =
        templateButtonVariables.getOptional("templateButtonVariables")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateHeaderVariables(): Optional<TemplateHeaderVariables> =
        templateHeaderVariables.getOptional("templateHeaderVariables")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateVariables(): Optional<TemplateVariables> =
        templateVariables.getOptional("templateVariables")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [recipient].
     *
     * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

    /**
     * Returns the raw JSON value of [recipientType].
     *
     * Unlike [recipientType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipientType")
    @ExcludeMissing
    fun _recipientType(): JsonField<RecipientType> = recipientType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<BroadcastContactStatus> = status

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorCode") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorMessage")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messageId") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

    /**
     * Returns the raw JSON value of [processedAt].
     *
     * Unlike [processedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processedAt")
    @ExcludeMissing
    fun _processedAt(): JsonField<OffsetDateTime> = processedAt

    /**
     * Returns the raw JSON value of [templateButtonVariables].
     *
     * Unlike [templateButtonVariables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("templateButtonVariables")
    @ExcludeMissing
    fun _templateButtonVariables(): JsonField<TemplateButtonVariables> = templateButtonVariables

    /**
     * Returns the raw JSON value of [templateHeaderVariables].
     *
     * Unlike [templateHeaderVariables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("templateHeaderVariables")
    @ExcludeMissing
    fun _templateHeaderVariables(): JsonField<TemplateHeaderVariables> = templateHeaderVariables

    /**
     * Returns the raw JSON value of [templateVariables].
     *
     * Unlike [templateVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("templateVariables")
    @ExcludeMissing
    fun _templateVariables(): JsonField<TemplateVariables> = templateVariables

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
         * Returns a mutable builder for constructing an instance of [BroadcastContact].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .recipient()
         * .recipientType()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BroadcastContact]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var recipient: JsonField<String>? = null
        private var recipientType: JsonField<RecipientType>? = null
        private var status: JsonField<BroadcastContactStatus>? = null
        private var cost: JsonField<Double> = JsonMissing.of()
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var messageId: JsonField<String> = JsonMissing.of()
        private var processedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var templateButtonVariables: JsonField<TemplateButtonVariables> = JsonMissing.of()
        private var templateHeaderVariables: JsonField<TemplateHeaderVariables> = JsonMissing.of()
        private var templateVariables: JsonField<TemplateVariables> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(broadcastContact: BroadcastContact) = apply {
            id = broadcastContact.id
            createdAt = broadcastContact.createdAt
            recipient = broadcastContact.recipient
            recipientType = broadcastContact.recipientType
            status = broadcastContact.status
            cost = broadcastContact.cost
            errorCode = broadcastContact.errorCode
            errorMessage = broadcastContact.errorMessage
            messageId = broadcastContact.messageId
            processedAt = broadcastContact.processedAt
            templateButtonVariables = broadcastContact.templateButtonVariables
            templateHeaderVariables = broadcastContact.templateHeaderVariables
            templateVariables = broadcastContact.templateVariables
            additionalProperties = broadcastContact.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun recipient(recipient: String) = recipient(JsonField.of(recipient))

        /**
         * Sets [Builder.recipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipient] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

        fun recipientType(recipientType: RecipientType) = recipientType(JsonField.of(recipientType))

        /**
         * Sets [Builder.recipientType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientType] with a well-typed [RecipientType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientType(recipientType: JsonField<RecipientType>) = apply {
            this.recipientType = recipientType
        }

        /** Status of a contact within a broadcast. */
        fun status(status: BroadcastContactStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [BroadcastContactStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<BroadcastContactStatus>) = apply { this.status = status }

        fun cost(cost: Double?) = cost(JsonField.ofNullable(cost))

        /**
         * Alias for [Builder.cost].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cost(cost: Double) = cost(cost as Double?)

        /** Alias for calling [Builder.cost] with `cost.orElse(null)`. */
        fun cost(cost: Optional<Double>) = cost(cost.getOrNull())

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

        fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** Associated message ID after processing. */
        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

        fun processedAt(processedAt: OffsetDateTime) = processedAt(JsonField.of(processedAt))

        /**
         * Sets [Builder.processedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processedAt(processedAt: JsonField<OffsetDateTime>) = apply {
            this.processedAt = processedAt
        }

        fun templateButtonVariables(templateButtonVariables: TemplateButtonVariables) =
            templateButtonVariables(JsonField.of(templateButtonVariables))

        /**
         * Sets [Builder.templateButtonVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateButtonVariables] with a well-typed
         * [TemplateButtonVariables] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun templateButtonVariables(templateButtonVariables: JsonField<TemplateButtonVariables>) =
            apply {
                this.templateButtonVariables = templateButtonVariables
            }

        fun templateHeaderVariables(templateHeaderVariables: TemplateHeaderVariables) =
            templateHeaderVariables(JsonField.of(templateHeaderVariables))

        /**
         * Sets [Builder.templateHeaderVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateHeaderVariables] with a well-typed
         * [TemplateHeaderVariables] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun templateHeaderVariables(templateHeaderVariables: JsonField<TemplateHeaderVariables>) =
            apply {
                this.templateHeaderVariables = templateHeaderVariables
            }

        fun templateVariables(templateVariables: TemplateVariables) =
            templateVariables(JsonField.of(templateVariables))

        /**
         * Sets [Builder.templateVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateVariables] with a well-typed [TemplateVariables]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun templateVariables(templateVariables: JsonField<TemplateVariables>) = apply {
            this.templateVariables = templateVariables
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
         * Returns an immutable instance of [BroadcastContact].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .recipient()
         * .recipientType()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BroadcastContact =
            BroadcastContact(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("recipient", recipient),
                checkRequired("recipientType", recipientType),
                checkRequired("status", status),
                cost,
                errorCode,
                errorMessage,
                messageId,
                processedAt,
                templateButtonVariables,
                templateHeaderVariables,
                templateVariables,
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
    fun validate(): BroadcastContact = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        recipient()
        recipientType().validate()
        status().validate()
        cost()
        errorCode()
        errorMessage()
        messageId()
        processedAt()
        templateButtonVariables().ifPresent { it.validate() }
        templateHeaderVariables().ifPresent { it.validate() }
        templateVariables().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (recipient.asKnown().isPresent) 1 else 0) +
            (recipientType.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cost.asKnown().isPresent) 1 else 0) +
            (if (errorCode.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (messageId.asKnown().isPresent) 1 else 0) +
            (if (processedAt.asKnown().isPresent) 1 else 0) +
            (templateButtonVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (templateHeaderVariables.asKnown().getOrNull()?.validity() ?: 0) +
            (templateVariables.asKnown().getOrNull()?.validity() ?: 0)

    class RecipientType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val PHONE = of("phone")

            @JvmField val EMAIL = of("email")

            @JvmStatic fun of(value: String) = RecipientType(JsonField.of(value))
        }

        /** An enum containing [RecipientType]'s known values. */
        enum class Known {
            PHONE,
            EMAIL,
        }

        /**
         * An enum containing [RecipientType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecipientType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PHONE,
            EMAIL,
            /**
             * An enum member indicating that [RecipientType] was instantiated with an unknown
             * value.
             */
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
                PHONE -> Value.PHONE
                EMAIL -> Value.EMAIL
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
                PHONE -> Known.PHONE
                EMAIL -> Known.EMAIL
                else -> throw ZavudevInvalidDataException("Unknown RecipientType: $value")
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
        fun validate(): RecipientType = apply {
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

            return other is RecipientType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TemplateButtonVariables
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TemplateButtonVariables].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateButtonVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateButtonVariables: TemplateButtonVariables) = apply {
                additionalProperties = templateButtonVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateButtonVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateButtonVariables =
                TemplateButtonVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateButtonVariables = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TemplateButtonVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TemplateButtonVariables{additionalProperties=$additionalProperties}"
    }

    class TemplateHeaderVariables
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TemplateHeaderVariables].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateHeaderVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateHeaderVariables: TemplateHeaderVariables) = apply {
                additionalProperties = templateHeaderVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateHeaderVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateHeaderVariables =
                TemplateHeaderVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateHeaderVariables = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TemplateHeaderVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TemplateHeaderVariables{additionalProperties=$additionalProperties}"
    }

    class TemplateVariables
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [TemplateVariables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TemplateVariables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(templateVariables: TemplateVariables) = apply {
                additionalProperties = templateVariables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TemplateVariables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TemplateVariables = TemplateVariables(additionalProperties.toImmutable())
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
        fun validate(): TemplateVariables = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TemplateVariables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TemplateVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BroadcastContact &&
            id == other.id &&
            createdAt == other.createdAt &&
            recipient == other.recipient &&
            recipientType == other.recipientType &&
            status == other.status &&
            cost == other.cost &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            messageId == other.messageId &&
            processedAt == other.processedAt &&
            templateButtonVariables == other.templateButtonVariables &&
            templateHeaderVariables == other.templateHeaderVariables &&
            templateVariables == other.templateVariables &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            recipient,
            recipientType,
            status,
            cost,
            errorCode,
            errorMessage,
            messageId,
            processedAt,
            templateButtonVariables,
            templateHeaderVariables,
            templateVariables,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BroadcastContact{id=$id, createdAt=$createdAt, recipient=$recipient, recipientType=$recipientType, status=$status, cost=$cost, errorCode=$errorCode, errorMessage=$errorMessage, messageId=$messageId, processedAt=$processedAt, templateButtonVariables=$templateButtonVariables, templateHeaderVariables=$templateHeaderVariables, templateVariables=$templateVariables, additionalProperties=$additionalProperties}"
}
