// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions.triggers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TriggerCreateParamsTest {

    @Test
    fun create() {
        TriggerCreateParams.builder()
            .functionId("functionId")
            .addEventType("message.inbound")
            .addSenderId(null)
            .cron("0 9 * * 1-5")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TriggerCreateParams.builder()
                .functionId("functionId")
                .addEventType("message.inbound")
                .addSenderId(null)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TriggerCreateParams.builder()
                .functionId("functionId")
                .addEventType("message.inbound")
                .addSenderId(null)
                .cron("0 9 * * 1-5")
                .build()

        val body = params._body()

        assertThat(body.eventTypes()).containsExactly("message.inbound")
        assertThat(body.senderIds()).containsExactly(null)
        assertThat(body.cron()).contains("0 9 * * 1-5")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TriggerCreateParams.builder()
                .functionId("functionId")
                .addEventType("message.inbound")
                .addSenderId(null)
                .build()

        val body = params._body()

        assertThat(body.eventTypes()).containsExactly("message.inbound")
        assertThat(body.senderIds()).containsExactly(null)
    }
}
