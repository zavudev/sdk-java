// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.templates.TemplateCreateParams
import com.zavudev.api.models.templates.TemplateSubmitParams
import com.zavudev.api.models.templates.WhatsappCategory
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.templates()

        val templateFuture =
            templateServiceAsync.create(
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

        val template = templateFuture.get()
        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.templates()

        val templateFuture = templateServiceAsync.retrieve("templateId")

        val template = templateFuture.get()
        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.templates()

        val pageFuture = templateServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.templates()

        val future = templateServiceAsync.delete("templateId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.templates()

        val templateFuture =
            templateServiceAsync.submit(
                TemplateSubmitParams.builder()
                    .templateId("templateId")
                    .senderId("sender_abc123")
                    .category(WhatsappCategory.UTILITY)
                    .build()
            )

        val template = templateFuture.get()
        template.validate()
    }
}
