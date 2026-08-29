// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

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
import com.zavudev.api.models.broadcasts.BroadcastListPageAsync
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
import com.zavudev.api.services.async.broadcasts.ContactServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BroadcastServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastServiceAsync

    fun contacts(): ContactServiceAsync

    /** Create a new broadcast campaign. Add contacts after creation, then send. */
    fun create(params: BroadcastCreateParams): CompletableFuture<BroadcastCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastCreateResponse>

    /** Get broadcast */
    fun retrieve(broadcastId: String): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(broadcastId, BroadcastRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
    ): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(broadcastId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: BroadcastRetrieveParams): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

    /** Update a broadcast in draft status. */
    fun update(broadcastId: String): CompletableFuture<BroadcastUpdateResponse> =
        update(broadcastId, BroadcastUpdateParams.none())

    /** @see update */
    fun update(
        broadcastId: String,
        params: BroadcastUpdateParams = BroadcastUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastUpdateResponse> =
        update(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see update */
    fun update(
        broadcastId: String,
        params: BroadcastUpdateParams = BroadcastUpdateParams.none(),
    ): CompletableFuture<BroadcastUpdateResponse> =
        update(broadcastId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastUpdateResponse>

    /** @see update */
    fun update(params: BroadcastUpdateParams): CompletableFuture<BroadcastUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastUpdateResponse> =
        update(broadcastId, BroadcastUpdateParams.none(), requestOptions)

    /** List broadcasts for this project. */
    fun list(): CompletableFuture<BroadcastListPageAsync> = list(BroadcastListParams.none())

    /** @see list */
    fun list(
        params: BroadcastListParams = BroadcastListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastListPageAsync>

    /** @see list */
    fun list(
        params: BroadcastListParams = BroadcastListParams.none()
    ): CompletableFuture<BroadcastListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BroadcastListPageAsync> =
        list(BroadcastListParams.none(), requestOptions)

    /** Delete a broadcast in draft status. */
    fun delete(broadcastId: String): CompletableFuture<Void?> =
        delete(broadcastId, BroadcastDeleteParams.none())

    /** @see delete */
    fun delete(
        broadcastId: String,
        params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see delete */
    fun delete(
        broadcastId: String,
        params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(broadcastId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BroadcastDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BroadcastDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(broadcastId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(broadcastId, BroadcastDeleteParams.none(), requestOptions)

    /**
     * Cancel a broadcast. Pending contacts will be skipped, but already queued messages may still
     * be delivered.
     */
    fun cancel(broadcastId: String): CompletableFuture<BroadcastCancelResponse> =
        cancel(broadcastId, BroadcastCancelParams.none())

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        params: BroadcastCancelParams = BroadcastCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastCancelResponse> =
        cancel(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        params: BroadcastCancelParams = BroadcastCancelParams.none(),
    ): CompletableFuture<BroadcastCancelResponse> =
        cancel(broadcastId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: BroadcastCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastCancelResponse>

    /** @see cancel */
    fun cancel(params: BroadcastCancelParams): CompletableFuture<BroadcastCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastCancelResponse> =
        cancel(broadcastId, BroadcastCancelParams.none(), requestOptions)

    /**
     * Request manual review by the Zavu team for a rejected broadcast. Use this after automated
     * review rejection if you believe the content is legitimate.
     */
    fun escalateReview(broadcastId: String): CompletableFuture<BroadcastEscalateReviewResponse> =
        escalateReview(broadcastId, BroadcastEscalateReviewParams.none())

    /** @see escalateReview */
    fun escalateReview(
        broadcastId: String,
        params: BroadcastEscalateReviewParams = BroadcastEscalateReviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastEscalateReviewResponse> =
        escalateReview(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see escalateReview */
    fun escalateReview(
        broadcastId: String,
        params: BroadcastEscalateReviewParams = BroadcastEscalateReviewParams.none(),
    ): CompletableFuture<BroadcastEscalateReviewResponse> =
        escalateReview(broadcastId, params, RequestOptions.none())

    /** @see escalateReview */
    fun escalateReview(
        params: BroadcastEscalateReviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastEscalateReviewResponse>

    /** @see escalateReview */
    fun escalateReview(
        params: BroadcastEscalateReviewParams
    ): CompletableFuture<BroadcastEscalateReviewResponse> =
        escalateReview(params, RequestOptions.none())

    /** @see escalateReview */
    fun escalateReview(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastEscalateReviewResponse> =
        escalateReview(broadcastId, BroadcastEscalateReviewParams.none(), requestOptions)

    /**
     * Get real-time progress of a broadcast including delivery counts and estimated completion
     * time.
     */
    fun progress(broadcastId: String): CompletableFuture<BroadcastProgress> =
        progress(broadcastId, BroadcastProgressParams.none())

    /** @see progress */
    fun progress(
        broadcastId: String,
        params: BroadcastProgressParams = BroadcastProgressParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastProgress> =
        progress(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see progress */
    fun progress(
        broadcastId: String,
        params: BroadcastProgressParams = BroadcastProgressParams.none(),
    ): CompletableFuture<BroadcastProgress> = progress(broadcastId, params, RequestOptions.none())

    /** @see progress */
    fun progress(
        params: BroadcastProgressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastProgress>

    /** @see progress */
    fun progress(params: BroadcastProgressParams): CompletableFuture<BroadcastProgress> =
        progress(params, RequestOptions.none())

    /** @see progress */
    fun progress(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastProgress> =
        progress(broadcastId, BroadcastProgressParams.none(), requestOptions)

    /** Update the scheduled time for a broadcast. The broadcast must be in scheduled status. */
    fun reschedule(
        broadcastId: String,
        params: BroadcastRescheduleParams,
    ): CompletableFuture<BroadcastRescheduleResponse> =
        reschedule(broadcastId, params, RequestOptions.none())

    /** @see reschedule */
    fun reschedule(
        broadcastId: String,
        params: BroadcastRescheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastRescheduleResponse> =
        reschedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see reschedule */
    fun reschedule(
        params: BroadcastRescheduleParams
    ): CompletableFuture<BroadcastRescheduleResponse> = reschedule(params, RequestOptions.none())

    /** @see reschedule */
    fun reschedule(
        params: BroadcastRescheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastRescheduleResponse>

    /**
     * Resubmit a rejected broadcast for AI review after editing content. Maximum 3 review attempts
     * allowed per broadcast.
     */
    fun retryReview(broadcastId: String): CompletableFuture<BroadcastRetryReviewResponse> =
        retryReview(broadcastId, BroadcastRetryReviewParams.none())

    /** @see retryReview */
    fun retryReview(
        broadcastId: String,
        params: BroadcastRetryReviewParams = BroadcastRetryReviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastRetryReviewResponse> =
        retryReview(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retryReview */
    fun retryReview(
        broadcastId: String,
        params: BroadcastRetryReviewParams = BroadcastRetryReviewParams.none(),
    ): CompletableFuture<BroadcastRetryReviewResponse> =
        retryReview(broadcastId, params, RequestOptions.none())

    /** @see retryReview */
    fun retryReview(
        params: BroadcastRetryReviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastRetryReviewResponse>

    /** @see retryReview */
    fun retryReview(
        params: BroadcastRetryReviewParams
    ): CompletableFuture<BroadcastRetryReviewResponse> = retryReview(params, RequestOptions.none())

    /** @see retryReview */
    fun retryReview(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastRetryReviewResponse> =
        retryReview(broadcastId, BroadcastRetryReviewParams.none(), requestOptions)

    /**
     * Start sending the broadcast immediately or schedule for later.
     *
     * **The account must be past the sandbox level to send, except on WhatsApp.** An account that
     * has verified nothing is refused with `403` and code `kyc_required` on every channel other
     * than `whatsapp`. Any one of these lifts it: identity verification (KYC), a saved payment
     * method, a settled deposit, or a paid plan. Business verification (KYB) is not required to
     * broadcast; it gates 10DLC registration only. A `whatsapp` broadcast is exempt: it can only be
     * built on a template, and Meta vets the business and the content when it approves that
     * template, so an unapproved template is refused instead. `smart` is not exempt, since it can
     * route a contact to SMS or email. Drafts can be created, edited and kept without any check.
     * Every send path (dashboard, API and CLI) enforces the same rule.
     *
     * **Daily ceilings apply per recipient.** Each message a broadcast sends counts against the
     * channel's daily ceiling (see `POST /v1/messages`). Once the ceiling is reached, the remaining
     * recipients are marked `failed` with `errorCode` `DAILY_LIMIT_EXCEEDED`; they are not retried
     * the next day.
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
    fun send(broadcastId: String): CompletableFuture<BroadcastSendResponse> =
        send(broadcastId, BroadcastSendParams.none())

    /** @see send */
    fun send(
        broadcastId: String,
        params: BroadcastSendParams = BroadcastSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastSendResponse> =
        send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see send */
    fun send(
        broadcastId: String,
        params: BroadcastSendParams = BroadcastSendParams.none(),
    ): CompletableFuture<BroadcastSendResponse> = send(broadcastId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastSendResponse>

    /** @see send */
    fun send(params: BroadcastSendParams): CompletableFuture<BroadcastSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastSendResponse> =
        send(broadcastId, BroadcastSendParams.none(), requestOptions)

    /**
     * A view of [BroadcastServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastServiceAsync.WithRawResponse

        fun contacts(): ContactServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts`, but is otherwise the same as
         * [BroadcastServiceAsync.create].
         */
        fun create(
            params: BroadcastCreateParams
        ): CompletableFuture<HttpResponseFor<BroadcastCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/broadcasts/{broadcastId}`, but is otherwise the
         * same as [BroadcastServiceAsync.retrieve].
         */
        fun retrieve(
            broadcastId: String
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(broadcastId, BroadcastRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(broadcastId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BroadcastRetrieveParams
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/broadcasts/{broadcastId}`, but is otherwise
         * the same as [BroadcastServiceAsync.update].
         */
        fun update(
            broadcastId: String
        ): CompletableFuture<HttpResponseFor<BroadcastUpdateResponse>> =
            update(broadcastId, BroadcastUpdateParams.none())

        /** @see update */
        fun update(
            broadcastId: String,
            params: BroadcastUpdateParams = BroadcastUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastUpdateResponse>> =
            update(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see update */
        fun update(
            broadcastId: String,
            params: BroadcastUpdateParams = BroadcastUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastUpdateResponse>> =
            update(broadcastId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastUpdateResponse>>

        /** @see update */
        fun update(
            params: BroadcastUpdateParams
        ): CompletableFuture<HttpResponseFor<BroadcastUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastUpdateResponse>> =
            update(broadcastId, BroadcastUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/broadcasts`, but is otherwise the same as
         * [BroadcastServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BroadcastListPageAsync>> =
            list(BroadcastListParams.none())

        /** @see list */
        fun list(
            params: BroadcastListParams = BroadcastListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastListPageAsync>>

        /** @see list */
        fun list(
            params: BroadcastListParams = BroadcastListParams.none()
        ): CompletableFuture<HttpResponseFor<BroadcastListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BroadcastListPageAsync>> =
            list(BroadcastListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/broadcasts/{broadcastId}`, but is otherwise
         * the same as [BroadcastServiceAsync.delete].
         */
        fun delete(broadcastId: String): CompletableFuture<HttpResponse> =
            delete(broadcastId, BroadcastDeleteParams.none())

        /** @see delete */
        fun delete(
            broadcastId: String,
            params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see delete */
        fun delete(
            broadcastId: String,
            params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(broadcastId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BroadcastDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BroadcastDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(broadcastId, BroadcastDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/cancel`, but is
         * otherwise the same as [BroadcastServiceAsync.cancel].
         */
        fun cancel(
            broadcastId: String
        ): CompletableFuture<HttpResponseFor<BroadcastCancelResponse>> =
            cancel(broadcastId, BroadcastCancelParams.none())

        /** @see cancel */
        fun cancel(
            broadcastId: String,
            params: BroadcastCancelParams = BroadcastCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastCancelResponse>> =
            cancel(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            broadcastId: String,
            params: BroadcastCancelParams = BroadcastCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastCancelResponse>> =
            cancel(broadcastId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: BroadcastCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: BroadcastCancelParams
        ): CompletableFuture<HttpResponseFor<BroadcastCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastCancelResponse>> =
            cancel(broadcastId, BroadcastCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/escalate`, but is
         * otherwise the same as [BroadcastServiceAsync.escalateReview].
         */
        fun escalateReview(
            broadcastId: String
        ): CompletableFuture<HttpResponseFor<BroadcastEscalateReviewResponse>> =
            escalateReview(broadcastId, BroadcastEscalateReviewParams.none())

        /** @see escalateReview */
        fun escalateReview(
            broadcastId: String,
            params: BroadcastEscalateReviewParams = BroadcastEscalateReviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastEscalateReviewResponse>> =
            escalateReview(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see escalateReview */
        fun escalateReview(
            broadcastId: String,
            params: BroadcastEscalateReviewParams = BroadcastEscalateReviewParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastEscalateReviewResponse>> =
            escalateReview(broadcastId, params, RequestOptions.none())

        /** @see escalateReview */
        fun escalateReview(
            params: BroadcastEscalateReviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastEscalateReviewResponse>>

        /** @see escalateReview */
        fun escalateReview(
            params: BroadcastEscalateReviewParams
        ): CompletableFuture<HttpResponseFor<BroadcastEscalateReviewResponse>> =
            escalateReview(params, RequestOptions.none())

        /** @see escalateReview */
        fun escalateReview(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastEscalateReviewResponse>> =
            escalateReview(broadcastId, BroadcastEscalateReviewParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/broadcasts/{broadcastId}/progress`, but is
         * otherwise the same as [BroadcastServiceAsync.progress].
         */
        fun progress(broadcastId: String): CompletableFuture<HttpResponseFor<BroadcastProgress>> =
            progress(broadcastId, BroadcastProgressParams.none())

        /** @see progress */
        fun progress(
            broadcastId: String,
            params: BroadcastProgressParams = BroadcastProgressParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastProgress>> =
            progress(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see progress */
        fun progress(
            broadcastId: String,
            params: BroadcastProgressParams = BroadcastProgressParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastProgress>> =
            progress(broadcastId, params, RequestOptions.none())

        /** @see progress */
        fun progress(
            params: BroadcastProgressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastProgress>>

        /** @see progress */
        fun progress(
            params: BroadcastProgressParams
        ): CompletableFuture<HttpResponseFor<BroadcastProgress>> =
            progress(params, RequestOptions.none())

        /** @see progress */
        fun progress(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastProgress>> =
            progress(broadcastId, BroadcastProgressParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/broadcasts/{broadcastId}/schedule`, but is
         * otherwise the same as [BroadcastServiceAsync.reschedule].
         */
        fun reschedule(
            broadcastId: String,
            params: BroadcastRescheduleParams,
        ): CompletableFuture<HttpResponseFor<BroadcastRescheduleResponse>> =
            reschedule(broadcastId, params, RequestOptions.none())

        /** @see reschedule */
        fun reschedule(
            broadcastId: String,
            params: BroadcastRescheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRescheduleResponse>> =
            reschedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see reschedule */
        fun reschedule(
            params: BroadcastRescheduleParams
        ): CompletableFuture<HttpResponseFor<BroadcastRescheduleResponse>> =
            reschedule(params, RequestOptions.none())

        /** @see reschedule */
        fun reschedule(
            params: BroadcastRescheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRescheduleResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/retry-review`, but is
         * otherwise the same as [BroadcastServiceAsync.retryReview].
         */
        fun retryReview(
            broadcastId: String
        ): CompletableFuture<HttpResponseFor<BroadcastRetryReviewResponse>> =
            retryReview(broadcastId, BroadcastRetryReviewParams.none())

        /** @see retryReview */
        fun retryReview(
            broadcastId: String,
            params: BroadcastRetryReviewParams = BroadcastRetryReviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetryReviewResponse>> =
            retryReview(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retryReview */
        fun retryReview(
            broadcastId: String,
            params: BroadcastRetryReviewParams = BroadcastRetryReviewParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetryReviewResponse>> =
            retryReview(broadcastId, params, RequestOptions.none())

        /** @see retryReview */
        fun retryReview(
            params: BroadcastRetryReviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetryReviewResponse>>

        /** @see retryReview */
        fun retryReview(
            params: BroadcastRetryReviewParams
        ): CompletableFuture<HttpResponseFor<BroadcastRetryReviewResponse>> =
            retryReview(params, RequestOptions.none())

        /** @see retryReview */
        fun retryReview(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastRetryReviewResponse>> =
            retryReview(broadcastId, BroadcastRetryReviewParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/send`, but is
         * otherwise the same as [BroadcastServiceAsync.send].
         */
        fun send(broadcastId: String): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(broadcastId, BroadcastSendParams.none())

        /** @see send */
        fun send(
            broadcastId: String,
            params: BroadcastSendParams = BroadcastSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see send */
        fun send(
            broadcastId: String,
            params: BroadcastSendParams = BroadcastSendParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(broadcastId, params, RequestOptions.none())

        /** @see send */
        fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>>

        /** @see send */
        fun send(
            params: BroadcastSendParams
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(broadcastId, BroadcastSendParams.none(), requestOptions)
    }
}
