// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.invitations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.Params
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a partner invitation link for a client to connect a Meta channel. The client opens the
 * returned `url` and authorizes with Meta; the resulting sender is created in your project when
 * they finish, and the invitation transitions to `completed`.
 *
 * `connectionType` picks the channel:
 * - `whatsapp_waba` (default): Meta's embedded signup links an official WhatsApp Business Account.
 * - `messenger`: the client picks a Facebook Page they administer; its Messenger inbox (including
 *   Marketplace chats) is routed to Zavu.
 *
 * One invitation connects one channel — create one per channel to onboard a client on several.
 * `phoneNumberId` and `allowedPhoneCountries` apply to `whatsapp_waba` only.
 */
class InvitationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ISO country codes for allowed phone numbers. Only valid when `connectionType` is
     * `whatsapp_waba` — sending it with `messenger` returns 400.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedPhoneCountries(): Optional<List<String>> = body.allowedPhoneCountries()

    /**
     * Email of the client being invited.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientEmail(): Optional<String> = body.clientEmail()

    /**
     * Name of the client being invited.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientName(): Optional<String> = body.clientName()

    /**
     * Phone number of the client in E.164 format.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientPhone(): Optional<String> = body.clientPhone()

    /**
     * Which Meta channel the client connects, and how.
     * - `whatsapp_waba` (default): Meta's embedded signup links an official WhatsApp Business
     *   Account. Accepts `phoneNumberId` and `allowedPhoneCountries`.
     * - `messenger`: the client authorizes with Facebook and picks a Facebook Page they administer.
     *   The Page's Messenger inbox — including Marketplace chats — is routed to Zavu. They must be
     *   an admin of at least one Page. A Page can only be connected to one Zavu project at a time:
     *   if the client picks a Page that another project already connected, the newer connection
     *   wins and the older one is disconnected.
     *
     * One invitation connects one channel. To onboard a client on several channels, create one
     * invitation per channel; each completes into its own sender.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionType(): Optional<ConnectionType> = body.connectionType()

    /**
     * Number of days until the invitation expires.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresInDays(): Optional<Long> = body.expiresInDays()

    /**
     * ID of a Zavu phone number to pre-assign for WhatsApp registration. If provided, the client
     * will use this number instead of their own. Only valid when `connectionType` is
     * `whatsapp_waba` — sending it with `messenger` returns 400, since a Facebook Page has no phone
     * number.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberId(): Optional<String> = body.phoneNumberId()

    /**
     * Returns the raw JSON value of [allowedPhoneCountries].
     *
     * Unlike [allowedPhoneCountries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedPhoneCountries(): JsonField<List<String>> = body._allowedPhoneCountries()

    /**
     * Returns the raw JSON value of [clientEmail].
     *
     * Unlike [clientEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientEmail(): JsonField<String> = body._clientEmail()

    /**
     * Returns the raw JSON value of [clientName].
     *
     * Unlike [clientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientName(): JsonField<String> = body._clientName()

    /**
     * Returns the raw JSON value of [clientPhone].
     *
     * Unlike [clientPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientPhone(): JsonField<String> = body._clientPhone()

    /**
     * Returns the raw JSON value of [connectionType].
     *
     * Unlike [connectionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectionType(): JsonField<ConnectionType> = body._connectionType()

    /**
     * Returns the raw JSON value of [expiresInDays].
     *
     * Unlike [expiresInDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresInDays(): JsonField<Long> = body._expiresInDays()

    /**
     * Returns the raw JSON value of [phoneNumberId].
     *
     * Unlike [phoneNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumberId(): JsonField<String> = body._phoneNumberId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InvitationCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InvitationCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvitationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invitationCreateParams: InvitationCreateParams) = apply {
            body = invitationCreateParams.body.toBuilder()
            additionalHeaders = invitationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invitationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [allowedPhoneCountries]
         * - [clientEmail]
         * - [clientName]
         * - [clientPhone]
         * - [connectionType]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * ISO country codes for allowed phone numbers. Only valid when `connectionType` is
         * `whatsapp_waba` — sending it with `messenger` returns 400.
         */
        fun allowedPhoneCountries(allowedPhoneCountries: List<String>) = apply {
            body.allowedPhoneCountries(allowedPhoneCountries)
        }

        /**
         * Sets [Builder.allowedPhoneCountries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPhoneCountries] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowedPhoneCountries(allowedPhoneCountries: JsonField<List<String>>) = apply {
            body.allowedPhoneCountries(allowedPhoneCountries)
        }

        /**
         * Adds a single [String] to [allowedPhoneCountries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedPhoneCountry(allowedPhoneCountry: String) = apply {
            body.addAllowedPhoneCountry(allowedPhoneCountry)
        }

        /** Email of the client being invited. */
        fun clientEmail(clientEmail: String) = apply { body.clientEmail(clientEmail) }

        /**
         * Sets [Builder.clientEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientEmail(clientEmail: JsonField<String>) = apply { body.clientEmail(clientEmail) }

        /** Name of the client being invited. */
        fun clientName(clientName: String) = apply { body.clientName(clientName) }

        /**
         * Sets [Builder.clientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientName(clientName: JsonField<String>) = apply { body.clientName(clientName) }

        /** Phone number of the client in E.164 format. */
        fun clientPhone(clientPhone: String) = apply { body.clientPhone(clientPhone) }

        /**
         * Sets [Builder.clientPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientPhone(clientPhone: JsonField<String>) = apply { body.clientPhone(clientPhone) }

        /**
         * Which Meta channel the client connects, and how.
         * - `whatsapp_waba` (default): Meta's embedded signup links an official WhatsApp Business
         *   Account. Accepts `phoneNumberId` and `allowedPhoneCountries`.
         * - `messenger`: the client authorizes with Facebook and picks a Facebook Page they
         *   administer. The Page's Messenger inbox — including Marketplace chats — is routed to
         *   Zavu. They must be an admin of at least one Page. A Page can only be connected to one
         *   Zavu project at a time: if the client picks a Page that another project already
         *   connected, the newer connection wins and the older one is disconnected.
         *
         * One invitation connects one channel. To onboard a client on several channels, create one
         * invitation per channel; each completes into its own sender.
         */
        fun connectionType(connectionType: ConnectionType) = apply {
            body.connectionType(connectionType)
        }

        /**
         * Sets [Builder.connectionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionType] with a well-typed [ConnectionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
            body.connectionType(connectionType)
        }

        /** Number of days until the invitation expires. */
        fun expiresInDays(expiresInDays: Long) = apply { body.expiresInDays(expiresInDays) }

        /**
         * Sets [Builder.expiresInDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresInDays] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresInDays(expiresInDays: JsonField<Long>) = apply {
            body.expiresInDays(expiresInDays)
        }

        /**
         * ID of a Zavu phone number to pre-assign for WhatsApp registration. If provided, the
         * client will use this number instead of their own. Only valid when `connectionType` is
         * `whatsapp_waba` — sending it with `messenger` returns 400, since a Facebook Page has no
         * phone number.
         */
        fun phoneNumberId(phoneNumberId: String) = apply { body.phoneNumberId(phoneNumberId) }

        /**
         * Sets [Builder.phoneNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumberId(phoneNumberId: JsonField<String>) = apply {
            body.phoneNumberId(phoneNumberId)
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
         * Returns an immutable instance of [InvitationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvitationCreateParams =
            InvitationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowedPhoneCountries: JsonField<List<String>>,
        private val clientEmail: JsonField<String>,
        private val clientName: JsonField<String>,
        private val clientPhone: JsonField<String>,
        private val connectionType: JsonField<ConnectionType>,
        private val expiresInDays: JsonField<Long>,
        private val phoneNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowedPhoneCountries")
            @ExcludeMissing
            allowedPhoneCountries: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("clientEmail")
            @ExcludeMissing
            clientEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("clientName")
            @ExcludeMissing
            clientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("clientPhone")
            @ExcludeMissing
            clientPhone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connectionType")
            @ExcludeMissing
            connectionType: JsonField<ConnectionType> = JsonMissing.of(),
            @JsonProperty("expiresInDays")
            @ExcludeMissing
            expiresInDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("phoneNumberId")
            @ExcludeMissing
            phoneNumberId: JsonField<String> = JsonMissing.of(),
        ) : this(
            allowedPhoneCountries,
            clientEmail,
            clientName,
            clientPhone,
            connectionType,
            expiresInDays,
            phoneNumberId,
            mutableMapOf(),
        )

        /**
         * ISO country codes for allowed phone numbers. Only valid when `connectionType` is
         * `whatsapp_waba` — sending it with `messenger` returns 400.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedPhoneCountries(): Optional<List<String>> =
            allowedPhoneCountries.getOptional("allowedPhoneCountries")

        /**
         * Email of the client being invited.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientEmail(): Optional<String> = clientEmail.getOptional("clientEmail")

        /**
         * Name of the client being invited.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientName(): Optional<String> = clientName.getOptional("clientName")

        /**
         * Phone number of the client in E.164 format.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientPhone(): Optional<String> = clientPhone.getOptional("clientPhone")

        /**
         * Which Meta channel the client connects, and how.
         * - `whatsapp_waba` (default): Meta's embedded signup links an official WhatsApp Business
         *   Account. Accepts `phoneNumberId` and `allowedPhoneCountries`.
         * - `messenger`: the client authorizes with Facebook and picks a Facebook Page they
         *   administer. The Page's Messenger inbox — including Marketplace chats — is routed to
         *   Zavu. They must be an admin of at least one Page. A Page can only be connected to one
         *   Zavu project at a time: if the client picks a Page that another project already
         *   connected, the newer connection wins and the older one is disconnected.
         *
         * One invitation connects one channel. To onboard a client on several channels, create one
         * invitation per channel; each completes into its own sender.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionType(): Optional<ConnectionType> =
            connectionType.getOptional("connectionType")

        /**
         * Number of days until the invitation expires.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresInDays(): Optional<Long> = expiresInDays.getOptional("expiresInDays")

        /**
         * ID of a Zavu phone number to pre-assign for WhatsApp registration. If provided, the
         * client will use this number instead of their own. Only valid when `connectionType` is
         * `whatsapp_waba` — sending it with `messenger` returns 400, since a Facebook Page has no
         * phone number.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberId(): Optional<String> = phoneNumberId.getOptional("phoneNumberId")

        /**
         * Returns the raw JSON value of [allowedPhoneCountries].
         *
         * Unlike [allowedPhoneCountries], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowedPhoneCountries")
        @ExcludeMissing
        fun _allowedPhoneCountries(): JsonField<List<String>> = allowedPhoneCountries

        /**
         * Returns the raw JSON value of [clientEmail].
         *
         * Unlike [clientEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clientEmail")
        @ExcludeMissing
        fun _clientEmail(): JsonField<String> = clientEmail

        /**
         * Returns the raw JSON value of [clientName].
         *
         * Unlike [clientName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clientName")
        @ExcludeMissing
        fun _clientName(): JsonField<String> = clientName

        /**
         * Returns the raw JSON value of [clientPhone].
         *
         * Unlike [clientPhone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clientPhone")
        @ExcludeMissing
        fun _clientPhone(): JsonField<String> = clientPhone

        /**
         * Returns the raw JSON value of [connectionType].
         *
         * Unlike [connectionType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connectionType")
        @ExcludeMissing
        fun _connectionType(): JsonField<ConnectionType> = connectionType

        /**
         * Returns the raw JSON value of [expiresInDays].
         *
         * Unlike [expiresInDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiresInDays")
        @ExcludeMissing
        fun _expiresInDays(): JsonField<Long> = expiresInDays

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var allowedPhoneCountries: JsonField<MutableList<String>>? = null
            private var clientEmail: JsonField<String> = JsonMissing.of()
            private var clientName: JsonField<String> = JsonMissing.of()
            private var clientPhone: JsonField<String> = JsonMissing.of()
            private var connectionType: JsonField<ConnectionType> = JsonMissing.of()
            private var expiresInDays: JsonField<Long> = JsonMissing.of()
            private var phoneNumberId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                allowedPhoneCountries = body.allowedPhoneCountries.map { it.toMutableList() }
                clientEmail = body.clientEmail
                clientName = body.clientName
                clientPhone = body.clientPhone
                connectionType = body.connectionType
                expiresInDays = body.expiresInDays
                phoneNumberId = body.phoneNumberId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * ISO country codes for allowed phone numbers. Only valid when `connectionType` is
             * `whatsapp_waba` — sending it with `messenger` returns 400.
             */
            fun allowedPhoneCountries(allowedPhoneCountries: List<String>) =
                allowedPhoneCountries(JsonField.of(allowedPhoneCountries))

            /**
             * Sets [Builder.allowedPhoneCountries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedPhoneCountries] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowedPhoneCountries(allowedPhoneCountries: JsonField<List<String>>) = apply {
                this.allowedPhoneCountries = allowedPhoneCountries.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [allowedPhoneCountries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedPhoneCountry(allowedPhoneCountry: String) = apply {
                allowedPhoneCountries =
                    (allowedPhoneCountries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedPhoneCountries", it).add(allowedPhoneCountry)
                    }
            }

            /** Email of the client being invited. */
            fun clientEmail(clientEmail: String) = clientEmail(JsonField.of(clientEmail))

            /**
             * Sets [Builder.clientEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientEmail(clientEmail: JsonField<String>) = apply {
                this.clientEmail = clientEmail
            }

            /** Name of the client being invited. */
            fun clientName(clientName: String) = clientName(JsonField.of(clientName))

            /**
             * Sets [Builder.clientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientName(clientName: JsonField<String>) = apply { this.clientName = clientName }

            /** Phone number of the client in E.164 format. */
            fun clientPhone(clientPhone: String) = clientPhone(JsonField.of(clientPhone))

            /**
             * Sets [Builder.clientPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientPhone] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientPhone(clientPhone: JsonField<String>) = apply {
                this.clientPhone = clientPhone
            }

            /**
             * Which Meta channel the client connects, and how.
             * - `whatsapp_waba` (default): Meta's embedded signup links an official WhatsApp
             *   Business Account. Accepts `phoneNumberId` and `allowedPhoneCountries`.
             * - `messenger`: the client authorizes with Facebook and picks a Facebook Page they
             *   administer. The Page's Messenger inbox — including Marketplace chats — is routed to
             *   Zavu. They must be an admin of at least one Page. A Page can only be connected to
             *   one Zavu project at a time: if the client picks a Page that another project already
             *   connected, the newer connection wins and the older one is disconnected.
             *
             * One invitation connects one channel. To onboard a client on several channels, create
             * one invitation per channel; each completes into its own sender.
             */
            fun connectionType(connectionType: ConnectionType) =
                connectionType(JsonField.of(connectionType))

            /**
             * Sets [Builder.connectionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionType] with a well-typed [ConnectionType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
                this.connectionType = connectionType
            }

            /** Number of days until the invitation expires. */
            fun expiresInDays(expiresInDays: Long) = expiresInDays(JsonField.of(expiresInDays))

            /**
             * Sets [Builder.expiresInDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresInDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresInDays(expiresInDays: JsonField<Long>) = apply {
                this.expiresInDays = expiresInDays
            }

            /**
             * ID of a Zavu phone number to pre-assign for WhatsApp registration. If provided, the
             * client will use this number instead of their own. Only valid when `connectionType` is
             * `whatsapp_waba` — sending it with `messenger` returns 400, since a Facebook Page has
             * no phone number.
             */
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (allowedPhoneCountries ?: JsonMissing.of()).map { it.toImmutable() },
                    clientEmail,
                    clientName,
                    clientPhone,
                    connectionType,
                    expiresInDays,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            allowedPhoneCountries()
            clientEmail()
            clientName()
            clientPhone()
            connectionType().ifPresent { it.validate() }
            expiresInDays()
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
            (allowedPhoneCountries.asKnown().getOrNull()?.size ?: 0) +
                (if (clientEmail.asKnown().isPresent) 1 else 0) +
                (if (clientName.asKnown().isPresent) 1 else 0) +
                (if (clientPhone.asKnown().isPresent) 1 else 0) +
                (connectionType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (expiresInDays.asKnown().isPresent) 1 else 0) +
                (if (phoneNumberId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                allowedPhoneCountries == other.allowedPhoneCountries &&
                clientEmail == other.clientEmail &&
                clientName == other.clientName &&
                clientPhone == other.clientPhone &&
                connectionType == other.connectionType &&
                expiresInDays == other.expiresInDays &&
                phoneNumberId == other.phoneNumberId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowedPhoneCountries,
                clientEmail,
                clientName,
                clientPhone,
                connectionType,
                expiresInDays,
                phoneNumberId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{allowedPhoneCountries=$allowedPhoneCountries, clientEmail=$clientEmail, clientName=$clientName, clientPhone=$clientPhone, connectionType=$connectionType, expiresInDays=$expiresInDays, phoneNumberId=$phoneNumberId, additionalProperties=$additionalProperties}"
    }

    /**
     * Which Meta channel the client connects, and how.
     * - `whatsapp_waba` (default): Meta's embedded signup links an official WhatsApp Business
     *   Account. Accepts `phoneNumberId` and `allowedPhoneCountries`.
     * - `messenger`: the client authorizes with Facebook and picks a Facebook Page they administer.
     *   The Page's Messenger inbox — including Marketplace chats — is routed to Zavu. They must be
     *   an admin of at least one Page. A Page can only be connected to one Zavu project at a time:
     *   if the client picks a Page that another project already connected, the newer connection
     *   wins and the older one is disconnected.
     *
     * One invitation connects one channel. To onboard a client on several channels, create one
     * invitation per channel; each completes into its own sender.
     */
    class ConnectionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val WHATSAPP_WABA = of("whatsapp_waba")

            @JvmField val MESSENGER = of("messenger")

            @JvmStatic fun of(value: String) = ConnectionType(JsonField.of(value))
        }

        /** An enum containing [ConnectionType]'s known values. */
        enum class Known {
            WHATSAPP_WABA,
            MESSENGER,
        }

        /**
         * An enum containing [ConnectionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConnectionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WHATSAPP_WABA,
            MESSENGER,
            /**
             * An enum member indicating that [ConnectionType] was instantiated with an unknown
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
                WHATSAPP_WABA -> Value.WHATSAPP_WABA
                MESSENGER -> Value.MESSENGER
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
                WHATSAPP_WABA -> Known.WHATSAPP_WABA
                MESSENGER -> Known.MESSENGER
                else -> throw ZavudevInvalidDataException("Unknown ConnectionType: $value")
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
        fun validate(): ConnectionType = apply {
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

            return other is ConnectionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InvitationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
