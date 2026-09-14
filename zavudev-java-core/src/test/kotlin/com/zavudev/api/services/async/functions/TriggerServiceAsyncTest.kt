// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.functions

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.functions.triggers.TriggerCreateParams
import com.zavudev.api.models.functions.triggers.TriggerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TriggerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val triggerServiceAsync = client.functions().triggers()

        val triggerFuture =
            triggerServiceAsync.create(
                TriggerCreateParams.builder()
                    .functionId("functionId")
                    .addEventType("message.inbound")
                    .addSenderId(null)
                    .cron("0 9 * * 1-5")
                    .build()
            )

        val trigger = triggerFuture.get()
        trigger.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val triggerServiceAsync = client.functions().triggers()

        val triggerFuture =
            triggerServiceAsync.update(
                TriggerUpdateParams.builder().triggerId("triggerId").active(true).build()
            )

        val trigger = triggerFuture.get()
        trigger.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val triggerServiceAsync = client.functions().triggers()

        val triggersFuture = triggerServiceAsync.list("functionId")

        val triggers = triggersFuture.get()
        triggers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val triggerServiceAsync = client.functions().triggers()

        val future = triggerServiceAsync.delete("triggerId")

        val response = future.get()
    }
}
