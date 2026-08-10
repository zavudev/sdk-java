// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.phonenumbers.PhoneNumberListPage
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
import java.util.function.Consumer

interface PhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService

    /** Get details of a specific phone number. */
    fun retrieve(phoneNumberId: String): PhoneNumberRetrieveResponse =
        retrieve(phoneNumberId, PhoneNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRetrieveResponse =
        retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
    ): PhoneNumberRetrieveResponse = retrieve(phoneNumberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PhoneNumberRetrieveParams): PhoneNumberRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberRetrieveResponse =
        retrieve(phoneNumberId, PhoneNumberRetrieveParams.none(), requestOptions)

    /** Update a phone number's name or sender assignment. */
    fun update(phoneNumberId: String): PhoneNumberUpdateResponse =
        update(phoneNumberId, PhoneNumberUpdateParams.none())

    /** @see update */
    fun update(
        phoneNumberId: String,
        params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberUpdateResponse =
        update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see update */
    fun update(
        phoneNumberId: String,
        params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
    ): PhoneNumberUpdateResponse = update(phoneNumberId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberUpdateResponse

    /** @see update */
    fun update(params: PhoneNumberUpdateParams): PhoneNumberUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(phoneNumberId: String, requestOptions: RequestOptions): PhoneNumberUpdateResponse =
        update(phoneNumberId, PhoneNumberUpdateParams.none(), requestOptions)

    /** List all phone numbers owned by this project. */
    fun list(): PhoneNumberListPage = list(PhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListPage

    /** @see list */
    fun list(params: PhoneNumberListParams = PhoneNumberListParams.none()): PhoneNumberListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PhoneNumberListPage =
        list(PhoneNumberListParams.none(), requestOptions)

    /**
     * Purchase an available phone number. Requires a paid plan: the Free plan cannot purchase phone
     * numbers and receives `402` with code `paid_plan_required`. Paid plans include one US number
     * at no charge. The included number is one per account and is granted once: claiming it spends
     * the benefit for good, so releasing that number does not make another one free, and numbers
     * the account already bought do not consume it.
     */
    fun purchase(params: PhoneNumberPurchaseParams): PhoneNumberPurchaseResponse =
        purchase(params, RequestOptions.none())

    /** @see purchase */
    fun purchase(
        params: PhoneNumberPurchaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberPurchaseResponse

    /** Release a phone number. The phone number must not be assigned to a sender. */
    fun release(phoneNumberId: String) = release(phoneNumberId, PhoneNumberReleaseParams.none())

    /** @see release */
    fun release(
        phoneNumberId: String,
        params: PhoneNumberReleaseParams = PhoneNumberReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = release(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see release */
    fun release(
        phoneNumberId: String,
        params: PhoneNumberReleaseParams = PhoneNumberReleaseParams.none(),
    ) = release(phoneNumberId, params, RequestOptions.none())

    /** @see release */
    fun release(
        params: PhoneNumberReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see release */
    fun release(params: PhoneNumberReleaseParams) = release(params, RequestOptions.none())

    /** @see release */
    fun release(phoneNumberId: String, requestOptions: RequestOptions) =
        release(phoneNumberId, PhoneNumberReleaseParams.none(), requestOptions)

    /**
     * Get regulatory requirements for purchasing phone numbers in a specific country. Some
     * countries require additional documentation (addresses, identity documents) before phone
     * numbers can be activated.
     */
    fun requirements(params: PhoneNumberRequirementsParams): PhoneNumberRequirementsResponse =
        requirements(params, RequestOptions.none())

    /** @see requirements */
    fun requirements(
        params: PhoneNumberRequirementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRequirementsResponse

    /** Search for available phone numbers to purchase by country and type. */
    fun searchAvailable(
        params: PhoneNumberSearchAvailableParams
    ): PhoneNumberSearchAvailableResponse = searchAvailable(params, RequestOptions.none())

    /** @see searchAvailable */
    fun searchAvailable(
        params: PhoneNumberSearchAvailableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberSearchAvailableResponse

    /**
     * A view of [PhoneNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/phone-numbers/{phoneNumberId}`, but is otherwise
         * the same as [PhoneNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumberId: String): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(phoneNumberId, PhoneNumberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumberId: String,
            params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumberId: String,
            params: PhoneNumberRetrieveParams = PhoneNumberRetrieveParams.none(),
        ): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(phoneNumberId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberRetrieveParams
        ): HttpResponseFor<PhoneNumberRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(phoneNumberId, PhoneNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/phone-numbers/{phoneNumberId}`, but is
         * otherwise the same as [PhoneNumberService.update].
         */
        @MustBeClosed
        fun update(phoneNumberId: String): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(phoneNumberId, PhoneNumberUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumberId: String,
            params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumberId: String,
            params: PhoneNumberUpdateParams = PhoneNumberUpdateParams.none(),
        ): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(phoneNumberId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: PhoneNumberUpdateParams): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(phoneNumberId, PhoneNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/phone-numbers`, but is otherwise the same as
         * [PhoneNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PhoneNumberListPage> = list(PhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none()
        ): HttpResponseFor<PhoneNumberListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PhoneNumberListPage> =
            list(PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/phone-numbers`, but is otherwise the same as
         * [PhoneNumberService.purchase].
         */
        @MustBeClosed
        fun purchase(
            params: PhoneNumberPurchaseParams
        ): HttpResponseFor<PhoneNumberPurchaseResponse> = purchase(params, RequestOptions.none())

        /** @see purchase */
        @MustBeClosed
        fun purchase(
            params: PhoneNumberPurchaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberPurchaseResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/phone-numbers/{phoneNumberId}`, but is
         * otherwise the same as [PhoneNumberService.release].
         */
        @MustBeClosed
        fun release(phoneNumberId: String): HttpResponse =
            release(phoneNumberId, PhoneNumberReleaseParams.none())

        /** @see release */
        @MustBeClosed
        fun release(
            phoneNumberId: String,
            params: PhoneNumberReleaseParams = PhoneNumberReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            release(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see release */
        @MustBeClosed
        fun release(
            phoneNumberId: String,
            params: PhoneNumberReleaseParams = PhoneNumberReleaseParams.none(),
        ): HttpResponse = release(phoneNumberId, params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(
            params: PhoneNumberReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see release */
        @MustBeClosed
        fun release(params: PhoneNumberReleaseParams): HttpResponse =
            release(params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(phoneNumberId: String, requestOptions: RequestOptions): HttpResponse =
            release(phoneNumberId, PhoneNumberReleaseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/phone-numbers/requirements`, but is otherwise
         * the same as [PhoneNumberService.requirements].
         */
        @MustBeClosed
        fun requirements(
            params: PhoneNumberRequirementsParams
        ): HttpResponseFor<PhoneNumberRequirementsResponse> =
            requirements(params, RequestOptions.none())

        /** @see requirements */
        @MustBeClosed
        fun requirements(
            params: PhoneNumberRequirementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRequirementsResponse>

        /**
         * Returns a raw HTTP response for `get /v1/phone-numbers/available`, but is otherwise the
         * same as [PhoneNumberService.searchAvailable].
         */
        @MustBeClosed
        fun searchAvailable(
            params: PhoneNumberSearchAvailableParams
        ): HttpResponseFor<PhoneNumberSearchAvailableResponse> =
            searchAvailable(params, RequestOptions.none())

        /** @see searchAvailable */
        @MustBeClosed
        fun searchAvailable(
            params: PhoneNumberSearchAvailableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberSearchAvailableResponse>
    }
}
