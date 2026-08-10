// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.subaccounts

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.SubAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SubAccountServiceAsync.list */
class SubAccountListPageAsync
private constructor(
    private val service: SubAccountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SubAccountListParams,
    private val response: SubAccountListPageResponse,
) : PageAsync<SubAccount> {

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

    override fun nextPage(): CompletableFuture<SubAccountListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SubAccount> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SubAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): SubAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubAccountListPageAsync].
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

    /** A builder for [SubAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: SubAccountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SubAccountListParams? = null
        private var response: SubAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(subAccountListPageAsync: SubAccountListPageAsync) = apply {
            service = subAccountListPageAsync.service
            streamHandlerExecutor = subAccountListPageAsync.streamHandlerExecutor
            params = subAccountListPageAsync.params
            response = subAccountListPageAsync.response
        }

        fun service(service: SubAccountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SubAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SubAccountListPageAsync].
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
        fun build(): SubAccountListPageAsync =
            SubAccountListPageAsync(
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

        return other is SubAccountListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SubAccountListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
