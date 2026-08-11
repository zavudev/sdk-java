// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.functions.FunctionCreateParams
import com.zavudev.api.models.functions.FunctionDeployParams
import com.zavudev.api.models.functions.FunctionTailLogsParams
import com.zavudev.api.models.functions.FunctionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FunctionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val functionService = client.functions()

        val function =
            functionService.create(
                FunctionCreateParams.builder()
                    .name("Order Bot")
                    .slug("order-bot")
                    .dependencies(
                        FunctionCreateParams.Dependencies.builder()
                            .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                            .build()
                    )
                    .description("Replies to order status questions on WhatsApp.")
                    .entrypoint("index.ts")
                    .files(
                        FunctionCreateParams.Files.builder()
                            .putAdditionalProperty(
                                "index.ts",
                                JsonValue.from(
                                    "import { formatOrder } from './lib/orders';\n\nexport default async function handler(event) {\n  return { statusCode: 200, body: formatOrder(event) };\n}\n"
                                ),
                            )
                            .putAdditionalProperty(
                                "lib/orders.ts",
                                JsonValue.from(
                                    "export function formatOrder(event) {\n  return JSON.stringify(event);\n}\n"
                                ),
                            )
                            .build()
                    )
                    .httpEnabled(true)
                    .memoryMb(FunctionCreateParams.MemoryMb._128)
                    .runtime(FunctionCreateParams.Runtime.NODEJS24)
                    .sourceCode(
                        "import { defineFunction } from '@zavudev/functions';\n\nexport default defineFunction(async (event, ctx) => {\n  ctx.log('received', event.type);\n});\n"
                    )
                    .timeoutSec(1L)
                    .build()
            )

        function.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val functionService = client.functions()

        val function = functionService.retrieve("functionId")

        function.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val functionService = client.functions()

        val function =
            functionService.update(
                FunctionUpdateParams.builder()
                    .functionId("functionId")
                    .dependencies(
                        FunctionUpdateParams.Dependencies.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .entrypoint("index.ts")
                    .files(
                        FunctionUpdateParams.Files.builder()
                            .putAdditionalProperty(
                                "index.ts",
                                JsonValue.from(
                                    "import { formatOrder } from './lib/orders';\n\nexport default async function handler(event) {\n  return { statusCode: 200, body: formatOrder(event) };\n}\n"
                                ),
                            )
                            .putAdditionalProperty(
                                "lib/orders.ts",
                                JsonValue.from(
                                    "export function formatOrder(event) {\n  return JSON.stringify(event);\n}\n"
                                ),
                            )
                            .build()
                    )
                    .httpEnabled(true)
                    .sourceCode("sourceCode")
                    .build()
            )

        function.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val functionService = client.functions()

        val function = functionService.delete("functionId")

        function.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deploy() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val functionService = client.functions()

        val response =
            functionService.deploy(
                FunctionDeployParams.builder()
                    .functionId("functionId")
                    .dependencies(
                        FunctionDeployParams.Dependencies.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .entrypoint("index.ts")
                    .files(
                        FunctionDeployParams.Files.builder()
                            .putAdditionalProperty(
                                "index.ts",
                                JsonValue.from(
                                    "import { formatOrder } from './lib/orders';\n\nexport default async function handler(event) {\n  return { statusCode: 200, body: formatOrder(event) };\n}\n"
                                ),
                            )
                            .putAdditionalProperty(
                                "lib/orders.ts",
                                JsonValue.from(
                                    "export function formatOrder(event) {\n  return JSON.stringify(event);\n}\n"
                                ),
                            )
                            .build()
                    )
                    .sourceCode("sourceCode")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDeployment() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val functionService = client.functions()

        val response = functionService.getDeployment("deploymentId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun tailLogs() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val functionService = client.functions()

        val response =
            functionService.tailLogs(
                FunctionTailLogsParams.builder()
                    .functionId("functionId")
                    .endTime(0L)
                    .filterPattern("filterPattern")
                    .limit(1L)
                    .nextToken("nextToken")
                    .startTime(0L)
                    .build()
            )

        response.validate()
    }
}
