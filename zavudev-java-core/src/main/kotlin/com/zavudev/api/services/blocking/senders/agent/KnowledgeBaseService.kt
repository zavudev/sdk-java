// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseCreateResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseDeleteParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListPage
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseListParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseRetrieveResponse
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateParams
import com.zavudev.api.models.senders.agent.knowledgebases.KnowledgeBaseUpdateResponse
import com.zavudev.api.services.blocking.senders.agent.knowledgebases.DocumentService
import java.util.function.Consumer

interface KnowledgeBaseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeBaseService

    fun documents(): DocumentService

    /** Create a new knowledge base for an agent. */
    fun create(senderId: String, params: KnowledgeBaseCreateParams): KnowledgeBaseCreateResponse =
        create(senderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        senderId: String,
        params: KnowledgeBaseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseCreateResponse =
        create(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see create */
    fun create(params: KnowledgeBaseCreateParams): KnowledgeBaseCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: KnowledgeBaseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseCreateResponse

    /** Get a specific knowledge base. */
    fun retrieve(kbId: String, params: KnowledgeBaseRetrieveParams): KnowledgeBaseRetrieveResponse =
        retrieve(kbId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        kbId: String,
        params: KnowledgeBaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseRetrieveResponse =
        retrieve(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: KnowledgeBaseRetrieveParams): KnowledgeBaseRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: KnowledgeBaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseRetrieveResponse

    /** Update a knowledge base. */
    fun update(kbId: String, params: KnowledgeBaseUpdateParams): KnowledgeBaseUpdateResponse =
        update(kbId, params, RequestOptions.none())

    /** @see update */
    fun update(
        kbId: String,
        params: KnowledgeBaseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseUpdateResponse = update(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see update */
    fun update(params: KnowledgeBaseUpdateParams): KnowledgeBaseUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: KnowledgeBaseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseUpdateResponse

    /** List knowledge bases for an agent. */
    fun list(senderId: String): KnowledgeBaseListPage =
        list(senderId, KnowledgeBaseListParams.none())

    /** @see list */
    fun list(
        senderId: String,
        params: KnowledgeBaseListParams = KnowledgeBaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseListPage = list(params.toBuilder().senderId(senderId).build(), requestOptions)

    /** @see list */
    fun list(
        senderId: String,
        params: KnowledgeBaseListParams = KnowledgeBaseListParams.none(),
    ): KnowledgeBaseListPage = list(senderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: KnowledgeBaseListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KnowledgeBaseListPage

    /** @see list */
    fun list(params: KnowledgeBaseListParams): KnowledgeBaseListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(senderId: String, requestOptions: RequestOptions): KnowledgeBaseListPage =
        list(senderId, KnowledgeBaseListParams.none(), requestOptions)

    /** Delete a knowledge base and all its documents. */
    fun delete(kbId: String, params: KnowledgeBaseDeleteParams) =
        delete(kbId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        kbId: String,
        params: KnowledgeBaseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().kbId(kbId).build(), requestOptions)

    /** @see delete */
    fun delete(params: KnowledgeBaseDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: KnowledgeBaseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [KnowledgeBaseService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeBaseService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/senders/{senderId}/agent/knowledge-bases`, but
         * is otherwise the same as [KnowledgeBaseService.create].
         */
        @MustBeClosed
        fun create(
            senderId: String,
            params: KnowledgeBaseCreateParams,
        ): HttpResponseFor<KnowledgeBaseCreateResponse> =
            create(senderId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            senderId: String,
            params: KnowledgeBaseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseCreateResponse> =
            create(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: KnowledgeBaseCreateParams
        ): HttpResponseFor<KnowledgeBaseCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: KnowledgeBaseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}`, but is otherwise the same as
         * [KnowledgeBaseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            kbId: String,
            params: KnowledgeBaseRetrieveParams,
        ): HttpResponseFor<KnowledgeBaseRetrieveResponse> =
            retrieve(kbId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            kbId: String,
            params: KnowledgeBaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseRetrieveResponse> =
            retrieve(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: KnowledgeBaseRetrieveParams
        ): HttpResponseFor<KnowledgeBaseRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: KnowledgeBaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}`, but is otherwise the same as
         * [KnowledgeBaseService.update].
         */
        @MustBeClosed
        fun update(
            kbId: String,
            params: KnowledgeBaseUpdateParams,
        ): HttpResponseFor<KnowledgeBaseUpdateResponse> =
            update(kbId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            kbId: String,
            params: KnowledgeBaseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseUpdateResponse> =
            update(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: KnowledgeBaseUpdateParams
        ): HttpResponseFor<KnowledgeBaseUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: KnowledgeBaseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/senders/{senderId}/agent/knowledge-bases`, but
         * is otherwise the same as [KnowledgeBaseService.list].
         */
        @MustBeClosed
        fun list(senderId: String): HttpResponseFor<KnowledgeBaseListPage> =
            list(senderId, KnowledgeBaseListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            senderId: String,
            params: KnowledgeBaseListParams = KnowledgeBaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseListPage> =
            list(params.toBuilder().senderId(senderId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            senderId: String,
            params: KnowledgeBaseListParams = KnowledgeBaseListParams.none(),
        ): HttpResponseFor<KnowledgeBaseListPage> = list(senderId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: KnowledgeBaseListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KnowledgeBaseListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: KnowledgeBaseListParams): HttpResponseFor<KnowledgeBaseListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            senderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KnowledgeBaseListPage> =
            list(senderId, KnowledgeBaseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/senders/{senderId}/agent/knowledge-bases/{kbId}`, but is otherwise the same as
         * [KnowledgeBaseService.delete].
         */
        @MustBeClosed
        fun delete(kbId: String, params: KnowledgeBaseDeleteParams): HttpResponse =
            delete(kbId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            kbId: String,
            params: KnowledgeBaseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().kbId(kbId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: KnowledgeBaseDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: KnowledgeBaseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
