// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.Enum
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

class TenDlcCampaign
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val affiliateMarketing: JsonField<Boolean>,
    private val ageGated: JsonField<Boolean>,
    private val brandId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val directLending: JsonField<Boolean>,
    private val embeddedLink: JsonField<Boolean>,
    private val embeddedPhone: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val numberPooling: JsonField<Boolean>,
    private val sampleMessages: JsonField<List<String>>,
    private val status: JsonField<Status>,
    private val subscriberHelp: JsonField<Boolean>,
    private val subscriberOptIn: JsonField<Boolean>,
    private val subscriberOptOut: JsonField<Boolean>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val useCase: JsonField<String>,
    private val approvedAt: JsonField<OffsetDateTime>,
    private val dailyLimit: JsonField<Long>,
    private val failureReason: JsonField<String>,
    private val helpMessage: JsonField<String>,
    private val messageFlow: JsonField<String>,
    private val monthlyFeeCents: JsonField<Long>,
    private val optInKeywords: JsonField<List<String>>,
    private val optOutKeywords: JsonField<List<String>>,
    private val registrationCostCents: JsonField<Long>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val subUseCases: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("affiliateMarketing")
        @ExcludeMissing
        affiliateMarketing: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ageGated") @ExcludeMissing ageGated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("directLending")
        @ExcludeMissing
        directLending: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("embeddedLink")
        @ExcludeMissing
        embeddedLink: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("embeddedPhone")
        @ExcludeMissing
        embeddedPhone: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numberPooling")
        @ExcludeMissing
        numberPooling: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sampleMessages")
        @ExcludeMissing
        sampleMessages: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subscriberHelp")
        @ExcludeMissing
        subscriberHelp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("subscriberOptIn")
        @ExcludeMissing
        subscriberOptIn: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("subscriberOptOut")
        @ExcludeMissing
        subscriberOptOut: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("useCase") @ExcludeMissing useCase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approvedAt")
        @ExcludeMissing
        approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dailyLimit") @ExcludeMissing dailyLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("failureReason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("helpMessage")
        @ExcludeMissing
        helpMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("messageFlow")
        @ExcludeMissing
        messageFlow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("monthlyFeeCents")
        @ExcludeMissing
        monthlyFeeCents: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("optInKeywords")
        @ExcludeMissing
        optInKeywords: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("optOutKeywords")
        @ExcludeMissing
        optOutKeywords: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("registrationCostCents")
        @ExcludeMissing
        registrationCostCents: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("submittedAt")
        @ExcludeMissing
        submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subUseCases")
        @ExcludeMissing
        subUseCases: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        affiliateMarketing,
        ageGated,
        brandId,
        createdAt,
        description,
        directLending,
        embeddedLink,
        embeddedPhone,
        name,
        numberPooling,
        sampleMessages,
        status,
        subscriberHelp,
        subscriberOptIn,
        subscriberOptOut,
        updatedAt,
        useCase,
        approvedAt,
        dailyLimit,
        failureReason,
        helpMessage,
        messageFlow,
        monthlyFeeCents,
        optInKeywords,
        optOutKeywords,
        registrationCostCents,
        submittedAt,
        subUseCases,
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
    fun affiliateMarketing(): Boolean = affiliateMarketing.getRequired("affiliateMarketing")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ageGated(): Boolean = ageGated.getRequired("ageGated")

    /**
     * ID of the brand this campaign belongs to.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brandId")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Description of the messaging campaign.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun directLending(): Boolean = directLending.getRequired("directLending")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddedLink(): Boolean = embeddedLink.getRequired("embeddedLink")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddedPhone(): Boolean = embeddedPhone.getRequired("embeddedPhone")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numberPooling(): Boolean = numberPooling.getRequired("numberPooling")

    /**
     * Sample messages representative of campaign content.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sampleMessages(): List<String> = sampleMessages.getRequired("sampleMessages")

    /**
     * Status of a 10DLC campaign registration.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberHelp(): Boolean = subscriberHelp.getRequired("subscriberHelp")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberOptIn(): Boolean = subscriberOptIn.getRequired("subscriberOptIn")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberOptOut(): Boolean = subscriberOptOut.getRequired("subscriberOptOut")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Campaign use case type.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useCase(): String = useCase.getRequired("useCase")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedAt(): Optional<OffsetDateTime> = approvedAt.getOptional("approvedAt")

    /**
     * Daily message limit based on brand trust score.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailyLimit(): Optional<Long> = dailyLimit.getOptional("dailyLimit")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<String> = failureReason.getOptional("failureReason")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun helpMessage(): Optional<String> = helpMessage.getOptional("helpMessage")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageFlow(): Optional<String> = messageFlow.getOptional("messageFlow")

    /**
     * Recurring monthly fee in cents.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyFeeCents(): Optional<Long> = monthlyFeeCents.getOptional("monthlyFeeCents")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optInKeywords(): Optional<List<String>> = optInKeywords.getOptional("optInKeywords")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optOutKeywords(): Optional<List<String>> = optOutKeywords.getOptional("optOutKeywords")

    /**
     * One-time registration cost in cents.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registrationCostCents(): Optional<Long> =
        registrationCostCents.getOptional("registrationCostCents")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submittedAt(): Optional<OffsetDateTime> = submittedAt.getOptional("submittedAt")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subUseCases(): Optional<List<String>> = subUseCases.getOptional("subUseCases")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [affiliateMarketing].
     *
     * Unlike [affiliateMarketing], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("affiliateMarketing")
    @ExcludeMissing
    fun _affiliateMarketing(): JsonField<Boolean> = affiliateMarketing

    /**
     * Returns the raw JSON value of [ageGated].
     *
     * Unlike [ageGated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ageGated") @ExcludeMissing fun _ageGated(): JsonField<Boolean> = ageGated

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [directLending].
     *
     * Unlike [directLending], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("directLending")
    @ExcludeMissing
    fun _directLending(): JsonField<Boolean> = directLending

    /**
     * Returns the raw JSON value of [embeddedLink].
     *
     * Unlike [embeddedLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embeddedLink")
    @ExcludeMissing
    fun _embeddedLink(): JsonField<Boolean> = embeddedLink

    /**
     * Returns the raw JSON value of [embeddedPhone].
     *
     * Unlike [embeddedPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embeddedPhone")
    @ExcludeMissing
    fun _embeddedPhone(): JsonField<Boolean> = embeddedPhone

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [numberPooling].
     *
     * Unlike [numberPooling], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numberPooling")
    @ExcludeMissing
    fun _numberPooling(): JsonField<Boolean> = numberPooling

    /**
     * Returns the raw JSON value of [sampleMessages].
     *
     * Unlike [sampleMessages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sampleMessages")
    @ExcludeMissing
    fun _sampleMessages(): JsonField<List<String>> = sampleMessages

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subscriberHelp].
     *
     * Unlike [subscriberHelp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriberHelp")
    @ExcludeMissing
    fun _subscriberHelp(): JsonField<Boolean> = subscriberHelp

    /**
     * Returns the raw JSON value of [subscriberOptIn].
     *
     * Unlike [subscriberOptIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscriberOptIn")
    @ExcludeMissing
    fun _subscriberOptIn(): JsonField<Boolean> = subscriberOptIn

    /**
     * Returns the raw JSON value of [subscriberOptOut].
     *
     * Unlike [subscriberOptOut], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriberOptOut")
    @ExcludeMissing
    fun _subscriberOptOut(): JsonField<Boolean> = subscriberOptOut

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [useCase].
     *
     * Unlike [useCase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("useCase") @ExcludeMissing fun _useCase(): JsonField<String> = useCase

    /**
     * Returns the raw JSON value of [approvedAt].
     *
     * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approvedAt")
    @ExcludeMissing
    fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

    /**
     * Returns the raw JSON value of [dailyLimit].
     *
     * Unlike [dailyLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dailyLimit") @ExcludeMissing fun _dailyLimit(): JsonField<Long> = dailyLimit

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureReason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /**
     * Returns the raw JSON value of [helpMessage].
     *
     * Unlike [helpMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("helpMessage") @ExcludeMissing fun _helpMessage(): JsonField<String> = helpMessage

    /**
     * Returns the raw JSON value of [messageFlow].
     *
     * Unlike [messageFlow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messageFlow") @ExcludeMissing fun _messageFlow(): JsonField<String> = messageFlow

    /**
     * Returns the raw JSON value of [monthlyFeeCents].
     *
     * Unlike [monthlyFeeCents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthlyFeeCents")
    @ExcludeMissing
    fun _monthlyFeeCents(): JsonField<Long> = monthlyFeeCents

    /**
     * Returns the raw JSON value of [optInKeywords].
     *
     * Unlike [optInKeywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("optInKeywords")
    @ExcludeMissing
    fun _optInKeywords(): JsonField<List<String>> = optInKeywords

    /**
     * Returns the raw JSON value of [optOutKeywords].
     *
     * Unlike [optOutKeywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("optOutKeywords")
    @ExcludeMissing
    fun _optOutKeywords(): JsonField<List<String>> = optOutKeywords

    /**
     * Returns the raw JSON value of [registrationCostCents].
     *
     * Unlike [registrationCostCents], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("registrationCostCents")
    @ExcludeMissing
    fun _registrationCostCents(): JsonField<Long> = registrationCostCents

    /**
     * Returns the raw JSON value of [submittedAt].
     *
     * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submittedAt")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

    /**
     * Returns the raw JSON value of [subUseCases].
     *
     * Unlike [subUseCases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subUseCases")
    @ExcludeMissing
    fun _subUseCases(): JsonField<List<String>> = subUseCases

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
         * Returns a mutable builder for constructing an instance of [TenDlcCampaign].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .affiliateMarketing()
         * .ageGated()
         * .brandId()
         * .createdAt()
         * .description()
         * .directLending()
         * .embeddedLink()
         * .embeddedPhone()
         * .name()
         * .numberPooling()
         * .sampleMessages()
         * .status()
         * .subscriberHelp()
         * .subscriberOptIn()
         * .subscriberOptOut()
         * .updatedAt()
         * .useCase()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TenDlcCampaign]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var affiliateMarketing: JsonField<Boolean>? = null
        private var ageGated: JsonField<Boolean>? = null
        private var brandId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var directLending: JsonField<Boolean>? = null
        private var embeddedLink: JsonField<Boolean>? = null
        private var embeddedPhone: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var numberPooling: JsonField<Boolean>? = null
        private var sampleMessages: JsonField<MutableList<String>>? = null
        private var status: JsonField<Status>? = null
        private var subscriberHelp: JsonField<Boolean>? = null
        private var subscriberOptIn: JsonField<Boolean>? = null
        private var subscriberOptOut: JsonField<Boolean>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var useCase: JsonField<String>? = null
        private var approvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dailyLimit: JsonField<Long> = JsonMissing.of()
        private var failureReason: JsonField<String> = JsonMissing.of()
        private var helpMessage: JsonField<String> = JsonMissing.of()
        private var messageFlow: JsonField<String> = JsonMissing.of()
        private var monthlyFeeCents: JsonField<Long> = JsonMissing.of()
        private var optInKeywords: JsonField<MutableList<String>>? = null
        private var optOutKeywords: JsonField<MutableList<String>>? = null
        private var registrationCostCents: JsonField<Long> = JsonMissing.of()
        private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subUseCases: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tenDlcCampaign: TenDlcCampaign) = apply {
            id = tenDlcCampaign.id
            affiliateMarketing = tenDlcCampaign.affiliateMarketing
            ageGated = tenDlcCampaign.ageGated
            brandId = tenDlcCampaign.brandId
            createdAt = tenDlcCampaign.createdAt
            description = tenDlcCampaign.description
            directLending = tenDlcCampaign.directLending
            embeddedLink = tenDlcCampaign.embeddedLink
            embeddedPhone = tenDlcCampaign.embeddedPhone
            name = tenDlcCampaign.name
            numberPooling = tenDlcCampaign.numberPooling
            sampleMessages = tenDlcCampaign.sampleMessages.map { it.toMutableList() }
            status = tenDlcCampaign.status
            subscriberHelp = tenDlcCampaign.subscriberHelp
            subscriberOptIn = tenDlcCampaign.subscriberOptIn
            subscriberOptOut = tenDlcCampaign.subscriberOptOut
            updatedAt = tenDlcCampaign.updatedAt
            useCase = tenDlcCampaign.useCase
            approvedAt = tenDlcCampaign.approvedAt
            dailyLimit = tenDlcCampaign.dailyLimit
            failureReason = tenDlcCampaign.failureReason
            helpMessage = tenDlcCampaign.helpMessage
            messageFlow = tenDlcCampaign.messageFlow
            monthlyFeeCents = tenDlcCampaign.monthlyFeeCents
            optInKeywords = tenDlcCampaign.optInKeywords.map { it.toMutableList() }
            optOutKeywords = tenDlcCampaign.optOutKeywords.map { it.toMutableList() }
            registrationCostCents = tenDlcCampaign.registrationCostCents
            submittedAt = tenDlcCampaign.submittedAt
            subUseCases = tenDlcCampaign.subUseCases.map { it.toMutableList() }
            additionalProperties = tenDlcCampaign.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun affiliateMarketing(affiliateMarketing: Boolean) =
            affiliateMarketing(JsonField.of(affiliateMarketing))

        /**
         * Sets [Builder.affiliateMarketing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.affiliateMarketing] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun affiliateMarketing(affiliateMarketing: JsonField<Boolean>) = apply {
            this.affiliateMarketing = affiliateMarketing
        }

        fun ageGated(ageGated: Boolean) = ageGated(JsonField.of(ageGated))

        /**
         * Sets [Builder.ageGated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ageGated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ageGated(ageGated: JsonField<Boolean>) = apply { this.ageGated = ageGated }

        /** ID of the brand this campaign belongs to. */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Description of the messaging campaign. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun directLending(directLending: Boolean) = directLending(JsonField.of(directLending))

        /**
         * Sets [Builder.directLending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.directLending] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun directLending(directLending: JsonField<Boolean>) = apply {
            this.directLending = directLending
        }

        fun embeddedLink(embeddedLink: Boolean) = embeddedLink(JsonField.of(embeddedLink))

        /**
         * Sets [Builder.embeddedLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddedLink] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun embeddedLink(embeddedLink: JsonField<Boolean>) = apply {
            this.embeddedLink = embeddedLink
        }

        fun embeddedPhone(embeddedPhone: Boolean) = embeddedPhone(JsonField.of(embeddedPhone))

        /**
         * Sets [Builder.embeddedPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddedPhone] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddedPhone(embeddedPhone: JsonField<Boolean>) = apply {
            this.embeddedPhone = embeddedPhone
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun numberPooling(numberPooling: Boolean) = numberPooling(JsonField.of(numberPooling))

        /**
         * Sets [Builder.numberPooling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberPooling] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numberPooling(numberPooling: JsonField<Boolean>) = apply {
            this.numberPooling = numberPooling
        }

        /** Sample messages representative of campaign content. */
        fun sampleMessages(sampleMessages: List<String>) =
            sampleMessages(JsonField.of(sampleMessages))

        /**
         * Sets [Builder.sampleMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sampleMessages] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sampleMessages(sampleMessages: JsonField<List<String>>) = apply {
            this.sampleMessages = sampleMessages.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [sampleMessages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSampleMessage(sampleMessage: String) = apply {
            sampleMessages =
                (sampleMessages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sampleMessages", it).add(sampleMessage)
                }
        }

        /** Status of a 10DLC campaign registration. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subscriberHelp(subscriberHelp: Boolean) = subscriberHelp(JsonField.of(subscriberHelp))

        /**
         * Sets [Builder.subscriberHelp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberHelp] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberHelp(subscriberHelp: JsonField<Boolean>) = apply {
            this.subscriberHelp = subscriberHelp
        }

        fun subscriberOptIn(subscriberOptIn: Boolean) =
            subscriberOptIn(JsonField.of(subscriberOptIn))

        /**
         * Sets [Builder.subscriberOptIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberOptIn] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberOptIn(subscriberOptIn: JsonField<Boolean>) = apply {
            this.subscriberOptIn = subscriberOptIn
        }

        fun subscriberOptOut(subscriberOptOut: Boolean) =
            subscriberOptOut(JsonField.of(subscriberOptOut))

        /**
         * Sets [Builder.subscriberOptOut] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberOptOut] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberOptOut(subscriberOptOut: JsonField<Boolean>) = apply {
            this.subscriberOptOut = subscriberOptOut
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Campaign use case type. */
        fun useCase(useCase: String) = useCase(JsonField.of(useCase))

        /**
         * Sets [Builder.useCase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun useCase(useCase: JsonField<String>) = apply { this.useCase = useCase }

        fun approvedAt(approvedAt: OffsetDateTime?) = approvedAt(JsonField.ofNullable(approvedAt))

        /** Alias for calling [Builder.approvedAt] with `approvedAt.orElse(null)`. */
        fun approvedAt(approvedAt: Optional<OffsetDateTime>) = approvedAt(approvedAt.getOrNull())

        /**
         * Sets [Builder.approvedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
            this.approvedAt = approvedAt
        }

        /** Daily message limit based on brand trust score. */
        fun dailyLimit(dailyLimit: Long?) = dailyLimit(JsonField.ofNullable(dailyLimit))

        /**
         * Alias for [Builder.dailyLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dailyLimit(dailyLimit: Long) = dailyLimit(dailyLimit as Long?)

        /** Alias for calling [Builder.dailyLimit] with `dailyLimit.orElse(null)`. */
        fun dailyLimit(dailyLimit: Optional<Long>) = dailyLimit(dailyLimit.getOrNull())

        /**
         * Sets [Builder.dailyLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dailyLimit(dailyLimit: JsonField<Long>) = apply { this.dailyLimit = dailyLimit }

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

        fun helpMessage(helpMessage: String?) = helpMessage(JsonField.ofNullable(helpMessage))

        /** Alias for calling [Builder.helpMessage] with `helpMessage.orElse(null)`. */
        fun helpMessage(helpMessage: Optional<String>) = helpMessage(helpMessage.getOrNull())

        /**
         * Sets [Builder.helpMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.helpMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun helpMessage(helpMessage: JsonField<String>) = apply { this.helpMessage = helpMessage }

        fun messageFlow(messageFlow: String?) = messageFlow(JsonField.ofNullable(messageFlow))

        /** Alias for calling [Builder.messageFlow] with `messageFlow.orElse(null)`. */
        fun messageFlow(messageFlow: Optional<String>) = messageFlow(messageFlow.getOrNull())

        /**
         * Sets [Builder.messageFlow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageFlow] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageFlow(messageFlow: JsonField<String>) = apply { this.messageFlow = messageFlow }

        /** Recurring monthly fee in cents. */
        fun monthlyFeeCents(monthlyFeeCents: Long?) =
            monthlyFeeCents(JsonField.ofNullable(monthlyFeeCents))

        /**
         * Alias for [Builder.monthlyFeeCents].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun monthlyFeeCents(monthlyFeeCents: Long) = monthlyFeeCents(monthlyFeeCents as Long?)

        /** Alias for calling [Builder.monthlyFeeCents] with `monthlyFeeCents.orElse(null)`. */
        fun monthlyFeeCents(monthlyFeeCents: Optional<Long>) =
            monthlyFeeCents(monthlyFeeCents.getOrNull())

        /**
         * Sets [Builder.monthlyFeeCents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyFeeCents] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthlyFeeCents(monthlyFeeCents: JsonField<Long>) = apply {
            this.monthlyFeeCents = monthlyFeeCents
        }

        fun optInKeywords(optInKeywords: List<String>?) =
            optInKeywords(JsonField.ofNullable(optInKeywords))

        /** Alias for calling [Builder.optInKeywords] with `optInKeywords.orElse(null)`. */
        fun optInKeywords(optInKeywords: Optional<List<String>>) =
            optInKeywords(optInKeywords.getOrNull())

        /**
         * Sets [Builder.optInKeywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optInKeywords] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optInKeywords(optInKeywords: JsonField<List<String>>) = apply {
            this.optInKeywords = optInKeywords.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [optInKeywords].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOptInKeyword(optInKeyword: String) = apply {
            optInKeywords =
                (optInKeywords ?: JsonField.of(mutableListOf())).also {
                    checkKnown("optInKeywords", it).add(optInKeyword)
                }
        }

        fun optOutKeywords(optOutKeywords: List<String>?) =
            optOutKeywords(JsonField.ofNullable(optOutKeywords))

        /** Alias for calling [Builder.optOutKeywords] with `optOutKeywords.orElse(null)`. */
        fun optOutKeywords(optOutKeywords: Optional<List<String>>) =
            optOutKeywords(optOutKeywords.getOrNull())

        /**
         * Sets [Builder.optOutKeywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optOutKeywords] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optOutKeywords(optOutKeywords: JsonField<List<String>>) = apply {
            this.optOutKeywords = optOutKeywords.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [optOutKeywords].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOptOutKeyword(optOutKeyword: String) = apply {
            optOutKeywords =
                (optOutKeywords ?: JsonField.of(mutableListOf())).also {
                    checkKnown("optOutKeywords", it).add(optOutKeyword)
                }
        }

        /** One-time registration cost in cents. */
        fun registrationCostCents(registrationCostCents: Long?) =
            registrationCostCents(JsonField.ofNullable(registrationCostCents))

        /**
         * Alias for [Builder.registrationCostCents].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun registrationCostCents(registrationCostCents: Long) =
            registrationCostCents(registrationCostCents as Long?)

        /**
         * Alias for calling [Builder.registrationCostCents] with
         * `registrationCostCents.orElse(null)`.
         */
        fun registrationCostCents(registrationCostCents: Optional<Long>) =
            registrationCostCents(registrationCostCents.getOrNull())

        /**
         * Sets [Builder.registrationCostCents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationCostCents] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationCostCents(registrationCostCents: JsonField<Long>) = apply {
            this.registrationCostCents = registrationCostCents
        }

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

        fun subUseCases(subUseCases: List<String>?) = subUseCases(JsonField.ofNullable(subUseCases))

        /** Alias for calling [Builder.subUseCases] with `subUseCases.orElse(null)`. */
        fun subUseCases(subUseCases: Optional<List<String>>) = subUseCases(subUseCases.getOrNull())

        /**
         * Sets [Builder.subUseCases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subUseCases] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subUseCases(subUseCases: JsonField<List<String>>) = apply {
            this.subUseCases = subUseCases.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [subUseCases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubUseCase(subUseCase: String) = apply {
            subUseCases =
                (subUseCases ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subUseCases", it).add(subUseCase)
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
         * Returns an immutable instance of [TenDlcCampaign].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .affiliateMarketing()
         * .ageGated()
         * .brandId()
         * .createdAt()
         * .description()
         * .directLending()
         * .embeddedLink()
         * .embeddedPhone()
         * .name()
         * .numberPooling()
         * .sampleMessages()
         * .status()
         * .subscriberHelp()
         * .subscriberOptIn()
         * .subscriberOptOut()
         * .updatedAt()
         * .useCase()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TenDlcCampaign =
            TenDlcCampaign(
                checkRequired("id", id),
                checkRequired("affiliateMarketing", affiliateMarketing),
                checkRequired("ageGated", ageGated),
                checkRequired("brandId", brandId),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("directLending", directLending),
                checkRequired("embeddedLink", embeddedLink),
                checkRequired("embeddedPhone", embeddedPhone),
                checkRequired("name", name),
                checkRequired("numberPooling", numberPooling),
                checkRequired("sampleMessages", sampleMessages).map { it.toImmutable() },
                checkRequired("status", status),
                checkRequired("subscriberHelp", subscriberHelp),
                checkRequired("subscriberOptIn", subscriberOptIn),
                checkRequired("subscriberOptOut", subscriberOptOut),
                checkRequired("updatedAt", updatedAt),
                checkRequired("useCase", useCase),
                approvedAt,
                dailyLimit,
                failureReason,
                helpMessage,
                messageFlow,
                monthlyFeeCents,
                (optInKeywords ?: JsonMissing.of()).map { it.toImmutable() },
                (optOutKeywords ?: JsonMissing.of()).map { it.toImmutable() },
                registrationCostCents,
                submittedAt,
                (subUseCases ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): TenDlcCampaign = apply {
        if (validated) {
            return@apply
        }

        id()
        affiliateMarketing()
        ageGated()
        brandId()
        createdAt()
        description()
        directLending()
        embeddedLink()
        embeddedPhone()
        name()
        numberPooling()
        sampleMessages()
        status().validate()
        subscriberHelp()
        subscriberOptIn()
        subscriberOptOut()
        updatedAt()
        useCase()
        approvedAt()
        dailyLimit()
        failureReason()
        helpMessage()
        messageFlow()
        monthlyFeeCents()
        optInKeywords()
        optOutKeywords()
        registrationCostCents()
        submittedAt()
        subUseCases()
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
            (if (affiliateMarketing.asKnown().isPresent) 1 else 0) +
            (if (ageGated.asKnown().isPresent) 1 else 0) +
            (if (brandId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (directLending.asKnown().isPresent) 1 else 0) +
            (if (embeddedLink.asKnown().isPresent) 1 else 0) +
            (if (embeddedPhone.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (numberPooling.asKnown().isPresent) 1 else 0) +
            (sampleMessages.asKnown().getOrNull()?.size ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriberHelp.asKnown().isPresent) 1 else 0) +
            (if (subscriberOptIn.asKnown().isPresent) 1 else 0) +
            (if (subscriberOptOut.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (useCase.asKnown().isPresent) 1 else 0) +
            (if (approvedAt.asKnown().isPresent) 1 else 0) +
            (if (dailyLimit.asKnown().isPresent) 1 else 0) +
            (if (failureReason.asKnown().isPresent) 1 else 0) +
            (if (helpMessage.asKnown().isPresent) 1 else 0) +
            (if (messageFlow.asKnown().isPresent) 1 else 0) +
            (if (monthlyFeeCents.asKnown().isPresent) 1 else 0) +
            (optInKeywords.asKnown().getOrNull()?.size ?: 0) +
            (optOutKeywords.asKnown().getOrNull()?.size ?: 0) +
            (if (registrationCostCents.asKnown().isPresent) 1 else 0) +
            (if (submittedAt.asKnown().isPresent) 1 else 0) +
            (subUseCases.asKnown().getOrNull()?.size ?: 0)

    /** Status of a 10DLC campaign registration. */
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

            @JvmField val APPROVED = of("approved")

            @JvmField val REJECTED = of("rejected")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            PENDING,
            APPROVED,
            REJECTED,
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
            APPROVED,
            REJECTED,
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
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
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
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
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

        return other is TenDlcCampaign &&
            id == other.id &&
            affiliateMarketing == other.affiliateMarketing &&
            ageGated == other.ageGated &&
            brandId == other.brandId &&
            createdAt == other.createdAt &&
            description == other.description &&
            directLending == other.directLending &&
            embeddedLink == other.embeddedLink &&
            embeddedPhone == other.embeddedPhone &&
            name == other.name &&
            numberPooling == other.numberPooling &&
            sampleMessages == other.sampleMessages &&
            status == other.status &&
            subscriberHelp == other.subscriberHelp &&
            subscriberOptIn == other.subscriberOptIn &&
            subscriberOptOut == other.subscriberOptOut &&
            updatedAt == other.updatedAt &&
            useCase == other.useCase &&
            approvedAt == other.approvedAt &&
            dailyLimit == other.dailyLimit &&
            failureReason == other.failureReason &&
            helpMessage == other.helpMessage &&
            messageFlow == other.messageFlow &&
            monthlyFeeCents == other.monthlyFeeCents &&
            optInKeywords == other.optInKeywords &&
            optOutKeywords == other.optOutKeywords &&
            registrationCostCents == other.registrationCostCents &&
            submittedAt == other.submittedAt &&
            subUseCases == other.subUseCases &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            affiliateMarketing,
            ageGated,
            brandId,
            createdAt,
            description,
            directLending,
            embeddedLink,
            embeddedPhone,
            name,
            numberPooling,
            sampleMessages,
            status,
            subscriberHelp,
            subscriberOptIn,
            subscriberOptOut,
            updatedAt,
            useCase,
            approvedAt,
            dailyLimit,
            failureReason,
            helpMessage,
            messageFlow,
            monthlyFeeCents,
            optInKeywords,
            optOutKeywords,
            registrationCostCents,
            submittedAt,
            subUseCases,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TenDlcCampaign{id=$id, affiliateMarketing=$affiliateMarketing, ageGated=$ageGated, brandId=$brandId, createdAt=$createdAt, description=$description, directLending=$directLending, embeddedLink=$embeddedLink, embeddedPhone=$embeddedPhone, name=$name, numberPooling=$numberPooling, sampleMessages=$sampleMessages, status=$status, subscriberHelp=$subscriberHelp, subscriberOptIn=$subscriberOptIn, subscriberOptOut=$subscriberOptOut, updatedAt=$updatedAt, useCase=$useCase, approvedAt=$approvedAt, dailyLimit=$dailyLimit, failureReason=$failureReason, helpMessage=$helpMessage, messageFlow=$messageFlow, monthlyFeeCents=$monthlyFeeCents, optInKeywords=$optInKeywords, optOutKeywords=$optOutKeywords, registrationCostCents=$registrationCostCents, submittedAt=$submittedAt, subUseCases=$subUseCases, additionalProperties=$additionalProperties}"
}
