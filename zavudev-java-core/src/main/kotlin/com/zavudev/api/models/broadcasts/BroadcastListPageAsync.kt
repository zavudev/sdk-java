// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.BroadcastServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BroadcastServiceAsync.list */
class BroadcastListPageAsync
private constructor(
    private val service: BroadcastServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BroadcastListParams,
    private val response: BroadcastListPageResponse,
) : PageAsync<Broadcast> {

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

    override fun nextPage(): CompletableFuture<BroadcastListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Broadcast> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BroadcastListParams = params

    /** The response that this page was parsed from. */
    fun response(): BroadcastListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BroadcastListPageAsync].
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

    /** A builder for [BroadcastListPageAsync]. */
    class Builder internal constructor() {

        private var service: BroadcastServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BroadcastListParams? = null
        private var response: BroadcastListPageResponse? = null

        @JvmSynthetic
        internal fun from(broadcastListPageAsync: BroadcastListPageAsync) = apply {
            service = broadcastListPageAsync.service
            streamHandlerExecutor = broadcastListPageAsync.streamHandlerExecutor
            params = broadcastListPageAsync.params
            response = broadcastListPageAsync.response
        }

        fun service(service: BroadcastServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BroadcastListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BroadcastListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BroadcastListPageAsync].
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
        fun build(): BroadcastListPageAsync =
            BroadcastListPageAsync(
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

        return other is BroadcastListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BroadcastListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
