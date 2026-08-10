// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.addresses.AddressCreateParams
import com.zavudev.api.models.addresses.AddressCreateResponse
import com.zavudev.api.models.addresses.AddressDeleteParams
import com.zavudev.api.models.addresses.AddressListPageAsync
import com.zavudev.api.models.addresses.AddressListParams
import com.zavudev.api.models.addresses.AddressRetrieveParams
import com.zavudev.api.models.addresses.AddressRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressServiceAsync

    /**
     * Create a regulatory address for phone number purchases. Some countries require a verified
     * address before phone numbers can be activated.
     */
    fun create(params: AddressCreateParams): CompletableFuture<AddressCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressCreateResponse>

    /** Get a specific regulatory address. */
    fun retrieve(addressId: String): CompletableFuture<AddressRetrieveResponse> =
        retrieve(addressId, AddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        addressId: String,
        params: AddressRetrieveParams = AddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressRetrieveResponse> =
        retrieve(params.toBuilder().addressId(addressId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        addressId: String,
        params: AddressRetrieveParams = AddressRetrieveParams.none(),
    ): CompletableFuture<AddressRetrieveResponse> =
        retrieve(addressId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AddressRetrieveParams): CompletableFuture<AddressRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        addressId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressRetrieveResponse> =
        retrieve(addressId, AddressRetrieveParams.none(), requestOptions)

    /** List regulatory addresses for this project. */
    fun list(): CompletableFuture<AddressListPageAsync> = list(AddressListParams.none())

    /** @see list */
    fun list(
        params: AddressListParams = AddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressListPageAsync>

    /** @see list */
    fun list(
        params: AddressListParams = AddressListParams.none()
    ): CompletableFuture<AddressListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AddressListPageAsync> =
        list(AddressListParams.none(), requestOptions)

    /** Delete a regulatory address. Cannot delete addresses that are in use. */
    fun delete(addressId: String): CompletableFuture<Void?> =
        delete(addressId, AddressDeleteParams.none())

    /** @see delete */
    fun delete(
        addressId: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().addressId(addressId).build(), requestOptions)

    /** @see delete */
    fun delete(
        addressId: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(addressId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AddressDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(addressId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(addressId, AddressDeleteParams.none(), requestOptions)

    /**
     * A view of [AddressServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/addresses`, but is otherwise the same as
         * [AddressServiceAsync.create].
         */
        fun create(
            params: AddressCreateParams
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/addresses/{addressId}`, but is otherwise the
         * same as [AddressServiceAsync.retrieve].
         */
        fun retrieve(
            addressId: String
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(addressId, AddressRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            addressId: String,
            params: AddressRetrieveParams = AddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(params.toBuilder().addressId(addressId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            addressId: String,
            params: AddressRetrieveParams = AddressRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(addressId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AddressRetrieveParams
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            addressId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(addressId, AddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/addresses`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AddressListPageAsync>> =
            list(AddressListParams.none())

        /** @see list */
        fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressListPageAsync>>

        /** @see list */
        fun list(
            params: AddressListParams = AddressListParams.none()
        ): CompletableFuture<HttpResponseFor<AddressListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AddressListPageAsync>> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/addresses/{addressId}`, but is otherwise the
         * same as [AddressServiceAsync.delete].
         */
        fun delete(addressId: String): CompletableFuture<HttpResponse> =
            delete(addressId, AddressDeleteParams.none())

        /** @see delete */
        fun delete(
            addressId: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().addressId(addressId).build(), requestOptions)

        /** @see delete */
        fun delete(
            addressId: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(addressId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AddressDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            addressId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(addressId, AddressDeleteParams.none(), requestOptions)
    }
}
