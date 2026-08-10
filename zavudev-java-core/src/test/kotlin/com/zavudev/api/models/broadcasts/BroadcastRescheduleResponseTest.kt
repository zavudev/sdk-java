// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastRescheduleResponseTest {

    @Test
    fun create() {
        val broadcastRescheduleResponse =
            BroadcastRescheduleResponse.builder()
                .broadcast(
                    Broadcast.builder()
                        .id("brd_abc123")
                        .channel(BroadcastChannel.SMART)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .messageType(BroadcastMessageType.TEXT)
                        .name("name")
                        .status(BroadcastStatus.DRAFT)
                        .totalContacts(0L)
                        .actualCost(0.0)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .content(
                            BroadcastContent.builder()
                                .filename("filename")
                                .mediaId("mediaId")
                                .mediaUrl("mediaUrl")
                                .mimeType("mimeType")
                                .templateButtonVariables(
                                    BroadcastContent.TemplateButtonVariables.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .templateHeaderVariables(
                                    BroadcastContent.TemplateHeaderVariables.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .templateId("templateId")
                                .templateVariables(
                                    BroadcastContent.TemplateVariables.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .deliveredCount(0L)
                        .emailSubject("emailSubject")
                        .estimatedCost(0.0)
                        .failedCount(0L)
                        .metadata(
                            Broadcast.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pendingCount(0L)
                        .reservedAmount(0.0)
                        .reviewAttempts(0L)
                        .reviewResult(
                            Broadcast.ReviewResult.builder()
                                .addCategory("string")
                                .addFlaggedContent("string")
                                .reasoning("reasoning")
                                .reviewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .score(0.0)
                                .build()
                        )
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .senderId("senderId")
                        .sendingCount(0L)
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .text("text")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(broadcastRescheduleResponse.broadcast())
            .isEqualTo(
                Broadcast.builder()
                    .id("brd_abc123")
                    .channel(BroadcastChannel.SMART)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .messageType(BroadcastMessageType.TEXT)
                    .name("name")
                    .status(BroadcastStatus.DRAFT)
                    .totalContacts(0L)
                    .actualCost(0.0)
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .content(
                        BroadcastContent.builder()
                            .filename("filename")
                            .mediaId("mediaId")
                            .mediaUrl("mediaUrl")
                            .mimeType("mimeType")
                            .templateButtonVariables(
                                BroadcastContent.TemplateButtonVariables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .templateHeaderVariables(
                                BroadcastContent.TemplateHeaderVariables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .templateId("templateId")
                            .templateVariables(
                                BroadcastContent.TemplateVariables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .deliveredCount(0L)
                    .emailSubject("emailSubject")
                    .estimatedCost(0.0)
                    .failedCount(0L)
                    .metadata(
                        Broadcast.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pendingCount(0L)
                    .reservedAmount(0.0)
                    .reviewAttempts(0L)
                    .reviewResult(
                        Broadcast.ReviewResult.builder()
                            .addCategory("string")
                            .addFlaggedContent("string")
                            .reasoning("reasoning")
                            .reviewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .score(0.0)
                            .build()
                    )
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .senderId("senderId")
                    .sendingCount(0L)
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .text("text")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastRescheduleResponse =
            BroadcastRescheduleResponse.builder()
                .broadcast(
                    Broadcast.builder()
                        .id("brd_abc123")
                        .channel(BroadcastChannel.SMART)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .messageType(BroadcastMessageType.TEXT)
                        .name("name")
                        .status(BroadcastStatus.DRAFT)
                        .totalContacts(0L)
                        .actualCost(0.0)
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .content(
                            BroadcastContent.builder()
                                .filename("filename")
                                .mediaId("mediaId")
                                .mediaUrl("mediaUrl")
                                .mimeType("mimeType")
                                .templateButtonVariables(
                                    BroadcastContent.TemplateButtonVariables.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .templateHeaderVariables(
                                    BroadcastContent.TemplateHeaderVariables.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .templateId("templateId")
                                .templateVariables(
                                    BroadcastContent.TemplateVariables.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .deliveredCount(0L)
                        .emailSubject("emailSubject")
                        .estimatedCost(0.0)
                        .failedCount(0L)
                        .metadata(
                            Broadcast.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pendingCount(0L)
                        .reservedAmount(0.0)
                        .reviewAttempts(0L)
                        .reviewResult(
                            Broadcast.ReviewResult.builder()
                                .addCategory("string")
                                .addFlaggedContent("string")
                                .reasoning("reasoning")
                                .reviewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .score(0.0)
                                .build()
                        )
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .senderId("senderId")
                        .sendingCount(0L)
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .text("text")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedBroadcastRescheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastRescheduleResponse),
                jacksonTypeRef<BroadcastRescheduleResponse>(),
            )

        assertThat(roundtrippedBroadcastRescheduleResponse).isEqualTo(broadcastRescheduleResponse)
    }
}
