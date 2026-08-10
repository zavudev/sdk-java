// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.addresses

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.AddressService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AddressService.list */
class AddressListPage
private constructor(
    private val service: AddressService,
    private val params: AddressListParams,
    private val response: AddressListPageResponse,
) : Page<Address> {

    /**
     * Delegates to [AddressListPageResponse], but gracefully handles missing data.
     *
     * @see AddressListPageResponse.items
     */
    override fun items(): List<Address> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [AddressListPageResponse], but gracefully handles missing data.
     *
     * @see AddressListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): AddressListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AddressListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Address> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): AddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddressListPage].
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

    /** A builder for [AddressListPage]. */
    class Builder internal constructor() {

        private var service: AddressService? = null
        private var params: AddressListParams? = null
        private var response: AddressListPageResponse? = null

        @JvmSynthetic
        internal fun from(addressListPage: AddressListPage) = apply {
            service = addressListPage.service
            params = addressListPage.params
            response = addressListPage.response
        }

        fun service(service: AddressService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddressListPage].
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
        fun build(): AddressListPage =
            AddressListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AddressListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AddressListPage{service=$service, params=$params, response=$response}"
}
