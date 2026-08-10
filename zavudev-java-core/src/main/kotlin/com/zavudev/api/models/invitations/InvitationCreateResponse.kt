// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.invitations

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
import kotlin.jvm.optionals.getOrNull

class InvitationCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val invitation: JsonField<Invitation>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("invitation")
        @ExcludeMissing
        invitation: JsonField<Invitation> = JsonMissing.of()
    ) : this(invitation, mutableMapOf())

    /**
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invitation(): Invitation = invitation.getRequired("invitation")

    /**
     * Returns the raw JSON value of [invitation].
     *
     * Unlike [invitation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invitation")
    @ExcludeMissing
    fun _invitation(): JsonField<Invitation> = invitation

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
         * Returns a mutable builder for constructing an instance of [InvitationCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .invitation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvitationCreateResponse]. */
    class Builder internal constructor() {

        private var invitation: JsonField<Invitation>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invitationCreateResponse: InvitationCreateResponse) = apply {
            invitation = invitationCreateResponse.invitation
            additionalProperties = invitationCreateResponse.additionalProperties.toMutableMap()
        }

        fun invitation(invitation: Invitation) = invitation(JsonField.of(invitation))

        /**
         * Sets [Builder.invitation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitation] with a well-typed [Invitation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invitation(invitation: JsonField<Invitation>) = apply { this.invitation = invitation }

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
         * Returns an immutable instance of [InvitationCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .invitation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvitationCreateResponse =
            InvitationCreateResponse(
                checkRequired("invitation", invitation),
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
    fun validate(): InvitationCreateResponse = apply {
        if (validated) {
            return@apply
        }

        invitation().validate()
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
    @JvmSynthetic internal fun validity(): Int = (invitation.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitationCreateResponse &&
            invitation == other.invitation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(invitation, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvitationCreateResponse{invitation=$invitation, additionalProperties=$additionalProperties}"
}
