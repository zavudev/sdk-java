// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts.contacts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.zavudev.api.core.ExcludeMissing
import com.zavudev.api.core.JsonField
import com.zavudev.api.core.JsonMissing
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.Params
import com.zavudev.api.core.checkKnown
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.core.toImmutable
import com.zavudev.api.errors.ZavudevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add contacts to a broadcast in batch. Maximum 1000 contacts per request. */
class ContactAddParams
private constructor(
    private val broadcastId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun broadcastId(): Optional<String> = Optional.ofNullable(broadcastId)

    /**
     * List of contacts to add (max 1000 per request).
     *
     * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contacts(): List<Contact> = body.contacts()

    /**
     * Returns the raw JSON value of [contacts].
     *
     * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contacts(): JsonField<List<Contact>> = body._contacts()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContactAddParams].
         *
         * The following fields are required:
         * ```java
         * .contacts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactAddParams]. */
    class Builder internal constructor() {

        private var broadcastId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contactAddParams: ContactAddParams) = apply {
            broadcastId = contactAddParams.broadcastId
            body = contactAddParams.body.toBuilder()
            additionalHeaders = contactAddParams.additionalHeaders.toBuilder()
            additionalQueryParams = contactAddParams.additionalQueryParams.toBuilder()
        }

        fun broadcastId(broadcastId: String?) = apply { this.broadcastId = broadcastId }

        /** Alias for calling [Builder.broadcastId] with `broadcastId.orElse(null)`. */
        fun broadcastId(broadcastId: Optional<String>) = broadcastId(broadcastId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contacts]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of contacts to add (max 1000 per request). */
        fun contacts(contacts: List<Contact>) = apply { body.contacts(contacts) }

        /**
         * Sets [Builder.contacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contacts] with a well-typed `List<Contact>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contacts(contacts: JsonField<List<Contact>>) = apply { body.contacts(contacts) }

        /**
         * Adds a single [Contact] to [contacts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContact(contact: Contact) = apply { body.addContact(contact) }

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
         * Returns an immutable instance of [ContactAddParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contacts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactAddParams =
            ContactAddParams(
                broadcastId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> broadcastId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contacts: JsonField<List<Contact>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contacts")
            @ExcludeMissing
            contacts: JsonField<List<Contact>> = JsonMissing.of()
        ) : this(contacts, mutableMapOf())

        /**
         * List of contacts to add (max 1000 per request).
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contacts(): List<Contact> = contacts.getRequired("contacts")

        /**
         * Returns the raw JSON value of [contacts].
         *
         * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contacts")
        @ExcludeMissing
        fun _contacts(): JsonField<List<Contact>> = contacts

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
             * .contacts()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contacts: JsonField<MutableList<Contact>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contacts = body.contacts.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of contacts to add (max 1000 per request). */
            fun contacts(contacts: List<Contact>) = contacts(JsonField.of(contacts))

            /**
             * Sets [Builder.contacts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contacts] with a well-typed `List<Contact>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contacts(contacts: JsonField<List<Contact>>) = apply {
                this.contacts = contacts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Contact] to [contacts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContact(contact: Contact) = apply {
                contacts =
                    (contacts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contacts", it).add(contact)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contacts()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("contacts", contacts).map { it.toImmutable() },
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

            contacts().forEach { it.validate() }
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
            (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contacts == other.contacts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(contacts, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contacts=$contacts, additionalProperties=$additionalProperties}"
    }

    class Contact
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val recipient: JsonField<String>,
        private val templateButtonVariables: JsonField<TemplateButtonVariables>,
        private val templateHeaderVariables: JsonField<TemplateHeaderVariables>,
        private val templateVariables: JsonField<TemplateVariables>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("recipient")
            @ExcludeMissing
            recipient: JsonField<String> = JsonMissing.of(),
            @JsonProperty("templateButtonVariables")
            @ExcludeMissing
            templateButtonVariables: JsonField<TemplateButtonVariables> = JsonMissing.of(),
            @JsonProperty("templateHeaderVariables")
            @ExcludeMissing
            templateHeaderVariables: JsonField<TemplateHeaderVariables> = JsonMissing.of(),
            @JsonProperty("templateVariables")
            @ExcludeMissing
            templateVariables: JsonField<TemplateVariables> = JsonMissing.of(),
        ) : this(
            recipient,
            templateButtonVariables,
            templateHeaderVariables,
            templateVariables,
            mutableMapOf(),
        )

        /**
         * Phone number (E.164) or email address.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipient(): String = recipient.getRequired("recipient")

        /**
         * Per-contact button variables for dynamic URL/OTP buttons. Keys are the button index (0,
         * 1, 2).
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateButtonVariables(): Optional<TemplateButtonVariables> =
            templateButtonVariables.getOptional("templateButtonVariables")

        /**
         * Per-contact value for a text-header variable, keyed by `1`. If omitted, Zavu resolves the
         * header from `templateVariables` by the header placeholder's name.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateHeaderVariables(): Optional<TemplateHeaderVariables> =
            templateHeaderVariables.getOptional("templateHeaderVariables")

        /**
         * Per-contact body variables. Key them to match the template body: by position (`1`, `2`,
         * ...) for positional templates, or by name (e.g. `customer_name`) for named templates.
         * Zavu detects the template's format and sends the correct payload to Meta. Do not mix
         * positional and named keys.
         *
         * @throws ZavudevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateVariables(): Optional<TemplateVariables> =
            templateVariables.getOptional("templateVariables")

        /**
         * Returns the raw JSON value of [recipient].
         *
         * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

        /**
         * Returns the raw JSON value of [templateButtonVariables].
         *
         * Unlike [templateButtonVariables], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("templateButtonVariables")
        @ExcludeMissing
        fun _templateButtonVariables(): JsonField<TemplateButtonVariables> = templateButtonVariables

        /**
         * Returns the raw JSON value of [templateHeaderVariables].
         *
         * Unlike [templateHeaderVariables], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("templateHeaderVariables")
        @ExcludeMissing
        fun _templateHeaderVariables(): JsonField<TemplateHeaderVariables> = templateHeaderVariables

        /**
         * Returns the raw JSON value of [templateVariables].
         *
         * Unlike [templateVariables], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("templateVariables")
        @ExcludeMissing
        fun _templateVariables(): JsonField<TemplateVariables> = templateVariables

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
             * Returns a mutable builder for constructing an instance of [Contact].
             *
             * The following fields are required:
             * ```java
             * .recipient()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Contact]. */
        class Builder internal constructor() {

            private var recipient: JsonField<String>? = null
            private var templateButtonVariables: JsonField<TemplateButtonVariables> =
                JsonMissing.of()
            private var templateHeaderVariables: JsonField<TemplateHeaderVariables> =
                JsonMissing.of()
            private var templateVariables: JsonField<TemplateVariables> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contact: Contact) = apply {
                recipient = contact.recipient
                templateButtonVariables = contact.templateButtonVariables
                templateHeaderVariables = contact.templateHeaderVariables
                templateVariables = contact.templateVariables
                additionalProperties = contact.additionalProperties.toMutableMap()
            }

            /** Phone number (E.164) or email address. */
            fun recipient(recipient: String) = recipient(JsonField.of(recipient))

            /**
             * Sets [Builder.recipient] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipient] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

            /**
             * Per-contact button variables for dynamic URL/OTP buttons. Keys are the button index
             * (0, 1, 2).
             */
            fun templateButtonVariables(templateButtonVariables: TemplateButtonVariables) =
                templateButtonVariables(JsonField.of(templateButtonVariables))

            /**
             * Sets [Builder.templateButtonVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateButtonVariables] with a well-typed
             * [TemplateButtonVariables] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun templateButtonVariables(
                templateButtonVariables: JsonField<TemplateButtonVariables>
            ) = apply { this.templateButtonVariables = templateButtonVariables }

            /**
             * Per-contact value for a text-header variable, keyed by `1`. If omitted, Zavu resolves
             * the header from `templateVariables` by the header placeholder's name.
             */
            fun templateHeaderVariables(templateHeaderVariables: TemplateHeaderVariables) =
                templateHeaderVariables(JsonField.of(templateHeaderVariables))

            /**
             * Sets [Builder.templateHeaderVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateHeaderVariables] with a well-typed
             * [TemplateHeaderVariables] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun templateHeaderVariables(
                templateHeaderVariables: JsonField<TemplateHeaderVariables>
            ) = apply { this.templateHeaderVariables = templateHeaderVariables }

            /**
             * Per-contact body variables. Key them to match the template body: by position (`1`,
             * `2`, ...) for positional templates, or by name (e.g. `customer_name`) for named
             * templates. Zavu detects the template's format and sends the correct payload to Meta.
             * Do not mix positional and named keys.
             */
            fun templateVariables(templateVariables: TemplateVariables) =
                templateVariables(JsonField.of(templateVariables))

            /**
             * Sets [Builder.templateVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateVariables] with a well-typed
             * [TemplateVariables] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun templateVariables(templateVariables: JsonField<TemplateVariables>) = apply {
                this.templateVariables = templateVariables
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
             * Returns an immutable instance of [Contact].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .recipient()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Contact =
                Contact(
                    checkRequired("recipient", recipient),
                    templateButtonVariables,
                    templateHeaderVariables,
                    templateVariables,
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
        fun validate(): Contact = apply {
            if (validated) {
                return@apply
            }

            recipient()
            templateButtonVariables().ifPresent { it.validate() }
            templateHeaderVariables().ifPresent { it.validate() }
            templateVariables().ifPresent { it.validate() }
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
            (if (recipient.asKnown().isPresent) 1 else 0) +
                (templateButtonVariables.asKnown().getOrNull()?.validity() ?: 0) +
                (templateHeaderVariables.asKnown().getOrNull()?.validity() ?: 0) +
                (templateVariables.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Per-contact button variables for dynamic URL/OTP buttons. Keys are the button index (0,
         * 1, 2).
         */
        class TemplateButtonVariables
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [TemplateButtonVariables].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TemplateButtonVariables]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(templateButtonVariables: TemplateButtonVariables) = apply {
                    additionalProperties =
                        templateButtonVariables.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [TemplateButtonVariables].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TemplateButtonVariables =
                    TemplateButtonVariables(additionalProperties.toImmutable())
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
            fun validate(): TemplateButtonVariables = apply {
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

                return other is TemplateButtonVariables &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TemplateButtonVariables{additionalProperties=$additionalProperties}"
        }

        /**
         * Per-contact value for a text-header variable, keyed by `1`. If omitted, Zavu resolves the
         * header from `templateVariables` by the header placeholder's name.
         */
        class TemplateHeaderVariables
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [TemplateHeaderVariables].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TemplateHeaderVariables]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(templateHeaderVariables: TemplateHeaderVariables) = apply {
                    additionalProperties =
                        templateHeaderVariables.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [TemplateHeaderVariables].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TemplateHeaderVariables =
                    TemplateHeaderVariables(additionalProperties.toImmutable())
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
            fun validate(): TemplateHeaderVariables = apply {
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

                return other is TemplateHeaderVariables &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TemplateHeaderVariables{additionalProperties=$additionalProperties}"
        }

        /**
         * Per-contact body variables. Key them to match the template body: by position (`1`, `2`,
         * ...) for positional templates, or by name (e.g. `customer_name`) for named templates.
         * Zavu detects the template's format and sends the correct payload to Meta. Do not mix
         * positional and named keys.
         */
        class TemplateVariables
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

                /**
                 * Returns a mutable builder for constructing an instance of [TemplateVariables].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TemplateVariables]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(templateVariables: TemplateVariables) = apply {
                    additionalProperties = templateVariables.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [TemplateVariables].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TemplateVariables =
                    TemplateVariables(additionalProperties.toImmutable())
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
            fun validate(): TemplateVariables = apply {
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

                return other is TemplateVariables &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TemplateVariables{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Contact &&
                recipient == other.recipient &&
                templateButtonVariables == other.templateButtonVariables &&
                templateHeaderVariables == other.templateHeaderVariables &&
                templateVariables == other.templateVariables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                recipient,
                templateButtonVariables,
                templateHeaderVariables,
                templateVariables,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Contact{recipient=$recipient, templateButtonVariables=$templateButtonVariables, templateHeaderVariables=$templateHeaderVariables, templateVariables=$templateVariables, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactAddParams &&
            broadcastId == other.broadcastId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(broadcastId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContactAddParams{broadcastId=$broadcastId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
