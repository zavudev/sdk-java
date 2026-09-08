// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.urls.UrlEscalateParams
import com.zavudev.api.models.urls.UrlEscalateResponse
import com.zavudev.api.models.urls.UrlListVerifiedPageAsync
import com.zavudev.api.models.urls.UrlListVerifiedParams
import com.zavudev.api.models.urls.UrlRetrieveDetailsParams
import com.zavudev.api.models.urls.UrlRetrieveDetailsResponse
import com.zavudev.api.models.urls.UrlSubmitForVerificationParams
import com.zavudev.api.models.urls.UrlSubmitForVerificationResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UrlServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlServiceAsync

    /**
     * Request manual review of a rejected URL. Only URLs in 'rejected' status can be escalated; the
     * status then moves to 'escalated'.
     */
    fun escalate(urlId: String, params: UrlEscalateParams): CompletableFuture<UrlEscalateResponse> =
        escalate(urlId, params, RequestOptions.none())

    /** @see escalate */
    fun escalate(
        urlId: String,
        params: UrlEscalateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlEscalateResponse> =
        escalate(params.toBuilder().urlId(urlId).build(), requestOptions)

    /** @see escalate */
    fun escalate(params: UrlEscalateParams): CompletableFuture<UrlEscalateResponse> =
        escalate(params, RequestOptions.none())

    /** @see escalate */
    fun escalate(
        params: UrlEscalateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlEscalateResponse>

    /** List URLs that have been verified for this project. */
    fun listVerified(): CompletableFuture<UrlListVerifiedPageAsync> =
        listVerified(UrlListVerifiedParams.none())

    /** @see listVerified */
    fun listVerified(
        params: UrlListVerifiedParams = UrlListVerifiedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlListVerifiedPageAsync>

    /** @see listVerified */
    fun listVerified(
        params: UrlListVerifiedParams = UrlListVerifiedParams.none()
    ): CompletableFuture<UrlListVerifiedPageAsync> = listVerified(params, RequestOptions.none())

    /** @see listVerified */
    fun listVerified(requestOptions: RequestOptions): CompletableFuture<UrlListVerifiedPageAsync> =
        listVerified(UrlListVerifiedParams.none(), requestOptions)

    /** Get details of a specific verified URL. */
    fun retrieveDetails(urlId: String): CompletableFuture<UrlRetrieveDetailsResponse> =
        retrieveDetails(urlId, UrlRetrieveDetailsParams.none())

    /** @see retrieveDetails */
    fun retrieveDetails(
        urlId: String,
        params: UrlRetrieveDetailsParams = UrlRetrieveDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlRetrieveDetailsResponse> =
        retrieveDetails(params.toBuilder().urlId(urlId).build(), requestOptions)

    /** @see retrieveDetails */
    fun retrieveDetails(
        urlId: String,
        params: UrlRetrieveDetailsParams = UrlRetrieveDetailsParams.none(),
    ): CompletableFuture<UrlRetrieveDetailsResponse> =
        retrieveDetails(urlId, params, RequestOptions.none())

    /** @see retrieveDetails */
    fun retrieveDetails(
        params: UrlRetrieveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlRetrieveDetailsResponse>

    /** @see retrieveDetails */
    fun retrieveDetails(
        params: UrlRetrieveDetailsParams
    ): CompletableFuture<UrlRetrieveDetailsResponse> =
        retrieveDetails(params, RequestOptions.none())

    /** @see retrieveDetails */
    fun retrieveDetails(
        urlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UrlRetrieveDetailsResponse> =
        retrieveDetails(urlId, UrlRetrieveDetailsParams.none(), requestOptions)

    /**
     * Submit a URL for verification. URLs are automatically checked against Google Web Risk API.
     * Safe URLs are auto-approved, malicious URLs are blocked. URL shorteners (bit.ly, t.co, etc.)
     * are always blocked.
     *
     * **Important:** All SMS and Email messages containing URLs require those URLs to be verified
     * before the message can be sent. This endpoint allows pre-verification of URLs.
     */
    fun submitForVerification(
        params: UrlSubmitForVerificationParams
    ): CompletableFuture<UrlSubmitForVerificationResponse> =
        submitForVerification(params, RequestOptions.none())

    /** @see submitForVerification */
    fun submitForVerification(
        params: UrlSubmitForVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlSubmitForVerificationResponse>

    /** A view of [UrlServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/urls/{urlId}/escalate`, but is otherwise the
         * same as [UrlServiceAsync.escalate].
         */
        fun escalate(
            urlId: String,
            params: UrlEscalateParams,
        ): CompletableFuture<HttpResponseFor<UrlEscalateResponse>> =
            escalate(urlId, params, RequestOptions.none())

        /** @see escalate */
        fun escalate(
            urlId: String,
            params: UrlEscalateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlEscalateResponse>> =
            escalate(params.toBuilder().urlId(urlId).build(), requestOptions)

        /** @see escalate */
        fun escalate(
            params: UrlEscalateParams
        ): CompletableFuture<HttpResponseFor<UrlEscalateResponse>> =
            escalate(params, RequestOptions.none())

        /** @see escalate */
        fun escalate(
            params: UrlEscalateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlEscalateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/urls`, but is otherwise the same as
         * [UrlServiceAsync.listVerified].
         */
        fun listVerified(): CompletableFuture<HttpResponseFor<UrlListVerifiedPageAsync>> =
            listVerified(UrlListVerifiedParams.none())

        /** @see listVerified */
        fun listVerified(
            params: UrlListVerifiedParams = UrlListVerifiedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlListVerifiedPageAsync>>

        /** @see listVerified */
        fun listVerified(
            params: UrlListVerifiedParams = UrlListVerifiedParams.none()
        ): CompletableFuture<HttpResponseFor<UrlListVerifiedPageAsync>> =
            listVerified(params, RequestOptions.none())

        /** @see listVerified */
        fun listVerified(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UrlListVerifiedPageAsync>> =
            listVerified(UrlListVerifiedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/urls/{urlId}`, but is otherwise the same as
         * [UrlServiceAsync.retrieveDetails].
         */
        fun retrieveDetails(
            urlId: String
        ): CompletableFuture<HttpResponseFor<UrlRetrieveDetailsResponse>> =
            retrieveDetails(urlId, UrlRetrieveDetailsParams.none())

        /** @see retrieveDetails */
        fun retrieveDetails(
            urlId: String,
            params: UrlRetrieveDetailsParams = UrlRetrieveDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlRetrieveDetailsResponse>> =
            retrieveDetails(params.toBuilder().urlId(urlId).build(), requestOptions)

        /** @see retrieveDetails */
        fun retrieveDetails(
            urlId: String,
            params: UrlRetrieveDetailsParams = UrlRetrieveDetailsParams.none(),
        ): CompletableFuture<HttpResponseFor<UrlRetrieveDetailsResponse>> =
            retrieveDetails(urlId, params, RequestOptions.none())

        /** @see retrieveDetails */
        fun retrieveDetails(
            params: UrlRetrieveDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlRetrieveDetailsResponse>>

        /** @see retrieveDetails */
        fun retrieveDetails(
            params: UrlRetrieveDetailsParams
        ): CompletableFuture<HttpResponseFor<UrlRetrieveDetailsResponse>> =
            retrieveDetails(params, RequestOptions.none())

        /** @see retrieveDetails */
        fun retrieveDetails(
            urlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlRetrieveDetailsResponse>> =
            retrieveDetails(urlId, UrlRetrieveDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/urls`, but is otherwise the same as
         * [UrlServiceAsync.submitForVerification].
         */
        fun submitForVerification(
            params: UrlSubmitForVerificationParams
        ): CompletableFuture<HttpResponseFor<UrlSubmitForVerificationResponse>> =
            submitForVerification(params, RequestOptions.none())

        /** @see submitForVerification */
        fun submitForVerification(
            params: UrlSubmitForVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlSubmitForVerificationResponse>>
    }
}
