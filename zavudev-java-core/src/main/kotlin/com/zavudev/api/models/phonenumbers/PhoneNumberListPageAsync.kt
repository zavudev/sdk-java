// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.phonenumbers

import com.zavudev.api.core.AutoPagerAsync
import com.zavudev.api.core.PageAsync
import com.zavudev.api.core.checkRequired
import com.zavudev.api.services.async.PhoneNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberServiceAsync.list */
class PhoneNumberListPageAsync
private constructor(
    private val service: PhoneNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhoneNumberListParams,
    private val response: PhoneNumberListPageResponse,
) : PageAsync<OwnedPhoneNumber> {

    /**
     * Delegates to [PhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberListPageResponse.items
     */
    override fun items(): List<OwnedPhoneNumber> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("nextCursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): PhoneNumberListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PhoneNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OwnedPhoneNumber> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberListPageAsync].
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

    /** A builder for [PhoneNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhoneNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhoneNumberListParams? = null
        private var response: PhoneNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberListPageAsync: PhoneNumberListPageAsync) = apply {
            service = phoneNumberListPageAsync.service
            streamHandlerExecutor = phoneNumberListPageAsync.streamHandlerExecutor
            params = phoneNumberListPageAsync.params
            response = phoneNumberListPageAsync.response
        }

        fun service(service: PhoneNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhoneNumberListPageAsync].
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
        fun build(): PhoneNumberListPageAsync =
            PhoneNumberListPageAsync(
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

        return other is PhoneNumberListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PhoneNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
