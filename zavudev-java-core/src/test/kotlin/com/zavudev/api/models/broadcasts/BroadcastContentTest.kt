// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastContentTest {

    @Test
    fun create() {
        val broadcastContent =
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

        assertThat(broadcastContent.filename()).contains("filename")
        assertThat(broadcastContent.mediaId()).contains("mediaId")
        assertThat(broadcastContent.mediaUrl()).contains("mediaUrl")
        assertThat(broadcastContent.mimeType()).contains("mimeType")
        assertThat(broadcastContent.templateButtonVariables())
            .contains(
                BroadcastContent.TemplateButtonVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(broadcastContent.templateHeaderVariables())
            .contains(
                BroadcastContent.TemplateHeaderVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(broadcastContent.templateId()).contains("templateId")
        assertThat(broadcastContent.templateVariables())
            .contains(
                BroadcastContent.TemplateVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastContent =
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

        val roundtrippedBroadcastContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastContent),
                jacksonTypeRef<BroadcastContent>(),
            )

        assertThat(roundtrippedBroadcastContent).isEqualTo(broadcastContent)
    }
}
