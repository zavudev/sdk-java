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
import com.zavudev.api.core.checkRequired
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A specific requirement type within a requirement group. */
class RequirementType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<RequirementFieldType>,
    private val acceptanceCriteria: JsonField<RequirementAcceptanceCriteria>,
    private val example: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<RequirementFieldType> = JsonMissing.of(),
        @JsonProperty("acceptanceCriteria")
        @ExcludeMissing
        acceptanceCriteria: JsonField<RequirementAcceptanceCriteria> = JsonMissing.of(),
        @JsonProperty("example") @ExcludeMissing example: JsonField<String> = JsonMissing.of(),
    ) : this(id, description, name, type, acceptanceCriteria, example, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Type of requirement field.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): RequirementFieldType = type.getRequired("type")

    /**
     * Acceptance criteria for a requirement.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptanceCriteria(): Optional<RequirementAcceptanceCriteria> =
        acceptanceCriteria.getOptional("acceptanceCriteria")

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun example(): Optional<String> = example.getOptional("example")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<RequirementFieldType> = type

    /**
     * Returns the raw JSON value of [acceptanceCriteria].
     *
     * Unlike [acceptanceCriteria], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acceptanceCriteria")
    @ExcludeMissing
    fun _acceptanceCriteria(): JsonField<RequirementAcceptanceCriteria> = acceptanceCriteria

    /**
     * Returns the raw JSON value of [example].
     *
     * Unlike [example], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("example") @ExcludeMissing fun _example(): JsonField<String> = example

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
         * Returns a mutable builder for constructing an instance of [RequirementType].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .description()
         * .name()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequirementType]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<RequirementFieldType>? = null
        private var acceptanceCriteria: JsonField<RequirementAcceptanceCriteria> = JsonMissing.of()
        private var example: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requirementType: RequirementType) = apply {
            id = requirementType.id
            description = requirementType.description
            name = requirementType.name
            type = requirementType.type
            acceptanceCriteria = requirementType.acceptanceCriteria
            example = requirementType.example
            additionalProperties = requirementType.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Type of requirement field. */
        fun type(type: RequirementFieldType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [RequirementFieldType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<RequirementFieldType>) = apply { this.type = type }

        /** Acceptance criteria for a requirement. */
        fun acceptanceCriteria(acceptanceCriteria: RequirementAcceptanceCriteria) =
            acceptanceCriteria(JsonField.of(acceptanceCriteria))

        /**
         * Sets [Builder.acceptanceCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptanceCriteria] with a well-typed
         * [RequirementAcceptanceCriteria] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun acceptanceCriteria(acceptanceCriteria: JsonField<RequirementAcceptanceCriteria>) =
            apply {
                this.acceptanceCriteria = acceptanceCriteria
            }

        fun example(example: String?) = example(JsonField.ofNullable(example))

        /** Alias for calling [Builder.example] with `example.orElse(null)`. */
        fun example(example: Optional<String>) = example(example.getOrNull())

        /**
         * Sets [Builder.example] to an arbitrary JSON value.
         *
         * You should usually call [Builder.example] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun example(example: JsonField<String>) = apply { this.example = example }

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
         * Returns an immutable instance of [RequirementType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .description()
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RequirementType =
            RequirementType(
                checkRequired("id", id),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("type", type),
                acceptanceCriteria,
                example,
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
    fun validate(): RequirementType = apply {
        if (validated) {
            return@apply
        }

        id()
        description()
        name()
        type().validate()
        acceptanceCriteria().ifPresent { it.validate() }
        example()
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
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (acceptanceCriteria.asKnown().getOrNull()?.validity() ?: 0) +
            (if (example.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequirementType &&
            id == other.id &&
            description == other.description &&
            name == other.name &&
            type == other.type &&
            acceptanceCriteria == other.acceptanceCriteria &&
            example == other.example &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, description, name, type, acceptanceCriteria, example, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequirementType{id=$id, description=$description, name=$name, type=$type, acceptanceCriteria=$acceptanceCriteria, example=$example, additionalProperties=$additionalProperties}"
}
