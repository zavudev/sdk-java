// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.zavudev.api.core.ClientOptions
import com.zavudev.api.core.RequestOptions
import com.zavudev.api.core.http.HttpResponseFor
import com.zavudev.api.models.introspect.IntrospectValidatePhoneParams
import com.zavudev.api.models.introspect.IntrospectValidatePhoneResponse
import java.util.function.Consumer

interface IntrospectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntrospectService

    /** Validate a phone number and check if a WhatsApp conversation window is open. */
    fun validatePhone(params: IntrospectValidatePhoneParams): IntrospectValidatePhoneResponse =
        validatePhone(params, RequestOptions.none())

    /** @see validatePhone */
    fun validatePhone(
        params: IntrospectValidatePhoneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrospectValidatePhoneResponse

    /** A view of [IntrospectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntrospectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/introspect/phone`, but is otherwise the same as
         * [IntrospectService.validatePhone].
         */
        @MustBeClosed
        fun validatePhone(
            params: IntrospectValidatePhoneParams
        ): HttpResponseFor<IntrospectValidatePhoneResponse> =
            validatePhone(params, RequestOptions.none())

        /** @see validatePhone */
        @MustBeClosed
        fun validatePhone(
            params: IntrospectValidatePhoneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrospectValidatePhoneResponse>
    }
}
