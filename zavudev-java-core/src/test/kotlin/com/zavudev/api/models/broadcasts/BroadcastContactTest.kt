// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastContactTest {

    @Test
    fun create() {
        val broadcastContact =
            BroadcastContact.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recipient("recipient")
                .recipientType(BroadcastContact.RecipientType.PHONE)
                .status(BroadcastContactStatus.PENDING)
                .cost(0.0)
                .errorCode("errorCode")
                .errorMessage("errorMessage")
                .messageId("messageId")
                .processedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .templateButtonVariables(
                    BroadcastContact.TemplateButtonVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .templateHeaderVariables(
                    BroadcastContact.TemplateHeaderVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .templateVariables(
                    BroadcastContact.TemplateVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(broadcastContact.id()).isEqualTo("id")
        assertThat(broadcastContact.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastContact.recipient()).isEqualTo("recipient")
        assertThat(broadcastContact.recipientType()).isEqualTo(BroadcastContact.RecipientType.PHONE)
        assertThat(broadcastContact.status()).isEqualTo(BroadcastContactStatus.PENDING)
        assertThat(broadcastContact.cost()).contains(0.0)
        assertThat(broadcastContact.errorCode()).contains("errorCode")
        assertThat(broadcastContact.errorMessage()).contains("errorMessage")
        assertThat(broadcastContact.messageId()).contains("messageId")
        assertThat(broadcastContact.processedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastContact.templateButtonVariables())
            .contains(
                BroadcastContact.TemplateButtonVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(broadcastContact.templateHeaderVariables())
            .contains(
                BroadcastContact.TemplateHeaderVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(broadcastContact.templateVariables())
            .contains(
                BroadcastContact.TemplateVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastContact =
            BroadcastContact.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recipient("recipient")
                .recipientType(BroadcastContact.RecipientType.PHONE)
                .status(BroadcastContactStatus.PENDING)
                .cost(0.0)
                .errorCode("errorCode")
                .errorMessage("errorMessage")
                .messageId("messageId")
                .processedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .templateButtonVariables(
                    BroadcastContact.TemplateButtonVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .templateHeaderVariables(
                    BroadcastContact.TemplateHeaderVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .templateVariables(
                    BroadcastContact.TemplateVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedBroadcastContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastContact),
                jacksonTypeRef<BroadcastContact>(),
            )

        assertThat(roundtrippedBroadcastContact).isEqualTo(broadcastContact)
    }
}
