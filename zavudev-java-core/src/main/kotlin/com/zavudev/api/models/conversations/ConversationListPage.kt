// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.ConversationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ConversationService.list */
class ConversationListPage
private constructor(
    private val service: ConversationService,
    private val params: ConversationListParams,
    private val response: ConversationListPageResponse,
) : Page<ConversationListResponse> {

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

    override fun nextPage(): ConversationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ConversationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConversationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ConversationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConversationListPage].
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

    /** A builder for [ConversationListPage]. */
    class Builder internal constructor() {

        private var service: ConversationService? = null
        private var params: ConversationListParams? = null
        private var response: ConversationListPageResponse? = null

        @JvmSynthetic
        internal fun from(conversationListPage: ConversationListPage) = apply {
            service = conversationListPage.service
            params = conversationListPage.params
            response = conversationListPage.response
        }

        fun service(service: ConversationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConversationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConversationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ConversationListPage].
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
        fun build(): ConversationListPage =
            ConversationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ConversationListPage{service=$service, params=$params, response=$response}"
}
