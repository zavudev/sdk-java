// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.balance.BalanceRetrieveParams
import com.zavudev.api.models.balance.BalanceRetrieveResponse
import java.util.function.Consumer

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService

    /**
     * Get balance for the API key's team. If the API key belongs to a sub-account, also includes
     * the sub-account's total spending and credit limit.
     */
    fun retrieve(): BalanceRetrieveResponse = retrieve(BalanceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: BalanceRetrieveParams = BalanceRetrieveParams.none()
    ): BalanceRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): BalanceRetrieveResponse =
        retrieve(BalanceRetrieveParams.none(), requestOptions)

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/balance`, but is otherwise the same as
         * [BalanceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<BalanceRetrieveResponse> =
            retrieve(BalanceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceRetrieveParams = BalanceRetrieveParams.none()
        ): HttpResponseFor<BalanceRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<BalanceRetrieveResponse> =
            retrieve(BalanceRetrieveParams.none(), requestOptions)
    }
}
