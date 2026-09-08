// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.name()).isEqualTo("Order Bot")
        assertThat(body.slug()).isEqualTo("order-bot")
        assertThat(body.dependencies())
            .contains(
                FunctionCreateParams.Dependencies.builder()
                    .putAdditionalProperty("openai", JsonValue.from("^4.20.0"))
                    .build()
            )
        assertThat(body.description()).contains("Replies to order status questions on WhatsApp.")
        assertThat(body.entrypoint()).contains("index.ts")
        assertThat(body.files())
            .contains(
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
        assertThat(body.httpEnabled()).contains(true)
        assertThat(body.memoryMb()).contains(FunctionCreateParams.MemoryMb._128)
        assertThat(body.runtime()).contains(FunctionCreateParams.Runtime.NODEJS24)
        assertThat(body.sourceCode())
            .contains(
                "import { defineFunction } from '@zavudev/functions';\n\nexport default defineFunction(async (event, ctx) => {\n  ctx.log('received', event.type);\n});\n"
            )
        assertThat(body.timeoutSec()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FunctionCreateParams.builder().name("Order Bot").slug("order-bot").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Order Bot")
        assertThat(body.slug()).isEqualTo("order-bot")
    }
}
