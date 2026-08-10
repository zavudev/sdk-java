// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.subaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyCreateParams
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyCreateResponse
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyListParams
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyListResponse
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyRevokeParams
import java.util.function.Consumer

interface ApiKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService

    /**
     * Create sub-account API key. Requires a parent project API key; sub-account API keys receive
     * HTTP 403.
     */
    fun create(id: String, params: ApiKeyCreateParams): ApiKeyCreateResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ApiKeyCreateParams): ApiKeyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse

    /**
     * List sub-account API keys. Requires a parent project API key; sub-account API keys receive
     * HTTP 403.
     */
    fun list(id: String): ApiKeyListResponse = list(id, ApiKeyListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: ApiKeyListParams = ApiKeyListParams.none()): ApiKeyListResponse =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ApiKeyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyListResponse

    /** @see list */
    fun list(params: ApiKeyListParams): ApiKeyListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): ApiKeyListResponse =
        list(id, ApiKeyListParams.none(), requestOptions)

    /**
     * Revoke sub-account API key. Requires a parent project API key; sub-account API keys receive
     * HTTP 403.
     */
    fun revoke(keyId: String, params: ApiKeyRevokeParams) =
        revoke(keyId, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        keyId: String,
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = revoke(params.toBuilder().keyId(keyId).build(), requestOptions)

    /** @see revoke */
    fun revoke(params: ApiKeyRevokeParams) = revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(params: ApiKeyRevokeParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ApiKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/sub-accounts/{id}/api-keys`, but is otherwise
         * the same as [ApiKeyService.create].
         */
        @MustBeClosed
        fun create(id: String, params: ApiKeyCreateParams): HttpResponseFor<ApiKeyCreateResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ApiKeyCreateParams): HttpResponseFor<ApiKeyCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/sub-accounts/{id}/api-keys`, but is otherwise
         * the same as [ApiKeyService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<ApiKeyListResponse> =
            list(id, ApiKeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ApiKeyListParams = ApiKeyListParams.none(),
        ): HttpResponseFor<ApiKeyListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ApiKeyListParams): HttpResponseFor<ApiKeyListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<ApiKeyListResponse> =
            list(id, ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/sub-accounts/{id}/api-keys/{keyId}`, but is
         * otherwise the same as [ApiKeyService.revoke].
         */
        @MustBeClosed
        fun revoke(keyId: String, params: ApiKeyRevokeParams): HttpResponse =
            revoke(keyId, params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            keyId: String,
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = revoke(params.toBuilder().keyId(keyId).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        fun revoke(params: ApiKeyRevokeParams): HttpResponse = revoke(params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
