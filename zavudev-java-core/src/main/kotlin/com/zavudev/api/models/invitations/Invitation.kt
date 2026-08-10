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
import com.zavudev.api.core.checkRequired
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Invitation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val token: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val url: JsonField<String>,
    private val clientEmail: JsonField<String>,
    private val clientName: JsonField<String>,
    private val clientPhone: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val connectedAccount: JsonField<ConnectedAccount>,
    private val connectionType: JsonField<ConnectionType>,
    private val failedAt: JsonField<OffsetDateTime>,
    private val failureReason: JsonField<String>,
    private val phoneNumberId: JsonField<String>,
    private val senderId: JsonField<String>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val viewedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clientEmail")
        @ExcludeMissing
        clientEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clientName")
        @ExcludeMissing
        clientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clientPhone")
        @ExcludeMissing
        clientPhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completedAt")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("connectedAccount")
        @ExcludeMissing
        connectedAccount: JsonField<ConnectedAccount> = JsonMissing.of(),
        @JsonProperty("connectionType")
        @ExcludeMissing
        connectionType: JsonField<ConnectionType> = JsonMissing.of(),
        @JsonProperty("failedAt")
        @ExcludeMissing
        failedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("failureReason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumberId")
        @ExcludeMissing
        phoneNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senderId") @ExcludeMissing senderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startedAt")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("viewedAt")
        @ExcludeMissing
        viewedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        token,
        createdAt,
        expiresAt,
        status,
        updatedAt,
        url,
        clientEmail,
        clientName,
        clientPhone,
        completedAt,
        connectedAccount,
        connectionType,
        failedAt,
        failureReason,
        phoneNumberId,
        senderId,
        startedAt,
        viewedAt,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Unique invitation token.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

    /**
     * Current status of the partner invitation.
     *
     * `failed` means the client started the connection and it did not finish (they cancelled Meta's
     * dialog, denied a permission, or abandoned the tab). A failed invitation is still usable: the
     * same link can be retried, and it moves back to `in_progress` when the client tries again.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Full URL to share with the client.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientEmail(): Optional<String> = clientEmail.getOptional("clientEmail")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientName(): Optional<String> = clientName.getOptional("clientName")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientPhone(): Optional<String> = clientPhone.getOptional("clientPhone")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completedAt")

    /**
     * The account the client linked, populated once the invitation is `completed`. Null before
     * that. Use it to show the partner what was connected without fetching the sender.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectedAccount(): Optional<ConnectedAccount> =
        connectedAccount.getOptional("connectedAccount")

    /**
     * Which Meta channel the client connects: `whatsapp_waba` (official WhatsApp Cloud API via
     * embedded signup) or `messenger` (a Facebook Page's Messenger inbox, including Marketplace
     * chats).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionType(): Optional<ConnectionType> = connectionType.getOptional("connectionType")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedAt(): Optional<OffsetDateTime> = failedAt.getOptional("failedAt")

    /**
     * Stable code for why the last attempt failed, present when `status` is `failed`. Values
     * include `fb_cancelled` (client closed Meta's dialog), `fb_not_authorized` (permission
     * denied), `signup_abandoned` (started but never finished), `meta_no_pages` (the client
     * administers no Facebook Page), and `internal_error`. Treat unknown codes as a generic
     * failure.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<String> = failureReason.getOptional("failureReason")

    /**
     * ID of a pre-assigned Zavu phone number for WhatsApp registration. Always null for `messenger`
     * invitations.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberId(): Optional<String> = phoneNumberId.getOptional("phoneNumberId")

    /**
     * ID of the sender created when invitation is completed.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderId(): Optional<String> = senderId.getOptional("senderId")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("startedAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun viewedAt(): Optional<OffsetDateTime> = viewedAt.getOptional("viewedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [clientEmail].
     *
     * Unlike [clientEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clientEmail") @ExcludeMissing fun _clientEmail(): JsonField<String> = clientEmail

    /**
     * Returns the raw JSON value of [clientName].
     *
     * Unlike [clientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clientName") @ExcludeMissing fun _clientName(): JsonField<String> = clientName

    /**
     * Returns the raw JSON value of [clientPhone].
     *
     * Unlike [clientPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clientPhone") @ExcludeMissing fun _clientPhone(): JsonField<String> = clientPhone

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completedAt")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [connectedAccount].
     *
     * Unlike [connectedAccount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connectedAccount")
    @ExcludeMissing
    fun _connectedAccount(): JsonField<ConnectedAccount> = connectedAccount

    /**
     * Returns the raw JSON value of [connectionType].
     *
     * Unlike [connectionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connectionType")
    @ExcludeMissing
    fun _connectionType(): JsonField<ConnectionType> = connectionType

    /**
     * Returns the raw JSON value of [failedAt].
     *
     * Unlike [failedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failedAt") @ExcludeMissing fun _failedAt(): JsonField<OffsetDateTime> = failedAt

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureReason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /**
     * Returns the raw JSON value of [phoneNumberId].
     *
     * Unlike [phoneNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumberId")
    @ExcludeMissing
    fun _phoneNumberId(): JsonField<String> = phoneNumberId

    /**
     * Returns the raw JSON value of [senderId].
     *
     * Unlike [senderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senderId") @ExcludeMissing fun _senderId(): JsonField<String> = senderId

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startedAt")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [viewedAt].
     *
     * Unlike [viewedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("viewedAt") @ExcludeMissing fun _viewedAt(): JsonField<OffsetDateTime> = viewedAt

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
         * Returns a mutable builder for constructing an instance of [Invitation].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .token()
         * .createdAt()
         * .expiresAt()
         * .status()
         * .updatedAt()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Invitation]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var token: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var url: JsonField<String>? = null
        private var clientEmail: JsonField<String> = JsonMissing.of()
        private var clientName: JsonField<String> = JsonMissing.of()
        private var clientPhone: JsonField<String> = JsonMissing.of()
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var connectedAccount: JsonField<ConnectedAccount> = JsonMissing.of()
        private var connectionType: JsonField<ConnectionType> = JsonMissing.of()
        private var failedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var failureReason: JsonField<String> = JsonMissing.of()
        private var phoneNumberId: JsonField<String> = JsonMissing.of()
        private var senderId: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var viewedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invitation: Invitation) = apply {
            id = invitation.id
            token = invitation.token
            createdAt = invitation.createdAt
            expiresAt = invitation.expiresAt
            status = invitation.status
            updatedAt = invitation.updatedAt
            url = invitation.url
            clientEmail = invitation.clientEmail
            clientName = invitation.clientName
            clientPhone = invitation.clientPhone
            completedAt = invitation.completedAt
            connectedAccount = invitation.connectedAccount
            connectionType = invitation.connectionType
            failedAt = invitation.failedAt
            failureReason = invitation.failureReason
            phoneNumberId = invitation.phoneNumberId
            senderId = invitation.senderId
            startedAt = invitation.startedAt
            viewedAt = invitation.viewedAt
            additionalProperties = invitation.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique invitation token. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * Current status of the partner invitation.
         *
         * `failed` means the client started the connection and it did not finish (they cancelled
         * Meta's dialog, denied a permission, or abandoned the tab). A failed invitation is still
         * usable: the same link can be retried, and it moves back to `in_progress` when the client
         * tries again.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Full URL to share with the client. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun clientEmail(clientEmail: String?) = clientEmail(JsonField.ofNullable(clientEmail))

        /** Alias for calling [Builder.clientEmail] with `clientEmail.orElse(null)`. */
        fun clientEmail(clientEmail: Optional<String>) = clientEmail(clientEmail.getOrNull())

        /**
         * Sets [Builder.clientEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientEmail(clientEmail: JsonField<String>) = apply { this.clientEmail = clientEmail }

        fun clientName(clientName: String?) = clientName(JsonField.ofNullable(clientName))

        /** Alias for calling [Builder.clientName] with `clientName.orElse(null)`. */
        fun clientName(clientName: Optional<String>) = clientName(clientName.getOrNull())

        /**
         * Sets [Builder.clientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientName(clientName: JsonField<String>) = apply { this.clientName = clientName }

        fun clientPhone(clientPhone: String?) = clientPhone(JsonField.ofNullable(clientPhone))

        /** Alias for calling [Builder.clientPhone] with `clientPhone.orElse(null)`. */
        fun clientPhone(clientPhone: Optional<String>) = clientPhone(clientPhone.getOrNull())

        /**
         * Sets [Builder.clientPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientPhone(clientPhone: JsonField<String>) = apply { this.clientPhone = clientPhone }

        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.getOrNull())

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /**
         * The account the client linked, populated once the invitation is `completed`. Null before
         * that. Use it to show the partner what was connected without fetching the sender.
         */
        fun connectedAccount(connectedAccount: ConnectedAccount?) =
            connectedAccount(JsonField.ofNullable(connectedAccount))

        /** Alias for calling [Builder.connectedAccount] with `connectedAccount.orElse(null)`. */
        fun connectedAccount(connectedAccount: Optional<ConnectedAccount>) =
            connectedAccount(connectedAccount.getOrNull())

        /**
         * Sets [Builder.connectedAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectedAccount] with a well-typed [ConnectedAccount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun connectedAccount(connectedAccount: JsonField<ConnectedAccount>) = apply {
            this.connectedAccount = connectedAccount
        }

        /**
         * Which Meta channel the client connects: `whatsapp_waba` (official WhatsApp Cloud API via
         * embedded signup) or `messenger` (a Facebook Page's Messenger inbox, including Marketplace
         * chats).
         */
        fun connectionType(connectionType: ConnectionType) =
            connectionType(JsonField.of(connectionType))

        /**
         * Sets [Builder.connectionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionType] with a well-typed [ConnectionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
            this.connectionType = connectionType
        }

        fun failedAt(failedAt: OffsetDateTime?) = failedAt(JsonField.ofNullable(failedAt))

        /** Alias for calling [Builder.failedAt] with `failedAt.orElse(null)`. */
        fun failedAt(failedAt: Optional<OffsetDateTime>) = failedAt(failedAt.getOrNull())

        /**
         * Sets [Builder.failedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failedAt(failedAt: JsonField<OffsetDateTime>) = apply { this.failedAt = failedAt }

        /**
         * Stable code for why the last attempt failed, present when `status` is `failed`. Values
         * include `fb_cancelled` (client closed Meta's dialog), `fb_not_authorized` (permission
         * denied), `signup_abandoned` (started but never finished), `meta_no_pages` (the client
         * administers no Facebook Page), and `internal_error`. Treat unknown codes as a generic
         * failure.
         */
        fun failureReason(failureReason: String?) =
            failureReason(JsonField.ofNullable(failureReason))

        /** Alias for calling [Builder.failureReason] with `failureReason.orElse(null)`. */
        fun failureReason(failureReason: Optional<String>) =
            failureReason(failureReason.getOrNull())

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        /**
         * ID of a pre-assigned Zavu phone number for WhatsApp registration. Always null for
         * `messenger` invitations.
         */
        fun phoneNumberId(phoneNumberId: String?) =
            phoneNumberId(JsonField.ofNullable(phoneNumberId))

        /** Alias for calling [Builder.phoneNumberId] with `phoneNumberId.orElse(null)`. */
        fun phoneNumberId(phoneNumberId: Optional<String>) =
            phoneNumberId(phoneNumberId.getOrNull())

        /**
         * Sets [Builder.phoneNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumberId(phoneNumberId: JsonField<String>) = apply {
            this.phoneNumberId = phoneNumberId
        }

        /** ID of the sender created when invitation is completed. */
        fun senderId(senderId: String?) = senderId(JsonField.ofNullable(senderId))

        /** Alias for calling [Builder.senderId] with `senderId.orElse(null)`. */
        fun senderId(senderId: Optional<String>) = senderId(senderId.getOrNull())

        /**
         * Sets [Builder.senderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senderId(senderId: JsonField<String>) = apply { this.senderId = senderId }

        fun startedAt(startedAt: OffsetDateTime?) = startedAt(JsonField.ofNullable(startedAt))

        /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
        fun startedAt(startedAt: Optional<OffsetDateTime>) = startedAt(startedAt.getOrNull())

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun viewedAt(viewedAt: OffsetDateTime?) = viewedAt(JsonField.ofNullable(viewedAt))

        /** Alias for calling [Builder.viewedAt] with `viewedAt.orElse(null)`. */
        fun viewedAt(viewedAt: Optional<OffsetDateTime>) = viewedAt(viewedAt.getOrNull())

        /**
         * Sets [Builder.viewedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.viewedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun viewedAt(viewedAt: JsonField<OffsetDateTime>) = apply { this.viewedAt = viewedAt }

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
         * Returns an immutable instance of [Invitation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .token()
         * .createdAt()
         * .expiresAt()
         * .status()
         * .updatedAt()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Invitation =
            Invitation(
                checkRequired("id", id),
                checkRequired("token", token),
                checkRequired("createdAt", createdAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                checkRequired("url", url),
                clientEmail,
                clientName,
                clientPhone,
                completedAt,
                connectedAccount,
                connectionType,
                failedAt,
                failureReason,
                phoneNumberId,
                senderId,
                startedAt,
                viewedAt,
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
    fun validate(): Invitation = apply {
        if (validated) {
            return@apply
        }

        id()
        token()
        createdAt()
        expiresAt()
        status().validate()
        updatedAt()
        url()
        clientEmail()
        clientName()
        clientPhone()
        completedAt()
        connectedAccount().ifPresent { it.validate() }
        connectionType().ifPresent { it.validate() }
        failedAt()
        failureReason()
        phoneNumberId()
        senderId()
        startedAt()
        viewedAt()
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
            (if (token.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (clientEmail.asKnown().isPresent) 1 else 0) +
            (if (clientName.asKnown().isPresent) 1 else 0) +
            (if (clientPhone.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (connectedAccount.asKnown().getOrNull()?.validity() ?: 0) +
            (connectionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (failedAt.asKnown().isPresent) 1 else 0) +
            (if (failureReason.asKnown().isPresent) 1 else 0) +
            (if (phoneNumberId.asKnown().isPresent) 1 else 0) +
            (if (senderId.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (viewedAt.asKnown().isPresent) 1 else 0)

    /**
     * Current status of the partner invitation.
     *
     * `failed` means the client started the connection and it did not finish (they cancelled Meta's
     * dialog, denied a permission, or abandoned the tab). A failed invitation is still usable: the
     * same link can be retried, and it moves back to `in_progress` when the client tries again.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val COMPLETED = of("completed")

            @JvmField val EXPIRED = of("expired")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            IN_PROGRESS,
            COMPLETED,
            EXPIRED,
            CANCELLED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            IN_PROGRESS,
            COMPLETED,
            EXPIRED,
            CANCELLED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETED -> Value.COMPLETED
                EXPIRED -> Value.EXPIRED
                CANCELLED -> Value.CANCELLED
                FAILED -> Value.FAILED
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
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETED -> Known.COMPLETED
                EXPIRED -> Known.EXPIRED
                CANCELLED -> Known.CANCELLED
                FAILED -> Known.FAILED
                else -> throw ZavudevInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The account the client linked, populated once the invitation is `completed`. Null before
     * that. Use it to show the partner what was connected without fetching the sender.
     */
    class ConnectedAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val channel: JsonField<Channel>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, channel, name, mutableMapOf())

        /**
         * Provider-side identifier: the WhatsApp phone number ID, or the Facebook Page ID.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channel(): Channel = channel.getRequired("channel")

        /**
         * Display name of the connected account: the WhatsApp verified name, or the Facebook Page
         * name.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [channel].
         *
         * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [ConnectedAccount].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .channel()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConnectedAccount]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var channel: JsonField<Channel>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectedAccount: ConnectedAccount) = apply {
                id = connectedAccount.id
                channel = connectedAccount.channel
                name = connectedAccount.name
                additionalProperties = connectedAccount.additionalProperties.toMutableMap()
            }

            /** Provider-side identifier: the WhatsApp phone number ID, or the Facebook Page ID. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun channel(channel: Channel) = channel(JsonField.of(channel))

            /**
             * Sets [Builder.channel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channel] with a well-typed [Channel] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

            /**
             * Display name of the connected account: the WhatsApp verified name, or the Facebook
             * Page name.
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [ConnectedAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .channel()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConnectedAccount =
                ConnectedAccount(
                    checkRequired("id", id),
                    checkRequired("channel", channel),
                    name,
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
        fun validate(): ConnectedAccount = apply {
            if (validated) {
                return@apply
            }

            id()
            channel().validate()
            name()
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
                (channel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        class Channel @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WHATSAPP = of("whatsapp")

                @JvmField val MESSENGER = of("messenger")

                @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
            }

            /** An enum containing [Channel]'s known values. */
            enum class Known {
                WHATSAPP,
                MESSENGER,
            }

            /**
             * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Channel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WHATSAPP,
                MESSENGER,
                /**
                 * An enum member indicating that [Channel] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WHATSAPP -> Value.WHATSAPP
                    MESSENGER -> Value.MESSENGER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ZavudevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WHATSAPP -> Known.WHATSAPP
                    MESSENGER -> Known.MESSENGER
                    else -> throw ZavudevInvalidDataException("Unknown Channel: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ZavudevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ZavudevInvalidDataException("Value is not a String")
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

            return other is ConnectedAccount &&
                id == other.id &&
                channel == other.channel &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, channel, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectedAccount{id=$id, channel=$channel, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * Which Meta channel the client connects: `whatsapp_waba` (official WhatsApp Cloud API via
     * embedded signup) or `messenger` (a Facebook Page's Messenger inbox, including Marketplace
     * chats).
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

        return other is Invitation &&
            id == other.id &&
            token == other.token &&
            createdAt == other.createdAt &&
            expiresAt == other.expiresAt &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            url == other.url &&
            clientEmail == other.clientEmail &&
            clientName == other.clientName &&
            clientPhone == other.clientPhone &&
            completedAt == other.completedAt &&
            connectedAccount == other.connectedAccount &&
            connectionType == other.connectionType &&
            failedAt == other.failedAt &&
            failureReason == other.failureReason &&
            phoneNumberId == other.phoneNumberId &&
            senderId == other.senderId &&
            startedAt == other.startedAt &&
            viewedAt == other.viewedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            token,
            createdAt,
            expiresAt,
            status,
            updatedAt,
            url,
            clientEmail,
            clientName,
            clientPhone,
            completedAt,
            connectedAccount,
            connectionType,
            failedAt,
            failureReason,
            phoneNumberId,
            senderId,
            startedAt,
            viewedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invitation{id=$id, token=$token, createdAt=$createdAt, expiresAt=$expiresAt, status=$status, updatedAt=$updatedAt, url=$url, clientEmail=$clientEmail, clientName=$clientName, clientPhone=$clientPhone, completedAt=$completedAt, connectedAccount=$connectedAccount, connectionType=$connectionType, failedAt=$failedAt, failureReason=$failureReason, phoneNumberId=$phoneNumberId, senderId=$senderId, startedAt=$startedAt, viewedAt=$viewedAt, additionalProperties=$additionalProperties}"
}
