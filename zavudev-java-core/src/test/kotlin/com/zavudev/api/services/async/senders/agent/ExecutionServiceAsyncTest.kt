// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.senders.agent.executions.ExecutionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExecutionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val executionServiceAsync = client.senders().agent().executions()

        val executionFuture =
            executionServiceAsync.retrieve(
                ExecutionRetrieveParams.builder()
                    .senderId("senderId")
                    .executionId("executionId")
                    .build()
            )

        val execution = executionFuture.get()
        execution.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val executionServiceAsync = client.senders().agent().executions()

        val pageFuture = executionServiceAsync.list("senderId")

        val page = pageFuture.get()
        page.response().validate()
    }
}
