// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.broadcasts

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.broadcasts.contacts.ContactAddParams
import com.zavudev.api.models.broadcasts.contacts.ContactAddResponse
import com.zavudev.api.models.broadcasts.contacts.ContactListPageAsync
import com.zavudev.api.models.broadcasts.contacts.ContactListParams
import com.zavudev.api.models.broadcasts.contacts.ContactRemoveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ContactServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactServiceAsync

    /** List contacts in a broadcast with optional status filter. */
    fun list(broadcastId: String): CompletableFuture<ContactListPageAsync> =
        list(broadcastId, ContactListParams.none())

    /** @see list */
    fun list(
        broadcastId: String,
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactListPageAsync> =
        list(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see list */
    fun list(
        broadcastId: String,
        params: ContactListParams = ContactListParams.none(),
    ): CompletableFuture<ContactListPageAsync> = list(broadcastId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ContactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactListPageAsync>

    /** @see list */
    fun list(params: ContactListParams): CompletableFuture<ContactListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactListPageAsync> =
        list(broadcastId, ContactListParams.none(), requestOptions)

    /** Add contacts to a broadcast in batch. Maximum 1000 contacts per request. */
    fun add(broadcastId: String, params: ContactAddParams): CompletableFuture<ContactAddResponse> =
        add(broadcastId, params, RequestOptions.none())

    /** @see add */
    fun add(
        broadcastId: String,
        params: ContactAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactAddResponse> =
        add(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see add */
    fun add(params: ContactAddParams): CompletableFuture<ContactAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: ContactAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactAddResponse>

    /** Remove a contact from a broadcast in draft status. */
    fun remove(contactId: String, params: ContactRemoveParams): CompletableFuture<Void?> =
        remove(contactId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        contactId: String,
        params: ContactRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        remove(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see remove */
    fun remove(params: ContactRemoveParams): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: ContactRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ContactServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/broadcasts/{broadcastId}/contacts`, but is
         * otherwise the same as [ContactServiceAsync.list].
         */
        fun list(broadcastId: String): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(broadcastId, ContactListParams.none())

        /** @see list */
        fun list(
            broadcastId: String,
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see list */
        fun list(
            broadcastId: String,
            params: ContactListParams = ContactListParams.none(),
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(broadcastId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ContactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>>

        /** @see list */
        fun list(
            params: ContactListParams
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(broadcastId, ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/broadcasts/{broadcastId}/contacts`, but is
         * otherwise the same as [ContactServiceAsync.add].
         */
        fun add(
            broadcastId: String,
            params: ContactAddParams,
        ): CompletableFuture<HttpResponseFor<ContactAddResponse>> =
            add(broadcastId, params, RequestOptions.none())

        /** @see add */
        fun add(
            broadcastId: String,
            params: ContactAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactAddResponse>> =
            add(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see add */
        fun add(params: ContactAddParams): CompletableFuture<HttpResponseFor<ContactAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: ContactAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactAddResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/broadcasts/{broadcastId}/contacts/{contactId}`, but is otherwise the same as
         * [ContactServiceAsync.remove].
         */
        fun remove(
            contactId: String,
            params: ContactRemoveParams,
        ): CompletableFuture<HttpResponse> = remove(contactId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            contactId: String,
            params: ContactRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            remove(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see remove */
        fun remove(params: ContactRemoveParams): CompletableFuture<HttpResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: ContactRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
