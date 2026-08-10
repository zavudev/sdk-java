// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.functions.FunctionCreateParams
import com.zavudev.api.models.functions.FunctionDeployParams
import com.zavudev.api.models.functions.FunctionTailLogsParams
import com.zavudev.api.models.functions.FunctionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FunctionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val functionServiceAsync = client.functions()

        val functionFuture =
            functionServiceAsync.create(
                FunctionCreateParams.builder()
                    .name("Order Bot")
                    .slug("order-bot")
                    .dependencies(
                        FunctionCreateParams.Dependencies.builder()
                            .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                            .build()
                    )
                    .description("Replies to order status questions on WhatsApp.")
                    .httpEnabled(true)
                    .memoryMb(FunctionCreateParams.MemoryMb._128)
                    .runtime(FunctionCreateParams.Runtime.NODEJS24)
                    .sourceCode(
                        "import { defineFunction } from '@zavudev/functions';\n\nexport default defineFunction(async (event, ctx) => {\n  ctx.log('received', event.type);\n});\n"
                    )
                    .timeoutSec(1L)
                    .build()
            )

        val function = functionFuture.get()
        function.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val functionServiceAsync = client.functions()

        val functionFuture = functionServiceAsync.retrieve("functionId")

        val function = functionFuture.get()
        function.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val functionServiceAsync = client.functions()

        val functionFuture =
            functionServiceAsync.update(
                FunctionUpdateParams.builder()
                    .functionId("functionId")
                    .dependencies(
                        FunctionUpdateParams.Dependencies.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .httpEnabled(true)
                    .sourceCode("sourceCode")
                    .build()
            )

        val function = functionFuture.get()
        function.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val functionServiceAsync = client.functions()

        val functionFuture = functionServiceAsync.delete("functionId")

        val function = functionFuture.get()
        function.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deploy() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val functionServiceAsync = client.functions()

        val responseFuture =
            functionServiceAsync.deploy(
                FunctionDeployParams.builder()
                    .functionId("functionId")
                    .dependencies(
                        FunctionDeployParams.Dependencies.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .sourceCode("sourceCode")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDeployment() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val functionServiceAsync = client.functions()

        val responseFuture = functionServiceAsync.getDeployment("deploymentId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun tailLogs() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val functionServiceAsync = client.functions()

        val responseFuture =
            functionServiceAsync.tailLogs(
                FunctionTailLogsParams.builder()
                    .functionId("functionId")
                    .endTime(0L)
                    .filterPattern("filterPattern")
                    .limit(1L)
                    .nextToken("nextToken")
                    .startTime(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
