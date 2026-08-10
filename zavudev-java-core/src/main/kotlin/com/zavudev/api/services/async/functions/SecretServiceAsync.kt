// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.functions

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.functions.secrets.SecretListParams
import com.zavudev.api.models.functions.secrets.SecretListResponse
import com.zavudev.api.models.functions.secrets.SecretSetParams
import com.zavudev.api.models.functions.secrets.SecretSetResponse
import com.zavudev.api.models.functions.secrets.SecretUnsetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SecretServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretServiceAsync

    /**
     * Lists every secret key set on the function. Plaintext is NEVER returned — only the last 4
     * characters of each value, for visual confirmation.
     */
    fun list(functionId: String): CompletableFuture<SecretListResponse> =
        list(functionId, SecretListParams.none())

    /** @see list */
    fun list(
        functionId: String,
        params: SecretListParams = SecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretListResponse> =
        list(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see list */
    fun list(
        functionId: String,
        params: SecretListParams = SecretListParams.none(),
    ): CompletableFuture<SecretListResponse> = list(functionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SecretListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretListResponse>

    /** @see list */
    fun list(params: SecretListParams): CompletableFuture<SecretListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SecretListResponse> =
        list(functionId, SecretListParams.none(), requestOptions)

    /**
     * Create or update a secret on a function. Marks the function out-of-sync; the next `POST
     * /deploy` re-publishes the Lambda with the new env. Keys must match `[A-Z_][A-Z0-9_]*`
     * (uppercase env-var style) and cannot start with reserved prefixes (AWS_, LAMBDA_, etc).
     */
    fun set(key: String, params: SecretSetParams): CompletableFuture<SecretSetResponse> =
        set(key, params, RequestOptions.none())

    /** @see set */
    fun set(
        key: String,
        params: SecretSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretSetResponse> =
        set(params.toBuilder().key(key).build(), requestOptions)

    /** @see set */
    fun set(params: SecretSetParams): CompletableFuture<SecretSetResponse> =
        set(params, RequestOptions.none())

    /** @see set */
    fun set(
        params: SecretSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretSetResponse>

    /**
     * Remove a secret from a function. Doesn't take effect on the running Lambda until the next
     * deploy.
     */
    fun unset(key: String, params: SecretUnsetParams): CompletableFuture<Void?> =
        unset(key, params, RequestOptions.none())

    /** @see unset */
    fun unset(
        key: String,
        params: SecretUnsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = unset(params.toBuilder().key(key).build(), requestOptions)

    /** @see unset */
    fun unset(params: SecretUnsetParams): CompletableFuture<Void?> =
        unset(params, RequestOptions.none())

    /** @see unset */
    fun unset(
        params: SecretUnsetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SecretServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/functions/{functionId}/secrets`, but is
         * otherwise the same as [SecretServiceAsync.list].
         */
        fun list(functionId: String): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(functionId, SecretListParams.none())

        /** @see list */
        fun list(
            functionId: String,
            params: SecretListParams = SecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see list */
        fun list(
            functionId: String,
            params: SecretListParams = SecretListParams.none(),
        ): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(functionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SecretListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretListResponse>>

        /** @see list */
        fun list(params: SecretListParams): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(functionId, SecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/functions/{functionId}/secrets/{key}`, but is
         * otherwise the same as [SecretServiceAsync.set].
         */
        fun set(
            key: String,
            params: SecretSetParams,
        ): CompletableFuture<HttpResponseFor<SecretSetResponse>> =
            set(key, params, RequestOptions.none())

        /** @see set */
        fun set(
            key: String,
            params: SecretSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretSetResponse>> =
            set(params.toBuilder().key(key).build(), requestOptions)

        /** @see set */
        fun set(params: SecretSetParams): CompletableFuture<HttpResponseFor<SecretSetResponse>> =
            set(params, RequestOptions.none())

        /** @see set */
        fun set(
            params: SecretSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretSetResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/functions/{functionId}/secrets/{key}`, but is
         * otherwise the same as [SecretServiceAsync.unset].
         */
        fun unset(key: String, params: SecretUnsetParams): CompletableFuture<HttpResponse> =
            unset(key, params, RequestOptions.none())

        /** @see unset */
        fun unset(
            key: String,
            params: SecretUnsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unset(params.toBuilder().key(key).build(), requestOptions)

        /** @see unset */
        fun unset(params: SecretUnsetParams): CompletableFuture<HttpResponse> =
            unset(params, RequestOptions.none())

        /** @see unset */
        fun unset(
            params: SecretUnsetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
