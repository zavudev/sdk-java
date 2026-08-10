// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.senders.agent.ToolServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ToolServiceAsync.list */
class ToolListPageAsync
private constructor(
    private val service: ToolServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ToolListParams,
    private val response: ToolListPageResponse,
) : PageAsync<AgentTool> {

    /**
     * Delegates to [ToolListPageResponse], but gracefully handles missing data.
     *
     * @see ToolListPageResponse.items
     */
    override fun items(): List<AgentTool> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ToolListPageResponse], but gracefully handles missing data.
     *
     * @see ToolListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ToolListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ToolListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AgentTool> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ToolListParams = params

    /** The response that this page was parsed from. */
    fun response(): ToolListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ToolListPageAsync].
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

    /** A builder for [ToolListPageAsync]. */
    class Builder internal constructor() {

        private var service: ToolServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ToolListParams? = null
        private var response: ToolListPageResponse? = null

        @JvmSynthetic
        internal fun from(toolListPageAsync: ToolListPageAsync) = apply {
            service = toolListPageAsync.service
            streamHandlerExecutor = toolListPageAsync.streamHandlerExecutor
            params = toolListPageAsync.params
            response = toolListPageAsync.response
        }

        fun service(service: ToolServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ToolListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ToolListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ToolListPageAsync].
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
        fun build(): ToolListPageAsync =
            ToolListPageAsync(
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

        return other is ToolListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ToolListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
