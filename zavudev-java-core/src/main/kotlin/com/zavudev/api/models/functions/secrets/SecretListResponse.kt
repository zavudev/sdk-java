// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.secrets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class SecretListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val secrets: JsonField<List<Secret>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("secrets") @ExcludeMissing secrets: JsonField<List<Secret>> = JsonMissing.of()
    ) : this(secrets, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secrets(): List<Secret> = secrets.getRequired("secrets")

    /**
     * Returns the raw JSON value of [secrets].
     *
     * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<List<Secret>> = secrets

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
         * Returns a mutable builder for constructing an instance of [SecretListResponse].
         *
         * The following fields are required:
         * ```java
         * .secrets()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecretListResponse]. */
    class Builder internal constructor() {

        private var secrets: JsonField<MutableList<Secret>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(secretListResponse: SecretListResponse) = apply {
            secrets = secretListResponse.secrets.map { it.toMutableList() }
            additionalProperties = secretListResponse.additionalProperties.toMutableMap()
        }

        fun secrets(secrets: List<Secret>) = secrets(JsonField.of(secrets))

        /**
         * Sets [Builder.secrets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secrets] with a well-typed `List<Secret>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secrets(secrets: JsonField<List<Secret>>) = apply {
            this.secrets = secrets.map { it.toMutableList() }
        }

        /**
         * Adds a single [Secret] to [secrets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecret(secret: Secret) = apply {
            secrets =
                (secrets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("secrets", it).add(secret)
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
         * Returns an immutable instance of [SecretListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .secrets()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SecretListResponse =
            SecretListResponse(
                checkRequired("secrets", secrets).map { it.toImmutable() },
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
    fun validate(): SecretListResponse = apply {
        if (validated) {
            return@apply
        }

        secrets().forEach { it.validate() }
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
        (secrets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Secret
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val key: JsonField<String>,
        private val valueLast4: JsonField<String>,
        private val createdAt: JsonField<Double>,
        private val syncedToAws: JsonField<Boolean>,
        private val updatedAt: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("valueLast4")
            @ExcludeMissing
            valueLast4: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("syncedToAws")
            @ExcludeMissing
            syncedToAws: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<Double> = JsonMissing.of(),
        ) : this(id, key, valueLast4, createdAt, syncedToAws, updatedAt, mutableMapOf())

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun valueLast4(): String = valueLast4.getRequired("valueLast4")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<Double> = createdAt.getOptional("createdAt")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun syncedToAws(): Optional<Boolean> = syncedToAws.getOptional("syncedToAws")

        /**
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<Double> = updatedAt.getOptional("updatedAt")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [valueLast4].
         *
         * Unlike [valueLast4], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("valueLast4")
        @ExcludeMissing
        fun _valueLast4(): JsonField<String> = valueLast4

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<Double> = createdAt

        /**
         * Returns the raw JSON value of [syncedToAws].
         *
         * Unlike [syncedToAws], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("syncedToAws")
        @ExcludeMissing
        fun _syncedToAws(): JsonField<Boolean> = syncedToAws

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<Double> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [Secret].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .key()
             * .valueLast4()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Secret]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var key: JsonField<String>? = null
            private var valueLast4: JsonField<String>? = null
            private var createdAt: JsonField<Double> = JsonMissing.of()
            private var syncedToAws: JsonField<Boolean> = JsonMissing.of()
            private var updatedAt: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(secret: Secret) = apply {
                id = secret.id
                key = secret.key
                valueLast4 = secret.valueLast4
                createdAt = secret.createdAt
                syncedToAws = secret.syncedToAws
                updatedAt = secret.updatedAt
                additionalProperties = secret.additionalProperties.toMutableMap()
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

            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun valueLast4(valueLast4: String) = valueLast4(JsonField.of(valueLast4))

            /**
             * Sets [Builder.valueLast4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.valueLast4] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun valueLast4(valueLast4: JsonField<String>) = apply { this.valueLast4 = valueLast4 }

            fun createdAt(createdAt: Double) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<Double>) = apply { this.createdAt = createdAt }

            fun syncedToAws(syncedToAws: Boolean) = syncedToAws(JsonField.of(syncedToAws))

            /**
             * Sets [Builder.syncedToAws] to an arbitrary JSON value.
             *
             * You should usually call [Builder.syncedToAws] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun syncedToAws(syncedToAws: JsonField<Boolean>) = apply {
                this.syncedToAws = syncedToAws
            }

            fun updatedAt(updatedAt: Double) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<Double>) = apply { this.updatedAt = updatedAt }

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
             * Returns an immutable instance of [Secret].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .key()
             * .valueLast4()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Secret =
                Secret(
                    checkRequired("id", id),
                    checkRequired("key", key),
                    checkRequired("valueLast4", valueLast4),
                    createdAt,
                    syncedToAws,
                    updatedAt,
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
        fun validate(): Secret = apply {
            if (validated) {
                return@apply
            }

            id()
            key()
            valueLast4()
            createdAt()
            syncedToAws()
            updatedAt()
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
                (if (key.asKnown().isPresent) 1 else 0) +
                (if (valueLast4.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (syncedToAws.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Secret &&
                id == other.id &&
                key == other.key &&
                valueLast4 == other.valueLast4 &&
                createdAt == other.createdAt &&
                syncedToAws == other.syncedToAws &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                key,
                valueLast4,
                createdAt,
                syncedToAws,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Secret{id=$id, key=$key, valueLast4=$valueLast4, createdAt=$createdAt, syncedToAws=$syncedToAws, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecretListResponse &&
            secrets == other.secrets &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(secrets, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SecretListResponse{secrets=$secrets, additionalProperties=$additionalProperties}"
}
