// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.introspect

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IntrospectValidatePhoneResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val countryCode: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val validNumber: JsonField<Boolean>,
    private val availableChannels: JsonField<List<String>>,
    private val carrier: JsonField<Carrier>,
    private val lineType: JsonField<LineType>,
    private val nationalFormat: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("validNumber")
        @ExcludeMissing
        validNumber: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("availableChannels")
        @ExcludeMissing
        availableChannels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("carrier") @ExcludeMissing carrier: JsonField<Carrier> = JsonMissing.of(),
        @JsonProperty("lineType") @ExcludeMissing lineType: JsonField<LineType> = JsonMissing.of(),
        @JsonProperty("nationalFormat")
        @ExcludeMissing
        nationalFormat: JsonField<String> = JsonMissing.of(),
    ) : this(
        countryCode,
        phoneNumber,
        validNumber,
        availableChannels,
        carrier,
        lineType,
        nationalFormat,
        mutableMapOf(),
    )

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): String = countryCode.getRequired("countryCode")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun validNumber(): Boolean = validNumber.getRequired("validNumber")

    /**
     * List of available messaging channels for this phone number.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableChannels(): Optional<List<String>> =
        availableChannels.getOptional("availableChannels")

    /**
     * Carrier information for the phone number.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrier(): Optional<Carrier> = carrier.getOptional("carrier")

    /**
     * Type of phone line.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineType(): Optional<LineType> = lineType.getOptional("lineType")

    /**
     * Phone number in national format.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nationalFormat(): Optional<String> = nationalFormat.getOptional("nationalFormat")

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [validNumber].
     *
     * Unlike [validNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("validNumber")
    @ExcludeMissing
    fun _validNumber(): JsonField<Boolean> = validNumber

    /**
     * Returns the raw JSON value of [availableChannels].
     *
     * Unlike [availableChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("availableChannels")
    @ExcludeMissing
    fun _availableChannels(): JsonField<List<String>> = availableChannels

    /**
     * Returns the raw JSON value of [carrier].
     *
     * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("carrier") @ExcludeMissing fun _carrier(): JsonField<Carrier> = carrier

    /**
     * Returns the raw JSON value of [lineType].
     *
     * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineType") @ExcludeMissing fun _lineType(): JsonField<LineType> = lineType

    /**
     * Returns the raw JSON value of [nationalFormat].
     *
     * Unlike [nationalFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nationalFormat")
    @ExcludeMissing
    fun _nationalFormat(): JsonField<String> = nationalFormat

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
         * Returns a mutable builder for constructing an instance of
         * [IntrospectValidatePhoneResponse].
         *
         * The following fields are required:
         * ```java
         * .countryCode()
         * .phoneNumber()
         * .validNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntrospectValidatePhoneResponse]. */
    class Builder internal constructor() {

        private var countryCode: JsonField<String>? = null
        private var phoneNumber: JsonField<String>? = null
        private var validNumber: JsonField<Boolean>? = null
        private var availableChannels: JsonField<MutableList<String>>? = null
        private var carrier: JsonField<Carrier> = JsonMissing.of()
        private var lineType: JsonField<LineType> = JsonMissing.of()
        private var nationalFormat: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(introspectValidatePhoneResponse: IntrospectValidatePhoneResponse) =
            apply {
                countryCode = introspectValidatePhoneResponse.countryCode
                phoneNumber = introspectValidatePhoneResponse.phoneNumber
                validNumber = introspectValidatePhoneResponse.validNumber
                availableChannels =
                    introspectValidatePhoneResponse.availableChannels.map { it.toMutableList() }
                carrier = introspectValidatePhoneResponse.carrier
                lineType = introspectValidatePhoneResponse.lineType
                nationalFormat = introspectValidatePhoneResponse.nationalFormat
                additionalProperties =
                    introspectValidatePhoneResponse.additionalProperties.toMutableMap()
            }

        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun validNumber(validNumber: Boolean) = validNumber(JsonField.of(validNumber))

        /**
         * Sets [Builder.validNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validNumber] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun validNumber(validNumber: JsonField<Boolean>) = apply { this.validNumber = validNumber }

        /** List of available messaging channels for this phone number. */
        fun availableChannels(availableChannels: List<String>) =
            availableChannels(JsonField.of(availableChannels))

        /**
         * Sets [Builder.availableChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableChannels] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun availableChannels(availableChannels: JsonField<List<String>>) = apply {
            this.availableChannels = availableChannels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [availableChannels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAvailableChannel(availableChannel: String) = apply {
            availableChannels =
                (availableChannels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("availableChannels", it).add(availableChannel)
                }
        }

        /** Carrier information for the phone number. */
        fun carrier(carrier: Carrier) = carrier(JsonField.of(carrier))

        /**
         * Sets [Builder.carrier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrier] with a well-typed [Carrier] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun carrier(carrier: JsonField<Carrier>) = apply { this.carrier = carrier }

        /** Type of phone line. */
        fun lineType(lineType: LineType) = lineType(JsonField.of(lineType))

        /**
         * Sets [Builder.lineType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineType] with a well-typed [LineType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lineType(lineType: JsonField<LineType>) = apply { this.lineType = lineType }

        /** Phone number in national format. */
        fun nationalFormat(nationalFormat: String) = nationalFormat(JsonField.of(nationalFormat))

        /**
         * Sets [Builder.nationalFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nationalFormat] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nationalFormat(nationalFormat: JsonField<String>) = apply {
            this.nationalFormat = nationalFormat
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
         * Returns an immutable instance of [IntrospectValidatePhoneResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .countryCode()
         * .phoneNumber()
         * .validNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntrospectValidatePhoneResponse =
            IntrospectValidatePhoneResponse(
                checkRequired("countryCode", countryCode),
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("validNumber", validNumber),
                (availableChannels ?: JsonMissing.of()).map { it.toImmutable() },
                carrier,
                lineType,
                nationalFormat,
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
    fun validate(): IntrospectValidatePhoneResponse = apply {
        if (validated) {
            return@apply
        }

        countryCode()
        phoneNumber()
        validNumber()
        availableChannels()
        carrier().ifPresent { it.validate() }
        lineType().ifPresent { it.validate() }
        nationalFormat()
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
        (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (validNumber.asKnown().isPresent) 1 else 0) +
            (availableChannels.asKnown().getOrNull()?.size ?: 0) +
            (carrier.asKnown().getOrNull()?.validity() ?: 0) +
            (lineType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (nationalFormat.asKnown().isPresent) 1 else 0)

    /** Carrier information for the phone number. */
    class Carrier
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val type: JsonField<LineType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<LineType> = JsonMissing.of(),
        ) : this(name, type, mutableMapOf())

        /**
         * Carrier name.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Type of phone line.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<LineType> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<LineType> = type

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

            /** Returns a mutable builder for constructing an instance of [Carrier]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Carrier]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var type: JsonField<LineType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(carrier: Carrier) = apply {
                name = carrier.name
                type = carrier.type
                additionalProperties = carrier.additionalProperties.toMutableMap()
            }

            /** Carrier name. */
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

            /** Type of phone line. */
            fun type(type: LineType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [LineType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<LineType>) = apply { this.type = type }

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
             * Returns an immutable instance of [Carrier].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Carrier = Carrier(name, type, additionalProperties.toMutableMap())
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
        fun validate(): Carrier = apply {
            if (validated) {
                return@apply
            }

            name()
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
            (if (name.asKnown().isPresent) 1 else 0) + (type.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Carrier &&
                name == other.name &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Carrier{name=$name, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntrospectValidatePhoneResponse &&
            countryCode == other.countryCode &&
            phoneNumber == other.phoneNumber &&
            validNumber == other.validNumber &&
            availableChannels == other.availableChannels &&
            carrier == other.carrier &&
            lineType == other.lineType &&
            nationalFormat == other.nationalFormat &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            countryCode,
            phoneNumber,
            validNumber,
            availableChannels,
            carrier,
            lineType,
            nationalFormat,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntrospectValidatePhoneResponse{countryCode=$countryCode, phoneNumber=$phoneNumber, validNumber=$validNumber, availableChannels=$availableChannels, carrier=$carrier, lineType=$lineType, nationalFormat=$nationalFormat, additionalProperties=$additionalProperties}"
}
