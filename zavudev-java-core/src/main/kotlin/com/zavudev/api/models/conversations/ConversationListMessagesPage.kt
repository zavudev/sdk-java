// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.models.messages.Message
import com.zavudev.api.services.blocking.ConversationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ConversationService.listMessages */
class ConversationListMessagesPage
private constructor(
    private val service: ConversationService,
    private val params: ConversationListMessagesParams,
    private val response: ConversationListMessagesPageResponse,
) : Page<Message> {

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

    override fun nextPage(): ConversationListMessagesPage = service.listMessages(nextPageParams())

    fun autoPager(): AutoPager<Message> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConversationListMessagesParams = params

    /** The response that this page was parsed from. */
    fun response(): ConversationListMessagesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConversationListMessagesPage].
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

    /** A builder for [ConversationListMessagesPage]. */
    class Builder internal constructor() {

        private var service: ConversationService? = null
        private var params: ConversationListMessagesParams? = null
        private var response: ConversationListMessagesPageResponse? = null

        @JvmSynthetic
        internal fun from(conversationListMessagesPage: ConversationListMessagesPage) = apply {
            service = conversationListMessagesPage.service
            params = conversationListMessagesPage.params
            response = conversationListMessagesPage.response
        }

        fun service(service: ConversationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConversationListMessagesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConversationListMessagesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ConversationListMessagesPage].
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
        fun build(): ConversationListMessagesPage =
            ConversationListMessagesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationListMessagesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ConversationListMessagesPage{service=$service, params=$params, response=$response}"
}
