// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

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
import kotlin.jvm.optionals.getOrNull

class TemplateSyncResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountsSynced: JsonField<Long>,
    private val errors: JsonField<List<String>>,
    private val imported: JsonField<Long>,
    private val linked: JsonField<Long>,
    private val skipped: JsonField<Long>,
    private val updated: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountsSynced")
        @ExcludeMissing
        accountsSynced: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("imported") @ExcludeMissing imported: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("linked") @ExcludeMissing linked: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("skipped") @ExcludeMissing skipped: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<Long> = JsonMissing.of(),
    ) : this(accountsSynced, errors, imported, linked, skipped, updated, mutableMapOf())

    /**
     * WhatsApp Business Accounts reconciled in this call.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountsSynced(): Long = accountsSynced.getRequired("accountsSynced")

    /**
     * Problems hit while syncing. Non-empty with a 200 means part of the sync did not complete —
     * the rest still did.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errors(): List<String> = errors.getRequired("errors")

    /**
     * Templates that existed on Meta and were created in Zavu by this call.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun imported(): Long = imported.getRequired("imported")

    /**
     * Existing Zavu templates that were matched to a Meta template by name and bound to its Meta
     * ID.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linked(): Long = linked.getRequired("linked")

    /**
     * Meta templates left alone: already linked to a Zavu template, or rejected/disabled on Meta.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun skipped(): Long = skipped.getRequired("skipped")

    /**
     * Templates whose approval status changed to match Meta.
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): Long = updated.getRequired("updated")

    /**
     * Returns the raw JSON value of [accountsSynced].
     *
     * Unlike [accountsSynced], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountsSynced")
    @ExcludeMissing
    fun _accountsSynced(): JsonField<Long> = accountsSynced

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<String>> = errors

    /**
     * Returns the raw JSON value of [imported].
     *
     * Unlike [imported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imported") @ExcludeMissing fun _imported(): JsonField<Long> = imported

    /**
     * Returns the raw JSON value of [linked].
     *
     * Unlike [linked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linked") @ExcludeMissing fun _linked(): JsonField<Long> = linked

    /**
     * Returns the raw JSON value of [skipped].
     *
     * Unlike [skipped], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skipped") @ExcludeMissing fun _skipped(): JsonField<Long> = skipped

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<Long> = updated

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
         * Returns a mutable builder for constructing an instance of [TemplateSyncResponse].
         *
         * The following fields are required:
         * ```java
         * .accountsSynced()
         * .errors()
         * .imported()
         * .linked()
         * .skipped()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplateSyncResponse]. */
    class Builder internal constructor() {

        private var accountsSynced: JsonField<Long>? = null
        private var errors: JsonField<MutableList<String>>? = null
        private var imported: JsonField<Long>? = null
        private var linked: JsonField<Long>? = null
        private var skipped: JsonField<Long>? = null
        private var updated: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(templateSyncResponse: TemplateSyncResponse) = apply {
            accountsSynced = templateSyncResponse.accountsSynced
            errors = templateSyncResponse.errors.map { it.toMutableList() }
            imported = templateSyncResponse.imported
            linked = templateSyncResponse.linked
            skipped = templateSyncResponse.skipped
            updated = templateSyncResponse.updated
            additionalProperties = templateSyncResponse.additionalProperties.toMutableMap()
        }

        /** WhatsApp Business Accounts reconciled in this call. */
        fun accountsSynced(accountsSynced: Long) = accountsSynced(JsonField.of(accountsSynced))

        /**
         * Sets [Builder.accountsSynced] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountsSynced] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountsSynced(accountsSynced: JsonField<Long>) = apply {
            this.accountsSynced = accountsSynced
        }

        /**
         * Problems hit while syncing. Non-empty with a 200 means part of the sync did not complete
         * — the rest still did.
         */
        fun errors(errors: List<String>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<String>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: String) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /** Templates that existed on Meta and were created in Zavu by this call. */
        fun imported(imported: Long) = imported(JsonField.of(imported))

        /**
         * Sets [Builder.imported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imported] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imported(imported: JsonField<Long>) = apply { this.imported = imported }

        /**
         * Existing Zavu templates that were matched to a Meta template by name and bound to its
         * Meta ID.
         */
        fun linked(linked: Long) = linked(JsonField.of(linked))

        /**
         * Sets [Builder.linked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linked] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun linked(linked: JsonField<Long>) = apply { this.linked = linked }

        /**
         * Meta templates left alone: already linked to a Zavu template, or rejected/disabled on
         * Meta.
         */
        fun skipped(skipped: Long) = skipped(JsonField.of(skipped))

        /**
         * Sets [Builder.skipped] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipped] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun skipped(skipped: JsonField<Long>) = apply { this.skipped = skipped }

        /** Templates whose approval status changed to match Meta. */
        fun updated(updated: Long) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updated(updated: JsonField<Long>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [TemplateSyncResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountsSynced()
         * .errors()
         * .imported()
         * .linked()
         * .skipped()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TemplateSyncResponse =
            TemplateSyncResponse(
                checkRequired("accountsSynced", accountsSynced),
                checkRequired("errors", errors).map { it.toImmutable() },
                checkRequired("imported", imported),
                checkRequired("linked", linked),
                checkRequired("skipped", skipped),
                checkRequired("updated", updated),
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
    fun validate(): TemplateSyncResponse = apply {
        if (validated) {
            return@apply
        }

        accountsSynced()
        errors()
        imported()
        linked()
        skipped()
        updated()
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
        (if (accountsSynced.asKnown().isPresent) 1 else 0) +
            (errors.asKnown().getOrNull()?.size ?: 0) +
            (if (imported.asKnown().isPresent) 1 else 0) +
            (if (linked.asKnown().isPresent) 1 else 0) +
            (if (skipped.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplateSyncResponse &&
            accountsSynced == other.accountsSynced &&
            errors == other.errors &&
            imported == other.imported &&
            linked == other.linked &&
            skipped == other.skipped &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountsSynced,
            errors,
            imported,
            linked,
            skipped,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TemplateSyncResponse{accountsSynced=$accountsSynced, errors=$errors, imported=$imported, linked=$linked, skipped=$skipped, updated=$updated, additionalProperties=$additionalProperties}"
}
