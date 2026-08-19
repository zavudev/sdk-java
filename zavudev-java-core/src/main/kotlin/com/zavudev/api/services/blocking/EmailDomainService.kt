// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponse
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.emaildomains.EmailDomainCreateParams
import com.zavudev.api.models.emaildomains.EmailDomainCreateResponse
import com.zavudev.api.models.emaildomains.EmailDomainDeleteParams
import com.zavudev.api.models.emaildomains.EmailDomainListParams
import com.zavudev.api.models.emaildomains.EmailDomainListResponse
import com.zavudev.api.models.emaildomains.EmailDomainRetrieveParams
import com.zavudev.api.models.emaildomains.EmailDomainRetrieveResponse
import com.zavudev.api.models.emaildomains.EmailDomainVerifyParams
import com.zavudev.api.models.emaildomains.EmailDomainVerifyResponse
import java.util.function.Consumer

interface EmailDomainService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailDomainService

    /**
     * Add a domain to send email from. Returns the DNS records to publish (DKIM CNAMEs are
     * required; SPF, DMARC, and MAIL FROM are recommended). Publish them at your DNS provider, then
     * verify.
     */
    fun create(params: EmailDomainCreateParams): EmailDomainCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailDomainCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainCreateResponse

    /** Fetch a domain with its DNS records and current status. */
    fun retrieve(domainId: String): EmailDomainRetrieveResponse =
        retrieve(domainId, EmailDomainRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        domainId: String,
        params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainRetrieveResponse =
        retrieve(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        domainId: String,
        params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
    ): EmailDomainRetrieveResponse = retrieve(domainId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailDomainRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EmailDomainRetrieveParams): EmailDomainRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(domainId: String, requestOptions: RequestOptions): EmailDomainRetrieveResponse =
        retrieve(domainId, EmailDomainRetrieveParams.none(), requestOptions)

    /** List email domains */
    fun list(): EmailDomainListResponse = list(EmailDomainListParams.none())

    /** @see list */
    fun list(
        params: EmailDomainListParams = EmailDomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainListResponse

    /** @see list */
    fun list(
        params: EmailDomainListParams = EmailDomainListParams.none()
    ): EmailDomainListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailDomainListResponse =
        list(EmailDomainListParams.none(), requestOptions)

    /** Remove an email domain */
    fun delete(domainId: String) = delete(domainId, EmailDomainDeleteParams.none())

    /** @see delete */
    fun delete(
        domainId: String,
        params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see delete */
    fun delete(domainId: String, params: EmailDomainDeleteParams = EmailDomainDeleteParams.none()) =
        delete(domainId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailDomainDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EmailDomainDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(domainId: String, requestOptions: RequestOptions) =
        delete(domainId, EmailDomainDeleteParams.none(), requestOptions)

    /** Re-check the domain's published DNS records and refresh its status. */
    fun verify(domainId: String): EmailDomainVerifyResponse =
        verify(domainId, EmailDomainVerifyParams.none())

    /** @see verify */
    fun verify(
        domainId: String,
        params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainVerifyResponse =
        verify(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see verify */
    fun verify(
        domainId: String,
        params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
    ): EmailDomainVerifyResponse = verify(domainId, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: EmailDomainVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainVerifyResponse

    /** @see verify */
    fun verify(params: EmailDomainVerifyParams): EmailDomainVerifyResponse =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(domainId: String, requestOptions: RequestOptions): EmailDomainVerifyResponse =
        verify(domainId, EmailDomainVerifyParams.none(), requestOptions)

    /**
     * A view of [EmailDomainService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailDomainService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/email-domains`, but is otherwise the same as
         * [EmailDomainService.create].
         */
        @MustBeClosed
        fun create(params: EmailDomainCreateParams): HttpResponseFor<EmailDomainCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailDomainCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/email-domains/{domainId}`, but is otherwise the
         * same as [EmailDomainService.retrieve].
         */
        @MustBeClosed
        fun retrieve(domainId: String): HttpResponseFor<EmailDomainRetrieveResponse> =
            retrieve(domainId, EmailDomainRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            domainId: String,
            params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainRetrieveResponse> =
            retrieve(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            domainId: String,
            params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
        ): HttpResponseFor<EmailDomainRetrieveResponse> =
            retrieve(domainId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailDomainRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailDomainRetrieveParams
        ): HttpResponseFor<EmailDomainRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            domainId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainRetrieveResponse> =
            retrieve(domainId, EmailDomainRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/email-domains`, but is otherwise the same as
         * [EmailDomainService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EmailDomainListResponse> = list(EmailDomainListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailDomainListParams = EmailDomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailDomainListParams = EmailDomainListParams.none()
        ): HttpResponseFor<EmailDomainListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailDomainListResponse> =
            list(EmailDomainListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/email-domains/{domainId}`, but is otherwise
         * the same as [EmailDomainService.delete].
         */
        @MustBeClosed
        fun delete(domainId: String): HttpResponse =
            delete(domainId, EmailDomainDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            domainId: String,
            params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            domainId: String,
            params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
        ): HttpResponse = delete(domainId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailDomainDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailDomainDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(domainId: String, requestOptions: RequestOptions): HttpResponse =
            delete(domainId, EmailDomainDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/email-domains/{domainId}/verify`, but is
         * otherwise the same as [EmailDomainService.verify].
         */
        @MustBeClosed
        fun verify(domainId: String): HttpResponseFor<EmailDomainVerifyResponse> =
            verify(domainId, EmailDomainVerifyParams.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            domainId: String,
            params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainVerifyResponse> =
            verify(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        fun verify(
            domainId: String,
            params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
        ): HttpResponseFor<EmailDomainVerifyResponse> =
            verify(domainId, params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: EmailDomainVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainVerifyResponse>

        /** @see verify */
        @MustBeClosed
        fun verify(params: EmailDomainVerifyParams): HttpResponseFor<EmailDomainVerifyResponse> =
            verify(params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            domainId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainVerifyResponse> =
            verify(domainId, EmailDomainVerifyParams.none(), requestOptions)
    }
}
