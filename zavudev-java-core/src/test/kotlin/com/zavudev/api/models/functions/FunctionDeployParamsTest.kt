// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.functions

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionDeployParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = FunctionDeployParams.builder().functionId("functionId").build()

        assertThat(params._pathParam(0)).isEqualTo("functionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.dependencies())
            .contains(
                FunctionDeployParams.Dependencies.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.entrypoint()).contains("index.ts")
        assertThat(body.files())
            .contains(
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
        assertThat(body.sourceCode()).contains("sourceCode")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FunctionDeployParams.builder().functionId("functionId").build()

        val body = params._body()
    }
}
