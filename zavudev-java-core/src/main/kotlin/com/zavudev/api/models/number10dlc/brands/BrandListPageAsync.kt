// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.brands

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.number10dlc.BrandServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BrandServiceAsync.list */
class BrandListPageAsync
private constructor(
    private val service: BrandServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BrandListParams,
    private val response: BrandListPageResponse,
) : PageAsync<TenDlcBrand> {

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

    override fun nextPage(): CompletableFuture<BrandListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TenDlcBrand> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BrandListParams = params

    /** The response that this page was parsed from. */
    fun response(): BrandListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrandListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandListPageAsync]. */
    class Builder internal constructor() {

        private var service: BrandServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BrandListParams? = null
        private var response: BrandListPageResponse? = null

        @JvmSynthetic
        internal fun from(brandListPageAsync: BrandListPageAsync) = apply {
            service = brandListPageAsync.service
            streamHandlerExecutor = brandListPageAsync.streamHandlerExecutor
            params = brandListPageAsync.params
            response = brandListPageAsync.response
        }

        fun service(service: BrandServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BrandListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BrandListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BrandListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandListPageAsync =
            BrandListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BrandListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
