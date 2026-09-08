// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.introspect.IntrospectValidateEmailParams
import com.zavudev.api.models.introspect.IntrospectValidateEmailResponse
import com.zavudev.api.models.introspect.IntrospectValidatePhoneParams
import com.zavudev.api.models.introspect.IntrospectValidatePhoneResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IntrospectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntrospectServiceAsync

    /**
     * Heuristic email validation to run before sending: catches invalid syntax, dead domains (no
     * MX/A records), disposable inboxes, role-based addresses (info@, contacto@, sales@), and
     * addresses already on your project's suppression list. Use it to clean a list before a
     * broadcast and keep your bounce rate low.
     *
     * No mailbox-level (SMTP) probe is performed, so a `deliverable` verdict is not a delivery
     * guarantee — it means no negative signal was found. Treat `risky` addresses with care and drop
     * `undeliverable` ones.
     *
     * Accepts a single `email` or an `emails` batch (max 100 per request).
     */
    fun validateEmail(): CompletableFuture<IntrospectValidateEmailResponse> =
        validateEmail(IntrospectValidateEmailParams.none())

    /** @see validateEmail */
    fun validateEmail(
        params: IntrospectValidateEmailParams = IntrospectValidateEmailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrospectValidateEmailResponse>

    /** @see validateEmail */
    fun validateEmail(
        params: IntrospectValidateEmailParams = IntrospectValidateEmailParams.none()
    ): CompletableFuture<IntrospectValidateEmailResponse> =
        validateEmail(params, RequestOptions.none())

    /** @see validateEmail */
    fun validateEmail(
        requestOptions: RequestOptions
    ): CompletableFuture<IntrospectValidateEmailResponse> =
        validateEmail(IntrospectValidateEmailParams.none(), requestOptions)

    /** Validate a phone number and check if a WhatsApp conversation window is open. */
    fun validatePhone(
        params: IntrospectValidatePhoneParams
    ): CompletableFuture<IntrospectValidatePhoneResponse> =
        validatePhone(params, RequestOptions.none())

    /** @see validatePhone */
    fun validatePhone(
        params: IntrospectValidatePhoneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrospectValidatePhoneResponse>

    /**
     * A view of [IntrospectServiceAsync] that provides access to raw HTTP responses for each
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
        ): IntrospectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/introspect/email`, but is otherwise the same as
         * [IntrospectServiceAsync.validateEmail].
         */
        fun validateEmail(): CompletableFuture<HttpResponseFor<IntrospectValidateEmailResponse>> =
            validateEmail(IntrospectValidateEmailParams.none())

        /** @see validateEmail */
        fun validateEmail(
            params: IntrospectValidateEmailParams = IntrospectValidateEmailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrospectValidateEmailResponse>>

        /** @see validateEmail */
        fun validateEmail(
            params: IntrospectValidateEmailParams = IntrospectValidateEmailParams.none()
        ): CompletableFuture<HttpResponseFor<IntrospectValidateEmailResponse>> =
            validateEmail(params, RequestOptions.none())

        /** @see validateEmail */
        fun validateEmail(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IntrospectValidateEmailResponse>> =
            validateEmail(IntrospectValidateEmailParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/introspect/phone`, but is otherwise the same as
         * [IntrospectServiceAsync.validatePhone].
         */
        fun validatePhone(
            params: IntrospectValidatePhoneParams
        ): CompletableFuture<HttpResponseFor<IntrospectValidatePhoneResponse>> =
            validatePhone(params, RequestOptions.none())

        /** @see validatePhone */
        fun validatePhone(
            params: IntrospectValidatePhoneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrospectValidatePhoneResponse>>
    }
}
