// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WhatsappSyncServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappSyncServiceAsync = client.senders().whatsappSync()

        val whatsappSyncFuture = whatsappSyncServiceAsync.retrieve("senderId")

        val whatsappSync = whatsappSyncFuture.get()
        whatsappSync.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startContactsSync() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappSyncServiceAsync = client.senders().whatsappSync()

        val responseFuture = whatsappSyncServiceAsync.startContactsSync("senderId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startHistorySync() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappSyncServiceAsync = client.senders().whatsappSync()

        val responseFuture = whatsappSyncServiceAsync.startHistorySync("senderId")

        val response = responseFuture.get()
        response.validate()
    }
}
