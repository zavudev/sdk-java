// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.SenderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SenderService.list */
class SenderListPage
private constructor(
    private val service: SenderService,
    private val params: SenderListParams,
    private val response: SenderListPageResponse,
) : Page<Sender> {

    /**
     * Delegates to [SenderListPageResponse], but gracefully handles missing data.
     *
     * @see SenderListPageResponse.items
     */
    override fun items(): List<Sender> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SenderListPageResponse], but gracefully handles missing data.
     *
     * @see SenderListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SenderListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SenderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Sender> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SenderListParams = params

    /** The response that this page was parsed from. */
    fun response(): SenderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SenderListPage].
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

    /** A builder for [SenderListPage]. */
    class Builder internal constructor() {

        private var service: SenderService? = null
        private var params: SenderListParams? = null
        private var response: SenderListPageResponse? = null

        @JvmSynthetic
        internal fun from(senderListPage: SenderListPage) = apply {
            service = senderListPage.service
            params = senderListPage.params
            response = senderListPage.response
        }

        fun service(service: SenderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SenderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SenderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SenderListPage].
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
        fun build(): SenderListPage =
            SenderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SenderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "SenderListPage{service=$service, params=$params, response=$response}"
}
