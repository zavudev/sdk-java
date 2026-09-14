// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.introspect.IntrospectValidateEmailParams
import com.zavudev.api.models.introspect.IntrospectValidatePhoneParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IntrospectServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun validateEmail() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val introspectService = client.introspect()

        val response =
            introspectService.validateEmail(
                IntrospectValidateEmailParams.builder()
                    .email("maria@example.com")
                    .addEmail("maria@example.com")
                    .addEmail("info@deaddomain.example")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validatePhone() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val introspectService = client.introspect()

        val response =
            introspectService.validatePhone(
                IntrospectValidatePhoneParams.builder().phoneNumber("+56912345678").build()
            )

        response.validate()
    }
}
