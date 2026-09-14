// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = FunctionUpdateParams.builder().functionId("functionId").build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.dependencies())
            .contains(
                FunctionUpdateParams.Dependencies.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.entrypoint()).contains("index.ts")
        assertThat(body.files())
            .contains(
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
        assertThat(body.httpEnabled()).contains(true)
        assertThat(body.sourceCode()).contains("sourceCode")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FunctionUpdateParams.builder().functionId("functionId").build()

        val body = params._body()
    }
}
