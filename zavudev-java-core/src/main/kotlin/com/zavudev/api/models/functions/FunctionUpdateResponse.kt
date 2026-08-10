// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

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
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FunctionUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val function: JsonField<Function>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("function") @ExcludeMissing function: JsonField<Function> = JsonMissing.of()
    ) : this(function, mutableMapOf())

    /**
     * A Zavu Function — user-supplied TypeScript that runs in Zavu Cloud and reacts to messaging
     * events or HTTP requests.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun function(): Function = function.getRequired("function")

    /**
     * Returns the raw JSON value of [function].
     *
     * Unlike [function], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("function") @ExcludeMissing fun _function(): JsonField<Function> = function

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
         * Returns a mutable builder for constructing an instance of [FunctionUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .function()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionUpdateResponse]. */
    class Builder internal constructor() {

        private var function: JsonField<Function>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(functionUpdateResponse: FunctionUpdateResponse) = apply {
            function = functionUpdateResponse.function
            additionalProperties = functionUpdateResponse.additionalProperties.toMutableMap()
        }

        /**
         * A Zavu Function — user-supplied TypeScript that runs in Zavu Cloud and reacts to
         * messaging events or HTTP requests.
         */
        fun function(function: Function) = function(JsonField.of(function))

        /**
         * Sets [Builder.function] to an arbitrary JSON value.
         *
         * You should usually call [Builder.function] with a well-typed [Function] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun function(function: JsonField<Function>) = apply { this.function = function }

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
         * Returns an immutable instance of [FunctionUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .function()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FunctionUpdateResponse =
            FunctionUpdateResponse(
                checkRequired("function", function),
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
    fun validate(): FunctionUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        function().validate()
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
    @JvmSynthetic internal fun validity(): Int = (function.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A Zavu Function — user-supplied TypeScript that runs in Zavu Cloud and reacts to messaging
     * events or HTTP requests.
     */
    class Function
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val dependencies: JsonField<Dependencies>,
        private val httpEnabled: JsonField<Boolean>,
        private val memoryMb: JsonField<Long>,
        private val name: JsonField<String>,
        private val runtime: JsonField<Runtime>,
        private val slug: JsonField<String>,
        private val status: JsonField<Status>,
        private val timeoutSec: JsonField<Long>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val activeDeploymentId: JsonField<String>,
        private val description: JsonField<String>,
        private val publicUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dependencies")
            @ExcludeMissing
            dependencies: JsonField<Dependencies> = JsonMissing.of(),
            @JsonProperty("httpEnabled")
            @ExcludeMissing
            httpEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("memoryMb") @ExcludeMissing memoryMb: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("runtime") @ExcludeMissing runtime: JsonField<Runtime> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("timeoutSec")
            @ExcludeMissing
            timeoutSec: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("activeDeploymentId")
            @ExcludeMissing
            activeDeploymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("publicUrl")
            @ExcludeMissing
            publicUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            dependencies,
            httpEnabled,
            memoryMb,
            name,
            runtime,
            slug,
            status,
            timeoutSec,
            updatedAt,
            activeDeploymentId,
            description,
            publicUrl,
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
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * npm dependencies installed in the function bundle. Keys are package names, values are
         * semver ranges.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dependencies(): Dependencies = dependencies.getRequired("dependencies")

        /**
         * Whether the function can be invoked over HTTPS via its public URL.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun httpEnabled(): Boolean = httpEnabled.getRequired("httpEnabled")

        /**
         * Memory allocation in MB.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memoryMb(): Long = memoryMb.getRequired("memoryMb")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Runtime the function is deployed on.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun runtime(): Runtime = runtime.getRequired("runtime")

        /**
         * URL-safe identifier, unique per project.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun slug(): String = slug.getRequired("slug")

        /**
         * Lifecycle status of a Zavu Function.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Per-invocation timeout in seconds.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeoutSec(): Long = timeoutSec.getRequired("timeoutSec")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * ID of the deployment currently serving traffic.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun activeDeploymentId(): Optional<String> =
            activeDeploymentId.getOptional("activeDeploymentId")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * HTTPS endpoint, present only while httpEnabled is true. Null otherwise, including for a
         * function that was previously exposed — the stored URL stops serving the moment HTTP is
         * turned off, so it is never returned.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun publicUrl(): Optional<String> = publicUrl.getOptional("publicUrl")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [httpEnabled].
         *
         * Unlike [httpEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("httpEnabled")
        @ExcludeMissing
        fun _httpEnabled(): JsonField<Boolean> = httpEnabled

        /**
         * Returns the raw JSON value of [memoryMb].
         *
         * Unlike [memoryMb], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memoryMb") @ExcludeMissing fun _memoryMb(): JsonField<Long> = memoryMb

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [runtime].
         *
         * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("runtime") @ExcludeMissing fun _runtime(): JsonField<Runtime> = runtime

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [timeoutSec].
         *
         * Unlike [timeoutSec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeoutSec") @ExcludeMissing fun _timeoutSec(): JsonField<Long> = timeoutSec

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [activeDeploymentId].
         *
         * Unlike [activeDeploymentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("activeDeploymentId")
        @ExcludeMissing
        fun _activeDeploymentId(): JsonField<String> = activeDeploymentId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [publicUrl].
         *
         * Unlike [publicUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("publicUrl") @ExcludeMissing fun _publicUrl(): JsonField<String> = publicUrl

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
             * Returns a mutable builder for constructing an instance of [Function].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .dependencies()
             * .httpEnabled()
             * .memoryMb()
             * .name()
             * .runtime()
             * .slug()
             * .status()
             * .timeoutSec()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Function]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var dependencies: JsonField<Dependencies>? = null
            private var httpEnabled: JsonField<Boolean>? = null
            private var memoryMb: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var runtime: JsonField<Runtime>? = null
            private var slug: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var timeoutSec: JsonField<Long>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var activeDeploymentId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var publicUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(function: Function) = apply {
                id = function.id
                createdAt = function.createdAt
                dependencies = function.dependencies
                httpEnabled = function.httpEnabled
                memoryMb = function.memoryMb
                name = function.name
                runtime = function.runtime
                slug = function.slug
                status = function.status
                timeoutSec = function.timeoutSec
                updatedAt = function.updatedAt
                activeDeploymentId = function.activeDeploymentId
                description = function.description
                publicUrl = function.publicUrl
                additionalProperties = function.additionalProperties.toMutableMap()
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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * npm dependencies installed in the function bundle. Keys are package names, values are
             * semver ranges.
             */
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

            /** Whether the function can be invoked over HTTPS via its public URL. */
            fun httpEnabled(httpEnabled: Boolean) = httpEnabled(JsonField.of(httpEnabled))

            /**
             * Sets [Builder.httpEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.httpEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun httpEnabled(httpEnabled: JsonField<Boolean>) = apply {
                this.httpEnabled = httpEnabled
            }

            /** Memory allocation in MB. */
            fun memoryMb(memoryMb: Long) = memoryMb(JsonField.of(memoryMb))

            /**
             * Sets [Builder.memoryMb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryMb] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryMb(memoryMb: JsonField<Long>) = apply { this.memoryMb = memoryMb }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Runtime the function is deployed on. */
            fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

            /**
             * Sets [Builder.runtime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runtime] with a well-typed [Runtime] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

            /** URL-safe identifier, unique per project. */
            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            /** Lifecycle status of a Zavu Function. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Per-invocation timeout in seconds. */
            fun timeoutSec(timeoutSec: Long) = timeoutSec(JsonField.of(timeoutSec))

            /**
             * Sets [Builder.timeoutSec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutSec] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutSec(timeoutSec: JsonField<Long>) = apply { this.timeoutSec = timeoutSec }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** ID of the deployment currently serving traffic. */
            fun activeDeploymentId(activeDeploymentId: String?) =
                activeDeploymentId(JsonField.ofNullable(activeDeploymentId))

            /**
             * Alias for calling [Builder.activeDeploymentId] with
             * `activeDeploymentId.orElse(null)`.
             */
            fun activeDeploymentId(activeDeploymentId: Optional<String>) =
                activeDeploymentId(activeDeploymentId.getOrNull())

            /**
             * Sets [Builder.activeDeploymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activeDeploymentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun activeDeploymentId(activeDeploymentId: JsonField<String>) = apply {
                this.activeDeploymentId = activeDeploymentId
            }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * HTTPS endpoint, present only while httpEnabled is true. Null otherwise, including for
             * a function that was previously exposed — the stored URL stops serving the moment HTTP
             * is turned off, so it is never returned.
             */
            fun publicUrl(publicUrl: String?) = publicUrl(JsonField.ofNullable(publicUrl))

            /** Alias for calling [Builder.publicUrl] with `publicUrl.orElse(null)`. */
            fun publicUrl(publicUrl: Optional<String>) = publicUrl(publicUrl.getOrNull())

            /**
             * Sets [Builder.publicUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publicUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun publicUrl(publicUrl: JsonField<String>) = apply { this.publicUrl = publicUrl }

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
             * Returns an immutable instance of [Function].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .dependencies()
             * .httpEnabled()
             * .memoryMb()
             * .name()
             * .runtime()
             * .slug()
             * .status()
             * .timeoutSec()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Function =
                Function(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("dependencies", dependencies),
                    checkRequired("httpEnabled", httpEnabled),
                    checkRequired("memoryMb", memoryMb),
                    checkRequired("name", name),
                    checkRequired("runtime", runtime),
                    checkRequired("slug", slug),
                    checkRequired("status", status),
                    checkRequired("timeoutSec", timeoutSec),
                    checkRequired("updatedAt", updatedAt),
                    activeDeploymentId,
                    description,
                    publicUrl,
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
        fun validate(): Function = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            dependencies().validate()
            httpEnabled()
            memoryMb()
            name()
            runtime().validate()
            slug()
            status().validate()
            timeoutSec()
            updatedAt()
            activeDeploymentId()
            description()
            publicUrl()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (dependencies.asKnown().getOrNull()?.validity() ?: 0) +
                (if (httpEnabled.asKnown().isPresent) 1 else 0) +
                (if (memoryMb.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (runtime.asKnown().getOrNull()?.validity() ?: 0) +
                (if (slug.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeoutSec.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (activeDeploymentId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (publicUrl.asKnown().isPresent) 1 else 0)

        /**
         * npm dependencies installed in the function bundle. Keys are package names, values are
         * semver ranges.
         */
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

        /** Runtime the function is deployed on. */
        class Runtime @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val NODEJS24 = of("nodejs24")

                @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
            }

            /** An enum containing [Runtime]'s known values. */
            enum class Known {
                NODEJS24
            }

            /**
             * An enum containing [Runtime]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Runtime] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NODEJS24,
                /**
                 * An enum member indicating that [Runtime] was instantiated with an unknown value.
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
                    NODEJS24 -> Value.NODEJS24
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
                    NODEJS24 -> Known.NODEJS24
                    else -> throw ZavudevInvalidDataException("Unknown Runtime: $value")
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
            fun validate(): Runtime = apply {
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

                return other is Runtime && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Lifecycle status of a Zavu Function. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DRAFT = of("draft")

                @JvmField val BUNDLING = of("bundling")

                @JvmField val DEPLOYING = of("deploying")

                @JvmField val ACTIVE = of("active")

                @JvmField val FAILED = of("failed")

                @JvmField val DISABLED = of("disabled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                DRAFT,
                BUNDLING,
                DEPLOYING,
                ACTIVE,
                FAILED,
                DISABLED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DRAFT,
                BUNDLING,
                DEPLOYING,
                ACTIVE,
                FAILED,
                DISABLED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    DRAFT -> Value.DRAFT
                    BUNDLING -> Value.BUNDLING
                    DEPLOYING -> Value.DEPLOYING
                    ACTIVE -> Value.ACTIVE
                    FAILED -> Value.FAILED
                    DISABLED -> Value.DISABLED
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
                    DRAFT -> Known.DRAFT
                    BUNDLING -> Known.BUNDLING
                    DEPLOYING -> Known.DEPLOYING
                    ACTIVE -> Known.ACTIVE
                    FAILED -> Known.FAILED
                    DISABLED -> Known.DISABLED
                    else -> throw ZavudevInvalidDataException("Unknown Status: $value")
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

            return other is Function &&
                id == other.id &&
                createdAt == other.createdAt &&
                dependencies == other.dependencies &&
                httpEnabled == other.httpEnabled &&
                memoryMb == other.memoryMb &&
                name == other.name &&
                runtime == other.runtime &&
                slug == other.slug &&
                status == other.status &&
                timeoutSec == other.timeoutSec &&
                updatedAt == other.updatedAt &&
                activeDeploymentId == other.activeDeploymentId &&
                description == other.description &&
                publicUrl == other.publicUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                dependencies,
                httpEnabled,
                memoryMb,
                name,
                runtime,
                slug,
                status,
                timeoutSec,
                updatedAt,
                activeDeploymentId,
                description,
                publicUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Function{id=$id, createdAt=$createdAt, dependencies=$dependencies, httpEnabled=$httpEnabled, memoryMb=$memoryMb, name=$name, runtime=$runtime, slug=$slug, status=$status, timeoutSec=$timeoutSec, updatedAt=$updatedAt, activeDeploymentId=$activeDeploymentId, description=$description, publicUrl=$publicUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FunctionUpdateResponse &&
            function == other.function &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(function, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FunctionUpdateResponse{function=$function, additionalProperties=$additionalProperties}"
}
