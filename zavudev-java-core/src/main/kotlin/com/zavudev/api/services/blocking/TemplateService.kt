// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.templates.Template
import com.zavudev.api.models.templates.TemplateCreateParams
import com.zavudev.api.models.templates.TemplateDeleteParams
import com.zavudev.api.models.templates.TemplateListPage
import com.zavudev.api.models.templates.TemplateListParams
import com.zavudev.api.models.templates.TemplateRetrieveParams
import com.zavudev.api.models.templates.TemplateSubmitParams
import java.util.function.Consumer

interface TemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService

    /** Create a WhatsApp message template. Note: Templates must be approved by Meta before use. */
    fun create(params: TemplateCreateParams): Template = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Template

    /** Get template */
    fun retrieve(templateId: String): Template = retrieve(templateId, TemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Template = retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
    ): Template = retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Template

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): Template = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(templateId: String, requestOptions: RequestOptions): Template =
        retrieve(templateId, TemplateRetrieveParams.none(), requestOptions)

    /** List WhatsApp message templates for this project. */
    fun list(): TemplateListPage = list(TemplateListParams.none())

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateListPage

    /** @see list */
    fun list(params: TemplateListParams = TemplateListParams.none()): TemplateListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TemplateListPage =
        list(TemplateListParams.none(), requestOptions)

    /** Delete template */
    fun delete(templateId: String) = delete(templateId, TemplateDeleteParams.none())

    /** @see delete */
    fun delete(
        templateId: String,
        params: TemplateDeleteParams = TemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see delete */
    fun delete(templateId: String, params: TemplateDeleteParams = TemplateDeleteParams.none()) =
        delete(templateId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TemplateDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TemplateDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(templateId: String, requestOptions: RequestOptions) =
        delete(templateId, TemplateDeleteParams.none(), requestOptions)

    /**
     * Submit a WhatsApp template to Meta for approval. The template must be in draft status and
     * associated with a sender that has a WhatsApp Business Account configured.
     */
    fun submit(templateId: String, params: TemplateSubmitParams): Template =
        submit(templateId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        templateId: String,
        params: TemplateSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Template = submit(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see submit */
    fun submit(params: TemplateSubmitParams): Template = submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: TemplateSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Template

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/templates`, but is otherwise the same as
         * [TemplateService.create].
         */
        @MustBeClosed
        fun create(params: TemplateCreateParams): HttpResponseFor<Template> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Template>

        /**
         * Returns a raw HTTP response for `get /v1/templates/{templateId}`, but is otherwise the
         * same as [TemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(templateId: String): HttpResponseFor<Template> =
            retrieve(templateId, TemplateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Template> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        ): HttpResponseFor<Template> = retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Template>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TemplateRetrieveParams): HttpResponseFor<Template> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Template> =
            retrieve(templateId, TemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/templates`, but is otherwise the same as
         * [TemplateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TemplateListPage> = list(TemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams = TemplateListParams.none()
        ): HttpResponseFor<TemplateListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TemplateListPage> =
            list(TemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/templates/{templateId}`, but is otherwise the
         * same as [TemplateService.delete].
         */
        @MustBeClosed
        fun delete(templateId: String): HttpResponse =
            delete(templateId, TemplateDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            templateId: String,
            params: TemplateDeleteParams = TemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            templateId: String,
            params: TemplateDeleteParams = TemplateDeleteParams.none(),
        ): HttpResponse = delete(templateId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TemplateDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(templateId: String, requestOptions: RequestOptions): HttpResponse =
            delete(templateId, TemplateDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/templates/{templateId}/submit`, but is
         * otherwise the same as [TemplateService.submit].
         */
        @MustBeClosed
        fun submit(templateId: String, params: TemplateSubmitParams): HttpResponseFor<Template> =
            submit(templateId, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            templateId: String,
            params: TemplateSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Template> =
            submit(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(params: TemplateSubmitParams): HttpResponseFor<Template> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: TemplateSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Template>
    }
}
