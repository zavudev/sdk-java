// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.ConversationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ConversationServiceAsync.list */
class ConversationListPageAsync
private constructor(
    private val service: ConversationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ConversationListParams,
    private val response: ConversationListPageResponse,
) : PageAsync<ConversationListResponse> {

    /**
     * Delegates to [ConversationListPageResponse], but gracefully handles missing data.
     *
     * @see ConversationListPageResponse.items
     */
    override fun items(): List<ConversationListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConversationListPageResponse], but gracefully handles missing data.
     *
     * @see ConversationListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ConversationListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ConversationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ConversationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ConversationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ConversationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConversationListPageAsync].
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

    /** A builder for [ConversationListPageAsync]. */
    class Builder internal constructor() {

        private var service: ConversationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ConversationListParams? = null
        private var response: ConversationListPageResponse? = null

        @JvmSynthetic
        internal fun from(conversationListPageAsync: ConversationListPageAsync) = apply {
            service = conversationListPageAsync.service
            streamHandlerExecutor = conversationListPageAsync.streamHandlerExecutor
            params = conversationListPageAsync.params
            response = conversationListPageAsync.response
        }

        fun service(service: ConversationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ConversationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConversationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ConversationListPageAsync].
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
        fun build(): ConversationListPageAsync =
            ConversationListPageAsync(
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

        return other is ConversationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ConversationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
