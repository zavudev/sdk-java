// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

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
 * Purchase an available phone number. Requires a paid plan: the Free plan cannot purchase phone
 * numbers and receives `402` with code `paid_plan_required`.
 *
 * **The included number.** A paid plan includes one number at no charge, once per account: it must
 * be a US or Canadian number (a +1 number) costing $20 a month or less. `isFreeEligible` in `GET
 * /v1/phone-numbers/available` marks the numbers that qualify. Claiming it spends the benefit for
 * good, across every team the account owner owns, so releasing that number does not make another
 * one free.
 *
 * **Numbers with regulatory requirements.** Which numbers need regulatory information is decided
 * per number, not by a fixed country list. The purchase looks the requirements up for the exact
 * number before charging anything:
 * 1. `GET /v1/phone-numbers/requirements?phoneNumber=...`. If `items` is empty, buy normally.
 * 2. Create what it asks for: addresses with `POST /v1/addresses`, documents with `POST
 *    /v1/documents`.
 * 3. Purchase with `type` and `regulatoryRequirements`. The number is bought and billed at once
 *    with `regulatoryStatus: pending_review`.
 * 4. Poll `GET /v1/phone-numbers/{phoneNumberId}` until `regulatoryStatus` is `approved`. Assign it
 *    to a sender before or after approval; it starts carrying messages once approved.
 *
 * **Reuse.** Information you submitted is kept for your project, per country and `type`, and a
 * later purchase there may omit `regulatoryRequirements`. Reuse only happens when what is kept
 * still covers every requirement of the new number and every address and document in it belongs to
 * the project. Otherwise, or when nothing is kept, the purchase returns `400
 * regulatory_compliance_required` with the missing requirements in `details`.
 *
 * Invalid values (a missing, unknown or repeated requirement id, an address or document from
 * another project, or one rejected in review) return `400 invalid_request`. If an address or
 * document cannot be registered for review, the purchase returns `400 invalid_request` naming the
 * requirement. If the requirements cannot be looked up, the purchase returns `502
 * requirements_unavailable`, except for US and Canadian numbers, which are sold as numbers without
 * requirements. None of these errors charge anything.
 */
class PhoneNumberPurchaseParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Phone number in E.164 format.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = body.phoneNumber()

    /**
     * Optional custom name for the phone number.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Regulatory information, for numbers whose requirements list is not empty. Get the list with
     * `GET /v1/phone-numbers/requirements?phoneNumber=...` and send one entry per requirement id,
     * except `action` requirements, which take no value. Every required id must be present, once,
     * and no unknown id may be sent; otherwise the purchase is refused with `400 invalid_request`
     * before anything is charged.
     *
     * The information is kept for your project under the number's country and `type`. A later
     * purchase there may omit this field if what is kept still covers that number's requirements.
     * Omit it for numbers without requirements.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
        body.regulatoryRequirements()

    /**
     * Type of phone number. `mobile` is stocked in countries where no geographic (`local`) or
     * non-geographic (`national`) inventory exists, and in several markets it is the only type that
     * can receive SMS.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<PhoneNumberType> = body.type()

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumber(): JsonField<String> = body._phoneNumber()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [regulatoryRequirements].
     *
     * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _regulatoryRequirements(): JsonField<List<RegulatoryRequirement>> =
        body._regulatoryRequirements()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<PhoneNumberType> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberPurchaseParams].
         *
         * The following fields are required:
         * ```java
         * .phoneNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberPurchaseParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberPurchaseParams: PhoneNumberPurchaseParams) = apply {
            body = phoneNumberPurchaseParams.body.toBuilder()
            additionalHeaders = phoneNumberPurchaseParams.additionalHeaders.toBuilder()
            additionalQueryParams = phoneNumberPurchaseParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [phoneNumber]
         * - [name]
         * - [regulatoryRequirements]
         * - [type]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Phone number in E.164 format. */
        fun phoneNumber(phoneNumber: String) = apply { body.phoneNumber(phoneNumber) }

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { body.phoneNumber(phoneNumber) }

        /** Optional custom name for the phone number. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Regulatory information, for numbers whose requirements list is not empty. Get the list
         * with `GET /v1/phone-numbers/requirements?phoneNumber=...` and send one entry per
         * requirement id, except `action` requirements, which take no value. Every required id must
         * be present, once, and no unknown id may be sent; otherwise the purchase is refused with
         * `400 invalid_request` before anything is charged.
         *
         * The information is kept for your project under the number's country and `type`. A later
         * purchase there may omit this field if what is kept still covers that number's
         * requirements. Omit it for numbers without requirements.
         */
        fun regulatoryRequirements(regulatoryRequirements: List<RegulatoryRequirement>) = apply {
            body.regulatoryRequirements(regulatoryRequirements)
        }

        /**
         * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regulatoryRequirements] with a well-typed
         * `List<RegulatoryRequirement>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun regulatoryRequirements(regulatoryRequirements: JsonField<List<RegulatoryRequirement>>) =
            apply {
                body.regulatoryRequirements(regulatoryRequirements)
            }

        /**
         * Adds a single [RegulatoryRequirement] to [regulatoryRequirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegulatoryRequirement(regulatoryRequirement: RegulatoryRequirement) = apply {
            body.addRegulatoryRequirement(regulatoryRequirement)
        }

        /**
         * Type of phone number. `mobile` is stocked in countries where no geographic (`local`) or
         * non-geographic (`national`) inventory exists, and in several markets it is the only type
         * that can receive SMS.
         */
        fun type(type: PhoneNumberType) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [PhoneNumberType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<PhoneNumberType>) = apply { body.type(type) }

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
         * Returns an immutable instance of [PhoneNumberPurchaseParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .phoneNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberPurchaseParams =
            PhoneNumberPurchaseParams(
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
        private val phoneNumber: JsonField<String>,
        private val name: JsonField<String>,
        private val regulatoryRequirements: JsonField<List<RegulatoryRequirement>>,
        private val type: JsonField<PhoneNumberType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("regulatoryRequirements")
            @ExcludeMissing
            regulatoryRequirements: JsonField<List<RegulatoryRequirement>> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<PhoneNumberType> = JsonMissing.of(),
        ) : this(phoneNumber, name, regulatoryRequirements, type, mutableMapOf())

        /**
         * Phone number in E.164 format.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

        /**
         * Optional custom name for the phone number.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Regulatory information, for numbers whose requirements list is not empty. Get the list
         * with `GET /v1/phone-numbers/requirements?phoneNumber=...` and send one entry per
         * requirement id, except `action` requirements, which take no value. Every required id must
         * be present, once, and no unknown id may be sent; otherwise the purchase is refused with
         * `400 invalid_request` before anything is charged.
         *
         * The information is kept for your project under the number's country and `type`. A later
         * purchase there may omit this field if what is kept still covers that number's
         * requirements. Omit it for numbers without requirements.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regulatoryRequirements(): Optional<List<RegulatoryRequirement>> =
            regulatoryRequirements.getOptional("regulatoryRequirements")

        /**
         * Type of phone number. `mobile` is stocked in countries where no geographic (`local`) or
         * non-geographic (`national`) inventory exists, and in several markets it is the only type
         * that can receive SMS.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<PhoneNumberType> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [regulatoryRequirements].
         *
         * Unlike [regulatoryRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("regulatoryRequirements")
        @ExcludeMissing
        fun _regulatoryRequirements(): JsonField<List<RegulatoryRequirement>> =
            regulatoryRequirements

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PhoneNumberType> = type

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
             * .phoneNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var phoneNumber: JsonField<String>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var regulatoryRequirements: JsonField<MutableList<RegulatoryRequirement>>? =
                null
            private var type: JsonField<PhoneNumberType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                phoneNumber = body.phoneNumber
                name = body.name
                regulatoryRequirements = body.regulatoryRequirements.map { it.toMutableList() }
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Phone number in E.164 format. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Optional custom name for the phone number. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Regulatory information, for numbers whose requirements list is not empty. Get the
             * list with `GET /v1/phone-numbers/requirements?phoneNumber=...` and send one entry per
             * requirement id, except `action` requirements, which take no value. Every required id
             * must be present, once, and no unknown id may be sent; otherwise the purchase is
             * refused with `400 invalid_request` before anything is charged.
             *
             * The information is kept for your project under the number's country and `type`. A
             * later purchase there may omit this field if what is kept still covers that number's
             * requirements. Omit it for numbers without requirements.
             */
            fun regulatoryRequirements(regulatoryRequirements: List<RegulatoryRequirement>) =
                regulatoryRequirements(JsonField.of(regulatoryRequirements))

            /**
             * Sets [Builder.regulatoryRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulatoryRequirements] with a well-typed
             * `List<RegulatoryRequirement>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun regulatoryRequirements(
                regulatoryRequirements: JsonField<List<RegulatoryRequirement>>
            ) = apply {
                this.regulatoryRequirements = regulatoryRequirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [RegulatoryRequirement] to [regulatoryRequirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegulatoryRequirement(regulatoryRequirement: RegulatoryRequirement) = apply {
                regulatoryRequirements =
                    (regulatoryRequirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regulatoryRequirements", it).add(regulatoryRequirement)
                    }
            }

            /**
             * Type of phone number. `mobile` is stocked in countries where no geographic (`local`)
             * or non-geographic (`national`) inventory exists, and in several markets it is the
             * only type that can receive SMS.
             */
            fun type(type: PhoneNumberType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [PhoneNumberType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<PhoneNumberType>) = apply { this.type = type }

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
             * .phoneNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("phoneNumber", phoneNumber),
                    name,
                    (regulatoryRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
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

            phoneNumber()
            name()
            regulatoryRequirements().ifPresent { it.forEach { it.validate() } }
            type().ifPresent { it.validate() }
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
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (regulatoryRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                phoneNumber == other.phoneNumber &&
                name == other.name &&
                regulatoryRequirements == other.regulatoryRequirements &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(phoneNumber, name, regulatoryRequirements, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{phoneNumber=$phoneNumber, name=$name, regulatoryRequirements=$regulatoryRequirements, type=$type, additionalProperties=$additionalProperties}"
    }

    class RegulatoryRequirement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fieldValue: JsonField<String>,
        private val requirementType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fieldValue")
            @ExcludeMissing
            fieldValue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requirementType")
            @ExcludeMissing
            requirementType: JsonField<String> = JsonMissing.of(),
        ) : this(fieldValue, requirementType, mutableMapOf())

        /**
         * Depends on the requirement's `type`: the text itself for `textual`; for `address`, the
         * `id` of an address created in this project with `POST /v1/addresses`; for `document`, the
         * `id` of a document created with `POST /v1/documents`. An address or document from another
         * project, or one rejected in review, is refused.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldValue(): String = fieldValue.getRequired("fieldValue")

        /**
         * A `requirementTypes[].id` from `GET /v1/phone-numbers/requirements`. Each id may appear
         * only once.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requirementType(): String = requirementType.getRequired("requirementType")

        /**
         * Returns the raw JSON value of [fieldValue].
         *
         * Unlike [fieldValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldValue")
        @ExcludeMissing
        fun _fieldValue(): JsonField<String> = fieldValue

        /**
         * Returns the raw JSON value of [requirementType].
         *
         * Unlike [requirementType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requirementType")
        @ExcludeMissing
        fun _requirementType(): JsonField<String> = requirementType

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
             * Returns a mutable builder for constructing an instance of [RegulatoryRequirement].
             *
             * The following fields are required:
             * ```java
             * .fieldValue()
             * .requirementType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RegulatoryRequirement]. */
        class Builder internal constructor() {

            private var fieldValue: JsonField<String>? = null
            private var requirementType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(regulatoryRequirement: RegulatoryRequirement) = apply {
                fieldValue = regulatoryRequirement.fieldValue
                requirementType = regulatoryRequirement.requirementType
                additionalProperties = regulatoryRequirement.additionalProperties.toMutableMap()
            }

            /**
             * Depends on the requirement's `type`: the text itself for `textual`; for `address`,
             * the `id` of an address created in this project with `POST /v1/addresses`; for
             * `document`, the `id` of a document created with `POST /v1/documents`. An address or
             * document from another project, or one rejected in review, is refused.
             */
            fun fieldValue(fieldValue: String) = fieldValue(JsonField.of(fieldValue))

            /**
             * Sets [Builder.fieldValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldValue(fieldValue: JsonField<String>) = apply { this.fieldValue = fieldValue }

            /**
             * A `requirementTypes[].id` from `GET /v1/phone-numbers/requirements`. Each id may
             * appear only once.
             */
            fun requirementType(requirementType: String) =
                requirementType(JsonField.of(requirementType))

            /**
             * Sets [Builder.requirementType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirementType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requirementType(requirementType: JsonField<String>) = apply {
                this.requirementType = requirementType
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
             * Returns an immutable instance of [RegulatoryRequirement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fieldValue()
             * .requirementType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RegulatoryRequirement =
                RegulatoryRequirement(
                    checkRequired("fieldValue", fieldValue),
                    checkRequired("requirementType", requirementType),
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
        fun validate(): RegulatoryRequirement = apply {
            if (validated) {
                return@apply
            }

            fieldValue()
            requirementType()
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
            (if (fieldValue.asKnown().isPresent) 1 else 0) +
                (if (requirementType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RegulatoryRequirement &&
                fieldValue == other.fieldValue &&
                requirementType == other.requirementType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fieldValue, requirementType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RegulatoryRequirement{fieldValue=$fieldValue, requirementType=$requirementType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberPurchaseParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberPurchaseParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
