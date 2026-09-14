// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.agents

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.agents.senders.SenderConnectParams
import com.zavudev.api.models.agents.senders.SenderDisconnectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SenderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun connect() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.agents().senders()

        val response =
            senderService.connect(
                SenderConnectParams.builder().agentId("agentId").senderId("senderId").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disconnect() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val senderService = client.agents().senders()

        senderService.disconnect(
            SenderDisconnectParams.builder().agentId("agentId").senderId("senderId").build()
        )
    }
}
