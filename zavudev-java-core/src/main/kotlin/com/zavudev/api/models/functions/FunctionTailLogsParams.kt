// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.zavudev.api.core.Params
import com.zavudev.api.core.http.Headers
import com.zavudev.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Fetch invocation logs for a function. Logs are paginated via `nextToken`. Pass `startTime` /
 * `endTime` (Unix epoch milliseconds) to bound the window, or `filterPattern` to filter messages.
 */
class FunctionTailLogsParams
private constructor(
    private val functionId: String?,
    private val endTime: Long?,
    private val filterPattern: String?,
    private val limit: Long?,
    private val nextToken: String?,
    private val startTime: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun functionId(): Optional<String> = Optional.ofNullable(functionId)

    /** End of the log window in Unix epoch milliseconds. */
    fun endTime(): Optional<Long> = Optional.ofNullable(endTime)

    fun filterPattern(): Optional<String> = Optional.ofNullable(filterPattern)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Start of the log window in Unix epoch milliseconds. */
    fun startTime(): Optional<Long> = Optional.ofNullable(startTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FunctionTailLogsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FunctionTailLogsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionTailLogsParams]. */
    class Builder internal constructor() {

        private var functionId: String? = null
        private var endTime: Long? = null
        private var filterPattern: String? = null
        private var limit: Long? = null
        private var nextToken: String? = null
        private var startTime: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(functionTailLogsParams: FunctionTailLogsParams) = apply {
            functionId = functionTailLogsParams.functionId
            endTime = functionTailLogsParams.endTime
            filterPattern = functionTailLogsParams.filterPattern
            limit = functionTailLogsParams.limit
            nextToken = functionTailLogsParams.nextToken
            startTime = functionTailLogsParams.startTime
            additionalHeaders = functionTailLogsParams.additionalHeaders.toBuilder()
            additionalQueryParams = functionTailLogsParams.additionalQueryParams.toBuilder()
        }

        fun functionId(functionId: String?) = apply { this.functionId = functionId }

        /** Alias for calling [Builder.functionId] with `functionId.orElse(null)`. */
        fun functionId(functionId: Optional<String>) = functionId(functionId.getOrNull())

        /** End of the log window in Unix epoch milliseconds. */
        fun endTime(endTime: Long?) = apply { this.endTime = endTime }

        /**
         * Alias for [Builder.endTime].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun endTime(endTime: Long) = endTime(endTime as Long?)

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<Long>) = endTime(endTime.getOrNull())

        fun filterPattern(filterPattern: String?) = apply { this.filterPattern = filterPattern }

        /** Alias for calling [Builder.filterPattern] with `filterPattern.orElse(null)`. */
        fun filterPattern(filterPattern: Optional<String>) =
            filterPattern(filterPattern.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Start of the log window in Unix epoch milliseconds. */
        fun startTime(startTime: Long?) = apply { this.startTime = startTime }

        /**
         * Alias for [Builder.startTime].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun startTime(startTime: Long) = startTime(startTime as Long?)

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<Long>) = startTime(startTime.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [FunctionTailLogsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FunctionTailLogsParams =
            FunctionTailLogsParams(
                functionId,
                endTime,
                filterPattern,
                limit,
                nextToken,
                startTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> functionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endTime?.let { put("endTime", it.toString()) }
                filterPattern?.let { put("filterPattern", it) }
                limit?.let { put("limit", it.toString()) }
                nextToken?.let { put("nextToken", it) }
                startTime?.let { put("startTime", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FunctionTailLogsParams &&
            functionId == other.functionId &&
            endTime == other.endTime &&
            filterPattern == other.filterPattern &&
            limit == other.limit &&
            nextToken == other.nextToken &&
            startTime == other.startTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            functionId,
            endTime,
            filterPattern,
            limit,
            nextToken,
            startTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FunctionTailLogsParams{functionId=$functionId, endTime=$endTime, filterPattern=$filterPattern, limit=$limit, nextToken=$nextToken, startTime=$startTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
