// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.functions.FunctionCreateParams
import com.zavudev.api.models.functions.FunctionCreateResponse
import com.zavudev.api.models.functions.FunctionDeleteParams
import com.zavudev.api.models.functions.FunctionDeleteResponse
import com.zavudev.api.models.functions.FunctionDeployParams
import com.zavudev.api.models.functions.FunctionDeployResponse
import com.zavudev.api.models.functions.FunctionGetDeploymentParams
import com.zavudev.api.models.functions.FunctionGetDeploymentResponse
import com.zavudev.api.models.functions.FunctionRetrieveParams
import com.zavudev.api.models.functions.FunctionRetrieveResponse
import com.zavudev.api.models.functions.FunctionTailLogsParams
import com.zavudev.api.models.functions.FunctionTailLogsResponse
import com.zavudev.api.models.functions.FunctionUpdateParams
import com.zavudev.api.models.functions.FunctionUpdateResponse
import com.zavudev.api.services.async.functions.SecretServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FunctionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionServiceAsync

    fun secrets(): SecretServiceAsync

    /**
     * Create a new Zavu Function. The function starts in `draft` status. A dedicated API key is
     * auto-provisioned and injected as the `ZAVU_API_KEY` secret so the function can call back into
     * the Zavu API without manual setup.
     *
     * Provide `sourceCode` to seed the draft. Call `POST /v1/functions/{functionId}/deploy`
     * afterwards to publish.
     */
    fun create(params: FunctionCreateParams): CompletableFuture<FunctionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FunctionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionCreateResponse>

    /** Get function */
    fun retrieve(functionId: String): CompletableFuture<FunctionRetrieveResponse> =
        retrieve(functionId, FunctionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        functionId: String,
        params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionRetrieveResponse> =
        retrieve(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        functionId: String,
        params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
    ): CompletableFuture<FunctionRetrieveResponse> =
        retrieve(functionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FunctionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: FunctionRetrieveParams): CompletableFuture<FunctionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionRetrieveResponse> =
        retrieve(functionId, FunctionRetrieveParams.none(), requestOptions)

    /**
     * Update an existing function. `sourceCode` / `dependencies` edit the draft without triggering
     * a build — they go live on the next `POST /v1/functions/{functionId}/deploy`. `httpEnabled` is
     * applied to the deployed function immediately, so turning the public endpoint on or off does
     * not require a redeploy.
     */
    fun update(functionId: String): CompletableFuture<FunctionUpdateResponse> =
        update(functionId, FunctionUpdateParams.none())

    /** @see update */
    fun update(
        functionId: String,
        params: FunctionUpdateParams = FunctionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionUpdateResponse> =
        update(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see update */
    fun update(
        functionId: String,
        params: FunctionUpdateParams = FunctionUpdateParams.none(),
    ): CompletableFuture<FunctionUpdateResponse> = update(functionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FunctionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionUpdateResponse>

    /** @see update */
    fun update(params: FunctionUpdateParams): CompletableFuture<FunctionUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionUpdateResponse> =
        update(functionId, FunctionUpdateParams.none(), requestOptions)

    /**
     * Permanently delete a function and cascade: triggers, secrets, deployment history, managed
     * agents+tools, and revoke the auto-provisioned API key. The AWS Lambda + log group are torn
     * down asynchronously.
     */
    fun delete(functionId: String): CompletableFuture<FunctionDeleteResponse> =
        delete(functionId, FunctionDeleteParams.none())

    /** @see delete */
    fun delete(
        functionId: String,
        params: FunctionDeleteParams = FunctionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionDeleteResponse> =
        delete(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        functionId: String,
        params: FunctionDeleteParams = FunctionDeleteParams.none(),
    ): CompletableFuture<FunctionDeleteResponse> = delete(functionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FunctionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionDeleteResponse>

    /** @see delete */
    fun delete(params: FunctionDeleteParams): CompletableFuture<FunctionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionDeleteResponse> =
        delete(functionId, FunctionDeleteParams.none(), requestOptions)

    /**
     * Publish the function. If `sourceCode` or `dependencies` are provided in the body, they
     * replace the current draft before deployment. Returns immediately with a deployment ID — poll
     * `GET /v1/functions/deployments/{deploymentId}` until status is `active` or `failed`.
     */
    fun deploy(functionId: String): CompletableFuture<FunctionDeployResponse> =
        deploy(functionId, FunctionDeployParams.none())

    /** @see deploy */
    fun deploy(
        functionId: String,
        params: FunctionDeployParams = FunctionDeployParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionDeployResponse> =
        deploy(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see deploy */
    fun deploy(
        functionId: String,
        params: FunctionDeployParams = FunctionDeployParams.none(),
    ): CompletableFuture<FunctionDeployResponse> = deploy(functionId, params, RequestOptions.none())

    /** @see deploy */
    fun deploy(
        params: FunctionDeployParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionDeployResponse>

    /** @see deploy */
    fun deploy(params: FunctionDeployParams): CompletableFuture<FunctionDeployResponse> =
        deploy(params, RequestOptions.none())

    /** @see deploy */
    fun deploy(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionDeployResponse> =
        deploy(functionId, FunctionDeployParams.none(), requestOptions)

    /** Fetch a deployment to poll its status during a deploy. */
    fun getDeployment(deploymentId: String): CompletableFuture<FunctionGetDeploymentResponse> =
        getDeployment(deploymentId, FunctionGetDeploymentParams.none())

    /** @see getDeployment */
    fun getDeployment(
        deploymentId: String,
        params: FunctionGetDeploymentParams = FunctionGetDeploymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionGetDeploymentResponse> =
        getDeployment(params.toBuilder().deploymentId(deploymentId).build(), requestOptions)

    /** @see getDeployment */
    fun getDeployment(
        deploymentId: String,
        params: FunctionGetDeploymentParams = FunctionGetDeploymentParams.none(),
    ): CompletableFuture<FunctionGetDeploymentResponse> =
        getDeployment(deploymentId, params, RequestOptions.none())

    /** @see getDeployment */
    fun getDeployment(
        params: FunctionGetDeploymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionGetDeploymentResponse>

    /** @see getDeployment */
    fun getDeployment(
        params: FunctionGetDeploymentParams
    ): CompletableFuture<FunctionGetDeploymentResponse> =
        getDeployment(params, RequestOptions.none())

    /** @see getDeployment */
    fun getDeployment(
        deploymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionGetDeploymentResponse> =
        getDeployment(deploymentId, FunctionGetDeploymentParams.none(), requestOptions)

    /**
     * Fetch invocation logs for a function. Logs are paginated via `nextToken`. Pass `startTime` /
     * `endTime` (Unix epoch milliseconds) to bound the window, or `filterPattern` to filter
     * messages.
     */
    fun tailLogs(functionId: String): CompletableFuture<FunctionTailLogsResponse> =
        tailLogs(functionId, FunctionTailLogsParams.none())

    /** @see tailLogs */
    fun tailLogs(
        functionId: String,
        params: FunctionTailLogsParams = FunctionTailLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionTailLogsResponse> =
        tailLogs(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see tailLogs */
    fun tailLogs(
        functionId: String,
        params: FunctionTailLogsParams = FunctionTailLogsParams.none(),
    ): CompletableFuture<FunctionTailLogsResponse> =
        tailLogs(functionId, params, RequestOptions.none())

    /** @see tailLogs */
    fun tailLogs(
        params: FunctionTailLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionTailLogsResponse>

    /** @see tailLogs */
    fun tailLogs(params: FunctionTailLogsParams): CompletableFuture<FunctionTailLogsResponse> =
        tailLogs(params, RequestOptions.none())

    /** @see tailLogs */
    fun tailLogs(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FunctionTailLogsResponse> =
        tailLogs(functionId, FunctionTailLogsParams.none(), requestOptions)

    /**
     * A view of [FunctionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionServiceAsync.WithRawResponse

        fun secrets(): SecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/functions`, but is otherwise the same as
         * [FunctionServiceAsync.create].
         */
        fun create(
            params: FunctionCreateParams
        ): CompletableFuture<HttpResponseFor<FunctionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FunctionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/functions/{functionId}`, but is otherwise the
         * same as [FunctionServiceAsync.retrieve].
         */
        fun retrieve(
            functionId: String
        ): CompletableFuture<HttpResponseFor<FunctionRetrieveResponse>> =
            retrieve(functionId, FunctionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            functionId: String,
            params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionRetrieveResponse>> =
            retrieve(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            functionId: String,
            params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FunctionRetrieveResponse>> =
            retrieve(functionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FunctionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: FunctionRetrieveParams
        ): CompletableFuture<HttpResponseFor<FunctionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionRetrieveResponse>> =
            retrieve(functionId, FunctionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/functions/{functionId}`, but is otherwise the
         * same as [FunctionServiceAsync.update].
         */
        fun update(functionId: String): CompletableFuture<HttpResponseFor<FunctionUpdateResponse>> =
            update(functionId, FunctionUpdateParams.none())

        /** @see update */
        fun update(
            functionId: String,
            params: FunctionUpdateParams = FunctionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionUpdateResponse>> =
            update(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see update */
        fun update(
            functionId: String,
            params: FunctionUpdateParams = FunctionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<FunctionUpdateResponse>> =
            update(functionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FunctionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionUpdateResponse>>

        /** @see update */
        fun update(
            params: FunctionUpdateParams
        ): CompletableFuture<HttpResponseFor<FunctionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionUpdateResponse>> =
            update(functionId, FunctionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/functions/{functionId}`, but is otherwise the
         * same as [FunctionServiceAsync.delete].
         */
        fun delete(functionId: String): CompletableFuture<HttpResponseFor<FunctionDeleteResponse>> =
            delete(functionId, FunctionDeleteParams.none())

        /** @see delete */
        fun delete(
            functionId: String,
            params: FunctionDeleteParams = FunctionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionDeleteResponse>> =
            delete(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            functionId: String,
            params: FunctionDeleteParams = FunctionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FunctionDeleteResponse>> =
            delete(functionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: FunctionDeleteParams
        ): CompletableFuture<HttpResponseFor<FunctionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionDeleteResponse>> =
            delete(functionId, FunctionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/functions/{functionId}/deploy`, but is
         * otherwise the same as [FunctionServiceAsync.deploy].
         */
        fun deploy(functionId: String): CompletableFuture<HttpResponseFor<FunctionDeployResponse>> =
            deploy(functionId, FunctionDeployParams.none())

        /** @see deploy */
        fun deploy(
            functionId: String,
            params: FunctionDeployParams = FunctionDeployParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionDeployResponse>> =
            deploy(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see deploy */
        fun deploy(
            functionId: String,
            params: FunctionDeployParams = FunctionDeployParams.none(),
        ): CompletableFuture<HttpResponseFor<FunctionDeployResponse>> =
            deploy(functionId, params, RequestOptions.none())

        /** @see deploy */
        fun deploy(
            params: FunctionDeployParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionDeployResponse>>

        /** @see deploy */
        fun deploy(
            params: FunctionDeployParams
        ): CompletableFuture<HttpResponseFor<FunctionDeployResponse>> =
            deploy(params, RequestOptions.none())

        /** @see deploy */
        fun deploy(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionDeployResponse>> =
            deploy(functionId, FunctionDeployParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/functions/deployments/{deploymentId}`, but is
         * otherwise the same as [FunctionServiceAsync.getDeployment].
         */
        fun getDeployment(
            deploymentId: String
        ): CompletableFuture<HttpResponseFor<FunctionGetDeploymentResponse>> =
            getDeployment(deploymentId, FunctionGetDeploymentParams.none())

        /** @see getDeployment */
        fun getDeployment(
            deploymentId: String,
            params: FunctionGetDeploymentParams = FunctionGetDeploymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionGetDeploymentResponse>> =
            getDeployment(params.toBuilder().deploymentId(deploymentId).build(), requestOptions)

        /** @see getDeployment */
        fun getDeployment(
            deploymentId: String,
            params: FunctionGetDeploymentParams = FunctionGetDeploymentParams.none(),
        ): CompletableFuture<HttpResponseFor<FunctionGetDeploymentResponse>> =
            getDeployment(deploymentId, params, RequestOptions.none())

        /** @see getDeployment */
        fun getDeployment(
            params: FunctionGetDeploymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionGetDeploymentResponse>>

        /** @see getDeployment */
        fun getDeployment(
            params: FunctionGetDeploymentParams
        ): CompletableFuture<HttpResponseFor<FunctionGetDeploymentResponse>> =
            getDeployment(params, RequestOptions.none())

        /** @see getDeployment */
        fun getDeployment(
            deploymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionGetDeploymentResponse>> =
            getDeployment(deploymentId, FunctionGetDeploymentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/functions/{functionId}/logs`, but is otherwise
         * the same as [FunctionServiceAsync.tailLogs].
         */
        fun tailLogs(
            functionId: String
        ): CompletableFuture<HttpResponseFor<FunctionTailLogsResponse>> =
            tailLogs(functionId, FunctionTailLogsParams.none())

        /** @see tailLogs */
        fun tailLogs(
            functionId: String,
            params: FunctionTailLogsParams = FunctionTailLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionTailLogsResponse>> =
            tailLogs(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see tailLogs */
        fun tailLogs(
            functionId: String,
            params: FunctionTailLogsParams = FunctionTailLogsParams.none(),
        ): CompletableFuture<HttpResponseFor<FunctionTailLogsResponse>> =
            tailLogs(functionId, params, RequestOptions.none())

        /** @see tailLogs */
        fun tailLogs(
            params: FunctionTailLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionTailLogsResponse>>

        /** @see tailLogs */
        fun tailLogs(
            params: FunctionTailLogsParams
        ): CompletableFuture<HttpResponseFor<FunctionTailLogsResponse>> =
            tailLogs(params, RequestOptions.none())

        /** @see tailLogs */
        fun tailLogs(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FunctionTailLogsResponse>> =
            tailLogs(functionId, FunctionTailLogsParams.none(), requestOptions)
    }
}
