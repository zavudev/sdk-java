// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.urls.UrlEscalateParams
import com.zavudev.api.models.urls.UrlEscalateResponse
import com.zavudev.api.models.urls.UrlListVerifiedPage
import com.zavudev.api.models.urls.UrlListVerifiedParams
import com.zavudev.api.models.urls.UrlRetrieveDetailsParams
import com.zavudev.api.models.urls.UrlRetrieveDetailsResponse
import com.zavudev.api.models.urls.UrlSubmitForVerificationParams
import com.zavudev.api.models.urls.UrlSubmitForVerificationResponse
import java.util.function.Consumer

interface UrlService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlService

    /**
     * Request manual review of a rejected URL. Only URLs in 'rejected' status can be escalated; the
     * status then moves to 'escalated'.
     */
    fun escalate(urlId: String, params: UrlEscalateParams): UrlEscalateResponse =
        escalate(urlId, params, RequestOptions.none())

    /** @see escalate */
    fun escalate(
        urlId: String,
        params: UrlEscalateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlEscalateResponse = escalate(params.toBuilder().urlId(urlId).build(), requestOptions)

    /** @see escalate */
    fun escalate(params: UrlEscalateParams): UrlEscalateResponse =
        escalate(params, RequestOptions.none())

    /** @see escalate */
    fun escalate(
        params: UrlEscalateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlEscalateResponse

    /** List URLs that have been verified for this project. */
    fun listVerified(): UrlListVerifiedPage = listVerified(UrlListVerifiedParams.none())

    /** @see listVerified */
    fun listVerified(
        params: UrlListVerifiedParams = UrlListVerifiedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlListVerifiedPage

    /** @see listVerified */
    fun listVerified(
        params: UrlListVerifiedParams = UrlListVerifiedParams.none()
    ): UrlListVerifiedPage = listVerified(params, RequestOptions.none())

    /** @see listVerified */
    fun listVerified(requestOptions: RequestOptions): UrlListVerifiedPage =
        listVerified(UrlListVerifiedParams.none(), requestOptions)

    /** Get details of a specific verified URL. */
    fun retrieveDetails(urlId: String): UrlRetrieveDetailsResponse =
        retrieveDetails(urlId, UrlRetrieveDetailsParams.none())

    /** @see retrieveDetails */
    fun retrieveDetails(
        urlId: String,
        params: UrlRetrieveDetailsParams = UrlRetrieveDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlRetrieveDetailsResponse =
        retrieveDetails(params.toBuilder().urlId(urlId).build(), requestOptions)

    /** @see retrieveDetails */
    fun retrieveDetails(
        urlId: String,
        params: UrlRetrieveDetailsParams = UrlRetrieveDetailsParams.none(),
    ): UrlRetrieveDetailsResponse = retrieveDetails(urlId, params, RequestOptions.none())

    /** @see retrieveDetails */
    fun retrieveDetails(
        params: UrlRetrieveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlRetrieveDetailsResponse

    /** @see retrieveDetails */
    fun retrieveDetails(params: UrlRetrieveDetailsParams): UrlRetrieveDetailsResponse =
        retrieveDetails(params, RequestOptions.none())

    /** @see retrieveDetails */
    fun retrieveDetails(urlId: String, requestOptions: RequestOptions): UrlRetrieveDetailsResponse =
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
    ): UrlSubmitForVerificationResponse = submitForVerification(params, RequestOptions.none())

    /** @see submitForVerification */
    fun submitForVerification(
        params: UrlSubmitForVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlSubmitForVerificationResponse

    /** A view of [UrlService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/urls/{urlId}/escalate`, but is otherwise the
         * same as [UrlService.escalate].
         */
        @MustBeClosed
        fun escalate(
            urlId: String,
            params: UrlEscalateParams,
        ): HttpResponseFor<UrlEscalateResponse> = escalate(urlId, params, RequestOptions.none())

        /** @see escalate */
        @MustBeClosed
        fun escalate(
            urlId: String,
            params: UrlEscalateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlEscalateResponse> =
            escalate(params.toBuilder().urlId(urlId).build(), requestOptions)

        /** @see escalate */
        @MustBeClosed
        fun escalate(params: UrlEscalateParams): HttpResponseFor<UrlEscalateResponse> =
            escalate(params, RequestOptions.none())

        /** @see escalate */
        @MustBeClosed
        fun escalate(
            params: UrlEscalateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlEscalateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/urls`, but is otherwise the same as
         * [UrlService.listVerified].
         */
        @MustBeClosed
        fun listVerified(): HttpResponseFor<UrlListVerifiedPage> =
            listVerified(UrlListVerifiedParams.none())

        /** @see listVerified */
        @MustBeClosed
        fun listVerified(
            params: UrlListVerifiedParams = UrlListVerifiedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlListVerifiedPage>

        /** @see listVerified */
        @MustBeClosed
        fun listVerified(
            params: UrlListVerifiedParams = UrlListVerifiedParams.none()
        ): HttpResponseFor<UrlListVerifiedPage> = listVerified(params, RequestOptions.none())

        /** @see listVerified */
        @MustBeClosed
        fun listVerified(requestOptions: RequestOptions): HttpResponseFor<UrlListVerifiedPage> =
            listVerified(UrlListVerifiedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/urls/{urlId}`, but is otherwise the same as
         * [UrlService.retrieveDetails].
         */
        @MustBeClosed
        fun retrieveDetails(urlId: String): HttpResponseFor<UrlRetrieveDetailsResponse> =
            retrieveDetails(urlId, UrlRetrieveDetailsParams.none())

        /** @see retrieveDetails */
        @MustBeClosed
        fun retrieveDetails(
            urlId: String,
            params: UrlRetrieveDetailsParams = UrlRetrieveDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlRetrieveDetailsResponse> =
            retrieveDetails(params.toBuilder().urlId(urlId).build(), requestOptions)

        /** @see retrieveDetails */
        @MustBeClosed
        fun retrieveDetails(
            urlId: String,
            params: UrlRetrieveDetailsParams = UrlRetrieveDetailsParams.none(),
        ): HttpResponseFor<UrlRetrieveDetailsResponse> =
            retrieveDetails(urlId, params, RequestOptions.none())

        /** @see retrieveDetails */
        @MustBeClosed
        fun retrieveDetails(
            params: UrlRetrieveDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlRetrieveDetailsResponse>

        /** @see retrieveDetails */
        @MustBeClosed
        fun retrieveDetails(
            params: UrlRetrieveDetailsParams
        ): HttpResponseFor<UrlRetrieveDetailsResponse> =
            retrieveDetails(params, RequestOptions.none())

        /** @see retrieveDetails */
        @MustBeClosed
        fun retrieveDetails(
            urlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UrlRetrieveDetailsResponse> =
            retrieveDetails(urlId, UrlRetrieveDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/urls`, but is otherwise the same as
         * [UrlService.submitForVerification].
         */
        @MustBeClosed
        fun submitForVerification(
            params: UrlSubmitForVerificationParams
        ): HttpResponseFor<UrlSubmitForVerificationResponse> =
            submitForVerification(params, RequestOptions.none())

        /** @see submitForVerification */
        @MustBeClosed
        fun submitForVerification(
            params: UrlSubmitForVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlSubmitForVerificationResponse>
    }
}
