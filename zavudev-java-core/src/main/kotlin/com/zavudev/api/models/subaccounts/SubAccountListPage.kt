// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.SubAccountService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SubAccountService.list */
class SubAccountListPage
private constructor(
    private val service: SubAccountService,
    private val params: SubAccountListParams,
    private val response: SubAccountListPageResponse,
) : Page<SubAccount> {

    /**
     * Delegates to [SubAccountListPageResponse], but gracefully handles missing data.
     *
     * @see SubAccountListPageResponse.items
     */
    override fun items(): List<SubAccount> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SubAccountListPageResponse], but gracefully handles missing data.
     *
     * @see SubAccountListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SubAccountListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SubAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SubAccount> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): SubAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubAccountListPage].
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

    /** A builder for [SubAccountListPage]. */
    class Builder internal constructor() {

        private var service: SubAccountService? = null
        private var params: SubAccountListParams? = null
        private var response: SubAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(subAccountListPage: SubAccountListPage) = apply {
            service = subAccountListPage.service
            params = subAccountListPage.params
            response = subAccountListPage.response
        }

        fun service(service: SubAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SubAccountListPage].
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
        fun build(): SubAccountListPage =
            SubAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubAccountListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SubAccountListPage{service=$service, params=$params, response=$response}"
}
