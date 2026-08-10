// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.subaccounts.SubAccountCreateParams
import com.zavudev.api.models.subaccounts.SubAccountCreateResponse
import com.zavudev.api.models.subaccounts.SubAccountDeactivateParams
import com.zavudev.api.models.subaccounts.SubAccountDeactivateResponse
import com.zavudev.api.models.subaccounts.SubAccountGetBalanceParams
import com.zavudev.api.models.subaccounts.SubAccountGetBalanceResponse
import com.zavudev.api.models.subaccounts.SubAccountListPageAsync
import com.zavudev.api.models.subaccounts.SubAccountListParams
import com.zavudev.api.models.subaccounts.SubAccountRetrieveParams
import com.zavudev.api.models.subaccounts.SubAccountRetrieveResponse
import com.zavudev.api.models.subaccounts.SubAccountUpdateParams
import com.zavudev.api.models.subaccounts.SubAccountUpdateResponse
import com.zavudev.api.services.async.subaccounts.ApiKeyServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubAccountServiceAsync

    fun apiKeys(): ApiKeyServiceAsync

    /**
     * Create a new sub-account (project) with its own API key. All charges are billed to the parent
     * team's balance. Use creditLimit to set a spending cap. The sub-account's API key is returned
     * only in the creation response. Requires a parent project API key; sub-account API keys
     * receive HTTP 403.
     */
    fun create(params: SubAccountCreateParams): CompletableFuture<SubAccountCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountCreateResponse>

    /**
     * Get sub-account. Requires a parent project API key; sub-account API keys receive HTTP 403.
     */
    fun retrieve(id: String): CompletableFuture<SubAccountRetrieveResponse> =
        retrieve(id, SubAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubAccountRetrieveParams = SubAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubAccountRetrieveParams = SubAccountRetrieveParams.none(),
    ): CompletableFuture<SubAccountRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: SubAccountRetrieveParams): CompletableFuture<SubAccountRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubAccountRetrieveResponse> =
        retrieve(id, SubAccountRetrieveParams.none(), requestOptions)

    /**
     * Update sub-account. Requires a parent project API key; sub-account API keys receive HTTP 403.
     */
    fun update(id: String): CompletableFuture<SubAccountUpdateResponse> =
        update(id, SubAccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SubAccountUpdateParams = SubAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SubAccountUpdateParams = SubAccountUpdateParams.none(),
    ): CompletableFuture<SubAccountUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountUpdateResponse>

    /** @see update */
    fun update(params: SubAccountUpdateParams): CompletableFuture<SubAccountUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubAccountUpdateResponse> =
        update(id, SubAccountUpdateParams.none(), requestOptions)

    /**
     * List sub-accounts for this team. Requires a parent project API key; sub-account API keys
     * receive HTTP 403.
     */
    fun list(): CompletableFuture<SubAccountListPageAsync> = list(SubAccountListParams.none())

    /** @see list */
    fun list(
        params: SubAccountListParams = SubAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountListPageAsync>

    /** @see list */
    fun list(
        params: SubAccountListParams = SubAccountListParams.none()
    ): CompletableFuture<SubAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubAccountListPageAsync> =
        list(SubAccountListParams.none(), requestOptions)

    /**
     * Deactivate a sub-account. Remaining balance is returned to the parent team and all API keys
     * are revoked. Requires a parent project API key; sub-account API keys receive HTTP 403.
     */
    fun deactivate(id: String): CompletableFuture<SubAccountDeactivateResponse> =
        deactivate(id, SubAccountDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        id: String,
        params: SubAccountDeactivateParams = SubAccountDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountDeactivateResponse> =
        deactivate(params.toBuilder().id(id).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        id: String,
        params: SubAccountDeactivateParams = SubAccountDeactivateParams.none(),
    ): CompletableFuture<SubAccountDeactivateResponse> =
        deactivate(id, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: SubAccountDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountDeactivateResponse>

    /** @see deactivate */
    fun deactivate(
        params: SubAccountDeactivateParams
    ): CompletableFuture<SubAccountDeactivateResponse> = deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubAccountDeactivateResponse> =
        deactivate(id, SubAccountDeactivateParams.none(), requestOptions)

    /**
     * Get spending information for a sub-account. Returns the parent team's balance, the
     * sub-account's total spending, and its credit limit (spending cap). Requires a parent project
     * API key; sub-account API keys receive HTTP 403.
     */
    fun getBalance(id: String): CompletableFuture<SubAccountGetBalanceResponse> =
        getBalance(id, SubAccountGetBalanceParams.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: SubAccountGetBalanceParams = SubAccountGetBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountGetBalanceResponse> =
        getBalance(params.toBuilder().id(id).build(), requestOptions)

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: SubAccountGetBalanceParams = SubAccountGetBalanceParams.none(),
    ): CompletableFuture<SubAccountGetBalanceResponse> =
        getBalance(id, params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        params: SubAccountGetBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubAccountGetBalanceResponse>

    /** @see getBalance */
    fun getBalance(
        params: SubAccountGetBalanceParams
    ): CompletableFuture<SubAccountGetBalanceResponse> = getBalance(params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubAccountGetBalanceResponse> =
        getBalance(id, SubAccountGetBalanceParams.none(), requestOptions)

    /**
     * A view of [SubAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubAccountServiceAsync.WithRawResponse

        fun apiKeys(): ApiKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/sub-accounts`, but is otherwise the same as
         * [SubAccountServiceAsync.create].
         */
        fun create(
            params: SubAccountCreateParams
        ): CompletableFuture<HttpResponseFor<SubAccountCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SubAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/sub-accounts/{id}`, but is otherwise the same as
         * [SubAccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<SubAccountRetrieveResponse>> =
            retrieve(id, SubAccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SubAccountRetrieveParams = SubAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SubAccountRetrieveParams = SubAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SubAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SubAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<SubAccountRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubAccountRetrieveResponse>> =
            retrieve(id, SubAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/sub-accounts/{id}`, but is otherwise the same
         * as [SubAccountServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<SubAccountUpdateResponse>> =
            update(id, SubAccountUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: SubAccountUpdateParams = SubAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: SubAccountUpdateParams = SubAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SubAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountUpdateResponse>>

        /** @see update */
        fun update(
            params: SubAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<SubAccountUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubAccountUpdateResponse>> =
            update(id, SubAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/sub-accounts`, but is otherwise the same as
         * [SubAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubAccountListPageAsync>> =
            list(SubAccountListParams.none())

        /** @see list */
        fun list(
            params: SubAccountListParams = SubAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountListPageAsync>>

        /** @see list */
        fun list(
            params: SubAccountListParams = SubAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<SubAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubAccountListPageAsync>> =
            list(SubAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/sub-accounts/{id}`, but is otherwise the same
         * as [SubAccountServiceAsync.deactivate].
         */
        fun deactivate(
            id: String
        ): CompletableFuture<HttpResponseFor<SubAccountDeactivateResponse>> =
            deactivate(id, SubAccountDeactivateParams.none())

        /** @see deactivate */
        fun deactivate(
            id: String,
            params: SubAccountDeactivateParams = SubAccountDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountDeactivateResponse>> =
            deactivate(params.toBuilder().id(id).build(), requestOptions)

        /** @see deactivate */
        fun deactivate(
            id: String,
            params: SubAccountDeactivateParams = SubAccountDeactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountDeactivateResponse>> =
            deactivate(id, params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            params: SubAccountDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountDeactivateResponse>>

        /** @see deactivate */
        fun deactivate(
            params: SubAccountDeactivateParams
        ): CompletableFuture<HttpResponseFor<SubAccountDeactivateResponse>> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubAccountDeactivateResponse>> =
            deactivate(id, SubAccountDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/sub-accounts/{id}/balance`, but is otherwise the
         * same as [SubAccountServiceAsync.getBalance].
         */
        fun getBalance(
            id: String
        ): CompletableFuture<HttpResponseFor<SubAccountGetBalanceResponse>> =
            getBalance(id, SubAccountGetBalanceParams.none())

        /** @see getBalance */
        fun getBalance(
            id: String,
            params: SubAccountGetBalanceParams = SubAccountGetBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountGetBalanceResponse>> =
            getBalance(params.toBuilder().id(id).build(), requestOptions)

        /** @see getBalance */
        fun getBalance(
            id: String,
            params: SubAccountGetBalanceParams = SubAccountGetBalanceParams.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountGetBalanceResponse>> =
            getBalance(id, params, RequestOptions.none())

        /** @see getBalance */
        fun getBalance(
            params: SubAccountGetBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubAccountGetBalanceResponse>>

        /** @see getBalance */
        fun getBalance(
            params: SubAccountGetBalanceParams
        ): CompletableFuture<HttpResponseFor<SubAccountGetBalanceResponse>> =
            getBalance(params, RequestOptions.none())

        /** @see getBalance */
        fun getBalance(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubAccountGetBalanceResponse>> =
            getBalance(id, SubAccountGetBalanceParams.none(), requestOptions)
    }
}
