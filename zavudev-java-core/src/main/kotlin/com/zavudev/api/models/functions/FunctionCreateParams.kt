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
import com.zavudev.api.core.Params
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
 * Create a new Zavu Function. The function starts in `draft` status. A dedicated API key is
 * auto-provisioned and injected as the `ZAVU_API_KEY` secret so the function can call back into the
 * Zavu API without manual setup.
 *
 * Provide `sourceCode` to seed the draft. Call `POST /v1/functions/{functionId}/deploy` afterwards
 * to publish.
 */
class FunctionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * URL-safe identifier (lowercase, digits, hyphens). Must be unique per project.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slug(): String = body.slug()

    /**
     * npm dependencies. Keys are package names, values are semver ranges.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dependencies(): Optional<Dependencies> = body.dependencies()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

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
     * Whether to expose a public HTTPS URL for this function.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun httpEnabled(): Optional<Boolean> = body.httpEnabled()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memoryMb(): Optional<MemoryMb> = body.memoryMb()

    /**
     * Runtime the function is deployed on.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runtime(): Optional<Runtime> = body.runtime()

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
     * Per-invocation timeout in seconds. Event and cron invocations are asynchronous, so a long
     * timeout only bounds cost; a tool called during a live conversation holds up the reply, and a
     * function exposed over HTTP is additionally bounded by the platform's HTTP response limit.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutSec(): Optional<Long> = body.timeoutSec()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _slug(): JsonField<String> = body._slug()

    /**
     * Returns the raw JSON value of [dependencies].
     *
     * Unlike [dependencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dependencies(): JsonField<Dependencies> = body._dependencies()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

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
     * Returns the raw JSON value of [httpEnabled].
     *
     * Unlike [httpEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _httpEnabled(): JsonField<Boolean> = body._httpEnabled()

    /**
     * Returns the raw JSON value of [memoryMb].
     *
     * Unlike [memoryMb], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memoryMb(): JsonField<MemoryMb> = body._memoryMb()

    /**
     * Returns the raw JSON value of [runtime].
     *
     * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runtime(): JsonField<Runtime> = body._runtime()

    /**
     * Returns the raw JSON value of [sourceCode].
     *
     * Unlike [sourceCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceCode(): JsonField<String> = body._sourceCode()

    /**
     * Returns the raw JSON value of [timeoutSec].
     *
     * Unlike [timeoutSec], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutSec(): JsonField<Long> = body._timeoutSec()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FunctionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .slug()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(functionCreateParams: FunctionCreateParams) = apply {
            body = functionCreateParams.body.toBuilder()
            additionalHeaders = functionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = functionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [slug]
         * - [dependencies]
         * - [description]
         * - [entrypoint]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** URL-safe identifier (lowercase, digits, hyphens). Must be unique per project. */
        fun slug(slug: String) = apply { body.slug(slug) }

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { body.slug(slug) }

        /** npm dependencies. Keys are package names, values are semver ranges. */
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

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

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

        /** Whether to expose a public HTTPS URL for this function. */
        fun httpEnabled(httpEnabled: Boolean) = apply { body.httpEnabled(httpEnabled) }

        /**
         * Sets [Builder.httpEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.httpEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun httpEnabled(httpEnabled: JsonField<Boolean>) = apply { body.httpEnabled(httpEnabled) }

        fun memoryMb(memoryMb: MemoryMb) = apply { body.memoryMb(memoryMb) }

        /**
         * Sets [Builder.memoryMb] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoryMb] with a well-typed [MemoryMb] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun memoryMb(memoryMb: JsonField<MemoryMb>) = apply { body.memoryMb(memoryMb) }

        /** Runtime the function is deployed on. */
        fun runtime(runtime: Runtime) = apply { body.runtime(runtime) }

        /**
         * Sets [Builder.runtime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtime] with a well-typed [Runtime] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runtime(runtime: JsonField<Runtime>) = apply { body.runtime(runtime) }

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

        /**
         * Per-invocation timeout in seconds. Event and cron invocations are asynchronous, so a long
         * timeout only bounds cost; a tool called during a live conversation holds up the reply,
         * and a function exposed over HTTP is additionally bounded by the platform's HTTP response
         * limit.
         */
        fun timeoutSec(timeoutSec: Long) = apply { body.timeoutSec(timeoutSec) }

        /**
         * Sets [Builder.timeoutSec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutSec] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeoutSec(timeoutSec: JsonField<Long>) = apply { body.timeoutSec(timeoutSec) }

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
         * Returns an immutable instance of [FunctionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .slug()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FunctionCreateParams =
            FunctionCreateParams(
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
        private val name: JsonField<String>,
        private val slug: JsonField<String>,
        private val dependencies: JsonField<Dependencies>,
        private val description: JsonField<String>,
        private val entrypoint: JsonField<String>,
        private val files: JsonField<Files>,
        private val httpEnabled: JsonField<Boolean>,
        private val memoryMb: JsonField<MemoryMb>,
        private val runtime: JsonField<Runtime>,
        private val sourceCode: JsonField<String>,
        private val timeoutSec: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dependencies")
            @ExcludeMissing
            dependencies: JsonField<Dependencies> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entrypoint")
            @ExcludeMissing
            entrypoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("files") @ExcludeMissing files: JsonField<Files> = JsonMissing.of(),
            @JsonProperty("httpEnabled")
            @ExcludeMissing
            httpEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("memoryMb")
            @ExcludeMissing
            memoryMb: JsonField<MemoryMb> = JsonMissing.of(),
            @JsonProperty("runtime") @ExcludeMissing runtime: JsonField<Runtime> = JsonMissing.of(),
            @JsonProperty("sourceCode")
            @ExcludeMissing
            sourceCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeoutSec")
            @ExcludeMissing
            timeoutSec: JsonField<Long> = JsonMissing.of(),
        ) : this(
            name,
            slug,
            dependencies,
            description,
            entrypoint,
            files,
            httpEnabled,
            memoryMb,
            runtime,
            sourceCode,
            timeoutSec,
            mutableMapOf(),
        )

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * URL-safe identifier (lowercase, digits, hyphens). Must be unique per project.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun slug(): String = slug.getRequired("slug")

        /**
         * npm dependencies. Keys are package names, values are semver ranges.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dependencies(): Optional<Dependencies> = dependencies.getOptional("dependencies")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

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
         * Whether to expose a public HTTPS URL for this function.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun httpEnabled(): Optional<Boolean> = httpEnabled.getOptional("httpEnabled")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memoryMb(): Optional<MemoryMb> = memoryMb.getOptional("memoryMb")

        /**
         * Runtime the function is deployed on.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runtime(): Optional<Runtime> = runtime.getOptional("runtime")

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
         * Per-invocation timeout in seconds. Event and cron invocations are asynchronous, so a long
         * timeout only bounds cost; a tool called during a live conversation holds up the reply,
         * and a function exposed over HTTP is additionally bounded by the platform's HTTP response
         * limit.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutSec(): Optional<Long> = timeoutSec.getOptional("timeoutSec")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

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
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
        @JsonProperty("memoryMb") @ExcludeMissing fun _memoryMb(): JsonField<MemoryMb> = memoryMb

        /**
         * Returns the raw JSON value of [runtime].
         *
         * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("runtime") @ExcludeMissing fun _runtime(): JsonField<Runtime> = runtime

        /**
         * Returns the raw JSON value of [sourceCode].
         *
         * Unlike [sourceCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceCode")
        @ExcludeMissing
        fun _sourceCode(): JsonField<String> = sourceCode

        /**
         * Returns the raw JSON value of [timeoutSec].
         *
         * Unlike [timeoutSec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeoutSec") @ExcludeMissing fun _timeoutSec(): JsonField<Long> = timeoutSec

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
             * .name()
             * .slug()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var slug: JsonField<String>? = null
            private var dependencies: JsonField<Dependencies> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var entrypoint: JsonField<String> = JsonMissing.of()
            private var files: JsonField<Files> = JsonMissing.of()
            private var httpEnabled: JsonField<Boolean> = JsonMissing.of()
            private var memoryMb: JsonField<MemoryMb> = JsonMissing.of()
            private var runtime: JsonField<Runtime> = JsonMissing.of()
            private var sourceCode: JsonField<String> = JsonMissing.of()
            private var timeoutSec: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                slug = body.slug
                dependencies = body.dependencies
                description = body.description
                entrypoint = body.entrypoint
                files = body.files
                httpEnabled = body.httpEnabled
                memoryMb = body.memoryMb
                runtime = body.runtime
                sourceCode = body.sourceCode
                timeoutSec = body.timeoutSec
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /** URL-safe identifier (lowercase, digits, hyphens). Must be unique per project. */
            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            /** npm dependencies. Keys are package names, values are semver ranges. */
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

            fun description(description: String) = description(JsonField.of(description))

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

            /** Whether to expose a public HTTPS URL for this function. */
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

            fun memoryMb(memoryMb: MemoryMb) = memoryMb(JsonField.of(memoryMb))

            /**
             * Sets [Builder.memoryMb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryMb] with a well-typed [MemoryMb] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryMb(memoryMb: JsonField<MemoryMb>) = apply { this.memoryMb = memoryMb }

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

            /**
             * Per-invocation timeout in seconds. Event and cron invocations are asynchronous, so a
             * long timeout only bounds cost; a tool called during a live conversation holds up the
             * reply, and a function exposed over HTTP is additionally bounded by the platform's
             * HTTP response limit.
             */
            fun timeoutSec(timeoutSec: Long) = timeoutSec(JsonField.of(timeoutSec))

            /**
             * Sets [Builder.timeoutSec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutSec] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutSec(timeoutSec: JsonField<Long>) = apply { this.timeoutSec = timeoutSec }

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
             * .name()
             * .slug()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("slug", slug),
                    dependencies,
                    description,
                    entrypoint,
                    files,
                    httpEnabled,
                    memoryMb,
                    runtime,
                    sourceCode,
                    timeoutSec,
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

            name()
            slug()
            dependencies().ifPresent { it.validate() }
            description()
            entrypoint()
            files().ifPresent { it.validate() }
            httpEnabled()
            memoryMb().ifPresent { it.validate() }
            runtime().ifPresent { it.validate() }
            sourceCode()
            timeoutSec()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (slug.asKnown().isPresent) 1 else 0) +
                (dependencies.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (entrypoint.asKnown().isPresent) 1 else 0) +
                (files.asKnown().getOrNull()?.validity() ?: 0) +
                (if (httpEnabled.asKnown().isPresent) 1 else 0) +
                (memoryMb.asKnown().getOrNull()?.validity() ?: 0) +
                (runtime.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sourceCode.asKnown().isPresent) 1 else 0) +
                (if (timeoutSec.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                slug == other.slug &&
                dependencies == other.dependencies &&
                description == other.description &&
                entrypoint == other.entrypoint &&
                files == other.files &&
                httpEnabled == other.httpEnabled &&
                memoryMb == other.memoryMb &&
                runtime == other.runtime &&
                sourceCode == other.sourceCode &&
                timeoutSec == other.timeoutSec &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                slug,
                dependencies,
                description,
                entrypoint,
                files,
                httpEnabled,
                memoryMb,
                runtime,
                sourceCode,
                timeoutSec,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, slug=$slug, dependencies=$dependencies, description=$description, entrypoint=$entrypoint, files=$files, httpEnabled=$httpEnabled, memoryMb=$memoryMb, runtime=$runtime, sourceCode=$sourceCode, timeoutSec=$timeoutSec, additionalProperties=$additionalProperties}"
    }

    /** npm dependencies. Keys are package names, values are semver ranges. */
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

    class MemoryMb @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val _128 = of(128L)

            @JvmField val _256 = of(256L)

            @JvmField val _512 = of(512L)

            @JvmField val _1024 = of(1024L)

            @JvmStatic fun of(value: Long) = MemoryMb(JsonField.of(value))
        }

        /** An enum containing [MemoryMb]'s known values. */
        enum class Known {
            _128,
            _256,
            _512,
            _1024,
        }

        /**
         * An enum containing [MemoryMb]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MemoryMb] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _128,
            _256,
            _512,
            _1024,
            /** An enum member indicating that [MemoryMb] was instantiated with an unknown value. */
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
                _128 -> Value._128
                _256 -> Value._256
                _512 -> Value._512
                _1024 -> Value._1024
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
                _128 -> Known._128
                _256 -> Known._256
                _512 -> Known._512
                _1024 -> Known._1024
                else -> throw ZavudevInvalidDataException("Unknown MemoryMb: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws ZavudevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw ZavudevInvalidDataException("Value is not a Long")

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
        fun validate(): MemoryMb = apply {
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

            return other is MemoryMb && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Runtime the function is deployed on. */
    class Runtime @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NODEJS24,
            /** An enum member indicating that [Runtime] was instantiated with an unknown value. */
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
                NODEJS24 -> Value.NODEJS24
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
                NODEJS24 -> Known.NODEJS24
                else -> throw ZavudevInvalidDataException("Unknown Runtime: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FunctionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FunctionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
