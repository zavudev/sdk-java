// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SenderUpdateProfileParamsTest {

    @Test
    fun create() {
        SenderUpdateProfileParams.builder()
            .senderId("senderId")
            .about("Succulent specialists!")
            .address("address")
            .description("We specialize in providing high-quality succulents.")
            .email("contact@example.com")
            .vertical(WhatsappBusinessProfileVertical.RETAIL)
            .addWebsite("https://www.example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SenderUpdateProfileParams.builder().senderId("senderId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SenderUpdateProfileParams.builder()
                .senderId("senderId")
                .about("Succulent specialists!")
                .address("address")
                .description("We specialize in providing high-quality succulents.")
                .email("contact@example.com")
                .vertical(WhatsappBusinessProfileVertical.RETAIL)
                .addWebsite("https://www.example.com")
                .build()

        val body = params._body()

        assertThat(body.about()).contains("Succulent specialists!")
        assertThat(body.address()).contains("address")
        assertThat(body.description())
            .contains("We specialize in providing high-quality succulents.")
        assertThat(body.email()).contains("contact@example.com")
        assertThat(body.vertical()).contains(WhatsappBusinessProfileVertical.RETAIL)
        assertThat(body.websites().getOrNull()).containsExactly("https://www.example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SenderUpdateProfileParams.builder().senderId("senderId").build()

        val body = params._body()
    }
}
