// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.PhoneNumberService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberService.list */
class PhoneNumberListPage
private constructor(
    private val service: PhoneNumberService,
    private val params: PhoneNumberListParams,
    private val response: PhoneNumberListPageResponse,
) : Page<OwnedPhoneNumber> {

    /**
     * Delegates to [PhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberListPageResponse.items
     */
    override fun items(): List<OwnedPhoneNumber> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PhoneNumberListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PhoneNumberListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OwnedPhoneNumber> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberListPage]. */
    class Builder internal constructor() {

        private var service: PhoneNumberService? = null
        private var params: PhoneNumberListParams? = null
        private var response: PhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberListPage: PhoneNumberListPage) = apply {
            service = phoneNumberListPage.service
            params = phoneNumberListPage.params
            response = phoneNumberListPage.response
        }

        fun service(service: PhoneNumberService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhoneNumberListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneNumberListPage =
            PhoneNumberListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhoneNumberListPage{service=$service, params=$params, response=$response}"
}
