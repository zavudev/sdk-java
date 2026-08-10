// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolParametersTest {

    @Test
    fun create() {
        val toolParameters =
            ToolParameters.builder()
                .properties(
                    ToolParameters.Properties.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("description" to "description", "type" to "type")),
                        )
                        .build()
                )
                .addRequired("string")
                .type(ToolParameters.Type.OBJECT)
                .build()

        assertThat(toolParameters.properties())
            .isEqualTo(
                ToolParameters.Properties.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("description" to "description", "type" to "type")),
                    )
                    .build()
            )
        assertThat(toolParameters.required()).containsExactly("string")
        assertThat(toolParameters.type()).isEqualTo(ToolParameters.Type.OBJECT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolParameters =
            ToolParameters.builder()
                .properties(
                    ToolParameters.Properties.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("description" to "description", "type" to "type")),
                        )
                        .build()
                )
                .addRequired("string")
                .type(ToolParameters.Type.OBJECT)
                .build()

        val roundtrippedToolParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolParameters),
                jacksonTypeRef<ToolParameters>(),
            )

        assertThat(roundtrippedToolParameters).isEqualTo(toolParameters)
    }
}
