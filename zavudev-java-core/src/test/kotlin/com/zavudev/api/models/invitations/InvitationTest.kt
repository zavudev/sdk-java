// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.invitations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationTest {

    @Test
    fun create() {
        val invitation =
            Invitation.builder()
                .id("inv_abc123")
                .token("token")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Invitation.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("https://dashboard.zavu.dev/invite/abc123xyz")
                .clientEmail("clientEmail")
                .clientName("clientName")
                .clientPhone("clientPhone")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .connectedAccount(
                    Invitation.ConnectedAccount.builder()
                        .id("id")
                        .channel(Invitation.ConnectedAccount.Channel.WHATSAPP)
                        .name("name")
                        .build()
                )
                .connectionType(Invitation.ConnectionType.WHATSAPP_WABA)
                .failedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failureReason")
                .phoneNumberId("phoneNumberId")
                .senderId("senderId")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .viewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(invitation.id()).isEqualTo("inv_abc123")
        assertThat(invitation.token()).isEqualTo("token")
        assertThat(invitation.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.status()).isEqualTo(Invitation.Status.PENDING)
        assertThat(invitation.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.url()).isEqualTo("https://dashboard.zavu.dev/invite/abc123xyz")
        assertThat(invitation.clientEmail()).contains("clientEmail")
        assertThat(invitation.clientName()).contains("clientName")
        assertThat(invitation.clientPhone()).contains("clientPhone")
        assertThat(invitation.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.connectedAccount())
            .contains(
                Invitation.ConnectedAccount.builder()
                    .id("id")
                    .channel(Invitation.ConnectedAccount.Channel.WHATSAPP)
                    .name("name")
                    .build()
            )
        assertThat(invitation.connectionType()).contains(Invitation.ConnectionType.WHATSAPP_WABA)
        assertThat(invitation.failedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.failureReason()).contains("failureReason")
        assertThat(invitation.phoneNumberId()).contains("phoneNumberId")
        assertThat(invitation.senderId()).contains("senderId")
        assertThat(invitation.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.viewedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitation =
            Invitation.builder()
                .id("inv_abc123")
                .token("token")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Invitation.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("https://dashboard.zavu.dev/invite/abc123xyz")
                .clientEmail("clientEmail")
                .clientName("clientName")
                .clientPhone("clientPhone")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .connectedAccount(
                    Invitation.ConnectedAccount.builder()
                        .id("id")
                        .channel(Invitation.ConnectedAccount.Channel.WHATSAPP)
                        .name("name")
                        .build()
                )
                .connectionType(Invitation.ConnectionType.WHATSAPP_WABA)
                .failedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failureReason")
                .phoneNumberId("phoneNumberId")
                .senderId("senderId")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .viewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInvitation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitation),
                jacksonTypeRef<Invitation>(),
            )

        assertThat(roundtrippedInvitation).isEqualTo(invitation)
    }
}
