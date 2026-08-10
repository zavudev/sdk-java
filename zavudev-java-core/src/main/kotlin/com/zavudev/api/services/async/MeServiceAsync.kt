// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.me.MeRetrieveParams
import com.zavudev.api.models.me.MeRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync

    /**
     * Returns the project, team, and API key metadata bound to the current Bearer token. Used by
     * CLIs and SDKs to confirm which project they will operate on.
     */
    fun retrieve(): CompletableFuture<MeRetrieveResponse> = retrieve(MeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none()
    ): CompletableFuture<MeRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<MeRetrieveResponse> =
        retrieve(MeRetrieveParams.none(), requestOptions)

    /** A view of [MeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/me`, but is otherwise the same as
         * [MeServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(MeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MeRetrieveResponse>> =
            retrieve(MeRetrieveParams.none(), requestOptions)
    }
}
