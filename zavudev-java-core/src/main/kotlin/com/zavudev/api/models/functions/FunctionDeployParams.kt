// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.Params
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Publish the function. If `sourceCode` or `dependencies` are provided in the body, they replace
 * the current draft before deployment. Returns immediately with a deployment ID — poll `GET
 * /v1/functions/deployments/{deploymentId}` until status is `active` or `failed`.
 */
class FunctionDeployParams
private constructor(
    private val functionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun functionId(): Optional<String> = Optional.ofNullable(functionId)

    /**
     * New dependency map (replaces existing dependencies).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dependencies(): Optional<Dependencies> = body.dependencies()

    /**
     * Which file in `files` is the entry point. Defaults to `index.ts`.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entrypoint(): Optional<String> = body.entrypoint()

    /**
     * The project's source files, keyed by path relative to the project root (e.g. `index.ts`,
     * `lib/orders.ts`). Imports between them are resolved when the function is built, so a function
     * can be split across as many files as it needs.
     *
     * Paths must be relative and use forward slashes; `..`, `node_modules/` and `package.json` are
     * rejected. npm packages are not uploaded here — declare them under `dependencies` and Zavu
     * installs them. Limits: 200 files and 900,000 bytes for the whole tree.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun files(): Optional<Files> = body.files()

    /**
     * Shortcut for a single-file function: exactly equivalent to sending `files` with one entry
     * named after `entrypoint` (`index.ts` by default). Fully supported — use whichever fits. If
     * both are sent, `files` wins.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceCode(): Optional<String> = body.sourceCode()

    /**
     * Returns the raw JSON value of [dependencies].
     *
     * Unlike [dependencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dependencies(): JsonField<Dependencies> = body._dependencies()

    /**
     * Returns the raw JSON value of [entrypoint].
     *
     * Unlike [entrypoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entrypoint(): JsonField<String> = body._entrypoint()

    /**
     * Returns the raw JSON value of [files].
     *
     * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _files(): JsonField<Files> = body._files()

    /**
     * Returns the raw JSON value of [sourceCode].
     *
     * Unlike [sourceCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceCode(): JsonField<String> = body._sourceCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FunctionDeployParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FunctionDeployParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionDeployParams]. */
    class Builder internal constructor() {

        private var functionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(functionDeployParams: FunctionDeployParams) = apply {
            functionId = functionDeployParams.functionId
            body = functionDeployParams.body.toBuilder()
            additionalHeaders = functionDeployParams.additionalHeaders.toBuilder()
            additionalQueryParams = functionDeployParams.additionalQueryParams.toBuilder()
        }

        fun functionId(functionId: String?) = apply { this.functionId = functionId }

        /** Alias for calling [Builder.functionId] with `functionId.orElse(null)`. */
        fun functionId(functionId: Optional<String>) = functionId(functionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dependencies]
         * - [entrypoint]
         * - [files]
         * - [sourceCode]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** New dependency map (replaces existing dependencies). */
        fun dependencies(dependencies: Dependencies) = apply { body.dependencies(dependencies) }

        /**
         * Sets [Builder.dependencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependencies] with a well-typed [Dependencies] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dependencies(dependencies: JsonField<Dependencies>) = apply {
            body.dependencies(dependencies)
        }

        /** Which file in `files` is the entry point. Defaults to `index.ts`. */
        fun entrypoint(entrypoint: String) = apply { body.entrypoint(entrypoint) }

        /**
         * Sets [Builder.entrypoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entrypoint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entrypoint(entrypoint: JsonField<String>) = apply { body.entrypoint(entrypoint) }

        /**
         * The project's source files, keyed by path relative to the project root (e.g. `index.ts`,
         * `lib/orders.ts`). Imports between them are resolved when the function is built, so a
         * function can be split across as many files as it needs.
         *
         * Paths must be relative and use forward slashes; `..`, `node_modules/` and `package.json`
         * are rejected. npm packages are not uploaded here — declare them under `dependencies` and
         * Zavu installs them. Limits: 200 files and 900,000 bytes for the whole tree.
         */
        fun files(files: Files) = apply { body.files(files) }

        /**
         * Sets [Builder.files] to an arbitrary JSON value.
         *
         * You should usually call [Builder.files] with a well-typed [Files] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun files(files: JsonField<Files>) = apply { body.files(files) }

        /**
         * Shortcut for a single-file function: exactly equivalent to sending `files` with one entry
         * named after `entrypoint` (`index.ts` by default). Fully supported — use whichever fits.
         * If both are sent, `files` wins.
         */
        fun sourceCode(sourceCode: String) = apply { body.sourceCode(sourceCode) }

        /**
         * Sets [Builder.sourceCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceCode(sourceCode: JsonField<String>) = apply { body.sourceCode(sourceCode) }

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
         * Returns an immutable instance of [FunctionDeployParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FunctionDeployParams =
            FunctionDeployParams(
                functionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> functionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Optional source/dependencies update applied before deploying. Omit every field to redeploy
     * the current draft as-is.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dependencies: JsonField<Dependencies>,
        private val entrypoint: JsonField<String>,
        private val files: JsonField<Files>,
        private val sourceCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dependencies")
            @ExcludeMissing
            dependencies: JsonField<Dependencies> = JsonMissing.of(),
            @JsonProperty("entrypoint")
            @ExcludeMissing
            entrypoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("files") @ExcludeMissing files: JsonField<Files> = JsonMissing.of(),
            @JsonProperty("sourceCode")
            @ExcludeMissing
            sourceCode: JsonField<String> = JsonMissing.of(),
        ) : this(dependencies, entrypoint, files, sourceCode, mutableMapOf())

        /**
         * New dependency map (replaces existing dependencies).
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dependencies(): Optional<Dependencies> = dependencies.getOptional("dependencies")

        /**
         * Which file in `files` is the entry point. Defaults to `index.ts`.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entrypoint(): Optional<String> = entrypoint.getOptional("entrypoint")

        /**
         * The project's source files, keyed by path relative to the project root (e.g. `index.ts`,
         * `lib/orders.ts`). Imports between them are resolved when the function is built, so a
         * function can be split across as many files as it needs.
         *
         * Paths must be relative and use forward slashes; `..`, `node_modules/` and `package.json`
         * are rejected. npm packages are not uploaded here — declare them under `dependencies` and
         * Zavu installs them. Limits: 200 files and 900,000 bytes for the whole tree.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun files(): Optional<Files> = files.getOptional("files")

        /**
         * Shortcut for a single-file function: exactly equivalent to sending `files` with one entry
         * named after `entrypoint` (`index.ts` by default). Fully supported — use whichever fits.
         * If both are sent, `files` wins.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sourceCode(): Optional<String> = sourceCode.getOptional("sourceCode")

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
         * Returns the raw JSON value of [entrypoint].
         *
         * Unlike [entrypoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entrypoint")
        @ExcludeMissing
        fun _entrypoint(): JsonField<String> = entrypoint

        /**
         * Returns the raw JSON value of [files].
         *
         * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<Files> = files

        /**
         * Returns the raw JSON value of [sourceCode].
         *
         * Unlike [sourceCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceCode")
        @ExcludeMissing
        fun _sourceCode(): JsonField<String> = sourceCode

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var dependencies: JsonField<Dependencies> = JsonMissing.of()
            private var entrypoint: JsonField<String> = JsonMissing.of()
            private var files: JsonField<Files> = JsonMissing.of()
            private var sourceCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                dependencies = body.dependencies
                entrypoint = body.entrypoint
                files = body.files
                sourceCode = body.sourceCode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** New dependency map (replaces existing dependencies). */
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

            /** Which file in `files` is the entry point. Defaults to `index.ts`. */
            fun entrypoint(entrypoint: String) = entrypoint(JsonField.of(entrypoint))

            /**
             * Sets [Builder.entrypoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entrypoint] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entrypoint(entrypoint: JsonField<String>) = apply { this.entrypoint = entrypoint }

            /**
             * The project's source files, keyed by path relative to the project root (e.g.
             * `index.ts`, `lib/orders.ts`). Imports between them are resolved when the function is
             * built, so a function can be split across as many files as it needs.
             *
             * Paths must be relative and use forward slashes; `..`, `node_modules/` and
             * `package.json` are rejected. npm packages are not uploaded here — declare them under
             * `dependencies` and Zavu installs them. Limits: 200 files and 900,000 bytes for the
             * whole tree.
             */
            fun files(files: Files) = files(JsonField.of(files))

            /**
             * Sets [Builder.files] to an arbitrary JSON value.
             *
             * You should usually call [Builder.files] with a well-typed [Files] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun files(files: JsonField<Files>) = apply { this.files = files }

            /**
             * Shortcut for a single-file function: exactly equivalent to sending `files` with one
             * entry named after `entrypoint` (`index.ts` by default). Fully supported — use
             * whichever fits. If both are sent, `files` wins.
             */
            fun sourceCode(sourceCode: String) = sourceCode(JsonField.of(sourceCode))

            /**
             * Sets [Builder.sourceCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceCode(sourceCode: JsonField<String>) = apply { this.sourceCode = sourceCode }

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
             */
            fun build(): Body =
                Body(
                    dependencies,
                    entrypoint,
                    files,
                    sourceCode,
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

            dependencies().ifPresent { it.validate() }
            entrypoint()
            files().ifPresent { it.validate() }
            sourceCode()
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
            (dependencies.asKnown().getOrNull()?.validity() ?: 0) +
                (if (entrypoint.asKnown().isPresent) 1 else 0) +
                (files.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sourceCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                dependencies == other.dependencies &&
                entrypoint == other.entrypoint &&
                files == other.files &&
                sourceCode == other.sourceCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dependencies, entrypoint, files, sourceCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dependencies=$dependencies, entrypoint=$entrypoint, files=$files, sourceCode=$sourceCode, additionalProperties=$additionalProperties}"
    }

    /** New dependency map (replaces existing dependencies). */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ZavudevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

    /**
     * The project's source files, keyed by path relative to the project root (e.g. `index.ts`,
     * `lib/orders.ts`). Imports between them are resolved when the function is built, so a function
     * can be split across as many files as it needs.
     *
     * Paths must be relative and use forward slashes; `..`, `node_modules/` and `package.json` are
     * rejected. npm packages are not uploaded here — declare them under `dependencies` and Zavu
     * installs them. Limits: 200 files and 900,000 bytes for the whole tree.
     */
    class Files
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

            /** Returns a mutable builder for constructing an instance of [Files]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Files]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(files: Files) = apply {
                additionalProperties = files.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Files].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Files = Files(additionalProperties.toImmutable())
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
        fun validate(): Files = apply {
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

            return other is Files && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Files{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FunctionDeployParams &&
            functionId == other.functionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(functionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FunctionDeployParams{functionId=$functionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
