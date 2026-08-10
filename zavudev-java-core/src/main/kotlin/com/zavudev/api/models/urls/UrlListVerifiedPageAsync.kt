// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.UrlServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see UrlServiceAsync.listVerified */
class UrlListVerifiedPageAsync
private constructor(
    private val service: UrlServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UrlListVerifiedParams,
    private val response: UrlListVerifiedPageResponse,
) : PageAsync<VerifiedUrl> {

    /**
     * Delegates to [UrlListVerifiedPageResponse], but gracefully handles missing data.
     *
     * @see UrlListVerifiedPageResponse.items
     */
    override fun items(): List<VerifiedUrl> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [UrlListVerifiedPageResponse], but gracefully handles missing data.
     *
     * @see UrlListVerifiedPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): UrlListVerifiedParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<UrlListVerifiedPageAsync> =
        service.listVerified(nextPageParams())

    fun autoPager(): AutoPagerAsync<VerifiedUrl> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UrlListVerifiedParams = params

    /** The response that this page was parsed from. */
    fun response(): UrlListVerifiedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UrlListVerifiedPageAsync].
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

    /** A builder for [UrlListVerifiedPageAsync]. */
    class Builder internal constructor() {

        private var service: UrlServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UrlListVerifiedParams? = null
        private var response: UrlListVerifiedPageResponse? = null

        @JvmSynthetic
        internal fun from(urlListVerifiedPageAsync: UrlListVerifiedPageAsync) = apply {
            service = urlListVerifiedPageAsync.service
            streamHandlerExecutor = urlListVerifiedPageAsync.streamHandlerExecutor
            params = urlListVerifiedPageAsync.params
            response = urlListVerifiedPageAsync.response
        }

        fun service(service: UrlServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UrlListVerifiedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UrlListVerifiedPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UrlListVerifiedPageAsync].
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
        fun build(): UrlListVerifiedPageAsync =
            UrlListVerifiedPageAsync(
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

        return other is UrlListVerifiedPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UrlListVerifiedPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
