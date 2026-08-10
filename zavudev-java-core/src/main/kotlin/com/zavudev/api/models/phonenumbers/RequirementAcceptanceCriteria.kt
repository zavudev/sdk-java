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
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Acceptance criteria for a requirement. */
class RequirementAcceptanceCriteria
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowedValues: JsonField<List<String>>,
    private val maxLength: JsonField<Long>,
    private val minLength: JsonField<Long>,
    private val regexPattern: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allowedValues")
        @ExcludeMissing
        allowedValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("maxLength") @ExcludeMissing maxLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("minLength") @ExcludeMissing minLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("regexPattern")
        @ExcludeMissing
        regexPattern: JsonField<String> = JsonMissing.of(),
    ) : this(allowedValues, maxLength, minLength, regexPattern, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedValues(): Optional<List<String>> = allowedValues.getOptional("allowedValues")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxLength(): Optional<Long> = maxLength.getOptional("maxLength")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minLength(): Optional<Long> = minLength.getOptional("minLength")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regexPattern(): Optional<String> = regexPattern.getOptional("regexPattern")

    /**
     * Returns the raw JSON value of [allowedValues].
     *
     * Unlike [allowedValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allowedValues")
    @ExcludeMissing
    fun _allowedValues(): JsonField<List<String>> = allowedValues

    /**
     * Returns the raw JSON value of [maxLength].
     *
     * Unlike [maxLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxLength") @ExcludeMissing fun _maxLength(): JsonField<Long> = maxLength

    /**
     * Returns the raw JSON value of [minLength].
     *
     * Unlike [minLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minLength") @ExcludeMissing fun _minLength(): JsonField<Long> = minLength

    /**
     * Returns the raw JSON value of [regexPattern].
     *
     * Unlike [regexPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regexPattern")
    @ExcludeMissing
    fun _regexPattern(): JsonField<String> = regexPattern

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
         * [RequirementAcceptanceCriteria].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequirementAcceptanceCriteria]. */
    class Builder internal constructor() {

        private var allowedValues: JsonField<MutableList<String>>? = null
        private var maxLength: JsonField<Long> = JsonMissing.of()
        private var minLength: JsonField<Long> = JsonMissing.of()
        private var regexPattern: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requirementAcceptanceCriteria: RequirementAcceptanceCriteria) = apply {
            allowedValues = requirementAcceptanceCriteria.allowedValues.map { it.toMutableList() }
            maxLength = requirementAcceptanceCriteria.maxLength
            minLength = requirementAcceptanceCriteria.minLength
            regexPattern = requirementAcceptanceCriteria.regexPattern
            additionalProperties = requirementAcceptanceCriteria.additionalProperties.toMutableMap()
        }

        fun allowedValues(allowedValues: List<String>?) =
            allowedValues(JsonField.ofNullable(allowedValues))

        /** Alias for calling [Builder.allowedValues] with `allowedValues.orElse(null)`. */
        fun allowedValues(allowedValues: Optional<List<String>>) =
            allowedValues(allowedValues.getOrNull())

        /**
         * Sets [Builder.allowedValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedValues(allowedValues: JsonField<List<String>>) = apply {
            this.allowedValues = allowedValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [allowedValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedValue(allowedValue: String) = apply {
            allowedValues =
                (allowedValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedValues", it).add(allowedValue)
                }
        }

        fun maxLength(maxLength: Long?) = maxLength(JsonField.ofNullable(maxLength))

        /**
         * Alias for [Builder.maxLength].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxLength(maxLength: Long) = maxLength(maxLength as Long?)

        /** Alias for calling [Builder.maxLength] with `maxLength.orElse(null)`. */
        fun maxLength(maxLength: Optional<Long>) = maxLength(maxLength.getOrNull())

        /**
         * Sets [Builder.maxLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxLength(maxLength: JsonField<Long>) = apply { this.maxLength = maxLength }

        fun minLength(minLength: Long?) = minLength(JsonField.ofNullable(minLength))

        /**
         * Alias for [Builder.minLength].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minLength(minLength: Long) = minLength(minLength as Long?)

        /** Alias for calling [Builder.minLength] with `minLength.orElse(null)`. */
        fun minLength(minLength: Optional<Long>) = minLength(minLength.getOrNull())

        /**
         * Sets [Builder.minLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minLength(minLength: JsonField<Long>) = apply { this.minLength = minLength }

        fun regexPattern(regexPattern: String?) = regexPattern(JsonField.ofNullable(regexPattern))

        /** Alias for calling [Builder.regexPattern] with `regexPattern.orElse(null)`. */
        fun regexPattern(regexPattern: Optional<String>) = regexPattern(regexPattern.getOrNull())

        /**
         * Sets [Builder.regexPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regexPattern] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regexPattern(regexPattern: JsonField<String>) = apply {
            this.regexPattern = regexPattern
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
         * Returns an immutable instance of [RequirementAcceptanceCriteria].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RequirementAcceptanceCriteria =
            RequirementAcceptanceCriteria(
                (allowedValues ?: JsonMissing.of()).map { it.toImmutable() },
                maxLength,
                minLength,
                regexPattern,
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
    fun validate(): RequirementAcceptanceCriteria = apply {
        if (validated) {
            return@apply
        }

        allowedValues()
        maxLength()
        minLength()
        regexPattern()
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
        (allowedValues.asKnown().getOrNull()?.size ?: 0) +
            (if (maxLength.asKnown().isPresent) 1 else 0) +
            (if (minLength.asKnown().isPresent) 1 else 0) +
            (if (regexPattern.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequirementAcceptanceCriteria &&
            allowedValues == other.allowedValues &&
            maxLength == other.maxLength &&
            minLength == other.minLength &&
            regexPattern == other.regexPattern &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(allowedValues, maxLength, minLength, regexPattern, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequirementAcceptanceCriteria{allowedValues=$allowedValues, maxLength=$maxLength, minLength=$minLength, regexPattern=$regexPattern, additionalProperties=$additionalProperties}"
}
