// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.broadcasts.BroadcastCancelParams
import com.zavudev.api.models.broadcasts.BroadcastCancelResponse
import com.zavudev.api.models.broadcasts.BroadcastCreateParams
import com.zavudev.api.models.broadcasts.BroadcastCreateResponse
import com.zavudev.api.models.broadcasts.BroadcastDeleteParams
import com.zavudev.api.models.broadcasts.BroadcastEscalateReviewParams
import com.zavudev.api.models.broadcasts.BroadcastEscalateReviewResponse
import com.zavudev.api.models.broadcasts.BroadcastListPage
import com.zavudev.api.models.broadcasts.BroadcastListParams
import com.zavudev.api.models.broadcasts.BroadcastProgress
import com.zavudev.api.models.broadcasts.BroadcastProgressParams
import com.zavudev.api.models.broadcasts.BroadcastRescheduleParams
import com.zavudev.api.models.broadcasts.BroadcastRescheduleResponse
import com.zavudev.api.models.broadcasts.BroadcastRetrieveParams
import com.zavudev.api.models.broadcasts.BroadcastRetrieveResponse
import com.zavudev.api.models.broadcasts.BroadcastRetryReviewParams
import com.zavudev.api.models.broadcasts.BroadcastRetryReviewResponse
import com.zavudev.api.models.broadcasts.BroadcastSendParams
import com.zavudev.api.models.broadcasts.BroadcastSendResponse
import com.zavudev.api.models.broadcasts.BroadcastUpdateParams
import com.zavudev.api.models.broadcasts.BroadcastUpdateResponse
import com.zavudev.api.services.blocking.broadcasts.ContactService
import java.util.function.Consumer

