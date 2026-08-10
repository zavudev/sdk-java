// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateTest {

    @Test
    fun create() {
        val template =
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

        assertThat(template.id()).isEqualTo("id")
        assertThat(template.body()).isEqualTo("Hi {{1}}, your order {{2}} has shipped.")
        assertThat(template.category()).isEqualTo(WhatsappCategory.UTILITY)
        assertThat(template.language()).isEqualTo("en")
        assertThat(template.name()).isEqualTo("order_confirmation")
        assertThat(template.addSecurityRecommendation()).contains(true)
        assertThat(template.buttons().getOrNull())
            .containsExactly(
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
        assertThat(template.codeExpirationMinutes()).contains(1L)
        assertThat(template.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(template.footer()).contains("footer")
        assertThat(template.headerContent()).contains("headerContent")
        assertThat(template.headerType()).contains("headerType")
        assertThat(template.instagramBody()).contains("instagramBody")
        assertThat(template.smsBody()).contains("smsBody")
        assertThat(template.status()).contains(Template.Status.DRAFT)
        assertThat(template.telegramBody()).contains("telegramBody")
        assertThat(template.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(template.variables().getOrNull()).containsExactly("string")
        assertThat(template.whatsapp())
            .contains(
                Template.Whatsapp.builder()
                    .namespace("namespace")
                    .status("status")
                    .templateName("templateName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val template =
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

        val roundtrippedTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(template),
                jacksonTypeRef<Template>(),
            )

        assertThat(roundtrippedTemplate).isEqualTo(template)
    }
}
