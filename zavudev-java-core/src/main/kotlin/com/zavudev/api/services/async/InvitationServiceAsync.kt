// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.invitations.InvitationCancelParams
import com.zavudev.api.models.invitations.InvitationCancelResponse
import com.zavudev.api.models.invitations.InvitationCreateParams
import com.zavudev.api.models.invitations.InvitationCreateResponse
import com.zavudev.api.models.invitations.InvitationListPageAsync
import com.zavudev.api.models.invitations.InvitationListParams
import com.zavudev.api.models.invitations.InvitationRetrieveParams
import com.zavudev.api.models.invitations.InvitationRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvitationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitationServiceAsync

    /**
     * Create a partner invitation link for a client to connect a Meta channel. The client opens the
     * returned `url` and authorizes with Meta; the resulting sender is created in your project when
     * they finish, and the invitation transitions to `completed`.
     *
     * `connectionType` picks the channel:
     * - `whatsapp_waba` (default): Meta's embedded signup links an official WhatsApp Business
     *   Account.
     * - `messenger`: the client picks a Facebook Page they administer; its Messenger inbox
     *   (including Marketplace chats) is routed to Zavu.
     *
     * One invitation connects one channel — create one per channel to onboard a client on several.
     * `phoneNumberId` and `allowedPhoneCountries` apply to `whatsapp_waba` only.
     */
    fun create(): CompletableFuture<InvitationCreateResponse> =
        create(InvitationCreateParams.none())

    /** @see create */
    fun create(
        params: InvitationCreateParams = InvitationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationCreateResponse>

    /** @see create */
    fun create(
        params: InvitationCreateParams = InvitationCreateParams.none()
    ): CompletableFuture<InvitationCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<InvitationCreateResponse> =
        create(InvitationCreateParams.none(), requestOptions)

    /** Get invitation */
    fun retrieve(invitationId: String): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(invitationId, InvitationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(params.toBuilder().invitationId(invitationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
    ): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(invitationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: InvitationRetrieveParams): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(invitationId, InvitationRetrieveParams.none(), requestOptions)

    /** List partner invitations for this project. */
    fun list(): CompletableFuture<InvitationListPageAsync> = list(InvitationListParams.none())

    /** @see list */
    fun list(
        params: InvitationListParams = InvitationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationListPageAsync>

    /** @see list */
    fun list(
        params: InvitationListParams = InvitationListParams.none()
    ): CompletableFuture<InvitationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InvitationListPageAsync> =
        list(InvitationListParams.none(), requestOptions)

    /**
     * Cancel an active invitation. The client will no longer be able to use the invitation link.
     */
    fun cancel(invitationId: String): CompletableFuture<InvitationCancelResponse> =
        cancel(invitationId, InvitationCancelParams.none())

    /** @see cancel */
    fun cancel(
        invitationId: String,
        params: InvitationCancelParams = InvitationCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationCancelResponse> =
        cancel(params.toBuilder().invitationId(invitationId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        invitationId: String,
        params: InvitationCancelParams = InvitationCancelParams.none(),
    ): CompletableFuture<InvitationCancelResponse> =
        cancel(invitationId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: InvitationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationCancelResponse>

    /** @see cancel */
    fun cancel(params: InvitationCancelParams): CompletableFuture<InvitationCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        invitationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationCancelResponse> =
        cancel(invitationId, InvitationCancelParams.none(), requestOptions)

    /**
     * A view of [InvitationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvitationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/invitations`, but is otherwise the same as
         * [InvitationServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<InvitationCreateResponse>> =
            create(InvitationCreateParams.none())

        /** @see create */
        fun create(
            params: InvitationCreateParams = InvitationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationCreateResponse>>

        /** @see create */
        fun create(
            params: InvitationCreateParams = InvitationCreateParams.none()
        ): CompletableFuture<HttpResponseFor<InvitationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvitationCreateResponse>> =
            create(InvitationCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/invitations/{invitationId}`, but is otherwise
         * the same as [InvitationServiceAsync.retrieve].
         */
        fun retrieve(
            invitationId: String
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(invitationId, InvitationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            invitationId: String,
            params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(params.toBuilder().invitationId(invitationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            invitationId: String,
            params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(invitationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InvitationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: InvitationRetrieveParams
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            invitationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(invitationId, InvitationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/invitations`, but is otherwise the same as
         * [InvitationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InvitationListPageAsync>> =
            list(InvitationListParams.none())

        /** @see list */
        fun list(
            params: InvitationListParams = InvitationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationListPageAsync>>

        /** @see list */
        fun list(
            params: InvitationListParams = InvitationListParams.none()
        ): CompletableFuture<HttpResponseFor<InvitationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvitationListPageAsync>> =
            list(InvitationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/invitations/{invitationId}/cancel`, but is
         * otherwise the same as [InvitationServiceAsync.cancel].
         */
        fun cancel(
            invitationId: String
        ): CompletableFuture<HttpResponseFor<InvitationCancelResponse>> =
            cancel(invitationId, InvitationCancelParams.none())

        /** @see cancel */
        fun cancel(
            invitationId: String,
            params: InvitationCancelParams = InvitationCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationCancelResponse>> =
            cancel(params.toBuilder().invitationId(invitationId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            invitationId: String,
            params: InvitationCancelParams = InvitationCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<InvitationCancelResponse>> =
            cancel(invitationId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: InvitationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: InvitationCancelParams
        ): CompletableFuture<HttpResponseFor<InvitationCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            invitationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationCancelResponse>> =
            cancel(invitationId, InvitationCancelParams.none(), requestOptions)
    }
}
