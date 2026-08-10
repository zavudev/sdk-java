// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.phonenumbers.PhoneNumberListPageAsync
import com.zavudev.api.models.phonenumbers.PhoneNumberListParams
import com.zavudev.api.models.phonenumbers.PhoneNumberPurchaseParams
import com.zavudev.api.models.phonenumbers.PhoneNumberPurchaseResponse
import com.zavudev.api.models.phonenumbers.PhoneNumberReleaseParams
import com.zavudev.api.models.phonenumbers.PhoneNumberRequirementsParams
import com.zavudev.api.models.phonenumbers.PhoneNumberRequirementsResponse
import com.zavudev.api.models.phonenumbers.PhoneNumberRetrieveParams
import com.zavudev.api.models.phonenumbers.PhoneNumberRetrieveResponse
import com.zavudev.api.models.phonenumbers.PhoneNumberSearchAvailableParams
import com.zavudev.api.models.phonenumbers.PhoneNumberSearchAvailableResponse
import com.zavudev.api.models.phonenumbers.PhoneNumberUpdateParams
import com.zavudev.api.models.phonenumbers.PhoneNumberUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync

    /** Get details of a specific phone number. */
    fun retrieve(phoneNumberId: String): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(phoneNumberId, PhoneNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
    ): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(phoneNumberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams
    ): CompletableFuture<PhoneNumberRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(phoneNumberId, PhoneNumberRetrieveParams.none(), requestOptions)

    /** Update a phone number's name or sender assignment. */
    fun update(phoneNumberId: String): CompletableFuture<PhoneNumberUpdateResponse> =
        update(phoneNumberId, PhoneNumberUpdateParams.none())

    /** @see update */
    fun update(
        phoneNumberId: String,
        params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberUpdateResponse> =
        update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see update */
    fun update(
        phoneNumberId: String,
        params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
    ): CompletableFuture<PhoneNumberUpdateResponse> =
        update(phoneNumberId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberUpdateResponse>

    /** @see update */
    fun update(params: PhoneNumberUpdateParams): CompletableFuture<PhoneNumberUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        phoneNumberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberUpdateResponse> =
        update(phoneNumberId, PhoneNumberUpdateParams.none(), requestOptions)

    /** List all phone numbers owned by this project. */
    fun list(): CompletableFuture<PhoneNumberListPageAsync> = list(PhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListPageAsync>

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none()
    ): CompletableFuture<PhoneNumberListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PhoneNumberListPageAsync> =
        list(PhoneNumberListParams.none(), requestOptions)

    /**
     * Purchase an available phone number. Requires a paid plan: the Free plan cannot purchase phone
     * numbers and receives `402` with code `paid_plan_required`. Paid plans include one US number
     * at no charge. The included number is one per account and is granted once: claiming it spends
     * the benefit for good, so releasing that number does not make another one free, and numbers
     * the account already bought do not consume it.
     */
    fun purchase(
        params: PhoneNumberPurchaseParams
    ): CompletableFuture<PhoneNumberPurchaseResponse> = purchase(params, RequestOptions.none())

    /** @see purchase */
    fun purchase(
        params: PhoneNumberPurchaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberPurchaseResponse>

    /** Release a phone number. The phone number must not be assigned to a sender. */
    fun release(phoneNumberId: String): CompletableFuture<Void?> =
        release(phoneNumberId, PhoneNumberReleaseParams.none())

    /** @see release */
    fun release(
        phoneNumberId: String,
        params: PhoneNumberReleaseParams = PhoneNumberReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        release(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see release */
    fun release(
        phoneNumberId: String,
        params: PhoneNumberReleaseParams = PhoneNumberReleaseParams.none(),
    ): CompletableFuture<Void?> = release(phoneNumberId, params, RequestOptions.none())

    /** @see release */
    fun release(
        params: PhoneNumberReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see release */
    fun release(params: PhoneNumberReleaseParams): CompletableFuture<Void?> =
        release(params, RequestOptions.none())

    /** @see release */
    fun release(phoneNumberId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        release(phoneNumberId, PhoneNumberReleaseParams.none(), requestOptions)

    /**
     * Get regulatory requirements for purchasing phone numbers in a specific country. Some
     * countries require additional documentation (addresses, identity documents) before phone
     * numbers can be activated.
     */
    fun requirements(
        params: PhoneNumberRequirementsParams
    ): CompletableFuture<PhoneNumberRequirementsResponse> =
        requirements(params, RequestOptions.none())

    /** @see requirements */
    fun requirements(
        params: PhoneNumberRequirementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRequirementsResponse>

    /** Search for available phone numbers to purchase by country and type. */
    fun searchAvailable(
        params: PhoneNumberSearchAvailableParams
    ): CompletableFuture<PhoneNumberSearchAvailableResponse> =
        searchAvailable(params, RequestOptions.none())

    /** @see searchAvailable */
    fun searchAvailable(
        params: PhoneNumberSearchAvailableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberSearchAvailableResponse>

    /**
     * A view of [PhoneNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): PhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/phone-numbers/{phoneNumberId}`, but is otherwise
         * the same as [PhoneNumberServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumberId: String
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(phoneNumberId, PhoneNumberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumberId: String,
            params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            phoneNumberId: String,
            params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(phoneNumberId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(phoneNumberId, PhoneNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/phone-numbers/{phoneNumberId}`, but is
         * otherwise the same as [PhoneNumberServiceAsync.update].
         */
        fun update(
            phoneNumberId: String
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(phoneNumberId, PhoneNumberUpdateParams.none())

        /** @see update */
        fun update(
            phoneNumberId: String,
            params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see update */
        fun update(
            phoneNumberId: String,
            params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(phoneNumberId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>>

        /** @see update */
        fun update(
            params: PhoneNumberUpdateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            phoneNumberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(phoneNumberId, PhoneNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/phone-numbers`, but is otherwise the same as
         * [PhoneNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(PhoneNumberListParams.none())

        /** @see list */
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>>

        /** @see list */
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/phone-numbers`, but is otherwise the same as
         * [PhoneNumberServiceAsync.purchase].
         */
        fun purchase(
            params: PhoneNumberPurchaseParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberPurchaseResponse>> =
            purchase(params, RequestOptions.none())

        /** @see purchase */
        fun purchase(
            params: PhoneNumberPurchaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberPurchaseResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/phone-numbers/{phoneNumberId}`, but is
         * otherwise the same as [PhoneNumberServiceAsync.release].
         */
        fun release(phoneNumberId: String): CompletableFuture<HttpResponse> =
            release(phoneNumberId, PhoneNumberReleaseParams.none())

        /** @see release */
        fun release(
            phoneNumberId: String,
            params: PhoneNumberReleaseParams = PhoneNumberReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            release(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see release */
        fun release(
            phoneNumberId: String,
            params: PhoneNumberReleaseParams = PhoneNumberReleaseParams.none(),
        ): CompletableFuture<HttpResponse> = release(phoneNumberId, params, RequestOptions.none())

        /** @see release */
        fun release(
            params: PhoneNumberReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see release */
        fun release(params: PhoneNumberReleaseParams): CompletableFuture<HttpResponse> =
            release(params, RequestOptions.none())

        /** @see release */
        fun release(
            phoneNumberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            release(phoneNumberId, PhoneNumberReleaseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/phone-numbers/requirements`, but is otherwise
         * the same as [PhoneNumberServiceAsync.requirements].
         */
        fun requirements(
            params: PhoneNumberRequirementsParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberRequirementsResponse>> =
            requirements(params, RequestOptions.none())

        /** @see requirements */
        fun requirements(
            params: PhoneNumberRequirementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRequirementsResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/phone-numbers/available`, but is otherwise the
         * same as [PhoneNumberServiceAsync.searchAvailable].
         */
        fun searchAvailable(
            params: PhoneNumberSearchAvailableParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberSearchAvailableResponse>> =
            searchAvailable(params, RequestOptions.none())

        /** @see searchAvailable */
        fun searchAvailable(
            params: PhoneNumberSearchAvailableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberSearchAvailableResponse>>
    }
}
