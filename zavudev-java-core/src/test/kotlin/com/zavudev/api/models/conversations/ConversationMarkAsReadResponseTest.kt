// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.messages.Channel
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationMarkAsReadResponseTest {

    @Test
    fun create() {
        val conversationMarkAsReadResponse =
            ConversationMarkAsReadResponse.builder()
                .conversation(
                    ConversationMarkAsReadResponse.Conversation.builder()
                        .id("js723987cyghwqxxaxcf590qd18axd95")
                        .addChannel("whatsapp")
                        .addChannel("sms")
                        .contactIdentifier("+56912345678")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastMessage(
                            ConversationMarkAsReadResponse.Conversation.LastMessage.builder()
                                .id("id")
                                .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .channel(Channel.AUTO)
                                .direction(
                                    ConversationMarkAsReadResponse.Conversation.LastMessage
                                        .Direction
                                        .INBOUND
                                )
                                .text("text")
                                .build()
                        )
                        .messageCount(0L)
                        .unreadCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .contactId("contactId")
                        .email("email")
                        .group(
                            ConversationMarkAsReadResponse.Conversation.Group.builder()
                                .id("id")
                                .participantCount(0L)
                                .subject("subject")
                                .build()
                        )
                        .senderId("senderId")
                        .whatsapp(
                            ConversationMarkAsReadResponse.Conversation.Whatsapp.builder()
                                .bsuid("bsuid")
                                .username("username")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(conversationMarkAsReadResponse.conversation())
            .isEqualTo(
                ConversationMarkAsReadResponse.Conversation.builder()
                    .id("js723987cyghwqxxaxcf590qd18axd95")
                    .addChannel("whatsapp")
                    .addChannel("sms")
                    .contactIdentifier("+56912345678")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastMessage(
                        ConversationMarkAsReadResponse.Conversation.LastMessage.builder()
                            .id("id")
                            .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .channel(Channel.AUTO)
                            .direction(
                                ConversationMarkAsReadResponse.Conversation.LastMessage.Direction
                                    .INBOUND
                            )
                            .text("text")
                            .build()
                    )
                    .messageCount(0L)
                    .unreadCount(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .contactId("contactId")
                    .email("email")
                    .group(
                        ConversationMarkAsReadResponse.Conversation.Group.builder()
                            .id("id")
                            .participantCount(0L)
                            .subject("subject")
                            .build()
                    )
                    .senderId("senderId")
                    .whatsapp(
                        ConversationMarkAsReadResponse.Conversation.Whatsapp.builder()
                            .bsuid("bsuid")
                            .username("username")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationMarkAsReadResponse =
            ConversationMarkAsReadResponse.builder()
                .conversation(
                    ConversationMarkAsReadResponse.Conversation.builder()
                        .id("js723987cyghwqxxaxcf590qd18axd95")
                        .addChannel("whatsapp")
                        .addChannel("sms")
                        .contactIdentifier("+56912345678")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastMessage(
                            ConversationMarkAsReadResponse.Conversation.LastMessage.builder()
                                .id("id")
                                .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .channel(Channel.AUTO)
                                .direction(
                                    ConversationMarkAsReadResponse.Conversation.LastMessage
                                        .Direction
                                        .INBOUND
                                )
                                .text("text")
                                .build()
                        )
                        .messageCount(0L)
                        .unreadCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .contactId("contactId")
                        .email("email")
                        .group(
                            ConversationMarkAsReadResponse.Conversation.Group.builder()
                                .id("id")
                                .participantCount(0L)
                                .subject("subject")
                                .build()
                        )
                        .senderId("senderId")
                        .whatsapp(
                            ConversationMarkAsReadResponse.Conversation.Whatsapp.builder()
                                .bsuid("bsuid")
                                .username("username")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedConversationMarkAsReadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationMarkAsReadResponse),
                jacksonTypeRef<ConversationMarkAsReadResponse>(),
            )

        assertThat(roundtrippedConversationMarkAsReadResponse)
            .isEqualTo(conversationMarkAsReadResponse)
    }
}
