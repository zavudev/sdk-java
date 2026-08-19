// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConversationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.conversations()

        val conversationFuture = conversationServiceAsync.retrieve("conversationId")

        val conversation = conversationFuture.get()
        conversation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.conversations()

        val pageFuture = conversationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMessages() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.conversations()

        val pageFuture = conversationServiceAsync.listMessages("conversationId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun markAsRead() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationServiceAsync = client.conversations()

        val responseFuture = conversationServiceAsync.markAsRead("conversationId")

        val response = responseFuture.get()
        response.validate()
    }
}
