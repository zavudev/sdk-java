// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.functions

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.functions.gitlink.GitLinkDeployNowParams
import com.zavudev.api.models.functions.gitlink.GitLinkDeployNowResponse
import com.zavudev.api.models.functions.gitlink.GitLinkLinkParams
import com.zavudev.api.models.functions.gitlink.GitLinkLinkResponse
import com.zavudev.api.models.functions.gitlink.GitLinkRetrieveParams
import com.zavudev.api.models.functions.gitlink.GitLinkRetrieveResponse
import com.zavudev.api.models.functions.gitlink.GitLinkUnlinkParams
import com.zavudev.api.models.functions.gitlink.GitLinkUpdateParams
import com.zavudev.api.models.functions.gitlink.GitLinkUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GitLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GitLinkServiceAsync

    /** The link and its last deploy. Never returns the webhook secret. */
    fun retrieve(functionId: String): CompletableFuture<GitLinkRetrieveResponse> =
        retrieve(functionId, GitLinkRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        functionId: String,
        params: GitLinkRetrieveParams = GitLinkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GitLinkRetrieveResponse> =
        retrieve(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        functionId: String,
        params: GitLinkRetrieveParams = GitLinkRetrieveParams.none(),
    ): CompletableFuture<GitLinkRetrieveResponse> =
        retrieve(functionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GitLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GitLinkRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: GitLinkRetrieveParams): CompletableFuture<GitLinkRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GitLinkRetrieveResponse> =
        retrieve(functionId, GitLinkRetrieveParams.none(), requestOptions)

    /**
     * Change the branch, the root directory, or whether pushes deploy. Pass at least one field.
     * `rootDir: null` clears the subdirectory.
     */
    fun update(functionId: String): CompletableFuture<GitLinkUpdateResponse> =
        update(functionId, GitLinkUpdateParams.none())

    /** @see update */
    fun update(
        functionId: String,
        params: GitLinkUpdateParams = GitLinkUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GitLinkUpdateResponse> =
        update(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see update */
    fun update(
        functionId: String,
        params: GitLinkUpdateParams = GitLinkUpdateParams.none(),
    ): CompletableFuture<GitLinkUpdateResponse> = update(functionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GitLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GitLinkUpdateResponse>

    /** @see update */
    fun update(params: GitLinkUpdateParams): CompletableFuture<GitLinkUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GitLinkUpdateResponse> =
        update(functionId, GitLinkUpdateParams.none(), requestOptions)

    /**
     * Fetch the linked branch and deploy it without waiting for a push. Returns immediately; follow
     * the outcome with `GET /v1/functions/{functionId}/git-link`, whose `lastStatus` and
     * `lastError` describe the run.
     */
    fun deployNow(functionId: String): CompletableFuture<GitLinkDeployNowResponse> =
        deployNow(functionId, GitLinkDeployNowParams.none())

    /** @see deployNow */
    fun deployNow(
        functionId: String,
        params: GitLinkDeployNowParams = GitLinkDeployNowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GitLinkDeployNowResponse> =
        deployNow(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see deployNow */
    fun deployNow(
        functionId: String,
        params: GitLinkDeployNowParams = GitLinkDeployNowParams.none(),
    ): CompletableFuture<GitLinkDeployNowResponse> =
        deployNow(functionId, params, RequestOptions.none())

    /** @see deployNow */
    fun deployNow(
        params: GitLinkDeployNowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GitLinkDeployNowResponse>

    /** @see deployNow */
    fun deployNow(params: GitLinkDeployNowParams): CompletableFuture<GitLinkDeployNowResponse> =
        deployNow(params, RequestOptions.none())

    /** @see deployNow */
    fun deployNow(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GitLinkDeployNowResponse> =
        deployNow(functionId, GitLinkDeployNowParams.none(), requestOptions)

    /**
     * Bind a repository to this function so every push to `branch` deploys it. A function holds at
     * most one link; linking again returns 400.
     *
     * **The server decides how the link authenticates.** If the project has the Zavu GitHub App
     * installed, the link uses that installation: private repositories work and there is nothing to
     * configure in the repository. Otherwise it falls back to a manual link and the response
     * carries a `webhookSecret` you add to the repository yourself. `connection` says which one you
     * got.
     *
     * The repository is not checked against GitHub here, because it cannot be: an owner/repo that
     * does not exist, or that the installation cannot see, is accepted and fails on the first
     * deploy with a fetch error.
     */
    fun link(
        functionId: String,
        params: GitLinkLinkParams,
    ): CompletableFuture<GitLinkLinkResponse> = link(functionId, params, RequestOptions.none())

    /** @see link */
    fun link(
        functionId: String,
        params: GitLinkLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GitLinkLinkResponse> =
        link(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see link */
    fun link(params: GitLinkLinkParams): CompletableFuture<GitLinkLinkResponse> =
        link(params, RequestOptions.none())

    /** @see link */
    fun link(
        params: GitLinkLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GitLinkLinkResponse>

    /**
     * Remove the link. The function and its deployments stay. A manual webhook left in the
     * repository stops being accepted, so remove it there too.
     */
    fun unlink(functionId: String): CompletableFuture<Void?> =
        unlink(functionId, GitLinkUnlinkParams.none())

    /** @see unlink */
    fun unlink(
        functionId: String,
        params: GitLinkUnlinkParams = GitLinkUnlinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unlink(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see unlink */
    fun unlink(
        functionId: String,
        params: GitLinkUnlinkParams = GitLinkUnlinkParams.none(),
    ): CompletableFuture<Void?> = unlink(functionId, params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        params: GitLinkUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see unlink */
    fun unlink(params: GitLinkUnlinkParams): CompletableFuture<Void?> =
        unlink(params, RequestOptions.none())

    /** @see unlink */
    fun unlink(functionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        unlink(functionId, GitLinkUnlinkParams.none(), requestOptions)

    /**
     * A view of [GitLinkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GitLinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/functions/{functionId}/git-link`, but is
         * otherwise the same as [GitLinkServiceAsync.retrieve].
         */
        fun retrieve(
            functionId: String
        ): CompletableFuture<HttpResponseFor<GitLinkRetrieveResponse>> =
            retrieve(functionId, GitLinkRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            functionId: String,
            params: GitLinkRetrieveParams = GitLinkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkRetrieveResponse>> =
            retrieve(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            functionId: String,
            params: GitLinkRetrieveParams = GitLinkRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkRetrieveResponse>> =
            retrieve(functionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GitLinkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GitLinkRetrieveParams
        ): CompletableFuture<HttpResponseFor<GitLinkRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GitLinkRetrieveResponse>> =
            retrieve(functionId, GitLinkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/functions/{functionId}/git-link`, but is
         * otherwise the same as [GitLinkServiceAsync.update].
         */
        fun update(functionId: String): CompletableFuture<HttpResponseFor<GitLinkUpdateResponse>> =
            update(functionId, GitLinkUpdateParams.none())

        /** @see update */
        fun update(
            functionId: String,
            params: GitLinkUpdateParams = GitLinkUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkUpdateResponse>> =
            update(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see update */
        fun update(
            functionId: String,
            params: GitLinkUpdateParams = GitLinkUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkUpdateResponse>> =
            update(functionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GitLinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkUpdateResponse>>

        /** @see update */
        fun update(
            params: GitLinkUpdateParams
        ): CompletableFuture<HttpResponseFor<GitLinkUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GitLinkUpdateResponse>> =
            update(functionId, GitLinkUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/functions/{functionId}/git-link/deploy`, but is
         * otherwise the same as [GitLinkServiceAsync.deployNow].
         */
        fun deployNow(
            functionId: String
        ): CompletableFuture<HttpResponseFor<GitLinkDeployNowResponse>> =
            deployNow(functionId, GitLinkDeployNowParams.none())

        /** @see deployNow */
        fun deployNow(
            functionId: String,
            params: GitLinkDeployNowParams = GitLinkDeployNowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkDeployNowResponse>> =
            deployNow(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see deployNow */
        fun deployNow(
            functionId: String,
            params: GitLinkDeployNowParams = GitLinkDeployNowParams.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkDeployNowResponse>> =
            deployNow(functionId, params, RequestOptions.none())

        /** @see deployNow */
        fun deployNow(
            params: GitLinkDeployNowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkDeployNowResponse>>

        /** @see deployNow */
        fun deployNow(
            params: GitLinkDeployNowParams
        ): CompletableFuture<HttpResponseFor<GitLinkDeployNowResponse>> =
            deployNow(params, RequestOptions.none())

        /** @see deployNow */
        fun deployNow(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GitLinkDeployNowResponse>> =
            deployNow(functionId, GitLinkDeployNowParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/functions/{functionId}/git-link`, but is
         * otherwise the same as [GitLinkServiceAsync.link].
         */
        fun link(
            functionId: String,
            params: GitLinkLinkParams,
        ): CompletableFuture<HttpResponseFor<GitLinkLinkResponse>> =
            link(functionId, params, RequestOptions.none())

        /** @see link */
        fun link(
            functionId: String,
            params: GitLinkLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkLinkResponse>> =
            link(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see link */
        fun link(
            params: GitLinkLinkParams
        ): CompletableFuture<HttpResponseFor<GitLinkLinkResponse>> =
            link(params, RequestOptions.none())

        /** @see link */
        fun link(
            params: GitLinkLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GitLinkLinkResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/functions/{functionId}/git-link`, but is
         * otherwise the same as [GitLinkServiceAsync.unlink].
         */
        fun unlink(functionId: String): CompletableFuture<HttpResponse> =
            unlink(functionId, GitLinkUnlinkParams.none())

        /** @see unlink */
        fun unlink(
            functionId: String,
            params: GitLinkUnlinkParams = GitLinkUnlinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unlink(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see unlink */
        fun unlink(
            functionId: String,
            params: GitLinkUnlinkParams = GitLinkUnlinkParams.none(),
        ): CompletableFuture<HttpResponse> = unlink(functionId, params, RequestOptions.none())

        /** @see unlink */
        fun unlink(
            params: GitLinkUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see unlink */
        fun unlink(params: GitLinkUnlinkParams): CompletableFuture<HttpResponse> =
            unlink(params, RequestOptions.none())

        /** @see unlink */
        fun unlink(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            unlink(functionId, GitLinkUnlinkParams.none(), requestOptions)
    }
}
