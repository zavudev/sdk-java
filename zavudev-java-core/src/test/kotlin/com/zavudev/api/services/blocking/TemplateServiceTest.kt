// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.templates.TemplateCreateParams
import com.zavudev.api.models.templates.TemplateSubmitParams
import com.zavudev.api.models.templates.WhatsappCategory
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TemplateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.templates()

        val template =
            templateService.create(
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
            )

        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.templates()

        val template = templateService.retrieve("templateId")

        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.templates()

        val page = templateService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.templates()

        templateService.delete("templateId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.templates()

        val template =
            templateService.submit(
                TemplateSubmitParams.builder()
                    .templateId("templateId")
                    .senderId("sender_abc123")
                    .category(WhatsappCategory.UTILITY)
                    .build()
            )

        template.validate()
    }
}
