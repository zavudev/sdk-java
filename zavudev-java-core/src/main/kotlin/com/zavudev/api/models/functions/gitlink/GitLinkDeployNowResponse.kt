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
import com.zavudev.api.core.checkRequired
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects

class GitLinkDeployNowResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val scheduled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("scheduled") @ExcludeMissing scheduled: JsonField<Boolean> = JsonMissing.of()
    ) : this(scheduled, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduled(): Boolean = scheduled.getRequired("scheduled")

    /**
     * Returns the raw JSON value of [scheduled].
     *
     * Unlike [scheduled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduled") @ExcludeMissing fun _scheduled(): JsonField<Boolean> = scheduled

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
         * Returns a mutable builder for constructing an instance of [GitLinkDeployNowResponse].
         *
         * The following fields are required:
         * ```java
         * .scheduled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GitLinkDeployNowResponse]. */
    class Builder internal constructor() {

        private var scheduled: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(gitLinkDeployNowResponse: GitLinkDeployNowResponse) = apply {
            scheduled = gitLinkDeployNowResponse.scheduled
            additionalProperties = gitLinkDeployNowResponse.additionalProperties.toMutableMap()
        }

        fun scheduled(scheduled: Boolean) = scheduled(JsonField.of(scheduled))

        /**
         * Sets [Builder.scheduled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scheduled(scheduled: JsonField<Boolean>) = apply { this.scheduled = scheduled }

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
         * Returns an immutable instance of [GitLinkDeployNowResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .scheduled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GitLinkDeployNowResponse =
            GitLinkDeployNowResponse(
                checkRequired("scheduled", scheduled),
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
    fun validate(): GitLinkDeployNowResponse = apply {
        if (validated) {
            return@apply
        }

        scheduled()
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
    @JvmSynthetic internal fun validity(): Int = (if (scheduled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GitLinkDeployNowResponse &&
            scheduled == other.scheduled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(scheduled, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GitLinkDeployNowResponse{scheduled=$scheduled, additionalProperties=$additionalProperties}"
}
