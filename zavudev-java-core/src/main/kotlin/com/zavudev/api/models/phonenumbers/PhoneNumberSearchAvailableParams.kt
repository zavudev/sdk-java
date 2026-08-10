// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.zavudev.api.core.Params
import com.zavudev.api.core.checkRequired
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search for available phone numbers to purchase by country and type. */
class PhoneNumberSearchAvailableParams
private constructor(
    private val countryCode: String,
    private val capabilities: String?,
    private val contains: String?,
    private val limit: Long?,
    private val type: PhoneNumberType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Two-letter ISO country code. */
    fun countryCode(): String = countryCode

    /**
     * Comma-separated capabilities the number must have: `sms`, `voice`, `mms`. Numbers missing any
     * of them are dropped.
     */
    fun capabilities(): Optional<String> = Optional.ofNullable(capabilities)

    /** Search for numbers containing this string. */
    fun contains(): Optional<String> = Optional.ofNullable(contains)

    /** Maximum number of results to return. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Type of phone number to search for. */
    fun type(): Optional<PhoneNumberType> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberSearchAvailableParams].
         *
         * The following fields are required:
         * ```java
         * .countryCode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberSearchAvailableParams]. */
    class Builder internal constructor() {

        private var countryCode: String? = null
        private var capabilities: String? = null
        private var contains: String? = null
        private var limit: Long? = null
        private var type: PhoneNumberType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberSearchAvailableParams: PhoneNumberSearchAvailableParams) =
            apply {
                countryCode = phoneNumberSearchAvailableParams.countryCode
                capabilities = phoneNumberSearchAvailableParams.capabilities
                contains = phoneNumberSearchAvailableParams.contains
                limit = phoneNumberSearchAvailableParams.limit
                type = phoneNumberSearchAvailableParams.type
                additionalHeaders = phoneNumberSearchAvailableParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    phoneNumberSearchAvailableParams.additionalQueryParams.toBuilder()
            }

        /** Two-letter ISO country code. */
        fun countryCode(countryCode: String) = apply { this.countryCode = countryCode }

        /**
         * Comma-separated capabilities the number must have: `sms`, `voice`, `mms`. Numbers missing
         * any of them are dropped.
         */
        fun capabilities(capabilities: String?) = apply { this.capabilities = capabilities }

        /** Alias for calling [Builder.capabilities] with `capabilities.orElse(null)`. */
        fun capabilities(capabilities: Optional<String>) = capabilities(capabilities.getOrNull())

        /** Search for numbers containing this string. */
        fun contains(contains: String?) = apply { this.contains = contains }

        /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
        fun contains(contains: Optional<String>) = contains(contains.getOrNull())

        /** Maximum number of results to return. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Type of phone number to search for. */
        fun type(type: PhoneNumberType?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<PhoneNumberType>) = type(type.getOrNull())

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
         * Returns an immutable instance of [PhoneNumberSearchAvailableParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .countryCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberSearchAvailableParams =
            PhoneNumberSearchAvailableParams(
                checkRequired("countryCode", countryCode),
                capabilities,
                contains,
                limit,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("countryCode", countryCode)
                capabilities?.let { put("capabilities", it) }
                contains?.let { put("contains", it) }
                limit?.let { put("limit", it.toString()) }
                type?.let { put("type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberSearchAvailableParams &&
            countryCode == other.countryCode &&
            capabilities == other.capabilities &&
            contains == other.contains &&
            limit == other.limit &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            countryCode,
            capabilities,
            contains,
            limit,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PhoneNumberSearchAvailableParams{countryCode=$countryCode, capabilities=$capabilities, contains=$contains, limit=$limit, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
