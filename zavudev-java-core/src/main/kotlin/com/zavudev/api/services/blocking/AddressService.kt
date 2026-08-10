// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.addresses.AddressCreateParams
import com.zavudev.api.models.addresses.AddressCreateResponse
import com.zavudev.api.models.addresses.AddressDeleteParams
import com.zavudev.api.models.addresses.AddressListPage
import com.zavudev.api.models.addresses.AddressListParams
import com.zavudev.api.models.addresses.AddressRetrieveParams
import com.zavudev.api.models.addresses.AddressRetrieveResponse
import java.util.function.Consumer

interface AddressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressService

    /**
     * Create a regulatory address for phone number purchases. Some countries require a verified
     * address before phone numbers can be activated.
     */
    fun create(params: AddressCreateParams): AddressCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressCreateResponse

    /** Get a specific regulatory address. */
    fun retrieve(addressId: String): AddressRetrieveResponse =
        retrieve(addressId, AddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        addressId: String,
        params: AddressRetrieveParams = AddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressRetrieveResponse =
        retrieve(params.toBuilder().addressId(addressId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        addressId: String,
        params: AddressRetrieveParams = AddressRetrieveParams.none(),
    ): AddressRetrieveResponse = retrieve(addressId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AddressRetrieveParams): AddressRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(addressId: String, requestOptions: RequestOptions): AddressRetrieveResponse =
        retrieve(addressId, AddressRetrieveParams.none(), requestOptions)

    /** List regulatory addresses for this project. */
    fun list(): AddressListPage = list(AddressListParams.none())

    /** @see list */
    fun list(
        params: AddressListParams = AddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressListPage

    /** @see list */
    fun list(params: AddressListParams = AddressListParams.none()): AddressListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AddressListPage =
        list(AddressListParams.none(), requestOptions)

    /** Delete a regulatory address. Cannot delete addresses that are in use. */
    fun delete(addressId: String) = delete(addressId, AddressDeleteParams.none())

    /** @see delete */
    fun delete(
        addressId: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().addressId(addressId).build(), requestOptions)

    /** @see delete */
    fun delete(addressId: String, params: AddressDeleteParams = AddressDeleteParams.none()) =
        delete(addressId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: AddressDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AddressDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(addressId: String, requestOptions: RequestOptions) =
        delete(addressId, AddressDeleteParams.none(), requestOptions)

    /** A view of [AddressService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/addresses`, but is otherwise the same as
         * [AddressService.create].
         */
        @MustBeClosed
        fun create(params: AddressCreateParams): HttpResponseFor<AddressCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/addresses/{addressId}`, but is otherwise the
         * same as [AddressService.retrieve].
         */
        @MustBeClosed
        fun retrieve(addressId: String): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(addressId, AddressRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            addressId: String,
            params: AddressRetrieveParams = AddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(params.toBuilder().addressId(addressId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            addressId: String,
            params: AddressRetrieveParams = AddressRetrieveParams.none(),
        ): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(addressId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AddressRetrieveParams): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            addressId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(addressId, AddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/addresses`, but is otherwise the same as
         * [AddressService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AddressListPage> = list(AddressListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AddressListParams = AddressListParams.none()
        ): HttpResponseFor<AddressListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AddressListPage> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/addresses/{addressId}`, but is otherwise the
         * same as [AddressService.delete].
         */
        @MustBeClosed
        fun delete(addressId: String): HttpResponse = delete(addressId, AddressDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            addressId: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().addressId(addressId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            addressId: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
        ): HttpResponse = delete(addressId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AddressDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(addressId: String, requestOptions: RequestOptions): HttpResponse =
            delete(addressId, AddressDeleteParams.none(), requestOptions)
    }
}
