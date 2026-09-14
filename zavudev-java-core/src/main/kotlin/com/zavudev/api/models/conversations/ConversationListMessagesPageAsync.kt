// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.models.messages.Message
import com.zavudev.api.services.async.ConversationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ConversationServiceAsync.listMessages */
class ConversationListMessagesPageAsync
private constructor(
    private val service: ConversationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ConversationListMessagesParams,
    private val response: ConversationListMessagesPageResponse,
) : PageAsync<Message> {

    /**
     * Delegates to [ConversationListMessagesPageResponse], but gracefully handles missing data.
     *
     * @see ConversationListMessagesPageResponse.items
     */
    override fun items(): List<Message> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConversationListMessagesPageResponse], but gracefully handles missing data.
     *
     * @see ConversationListMessagesPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ConversationListMessagesParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ConversationListMessagesPageAsync> =
        service.listMessages(nextPageParams())

    fun autoPager(): AutoPagerAsync<Message> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ConversationListMessagesParams = params

    /** The response that this page was parsed from. */
    fun response(): ConversationListMessagesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConversationListMessagesPageAsync].
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

    /** A builder for [ConversationListMessagesPageAsync]. */
    class Builder internal constructor() {

        private var service: ConversationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ConversationListMessagesParams? = null
        private var response: ConversationListMessagesPageResponse? = null

        @JvmSynthetic
        internal fun from(conversationListMessagesPageAsync: ConversationListMessagesPageAsync) =
            apply {
                service = conversationListMessagesPageAsync.service
                streamHandlerExecutor = conversationListMessagesPageAsync.streamHandlerExecutor
                params = conversationListMessagesPageAsync.params
                response = conversationListMessagesPageAsync.response
            }

        fun service(service: ConversationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ConversationListMessagesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConversationListMessagesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ConversationListMessagesPageAsync].
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
        fun build(): ConversationListMessagesPageAsync =
            ConversationListMessagesPageAsync(
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

        return other is ConversationListMessagesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ConversationListMessagesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
