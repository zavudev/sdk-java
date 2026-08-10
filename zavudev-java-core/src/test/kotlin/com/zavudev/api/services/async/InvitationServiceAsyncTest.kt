// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.invitations.InvitationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvitationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invitationServiceAsync = client.invitations()

        val invitationFuture =
            invitationServiceAsync.create(
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

        val invitation = invitationFuture.get()
        invitation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invitationServiceAsync = client.invitations()

        val invitationFuture = invitationServiceAsync.retrieve("invitationId")

        val invitation = invitationFuture.get()
        invitation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invitationServiceAsync = client.invitations()

        val pageFuture = invitationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invitationServiceAsync = client.invitations()

        val responseFuture = invitationServiceAsync.cancel("invitationId")

        val response = responseFuture.get()
        response.validate()
    }
}
