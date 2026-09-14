// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.messages.Channel
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationListPageResponseTest {

    @Test
    fun create() {
        val conversationListPageResponse =
            ConversationListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        assertThat(conversationListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(conversationListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationListPageResponse =
            ConversationListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        val roundtrippedConversationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationListPageResponse),
                jacksonTypeRef<ConversationListPageResponse>(),
            )

        assertThat(roundtrippedConversationListPageResponse).isEqualTo(conversationListPageResponse)
    }
}
