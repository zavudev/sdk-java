// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.urls

import com.zavudev.api.core.AutoPager
import com.zavudev.api.core.Page
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.blocking.UrlService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see UrlService.listVerified */
class UrlListVerifiedPage
private constructor(
    private val service: UrlService,
    private val params: UrlListVerifiedParams,
    private val response: UrlListVerifiedPageResponse,
) : Page<VerifiedUrl> {

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

    override fun nextPage(): UrlListVerifiedPage = service.listVerified(nextPageParams())

    fun autoPager(): AutoPager<VerifiedUrl> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UrlListVerifiedParams = params

    /** The response that this page was parsed from. */
    fun response(): UrlListVerifiedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UrlListVerifiedPage].
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

    /** A builder for [UrlListVerifiedPage]. */
    class Builder internal constructor() {

        private var service: UrlService? = null
        private var params: UrlListVerifiedParams? = null
        private var response: UrlListVerifiedPageResponse? = null

        @JvmSynthetic
        internal fun from(urlListVerifiedPage: UrlListVerifiedPage) = apply {
            service = urlListVerifiedPage.service
            params = urlListVerifiedPage.params
            response = urlListVerifiedPage.response
        }

        fun service(service: UrlService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UrlListVerifiedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UrlListVerifiedPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UrlListVerifiedPage].
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
        fun build(): UrlListVerifiedPage =
            UrlListVerifiedPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UrlListVerifiedPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UrlListVerifiedPage{service=$service, params=$params, response=$response}"
}
