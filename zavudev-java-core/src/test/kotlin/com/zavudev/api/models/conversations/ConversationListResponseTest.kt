// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.messages.Channel
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationListResponseTest {

    @Test
    fun create() {
        val conversationListResponse =
            ConversationListResponse.builder()
                .id("js723987cyghwqxxaxcf590qd18axd95")
                .addChannel("whatsapp")
                .addChannel("sms")
                .contactIdentifier("+56912345678")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastMessage(
                    ConversationListResponse.LastMessage.builder()
                        .id("id")
                        .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .channel(Channel.AUTO)
                        .direction(ConversationListResponse.LastMessage.Direction.INBOUND)
                        .text("text")
                        .build()
                )
                .messageCount(0L)
                .unreadCount(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .contactId("contactId")
                .email("email")
                .group(
                    ConversationListResponse.Group.builder()
                        .id("id")
                        .participantCount(0L)
                        .subject("subject")
                        .build()
                )
                .senderId("senderId")
                .whatsapp(
                    ConversationListResponse.Whatsapp.builder()
                        .bsuid("bsuid")
                        .username("username")
                        .build()
                )
                .build()

        assertThat(conversationListResponse.id()).isEqualTo("js723987cyghwqxxaxcf590qd18axd95")
        assertThat(conversationListResponse.channels()).containsExactly("whatsapp", "sms")
        assertThat(conversationListResponse.contactIdentifier()).isEqualTo("+56912345678")
        assertThat(conversationListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(conversationListResponse.lastMessage())
            .isEqualTo(
                ConversationListResponse.LastMessage.builder()
                    .id("id")
                    .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .channel(Channel.AUTO)
                    .direction(ConversationListResponse.LastMessage.Direction.INBOUND)
                    .text("text")
                    .build()
            )
        assertThat(conversationListResponse.messageCount()).isEqualTo(0L)
        assertThat(conversationListResponse.unreadCount()).isEqualTo(0L)
        assertThat(conversationListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(conversationListResponse.contactId()).contains("contactId")
        assertThat(conversationListResponse.email()).contains("email")
        assertThat(conversationListResponse.group())
            .contains(
                ConversationListResponse.Group.builder()
                    .id("id")
                    .participantCount(0L)
                    .subject("subject")
                    .build()
            )
        assertThat(conversationListResponse.senderId()).contains("senderId")
        assertThat(conversationListResponse.whatsapp())
            .contains(
                ConversationListResponse.Whatsapp.builder()
                    .bsuid("bsuid")
                    .username("username")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationListResponse =
            ConversationListResponse.builder()
                .id("js723987cyghwqxxaxcf590qd18axd95")
                .addChannel("whatsapp")
                .addChannel("sms")
                .contactIdentifier("+56912345678")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastMessage(
                    ConversationListResponse.LastMessage.builder()
                        .id("id")
                        .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .channel(Channel.AUTO)
                        .direction(ConversationListResponse.LastMessage.Direction.INBOUND)
                        .text("text")
                        .build()
                )
                .messageCount(0L)
                .unreadCount(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .contactId("contactId")
                .email("email")
                .group(
                    ConversationListResponse.Group.builder()
                        .id("id")
                        .participantCount(0L)
                        .subject("subject")
                        .build()
                )
                .senderId("senderId")
                .whatsapp(
                    ConversationListResponse.Whatsapp.builder()
                        .bsuid("bsuid")
                        .username("username")
                        .build()
                )
                .build()

        val roundtrippedConversationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationListResponse),
                jacksonTypeRef<ConversationListResponse>(),
            )

        assertThat(roundtrippedConversationListResponse).isEqualTo(conversationListResponse)
    }
}
