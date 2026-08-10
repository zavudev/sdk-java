// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.templates

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateParamsTest {

    @Test
    fun create() {
        TemplateCreateParams.builder()
            .body("Hi {{1}}, your order {{2}} has been confirmed and will ship within 24 hours.")
            .language("en")
            .name("order_confirmation")
            .addSecurityRecommendation(true)
            .addButton(
                TemplateCreateParams.Button.builder()
                    .type(TemplateCreateParams.Button.Type.QUICK_REPLY)
                    .example("ORD-12345")
                    .otpType(TemplateCreateParams.Button.OtpType.COPY_CODE)
                    .packageName("packageName")
                    .phoneNumber("phoneNumber")
                    .signatureHash("signatureHash")
                    .text("text")
                    .url("https://example.com")
                    .build()
            )
            .codeExpirationMinutes(1L)
            .footer("footer")
            .headerContent("headerContent")
            .headerType(TemplateCreateParams.HeaderType.TEXT)
            .instagramBody("instagramBody")
            .smsBody("smsBody")
            .telegramBody("telegramBody")
            .addVariable("customer_name")
            .addVariable("order_id")
            .whatsappCategory(WhatsappCategory.UTILITY)
            .build()
    }

    @Test
    fun body() {
        val params =
            TemplateCreateParams.builder()
                .body(
                    "Hi {{1}}, your order {{2}} has been confirmed and will ship within 24 hours."
                )
                .language("en")
                .name("order_confirmation")
                .addSecurityRecommendation(true)
                .addButton(
                    TemplateCreateParams.Button.builder()
                        .type(TemplateCreateParams.Button.Type.QUICK_REPLY)
                        .example("ORD-12345")
                        .otpType(TemplateCreateParams.Button.OtpType.COPY_CODE)
                        .packageName("packageName")
                        .phoneNumber("phoneNumber")
                        .signatureHash("signatureHash")
                        .text("text")
                        .url("https://example.com")
                        .build()
                )
                .codeExpirationMinutes(1L)
                .footer("footer")
                .headerContent("headerContent")
                .headerType(TemplateCreateParams.HeaderType.TEXT)
                .instagramBody("instagramBody")
                .smsBody("smsBody")
                .telegramBody("telegramBody")
                .addVariable("customer_name")
                .addVariable("order_id")
                .whatsappCategory(WhatsappCategory.UTILITY)
                .build()

        val body = params._body()

        assertThat(body.body())
            .isEqualTo(
                "Hi {{1}}, your order {{2}} has been confirmed and will ship within 24 hours."
            )
        assertThat(body.language()).isEqualTo("en")
        assertThat(body.name()).isEqualTo("order_confirmation")
        assertThat(body.addSecurityRecommendation()).contains(true)
        assertThat(body.buttons().getOrNull())
            .containsExactly(
                TemplateCreateParams.Button.builder()
                    .type(TemplateCreateParams.Button.Type.QUICK_REPLY)
                    .example("ORD-12345")
                    .otpType(TemplateCreateParams.Button.OtpType.COPY_CODE)
                    .packageName("packageName")
                    .phoneNumber("phoneNumber")
                    .signatureHash("signatureHash")
                    .text("text")
                    .url("https://example.com")
                    .build()
            )
        assertThat(body.codeExpirationMinutes()).contains(1L)
        assertThat(body.footer()).contains("footer")
        assertThat(body.headerContent()).contains("headerContent")
        assertThat(body.headerType()).contains(TemplateCreateParams.HeaderType.TEXT)
        assertThat(body.instagramBody()).contains("instagramBody")
        assertThat(body.smsBody()).contains("smsBody")
        assertThat(body.telegramBody()).contains("telegramBody")
        assertThat(body.variables().getOrNull()).containsExactly("customer_name", "order_id")
        assertThat(body.whatsappCategory()).contains(WhatsappCategory.UTILITY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateCreateParams.builder()
                .body(
                    "Hi {{1}}, your order {{2}} has been confirmed and will ship within 24 hours."
                )
                .language("en")
                .name("order_confirmation")
                .build()

        val body = params._body()

        assertThat(body.body())
            .isEqualTo(
                "Hi {{1}}, your order {{2}} has been confirmed and will ship within 24 hours."
            )
        assertThat(body.language()).isEqualTo("en")
        assertThat(body.name()).isEqualTo("order_confirmation")
    }
}
