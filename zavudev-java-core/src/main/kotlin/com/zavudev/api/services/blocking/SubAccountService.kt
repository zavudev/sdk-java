// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.subaccounts.SubAccountCreateParams
import com.zavudev.api.models.subaccounts.SubAccountCreateResponse
import com.zavudev.api.models.subaccounts.SubAccountDeactivateParams
import com.zavudev.api.models.subaccounts.SubAccountDeactivateResponse
import com.zavudev.api.models.subaccounts.SubAccountGetBalanceParams
import com.zavudev.api.models.subaccounts.SubAccountGetBalanceResponse
import com.zavudev.api.models.subaccounts.SubAccountListPage
import com.zavudev.api.models.subaccounts.SubAccountListParams
import com.zavudev.api.models.subaccounts.SubAccountRetrieveParams
import com.zavudev.api.models.subaccounts.SubAccountRetrieveResponse
import com.zavudev.api.models.subaccounts.SubAccountUpdateParams
import com.zavudev.api.models.subaccounts.SubAccountUpdateResponse
import com.zavudev.api.services.blocking.subaccounts.ApiKeyService
import java.util.function.Consumer

interface SubAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubAccountService

    fun apiKeys(): ApiKeyService

    /**
     * Create a new sub-account (project) with its own API key. All charges are billed to the parent
     * team's balance. Use creditLimit to set a spending cap. The sub-account's API key is returned
     * only in the creation response. Requires a parent project API key; sub-account API keys
     * receive HTTP 403.
     */
    fun create(params: SubAccountCreateParams): SubAccountCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountCreateResponse

    /**
     * Get sub-account. Requires a parent project API key; sub-account API keys receive HTTP 403.
     */
    fun retrieve(id: String): SubAccountRetrieveResponse =
        retrieve(id, SubAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubAccountRetrieveParams = SubAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SubAccountRetrieveParams = SubAccountRetrieveParams.none(),
    ): SubAccountRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SubAccountRetrieveParams): SubAccountRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SubAccountRetrieveResponse =
        retrieve(id, SubAccountRetrieveParams.none(), requestOptions)

    /**
     * Update sub-account. Requires a parent project API key; sub-account API keys receive HTTP 403.
     */
    fun update(id: String): SubAccountUpdateResponse = update(id, SubAccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SubAccountUpdateParams = SubAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SubAccountUpdateParams = SubAccountUpdateParams.none(),
    ): SubAccountUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountUpdateResponse

    /** @see update */
    fun update(params: SubAccountUpdateParams): SubAccountUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): SubAccountUpdateResponse =
        update(id, SubAccountUpdateParams.none(), requestOptions)

    /**
     * List sub-accounts for this team. Requires a parent project API key; sub-account API keys
     * receive HTTP 403.
     */
    fun list(): SubAccountListPage = list(SubAccountListParams.none())

    /** @see list */
    fun list(
        params: SubAccountListParams = SubAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountListPage

    /** @see list */
    fun list(params: SubAccountListParams = SubAccountListParams.none()): SubAccountListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SubAccountListPage =
        list(SubAccountListParams.none(), requestOptions)

    /**
     * Deactivate a sub-account. Remaining balance is returned to the parent team and all API keys
     * are revoked. Requires a parent project API key; sub-account API keys receive HTTP 403.
     */
    fun deactivate(id: String): SubAccountDeactivateResponse =
        deactivate(id, SubAccountDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        id: String,
        params: SubAccountDeactivateParams = SubAccountDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountDeactivateResponse = deactivate(params.toBuilder().id(id).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        id: String,
        params: SubAccountDeactivateParams = SubAccountDeactivateParams.none(),
    ): SubAccountDeactivateResponse = deactivate(id, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: SubAccountDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountDeactivateResponse

    /** @see deactivate */
    fun deactivate(params: SubAccountDeactivateParams): SubAccountDeactivateResponse =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(id: String, requestOptions: RequestOptions): SubAccountDeactivateResponse =
        deactivate(id, SubAccountDeactivateParams.none(), requestOptions)

    /**
     * Get spending information for a sub-account. Returns the parent team's balance, the
     * sub-account's total spending, and its credit limit (spending cap). Requires a parent project
     * API key; sub-account API keys receive HTTP 403.
     */
    fun getBalance(id: String): SubAccountGetBalanceResponse =
        getBalance(id, SubAccountGetBalanceParams.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: SubAccountGetBalanceParams = SubAccountGetBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountGetBalanceResponse = getBalance(params.toBuilder().id(id).build(), requestOptions)

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: SubAccountGetBalanceParams = SubAccountGetBalanceParams.none(),
    ): SubAccountGetBalanceResponse = getBalance(id, params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        params: SubAccountGetBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubAccountGetBalanceResponse

    /** @see getBalance */
    fun getBalance(params: SubAccountGetBalanceParams): SubAccountGetBalanceResponse =
        getBalance(params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(id: String, requestOptions: RequestOptions): SubAccountGetBalanceResponse =
        getBalance(id, SubAccountGetBalanceParams.none(), requestOptions)

    /** A view of [SubAccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubAccountService.WithRawResponse

        fun apiKeys(): ApiKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/sub-accounts`, but is otherwise the same as
         * [SubAccountService.create].
         */
        @MustBeClosed
        fun create(params: SubAccountCreateParams): HttpResponseFor<SubAccountCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/sub-accounts/{id}`, but is otherwise the same as
         * [SubAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SubAccountRetrieveResponse> =
            retrieve(id, SubAccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SubAccountRetrieveParams = SubAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SubAccountRetrieveParams = SubAccountRetrieveParams.none(),
        ): HttpResponseFor<SubAccountRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubAccountRetrieveParams
        ): HttpResponseFor<SubAccountRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountRetrieveResponse> =
            retrieve(id, SubAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/sub-accounts/{id}`, but is otherwise the same
         * as [SubAccountService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<SubAccountUpdateResponse> =
            update(id, SubAccountUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SubAccountUpdateParams = SubAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SubAccountUpdateParams = SubAccountUpdateParams.none(),
        ): HttpResponseFor<SubAccountUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: SubAccountUpdateParams): HttpResponseFor<SubAccountUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountUpdateResponse> =
            update(id, SubAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/sub-accounts`, but is otherwise the same as
         * [SubAccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SubAccountListPage> = list(SubAccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubAccountListParams = SubAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubAccountListParams = SubAccountListParams.none()
        ): HttpResponseFor<SubAccountListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubAccountListPage> =
            list(SubAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/sub-accounts/{id}`, but is otherwise the same
         * as [SubAccountService.deactivate].
         */
        @MustBeClosed
        fun deactivate(id: String): HttpResponseFor<SubAccountDeactivateResponse> =
            deactivate(id, SubAccountDeactivateParams.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            id: String,
            params: SubAccountDeactivateParams = SubAccountDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountDeactivateResponse> =
            deactivate(params.toBuilder().id(id).build(), requestOptions)

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            id: String,
            params: SubAccountDeactivateParams = SubAccountDeactivateParams.none(),
        ): HttpResponseFor<SubAccountDeactivateResponse> =
            deactivate(id, params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: SubAccountDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountDeactivateResponse>

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: SubAccountDeactivateParams
        ): HttpResponseFor<SubAccountDeactivateResponse> = deactivate(params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountDeactivateResponse> =
            deactivate(id, SubAccountDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/sub-accounts/{id}/balance`, but is otherwise the
         * same as [SubAccountService.getBalance].
         */
        @MustBeClosed
        fun getBalance(id: String): HttpResponseFor<SubAccountGetBalanceResponse> =
            getBalance(id, SubAccountGetBalanceParams.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            params: SubAccountGetBalanceParams = SubAccountGetBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountGetBalanceResponse> =
            getBalance(params.toBuilder().id(id).build(), requestOptions)

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            params: SubAccountGetBalanceParams = SubAccountGetBalanceParams.none(),
        ): HttpResponseFor<SubAccountGetBalanceResponse> =
            getBalance(id, params, RequestOptions.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            params: SubAccountGetBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubAccountGetBalanceResponse>

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            params: SubAccountGetBalanceParams
        ): HttpResponseFor<SubAccountGetBalanceResponse> = getBalance(params, RequestOptions.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubAccountGetBalanceResponse> =
            getBalance(id, SubAccountGetBalanceParams.none(), requestOptions)
    }
}
