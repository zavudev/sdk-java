// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListPageResponseTest {

    @Test
    fun create() {
        val templateListPageResponse =
            TemplateListPageResponse.builder()
                .addItem(
                    Template.builder()
                        .id("id")
                        .body("Hi {{1}}, your order {{2}} has shipped.")
                        .category(WhatsappCategory.UTILITY)
                        .language("en")
                        .name("order_confirmation")
                        .addSecurityRecommendation(true)
                        .addButton(
                            Template.Button.builder()
                                .example("example")
                                .otpType(Template.Button.OtpType.COPY_CODE)
                                .packageName("packageName")
                                .phoneNumber("phoneNumber")
                                .signatureHash("signatureHash")
                                .text("text")
                                .type(Template.Button.Type.QUICK_REPLY)
                                .url("url")
                                .build()
                        )
                        .codeExpirationMinutes(1L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .footer("footer")
                        .headerContent("headerContent")
                        .headerType("headerType")
                        .instagramBody("instagramBody")
                        .smsBody("smsBody")
                        .status(Template.Status.DRAFT)
                        .telegramBody("telegramBody")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addVariable("string")
                        .whatsapp(
                            Template.Whatsapp.builder()
                                .namespace("namespace")
                                .status("status")
                                .templateName("templateName")
                                .build()
                        )
                        .build()
                )
                .nextCursor("nextCursor")
                .build()

        assertThat(templateListPageResponse.items())
            .containsExactly(
                Template.builder()
                    .id("id")
                    .body("Hi {{1}}, your order {{2}} has shipped.")
                    .category(WhatsappCategory.UTILITY)
                    .language("en")
                    .name("order_confirmation")
                    .addSecurityRecommendation(true)
                    .addButton(
                        Template.Button.builder()
                            .example("example")
                            .otpType(Template.Button.OtpType.COPY_CODE)
                            .packageName("packageName")
                            .phoneNumber("phoneNumber")
                            .signatureHash("signatureHash")
                            .text("text")
                            .type(Template.Button.Type.QUICK_REPLY)
                            .url("url")
                            .build()
                    )
                    .codeExpirationMinutes(1L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .footer("footer")
                    .headerContent("headerContent")
                    .headerType("headerType")
                    .instagramBody("instagramBody")
                    .smsBody("smsBody")
                    .status(Template.Status.DRAFT)
                    .telegramBody("telegramBody")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addVariable("string")
                    .whatsapp(
                        Template.Whatsapp.builder()
                            .namespace("namespace")
                            .status("status")
                            .templateName("templateName")
                            .build()
                    )
                    .build()
            )
        assertThat(templateListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateListPageResponse =
            TemplateListPageResponse.builder()
                .addItem(
                    Template.builder()
                        .id("id")
                        .body("Hi {{1}}, your order {{2}} has shipped.")
                        .category(WhatsappCategory.UTILITY)
                        .language("en")
                        .name("order_confirmation")
                        .addSecurityRecommendation(true)
                        .addButton(
                            Template.Button.builder()
                                .example("example")
                                .otpType(Template.Button.OtpType.COPY_CODE)
                                .packageName("packageName")
                                .phoneNumber("phoneNumber")
                                .signatureHash("signatureHash")
                                .text("text")
                                .type(Template.Button.Type.QUICK_REPLY)
                                .url("url")
                                .build()
                        )
                        .codeExpirationMinutes(1L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .footer("footer")
                        .headerContent("headerContent")
                        .headerType("headerType")
                        .instagramBody("instagramBody")
                        .smsBody("smsBody")
                        .status(Template.Status.DRAFT)
                        .telegramBody("telegramBody")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addVariable("string")
                        .whatsapp(
                            Template.Whatsapp.builder()
                                .namespace("namespace")
                                .status("status")
                                .templateName("templateName")
                                .build()
                        )
                        .build()
                )
                .nextCursor("nextCursor")
                .build()

        val roundtrippedTemplateListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateListPageResponse),
                jacksonTypeRef<TemplateListPageResponse>(),
            )

        assertThat(roundtrippedTemplateListPageResponse).isEqualTo(templateListPageResponse)
    }
}
