// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import com.zavudev.api.core.Params
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import com.zavudev.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List contacts with their communication channels. */
class ContactListParams
private constructor(
    private val cursor: String?,
    private val limit: Long?,
    private val phoneNumber: String?,
    private val search: String?,
    private val tag: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Opaque cursor from a previous response's `nextCursor`. Do not construct it. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Exact match on the contact's primary phone number, in E.164. */
    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /**
     * Free-text match over the contact's name (`displayName` and the WhatsApp profile name), phone
     * numbers and email addresses. Case- and accent-insensitive. A phone number matches on a
     * trailing fragment too, so `5551234` finds `+14155551234`.
     *
     * Contacts created automatically from an inbound message have no `displayName` — they are
     * matched by their identifier until you set one with `PATCH /v1/contacts/{contactId}`.
     *
     * Results come back in relevance order rather than newest-first. `cursor` is opaque in both
     * modes; pass back exactly what the previous response returned, and start a new pagination run
     * when the search term changes.
     */
    fun search(): Optional<String> = Optional.ofNullable(search)

    /**
     * Tag name. Repeatable: `?tag=vip&tag=chile` returns contacts carrying **every** tag given, not
     * any of them — the same rule the dashboard filter applies.
     *
     * Tags are matched by name, case-insensitively. An unknown tag returns 400 rather than being
     * ignored, because a typo that silently matched every contact would be a worse answer than an
     * error.
     */
    fun tag(): Optional<List<String>> = Optional.ofNullable(tag)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ContactListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ContactListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactListParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var limit: Long? = null
        private var phoneNumber: String? = null
        private var search: String? = null
        private var tag: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contactListParams: ContactListParams) = apply {
            cursor = contactListParams.cursor
            limit = contactListParams.limit
            phoneNumber = contactListParams.phoneNumber
            search = contactListParams.search
            tag = contactListParams.tag?.toMutableList()
            additionalHeaders = contactListParams.additionalHeaders.toBuilder()
            additionalQueryParams = contactListParams.additionalQueryParams.toBuilder()
        }

        /** Opaque cursor from a previous response's `nextCursor`. Do not construct it. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Exact match on the contact's primary phone number, in E.164. */
        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Free-text match over the contact's name (`displayName` and the WhatsApp profile name),
         * phone numbers and email addresses. Case- and accent-insensitive. A phone number matches
         * on a trailing fragment too, so `5551234` finds `+14155551234`.
         *
         * Contacts created automatically from an inbound message have no `displayName` — they are
         * matched by their identifier until you set one with `PATCH /v1/contacts/{contactId}`.
         *
         * Results come back in relevance order rather than newest-first. `cursor` is opaque in both
         * modes; pass back exactly what the previous response returned, and start a new pagination
         * run when the search term changes.
         */
        fun search(search: String?) = apply { this.search = search }

        /** Alias for calling [Builder.search] with `search.orElse(null)`. */
        fun search(search: Optional<String>) = search(search.getOrNull())

        /**
         * Tag name. Repeatable: `?tag=vip&tag=chile` returns contacts carrying **every** tag given,
         * not any of them — the same rule the dashboard filter applies.
         *
         * Tags are matched by name, case-insensitively. An unknown tag returns 400 rather than
         * being ignored, because a typo that silently matched every contact would be a worse answer
         * than an error.
         */
        fun tag(tag: List<String>?) = apply { this.tag = tag?.toMutableList() }

        /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
        fun tag(tag: Optional<List<String>>) = tag(tag.getOrNull())

        /**
         * Adds a single [String] to [Builder.tag].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            this.tag = (this.tag ?: mutableListOf()).apply { add(tag) }
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
         * Returns an immutable instance of [ContactListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContactListParams =
            ContactListParams(
                cursor,
                limit,
                phoneNumber,
                search,
                tag?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                phoneNumber?.let { put("phoneNumber", it) }
                search?.let { put("search", it) }
                tag?.let { put("tag", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactListParams &&
            cursor == other.cursor &&
            limit == other.limit &&
            phoneNumber == other.phoneNumber &&
            search == other.search &&
            tag == other.tag &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            limit,
            phoneNumber,
            search,
            tag,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ContactListParams{cursor=$cursor, limit=$limit, phoneNumber=$phoneNumber, search=$search, tag=$tag, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
