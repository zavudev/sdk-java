// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.broadcasts

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastUpdateParamsTest {

    @Test
    fun create() {
        BroadcastUpdateParams.builder()
            .broadcastId("broadcastId")
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
            .emailHtmlBody("emailHtmlBody")
            .emailSubject("emailSubject")
            .metadata(
                BroadcastUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .text("text")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BroadcastUpdateParams.builder().broadcastId("broadcastId").build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BroadcastUpdateParams.builder()
                .broadcastId("broadcastId")
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
                .emailHtmlBody("emailHtmlBody")
                .emailSubject("emailSubject")
                .metadata(
                    BroadcastUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .text("text")
                .build()

        val body = params._body()

        assertThat(body.content())
            .contains(
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
        assertThat(body.emailHtmlBody()).contains("emailHtmlBody")
        assertThat(body.emailSubject()).contains("emailSubject")
        assertThat(body.metadata())
            .contains(
                BroadcastUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.text()).contains("text")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BroadcastUpdateParams.builder().broadcastId("broadcastId").build()

        val body = params._body()
    }
}
