// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent.tools

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.WebhookSecretResponse
import com.zavudev.api.models.senders.agent.tools.webhook.WebhookRotateSecretParams
import java.util.function.Consumer

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    /**
     * Generate a new signing secret for this tool. The previous one stops working on the next call,
     * with no overlap, so update your endpoint first. The tool keeps its id, so flows that
     * reference it by name are unaffected.
     */
    fun rotateSecret(toolId: String, params: WebhookRotateSecretParams): WebhookSecretResponse =
        rotateSecret(toolId, params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(
        toolId: String,
        params: WebhookRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSecretResponse =
        rotateSecret(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see rotateSecret */
    fun rotateSecret(params: WebhookRotateSecretParams): WebhookSecretResponse =
        rotateSecret(params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(
        params: WebhookRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSecretResponse

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/senders/{senderId}/agent/tools/{toolId}/webhook/secret`, but is otherwise the same as
         * [WebhookService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(
            toolId: String,
            params: WebhookRotateSecretParams,
        ): HttpResponseFor<WebhookSecretResponse> =
            rotateSecret(toolId, params, RequestOptions.none())

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            toolId: String,
            params: WebhookRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSecretResponse> =
            rotateSecret(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            params: WebhookRotateSecretParams
        ): HttpResponseFor<WebhookSecretResponse> = rotateSecret(params, RequestOptions.none())

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            params: WebhookRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSecretResponse>
    }
}
