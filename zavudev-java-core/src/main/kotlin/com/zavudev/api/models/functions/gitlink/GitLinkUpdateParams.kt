// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.gitlink

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
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Change the branch, the root directory, or whether pushes deploy. Pass at least one field.
 * `rootDir: null` clears the subdirectory.
 */
class GitLinkUpdateParams
private constructor(
    private val functionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun functionId(): Optional<String> = Optional.ofNullable(functionId)

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoDeploy(): Optional<Boolean> = body.autoDeploy()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun branch(): Optional<String> = body.branch()

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rootDir(): Optional<String> = body.rootDir()

    /**
     * Returns the raw JSON value of [autoDeploy].
     *
     * Unlike [autoDeploy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoDeploy(): JsonField<Boolean> = body._autoDeploy()

    /**
     * Returns the raw JSON value of [branch].
     *
     * Unlike [branch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _branch(): JsonField<String> = body._branch()

    /**
     * Returns the raw JSON value of [rootDir].
     *
     * Unlike [rootDir], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rootDir(): JsonField<String> = body._rootDir()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): GitLinkUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [GitLinkUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GitLinkUpdateParams]. */
    class Builder internal constructor() {

        private var functionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(gitLinkUpdateParams: GitLinkUpdateParams) = apply {
            functionId = gitLinkUpdateParams.functionId
            body = gitLinkUpdateParams.body.toBuilder()
            additionalHeaders = gitLinkUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = gitLinkUpdateParams.additionalQueryParams.toBuilder()
        }

        fun functionId(functionId: String?) = apply { this.functionId = functionId }

        /** Alias for calling [Builder.functionId] with `functionId.orElse(null)`. */
        fun functionId(functionId: Optional<String>) = functionId(functionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [autoDeploy]
         * - [branch]
         * - [rootDir]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun autoDeploy(autoDeploy: Boolean) = apply { body.autoDeploy(autoDeploy) }

        /**
         * Sets [Builder.autoDeploy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoDeploy] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoDeploy(autoDeploy: JsonField<Boolean>) = apply { body.autoDeploy(autoDeploy) }

        fun branch(branch: String) = apply { body.branch(branch) }

        /**
         * Sets [Builder.branch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.branch] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun branch(branch: JsonField<String>) = apply { body.branch(branch) }

        fun rootDir(rootDir: String?) = apply { body.rootDir(rootDir) }

        /** Alias for calling [Builder.rootDir] with `rootDir.orElse(null)`. */
        fun rootDir(rootDir: Optional<String>) = rootDir(rootDir.getOrNull())

        /**
         * Sets [Builder.rootDir] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rootDir] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rootDir(rootDir: JsonField<String>) = apply { body.rootDir(rootDir) }

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
         * Returns an immutable instance of [GitLinkUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GitLinkUpdateParams =
            GitLinkUpdateParams(
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

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val autoDeploy: JsonField<Boolean>,
        private val branch: JsonField<String>,
        private val rootDir: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("autoDeploy")
            @ExcludeMissing
            autoDeploy: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("branch") @ExcludeMissing branch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rootDir") @ExcludeMissing rootDir: JsonField<String> = JsonMissing.of(),
        ) : this(autoDeploy, branch, rootDir, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoDeploy(): Optional<Boolean> = autoDeploy.getOptional("autoDeploy")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun branch(): Optional<String> = branch.getOptional("branch")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rootDir(): Optional<String> = rootDir.getOptional("rootDir")

        /**
         * Returns the raw JSON value of [autoDeploy].
         *
         * Unlike [autoDeploy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("autoDeploy")
        @ExcludeMissing
        fun _autoDeploy(): JsonField<Boolean> = autoDeploy

        /**
         * Returns the raw JSON value of [branch].
         *
         * Unlike [branch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

        /**
         * Returns the raw JSON value of [rootDir].
         *
         * Unlike [rootDir], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rootDir") @ExcludeMissing fun _rootDir(): JsonField<String> = rootDir

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

            private var autoDeploy: JsonField<Boolean> = JsonMissing.of()
            private var branch: JsonField<String> = JsonMissing.of()
            private var rootDir: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                autoDeploy = body.autoDeploy
                branch = body.branch
                rootDir = body.rootDir
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun autoDeploy(autoDeploy: Boolean) = autoDeploy(JsonField.of(autoDeploy))

            /**
             * Sets [Builder.autoDeploy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoDeploy] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoDeploy(autoDeploy: JsonField<Boolean>) = apply { this.autoDeploy = autoDeploy }

            fun branch(branch: String) = branch(JsonField.of(branch))

            /**
             * Sets [Builder.branch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.branch] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun branch(branch: JsonField<String>) = apply { this.branch = branch }

            fun rootDir(rootDir: String?) = rootDir(JsonField.ofNullable(rootDir))

            /** Alias for calling [Builder.rootDir] with `rootDir.orElse(null)`. */
            fun rootDir(rootDir: Optional<String>) = rootDir(rootDir.getOrNull())

            /**
             * Sets [Builder.rootDir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rootDir] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rootDir(rootDir: JsonField<String>) = apply { this.rootDir = rootDir }

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
                Body(autoDeploy, branch, rootDir, additionalProperties.toMutableMap())
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

            autoDeploy()
            branch()
            rootDir()
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
            (if (autoDeploy.asKnown().isPresent) 1 else 0) +
                (if (branch.asKnown().isPresent) 1 else 0) +
                (if (rootDir.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                autoDeploy == other.autoDeploy &&
                branch == other.branch &&
                rootDir == other.rootDir &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(autoDeploy, branch, rootDir, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{autoDeploy=$autoDeploy, branch=$branch, rootDir=$rootDir, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GitLinkUpdateParams &&
            functionId == other.functionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(functionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "GitLinkUpdateParams{functionId=$functionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
