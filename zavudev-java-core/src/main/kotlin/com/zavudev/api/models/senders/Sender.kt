// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

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

class Sender
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val channels: JsonField<List<String>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val emailAddress: JsonField<String>,
    private val emailCatchAllEnabled: JsonField<Boolean>,
    private val emailReceivingEnabled: JsonField<Boolean>,
    private val isDefault: JsonField<Boolean>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val webhook: JsonField<SenderWebhook>,
    private val whatsapp: JsonField<Whatsapp>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channels")
        @ExcludeMissing
        channels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("emailAddress")
        @ExcludeMissing
        emailAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailCatchAllEnabled")
        @ExcludeMissing
        emailCatchAllEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("emailReceivingEnabled")
        @ExcludeMissing
        emailReceivingEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isDefault") @ExcludeMissing isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("webhook")
        @ExcludeMissing
        webhook: JsonField<SenderWebhook> = JsonMissing.of(),
        @JsonProperty("whatsapp") @ExcludeMissing whatsapp: JsonField<Whatsapp> = JsonMissing.of(),
    ) : this(
        id,
        name,
        phoneNumber,
        channels,
        createdAt,
        emailAddress,
        emailCatchAllEnabled,
        emailReceivingEnabled,
        isDefault,
        updatedAt,
        webhook,
        whatsapp,
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
    fun name(): String = name.getRequired("name")

    /**
     * Phone number in E.164 format.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

    /**
     * Channels this sender can actually send on right now, computed from its configuration. Empty
     * means the sender cannot send or receive anything yet: a phoneNumber alone does not enable SMS
     * or voice. Check this rather than inferring capability from phoneNumber or emailAddress.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<List<String>> = channels.getOptional("channels")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * From-address for the email channel, if configured.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailAddress(): Optional<String> = emailAddress.getOptional("emailAddress")

    /**
     * Whether catch-all receiving is enabled. When true (and emailReceivingEnabled is true), this
     * sender receives email addressed to any local part at its domain, not just its own address.
     * The original recipient is delivered in the message.inbound webhook's data.to.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailCatchAllEnabled(): Optional<Boolean> =
        emailCatchAllEnabled.getOptional("emailCatchAllEnabled")

    /**
     * Whether inbound email receiving is enabled for this sender.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailReceivingEnabled(): Optional<Boolean> =
        emailReceivingEnabled.getOptional("emailReceivingEnabled")

    /**
     * Whether this sender is the project's default.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDefault(): Optional<Boolean> = isDefault.getOptional("isDefault")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Webhook configuration for the sender.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhook(): Optional<SenderWebhook> = webhook.getOptional("webhook")

    /**
     * WhatsApp Business Account information. Only present if a WABA is connected.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whatsapp(): Optional<Whatsapp> = whatsapp.getOptional("whatsapp")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<List<String>> = channels

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [emailAddress].
     *
     * Unlike [emailAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailAddress")
    @ExcludeMissing
    fun _emailAddress(): JsonField<String> = emailAddress

    /**
     * Returns the raw JSON value of [emailCatchAllEnabled].
     *
     * Unlike [emailCatchAllEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("emailCatchAllEnabled")
    @ExcludeMissing
    fun _emailCatchAllEnabled(): JsonField<Boolean> = emailCatchAllEnabled

    /**
     * Returns the raw JSON value of [emailReceivingEnabled].
     *
     * Unlike [emailReceivingEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("emailReceivingEnabled")
    @ExcludeMissing
    fun _emailReceivingEnabled(): JsonField<Boolean> = emailReceivingEnabled

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isDefault") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [webhook].
     *
     * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<SenderWebhook> = webhook

    /**
     * Returns the raw JSON value of [whatsapp].
     *
     * Unlike [whatsapp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("whatsapp") @ExcludeMissing fun _whatsapp(): JsonField<Whatsapp> = whatsapp

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
         * Returns a mutable builder for constructing an instance of [Sender].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .phoneNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Sender]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var phoneNumber: JsonField<String>? = null
        private var channels: JsonField<MutableList<String>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var emailAddress: JsonField<String> = JsonMissing.of()
        private var emailCatchAllEnabled: JsonField<Boolean> = JsonMissing.of()
        private var emailReceivingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var isDefault: JsonField<Boolean> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhook: JsonField<SenderWebhook> = JsonMissing.of()
        private var whatsapp: JsonField<Whatsapp> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sender: Sender) = apply {
            id = sender.id
            name = sender.name
            phoneNumber = sender.phoneNumber
            channels = sender.channels.map { it.toMutableList() }
            createdAt = sender.createdAt
            emailAddress = sender.emailAddress
            emailCatchAllEnabled = sender.emailCatchAllEnabled
            emailReceivingEnabled = sender.emailReceivingEnabled
            isDefault = sender.isDefault
            updatedAt = sender.updatedAt
            webhook = sender.webhook
            whatsapp = sender.whatsapp
            additionalProperties = sender.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Phone number in E.164 format. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /**
         * Channels this sender can actually send on right now, computed from its configuration.
         * Empty means the sender cannot send or receive anything yet: a phoneNumber alone does not
         * enable SMS or voice. Check this rather than inferring capability from phoneNumber or
         * emailAddress.
         */
        fun channels(channels: List<String>) = channels(JsonField.of(channels))

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channels(channels: JsonField<List<String>>) = apply {
            this.channels = channels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [channels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannel(channel: String) = apply {
            channels =
                (channels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("channels", it).add(channel)
                }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** From-address for the email channel, if configured. */
        fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

        /**
         * Sets [Builder.emailAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailAddress(emailAddress: JsonField<String>) = apply {
            this.emailAddress = emailAddress
        }

        /**
         * Whether catch-all receiving is enabled. When true (and emailReceivingEnabled is true),
         * this sender receives email addressed to any local part at its domain, not just its own
         * address. The original recipient is delivered in the message.inbound webhook's data.to.
         */
        fun emailCatchAllEnabled(emailCatchAllEnabled: Boolean) =
            emailCatchAllEnabled(JsonField.of(emailCatchAllEnabled))

        /**
         * Sets [Builder.emailCatchAllEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailCatchAllEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailCatchAllEnabled(emailCatchAllEnabled: JsonField<Boolean>) = apply {
            this.emailCatchAllEnabled = emailCatchAllEnabled
        }

        /** Whether inbound email receiving is enabled for this sender. */
        fun emailReceivingEnabled(emailReceivingEnabled: Boolean) =
            emailReceivingEnabled(JsonField.of(emailReceivingEnabled))

        /**
         * Sets [Builder.emailReceivingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailReceivingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailReceivingEnabled(emailReceivingEnabled: JsonField<Boolean>) = apply {
            this.emailReceivingEnabled = emailReceivingEnabled
        }

        /** Whether this sender is the project's default. */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Webhook configuration for the sender. */
        fun webhook(webhook: SenderWebhook) = webhook(JsonField.of(webhook))

        /**
         * Sets [Builder.webhook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhook] with a well-typed [SenderWebhook] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhook(webhook: JsonField<SenderWebhook>) = apply { this.webhook = webhook }

        /** WhatsApp Business Account information. Only present if a WABA is connected. */
        fun whatsapp(whatsapp: Whatsapp) = whatsapp(JsonField.of(whatsapp))

        /**
         * Sets [Builder.whatsapp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whatsapp] with a well-typed [Whatsapp] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun whatsapp(whatsapp: JsonField<Whatsapp>) = apply { this.whatsapp = whatsapp }

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
         * Returns an immutable instance of [Sender].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .phoneNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Sender =
            Sender(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("phoneNumber", phoneNumber),
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                emailAddress,
                emailCatchAllEnabled,
                emailReceivingEnabled,
                isDefault,
                updatedAt,
                webhook,
                whatsapp,
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
    fun validate(): Sender = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        phoneNumber()
        channels()
        createdAt()
        emailAddress()
        emailCatchAllEnabled()
        emailReceivingEnabled()
        isDefault()
        updatedAt()
        webhook().ifPresent { it.validate() }
        whatsapp().ifPresent { it.validate() }
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (channels.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (emailAddress.asKnown().isPresent) 1 else 0) +
            (if (emailCatchAllEnabled.asKnown().isPresent) 1 else 0) +
            (if (emailReceivingEnabled.asKnown().isPresent) 1 else 0) +
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (webhook.asKnown().getOrNull()?.validity() ?: 0) +
            (whatsapp.asKnown().getOrNull()?.validity() ?: 0)

    /** WhatsApp Business Account information. Only present if a WABA is connected. */
    class Whatsapp
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayPhoneNumber: JsonField<String>,
        private val paymentStatus: JsonField<PaymentStatus>,
        private val phoneNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("displayPhoneNumber")
            @ExcludeMissing
            displayPhoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentStatus")
            @ExcludeMissing
            paymentStatus: JsonField<PaymentStatus> = JsonMissing.of(),
            @JsonProperty("phoneNumberId")
            @ExcludeMissing
            phoneNumberId: JsonField<String> = JsonMissing.of(),
        ) : this(displayPhoneNumber, paymentStatus, phoneNumberId, mutableMapOf())

        /**
         * Display phone number.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayPhoneNumber(): Optional<String> =
            displayPhoneNumber.getOptional("displayPhoneNumber")

        /**
         * Payment configuration status from Meta.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentStatus(): Optional<PaymentStatus> = paymentStatus.getOptional("paymentStatus")

        /**
         * WhatsApp phone number ID from Meta.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberId(): Optional<String> = phoneNumberId.getOptional("phoneNumberId")

        /**
         * Returns the raw JSON value of [displayPhoneNumber].
         *
         * Unlike [displayPhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("displayPhoneNumber")
        @ExcludeMissing
        fun _displayPhoneNumber(): JsonField<String> = displayPhoneNumber

        /**
         * Returns the raw JSON value of [paymentStatus].
         *
         * Unlike [paymentStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("paymentStatus")
        @ExcludeMissing
        fun _paymentStatus(): JsonField<PaymentStatus> = paymentStatus

        /**
         * Returns the raw JSON value of [phoneNumberId].
         *
         * Unlike [phoneNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phoneNumberId")
        @ExcludeMissing
        fun _phoneNumberId(): JsonField<String> = phoneNumberId

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

            /** Returns a mutable builder for constructing an instance of [Whatsapp]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Whatsapp]. */
        class Builder internal constructor() {

            private var displayPhoneNumber: JsonField<String> = JsonMissing.of()
            private var paymentStatus: JsonField<PaymentStatus> = JsonMissing.of()
            private var phoneNumberId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(whatsapp: Whatsapp) = apply {
                displayPhoneNumber = whatsapp.displayPhoneNumber
                paymentStatus = whatsapp.paymentStatus
                phoneNumberId = whatsapp.phoneNumberId
                additionalProperties = whatsapp.additionalProperties.toMutableMap()
            }

            /** Display phone number. */
            fun displayPhoneNumber(displayPhoneNumber: String) =
                displayPhoneNumber(JsonField.of(displayPhoneNumber))

            /**
             * Sets [Builder.displayPhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayPhoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayPhoneNumber(displayPhoneNumber: JsonField<String>) = apply {
                this.displayPhoneNumber = displayPhoneNumber
            }

            /** Payment configuration status from Meta. */
            fun paymentStatus(paymentStatus: PaymentStatus) =
                paymentStatus(JsonField.of(paymentStatus))

            /**
             * Sets [Builder.paymentStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentStatus] with a well-typed [PaymentStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentStatus(paymentStatus: JsonField<PaymentStatus>) = apply {
                this.paymentStatus = paymentStatus
            }

            /** WhatsApp phone number ID from Meta. */
            fun phoneNumberId(phoneNumberId: String) = phoneNumberId(JsonField.of(phoneNumberId))

            /**
             * Sets [Builder.phoneNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberId(phoneNumberId: JsonField<String>) = apply {
                this.phoneNumberId = phoneNumberId
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
             * Returns an immutable instance of [Whatsapp].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Whatsapp =
                Whatsapp(
                    displayPhoneNumber,
                    paymentStatus,
                    phoneNumberId,
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
        fun validate(): Whatsapp = apply {
            if (validated) {
                return@apply
            }

            displayPhoneNumber()
            paymentStatus().ifPresent { it.validate() }
            phoneNumberId()
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
            (if (displayPhoneNumber.asKnown().isPresent) 1 else 0) +
                (paymentStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phoneNumberId.asKnown().isPresent) 1 else 0)

        /** Payment configuration status from Meta. */
        class PaymentStatus
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val canSendTemplates: JsonField<Boolean>,
            private val methodStatus: JsonField<String>,
            private val setupStatus: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("canSendTemplates")
                @ExcludeMissing
                canSendTemplates: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("methodStatus")
                @ExcludeMissing
                methodStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("setupStatus")
                @ExcludeMissing
                setupStatus: JsonField<String> = JsonMissing.of(),
            ) : this(canSendTemplates, methodStatus, setupStatus, mutableMapOf())

            /**
             * Whether template messages can be sent. Requires setupStatus=COMPLETE and
             * methodStatus=VALID.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun canSendTemplates(): Optional<Boolean> =
                canSendTemplates.getOptional("canSendTemplates")

            /**
             * Payment method status (VALID, NONE, etc.).
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun methodStatus(): Optional<String> = methodStatus.getOptional("methodStatus")

            /**
             * Payment setup status (COMPLETE, NOT_STARTED, etc.).
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun setupStatus(): Optional<String> = setupStatus.getOptional("setupStatus")

            /**
             * Returns the raw JSON value of [canSendTemplates].
             *
             * Unlike [canSendTemplates], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("canSendTemplates")
            @ExcludeMissing
            fun _canSendTemplates(): JsonField<Boolean> = canSendTemplates

            /**
             * Returns the raw JSON value of [methodStatus].
             *
             * Unlike [methodStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("methodStatus")
            @ExcludeMissing
            fun _methodStatus(): JsonField<String> = methodStatus

            /**
             * Returns the raw JSON value of [setupStatus].
             *
             * Unlike [setupStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("setupStatus")
            @ExcludeMissing
            fun _setupStatus(): JsonField<String> = setupStatus

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

                /** Returns a mutable builder for constructing an instance of [PaymentStatus]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PaymentStatus]. */
            class Builder internal constructor() {

                private var canSendTemplates: JsonField<Boolean> = JsonMissing.of()
                private var methodStatus: JsonField<String> = JsonMissing.of()
                private var setupStatus: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentStatus: PaymentStatus) = apply {
                    canSendTemplates = paymentStatus.canSendTemplates
                    methodStatus = paymentStatus.methodStatus
                    setupStatus = paymentStatus.setupStatus
                    additionalProperties = paymentStatus.additionalProperties.toMutableMap()
                }

                /**
                 * Whether template messages can be sent. Requires setupStatus=COMPLETE and
                 * methodStatus=VALID.
                 */
                fun canSendTemplates(canSendTemplates: Boolean) =
                    canSendTemplates(JsonField.of(canSendTemplates))

                /**
                 * Sets [Builder.canSendTemplates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.canSendTemplates] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun canSendTemplates(canSendTemplates: JsonField<Boolean>) = apply {
                    this.canSendTemplates = canSendTemplates
                }

                /** Payment method status (VALID, NONE, etc.). */
                fun methodStatus(methodStatus: String) = methodStatus(JsonField.of(methodStatus))

                /**
                 * Sets [Builder.methodStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.methodStatus] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun methodStatus(methodStatus: JsonField<String>) = apply {
                    this.methodStatus = methodStatus
                }

                /** Payment setup status (COMPLETE, NOT_STARTED, etc.). */
                fun setupStatus(setupStatus: String) = setupStatus(JsonField.of(setupStatus))

                /**
                 * Sets [Builder.setupStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.setupStatus] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun setupStatus(setupStatus: JsonField<String>) = apply {
                    this.setupStatus = setupStatus
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PaymentStatus].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PaymentStatus =
                    PaymentStatus(
                        canSendTemplates,
                        methodStatus,
                        setupStatus,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ZavudevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PaymentStatus = apply {
                if (validated) {
                    return@apply
                }

                canSendTemplates()
                methodStatus()
                setupStatus()
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
                (if (canSendTemplates.asKnown().isPresent) 1 else 0) +
                    (if (methodStatus.asKnown().isPresent) 1 else 0) +
                    (if (setupStatus.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentStatus &&
                    canSendTemplates == other.canSendTemplates &&
                    methodStatus == other.methodStatus &&
                    setupStatus == other.setupStatus &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(canSendTemplates, methodStatus, setupStatus, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentStatus{canSendTemplates=$canSendTemplates, methodStatus=$methodStatus, setupStatus=$setupStatus, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Whatsapp &&
                displayPhoneNumber == other.displayPhoneNumber &&
                paymentStatus == other.paymentStatus &&
                phoneNumberId == other.phoneNumberId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(displayPhoneNumber, paymentStatus, phoneNumberId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Whatsapp{displayPhoneNumber=$displayPhoneNumber, paymentStatus=$paymentStatus, phoneNumberId=$phoneNumberId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Sender &&
            id == other.id &&
            name == other.name &&
            phoneNumber == other.phoneNumber &&
            channels == other.channels &&
            createdAt == other.createdAt &&
            emailAddress == other.emailAddress &&
            emailCatchAllEnabled == other.emailCatchAllEnabled &&
            emailReceivingEnabled == other.emailReceivingEnabled &&
            isDefault == other.isDefault &&
            updatedAt == other.updatedAt &&
            webhook == other.webhook &&
            whatsapp == other.whatsapp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            phoneNumber,
            channels,
            createdAt,
            emailAddress,
            emailCatchAllEnabled,
            emailReceivingEnabled,
            isDefault,
            updatedAt,
            webhook,
            whatsapp,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Sender{id=$id, name=$name, phoneNumber=$phoneNumber, channels=$channels, createdAt=$createdAt, emailAddress=$emailAddress, emailCatchAllEnabled=$emailCatchAllEnabled, emailReceivingEnabled=$emailReceivingEnabled, isDefault=$isDefault, updatedAt=$updatedAt, webhook=$webhook, whatsapp=$whatsapp, additionalProperties=$additionalProperties}"
}
