// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.contacts.Contact
import com.zavudev.api.models.contacts.ContactCreateParams
import com.zavudev.api.models.contacts.ContactDeleteParams
import com.zavudev.api.models.contacts.ContactListPageAsync
import com.zavudev.api.models.contacts.ContactListParams
import com.zavudev.api.models.contacts.ContactMergeParams
import com.zavudev.api.models.contacts.ContactRetrieveByPhoneParams
import com.zavudev.api.models.contacts.ContactRetrieveParams
import com.zavudev.api.models.contacts.ContactUpdateParams
import com.zavudev.api.services.async.contacts.ChannelServiceAsync
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

    fun channels(): ChannelServiceAsync

    /** Create a new contact with one or more communication channels. */
    fun create(params: ContactCreateParams): CompletableFuture<Contact> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact>

    /** Get contact */
    fun retrieve(contactId: String): CompletableFuture<Contact> =
        retrieve(contactId, ContactRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact> =
        retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
    ): CompletableFuture<Contact> = retrieve(contactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact>

    /** @see retrieve */
    fun retrieve(params: ContactRetrieveParams): CompletableFuture<Contact> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(contactId: String, requestOptions: RequestOptions): CompletableFuture<Contact> =
        retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

    /** Update contact */
    fun update(contactId: String): CompletableFuture<Contact> =
        update(contactId, ContactUpdateParams.none())

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams = ContactUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact> =
        update(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams = ContactUpdateParams.none(),
    ): CompletableFuture<Contact> = update(contactId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact>

    /** @see update */
    fun update(params: ContactUpdateParams): CompletableFuture<Contact> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(contactId: String, requestOptions: RequestOptions): CompletableFuture<Contact> =
        update(contactId, ContactUpdateParams.none(), requestOptions)

    /** List contacts with their communication channels. */
    fun list(): CompletableFuture<ContactListPageAsync> = list(ContactListParams.none())

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactListPageAsync>

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none()
    ): CompletableFuture<ContactListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ContactListPageAsync> =
        list(ContactListParams.none(), requestOptions)

    /**
     * Permanently delete a contact and its communication channels. Implements right-to-erasure
     * obligations under GDPR Art. 17, Ley 19.628 (Chile) Art. 12, CCPA § 1798.105, and LGPD Art.
     * 18.VI. The contact, its channels, and any associated agent flow sessions and conversation
     * threads are removed. Past message records and broadcast delivery logs are retained for
     * billing/audit but no longer reference the deleted contact.
     */
    fun delete(contactId: String): CompletableFuture<Void?> =
        delete(contactId, ContactDeleteParams.none())

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(contactId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ContactDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contactId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(contactId, ContactDeleteParams.none(), requestOptions)

    /**
     * Merge a source contact into this contact. All channels from the source contact will be moved
     * to the target contact, and the source contact will be marked as merged.
     */
    fun merge(contactId: String, params: ContactMergeParams): CompletableFuture<Contact> =
        merge(contactId, params, RequestOptions.none())

    /** @see merge */
    fun merge(
        contactId: String,
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact> =
        merge(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see merge */
    fun merge(params: ContactMergeParams): CompletableFuture<Contact> =
        merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact>

    /** Get contact by phone number */
    fun retrieveByPhone(phoneNumber: String): CompletableFuture<Contact> =
        retrieveByPhone(phoneNumber, ContactRetrieveByPhoneParams.none())

    /** @see retrieveByPhone */
    fun retrieveByPhone(
        phoneNumber: String,
        params: ContactRetrieveByPhoneParams = ContactRetrieveByPhoneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact> =
        retrieveByPhone(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieveByPhone */
    fun retrieveByPhone(
        phoneNumber: String,
        params: ContactRetrieveByPhoneParams = ContactRetrieveByPhoneParams.none(),
    ): CompletableFuture<Contact> = retrieveByPhone(phoneNumber, params, RequestOptions.none())

    /** @see retrieveByPhone */
    fun retrieveByPhone(
        params: ContactRetrieveByPhoneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contact>

    /** @see retrieveByPhone */
    fun retrieveByPhone(params: ContactRetrieveByPhoneParams): CompletableFuture<Contact> =
        retrieveByPhone(params, RequestOptions.none())

    /** @see retrieveByPhone */
    fun retrieveByPhone(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Contact> =
        retrieveByPhone(phoneNumber, ContactRetrieveByPhoneParams.none(), requestOptions)

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

        fun channels(): ChannelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contacts`, but is otherwise the same as
         * [ContactServiceAsync.create].
         */
        fun create(params: ContactCreateParams): CompletableFuture<HttpResponseFor<Contact>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>>

        /**
         * Returns a raw HTTP response for `get /v1/contacts/{contactId}`, but is otherwise the same
         * as [ContactServiceAsync.retrieve].
         */
        fun retrieve(contactId: String): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(contactId, ContactRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(contactId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>>

        /** @see retrieve */
        fun retrieve(params: ContactRetrieveParams): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/contacts/{contactId}`, but is otherwise the
         * same as [ContactServiceAsync.update].
         */
        fun update(contactId: String): CompletableFuture<HttpResponseFor<Contact>> =
            update(contactId, ContactUpdateParams.none())

        /** @see update */
        fun update(
            contactId: String,
            params: ContactUpdateParams = ContactUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            update(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see update */
        fun update(
            contactId: String,
            params: ContactUpdateParams = ContactUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            update(contactId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>>

        /** @see update */
        fun update(params: ContactUpdateParams): CompletableFuture<HttpResponseFor<Contact>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> =
            update(contactId, ContactUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/contacts`, but is otherwise the same as
         * [ContactServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(ContactListParams.none())

        /** @see list */
        fun list(
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>>

        /** @see list */
        fun list(
            params: ContactListParams = ContactListParams.none()
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/contacts/{contactId}`, but is otherwise the
         * same as [ContactServiceAsync.delete].
         */
        fun delete(contactId: String): CompletableFuture<HttpResponse> =
            delete(contactId, ContactDeleteParams.none())

        /** @see delete */
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see delete */
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(contactId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ContactDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(contactId, ContactDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/contacts/{contactId}/merge`, but is otherwise
         * the same as [ContactServiceAsync.merge].
         */
        fun merge(
            contactId: String,
            params: ContactMergeParams,
        ): CompletableFuture<HttpResponseFor<Contact>> =
            merge(contactId, params, RequestOptions.none())

        /** @see merge */
        fun merge(
            contactId: String,
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            merge(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see merge */
        fun merge(params: ContactMergeParams): CompletableFuture<HttpResponseFor<Contact>> =
            merge(params, RequestOptions.none())

        /** @see merge */
        fun merge(
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>>

        /**
         * Returns a raw HTTP response for `get /v1/contacts/phone/{phoneNumber}`, but is otherwise
         * the same as [ContactServiceAsync.retrieveByPhone].
         */
        fun retrieveByPhone(phoneNumber: String): CompletableFuture<HttpResponseFor<Contact>> =
            retrieveByPhone(phoneNumber, ContactRetrieveByPhoneParams.none())

        /** @see retrieveByPhone */
        fun retrieveByPhone(
            phoneNumber: String,
            params: ContactRetrieveByPhoneParams = ContactRetrieveByPhoneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieveByPhone(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieveByPhone */
        fun retrieveByPhone(
            phoneNumber: String,
            params: ContactRetrieveByPhoneParams = ContactRetrieveByPhoneParams.none(),
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieveByPhone(phoneNumber, params, RequestOptions.none())

        /** @see retrieveByPhone */
        fun retrieveByPhone(
            params: ContactRetrieveByPhoneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Contact>>

        /** @see retrieveByPhone */
        fun retrieveByPhone(
            params: ContactRetrieveByPhoneParams
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieveByPhone(params, RequestOptions.none())

        /** @see retrieveByPhone */
        fun retrieveByPhone(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Contact>> =
            retrieveByPhone(phoneNumber, ContactRetrieveByPhoneParams.none(), requestOptions)
    }
}
