// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.BroadcastService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BroadcastService.list */
class BroadcastListPage
private constructor(
    private val service: BroadcastService,
    private val params: BroadcastListParams,
    private val response: BroadcastListPageResponse,
) : Page<Broadcast> {

    /**
     * Delegates to [BroadcastListPageResponse], but gracefully handles missing data.
     *
     * @see BroadcastListPageResponse.items
     */
    override fun items(): List<Broadcast> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [BroadcastListPageResponse], but gracefully handles missing data.
     *
     * @see BroadcastListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BroadcastListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): BroadcastListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Broadcast> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BroadcastListParams = params

    /** The response that this page was parsed from. */
    fun response(): BroadcastListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BroadcastListPage].
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

    /** A builder for [BroadcastListPage]. */
    class Builder internal constructor() {

        private var service: BroadcastService? = null
        private var params: BroadcastListParams? = null
        private var response: BroadcastListPageResponse? = null

        @JvmSynthetic
        internal fun from(broadcastListPage: BroadcastListPage) = apply {
            service = broadcastListPage.service
            params = broadcastListPage.params
            response = broadcastListPage.response
        }

        fun service(service: BroadcastService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BroadcastListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BroadcastListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BroadcastListPage].
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
        fun build(): BroadcastListPage =
            BroadcastListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BroadcastListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BroadcastListPage{service=$service, params=$params, response=$response}"
}
