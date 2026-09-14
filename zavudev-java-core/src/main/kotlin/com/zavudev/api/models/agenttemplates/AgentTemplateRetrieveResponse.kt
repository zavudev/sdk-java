// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agenttemplates

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
import kotlin.jvm.optionals.getOrNull

class AgentTemplateRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val template: JsonField<Template>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("template") @ExcludeMissing template: JsonField<Template> = JsonMissing.of()
    ) : this(template, mutableMapOf())

    /**
     * A fully rendered factory agent: the function files to scaffold plus the secrets it needs.
     * Returned by GET /v1/agent-templates/{templateId} and consumed by `npx zavudev agents pull`.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun template(): Template = template.getRequired("template")

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<Template> = template

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
         * [AgentTemplateRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .template()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentTemplateRetrieveResponse]. */
    class Builder internal constructor() {

        private var template: JsonField<Template>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentTemplateRetrieveResponse: AgentTemplateRetrieveResponse) = apply {
            template = agentTemplateRetrieveResponse.template
            additionalProperties = agentTemplateRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * A fully rendered factory agent: the function files to scaffold plus the secrets it needs.
         * Returned by GET /v1/agent-templates/{templateId} and consumed by `npx zavudev agents
         * pull`.
         */
        fun template(template: Template) = template(JsonField.of(template))

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [Template] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun template(template: JsonField<Template>) = apply { this.template = template }

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
         * Returns an immutable instance of [AgentTemplateRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .template()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentTemplateRetrieveResponse =
            AgentTemplateRetrieveResponse(
                checkRequired("template", template),
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
    fun validate(): AgentTemplateRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        template().validate()
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
    @JvmSynthetic internal fun validity(): Int = (template.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A fully rendered factory agent: the function files to scaffold plus the secrets it needs.
     * Returned by GET /v1/agent-templates/{templateId} and consumed by `npx zavudev agents pull`.
     */
    class Template
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val category: JsonField<Category>,
        private val defaultSlug: JsonField<String>,
        private val dependencies: JsonField<Dependencies>,
        private val files: JsonField<List<File>>,
        private val name: JsonField<String>,
        private val requiredSecrets: JsonField<List<RequiredSecret>>,
        private val summary: JsonField<String>,
        private val voice: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("defaultSlug")
            @ExcludeMissing
            defaultSlug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dependencies")
            @ExcludeMissing
            dependencies: JsonField<Dependencies> = JsonMissing.of(),
            @JsonProperty("files") @ExcludeMissing files: JsonField<List<File>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requiredSecrets")
            @ExcludeMissing
            requiredSecrets: JsonField<List<RequiredSecret>> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice") @ExcludeMissing voice: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            category,
            defaultSlug,
            dependencies,
            files,
            name,
            requiredSecrets,
            summary,
            voice,
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
        fun category(): Category = category.getRequired("category")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun defaultSlug(): String = defaultSlug.getRequired("defaultSlug")

        /**
         * npm dependencies for the scaffolded function.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dependencies(): Dependencies = dependencies.getRequired("dependencies")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun files(): List<File> = files.getRequired("files")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requiredSecrets(): List<RequiredSecret> = requiredSecrets.getRequired("requiredSecrets")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun summary(): String = summary.getRequired("summary")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun voice(): Boolean = voice.getRequired("voice")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [defaultSlug].
         *
         * Unlike [defaultSlug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("defaultSlug")
        @ExcludeMissing
        fun _defaultSlug(): JsonField<String> = defaultSlug

        /**
         * Returns the raw JSON value of [dependencies].
         *
         * Unlike [dependencies], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dependencies")
        @ExcludeMissing
        fun _dependencies(): JsonField<Dependencies> = dependencies

        /**
         * Returns the raw JSON value of [files].
         *
         * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<List<File>> = files

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [requiredSecrets].
         *
         * Unlike [requiredSecrets], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requiredSecrets")
        @ExcludeMissing
        fun _requiredSecrets(): JsonField<List<RequiredSecret>> = requiredSecrets

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<Boolean> = voice

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
             * Returns a mutable builder for constructing an instance of [Template].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .category()
             * .defaultSlug()
             * .dependencies()
             * .files()
             * .name()
             * .requiredSecrets()
             * .summary()
             * .voice()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Template]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var category: JsonField<Category>? = null
            private var defaultSlug: JsonField<String>? = null
            private var dependencies: JsonField<Dependencies>? = null
            private var files: JsonField<MutableList<File>>? = null
            private var name: JsonField<String>? = null
            private var requiredSecrets: JsonField<MutableList<RequiredSecret>>? = null
            private var summary: JsonField<String>? = null
            private var voice: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(template: Template) = apply {
                id = template.id
                category = template.category
                defaultSlug = template.defaultSlug
                dependencies = template.dependencies
                files = template.files.map { it.toMutableList() }
                name = template.name
                requiredSecrets = template.requiredSecrets.map { it.toMutableList() }
                summary = template.summary
                voice = template.voice
                additionalProperties = template.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            fun defaultSlug(defaultSlug: String) = defaultSlug(JsonField.of(defaultSlug))

            /**
             * Sets [Builder.defaultSlug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultSlug] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultSlug(defaultSlug: JsonField<String>) = apply {
                this.defaultSlug = defaultSlug
            }

            /** npm dependencies for the scaffolded function. */
            fun dependencies(dependencies: Dependencies) = dependencies(JsonField.of(dependencies))

            /**
             * Sets [Builder.dependencies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dependencies] with a well-typed [Dependencies] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dependencies(dependencies: JsonField<Dependencies>) = apply {
                this.dependencies = dependencies
            }

            fun files(files: List<File>) = files(JsonField.of(files))

            /**
             * Sets [Builder.files] to an arbitrary JSON value.
             *
             * You should usually call [Builder.files] with a well-typed `List<File>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun files(files: JsonField<List<File>>) = apply {
                this.files = files.map { it.toMutableList() }
            }

            /**
             * Adds a single [File] to [files].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFile(file: File) = apply {
                files =
                    (files ?: JsonField.of(mutableListOf())).also {
                        checkKnown("files", it).add(file)
                    }
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun requiredSecrets(requiredSecrets: List<RequiredSecret>) =
                requiredSecrets(JsonField.of(requiredSecrets))

            /**
             * Sets [Builder.requiredSecrets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requiredSecrets] with a well-typed
             * `List<RequiredSecret>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun requiredSecrets(requiredSecrets: JsonField<List<RequiredSecret>>) = apply {
                this.requiredSecrets = requiredSecrets.map { it.toMutableList() }
            }

            /**
             * Adds a single [RequiredSecret] to [requiredSecrets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequiredSecret(requiredSecret: RequiredSecret) = apply {
                requiredSecrets =
                    (requiredSecrets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("requiredSecrets", it).add(requiredSecret)
                    }
            }

            fun summary(summary: String) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<String>) = apply { this.summary = summary }

            fun voice(voice: Boolean) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice(voice: JsonField<Boolean>) = apply { this.voice = voice }

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
             * Returns an immutable instance of [Template].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .category()
             * .defaultSlug()
             * .dependencies()
             * .files()
             * .name()
             * .requiredSecrets()
             * .summary()
             * .voice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Template =
                Template(
                    checkRequired("id", id),
                    checkRequired("category", category),
                    checkRequired("defaultSlug", defaultSlug),
                    checkRequired("dependencies", dependencies),
                    checkRequired("files", files).map { it.toImmutable() },
                    checkRequired("name", name),
                    checkRequired("requiredSecrets", requiredSecrets).map { it.toImmutable() },
                    checkRequired("summary", summary),
                    checkRequired("voice", voice),
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
        fun validate(): Template = apply {
            if (validated) {
                return@apply
            }

            id()
            category().validate()
            defaultSlug()
            dependencies().validate()
            files().forEach { it.validate() }
            name()
            requiredSecrets().forEach { it.validate() }
            summary()
            voice()
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
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (defaultSlug.asKnown().isPresent) 1 else 0) +
                (dependencies.asKnown().getOrNull()?.validity() ?: 0) +
                (files.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (requiredSecrets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (summary.asKnown().isPresent) 1 else 0) +
                (if (voice.asKnown().isPresent) 1 else 0)

        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val SALES = of("sales")

                @JvmField val SUPPORT = of("support")

                @JvmField val FRONT_DESK = of("frontDesk")

                @JvmField val OPS = of("ops")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                SALES,
                SUPPORT,
                FRONT_DESK,
                OPS,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SALES,
                SUPPORT,
                FRONT_DESK,
                OPS,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
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
                    SALES -> Value.SALES
                    SUPPORT -> Value.SUPPORT
                    FRONT_DESK -> Value.FRONT_DESK
                    OPS -> Value.OPS
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
                    SALES -> Known.SALES
                    SUPPORT -> Known.SUPPORT
                    FRONT_DESK -> Known.FRONT_DESK
                    OPS -> Known.OPS
                    else -> throw ZavudevInvalidDataException("Unknown Category: $value")
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
            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** npm dependencies for the scaffolded function. */
        class Dependencies
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Dependencies]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dependencies]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dependencies: Dependencies) = apply {
                    additionalProperties = dependencies.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Dependencies].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Dependencies = Dependencies(additionalProperties.toImmutable())
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
            fun validate(): Dependencies = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Dependencies && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Dependencies{additionalProperties=$additionalProperties}"
        }

        class File
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val path: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            ) : this(content, path, mutableMapOf())

            /**
             * File contents to write verbatim.
             *
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun path(): String = path.getRequired("path")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [path].
             *
             * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

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
                 * Returns a mutable builder for constructing an instance of [File].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .path()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [File]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var path: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(file: File) = apply {
                    content = file.content
                    path = file.path
                    additionalProperties = file.additionalProperties.toMutableMap()
                }

                /** File contents to write verbatim. */
                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun path(path: String) = path(JsonField.of(path))

                /**
                 * Sets [Builder.path] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.path] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun path(path: JsonField<String>) = apply { this.path = path }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [File].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .path()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): File =
                    File(
                        checkRequired("content", content),
                        checkRequired("path", path),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): File = apply {
                if (validated) {
                    return@apply
                }

                content()
                path()
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (if (path.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is File &&
                    content == other.content &&
                    path == other.path &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(content, path, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "File{content=$content, path=$path, additionalProperties=$additionalProperties}"
        }

        class RequiredSecret
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val hint: JsonField<String>,
            private val key: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("hint") @ExcludeMissing hint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            ) : this(hint, key, mutableMapOf())

            /**
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun hint(): String = hint.getRequired("hint")

            /**
             * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * Returns the raw JSON value of [hint].
             *
             * Unlike [hint], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hint") @ExcludeMissing fun _hint(): JsonField<String> = hint

            /**
             * Returns the raw JSON value of [key].
             *
             * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

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
                 * Returns a mutable builder for constructing an instance of [RequiredSecret].
                 *
                 * The following fields are required:
                 * ```java
                 * .hint()
                 * .key()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequiredSecret]. */
            class Builder internal constructor() {

                private var hint: JsonField<String>? = null
                private var key: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requiredSecret: RequiredSecret) = apply {
                    hint = requiredSecret.hint
                    key = requiredSecret.key
                    additionalProperties = requiredSecret.additionalProperties.toMutableMap()
                }

                fun hint(hint: String) = hint(JsonField.of(hint))

                /**
                 * Sets [Builder.hint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hint] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hint(hint: JsonField<String>) = apply { this.hint = hint }

                fun key(key: String) = key(JsonField.of(key))

                /**
                 * Sets [Builder.key] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun key(key: JsonField<String>) = apply { this.key = key }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RequiredSecret].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .hint()
                 * .key()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RequiredSecret =
                    RequiredSecret(
                        checkRequired("hint", hint),
                        checkRequired("key", key),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): RequiredSecret = apply {
                if (validated) {
                    return@apply
                }

                hint()
                key()
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
                (if (hint.asKnown().isPresent) 1 else 0) + (if (key.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequiredSecret &&
                    hint == other.hint &&
                    key == other.key &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(hint, key, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequiredSecret{hint=$hint, key=$key, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Template &&
                id == other.id &&
                category == other.category &&
                defaultSlug == other.defaultSlug &&
                dependencies == other.dependencies &&
                files == other.files &&
                name == other.name &&
                requiredSecrets == other.requiredSecrets &&
                summary == other.summary &&
                voice == other.voice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                category,
                defaultSlug,
                dependencies,
                files,
                name,
                requiredSecrets,
                summary,
                voice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Template{id=$id, category=$category, defaultSlug=$defaultSlug, dependencies=$dependencies, files=$files, name=$name, requiredSecrets=$requiredSecrets, summary=$summary, voice=$voice, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentTemplateRetrieveResponse &&
            template == other.template &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(template, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentTemplateRetrieveResponse{template=$template, additionalProperties=$additionalProperties}"
}
