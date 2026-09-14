// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agenttemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTemplateRetrieveResponseTest {

    @Test
    fun create() {
        val agentTemplateRetrieveResponse =
            AgentTemplateRetrieveResponse.builder()
                .template(
                    AgentTemplateRetrieveResponse.Template.builder()
                        .id("fermi")
                        .category(AgentTemplateRetrieveResponse.Template.Category.SALES)
                        .defaultSlug("fermi")
                        .dependencies(
                            AgentTemplateRetrieveResponse.Template.Dependencies.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addFile(
                            AgentTemplateRetrieveResponse.Template.File.builder()
                                .content("content")
                                .path("index.ts")
                                .build()
                        )
                        .name("name")
                        .addRequiredSecret(
                            AgentTemplateRetrieveResponse.Template.RequiredSecret.builder()
                                .hint("hint")
                                .key("SENDER_ID")
                                .build()
                        )
                        .summary("summary")
                        .voice(true)
                        .build()
                )
                .build()

        assertThat(agentTemplateRetrieveResponse.template())
            .isEqualTo(
                AgentTemplateRetrieveResponse.Template.builder()
                    .id("fermi")
                    .category(AgentTemplateRetrieveResponse.Template.Category.SALES)
                    .defaultSlug("fermi")
                    .dependencies(
                        AgentTemplateRetrieveResponse.Template.Dependencies.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addFile(
                        AgentTemplateRetrieveResponse.Template.File.builder()
                            .content("content")
                            .path("index.ts")
                            .build()
                    )
                    .name("name")
                    .addRequiredSecret(
                        AgentTemplateRetrieveResponse.Template.RequiredSecret.builder()
                            .hint("hint")
                            .key("SENDER_ID")
                            .build()
                    )
                    .summary("summary")
                    .voice(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentTemplateRetrieveResponse =
            AgentTemplateRetrieveResponse.builder()
                .template(
                    AgentTemplateRetrieveResponse.Template.builder()
                        .id("fermi")
                        .category(AgentTemplateRetrieveResponse.Template.Category.SALES)
                        .defaultSlug("fermi")
                        .dependencies(
                            AgentTemplateRetrieveResponse.Template.Dependencies.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addFile(
                            AgentTemplateRetrieveResponse.Template.File.builder()
                                .content("content")
                                .path("index.ts")
                                .build()
                        )
                        .name("name")
                        .addRequiredSecret(
                            AgentTemplateRetrieveResponse.Template.RequiredSecret.builder()
                                .hint("hint")
                                .key("SENDER_ID")
                                .build()
                        )
                        .summary("summary")
                        .voice(true)
                        .build()
                )
                .build()

        val roundtrippedAgentTemplateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentTemplateRetrieveResponse),
                jacksonTypeRef<AgentTemplateRetrieveResponse>(),
            )

        assertThat(roundtrippedAgentTemplateRetrieveResponse)
            .isEqualTo(agentTemplateRetrieveResponse)
    }
}
