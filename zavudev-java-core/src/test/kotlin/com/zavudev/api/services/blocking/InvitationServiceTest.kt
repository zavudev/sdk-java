// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.invitations.InvitationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvitationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.invitations()

        val invitation =
            invitationService.create(
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
            )

        invitation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.invitations()

        val invitation = invitationService.retrieve("invitationId")

        invitation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.invitations()

        val page = invitationService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.invitations()

        val response = invitationService.cancel("invitationId")

        response.validate()
    }
}
