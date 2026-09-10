// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

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

class TenDlcBrand
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val email: JsonField<String>,
    private val entityType: JsonField<EntityType>,
    private val phone: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val state: JsonField<String>,
    private val status: JsonField<Status>,
    private val street: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vertical: JsonField<String>,
    private val brandRelationship: JsonField<String>,
    private val brandScore: JsonField<Long>,
    private val companyName: JsonField<String>,
    private val ein: JsonField<String>,
    private val failureReason: JsonField<String>,
    private val firstName: JsonField<String>,
    private val identityStatus: JsonField<String>,
    private val lastName: JsonField<String>,
    private val stockExchange: JsonField<String>,
    private val stockSymbol: JsonField<String>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val verifiedAt: JsonField<OffsetDateTime>,
    private val website: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("displayName")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityType")
        @ExcludeMissing
        entityType: JsonField<EntityType> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postalCode")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vertical") @ExcludeMissing vertical: JsonField<String> = JsonMissing.of(),
        @JsonProperty("brandRelationship")
        @ExcludeMissing
        brandRelationship: JsonField<String> = JsonMissing.of(),
        @JsonProperty("brandScore") @ExcludeMissing brandScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("companyName")
        @ExcludeMissing
        companyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ein") @ExcludeMissing ein: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failureReason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identityStatus")
        @ExcludeMissing
        identityStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stockExchange")
        @ExcludeMissing
        stockExchange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stockSymbol")
        @ExcludeMissing
        stockSymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("submittedAt")
        @ExcludeMissing
        submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("verifiedAt")
        @ExcludeMissing
        verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        city,
        country,
        createdAt,
        displayName,
        email,
        entityType,
        phone,
        postalCode,
        state,
        status,
        street,
        updatedAt,
        vertical,
        brandRelationship,
        brandScore,
        companyName,
        ein,
        failureReason,
        firstName,
        identityStatus,
        lastName,
        stockExchange,
        stockSymbol,
        submittedAt,
        verifiedAt,
        website,
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
    fun city(): String = city.getRequired("city")

    /**
     * Two-letter ISO country code.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Display name of the brand.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("displayName")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * Business entity type for 10DLC brand registration.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityType(): EntityType = entityType.getRequired("entityType")

    /**
     * Contact phone number in E.164 format.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phone(): String = phone.getRequired("phone")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postalCode(): String = postalCode.getRequired("postalCode")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): String = state.getRequired("state")

    /**
     * Status of a 10DLC brand registration.
     * - `draft`: created, not yet submitted to the carrier.
     * - `pending`: submitted, awaiting the carrier's answer.
     * - `verified`: the carrier registered the brand AND verified the business behind it.
     * - `unverified`: the carrier registered the brand but did not verify the business — the
     *   registration exists, the identity check did not pass or has not been resolved. Campaigns
     *   are allowed, with lower daily limits. Read `identityStatus` for the carrier's own wording.
     * - `rejected`: refused by the carrier.
     * - `failed`: the registration never reached the carrier; the fee is refunded.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun street(): String = street.getRequired("street")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Industry vertical.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vertical(): String = vertical.getRequired("vertical")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandRelationship(): Optional<String> = brandRelationship.getOptional("brandRelationship")

    /**
     * Trust score assigned by TCR after vetting.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandScore(): Optional<Long> = brandScore.getOptional("brandScore")

    /**
     * Legal company name.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = companyName.getOptional("companyName")

    /**
     * Employer Identification Number (EIN).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ein(): Optional<String> = ein.getOptional("ein")

    /**
     * Reason for rejection, if applicable.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<String> = failureReason.getOptional("failureReason")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The carrier's raw identity verdict on the business, as the carrier spells it (`VERIFIED`,
     * `VETTED_VERIFIED`, `SELF_DECLARED`, `UNVERIFIED`). Null while the identity has not been
     * resolved — which is not the same as verified, and is why such a brand reports `status:
     * unverified`.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun identityStatus(): Optional<String> = identityStatus.getOptional("identityStatus")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stockExchange(): Optional<String> = stockExchange.getOptional("stockExchange")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stockSymbol(): Optional<String> = stockSymbol.getOptional("stockSymbol")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submittedAt(): Optional<OffsetDateTime> = submittedAt.getOptional("submittedAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verifiedAt(): Optional<OffsetDateTime> = verifiedAt.getOptional("verifiedAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun website(): Optional<String> = website.getOptional("website")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayName") @ExcludeMissing fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityType")
    @ExcludeMissing
    fun _entityType(): JsonField<EntityType> = entityType

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postalCode") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [street].
     *
     * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [vertical].
     *
     * Unlike [vertical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vertical") @ExcludeMissing fun _vertical(): JsonField<String> = vertical

    /**
     * Returns the raw JSON value of [brandRelationship].
     *
     * Unlike [brandRelationship], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("brandRelationship")
    @ExcludeMissing
    fun _brandRelationship(): JsonField<String> = brandRelationship

    /**
     * Returns the raw JSON value of [brandScore].
     *
     * Unlike [brandScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brandScore") @ExcludeMissing fun _brandScore(): JsonField<Long> = brandScore

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("companyName") @ExcludeMissing fun _companyName(): JsonField<String> = companyName

    /**
     * Returns the raw JSON value of [ein].
     *
     * Unlike [ein], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<String> = ein

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureReason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [identityStatus].
     *
     * Unlike [identityStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identityStatus")
    @ExcludeMissing
    fun _identityStatus(): JsonField<String> = identityStatus

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [stockExchange].
     *
     * Unlike [stockExchange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stockExchange")
    @ExcludeMissing
    fun _stockExchange(): JsonField<String> = stockExchange

    /**
     * Returns the raw JSON value of [stockSymbol].
     *
     * Unlike [stockSymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stockSymbol") @ExcludeMissing fun _stockSymbol(): JsonField<String> = stockSymbol

    /**
     * Returns the raw JSON value of [submittedAt].
     *
     * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submittedAt")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

    /**
     * Returns the raw JSON value of [verifiedAt].
     *
     * Unlike [verifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verifiedAt")
    @ExcludeMissing
    fun _verifiedAt(): JsonField<OffsetDateTime> = verifiedAt

    /**
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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
         * Returns a mutable builder for constructing an instance of [TenDlcBrand].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .city()
         * .country()
         * .createdAt()
         * .displayName()
         * .email()
         * .entityType()
         * .phone()
         * .postalCode()
         * .state()
         * .status()
         * .street()
         * .updatedAt()
         * .vertical()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TenDlcBrand]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var displayName: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var entityType: JsonField<EntityType>? = null
        private var phone: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var state: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var street: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var vertical: JsonField<String>? = null
        private var brandRelationship: JsonField<String> = JsonMissing.of()
        private var brandScore: JsonField<Long> = JsonMissing.of()
        private var companyName: JsonField<String> = JsonMissing.of()
        private var ein: JsonField<String> = JsonMissing.of()
        private var failureReason: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var identityStatus: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var stockExchange: JsonField<String> = JsonMissing.of()
        private var stockSymbol: JsonField<String> = JsonMissing.of()
        private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var website: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tenDlcBrand: TenDlcBrand) = apply {
            id = tenDlcBrand.id
            city = tenDlcBrand.city
            country = tenDlcBrand.country
            createdAt = tenDlcBrand.createdAt
            displayName = tenDlcBrand.displayName
            email = tenDlcBrand.email
            entityType = tenDlcBrand.entityType
            phone = tenDlcBrand.phone
            postalCode = tenDlcBrand.postalCode
            state = tenDlcBrand.state
            status = tenDlcBrand.status
            street = tenDlcBrand.street
            updatedAt = tenDlcBrand.updatedAt
            vertical = tenDlcBrand.vertical
            brandRelationship = tenDlcBrand.brandRelationship
            brandScore = tenDlcBrand.brandScore
            companyName = tenDlcBrand.companyName
            ein = tenDlcBrand.ein
            failureReason = tenDlcBrand.failureReason
            firstName = tenDlcBrand.firstName
            identityStatus = tenDlcBrand.identityStatus
            lastName = tenDlcBrand.lastName
            stockExchange = tenDlcBrand.stockExchange
            stockSymbol = tenDlcBrand.stockSymbol
            submittedAt = tenDlcBrand.submittedAt
            verifiedAt = tenDlcBrand.verifiedAt
            website = tenDlcBrand.website
            additionalProperties = tenDlcBrand.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** Two-letter ISO country code. */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Display name of the brand. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Business entity type for 10DLC brand registration. */
        fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [EntityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { this.entityType = entityType }

        /** Contact phone number in E.164 format. */
        fun phone(phone: String) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /**
         * Status of a 10DLC brand registration.
         * - `draft`: created, not yet submitted to the carrier.
         * - `pending`: submitted, awaiting the carrier's answer.
         * - `verified`: the carrier registered the brand AND verified the business behind it.
         * - `unverified`: the carrier registered the brand but did not verify the business — the
         *   registration exists, the identity check did not pass or has not been resolved.
         *   Campaigns are allowed, with lower daily limits. Read `identityStatus` for the carrier's
         *   own wording.
         * - `rejected`: refused by the carrier.
         * - `failed`: the registration never reached the carrier; the fee is refunded.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun street(street: String) = street(JsonField.of(street))

        /**
         * Sets [Builder.street] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street(street: JsonField<String>) = apply { this.street = street }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Industry vertical. */
        fun vertical(vertical: String) = vertical(JsonField.of(vertical))

        /**
         * Sets [Builder.vertical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vertical] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vertical(vertical: JsonField<String>) = apply { this.vertical = vertical }

        fun brandRelationship(brandRelationship: String?) =
            brandRelationship(JsonField.ofNullable(brandRelationship))

        /** Alias for calling [Builder.brandRelationship] with `brandRelationship.orElse(null)`. */
        fun brandRelationship(brandRelationship: Optional<String>) =
            brandRelationship(brandRelationship.getOrNull())

        /**
         * Sets [Builder.brandRelationship] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandRelationship] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun brandRelationship(brandRelationship: JsonField<String>) = apply {
            this.brandRelationship = brandRelationship
        }

        /** Trust score assigned by TCR after vetting. */
        fun brandScore(brandScore: Long?) = brandScore(JsonField.ofNullable(brandScore))

        /**
         * Alias for [Builder.brandScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun brandScore(brandScore: Long) = brandScore(brandScore as Long?)

        /** Alias for calling [Builder.brandScore] with `brandScore.orElse(null)`. */
        fun brandScore(brandScore: Optional<Long>) = brandScore(brandScore.getOrNull())

        /**
         * Sets [Builder.brandScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandScore] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandScore(brandScore: JsonField<Long>) = apply { this.brandScore = brandScore }

        /** Legal company name. */
        fun companyName(companyName: String?) = companyName(JsonField.ofNullable(companyName))

        /** Alias for calling [Builder.companyName] with `companyName.orElse(null)`. */
        fun companyName(companyName: Optional<String>) = companyName(companyName.getOrNull())

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        /** Employer Identification Number (EIN). */
        fun ein(ein: String?) = ein(JsonField.ofNullable(ein))

        /** Alias for calling [Builder.ein] with `ein.orElse(null)`. */
        fun ein(ein: Optional<String>) = ein(ein.getOrNull())

        /**
         * Sets [Builder.ein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ein(ein: JsonField<String>) = apply { this.ein = ein }

        /** Reason for rejection, if applicable. */
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

        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /**
         * The carrier's raw identity verdict on the business, as the carrier spells it (`VERIFIED`,
         * `VETTED_VERIFIED`, `SELF_DECLARED`, `UNVERIFIED`). Null while the identity has not been
         * resolved — which is not the same as verified, and is why such a brand reports `status:
         * unverified`.
         */
        fun identityStatus(identityStatus: String?) =
            identityStatus(JsonField.ofNullable(identityStatus))

        /** Alias for calling [Builder.identityStatus] with `identityStatus.orElse(null)`. */
        fun identityStatus(identityStatus: Optional<String>) =
            identityStatus(identityStatus.getOrNull())

        /**
         * Sets [Builder.identityStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identityStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun identityStatus(identityStatus: JsonField<String>) = apply {
            this.identityStatus = identityStatus
        }

        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        fun stockExchange(stockExchange: String?) =
            stockExchange(JsonField.ofNullable(stockExchange))

        /** Alias for calling [Builder.stockExchange] with `stockExchange.orElse(null)`. */
        fun stockExchange(stockExchange: Optional<String>) =
            stockExchange(stockExchange.getOrNull())

        /**
         * Sets [Builder.stockExchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockExchange] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stockExchange(stockExchange: JsonField<String>) = apply {
            this.stockExchange = stockExchange
        }

        fun stockSymbol(stockSymbol: String?) = stockSymbol(JsonField.ofNullable(stockSymbol))

        /** Alias for calling [Builder.stockSymbol] with `stockSymbol.orElse(null)`. */
        fun stockSymbol(stockSymbol: Optional<String>) = stockSymbol(stockSymbol.getOrNull())

        /**
         * Sets [Builder.stockSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockSymbol] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stockSymbol(stockSymbol: JsonField<String>) = apply { this.stockSymbol = stockSymbol }

        fun submittedAt(submittedAt: OffsetDateTime?) =
            submittedAt(JsonField.ofNullable(submittedAt))

        /** Alias for calling [Builder.submittedAt] with `submittedAt.orElse(null)`. */
        fun submittedAt(submittedAt: Optional<OffsetDateTime>) =
            submittedAt(submittedAt.getOrNull())

        /**
         * Sets [Builder.submittedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
        }

        fun verifiedAt(verifiedAt: OffsetDateTime?) = verifiedAt(JsonField.ofNullable(verifiedAt))

        /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
        fun verifiedAt(verifiedAt: Optional<OffsetDateTime>) = verifiedAt(verifiedAt.getOrNull())

        /**
         * Sets [Builder.verifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verifiedAt(verifiedAt: JsonField<OffsetDateTime>) = apply {
            this.verifiedAt = verifiedAt
        }

        fun website(website: String?) = website(JsonField.ofNullable(website))

        /** Alias for calling [Builder.website] with `website.orElse(null)`. */
        fun website(website: Optional<String>) = website(website.getOrNull())

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { this.website = website }

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
         * Returns an immutable instance of [TenDlcBrand].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .city()
         * .country()
         * .createdAt()
         * .displayName()
         * .email()
         * .entityType()
         * .phone()
         * .postalCode()
         * .state()
         * .status()
         * .street()
         * .updatedAt()
         * .vertical()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TenDlcBrand =
            TenDlcBrand(
                checkRequired("id", id),
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("createdAt", createdAt),
                checkRequired("displayName", displayName),
                checkRequired("email", email),
                checkRequired("entityType", entityType),
                checkRequired("phone", phone),
                checkRequired("postalCode", postalCode),
                checkRequired("state", state),
                checkRequired("status", status),
                checkRequired("street", street),
                checkRequired("updatedAt", updatedAt),
                checkRequired("vertical", vertical),
                brandRelationship,
                brandScore,
                companyName,
                ein,
                failureReason,
                firstName,
                identityStatus,
                lastName,
                stockExchange,
                stockSymbol,
                submittedAt,
                verifiedAt,
                website,
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
    fun validate(): TenDlcBrand = apply {
        if (validated) {
            return@apply
        }

        id()
        city()
        country()
        createdAt()
        displayName()
        email()
        entityType().validate()
        phone()
        postalCode()
        state()
        status().validate()
        street()
        updatedAt()
        vertical()
        brandRelationship()
        brandScore()
        companyName()
        ein()
        failureReason()
        firstName()
        identityStatus()
        lastName()
        stockExchange()
        stockSymbol()
        submittedAt()
        verifiedAt()
        website()
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
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (entityType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (phone.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (street.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (vertical.asKnown().isPresent) 1 else 0) +
            (if (brandRelationship.asKnown().isPresent) 1 else 0) +
            (if (brandScore.asKnown().isPresent) 1 else 0) +
            (if (companyName.asKnown().isPresent) 1 else 0) +
            (if (ein.asKnown().isPresent) 1 else 0) +
            (if (failureReason.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (identityStatus.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (stockExchange.asKnown().isPresent) 1 else 0) +
            (if (stockSymbol.asKnown().isPresent) 1 else 0) +
            (if (submittedAt.asKnown().isPresent) 1 else 0) +
            (if (verifiedAt.asKnown().isPresent) 1 else 0) +
            (if (website.asKnown().isPresent) 1 else 0)

    /** Business entity type for 10DLC brand registration. */
    class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PRIVATE_PROFIT = of("PRIVATE_PROFIT")

            @JvmField val PUBLIC_PROFIT = of("PUBLIC_PROFIT")

            @JvmField val NON_PROFIT = of("NON_PROFIT")

            @JvmField val GOVERNMENT = of("GOVERNMENT")

            @JvmField val SOLE_PROPRIETOR = of("SOLE_PROPRIETOR")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            PRIVATE_PROFIT,
            PUBLIC_PROFIT,
            NON_PROFIT,
            GOVERNMENT,
            SOLE_PROPRIETOR,
        }

        /**
         * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRIVATE_PROFIT,
            PUBLIC_PROFIT,
            NON_PROFIT,
            GOVERNMENT,
            SOLE_PROPRIETOR,
            /**
             * An enum member indicating that [EntityType] was instantiated with an unknown value.
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
                PRIVATE_PROFIT -> Value.PRIVATE_PROFIT
                PUBLIC_PROFIT -> Value.PUBLIC_PROFIT
                NON_PROFIT -> Value.NON_PROFIT
                GOVERNMENT -> Value.GOVERNMENT
                SOLE_PROPRIETOR -> Value.SOLE_PROPRIETOR
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
                PRIVATE_PROFIT -> Known.PRIVATE_PROFIT
                PUBLIC_PROFIT -> Known.PUBLIC_PROFIT
                NON_PROFIT -> Known.NON_PROFIT
                GOVERNMENT -> Known.GOVERNMENT
                SOLE_PROPRIETOR -> Known.SOLE_PROPRIETOR
                else -> throw ZavudevInvalidDataException("Unknown EntityType: $value")
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
        fun validate(): EntityType = apply {
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

            return other is EntityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Status of a 10DLC brand registration.
     * - `draft`: created, not yet submitted to the carrier.
     * - `pending`: submitted, awaiting the carrier's answer.
     * - `verified`: the carrier registered the brand AND verified the business behind it.
     * - `unverified`: the carrier registered the brand but did not verify the business — the
     *   registration exists, the identity check did not pass or has not been resolved. Campaigns
     *   are allowed, with lower daily limits. Read `identityStatus` for the carrier's own wording.
     * - `rejected`: refused by the carrier.
     * - `failed`: the registration never reached the carrier; the fee is refunded.
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

            @JvmField val DRAFT = of("draft")

            @JvmField val PENDING = of("pending")

            @JvmField val VERIFIED = of("verified")

            @JvmField val UNVERIFIED = of("unverified")

            @JvmField val REJECTED = of("rejected")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            PENDING,
            VERIFIED,
            UNVERIFIED,
            REJECTED,
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
            DRAFT,
            PENDING,
            VERIFIED,
            UNVERIFIED,
            REJECTED,
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
                DRAFT -> Value.DRAFT
                PENDING -> Value.PENDING
                VERIFIED -> Value.VERIFIED
                UNVERIFIED -> Value.UNVERIFIED
                REJECTED -> Value.REJECTED
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
                DRAFT -> Known.DRAFT
                PENDING -> Known.PENDING
                VERIFIED -> Known.VERIFIED
                UNVERIFIED -> Known.UNVERIFIED
                REJECTED -> Known.REJECTED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenDlcBrand &&
            id == other.id &&
            city == other.city &&
            country == other.country &&
            createdAt == other.createdAt &&
            displayName == other.displayName &&
            email == other.email &&
            entityType == other.entityType &&
            phone == other.phone &&
            postalCode == other.postalCode &&
            state == other.state &&
            status == other.status &&
            street == other.street &&
            updatedAt == other.updatedAt &&
            vertical == other.vertical &&
            brandRelationship == other.brandRelationship &&
            brandScore == other.brandScore &&
            companyName == other.companyName &&
            ein == other.ein &&
            failureReason == other.failureReason &&
            firstName == other.firstName &&
            identityStatus == other.identityStatus &&
            lastName == other.lastName &&
            stockExchange == other.stockExchange &&
            stockSymbol == other.stockSymbol &&
            submittedAt == other.submittedAt &&
            verifiedAt == other.verifiedAt &&
            website == other.website &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            city,
            country,
            createdAt,
            displayName,
            email,
            entityType,
            phone,
            postalCode,
            state,
            status,
            street,
            updatedAt,
            vertical,
            brandRelationship,
            brandScore,
            companyName,
            ein,
            failureReason,
            firstName,
            identityStatus,
            lastName,
            stockExchange,
            stockSymbol,
            submittedAt,
            verifiedAt,
            website,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TenDlcBrand{id=$id, city=$city, country=$country, createdAt=$createdAt, displayName=$displayName, email=$email, entityType=$entityType, phone=$phone, postalCode=$postalCode, state=$state, status=$status, street=$street, updatedAt=$updatedAt, vertical=$vertical, brandRelationship=$brandRelationship, brandScore=$brandScore, companyName=$companyName, ein=$ein, failureReason=$failureReason, firstName=$firstName, identityStatus=$identityStatus, lastName=$lastName, stockExchange=$stockExchange, stockSymbol=$stockSymbol, submittedAt=$submittedAt, verifiedAt=$verifiedAt, website=$website, additionalProperties=$additionalProperties}"
}
