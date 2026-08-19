// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.calls.CallCreateParams
import com.zavudev.api.models.calls.CallCreateResponse
import com.zavudev.api.models.calls.CallHangupParams
import com.zavudev.api.models.calls.CallHangupResponse
import com.zavudev.api.models.calls.CallListPage
import com.zavudev.api.models.calls.CallListParams
import com.zavudev.api.models.calls.CallRetrieveParams
import com.zavudev.api.models.calls.CallRetrieveResponse
import java.util.function.Consumer

interface CallService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService

    /**
     * Place an outbound voice call answered by the voice agent configured on the sender. Zavu dials
     * the recipient and runs the conversation through its managed voice pipeline (speech
     * recognition, the agent's LLM, and speech synthesis, with real-time interruption handling).
     *
     * **Requirements:**
     * - The Voice Agents feature must be enabled for your team (otherwise `403`).
     * - The sender's agent must have `voice.enabled` set to `true`.
     * - Not available with test-mode API keys.
     *
     * **Billing:** Voice calls are billed per minute of connected time plus telephony, deducted
     * from your prepaid balance. A short-duration estimate is reserved when the call is placed; you
     * are charged for the actual duration when the call ends.
     */
    fun create(params: CallCreateParams): CallCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CallCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallCreateResponse

    /**
     * Retrieve a single voice call, including its full transcript once the conversation has
     * produced turns.
     */
    fun retrieve(callId: String): CallRetrieveResponse = retrieve(callId, CallRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        callId: String,
        params: CallRetrieveParams = CallRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveResponse = retrieve(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        callId: String,
        params: CallRetrieveParams = CallRetrieveParams.none(),
    ): CallRetrieveResponse = retrieve(callId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CallRetrieveParams): CallRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(callId: String, requestOptions: RequestOptions): CallRetrieveResponse =
        retrieve(callId, CallRetrieveParams.none(), requestOptions)

    /**
     * List voice calls for this project, most recent first. Transcripts are omitted from the list;
     * fetch a single call to get its transcript.
     */
    fun list(): CallListPage = list(CallListParams.none())

    /** @see list */
    fun list(
        params: CallListParams = CallListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallListPage

    /** @see list */
    fun list(params: CallListParams = CallListParams.none()): CallListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CallListPage =
        list(CallListParams.none(), requestOptions)

    /**
     * End an active voice call. The call must still be ringing or in progress. Not available with
     * test-mode API keys.
     */
    fun hangup(callId: String): CallHangupResponse = hangup(callId, CallHangupParams.none())

    /** @see hangup */
    fun hangup(
        callId: String,
        params: CallHangupParams = CallHangupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallHangupResponse = hangup(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see hangup */
    fun hangup(
        callId: String,
        params: CallHangupParams = CallHangupParams.none(),
    ): CallHangupResponse = hangup(callId, params, RequestOptions.none())

    /** @see hangup */
    fun hangup(
        params: CallHangupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallHangupResponse

    /** @see hangup */
    fun hangup(params: CallHangupParams): CallHangupResponse = hangup(params, RequestOptions.none())

    /** @see hangup */
    fun hangup(callId: String, requestOptions: RequestOptions): CallHangupResponse =
        hangup(callId, CallHangupParams.none(), requestOptions)

    /** A view of [CallService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/calls`, but is otherwise the same as
         * [CallService.create].
         */
        @MustBeClosed
        fun create(params: CallCreateParams): HttpResponseFor<CallCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CallCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/calls/{callId}`, but is otherwise the same as
         * [CallService.retrieve].
         */
        @MustBeClosed
        fun retrieve(callId: String): HttpResponseFor<CallRetrieveResponse> =
            retrieve(callId, CallRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callId: String,
            params: CallRetrieveParams = CallRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveResponse> =
            retrieve(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callId: String,
            params: CallRetrieveParams = CallRetrieveParams.none(),
        ): HttpResponseFor<CallRetrieveResponse> = retrieve(callId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CallRetrieveParams): HttpResponseFor<CallRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallRetrieveResponse> =
            retrieve(callId, CallRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/calls`, but is otherwise the same as
         * [CallService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CallListPage> = list(CallListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallListParams = CallListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CallListParams = CallListParams.none()): HttpResponseFor<CallListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CallListPage> =
            list(CallListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/calls/{callId}/hangup`, but is otherwise the
         * same as [CallService.hangup].
         */
        @MustBeClosed
        fun hangup(callId: String): HttpResponseFor<CallHangupResponse> =
            hangup(callId, CallHangupParams.none())

        /** @see hangup */
        @MustBeClosed
        fun hangup(
            callId: String,
            params: CallHangupParams = CallHangupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallHangupResponse> =
            hangup(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see hangup */
        @MustBeClosed
        fun hangup(
            callId: String,
            params: CallHangupParams = CallHangupParams.none(),
        ): HttpResponseFor<CallHangupResponse> = hangup(callId, params, RequestOptions.none())

        /** @see hangup */
        @MustBeClosed
        fun hangup(
            params: CallHangupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallHangupResponse>

        /** @see hangup */
        @MustBeClosed
        fun hangup(params: CallHangupParams): HttpResponseFor<CallHangupResponse> =
            hangup(params, RequestOptions.none())

        /** @see hangup */
        @MustBeClosed
        fun hangup(
            callId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallHangupResponse> =
            hangup(callId, CallHangupParams.none(), requestOptions)
    }
}
