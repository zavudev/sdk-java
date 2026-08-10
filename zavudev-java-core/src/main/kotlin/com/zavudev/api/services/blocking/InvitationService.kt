// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.invitations.InvitationCancelParams
import com.zavudev.api.models.invitations.InvitationCancelResponse
import com.zavudev.api.models.invitations.InvitationCreateParams
import com.zavudev.api.models.invitations.InvitationCreateResponse
import com.zavudev.api.models.invitations.InvitationListPage
import com.zavudev.api.models.invitations.InvitationListParams
import com.zavudev.api.models.invitations.InvitationRetrieveParams
import com.zavudev.api.models.invitations.InvitationRetrieveResponse
import java.util.function.Consumer

interface InvitationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitationService

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
    fun create(): InvitationCreateResponse = create(InvitationCreateParams.none())

    /** @see create */
    fun create(
        params: InvitationCreateParams = InvitationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationCreateResponse

    /** @see create */
    fun create(
        params: InvitationCreateParams = InvitationCreateParams.none()
    ): InvitationCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): InvitationCreateResponse =
        create(InvitationCreateParams.none(), requestOptions)

    /** Get invitation */
    fun retrieve(invitationId: String): InvitationRetrieveResponse =
        retrieve(invitationId, InvitationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationRetrieveResponse =
        retrieve(params.toBuilder().invitationId(invitationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
    ): InvitationRetrieveResponse = retrieve(invitationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: InvitationRetrieveParams): InvitationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(invitationId: String, requestOptions: RequestOptions): InvitationRetrieveResponse =
        retrieve(invitationId, InvitationRetrieveParams.none(), requestOptions)

    /** List partner invitations for this project. */
    fun list(): InvitationListPage = list(InvitationListParams.none())

    /** @see list */
    fun list(
        params: InvitationListParams = InvitationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationListPage

    /** @see list */
    fun list(params: InvitationListParams = InvitationListParams.none()): InvitationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InvitationListPage =
        list(InvitationListParams.none(), requestOptions)

    /**
     * Cancel an active invitation. The client will no longer be able to use the invitation link.
     */
    fun cancel(invitationId: String): InvitationCancelResponse =
        cancel(invitationId, InvitationCancelParams.none())

    /** @see cancel */
    fun cancel(
        invitationId: String,
        params: InvitationCancelParams = InvitationCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationCancelResponse =
        cancel(params.toBuilder().invitationId(invitationId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        invitationId: String,
        params: InvitationCancelParams = InvitationCancelParams.none(),
    ): InvitationCancelResponse = cancel(invitationId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: InvitationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationCancelResponse

    /** @see cancel */
    fun cancel(params: InvitationCancelParams): InvitationCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(invitationId: String, requestOptions: RequestOptions): InvitationCancelResponse =
        cancel(invitationId, InvitationCancelParams.none(), requestOptions)

    /** A view of [InvitationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvitationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/invitations`, but is otherwise the same as
         * [InvitationService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<InvitationCreateResponse> =
            create(InvitationCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InvitationCreateParams = InvitationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: InvitationCreateParams = InvitationCreateParams.none()
        ): HttpResponseFor<InvitationCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<InvitationCreateResponse> =
            create(InvitationCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/invitations/{invitationId}`, but is otherwise
         * the same as [InvitationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(invitationId: String): HttpResponseFor<InvitationRetrieveResponse> =
            retrieve(invitationId, InvitationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            invitationId: String,
            params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationRetrieveResponse> =
            retrieve(params.toBuilder().invitationId(invitationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            invitationId: String,
            params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
        ): HttpResponseFor<InvitationRetrieveResponse> =
            retrieve(invitationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InvitationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InvitationRetrieveParams
        ): HttpResponseFor<InvitationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            invitationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitationRetrieveResponse> =
            retrieve(invitationId, InvitationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/invitations`, but is otherwise the same as
         * [InvitationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InvitationListPage> = list(InvitationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvitationListParams = InvitationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvitationListParams = InvitationListParams.none()
        ): HttpResponseFor<InvitationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvitationListPage> =
            list(InvitationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/invitations/{invitationId}/cancel`, but is
         * otherwise the same as [InvitationService.cancel].
         */
        @MustBeClosed
        fun cancel(invitationId: String): HttpResponseFor<InvitationCancelResponse> =
            cancel(invitationId, InvitationCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            invitationId: String,
            params: InvitationCancelParams = InvitationCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationCancelResponse> =
            cancel(params.toBuilder().invitationId(invitationId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            invitationId: String,
            params: InvitationCancelParams = InvitationCancelParams.none(),
        ): HttpResponseFor<InvitationCancelResponse> =
            cancel(invitationId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: InvitationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: InvitationCancelParams): HttpResponseFor<InvitationCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            invitationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitationCancelResponse> =
            cancel(invitationId, InvitationCancelParams.none(), requestOptions)
    }
}
