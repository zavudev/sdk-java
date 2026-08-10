// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.zavudev.api.services.blocking.functions.SecretService
import java.util.function.Consumer

interface FunctionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService

    fun secrets(): SecretService

    /**
     * Create a new Zavu Function. The function starts in `draft` status. A dedicated API key is
     * auto-provisioned and injected as the `ZAVU_API_KEY` secret so the function can call back into
     * the Zavu API without manual setup.
     *
     * Provide `sourceCode` to seed the draft. Call `POST /v1/functions/{functionId}/deploy`
     * afterwards to publish.
     */
    fun create(params: FunctionCreateParams): FunctionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FunctionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionCreateResponse

    /** Get function */
    fun retrieve(functionId: String): FunctionRetrieveResponse =
        retrieve(functionId, FunctionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        functionId: String,
        params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionRetrieveResponse =
        retrieve(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        functionId: String,
        params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
    ): FunctionRetrieveResponse = retrieve(functionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FunctionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FunctionRetrieveParams): FunctionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(functionId: String, requestOptions: RequestOptions): FunctionRetrieveResponse =
        retrieve(functionId, FunctionRetrieveParams.none(), requestOptions)

    /**
     * Update an existing function. `sourceCode` / `dependencies` edit the draft without triggering
     * a build — they go live on the next `POST /v1/functions/{functionId}/deploy`. `httpEnabled` is
     * applied to the deployed function immediately, so turning the public endpoint on or off does
     * not require a redeploy.
     */
    fun update(functionId: String): FunctionUpdateResponse =
        update(functionId, FunctionUpdateParams.none())

    /** @see update */
    fun update(
        functionId: String,
        params: FunctionUpdateParams = FunctionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionUpdateResponse =
        update(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see update */
    fun update(
        functionId: String,
        params: FunctionUpdateParams = FunctionUpdateParams.none(),
    ): FunctionUpdateResponse = update(functionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FunctionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionUpdateResponse

    /** @see update */
    fun update(params: FunctionUpdateParams): FunctionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(functionId: String, requestOptions: RequestOptions): FunctionUpdateResponse =
        update(functionId, FunctionUpdateParams.none(), requestOptions)

    /**
     * Permanently delete a function and cascade: triggers, secrets, deployment history, managed
     * agents+tools, and revoke the auto-provisioned API key. The AWS Lambda + log group are torn
     * down asynchronously.
     */
    fun delete(functionId: String): FunctionDeleteResponse =
        delete(functionId, FunctionDeleteParams.none())

    /** @see delete */
    fun delete(
        functionId: String,
        params: FunctionDeleteParams = FunctionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionDeleteResponse =
        delete(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        functionId: String,
        params: FunctionDeleteParams = FunctionDeleteParams.none(),
    ): FunctionDeleteResponse = delete(functionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FunctionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionDeleteResponse

    /** @see delete */
    fun delete(params: FunctionDeleteParams): FunctionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(functionId: String, requestOptions: RequestOptions): FunctionDeleteResponse =
        delete(functionId, FunctionDeleteParams.none(), requestOptions)

    /**
     * Publish the function. If `sourceCode` or `dependencies` are provided in the body, they
     * replace the current draft before deployment. Returns immediately with a deployment ID — poll
     * `GET /v1/functions/deployments/{deploymentId}` until status is `active` or `failed`.
     */
    fun deploy(functionId: String): FunctionDeployResponse =
        deploy(functionId, FunctionDeployParams.none())

    /** @see deploy */
    fun deploy(
        functionId: String,
        params: FunctionDeployParams = FunctionDeployParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionDeployResponse =
        deploy(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see deploy */
    fun deploy(
        functionId: String,
        params: FunctionDeployParams = FunctionDeployParams.none(),
    ): FunctionDeployResponse = deploy(functionId, params, RequestOptions.none())

    /** @see deploy */
    fun deploy(
        params: FunctionDeployParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionDeployResponse

    /** @see deploy */
    fun deploy(params: FunctionDeployParams): FunctionDeployResponse =
        deploy(params, RequestOptions.none())

    /** @see deploy */
    fun deploy(functionId: String, requestOptions: RequestOptions): FunctionDeployResponse =
        deploy(functionId, FunctionDeployParams.none(), requestOptions)

    /** Fetch a deployment to poll its status during a deploy. */
    fun getDeployment(deploymentId: String): FunctionGetDeploymentResponse =
        getDeployment(deploymentId, FunctionGetDeploymentParams.none())

    /** @see getDeployment */
    fun getDeployment(
        deploymentId: String,
        params: FunctionGetDeploymentParams = FunctionGetDeploymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionGetDeploymentResponse =
        getDeployment(params.toBuilder().deploymentId(deploymentId).build(), requestOptions)

    /** @see getDeployment */
    fun getDeployment(
        deploymentId: String,
        params: FunctionGetDeploymentParams = FunctionGetDeploymentParams.none(),
    ): FunctionGetDeploymentResponse = getDeployment(deploymentId, params, RequestOptions.none())

    /** @see getDeployment */
    fun getDeployment(
        params: FunctionGetDeploymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionGetDeploymentResponse

    /** @see getDeployment */
    fun getDeployment(params: FunctionGetDeploymentParams): FunctionGetDeploymentResponse =
        getDeployment(params, RequestOptions.none())

    /** @see getDeployment */
    fun getDeployment(
        deploymentId: String,
        requestOptions: RequestOptions,
    ): FunctionGetDeploymentResponse =
        getDeployment(deploymentId, FunctionGetDeploymentParams.none(), requestOptions)

    /**
     * Fetch invocation logs for a function. Logs are paginated via `nextToken`. Pass `startTime` /
     * `endTime` (Unix epoch milliseconds) to bound the window, or `filterPattern` to filter
     * messages.
     */
    fun tailLogs(functionId: String): FunctionTailLogsResponse =
        tailLogs(functionId, FunctionTailLogsParams.none())

    /** @see tailLogs */
    fun tailLogs(
        functionId: String,
        params: FunctionTailLogsParams = FunctionTailLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionTailLogsResponse =
        tailLogs(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see tailLogs */
    fun tailLogs(
        functionId: String,
        params: FunctionTailLogsParams = FunctionTailLogsParams.none(),
    ): FunctionTailLogsResponse = tailLogs(functionId, params, RequestOptions.none())

    /** @see tailLogs */
    fun tailLogs(
        params: FunctionTailLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionTailLogsResponse

    /** @see tailLogs */
    fun tailLogs(params: FunctionTailLogsParams): FunctionTailLogsResponse =
        tailLogs(params, RequestOptions.none())

    /** @see tailLogs */
    fun tailLogs(functionId: String, requestOptions: RequestOptions): FunctionTailLogsResponse =
        tailLogs(functionId, FunctionTailLogsParams.none(), requestOptions)

    /** A view of [FunctionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService.WithRawResponse

        fun secrets(): SecretService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/functions`, but is otherwise the same as
         * [FunctionService.create].
         */
        @MustBeClosed
        fun create(params: FunctionCreateParams): HttpResponseFor<FunctionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FunctionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/functions/{functionId}`, but is otherwise the
         * same as [FunctionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(functionId: String): HttpResponseFor<FunctionRetrieveResponse> =
            retrieve(functionId, FunctionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            functionId: String,
            params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionRetrieveResponse> =
            retrieve(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            functionId: String,
            params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
        ): HttpResponseFor<FunctionRetrieveResponse> =
            retrieve(functionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FunctionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FunctionRetrieveParams): HttpResponseFor<FunctionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            functionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FunctionRetrieveResponse> =
            retrieve(functionId, FunctionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/functions/{functionId}`, but is otherwise the
         * same as [FunctionService.update].
         */
        @MustBeClosed
        fun update(functionId: String): HttpResponseFor<FunctionUpdateResponse> =
            update(functionId, FunctionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            functionId: String,
            params: FunctionUpdateParams = FunctionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionUpdateResponse> =
            update(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            functionId: String,
            params: FunctionUpdateParams = FunctionUpdateParams.none(),
        ): HttpResponseFor<FunctionUpdateResponse> =
            update(functionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FunctionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: FunctionUpdateParams): HttpResponseFor<FunctionUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            functionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FunctionUpdateResponse> =
            update(functionId, FunctionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/functions/{functionId}`, but is otherwise the
         * same as [FunctionService.delete].
         */
        @MustBeClosed
        fun delete(functionId: String): HttpResponseFor<FunctionDeleteResponse> =
            delete(functionId, FunctionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            functionId: String,
            params: FunctionDeleteParams = FunctionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionDeleteResponse> =
            delete(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            functionId: String,
            params: FunctionDeleteParams = FunctionDeleteParams.none(),
        ): HttpResponseFor<FunctionDeleteResponse> =
            delete(functionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: FunctionDeleteParams): HttpResponseFor<FunctionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            functionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FunctionDeleteResponse> =
            delete(functionId, FunctionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/functions/{functionId}/deploy`, but is
         * otherwise the same as [FunctionService.deploy].
         */
        @MustBeClosed
        fun deploy(functionId: String): HttpResponseFor<FunctionDeployResponse> =
            deploy(functionId, FunctionDeployParams.none())

        /** @see deploy */
        @MustBeClosed
        fun deploy(
            functionId: String,
            params: FunctionDeployParams = FunctionDeployParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionDeployResponse> =
            deploy(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see deploy */
        @MustBeClosed
        fun deploy(
            functionId: String,
            params: FunctionDeployParams = FunctionDeployParams.none(),
        ): HttpResponseFor<FunctionDeployResponse> =
            deploy(functionId, params, RequestOptions.none())

        /** @see deploy */
        @MustBeClosed
        fun deploy(
            params: FunctionDeployParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionDeployResponse>

        /** @see deploy */
        @MustBeClosed
        fun deploy(params: FunctionDeployParams): HttpResponseFor<FunctionDeployResponse> =
            deploy(params, RequestOptions.none())

        /** @see deploy */
        @MustBeClosed
        fun deploy(
            functionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FunctionDeployResponse> =
            deploy(functionId, FunctionDeployParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/functions/deployments/{deploymentId}`, but is
         * otherwise the same as [FunctionService.getDeployment].
         */
        @MustBeClosed
        fun getDeployment(deploymentId: String): HttpResponseFor<FunctionGetDeploymentResponse> =
            getDeployment(deploymentId, FunctionGetDeploymentParams.none())

        /** @see getDeployment */
        @MustBeClosed
        fun getDeployment(
            deploymentId: String,
            params: FunctionGetDeploymentParams = FunctionGetDeploymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionGetDeploymentResponse> =
            getDeployment(params.toBuilder().deploymentId(deploymentId).build(), requestOptions)

        /** @see getDeployment */
        @MustBeClosed
        fun getDeployment(
            deploymentId: String,
            params: FunctionGetDeploymentParams = FunctionGetDeploymentParams.none(),
        ): HttpResponseFor<FunctionGetDeploymentResponse> =
            getDeployment(deploymentId, params, RequestOptions.none())

        /** @see getDeployment */
        @MustBeClosed
        fun getDeployment(
            params: FunctionGetDeploymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionGetDeploymentResponse>

        /** @see getDeployment */
        @MustBeClosed
        fun getDeployment(
            params: FunctionGetDeploymentParams
        ): HttpResponseFor<FunctionGetDeploymentResponse> =
            getDeployment(params, RequestOptions.none())

        /** @see getDeployment */
        @MustBeClosed
        fun getDeployment(
            deploymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FunctionGetDeploymentResponse> =
            getDeployment(deploymentId, FunctionGetDeploymentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/functions/{functionId}/logs`, but is otherwise
         * the same as [FunctionService.tailLogs].
         */
        @MustBeClosed
        fun tailLogs(functionId: String): HttpResponseFor<FunctionTailLogsResponse> =
            tailLogs(functionId, FunctionTailLogsParams.none())

        /** @see tailLogs */
        @MustBeClosed
        fun tailLogs(
            functionId: String,
            params: FunctionTailLogsParams = FunctionTailLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionTailLogsResponse> =
            tailLogs(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see tailLogs */
        @MustBeClosed
        fun tailLogs(
            functionId: String,
            params: FunctionTailLogsParams = FunctionTailLogsParams.none(),
        ): HttpResponseFor<FunctionTailLogsResponse> =
            tailLogs(functionId, params, RequestOptions.none())

        /** @see tailLogs */
        @MustBeClosed
        fun tailLogs(
            params: FunctionTailLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionTailLogsResponse>

        /** @see tailLogs */
        @MustBeClosed
        fun tailLogs(params: FunctionTailLogsParams): HttpResponseFor<FunctionTailLogsResponse> =
            tailLogs(params, RequestOptions.none())

        /** @see tailLogs */
        @MustBeClosed
        fun tailLogs(
            functionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FunctionTailLogsResponse> =
            tailLogs(functionId, FunctionTailLogsParams.none(), requestOptions)
    }
}
