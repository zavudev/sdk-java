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
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A group of requirements for a specific country/phone type combination. */
class Requirement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val action: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val phoneNumberType: JsonField<String>,
    private val requirementTypes: JsonField<List<RequirementType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("action") @ExcludeMissing action: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumberType")
        @ExcludeMissing
        phoneNumberType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requirementTypes")
        @ExcludeMissing
        requirementTypes: JsonField<List<RequirementType>> = JsonMissing.of(),
    ) : this(id, action, countryCode, phoneNumberType, requirementTypes, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): String = action.getRequired("action")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): String = countryCode.getRequired("countryCode")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumberType(): String = phoneNumberType.getRequired("phoneNumberType")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requirementTypes(): List<RequirementType> = requirementTypes.getRequired("requirementTypes")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [phoneNumberType].
     *
     * Unlike [phoneNumberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phoneNumberType")
    @ExcludeMissing
    fun _phoneNumberType(): JsonField<String> = phoneNumberType

    /**
     * Returns the raw JSON value of [requirementTypes].
     *
     * Unlike [requirementTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requirementTypes")
    @ExcludeMissing
    fun _requirementTypes(): JsonField<List<RequirementType>> = requirementTypes

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
         * Returns a mutable builder for constructing an instance of [Requirement].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .action()
         * .countryCode()
         * .phoneNumberType()
         * .requirementTypes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Requirement]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var action: JsonField<String>? = null
        private var countryCode: JsonField<String>? = null
        private var phoneNumberType: JsonField<String>? = null
        private var requirementTypes: JsonField<MutableList<RequirementType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requirement: Requirement) = apply {
            id = requirement.id
            action = requirement.action
            countryCode = requirement.countryCode
            phoneNumberType = requirement.phoneNumberType
            requirementTypes = requirement.requirementTypes.map { it.toMutableList() }
            additionalProperties = requirement.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun action(action: String) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<String>) = apply { this.action = action }

        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        fun phoneNumberType(phoneNumberType: String) =
            phoneNumberType(JsonField.of(phoneNumberType))

        /**
         * Sets [Builder.phoneNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumberType(phoneNumberType: JsonField<String>) = apply {
            this.phoneNumberType = phoneNumberType
        }

        fun requirementTypes(requirementTypes: List<RequirementType>) =
            requirementTypes(JsonField.of(requirementTypes))

        /**
         * Sets [Builder.requirementTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirementTypes] with a well-typed
         * `List<RequirementType>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun requirementTypes(requirementTypes: JsonField<List<RequirementType>>) = apply {
            this.requirementTypes = requirementTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [RequirementType] to [requirementTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequirementType(requirementType: RequirementType) = apply {
            requirementTypes =
                (requirementTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requirementTypes", it).add(requirementType)
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
         * Returns an immutable instance of [Requirement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .action()
         * .countryCode()
         * .phoneNumberType()
         * .requirementTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Requirement =
            Requirement(
                checkRequired("id", id),
                checkRequired("action", action),
                checkRequired("countryCode", countryCode),
                checkRequired("phoneNumberType", phoneNumberType),
                checkRequired("requirementTypes", requirementTypes).map { it.toImmutable() },
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
    fun validate(): Requirement = apply {
        if (validated) {
            return@apply
        }

        id()
        action()
        countryCode()
        phoneNumberType()
        requirementTypes().forEach { it.validate() }
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
            (if (action.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (phoneNumberType.asKnown().isPresent) 1 else 0) +
            (requirementTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Requirement &&
            id == other.id &&
            action == other.action &&
            countryCode == other.countryCode &&
            phoneNumberType == other.phoneNumberType &&
            requirementTypes == other.requirementTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            action,
            countryCode,
            phoneNumberType,
            requirementTypes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Requirement{id=$id, action=$action, countryCode=$countryCode, phoneNumberType=$phoneNumberType, requirementTypes=$requirementTypes, additionalProperties=$additionalProperties}"
}
