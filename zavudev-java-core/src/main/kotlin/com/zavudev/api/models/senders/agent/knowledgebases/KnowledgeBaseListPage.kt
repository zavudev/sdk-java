// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.knowledgebases

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.senders.agent.KnowledgeBaseService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see KnowledgeBaseService.list */
class KnowledgeBaseListPage
private constructor(
    private val service: KnowledgeBaseService,
    private val params: KnowledgeBaseListParams,
    private val response: KnowledgeBaseListPageResponse,
) : Page<AgentKnowledgeBase> {

    /**
     * Delegates to [KnowledgeBaseListPageResponse], but gracefully handles missing data.
     *
     * @see KnowledgeBaseListPageResponse.items
     */
    override fun items(): List<AgentKnowledgeBase> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [KnowledgeBaseListPageResponse], but gracefully handles missing data.
     *
     * @see KnowledgeBaseListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): KnowledgeBaseListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): KnowledgeBaseListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AgentKnowledgeBase> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): KnowledgeBaseListParams = params

    /** The response that this page was parsed from. */
    fun response(): KnowledgeBaseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KnowledgeBaseListPage].
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

    /** A builder for [KnowledgeBaseListPage]. */
    class Builder internal constructor() {

        private var service: KnowledgeBaseService? = null
        private var params: KnowledgeBaseListParams? = null
        private var response: KnowledgeBaseListPageResponse? = null

        @JvmSynthetic
        internal fun from(knowledgeBaseListPage: KnowledgeBaseListPage) = apply {
            service = knowledgeBaseListPage.service
            params = knowledgeBaseListPage.params
            response = knowledgeBaseListPage.response
        }

        fun service(service: KnowledgeBaseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: KnowledgeBaseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: KnowledgeBaseListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [KnowledgeBaseListPage].
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
        fun build(): KnowledgeBaseListPage =
            KnowledgeBaseListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KnowledgeBaseListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "KnowledgeBaseListPage{service=$service, params=$params, response=$response}"
}
