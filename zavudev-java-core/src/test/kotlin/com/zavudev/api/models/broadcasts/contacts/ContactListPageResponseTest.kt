// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import com.zavudev.api.models.broadcasts.BroadcastContact
import com.zavudev.api.models.broadcasts.BroadcastContactStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListPageResponseTest {

    @Test
    fun create() {
        val contactListPageResponse =
            ContactListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        assertThat(contactListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(contactListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactListPageResponse =
            ContactListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("nextCursor")
                .build()

        val roundtrippedContactListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactListPageResponse),
                jacksonTypeRef<ContactListPageResponse>(),
            )

        assertThat(roundtrippedContactListPageResponse).isEqualTo(contactListPageResponse)
    }
}