interface BroadcastService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService

    fun contacts(): ContactService

    /** Create a new broadcast campaign. Add contacts after creation, then send. */
    fun create(params: BroadcastCreateParams): BroadcastCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastCreateResponse

    /** Get broadcast */
    fun retrieve(broadcastId: String): BroadcastRetrieveResponse =
        retrieve(broadcastId, BroadcastRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastRetrieveResponse =
        retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
    ): BroadcastRetrieveResponse = retrieve(broadcastId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BroadcastRetrieveParams): BroadcastRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(broadcastId: String, requestOptions: RequestOptions): BroadcastRetrieveResponse =
        retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

    /** Update a broadcast in draft status. */
    fun update(broadcastId: String): BroadcastUpdateResponse =
        update(broadcastId, BroadcastUpdateParams.none())

    /** @see update */
    fun update(
        broadcastId: String,
        params: BroadcastUpdateParams = BroadcastUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastUpdateResponse =
        update(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see update */
    fun update(
        broadcastId: String,
        params: BroadcastUpdateParams = BroadcastUpdateParams.none(),
    ): BroadcastUpdateResponse = update(broadcastId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastUpdateResponse

    /** @see update */
    fun update(params: BroadcastUpdateParams): BroadcastUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(broadcastId: String, requestOptions: RequestOptions): BroadcastUpdateResponse =
        update(broadcastId, BroadcastUpdateParams.none(), requestOptions)

    /** List broadcasts for this project. */
    fun list(): BroadcastListPage = list(BroadcastListParams.none())

    /** @see list */
    fun list(
        params: BroadcastListParams = BroadcastListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastListPage

    /** @see list */
    fun list(params: BroadcastListParams = BroadcastListParams.none()): BroadcastListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BroadcastListPage =
        list(BroadcastListParams.none(), requestOptions)

    /** Delete a broadcast in draft status. */
    fun delete(broadcastId: String) = delete(broadcastId, BroadcastDeleteParams.none())

    /** @see delete */
    fun delete(
        broadcastId: String,
        params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see delete */
    fun delete(broadcastId: String, params: BroadcastDeleteParams = BroadcastDeleteParams.none()) =
        delete(broadcastId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BroadcastDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: BroadcastDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(broadcastId: String, requestOptions: RequestOptions) =
        delete(broadcastId, BroadcastDeleteParams.none(), requestOptions)

    /**
     * Cancel a broadcast. Pending contacts will be skipped, but already queued messages may still
     * be delivered.
     */
    fun cancel(broadcastId: String): BroadcastCancelResponse =
        cancel(broadcastId, BroadcastCancelParams.none())

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        params: BroadcastCancelParams = BroadcastCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastCancelResponse =
        cancel(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        params: BroadcastCancelParams = BroadcastCancelParams.none(),
    ): BroadcastCancelResponse = cancel(broadcastId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: BroadcastCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastCancelResponse

    /** @see cancel */
    fun cancel(params: BroadcastCancelParams): BroadcastCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(broadcastId: String, requestOptions: RequestOptions): BroadcastCancelResponse =
        cancel(broadcastId, BroadcastCancelParams.none(), requestOptions)

    /**
     * Request manual review by the Zavu team for a rejected broadcast. Use this after automated
     * review rejection if you believe the content is legitimate.
     */
    fun escalateReview(broadcastId: String): BroadcastEscalateReviewResponse =
        escalateReview(broadcastId, BroadcastEscalateReviewParams.none())

    /** @see escalateReview */
    fun escalateReview(
        broadcastId: String,
        params: BroadcastEscalateReviewParams = BroadcastEscalateReviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastEscalateReviewResponse =
        escalateReview(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see escalateReview */
    fun escalateReview(
        broadcastId: String,
        params: BroadcastEscalateReviewParams = BroadcastEscalateReviewParams.none(),
    ): BroadcastEscalateReviewResponse = escalateReview(broadcastId, params, RequestOptions.none())

    /** @see escalateReview */
    fun escalateReview(
        params: BroadcastEscalateReviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastEscalateReviewResponse

    /** @see escalateReview */
    fun escalateReview(params: BroadcastEscalateReviewParams): BroadcastEscalateReviewResponse =
        escalateReview(params, RequestOptions.none())

    /** @see escalateReview */
    fun escalateReview(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): BroadcastEscalateReviewResponse =
        escalateReview(broadcastId, BroadcastEscalateReviewParams.none(), requestOptions)

    /**
     * Get real-time progress of a broadcast including delivery counts and estimated completion
     * time.
     */
    fun progress(broadcastId: String): BroadcastProgress =
        progress(broadcastId, BroadcastProgressParams.none())

    /** @see progress */
    fun progress(
        broadcastId: String,
        params: BroadcastProgressParams = BroadcastProgressParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastProgress =
        progress(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see progress */
    fun progress(
        broadcastId: String,
        params: BroadcastProgressParams = BroadcastProgressParams.none(),
    ): BroadcastProgress = progress(broadcastId, params, RequestOptions.none())

    /** @see progress */
    fun progress(
        params: BroadcastProgressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastProgress

    /** @see progress */
    fun progress(params: BroadcastProgressParams): BroadcastProgress =
        progress(params, RequestOptions.none())

    /** @see progress */
    fun progress(broadcastId: String, requestOptions: RequestOptions): BroadcastProgress =
        progress(broadcastId, BroadcastProgressParams.none(), requestOptions)

    /** Update the scheduled time for a broadcast. The broadcast must be in scheduled status. */
    fun reschedule(
        broadcastId: String,
        params: BroadcastRescheduleParams,
    ): BroadcastRescheduleResponse = reschedule(broadcastId, params, RequestOptions.none())

    /** @see reschedule */
    fun reschedule(
        broadcastId: String,
        params: BroadcastRescheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastRescheduleResponse =
        reschedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see reschedule */
    fun reschedule(params: BroadcastRescheduleParams): BroadcastRescheduleResponse =
        reschedule(params, RequestOptions.none())

    /** @see reschedule */
    fun reschedule(
        params: BroadcastRescheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastRescheduleResponse

    /**
     * Resubmit a rejected broadcast for AI review after editing content. Maximum 3 review attempts
     * allowed per broadcast.
     */
    fun retryReview(broadcastId: String): BroadcastRetryReviewResponse =
        retryReview(broadcastId, BroadcastRetryReviewParams.none())

    /** @see retryReview */
    fun retryReview(
        broadcastId: String,
        params: BroadcastRetryReviewParams = BroadcastRetryReviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastRetryReviewResponse =
        retryReview(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retryReview */
    fun retryReview(
        broadcastId: String,
        params: BroadcastRetryReviewParams = BroadcastRetryReviewParams.none(),
    ): BroadcastRetryReviewResponse = retryReview(broadcastId, params, RequestOptions.none())

    /** @see retryReview */
    fun retryReview(
        params: BroadcastRetryReviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastRetryReviewResponse

    /** @see retryReview */
    fun retryReview(params: BroadcastRetryReviewParams): BroadcastRetryReviewResponse =
        retryReview(params, RequestOptions.none())

    /** @see retryReview */
    fun retryReview(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): BroadcastRetryReviewResponse =
        retryReview(broadcastId, BroadcastRetryReviewParams.none(), requestOptions)

    /**
     * Start sending the broadcast immediately or schedule for later.
     *
     * **Verification is required to send, except on WhatsApp.** On every channel other than
     * `whatsapp`, the team must have completed both identity verification (KYC) and business
     * verification (KYB); passing one is not enough. A `whatsapp` broadcast requires neither: it
     * can only be built on a template, and Meta vets the business and the content when it approves
     * that template, so an unapproved template is refused instead. `smart` is not exempt — it can
     * route a contact to SMS or email. Drafts can be created, edited and kept without any check.
     * Every send path — dashboard, API and CLI alike — enforces the same rule, returning `403` with
     * code `kyc_required` or `kyb_required` for whichever is outstanding.
     *
     * **Review depends on the channel, and cannot be bypassed.** A draft is submitted to automated
     * content review here; it does not go straight out. A WhatsApp broadcast built on a
     * Meta-approved template skips review (Meta already vetted the content) and begins sending. An
     * email broadcast sends as soon as the automated review passes. Every other channel moves to
     * `pending_admin_review` and waits for a person. If the review rejects it, use PATCH to edit
     * the content then call POST /retry-review.
     *
     * Calling this on a broadcast that is already `approved` or `scheduled` sends or reschedules it
     * directly, since it has already been reviewed. Reserves the estimated cost from your balance.
     */
    fun send(broadcastId: String): BroadcastSendResponse =
        send(broadcastId, BroadcastSendParams.none())

    /** @see send */
    fun send(
        broadcastId: String,
        params: BroadcastSendParams = BroadcastSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastSendResponse =
        send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see send */
    fun send(
        broadcastId: String,
        params: BroadcastSendParams = BroadcastSendParams.none(),
    ): BroadcastSendResponse = send(broadcastId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastSendResponse

    /** @see send */
    fun send(params: BroadcastSendParams): BroadcastSendResponse =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(broadcastId: String, requestOptions: RequestOptions): BroadcastSendResponse =
        send(broadcastId, BroadcastSendParams.none(), requestOptions)

    /** A view of [BroadcastService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService.WithRawResponse

        fun contacts(): ContactService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts`, but is otherwise the same as
         * [BroadcastService.create].
         */
        @MustBeClosed
        fun create(params: BroadcastCreateParams): HttpResponseFor<BroadcastCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/broadcasts/{broadcastId}`, but is otherwise the
         * same as [BroadcastService.retrieve].
         */
        @MustBeClosed
        fun retrieve(broadcastId: String): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(broadcastId, BroadcastRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        ): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(broadcastId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BroadcastRetrieveParams): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/broadcasts/{broadcastId}`, but is otherwise
         * the same as [BroadcastService.update].
         */
        @MustBeClosed
        fun update(broadcastId: String): HttpResponseFor<BroadcastUpdateResponse> =
            update(broadcastId, BroadcastUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            broadcastId: String,
            params: BroadcastUpdateParams = BroadcastUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastUpdateResponse> =
            update(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            broadcastId: String,
            params: BroadcastUpdateParams = BroadcastUpdateParams.none(),
        ): HttpResponseFor<BroadcastUpdateResponse> =
            update(broadcastId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: BroadcastUpdateParams): HttpResponseFor<BroadcastUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastUpdateResponse> =
            update(broadcastId, BroadcastUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/broadcasts`, but is otherwise the same as
         * [BroadcastService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BroadcastListPage> = list(BroadcastListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BroadcastListParams = BroadcastListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BroadcastListParams = BroadcastListParams.none()
        ): HttpResponseFor<BroadcastListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BroadcastListPage> =
            list(BroadcastListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/broadcasts/{broadcastId}`, but is otherwise
         * the same as [BroadcastService.delete].
         */
        @MustBeClosed
        fun delete(broadcastId: String): HttpResponse =
            delete(broadcastId, BroadcastDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            broadcastId: String,
            params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            broadcastId: String,
            params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
        ): HttpResponse = delete(broadcastId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BroadcastDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BroadcastDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(broadcastId: String, requestOptions: RequestOptions): HttpResponse =
            delete(broadcastId, BroadcastDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/cancel`, but is
         * otherwise the same as [BroadcastService.cancel].
         */
        @MustBeClosed
        fun cancel(broadcastId: String): HttpResponseFor<BroadcastCancelResponse> =
            cancel(broadcastId, BroadcastCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            broadcastId: String,
            params: BroadcastCancelParams = BroadcastCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastCancelResponse> =
            cancel(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            broadcastId: String,
            params: BroadcastCancelParams = BroadcastCancelParams.none(),
        ): HttpResponseFor<BroadcastCancelResponse> =
            cancel(broadcastId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: BroadcastCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: BroadcastCancelParams): HttpResponseFor<BroadcastCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastCancelResponse> =
            cancel(broadcastId, BroadcastCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/escalate`, but is
         * otherwise the same as [BroadcastService.escalateReview].
         */
        @MustBeClosed
        fun escalateReview(broadcastId: String): HttpResponseFor<BroadcastEscalateReviewResponse> =
            escalateReview(broadcastId, BroadcastEscalateReviewParams.none())

        /** @see escalateReview */
        @MustBeClosed
        fun escalateReview(
            broadcastId: String,
            params: BroadcastEscalateReviewParams = BroadcastEscalateReviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastEscalateReviewResponse> =
            escalateReview(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see escalateReview */
        @MustBeClosed
        fun escalateReview(
            broadcastId: String,
            params: BroadcastEscalateReviewParams = BroadcastEscalateReviewParams.none(),
        ): HttpResponseFor<BroadcastEscalateReviewResponse> =
            escalateReview(broadcastId, params, RequestOptions.none())

        /** @see escalateReview */
        @MustBeClosed
        fun escalateReview(
            params: BroadcastEscalateReviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastEscalateReviewResponse>

        /** @see escalateReview */
        @MustBeClosed
        fun escalateReview(
            params: BroadcastEscalateReviewParams
        ): HttpResponseFor<BroadcastEscalateReviewResponse> =
            escalateReview(params, RequestOptions.none())

        /** @see escalateReview */
        @MustBeClosed
        fun escalateReview(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastEscalateReviewResponse> =
            escalateReview(broadcastId, BroadcastEscalateReviewParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/broadcasts/{broadcastId}/progress`, but is
         * otherwise the same as [BroadcastService.progress].
         */
        @MustBeClosed
        fun progress(broadcastId: String): HttpResponseFor<BroadcastProgress> =
            progress(broadcastId, BroadcastProgressParams.none())

        /** @see progress */
        @MustBeClosed
        fun progress(
            broadcastId: String,
            params: BroadcastProgressParams = BroadcastProgressParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastProgress> =
            progress(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see progress */
        @MustBeClosed
        fun progress(
            broadcastId: String,
            params: BroadcastProgressParams = BroadcastProgressParams.none(),
        ): HttpResponseFor<BroadcastProgress> = progress(broadcastId, params, RequestOptions.none())

        /** @see progress */
        @MustBeClosed
        fun progress(
            params: BroadcastProgressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastProgress>

        /** @see progress */
        @MustBeClosed
        fun progress(params: BroadcastProgressParams): HttpResponseFor<BroadcastProgress> =
            progress(params, RequestOptions.none())

        /** @see progress */
        @MustBeClosed
        fun progress(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastProgress> =
            progress(broadcastId, BroadcastProgressParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/broadcasts/{broadcastId}/schedule`, but is
         * otherwise the same as [BroadcastService.reschedule].
         */
        @MustBeClosed
        fun reschedule(
            broadcastId: String,
            params: BroadcastRescheduleParams,
        ): HttpResponseFor<BroadcastRescheduleResponse> =
            reschedule(broadcastId, params, RequestOptions.none())

        /** @see reschedule */
        @MustBeClosed
        fun reschedule(
            broadcastId: String,
            params: BroadcastRescheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastRescheduleResponse> =
            reschedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see reschedule */
        @MustBeClosed
        fun reschedule(
            params: BroadcastRescheduleParams
        ): HttpResponseFor<BroadcastRescheduleResponse> = reschedule(params, RequestOptions.none())

        /** @see reschedule */
        @MustBeClosed
        fun reschedule(
            params: BroadcastRescheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastRescheduleResponse>

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/retry-review`, but is
         * otherwise the same as [BroadcastService.retryReview].
         */
        @MustBeClosed
        fun retryReview(broadcastId: String): HttpResponseFor<BroadcastRetryReviewResponse> =
            retryReview(broadcastId, BroadcastRetryReviewParams.none())

        /** @see retryReview */
        @MustBeClosed
        fun retryReview(
            broadcastId: String,
            params: BroadcastRetryReviewParams = BroadcastRetryReviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastRetryReviewResponse> =
            retryReview(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retryReview */
        @MustBeClosed
        fun retryReview(
            broadcastId: String,
            params: BroadcastRetryReviewParams = BroadcastRetryReviewParams.none(),
        ): HttpResponseFor<BroadcastRetryReviewResponse> =
            retryReview(broadcastId, params, RequestOptions.none())

        /** @see retryReview */
        @MustBeClosed
        fun retryReview(
            params: BroadcastRetryReviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastRetryReviewResponse>

        /** @see retryReview */
        @MustBeClosed
        fun retryReview(
            params: BroadcastRetryReviewParams
        ): HttpResponseFor<BroadcastRetryReviewResponse> =
            retryReview(params, RequestOptions.none())

        /** @see retryReview */
        @MustBeClosed
        fun retryReview(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastRetryReviewResponse> =
            retryReview(broadcastId, BroadcastRetryReviewParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/send`, but is
         * otherwise the same as [BroadcastService.send].
         */
        @MustBeClosed
        fun send(broadcastId: String): HttpResponseFor<BroadcastSendResponse> =
            send(broadcastId, BroadcastSendParams.none())

        /** @see send */
        @MustBeClosed
        fun send(
            broadcastId: String,
            params: BroadcastSendParams = BroadcastSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastSendResponse> =
            send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(
            broadcastId: String,
            params: BroadcastSendParams = BroadcastSendParams.none(),
        ): HttpResponseFor<BroadcastSendResponse> = send(broadcastId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastSendResponse>

        /** @see send */
        @MustBeClosed
        fun send(params: BroadcastSendParams): HttpResponseFor<BroadcastSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastSendResponse> =
            send(broadcastId, BroadcastSendParams.none(), requestOptions)
    }
}
