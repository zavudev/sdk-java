// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.contacts

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChannelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelServiceAsync

    /** Update a contact's channel properties. */
    fun update(
        channelId: String,
        params: ChannelUpdateParams,
    ): CompletableFuture<ChannelUpdateResponse> = update(channelId, params, RequestOptions.none())

    /** @see update */
    fun update(
        channelId: String,
        params: ChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelUpdateResponse> =
        update(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelUpdateParams): CompletableFuture<ChannelUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelUpdateResponse>

    /** Add a new communication channel to an existing contact. */
    fun add(contactId: String, params: ChannelAddParams): CompletableFuture<ChannelAddResponse> =
        add(contactId, params, RequestOptions.none())

    /** @see add */
    fun add(
        contactId: String,
        params: ChannelAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelAddResponse> =
        add(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see add */
    fun add(params: ChannelAddParams): CompletableFuture<ChannelAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: ChannelAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelAddResponse>

    /** Remove a communication channel from a contact. Cannot remove the last channel. */
    fun remove(channelId: String, params: ChannelRemoveParams): CompletableFuture<Void?> =
        remove(channelId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        channelId: String,
        params: ChannelRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        remove(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see remove */
    fun remove(params: ChannelRemoveParams): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: ChannelRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Set a channel as the primary channel for its type. */
    fun setPrimary(
        channelId: String,
        params: ChannelSetPrimaryParams,
    ): CompletableFuture<ChannelSetPrimaryResponse> =
        setPrimary(channelId, params, RequestOptions.none())

    /** @see setPrimary */
    fun setPrimary(
        channelId: String,
        params: ChannelSetPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelSetPrimaryResponse> =
        setPrimary(params.toBuilder().channelId(channelId).build(), requestOptions)

    /** @see setPrimary */
    fun setPrimary(params: ChannelSetPrimaryParams): CompletableFuture<ChannelSetPrimaryResponse> =
        setPrimary(params, RequestOptions.none())

    /** @see setPrimary */
    fun setPrimary(
        params: ChannelSetPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelSetPrimaryResponse>

    /**
     * A view of [ChannelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /v1/contacts/{contactId}/channels/{channelId}`,
         * but is otherwise the same as [ChannelServiceAsync.update].
         */
        fun update(
            channelId: String,
            params: ChannelUpdateParams,
        ): CompletableFuture<HttpResponseFor<ChannelUpdateResponse>> =
            update(channelId, params, RequestOptions.none())

        /** @see update */
        fun update(
            channelId: String,
            params: ChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelUpdateResponse>> =
            update(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ChannelUpdateParams
        ): CompletableFuture<HttpResponseFor<ChannelUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contacts/{contactId}/channels`, but is
         * otherwise the same as [ChannelServiceAsync.add].
         */
        fun add(
            contactId: String,
            params: ChannelAddParams,
        ): CompletableFuture<HttpResponseFor<ChannelAddResponse>> =
            add(contactId, params, RequestOptions.none())

        /** @see add */
        fun add(
            contactId: String,
            params: ChannelAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelAddResponse>> =
            add(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see add */
        fun add(params: ChannelAddParams): CompletableFuture<HttpResponseFor<ChannelAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: ChannelAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelAddResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/contacts/{contactId}/channels/{channelId}`,
         * but is otherwise the same as [ChannelServiceAsync.remove].
         */
        fun remove(
            channelId: String,
            params: ChannelRemoveParams,
        ): CompletableFuture<HttpResponse> = remove(channelId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            channelId: String,
            params: ChannelRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            remove(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see remove */
        fun remove(params: ChannelRemoveParams): CompletableFuture<HttpResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: ChannelRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/contacts/{contactId}/channels/{channelId}/primary`, but is otherwise the same as
         * [ChannelServiceAsync.setPrimary].
         */
        fun setPrimary(
            channelId: String,
            params: ChannelSetPrimaryParams,
        ): CompletableFuture<HttpResponseFor<ChannelSetPrimaryResponse>> =
            setPrimary(channelId, params, RequestOptions.none())

        /** @see setPrimary */
        fun setPrimary(
            channelId: String,
            params: ChannelSetPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelSetPrimaryResponse>> =
            setPrimary(params.toBuilder().channelId(channelId).build(), requestOptions)

        /** @see setPrimary */
        fun setPrimary(
            params: ChannelSetPrimaryParams
        ): CompletableFuture<HttpResponseFor<ChannelSetPrimaryResponse>> =
            setPrimary(params, RequestOptions.none())

        /** @see setPrimary */
        fun setPrimary(
            params: ChannelSetPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelSetPrimaryResponse>>
    }
}
