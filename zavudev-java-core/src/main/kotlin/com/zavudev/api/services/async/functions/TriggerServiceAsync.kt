// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.functions

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.functions.triggers.TriggerCreateParams
import com.zavudev.api.models.functions.triggers.TriggerCreateResponse
import com.zavudev.api.models.functions.triggers.TriggerDeleteParams
import com.zavudev.api.models.functions.triggers.TriggerListParams
import com.zavudev.api.models.functions.triggers.TriggerListResponse
import com.zavudev.api.models.functions.triggers.TriggerUpdateParams
import com.zavudev.api.models.functions.triggers.TriggerUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TriggerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerServiceAsync

    /**
     * Subscribe a function to one or more event types, optionally scoped to specific senders.
     * Provide eventTypes and senderIds (use null in senderIds for all senders); a trigger is
     * created for each event type and sender combination.
     *
     * The special event type `cron` runs the function on a schedule instead of a messaging event:
     * include a `cron` field with a 5-field UTC cron expression (minimum granularity one minute). A
     * cron trigger ignores the sender axis, and a function may hold several cron triggers with
     * different expressions. The function receives an event with `type: "cron"` and `data.cron`.
     */
    fun create(
        functionId: String,
        params: TriggerCreateParams,
    ): CompletableFuture<TriggerCreateResponse> = create(functionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        functionId: String,
        params: TriggerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TriggerCreateResponse> =
        create(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see create */
    fun create(params: TriggerCreateParams): CompletableFuture<TriggerCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TriggerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TriggerCreateResponse>

    /** Enable or disable a trigger */
    fun update(
        triggerId: String,
        params: TriggerUpdateParams,
    ): CompletableFuture<TriggerUpdateResponse> = update(triggerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        triggerId: String,
        params: TriggerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TriggerUpdateResponse> =
        update(params.toBuilder().triggerId(triggerId).build(), requestOptions)

    /** @see update */
    fun update(params: TriggerUpdateParams): CompletableFuture<TriggerUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TriggerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TriggerUpdateResponse>

    /** List function triggers */
    fun list(functionId: String): CompletableFuture<TriggerListResponse> =
        list(functionId, TriggerListParams.none())

    /** @see list */
    fun list(
        functionId: String,
        params: TriggerListParams = TriggerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TriggerListResponse> =
        list(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see list */
    fun list(
        functionId: String,
        params: TriggerListParams = TriggerListParams.none(),
    ): CompletableFuture<TriggerListResponse> = list(functionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TriggerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TriggerListResponse>

    /** @see list */
    fun list(params: TriggerListParams): CompletableFuture<TriggerListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TriggerListResponse> =
        list(functionId, TriggerListParams.none(), requestOptions)

    /** Delete a trigger */
    fun delete(triggerId: String): CompletableFuture<Void?> =
        delete(triggerId, TriggerDeleteParams.none())

    /** @see delete */
    fun delete(
        triggerId: String,
        params: TriggerDeleteParams = TriggerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().triggerId(triggerId).build(), requestOptions)

    /** @see delete */
    fun delete(
        triggerId: String,
        params: TriggerDeleteParams = TriggerDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(triggerId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TriggerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TriggerDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(triggerId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(triggerId, TriggerDeleteParams.none(), requestOptions)

    /**
     * A view of [TriggerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TriggerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/functions/{functionId}/triggers`, but is
         * otherwise the same as [TriggerServiceAsync.create].
         */
        fun create(
            functionId: String,
            params: TriggerCreateParams,
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(functionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            functionId: String,
            params: TriggerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: TriggerCreateParams
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TriggerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/functions/triggers/{triggerId}`, but is
         * otherwise the same as [TriggerServiceAsync.update].
         */
        fun update(
            triggerId: String,
            params: TriggerUpdateParams,
        ): CompletableFuture<HttpResponseFor<TriggerUpdateResponse>> =
            update(triggerId, params, RequestOptions.none())

        /** @see update */
        fun update(
            triggerId: String,
            params: TriggerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TriggerUpdateResponse>> =
            update(params.toBuilder().triggerId(triggerId).build(), requestOptions)

        /** @see update */
        fun update(
            params: TriggerUpdateParams
        ): CompletableFuture<HttpResponseFor<TriggerUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TriggerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TriggerUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/functions/{functionId}/triggers`, but is
         * otherwise the same as [TriggerServiceAsync.list].
         */
        fun list(functionId: String): CompletableFuture<HttpResponseFor<TriggerListResponse>> =
            list(functionId, TriggerListParams.none())

        /** @see list */
        fun list(
            functionId: String,
            params: TriggerListParams = TriggerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TriggerListResponse>> =
            list(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see list */
        fun list(
            functionId: String,
            params: TriggerListParams = TriggerListParams.none(),
        ): CompletableFuture<HttpResponseFor<TriggerListResponse>> =
            list(functionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TriggerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TriggerListResponse>>

        /** @see list */
        fun list(
            params: TriggerListParams
        ): CompletableFuture<HttpResponseFor<TriggerListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TriggerListResponse>> =
            list(functionId, TriggerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/functions/triggers/{triggerId}`, but is
         * otherwise the same as [TriggerServiceAsync.delete].
         */
        fun delete(triggerId: String): CompletableFuture<HttpResponse> =
            delete(triggerId, TriggerDeleteParams.none())

        /** @see delete */
        fun delete(
            triggerId: String,
            params: TriggerDeleteParams = TriggerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().triggerId(triggerId).build(), requestOptions)

        /** @see delete */
        fun delete(
            triggerId: String,
            params: TriggerDeleteParams = TriggerDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(triggerId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TriggerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TriggerDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            triggerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(triggerId, TriggerDeleteParams.none(), requestOptions)
    }
}
