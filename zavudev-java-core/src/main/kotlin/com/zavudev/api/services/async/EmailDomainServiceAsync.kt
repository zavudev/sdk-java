// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmailDomainServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailDomainServiceAsync

    /**
     * Add a domain to send email from. Returns the DNS records to publish (DKIM CNAMEs are
     * required; SPF, DMARC, and MAIL FROM are recommended). Publish them at your DNS provider, then
     * verify.
     */
    fun create(params: EmailDomainCreateParams): CompletableFuture<EmailDomainCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailDomainCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainCreateResponse>

    /** Fetch a domain with its DNS records and current status. */
    fun retrieve(domainId: String): CompletableFuture<EmailDomainRetrieveResponse> =
        retrieve(domainId, EmailDomainRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        domainId: String,
        params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainRetrieveResponse> =
        retrieve(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        domainId: String,
        params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
    ): CompletableFuture<EmailDomainRetrieveResponse> =
        retrieve(domainId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailDomainRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: EmailDomainRetrieveParams
    ): CompletableFuture<EmailDomainRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        domainId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainRetrieveResponse> =
        retrieve(domainId, EmailDomainRetrieveParams.none(), requestOptions)

    /** List email domains */
    fun list(): CompletableFuture<EmailDomainListResponse> = list(EmailDomainListParams.none())

    /** @see list */
    fun list(
        params: EmailDomainListParams = EmailDomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainListResponse>

    /** @see list */
    fun list(
        params: EmailDomainListParams = EmailDomainListParams.none()
    ): CompletableFuture<EmailDomainListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailDomainListResponse> =
        list(EmailDomainListParams.none(), requestOptions)

    /** Remove an email domain */
    fun delete(domainId: String): CompletableFuture<Void?> =
        delete(domainId, EmailDomainDeleteParams.none())

    /** @see delete */
    fun delete(
        domainId: String,
        params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see delete */
    fun delete(
        domainId: String,
        params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(domainId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailDomainDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EmailDomainDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(domainId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(domainId, EmailDomainDeleteParams.none(), requestOptions)

    /** Re-check the domain's published DNS records and refresh its status. */
    fun verify(domainId: String): CompletableFuture<EmailDomainVerifyResponse> =
        verify(domainId, EmailDomainVerifyParams.none())

    /** @see verify */
    fun verify(
        domainId: String,
        params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainVerifyResponse> =
        verify(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see verify */
    fun verify(
        domainId: String,
        params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
    ): CompletableFuture<EmailDomainVerifyResponse> =
        verify(domainId, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: EmailDomainVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainVerifyResponse>

    /** @see verify */
    fun verify(params: EmailDomainVerifyParams): CompletableFuture<EmailDomainVerifyResponse> =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        domainId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainVerifyResponse> =
        verify(domainId, EmailDomainVerifyParams.none(), requestOptions)

    /**
     * A view of [EmailDomainServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmailDomainServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/email-domains`, but is otherwise the same as
         * [EmailDomainServiceAsync.create].
         */
        fun create(
            params: EmailDomainCreateParams
        ): CompletableFuture<HttpResponseFor<EmailDomainCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailDomainCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/email-domains/{domainId}`, but is otherwise the
         * same as [EmailDomainServiceAsync.retrieve].
         */
        fun retrieve(
            domainId: String
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveResponse>> =
            retrieve(domainId, EmailDomainRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            domainId: String,
            params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveResponse>> =
            retrieve(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            domainId: String,
            params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveResponse>> =
            retrieve(domainId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmailDomainRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmailDomainRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            domainId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveResponse>> =
            retrieve(domainId, EmailDomainRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/email-domains`, but is otherwise the same as
         * [EmailDomainServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailDomainListResponse>> =
            list(EmailDomainListParams.none())

        /** @see list */
        fun list(
            params: EmailDomainListParams = EmailDomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainListResponse>>

        /** @see list */
        fun list(
            params: EmailDomainListParams = EmailDomainListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailDomainListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailDomainListResponse>> =
            list(EmailDomainListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/email-domains/{domainId}`, but is otherwise
         * the same as [EmailDomainServiceAsync.delete].
         */
        fun delete(domainId: String): CompletableFuture<HttpResponse> =
            delete(domainId, EmailDomainDeleteParams.none())

        /** @see delete */
        fun delete(
            domainId: String,
            params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see delete */
        fun delete(
            domainId: String,
            params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(domainId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailDomainDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EmailDomainDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            domainId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(domainId, EmailDomainDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/email-domains/{domainId}/verify`, but is
         * otherwise the same as [EmailDomainServiceAsync.verify].
         */
        fun verify(
            domainId: String
        ): CompletableFuture<HttpResponseFor<EmailDomainVerifyResponse>> =
            verify(domainId, EmailDomainVerifyParams.none())

        /** @see verify */
        fun verify(
            domainId: String,
            params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainVerifyResponse>> =
            verify(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see verify */
        fun verify(
            domainId: String,
            params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainVerifyResponse>> =
            verify(domainId, params, RequestOptions.none())

        /** @see verify */
        fun verify(
            params: EmailDomainVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainVerifyResponse>>

        /** @see verify */
        fun verify(
            params: EmailDomainVerifyParams
        ): CompletableFuture<HttpResponseFor<EmailDomainVerifyResponse>> =
            verify(params, RequestOptions.none())

        /** @see verify */
        fun verify(
            domainId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainVerifyResponse>> =
            verify(domainId, EmailDomainVerifyParams.none(), requestOptions)
    }
}
