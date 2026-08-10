// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.number10dlc.campaigns

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.number10dlc.CampaignServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CampaignServiceAsync.list */
class CampaignListPageAsync
private constructor(
    private val service: CampaignServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CampaignListParams,
    private val response: CampaignListPageResponse,
) : PageAsync<TenDlcCampaign> {

    /**
     * Delegates to [CampaignListPageResponse], but gracefully handles missing data.
     *
     * @see CampaignListPageResponse.items
     */
    override fun items(): List<TenDlcCampaign> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [CampaignListPageResponse], but gracefully handles missing data.
     *
     * @see CampaignListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CampaignListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CampaignListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TenDlcCampaign> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): CampaignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CampaignListPageAsync].
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

    /** A builder for [CampaignListPageAsync]. */
    class Builder internal constructor() {

        private var service: CampaignServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CampaignListParams? = null
        private var response: CampaignListPageResponse? = null

        @JvmSynthetic
        internal fun from(campaignListPageAsync: CampaignListPageAsync) = apply {
            service = campaignListPageAsync.service
            streamHandlerExecutor = campaignListPageAsync.streamHandlerExecutor
            params = campaignListPageAsync.params
            response = campaignListPageAsync.response
        }

        fun service(service: CampaignServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CampaignListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CampaignListPageAsync].
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
        fun build(): CampaignListPageAsync =
            CampaignListPageAsync(
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

        return other is CampaignListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CampaignListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
