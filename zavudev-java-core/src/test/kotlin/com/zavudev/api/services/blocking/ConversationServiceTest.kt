// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConversationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.conversations()

        val conversation = conversationService.retrieve("conversationId")

        conversation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.conversations()

        val page = conversationService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMessages() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.conversations()

        val page = conversationService.listMessages("conversationId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun markAsRead() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val conversationService = client.conversations()

        val response = conversationService.markAsRead("conversationId")

        response.validate()
    }
}
