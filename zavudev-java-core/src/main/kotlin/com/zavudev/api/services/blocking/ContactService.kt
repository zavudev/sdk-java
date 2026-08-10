// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.contacts.Contact
import com.zavudev.api.models.contacts.ContactCreateParams
import com.zavudev.api.models.contacts.ContactDeleteParams
import com.zavudev.api.models.contacts.ContactDismissMergeSuggestionParams
import com.zavudev.api.models.contacts.ContactListPage
import com.zavudev.api.models.contacts.ContactListParams
import com.zavudev.api.models.contacts.ContactMergeParams
import com.zavudev.api.models.contacts.ContactRetrieveByPhoneParams
import com.zavudev.api.models.contacts.ContactRetrieveParams
import com.zavudev.api.models.contacts.ContactUpdateParams
import com.zavudev.api.services.blocking.contacts.ChannelService
import java.util.function.Consumer

interface ContactService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService

    fun channels(): ChannelService

    /** Create a new contact with one or more communication channels. */
    fun create(params: ContactCreateParams): Contact = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact

    /** Get contact */
    fun retrieve(contactId: String): Contact = retrieve(contactId, ContactRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact = retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
    ): Contact = retrieve(contactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact

    /** @see retrieve */
    fun retrieve(params: ContactRetrieveParams): Contact = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(contactId: String, requestOptions: RequestOptions): Contact =
        retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

    /** Update contact */
    fun update(contactId: String): Contact = update(contactId, ContactUpdateParams.none())

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams = ContactUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact = update(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams = ContactUpdateParams.none(),
    ): Contact = update(contactId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact

    /** @see update */
    fun update(params: ContactUpdateParams): Contact = update(params, RequestOptions.none())

    /** @see update */
    fun update(contactId: String, requestOptions: RequestOptions): Contact =
        update(contactId, ContactUpdateParams.none(), requestOptions)

    /** List contacts with their communication channels. */
    fun list(): ContactListPage = list(ContactListParams.none())

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactListPage

    /** @see list */
    fun list(params: ContactListParams = ContactListParams.none()): ContactListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ContactListPage =
        list(ContactListParams.none(), requestOptions)

    /**
     * Permanently delete a contact and its communication channels. Implements right-to-erasure
     * obligations under GDPR Art. 17, Ley 19.628 (Chile) Art. 12, CCPA § 1798.105, and LGPD Art.
     * 18.VI. The contact, its channels, and any associated agent flow sessions and conversation
     * threads are removed. Past message records and broadcast delivery logs are retained for
     * billing/audit but no longer reference the deleted contact.
     */
    fun delete(contactId: String) = delete(contactId, ContactDeleteParams.none())

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see delete */
    fun delete(contactId: String, params: ContactDeleteParams = ContactDeleteParams.none()) =
        delete(contactId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ContactDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ContactDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contactId: String, requestOptions: RequestOptions) =
        delete(contactId, ContactDeleteParams.none(), requestOptions)

    /** Dismiss the merge suggestion for a contact. */
    fun dismissMergeSuggestion(contactId: String) =
        dismissMergeSuggestion(contactId, ContactDismissMergeSuggestionParams.none())

    /** @see dismissMergeSuggestion */
    fun dismissMergeSuggestion(
        contactId: String,
        params: ContactDismissMergeSuggestionParams = ContactDismissMergeSuggestionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = dismissMergeSuggestion(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see dismissMergeSuggestion */
    fun dismissMergeSuggestion(
        contactId: String,
        params: ContactDismissMergeSuggestionParams = ContactDismissMergeSuggestionParams.none(),
    ) = dismissMergeSuggestion(contactId, params, RequestOptions.none())

    /** @see dismissMergeSuggestion */
    fun dismissMergeSuggestion(
        params: ContactDismissMergeSuggestionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see dismissMergeSuggestion */
    fun dismissMergeSuggestion(params: ContactDismissMergeSuggestionParams) =
        dismissMergeSuggestion(params, RequestOptions.none())

    /** @see dismissMergeSuggestion */
    fun dismissMergeSuggestion(contactId: String, requestOptions: RequestOptions) =
        dismissMergeSuggestion(
            contactId,
            ContactDismissMergeSuggestionParams.none(),
            requestOptions,
        )

    /**
     * Merge a source contact into this contact. All channels from the source contact will be moved
     * to the target contact, and the source contact will be marked as merged.
     */
    fun merge(contactId: String, params: ContactMergeParams): Contact =
        merge(contactId, params, RequestOptions.none())

    /** @see merge */
    fun merge(
        contactId: String,
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact = merge(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see merge */
    fun merge(params: ContactMergeParams): Contact = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact

    /** Get contact by phone number */
    fun retrieveByPhone(phoneNumber: String): Contact =
        retrieveByPhone(phoneNumber, ContactRetrieveByPhoneParams.none())

    /** @see retrieveByPhone */
    fun retrieveByPhone(
        phoneNumber: String,
        params: ContactRetrieveByPhoneParams = ContactRetrieveByPhoneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact =
        retrieveByPhone(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieveByPhone */
    fun retrieveByPhone(
        phoneNumber: String,
        params: ContactRetrieveByPhoneParams = ContactRetrieveByPhoneParams.none(),
    ): Contact = retrieveByPhone(phoneNumber, params, RequestOptions.none())

    /** @see retrieveByPhone */
    fun retrieveByPhone(
        params: ContactRetrieveByPhoneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Contact

    /** @see retrieveByPhone */
    fun retrieveByPhone(params: ContactRetrieveByPhoneParams): Contact =
        retrieveByPhone(params, RequestOptions.none())

    /** @see retrieveByPhone */
    fun retrieveByPhone(phoneNumber: String, requestOptions: RequestOptions): Contact =
        retrieveByPhone(phoneNumber, ContactRetrieveByPhoneParams.none(), requestOptions)

    /** A view of [ContactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService.WithRawResponse

        fun channels(): ChannelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contacts`, but is otherwise the same as
         * [ContactService.create].
         */
        @MustBeClosed
        fun create(params: ContactCreateParams): HttpResponseFor<Contact> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact>

        /**
         * Returns a raw HTTP response for `get /v1/contacts/{contactId}`, but is otherwise the same
         * as [ContactService.retrieve].
         */
        @MustBeClosed
        fun retrieve(contactId: String): HttpResponseFor<Contact> =
            retrieve(contactId, ContactRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact> =
            retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
        ): HttpResponseFor<Contact> = retrieve(contactId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ContactRetrieveParams): HttpResponseFor<Contact> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(contactId: String, requestOptions: RequestOptions): HttpResponseFor<Contact> =
            retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/contacts/{contactId}`, but is otherwise the
         * same as [ContactService.update].
         */
        @MustBeClosed
        fun update(contactId: String): HttpResponseFor<Contact> =
            update(contactId, ContactUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            contactId: String,
            params: ContactUpdateParams = ContactUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact> =
            update(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            contactId: String,
            params: ContactUpdateParams = ContactUpdateParams.none(),
        ): HttpResponseFor<Contact> = update(contactId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact>

        /** @see update */
        @MustBeClosed
        fun update(params: ContactUpdateParams): HttpResponseFor<Contact> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(contactId: String, requestOptions: RequestOptions): HttpResponseFor<Contact> =
            update(contactId, ContactUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/contacts`, but is otherwise the same as
         * [ContactService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ContactListPage> = list(ContactListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContactListParams = ContactListParams.none()
        ): HttpResponseFor<ContactListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ContactListPage> =
            list(ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/contacts/{contactId}`, but is otherwise the
         * same as [ContactService.delete].
         */
        @MustBeClosed
        fun delete(contactId: String): HttpResponse = delete(contactId, ContactDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
        ): HttpResponse = delete(contactId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ContactDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(contactId: String, requestOptions: RequestOptions): HttpResponse =
            delete(contactId, ContactDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/contacts/{contactId}/merge-suggestion`, but
         * is otherwise the same as [ContactService.dismissMergeSuggestion].
         */
        @MustBeClosed
        fun dismissMergeSuggestion(contactId: String): HttpResponse =
            dismissMergeSuggestion(contactId, ContactDismissMergeSuggestionParams.none())

        /** @see dismissMergeSuggestion */
        @MustBeClosed
        fun dismissMergeSuggestion(
            contactId: String,
            params: ContactDismissMergeSuggestionParams =
                ContactDismissMergeSuggestionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            dismissMergeSuggestion(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see dismissMergeSuggestion */
        @MustBeClosed
        fun dismissMergeSuggestion(
            contactId: String,
            params: ContactDismissMergeSuggestionParams = ContactDismissMergeSuggestionParams.none(),
        ): HttpResponse = dismissMergeSuggestion(contactId, params, RequestOptions.none())

        /** @see dismissMergeSuggestion */
        @MustBeClosed
        fun dismissMergeSuggestion(
            params: ContactDismissMergeSuggestionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see dismissMergeSuggestion */
        @MustBeClosed
        fun dismissMergeSuggestion(params: ContactDismissMergeSuggestionParams): HttpResponse =
            dismissMergeSuggestion(params, RequestOptions.none())

        /** @see dismissMergeSuggestion */
        @MustBeClosed
        fun dismissMergeSuggestion(
            contactId: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            dismissMergeSuggestion(
                contactId,
                ContactDismissMergeSuggestionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/contacts/{contactId}/merge`, but is otherwise
         * the same as [ContactService.merge].
         */
        @MustBeClosed
        fun merge(contactId: String, params: ContactMergeParams): HttpResponseFor<Contact> =
            merge(contactId, params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            contactId: String,
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact> =
            merge(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see merge */
        @MustBeClosed
        fun merge(params: ContactMergeParams): HttpResponseFor<Contact> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact>

        /**
         * Returns a raw HTTP response for `get /v1/contacts/phone/{phoneNumber}`, but is otherwise
         * the same as [ContactService.retrieveByPhone].
         */
        @MustBeClosed
        fun retrieveByPhone(phoneNumber: String): HttpResponseFor<Contact> =
            retrieveByPhone(phoneNumber, ContactRetrieveByPhoneParams.none())

        /** @see retrieveByPhone */
        @MustBeClosed
        fun retrieveByPhone(
            phoneNumber: String,
            params: ContactRetrieveByPhoneParams = ContactRetrieveByPhoneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact> =
            retrieveByPhone(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieveByPhone */
        @MustBeClosed
        fun retrieveByPhone(
            phoneNumber: String,
            params: ContactRetrieveByPhoneParams = ContactRetrieveByPhoneParams.none(),
        ): HttpResponseFor<Contact> = retrieveByPhone(phoneNumber, params, RequestOptions.none())

        /** @see retrieveByPhone */
        @MustBeClosed
        fun retrieveByPhone(
            params: ContactRetrieveByPhoneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Contact>

        /** @see retrieveByPhone */
        @MustBeClosed
        fun retrieveByPhone(params: ContactRetrieveByPhoneParams): HttpResponseFor<Contact> =
            retrieveByPhone(params, RequestOptions.none())

        /** @see retrieveByPhone */
        @MustBeClosed
        fun retrieveByPhone(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Contact> =
            retrieveByPhone(phoneNumber, ContactRetrieveByPhoneParams.none(), requestOptions)
    }
}
