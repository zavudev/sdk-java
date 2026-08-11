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
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FunctionDeployResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deployment: JsonField<Deployment>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deployment")
        @ExcludeMissing
        deployment: JsonField<Deployment> = JsonMissing.of()
    ) : this(deployment, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deployment(): Deployment = deployment.getRequired("deployment")

    /**
     * Returns the raw JSON value of [deployment].
     *
     * Unlike [deployment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deployment")
    @ExcludeMissing
    fun _deployment(): JsonField<Deployment> = deployment

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
         * Returns a mutable builder for constructing an instance of [FunctionDeployResponse].
         *
         * The following fields are required:
         * ```java
         * .deployment()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionDeployResponse]. */
    class Builder internal constructor() {

        private var deployment: JsonField<Deployment>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(functionDeployResponse: FunctionDeployResponse) = apply {
            deployment = functionDeployResponse.deployment
            additionalProperties = functionDeployResponse.additionalProperties.toMutableMap()
        }

        fun deployment(deployment: Deployment) = deployment(JsonField.of(deployment))

        /**
         * Sets [Builder.deployment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deployment] with a well-typed [Deployment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deployment(deployment: JsonField<Deployment>) = apply { this.deployment = deployment }

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
         * Returns an immutable instance of [FunctionDeployResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deployment()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FunctionDeployResponse =
            FunctionDeployResponse(
                checkRequired("deployment", deployment),
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
    fun validate(): FunctionDeployResponse = apply {
        if (validated) {
            return@apply
        }

        deployment().validate()
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
    @JvmSynthetic internal fun validity(): Int = (deployment.asKnown().getOrNull()?.validity() ?: 0)

    class Deployment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val functionId: JsonField<String>,
        private val status: JsonField<Status>,
        private val version: JsonField<Long>,
        private val bundleBytes: JsonField<Long>,
        private val deployedAt: JsonField<OffsetDateTime>,
        private val errorMessage: JsonField<String>,
        private val sourceCodeBytes: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("functionId")
            @ExcludeMissing
            functionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("bundleBytes")
            @ExcludeMissing
            bundleBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("deployedAt")
            @ExcludeMissing
            deployedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("errorMessage")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceCodeBytes")
            @ExcludeMissing
            sourceCodeBytes: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            functionId,
            status,
            version,
            bundleBytes,
            deployedAt,
            errorMessage,
            sourceCodeBytes,
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
        fun functionId(): String = functionId.getRequired("functionId")

        /**
         * Stage of a function deployment.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Monotonically increasing deployment version, starting at 1.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): Long = version.getRequired("version")

        /**
         * Size of the built bundle in bytes. Null until the build finishes.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bundleBytes(): Optional<Long> = bundleBytes.getOptional("bundleBytes")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deployedAt(): Optional<OffsetDateTime> = deployedAt.getOptional("deployedAt")

        /**
         * Failure reason when status is 'failed'.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

        /**
         * Total size of the deployed source tree in bytes.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sourceCodeBytes(): Optional<Long> = sourceCodeBytes.getOptional("sourceCodeBytes")

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
         * Returns the raw JSON value of [functionId].
         *
         * Unlike [functionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("functionId")
        @ExcludeMissing
        fun _functionId(): JsonField<String> = functionId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        /**
         * Returns the raw JSON value of [bundleBytes].
         *
         * Unlike [bundleBytes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bundleBytes")
        @ExcludeMissing
        fun _bundleBytes(): JsonField<Long> = bundleBytes

        /**
         * Returns the raw JSON value of [deployedAt].
         *
         * Unlike [deployedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deployedAt")
        @ExcludeMissing
        fun _deployedAt(): JsonField<OffsetDateTime> = deployedAt

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("errorMessage")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        /**
         * Returns the raw JSON value of [sourceCodeBytes].
         *
         * Unlike [sourceCodeBytes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sourceCodeBytes")
        @ExcludeMissing
        fun _sourceCodeBytes(): JsonField<Long> = sourceCodeBytes

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
             * Returns a mutable builder for constructing an instance of [Deployment].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .functionId()
             * .status()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Deployment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var functionId: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var version: JsonField<Long>? = null
            private var bundleBytes: JsonField<Long> = JsonMissing.of()
            private var deployedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var sourceCodeBytes: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deployment: Deployment) = apply {
                id = deployment.id
                createdAt = deployment.createdAt
                functionId = deployment.functionId
                status = deployment.status
                version = deployment.version
                bundleBytes = deployment.bundleBytes
                deployedAt = deployment.deployedAt
                errorMessage = deployment.errorMessage
                sourceCodeBytes = deployment.sourceCodeBytes
                additionalProperties = deployment.additionalProperties.toMutableMap()
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

            fun functionId(functionId: String) = functionId(JsonField.of(functionId))

            /**
             * Sets [Builder.functionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functionId(functionId: JsonField<String>) = apply { this.functionId = functionId }

            /** Stage of a function deployment. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Monotonically increasing deployment version, starting at 1. */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

            /** Size of the built bundle in bytes. Null until the build finishes. */
            fun bundleBytes(bundleBytes: Long?) = bundleBytes(JsonField.ofNullable(bundleBytes))

            /**
             * Alias for [Builder.bundleBytes].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun bundleBytes(bundleBytes: Long) = bundleBytes(bundleBytes as Long?)

            /** Alias for calling [Builder.bundleBytes] with `bundleBytes.orElse(null)`. */
            fun bundleBytes(bundleBytes: Optional<Long>) = bundleBytes(bundleBytes.getOrNull())

            /**
             * Sets [Builder.bundleBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bundleBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bundleBytes(bundleBytes: JsonField<Long>) = apply { this.bundleBytes = bundleBytes }

            fun deployedAt(deployedAt: OffsetDateTime?) =
                deployedAt(JsonField.ofNullable(deployedAt))

            /** Alias for calling [Builder.deployedAt] with `deployedAt.orElse(null)`. */
            fun deployedAt(deployedAt: Optional<OffsetDateTime>) =
                deployedAt(deployedAt.getOrNull())

            /**
             * Sets [Builder.deployedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deployedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deployedAt(deployedAt: JsonField<OffsetDateTime>) = apply {
                this.deployedAt = deployedAt
            }

            /** Failure reason when status is 'failed'. */
            fun errorMessage(errorMessage: String?) =
                errorMessage(JsonField.ofNullable(errorMessage))

            /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
            fun errorMessage(errorMessage: Optional<String>) =
                errorMessage(errorMessage.getOrNull())

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            /** Total size of the deployed source tree in bytes. */
            fun sourceCodeBytes(sourceCodeBytes: Long?) =
                sourceCodeBytes(JsonField.ofNullable(sourceCodeBytes))

            /**
             * Alias for [Builder.sourceCodeBytes].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sourceCodeBytes(sourceCodeBytes: Long) = sourceCodeBytes(sourceCodeBytes as Long?)

            /** Alias for calling [Builder.sourceCodeBytes] with `sourceCodeBytes.orElse(null)`. */
            fun sourceCodeBytes(sourceCodeBytes: Optional<Long>) =
                sourceCodeBytes(sourceCodeBytes.getOrNull())

            /**
             * Sets [Builder.sourceCodeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceCodeBytes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceCodeBytes(sourceCodeBytes: JsonField<Long>) = apply {
                this.sourceCodeBytes = sourceCodeBytes
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
             * Returns an immutable instance of [Deployment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .functionId()
             * .status()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Deployment =
                Deployment(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("functionId", functionId),
                    checkRequired("status", status),
                    checkRequired("version", version),
                    bundleBytes,
                    deployedAt,
                    errorMessage,
                    sourceCodeBytes,
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
        fun validate(): Deployment = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            functionId()
            status().validate()
            version()
            bundleBytes()
            deployedAt()
            errorMessage()
            sourceCodeBytes()
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
                (if (functionId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0) +
                (if (bundleBytes.asKnown().isPresent) 1 else 0) +
                (if (deployedAt.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (if (sourceCodeBytes.asKnown().isPresent) 1 else 0)

        /** Stage of a function deployment. */
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

                @JvmField val PENDING = of("pending")

                @JvmField val BUNDLING = of("bundling")

                @JvmField val UPLOADING = of("uploading")

                @JvmField val PUBLISHING = of("publishing")

                @JvmField val ACTIVE = of("active")

                @JvmField val FAILED = of("failed")

                @JvmField val SUPERSEDED = of("superseded")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                BUNDLING,
                UPLOADING,
                PUBLISHING,
                ACTIVE,
                FAILED,
                SUPERSEDED,
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
                PENDING,
                BUNDLING,
                UPLOADING,
                PUBLISHING,
                ACTIVE,
                FAILED,
                SUPERSEDED,
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
                    PENDING -> Value.PENDING
                    BUNDLING -> Value.BUNDLING
                    UPLOADING -> Value.UPLOADING
                    PUBLISHING -> Value.PUBLISHING
                    ACTIVE -> Value.ACTIVE
                    FAILED -> Value.FAILED
                    SUPERSEDED -> Value.SUPERSEDED
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
                    PENDING -> Known.PENDING
                    BUNDLING -> Known.BUNDLING
                    UPLOADING -> Known.UPLOADING
                    PUBLISHING -> Known.PUBLISHING
                    ACTIVE -> Known.ACTIVE
                    FAILED -> Known.FAILED
                    SUPERSEDED -> Known.SUPERSEDED
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

            return other is Deployment &&
                id == other.id &&
                createdAt == other.createdAt &&
                functionId == other.functionId &&
                status == other.status &&
                version == other.version &&
                bundleBytes == other.bundleBytes &&
                deployedAt == other.deployedAt &&
                errorMessage == other.errorMessage &&
                sourceCodeBytes == other.sourceCodeBytes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                functionId,
                status,
                version,
                bundleBytes,
                deployedAt,
                errorMessage,
                sourceCodeBytes,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Deployment{id=$id, createdAt=$createdAt, functionId=$functionId, status=$status, version=$version, bundleBytes=$bundleBytes, deployedAt=$deployedAt, errorMessage=$errorMessage, sourceCodeBytes=$sourceCodeBytes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FunctionDeployResponse &&
            deployment == other.deployment &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(deployment, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FunctionDeployResponse{deployment=$deployment, additionalProperties=$additionalProperties}"
}
