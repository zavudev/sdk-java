// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.senders.agent.executions.ExecutionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExecutionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val executionService = client.senders().agent().executions()

        val execution =
            executionService.retrieve(
                ExecutionRetrieveParams.builder()
                    .senderId("senderId")
                    .executionId("executionId")
                    .build()
            )

        execution.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val executionService = client.senders().agent().executions()

        val page = executionService.list("senderId")

        page.response().validate()
    }
}
