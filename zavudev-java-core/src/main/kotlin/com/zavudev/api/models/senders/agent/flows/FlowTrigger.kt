// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FlowTrigger
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonField<Type>,
    private val intent: JsonField<String>,
    private val keywords: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("intent") @ExcludeMissing intent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("keywords")
        @ExcludeMissing
        keywords: JsonField<List<String>> = JsonMissing.of(),
    ) : this(type, intent, keywords, mutableMapOf())

    /**
     * Type of trigger for a flow.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Intent that triggers the flow (for intent type).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun intent(): Optional<String> = intent.getOptional("intent")

    /**
     * Keywords that trigger the flow (for keyword type).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keywords(): Optional<List<String>> = keywords.getOptional("keywords")

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [intent].
     *
     * Unlike [intent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intent") @ExcludeMissing fun _intent(): JsonField<String> = intent

    /**
     * Returns the raw JSON value of [keywords].
     *
     * Unlike [keywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keywords") @ExcludeMissing fun _keywords(): JsonField<List<String>> = keywords

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
         * Returns a mutable builder for constructing an instance of [FlowTrigger].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FlowTrigger]. */
    class Builder internal constructor() {

        private var type: JsonField<Type>? = null
        private var intent: JsonField<String> = JsonMissing.of()
        private var keywords: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(flowTrigger: FlowTrigger) = apply {
            type = flowTrigger.type
            intent = flowTrigger.intent
            keywords = flowTrigger.keywords.map { it.toMutableList() }
            additionalProperties = flowTrigger.additionalProperties.toMutableMap()
        }

        /** Type of trigger for a flow. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Intent that triggers the flow (for intent type). */
        fun intent(intent: String) = intent(JsonField.of(intent))

        /**
         * Sets [Builder.intent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intent] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun intent(intent: JsonField<String>) = apply { this.intent = intent }

        /** Keywords that trigger the flow (for keyword type). */
        fun keywords(keywords: List<String>) = keywords(JsonField.of(keywords))

        /**
         * Sets [Builder.keywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keywords] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun keywords(keywords: JsonField<List<String>>) = apply {
            this.keywords = keywords.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [keywords].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKeyword(keyword: String) = apply {
            keywords =
                (keywords ?: JsonField.of(mutableListOf())).also {
                    checkKnown("keywords", it).add(keyword)
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
         * Returns an immutable instance of [FlowTrigger].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FlowTrigger =
            FlowTrigger(
                checkRequired("type", type),
                intent,
                (keywords ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): FlowTrigger = apply {
        if (validated) {
            return@apply
        }

        type().validate()
        intent()
        keywords()
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
        (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (intent.asKnown().isPresent) 1 else 0) +
            (keywords.asKnown().getOrNull()?.size ?: 0)

    /** Type of trigger for a flow. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val KEYWORD = of("keyword")

            @JvmField val INTENT = of("intent")

            @JvmField val ALWAYS = of("always")

            @JvmField val MANUAL = of("manual")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            KEYWORD,
            INTENT,
            ALWAYS,
            MANUAL,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            KEYWORD,
            INTENT,
            ALWAYS,
            MANUAL,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                KEYWORD -> Value.KEYWORD
                INTENT -> Value.INTENT
                ALWAYS -> Value.ALWAYS
                MANUAL -> Value.MANUAL
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
                KEYWORD -> Known.KEYWORD
                INTENT -> Known.INTENT
                ALWAYS -> Known.ALWAYS
                MANUAL -> Known.MANUAL
                else -> throw ZavudevInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FlowTrigger &&
            type == other.type &&
            intent == other.intent &&
            keywords == other.keywords &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(type, intent, keywords, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FlowTrigger{type=$type, intent=$intent, keywords=$keywords, additionalProperties=$additionalProperties}"
}
