// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.invitations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationListPageResponseTest {

    @Test
    fun create() {
        val invitationListPageResponse =
            InvitationListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        assertThat(invitationListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(invitationListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationListPageResponse =
            InvitationListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        val roundtrippedInvitationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationListPageResponse),
                jacksonTypeRef<InvitationListPageResponse>(),
            )

        assertThat(roundtrippedInvitationListPageResponse).isEqualTo(invitationListPageResponse)
    }
}
