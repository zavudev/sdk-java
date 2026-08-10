// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class ToolTestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val run: JsonField<Run>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("run") @ExcludeMissing run: JsonField<Run> = JsonMissing.of()
    ) : this(run, mutableMapOf())

    /**
     * One run of a tool triggered from the test endpoint. Recorded so a test is verifiable after
     * the fact rather than only visible in the response.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun run(): Run = run.getRequired("run")

    /**
     * Returns the raw JSON value of [run].
     *
     * Unlike [run], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run") @ExcludeMissing fun _run(): JsonField<Run> = run

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
         * Returns a mutable builder for constructing an instance of [ToolTestResponse].
         *
         * The following fields are required:
         * ```java
         * .run()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolTestResponse]. */
    class Builder internal constructor() {

        private var run: JsonField<Run>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolTestResponse: ToolTestResponse) = apply {
            run = toolTestResponse.run
            additionalProperties = toolTestResponse.additionalProperties.toMutableMap()
        }

        /**
         * One run of a tool triggered from the test endpoint. Recorded so a test is verifiable
         * after the fact rather than only visible in the response.
         */
        fun run(run: Run) = run(JsonField.of(run))

        /**
         * Sets [Builder.run] to an arbitrary JSON value.
         *
         * You should usually call [Builder.run] with a well-typed [Run] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun run(run: JsonField<Run>) = apply { this.run = run }

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
         * Returns an immutable instance of [ToolTestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .run()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolTestResponse =
            ToolTestResponse(checkRequired("run", run), additionalProperties.toMutableMap())
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
    fun validate(): ToolTestResponse = apply {
        if (validated) {
            return@apply
        }

        run().validate()
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
    @JvmSynthetic internal fun validity(): Int = (run.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * One run of a tool triggered from the test endpoint. Recorded so a test is verifiable after
     * the fact rather than only visible in the response.
     */
    class Run
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val durationMs: JsonField<Long>,
        private val success: JsonField<Boolean>,
        private val toolId: JsonField<String>,
        private val error: JsonField<String>,
        private val params: JsonField<Params>,
        private val response: JsonField<String>,
        private val statusCode: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("durationMs")
            @ExcludeMissing
            durationMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("toolId") @ExcludeMissing toolId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params") @ExcludeMissing params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("response")
            @ExcludeMissing
            response: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statusCode")
            @ExcludeMissing
            statusCode: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            durationMs,
            success,
            toolId,
            error,
            params,
            response,
            statusCode,
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
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun durationMs(): Long = durationMs.getRequired("durationMs")

        /**
         * Whether the tool returned without error. A tool that answered with a non-2xx status is a
         * failed run, not an error of this endpoint.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun success(): Boolean = success.getRequired("success")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun toolId(): String = toolId.getRequired("toolId")

        /**
         * Why the run failed, when it did.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * The parameters the tool was called with.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun params(): Optional<Params> = params.getOptional("params")

        /**
         * The tool's response body, truncated.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun response(): Optional<String> = response.getOptional("response")

        /**
         * HTTP status the tool's webhook returned. Absent for tools that do not go over HTTP.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCode(): Optional<Long> = statusCode.getOptional("statusCode")

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
         * Returns the raw JSON value of [durationMs].
         *
         * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("durationMs") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

        /**
         * Returns the raw JSON value of [success].
         *
         * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

        /**
         * Returns the raw JSON value of [toolId].
         *
         * Unlike [toolId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("toolId") @ExcludeMissing fun _toolId(): JsonField<String> = toolId

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

        /**
         * Returns the raw JSON value of [response].
         *
         * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<String> = response

        /**
         * Returns the raw JSON value of [statusCode].
         *
         * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("statusCode") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

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
             * Returns a mutable builder for constructing an instance of [Run].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .durationMs()
             * .success()
             * .toolId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Run]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var durationMs: JsonField<Long>? = null
            private var success: JsonField<Boolean>? = null
            private var toolId: JsonField<String>? = null
            private var error: JsonField<String> = JsonMissing.of()
            private var params: JsonField<Params> = JsonMissing.of()
            private var response: JsonField<String> = JsonMissing.of()
            private var statusCode: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(run: Run) = apply {
                id = run.id
                createdAt = run.createdAt
                durationMs = run.durationMs
                success = run.success
                toolId = run.toolId
                error = run.error
                params = run.params
                response = run.response
                statusCode = run.statusCode
                additionalProperties = run.additionalProperties.toMutableMap()
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

            fun durationMs(durationMs: Long) = durationMs(JsonField.of(durationMs))

            /**
             * Sets [Builder.durationMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationMs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

            /**
             * Whether the tool returned without error. A tool that answered with a non-2xx status
             * is a failed run, not an error of this endpoint.
             */
            fun success(success: Boolean) = success(JsonField.of(success))

            /**
             * Sets [Builder.success] to an arbitrary JSON value.
             *
             * You should usually call [Builder.success] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun success(success: JsonField<Boolean>) = apply { this.success = success }

            fun toolId(toolId: String) = toolId(JsonField.of(toolId))

            /**
             * Sets [Builder.toolId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolId(toolId: JsonField<String>) = apply { this.toolId = toolId }

            /** Why the run failed, when it did. */
            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /** The parameters the tool was called with. */
            fun params(params: Params) = params(JsonField.of(params))

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed [Params] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun params(params: JsonField<Params>) = apply { this.params = params }

            /** The tool's response body, truncated. */
            fun response(response: String?) = response(JsonField.ofNullable(response))

            /** Alias for calling [Builder.response] with `response.orElse(null)`. */
            fun response(response: Optional<String>) = response(response.getOrNull())

            /**
             * Sets [Builder.response] to an arbitrary JSON value.
             *
             * You should usually call [Builder.response] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun response(response: JsonField<String>) = apply { this.response = response }

            /**
             * HTTP status the tool's webhook returned. Absent for tools that do not go over HTTP.
             */
            fun statusCode(statusCode: Long?) = statusCode(JsonField.ofNullable(statusCode))

            /**
             * Alias for [Builder.statusCode].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun statusCode(statusCode: Long) = statusCode(statusCode as Long?)

            /** Alias for calling [Builder.statusCode] with `statusCode.orElse(null)`. */
            fun statusCode(statusCode: Optional<Long>) = statusCode(statusCode.getOrNull())

            /**
             * Sets [Builder.statusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCode] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

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
             * Returns an immutable instance of [Run].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .durationMs()
             * .success()
             * .toolId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Run =
                Run(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("durationMs", durationMs),
                    checkRequired("success", success),
                    checkRequired("toolId", toolId),
                    error,
                    params,
                    response,
                    statusCode,
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
        fun validate(): Run = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            durationMs()
            success()
            toolId()
            error()
            params().ifPresent { it.validate() }
            response()
            statusCode()
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
                (if (durationMs.asKnown().isPresent) 1 else 0) +
                (if (success.asKnown().isPresent) 1 else 0) +
                (if (toolId.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (params.asKnown().getOrNull()?.validity() ?: 0) +
                (if (response.asKnown().isPresent) 1 else 0) +
                (if (statusCode.asKnown().isPresent) 1 else 0)

        /** The parameters the tool was called with. */
        class Params
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

                /** Returns a mutable builder for constructing an instance of [Params]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Params]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(params: Params) = apply {
                    additionalProperties = params.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Params].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Params = Params(additionalProperties.toImmutable())
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
            fun validate(): Params = apply {
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

                return other is Params && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Params{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Run &&
                id == other.id &&
                createdAt == other.createdAt &&
                durationMs == other.durationMs &&
                success == other.success &&
                toolId == other.toolId &&
                error == other.error &&
                params == other.params &&
                response == other.response &&
                statusCode == other.statusCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                durationMs,
                success,
                toolId,
                error,
                params,
                response,
                statusCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Run{id=$id, createdAt=$createdAt, durationMs=$durationMs, success=$success, toolId=$toolId, error=$error, params=$params, response=$response, statusCode=$statusCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolTestResponse &&
            run == other.run &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(run, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolTestResponse{run=$run, additionalProperties=$additionalProperties}"
}
