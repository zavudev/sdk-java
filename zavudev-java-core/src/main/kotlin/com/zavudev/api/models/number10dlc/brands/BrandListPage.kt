// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.number10dlc.BrandService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BrandService.list */
class BrandListPage
private constructor(
    private val service: BrandService,
    private val params: BrandListParams,
    private val response: BrandListPageResponse,
) : Page<TenDlcBrand> {

    /**
     * Delegates to [BrandListPageResponse], but gracefully handles missing data.
     *
     * @see BrandListPageResponse.items
     */
    override fun items(): List<TenDlcBrand> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [BrandListPageResponse], but gracefully handles missing data.
     *
     * @see BrandListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BrandListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): BrandListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TenDlcBrand> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BrandListParams = params

    /** The response that this page was parsed from. */
    fun response(): BrandListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandListPage].
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

    /** A builder for [BrandListPage]. */
    class Builder internal constructor() {

        private var service: BrandService? = null
        private var params: BrandListParams? = null
        private var response: BrandListPageResponse? = null

        @JvmSynthetic
        internal fun from(brandListPage: BrandListPage) = apply {
            service = brandListPage.service
            params = brandListPage.params
            response = brandListPage.response
        }

        fun service(service: BrandService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BrandListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BrandListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BrandListPage].
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
        fun build(): BrandListPage =
            BrandListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "BrandListPage{service=$service, params=$params, response=$response}"
}
