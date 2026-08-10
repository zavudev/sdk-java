// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.templates.Template
import com.zavudev.api.models.templates.TemplateCreateParams
import com.zavudev.api.models.templates.TemplateDeleteParams
import com.zavudev.api.models.templates.TemplateListPageAsync
import com.zavudev.api.models.templates.TemplateListParams
import com.zavudev.api.models.templates.TemplateRetrieveParams
import com.zavudev.api.models.templates.TemplateSubmitParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync

    /** Create a WhatsApp message template. Note: Templates must be approved by Meta before use. */
    fun create(params: TemplateCreateParams): CompletableFuture<Template> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Template>

    /** Get template */
    fun retrieve(templateId: String): CompletableFuture<Template> =
        retrieve(templateId, TemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Template> =
        retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
    ): CompletableFuture<Template> = retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Template>

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): CompletableFuture<Template> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(templateId: String, requestOptions: RequestOptions): CompletableFuture<Template> =
        retrieve(templateId, TemplateRetrieveParams.none(), requestOptions)

    /** List WhatsApp message templates for this project. */
    fun list(): CompletableFuture<TemplateListPageAsync> = list(TemplateListParams.none())

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateListPageAsync>

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none()
    ): CompletableFuture<TemplateListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TemplateListPageAsync> =
        list(TemplateListParams.none(), requestOptions)

    /** Delete template */
    fun delete(templateId: String): CompletableFuture<Void?> =
        delete(templateId, TemplateDeleteParams.none())

    /** @see delete */
    fun delete(
        templateId: String,
        params: TemplateDeleteParams = TemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see delete */
    fun delete(
        templateId: String,
        params: TemplateDeleteParams = TemplateDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(templateId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TemplateDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(templateId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(templateId, TemplateDeleteParams.none(), requestOptions)

    /**
     * Submit a WhatsApp template to Meta for approval. The template must be in draft status and
     * associated with a sender that has a WhatsApp Business Account configured.
     */
    fun submit(templateId: String, params: TemplateSubmitParams): CompletableFuture<Template> =
        submit(templateId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        templateId: String,
        params: TemplateSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Template> =
        submit(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see submit */
    fun submit(params: TemplateSubmitParams): CompletableFuture<Template> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: TemplateSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Template>

    /**
     * A view of [TemplateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/templates`, but is otherwise the same as
         * [TemplateServiceAsync.create].
         */
        fun create(params: TemplateCreateParams): CompletableFuture<HttpResponseFor<Template>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Template>>

        /**
         * Returns a raw HTTP response for `get /v1/templates/{templateId}`, but is otherwise the
         * same as [TemplateServiceAsync.retrieve].
         */
        fun retrieve(templateId: String): CompletableFuture<HttpResponseFor<Template>> =
            retrieve(templateId, TemplateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Template>> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Template>> =
            retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Template>>

        /** @see retrieve */
        fun retrieve(params: TemplateRetrieveParams): CompletableFuture<HttpResponseFor<Template>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Template>> =
            retrieve(templateId, TemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/templates`, but is otherwise the same as
         * [TemplateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TemplateListPageAsync>> =
            list(TemplateListParams.none())

        /** @see list */
        fun list(
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateListPageAsync>>

        /** @see list */
        fun list(
            params: TemplateListParams = TemplateListParams.none()
        ): CompletableFuture<HttpResponseFor<TemplateListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TemplateListPageAsync>> =
            list(TemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/templates/{templateId}`, but is otherwise the
         * same as [TemplateServiceAsync.delete].
         */
        fun delete(templateId: String): CompletableFuture<HttpResponse> =
            delete(templateId, TemplateDeleteParams.none())

        /** @see delete */
        fun delete(
            templateId: String,
            params: TemplateDeleteParams = TemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see delete */
        fun delete(
            templateId: String,
            params: TemplateDeleteParams = TemplateDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(templateId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TemplateDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(templateId, TemplateDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/templates/{templateId}/submit`, but is
         * otherwise the same as [TemplateServiceAsync.submit].
         */
        fun submit(
            templateId: String,
            params: TemplateSubmitParams,
        ): CompletableFuture<HttpResponseFor<Template>> =
            submit(templateId, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            templateId: String,
            params: TemplateSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Template>> =
            submit(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see submit */
        fun submit(params: TemplateSubmitParams): CompletableFuture<HttpResponseFor<Template>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: TemplateSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Template>>
    }
}
