// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.invitations

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationCreateParamsTest {

    @Test
    fun create() {
        InvitationCreateParams.builder()
            .addAllowedPhoneCountry("US")
            .addAllowedPhoneCountry("MX")
            .clientEmail("contact@acme.com")
            .clientName("Acme Corp")
            .clientPhone("+14155551234")
            .connectionType(InvitationCreateParams.ConnectionType.WHATSAPP_WABA)
            .expiresInDays(1L)
            .phoneNumberId("pn_abc123")
            .build()
    }

    @Test
    fun body() {
        val params =
            InvitationCreateParams.builder()
                .addAllowedPhoneCountry("US")
                .addAllowedPhoneCountry("MX")
                .clientEmail("contact@acme.com")
                .clientName("Acme Corp")
                .clientPhone("+14155551234")
                .connectionType(InvitationCreateParams.ConnectionType.WHATSAPP_WABA)
                .expiresInDays(1L)
                .phoneNumberId("pn_abc123")
                .build()

        val body = params._body()

        assertThat(body.allowedPhoneCountries().getOrNull()).containsExactly("US", "MX")
        assertThat(body.clientEmail()).contains("contact@acme.com")
        assertThat(body.clientName()).contains("Acme Corp")
        assertThat(body.clientPhone()).contains("+14155551234")
        assertThat(body.connectionType())
            .contains(InvitationCreateParams.ConnectionType.WHATSAPP_WABA)
        assertThat(body.expiresInDays()).contains(1L)
        assertThat(body.phoneNumberId()).contains("pn_abc123")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InvitationCreateParams.builder().build()

        val body = params._body()
    }
}
