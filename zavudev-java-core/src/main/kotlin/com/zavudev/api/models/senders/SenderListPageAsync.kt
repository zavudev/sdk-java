// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.SenderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SenderServiceAsync.list */
class SenderListPageAsync
private constructor(
    private val service: SenderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SenderListParams,
    private val response: SenderListPageResponse,
) : PageAsync<Sender> {

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

    override fun nextPage(): CompletableFuture<SenderListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Sender> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SenderListParams = params

    /** The response that this page was parsed from. */
    fun response(): SenderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SenderListPageAsync].
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

    /** A builder for [SenderListPageAsync]. */
    class Builder internal constructor() {

        private var service: SenderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SenderListParams? = null
        private var response: SenderListPageResponse? = null

        @JvmSynthetic
        internal fun from(senderListPageAsync: SenderListPageAsync) = apply {
            service = senderListPageAsync.service
            streamHandlerExecutor = senderListPageAsync.streamHandlerExecutor
            params = senderListPageAsync.params
            response = senderListPageAsync.response
        }

        fun service(service: SenderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SenderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SenderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SenderListPageAsync].
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
        fun build(): SenderListPageAsync =
            SenderListPageAsync(
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

        return other is SenderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SenderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
