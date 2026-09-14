// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.functions

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.functions.triggers.TriggerCreateParams
import com.zavudev.api.models.functions.triggers.TriggerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TriggerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val triggerService = client.functions().triggers()

        val trigger =
            triggerService.create(
                TriggerCreateParams.builder()
                    .functionId("functionId")
                    .addEventType("message.inbound")
                    .addSenderId(null)
                    .cron("0 9 * * 1-5")
                    .build()
            )

        trigger.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val triggerService = client.functions().triggers()

        val trigger =
            triggerService.update(
                TriggerUpdateParams.builder().triggerId("triggerId").active(true).build()
            )

        trigger.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val triggerService = client.functions().triggers()

        val triggers = triggerService.list("functionId")

        triggers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val triggerService = client.functions().triggers()

        triggerService.delete("triggerId")
    }
}
