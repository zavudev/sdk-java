// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.contacts

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.contacts.channels.ChannelAddParams
import com.zavudev.api.models.contacts.channels.ChannelAddResponse
import com.zavudev.api.models.contacts.channels.ChannelRemoveParams
import com.zavudev.api.models.contacts.channels.ChannelSetPrimaryParams
import com.zavudev.api.models.contacts.channels.ChannelSetPrimaryResponse
import com.zavudev.api.models.contacts.channels.ChannelUpdateParams
import com.zavudev.api.models.contacts.channels.ChannelUpdateResponse
import java.util.function.Consumer

interface ChannelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService

    /** Update a contact's channel properties. */
    fun update(channelId: String, params: ChannelUpdateParams): ChannelUpdateResponse =
        update(channelId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelId: String,
        params: ChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelUpdateResponse =
        update(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelUpdateParams): ChannelUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelUpdateResponse

    /** Add a new communication channel to an existing contact. */
    fun add(contactId: String, params: ChannelAddParams): ChannelAddResponse =
        add(contactId, params, RequestOptions.none())

    /** @see add */
    fun add(
        contactId: String,
        params: ChannelAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelAddResponse = add(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see add */
    fun add(params: ChannelAddParams): ChannelAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: ChannelAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelAddResponse

    /** Remove a communication channel from a contact. Cannot remove the last channel. */
    fun remove(channelId: String, params: ChannelRemoveParams) =
        remove(channelId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        channelId: String,
        params: ChannelRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = remove(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see remove */
    fun remove(params: ChannelRemoveParams) = remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(params: ChannelRemoveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Set a channel as the primary channel for its type. */
    fun setPrimary(channelId: String, params: ChannelSetPrimaryParams): ChannelSetPrimaryResponse =
        setPrimary(channelId, params, RequestOptions.none())

    /** @see setPrimary */
    fun setPrimary(
        channelId: String,
        params: ChannelSetPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelSetPrimaryResponse =
        setPrimary(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see setPrimary */
    fun setPrimary(params: ChannelSetPrimaryParams): ChannelSetPrimaryResponse =
        setPrimary(params, RequestOptions.none())

    /** @see setPrimary */
    fun setPrimary(
        params: ChannelSetPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelSetPrimaryResponse

    /** A view of [ChannelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /v1/contacts/{contactId}/channels/{channelId}`,
         * but is otherwise the same as [ChannelService.update].
         */
        @MustBeClosed
        fun update(
            channelId: String,
            params: ChannelUpdateParams,
        ): HttpResponseFor<ChannelUpdateResponse> = update(channelId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            channelId: String,
            params: ChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelUpdateResponse> =
            update(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ChannelUpdateParams): HttpResponseFor<ChannelUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelUpdateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/contacts/{contactId}/channels`, but is
         * otherwise the same as [ChannelService.add].
         */
        @MustBeClosed
        fun add(contactId: String, params: ChannelAddParams): HttpResponseFor<ChannelAddResponse> =
            add(contactId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            contactId: String,
            params: ChannelAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelAddResponse> =
            add(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: ChannelAddParams): HttpResponseFor<ChannelAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: ChannelAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelAddResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/contacts/{contactId}/channels/{channelId}`,
         * but is otherwise the same as [ChannelService.remove].
         */
        @MustBeClosed
        fun remove(channelId: String, params: ChannelRemoveParams): HttpResponse =
            remove(channelId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            channelId: String,
            params: ChannelRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = remove(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: ChannelRemoveParams): HttpResponse =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: ChannelRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/contacts/{contactId}/channels/{channelId}/primary`, but is otherwise the same as
         * [ChannelService.setPrimary].
         */
        @MustBeClosed
        fun setPrimary(
            channelId: String,
            params: ChannelSetPrimaryParams,
        ): HttpResponseFor<ChannelSetPrimaryResponse> =
            setPrimary(channelId, params, RequestOptions.none())

        /** @see setPrimary */
        @MustBeClosed
        fun setPrimary(
            channelId: String,
            params: ChannelSetPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelSetPrimaryResponse> =
            setPrimary(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see setPrimary */
        @MustBeClosed
        fun setPrimary(
            params: ChannelSetPrimaryParams
        ): HttpResponseFor<ChannelSetPrimaryResponse> = setPrimary(params, RequestOptions.none())

        /** @see setPrimary */
        @MustBeClosed
        fun setPrimary(
            params: ChannelSetPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelSetPrimaryResponse>
    }
}
