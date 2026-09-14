// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.zavudev.api.core.Params
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get the regulatory information needed to buy a phone number, for one specific number or for a
 * country and number type. Prefer `phoneNumber`: the response is then exactly the list the purchase
 * of that number validates against. Pass each `requirementTypes[].id` back as `requirementType` in
 * `regulatoryRequirements` on `POST /v1/phone-numbers`.
 *
 * For `phoneNumber`, the requirements of that exact number are returned. When they cannot be
 * resolved for the number itself, the list for its country and `type` is returned instead, and the
 * purchase uses the same list. An empty `items` array means the number needs no regulatory
 * information. If the requirements cannot be retrieved at all, the response is `502
 * requirements_unavailable`, never an empty list.
 *
 * URL-encode the `+` of `phoneNumber` as `%2B`. An unencoded `+` is also accepted.
 */
class PhoneNumberRequirementsParams
private constructor(
    private val countryCode: String?,
    private val phoneNumber: String?,
    private val type: PhoneNumberType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Two-letter ISO country code. Required unless `phoneNumber` is given. */
    fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

    /**
     * E.164 number from `GET /v1/phone-numbers/available`, with `+` encoded as `%2B`. Returns the
     * requirements the purchase of that number checks. Takes precedence over `countryCode`.
     */
    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /**
     * Type of phone number (local, national, mobile, tollFree). Defaults to `local`. With
     * `phoneNumber`, used only when the number's own requirements cannot be resolved and the
     * country list is returned.
     */
    fun type(): Optional<PhoneNumberType> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PhoneNumberRequirementsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberRequirementsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberRequirementsParams]. */
    class Builder internal constructor() {

        private var countryCode: String? = null
        private var phoneNumber: String? = null
        private var type: PhoneNumberType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberRequirementsParams: PhoneNumberRequirementsParams) = apply {
            countryCode = phoneNumberRequirementsParams.countryCode
            phoneNumber = phoneNumberRequirementsParams.phoneNumber
            type = phoneNumberRequirementsParams.type
            additionalHeaders = phoneNumberRequirementsParams.additionalHeaders.toBuilder()
            additionalQueryParams = phoneNumberRequirementsParams.additionalQueryParams.toBuilder()
        }

        /** Two-letter ISO country code. Required unless `phoneNumber` is given. */
        fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

        /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
        fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

        /**
         * E.164 number from `GET /v1/phone-numbers/available`, with `+` encoded as `%2B`. Returns
         * the requirements the purchase of that number checks. Takes precedence over `countryCode`.
         */
        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Type of phone number (local, national, mobile, tollFree). Defaults to `local`. With
         * `phoneNumber`, used only when the number's own requirements cannot be resolved and the
         * country list is returned.
         */
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
         * Returns an immutable instance of [PhoneNumberRequirementsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberRequirementsParams =
            PhoneNumberRequirementsParams(
                countryCode,
                phoneNumber,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                countryCode?.let { put("countryCode", it) }
                phoneNumber?.let { put("phoneNumber", it) }
                type?.let { put("type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberRequirementsParams &&
            countryCode == other.countryCode &&
            phoneNumber == other.phoneNumber &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(countryCode, phoneNumber, type, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberRequirementsParams{countryCode=$countryCode, phoneNumber=$phoneNumber, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
