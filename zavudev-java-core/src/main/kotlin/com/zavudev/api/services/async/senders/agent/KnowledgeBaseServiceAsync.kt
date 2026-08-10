// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListPageAsync
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateResponse
import com.zavudev.api.services.async.senders.agent.knowledgebases.DocumentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface KnowledgeBaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeBaseServiceAsync

    fun documents(): DocumentServiceAsync

    /** Create a new knowledge base for an agent. */
    fun create(
        senderId: String,
        params: KnowledgeBaseCreateParams,
    ): CompletableFuture<KnowledgeBaseCreateResponse> =
        create(senderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        senderId: String,
        params: KnowledgeBaseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseCreateResponse> =
        create(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see create */
    fun create(params: KnowledgeBaseCreateParams): CompletableFuture<KnowledgeBaseCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: KnowledgeBaseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseCreateResponse>

    /** Get a specific knowledge base. */
    fun retrieve(
        kbId: String,
        params: KnowledgeBaseRetrieveParams,
    ): CompletableFuture<KnowledgeBaseRetrieveResponse> =
        retrieve(kbId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        kbId: String,
        params: KnowledgeBaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseRetrieveResponse> =
        retrieve(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: KnowledgeBaseRetrieveParams
    ): CompletableFuture<KnowledgeBaseRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: KnowledgeBaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseRetrieveResponse>

    /** Update a knowledge base. */
    fun update(
        kbId: String,
        params: KnowledgeBaseUpdateParams,
    ): CompletableFuture<KnowledgeBaseUpdateResponse> = update(kbId, params, RequestOptions.none())

    /** @see update */
    fun update(
        kbId: String,
        params: KnowledgeBaseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseUpdateResponse> =
        update(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see update */
    fun update(params: KnowledgeBaseUpdateParams): CompletableFuture<KnowledgeBaseUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: KnowledgeBaseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseUpdateResponse>

    /** List knowledge bases for an agent. */
    fun list(senderId: String): CompletableFuture<KnowledgeBaseListPageAsync> =
        list(senderId, KnowledgeBaseListParams.none())

    /** @see list */
    fun list(
        senderId: String,
        params: KnowledgeBaseListParams = KnowledgeBaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseListPageAsync> =
        list(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see list */
    fun list(
        senderId: String,
        params: KnowledgeBaseListParams = KnowledgeBaseListParams.none(),
    ): CompletableFuture<KnowledgeBaseListPageAsync> = list(senderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: KnowledgeBaseListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<KnowledgeBaseListPageAsync>

    /** @see list */
    fun list(params: KnowledgeBaseListParams): CompletableFuture<KnowledgeBaseListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        senderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<KnowledgeBaseListPageAsync> =
        list(senderId, KnowledgeBaseListParams.none(), requestOptions)

    /** Delete a knowledge base and all its documents. */
    fun delete(kbId: String, params: KnowledgeBaseDeleteParams): CompletableFuture<Void?> =
        delete(kbId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        kbId: String,
        params: KnowledgeBaseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see delete */
    fun delete(params: KnowledgeBaseDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: KnowledgeBaseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [KnowledgeBaseServiceAsync] that provides access to raw HTTP responses for each
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
        ): KnowledgeBaseServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent/knowledge-bases`, but
         * is otherwise the same as [KnowledgeBaseServiceAsync.create].
         */
        fun create(
            senderId: String,
            params: KnowledgeBaseCreateParams,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateResponse>> =
            create(senderId, params, RequestOptions.none())

        /** @see create */
        fun create(
            senderId: String,
            params: KnowledgeBaseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateResponse>> =
            create(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see create */
        fun create(
            params: KnowledgeBaseCreateParams
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: KnowledgeBaseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}`, but is otherwise the same as
         * [KnowledgeBaseServiceAsync.retrieve].
         */
        fun retrieve(
            kbId: String,
            params: KnowledgeBaseRetrieveParams,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseRetrieveResponse>> =
            retrieve(kbId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            kbId: String,
            params: KnowledgeBaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseRetrieveResponse>> =
            retrieve(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: KnowledgeBaseRetrieveParams
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: KnowledgeBaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}`, but is otherwise the same as
         * [KnowledgeBaseServiceAsync.update].
         */
        fun update(
            kbId: String,
            params: KnowledgeBaseUpdateParams,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateResponse>> =
            update(kbId, params, RequestOptions.none())

        /** @see update */
        fun update(
            kbId: String,
            params: KnowledgeBaseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateResponse>> =
            update(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see update */
        fun update(
            params: KnowledgeBaseUpdateParams
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: KnowledgeBaseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/knowledge-bases`, but
         * is otherwise the same as [KnowledgeBaseServiceAsync.list].
         */
        fun list(senderId: String): CompletableFuture<HttpResponseFor<KnowledgeBaseListPageAsync>> =
            list(senderId, KnowledgeBaseListParams.none())

        /** @see list */
        fun list(
            senderId: String,
            params: KnowledgeBaseListParams = KnowledgeBaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListPageAsync>> =
            list(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see list */
        fun list(
            senderId: String,
            params: KnowledgeBaseListParams = KnowledgeBaseListParams.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListPageAsync>> =
            list(senderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: KnowledgeBaseListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListPageAsync>>

        /** @see list */
        fun list(
            params: KnowledgeBaseListParams
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            senderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KnowledgeBaseListPageAsync>> =
            list(senderId, KnowledgeBaseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}`, but is otherwise the same as
         * [KnowledgeBaseServiceAsync.delete].
         */
        fun delete(
            kbId: String,
            params: KnowledgeBaseDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(kbId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            kbId: String,
            params: KnowledgeBaseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see delete */
        fun delete(params: KnowledgeBaseDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: KnowledgeBaseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
