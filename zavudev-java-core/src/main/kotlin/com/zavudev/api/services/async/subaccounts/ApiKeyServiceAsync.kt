// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.subaccounts

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyCreateParams
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyCreateResponse
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyListParams
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyListResponse
import com.zavudev.api.models.subaccounts.apikeys.ApiKeyRevokeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ApiKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyServiceAsync

    /**
     * Create sub-account API key. Requires a parent project API key; sub-account API keys receive
     * HTTP 403.
     */
    fun create(id: String, params: ApiKeyCreateParams): CompletableFuture<ApiKeyCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ApiKeyCreateParams): CompletableFuture<ApiKeyCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse>

    /**
     * List sub-account API keys. Requires a parent project API key; sub-account API keys receive
     * HTTP 403.
     */
    fun list(id: String): CompletableFuture<ApiKeyListResponse> = list(id, ApiKeyListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ApiKeyListParams = ApiKeyListParams.none(),
    ): CompletableFuture<ApiKeyListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ApiKeyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyListResponse>

    /** @see list */
    fun list(params: ApiKeyListParams): CompletableFuture<ApiKeyListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<ApiKeyListResponse> =
        list(id, ApiKeyListParams.none(), requestOptions)

    /**
     * Revoke sub-account API key. Requires a parent project API key; sub-account API keys receive
     * HTTP 403.
     */
    fun revoke(keyId: String, params: ApiKeyRevokeParams): CompletableFuture<Void?> =
        revoke(keyId, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        keyId: String,
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = revoke(params.toBuilder().keyId(keyId).build(), requestOptions)

    /** @see revoke */
    fun revoke(params: ApiKeyRevokeParams): CompletableFuture<Void?> =
        revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ApiKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/sub-accounts/{id}/api-keys`, but is otherwise
         * the same as [ApiKeyServiceAsync.create].
         */
        fun create(
            id: String,
            params: ApiKeyCreateParams,
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: ApiKeyCreateParams
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/sub-accounts/{id}/api-keys`, but is otherwise
         * the same as [ApiKeyServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<ApiKeyListResponse>> =
            list(id, ApiKeyListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: ApiKeyListParams = ApiKeyListParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ApiKeyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyListResponse>>

        /** @see list */
        fun list(params: ApiKeyListParams): CompletableFuture<HttpResponseFor<ApiKeyListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyListResponse>> =
            list(id, ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/sub-accounts/{id}/api-keys/{keyId}`, but is
         * otherwise the same as [ApiKeyServiceAsync.revoke].
         */
        fun revoke(keyId: String, params: ApiKeyRevokeParams): CompletableFuture<HttpResponse> =
            revoke(keyId, params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            keyId: String,
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            revoke(params.toBuilder().keyId(keyId).build(), requestOptions)

        /** @see revoke */
        fun revoke(params: ApiKeyRevokeParams): CompletableFuture<HttpResponse> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
