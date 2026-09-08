// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.functions

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface TriggerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerService

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
    fun create(functionId: String, params: TriggerCreateParams): TriggerCreateResponse =
        create(functionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        functionId: String,
        params: TriggerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TriggerCreateResponse =
        create(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see create */
    fun create(params: TriggerCreateParams): TriggerCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TriggerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TriggerCreateResponse

    /** Enable or disable a trigger */
    fun update(triggerId: String, params: TriggerUpdateParams): TriggerUpdateResponse =
        update(triggerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        triggerId: String,
        params: TriggerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TriggerUpdateResponse =
        update(params.toBuilder().triggerId(triggerId).build(), requestOptions)

    /** @see update */
    fun update(params: TriggerUpdateParams): TriggerUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TriggerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TriggerUpdateResponse

    /** List function triggers */
    fun list(functionId: String): TriggerListResponse = list(functionId, TriggerListParams.none())

    /** @see list */
    fun list(
        functionId: String,
        params: TriggerListParams = TriggerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TriggerListResponse = list(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see list */
    fun list(
        functionId: String,
        params: TriggerListParams = TriggerListParams.none(),
    ): TriggerListResponse = list(functionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TriggerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TriggerListResponse

    /** @see list */
    fun list(params: TriggerListParams): TriggerListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(functionId: String, requestOptions: RequestOptions): TriggerListResponse =
        list(functionId, TriggerListParams.none(), requestOptions)

    /** Delete a trigger */
    fun delete(triggerId: String) = delete(triggerId, TriggerDeleteParams.none())

    /** @see delete */
    fun delete(
        triggerId: String,
        params: TriggerDeleteParams = TriggerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().triggerId(triggerId).build(), requestOptions)

    /** @see delete */
    fun delete(triggerId: String, params: TriggerDeleteParams = TriggerDeleteParams.none()) =
        delete(triggerId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TriggerDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TriggerDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(triggerId: String, requestOptions: RequestOptions) =
        delete(triggerId, TriggerDeleteParams.none(), requestOptions)

    /** A view of [TriggerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/functions/{functionId}/triggers`, but is
         * otherwise the same as [TriggerService.create].
         */
        @MustBeClosed
        fun create(
            functionId: String,
            params: TriggerCreateParams,
        ): HttpResponseFor<TriggerCreateResponse> =
            create(functionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            functionId: String,
            params: TriggerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TriggerCreateResponse> =
            create(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TriggerCreateParams): HttpResponseFor<TriggerCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TriggerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TriggerCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/functions/triggers/{triggerId}`, but is
         * otherwise the same as [TriggerService.update].
         */
        @MustBeClosed
        fun update(
            triggerId: String,
            params: TriggerUpdateParams,
        ): HttpResponseFor<TriggerUpdateResponse> = update(triggerId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            triggerId: String,
            params: TriggerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TriggerUpdateResponse> =
            update(params.toBuilder().triggerId(triggerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TriggerUpdateParams): HttpResponseFor<TriggerUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TriggerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TriggerUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/functions/{functionId}/triggers`, but is
         * otherwise the same as [TriggerService.list].
         */
        @MustBeClosed
        fun list(functionId: String): HttpResponseFor<TriggerListResponse> =
            list(functionId, TriggerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            functionId: String,
            params: TriggerListParams = TriggerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TriggerListResponse> =
            list(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            functionId: String,
            params: TriggerListParams = TriggerListParams.none(),
        ): HttpResponseFor<TriggerListResponse> = list(functionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TriggerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TriggerListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TriggerListParams): HttpResponseFor<TriggerListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            functionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TriggerListResponse> =
            list(functionId, TriggerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/functions/triggers/{triggerId}`, but is
         * otherwise the same as [TriggerService.delete].
         */
        @MustBeClosed
        fun delete(triggerId: String): HttpResponse = delete(triggerId, TriggerDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            triggerId: String,
            params: TriggerDeleteParams = TriggerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().triggerId(triggerId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            triggerId: String,
            params: TriggerDeleteParams = TriggerDeleteParams.none(),
        ): HttpResponse = delete(triggerId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TriggerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TriggerDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(triggerId: String, requestOptions: RequestOptions): HttpResponse =
            delete(triggerId, TriggerDeleteParams.none(), requestOptions)
    }
}
