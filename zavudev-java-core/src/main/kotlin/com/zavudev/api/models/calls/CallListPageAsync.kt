// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.calls

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.CallServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CallServiceAsync.list */
class CallListPageAsync
private constructor(
    private val service: CallServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CallListParams,
    private val response: CallListPageResponse,
) : PageAsync<CallListResponse> {

    /**
     * Delegates to [CallListPageResponse], but gracefully handles missing data.
     *
     * @see CallListPageResponse.items
     */
    override fun items(): List<CallListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [CallListPageResponse], but gracefully handles missing data.
     *
     * @see CallListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CallListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CallListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CallListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CallListParams = params

    /** The response that this page was parsed from. */
    fun response(): CallListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallListPageAsync].
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

    /** A builder for [CallListPageAsync]. */
    class Builder internal constructor() {

        private var service: CallServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CallListParams? = null
        private var response: CallListPageResponse? = null

        @JvmSynthetic
        internal fun from(callListPageAsync: CallListPageAsync) = apply {
            service = callListPageAsync.service
            streamHandlerExecutor = callListPageAsync.streamHandlerExecutor
            params = callListPageAsync.params
            response = callListPageAsync.response
        }

        fun service(service: CallServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CallListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CallListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CallListPageAsync].
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
        fun build(): CallListPageAsync =
            CallListPageAsync(
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

        return other is CallListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CallListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
