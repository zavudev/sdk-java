// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WhatsappSyncServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappSyncService = client.senders().whatsappSync()

        val whatsappSync = whatsappSyncService.retrieve("senderId")

        whatsappSync.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startContactsSync() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappSyncService = client.senders().whatsappSync()

        val response = whatsappSyncService.startContactsSync("senderId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startHistorySync() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappSyncService = client.senders().whatsappSync()

        val response = whatsappSyncService.startHistorySync("senderId")

        response.validate()
    }
}
