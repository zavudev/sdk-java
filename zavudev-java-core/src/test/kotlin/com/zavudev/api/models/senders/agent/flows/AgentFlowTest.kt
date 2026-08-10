// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentFlowTest {

    @Test
    fun create() {
        val agentFlow =
            AgentFlow.builder()
                .id("id")
                .agentId("agentId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enabled(true)
                .name("name")
                .priority(0L)
                .addStep(
                    FlowStep.builder()
                        .id("id")
                        .config(
                            FlowStep.Config.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(FlowStep.Type.MESSAGE)
                        .nextStepId("nextStepId")
                        .build()
                )
                .trigger(
                    FlowTrigger.builder()
                        .type(FlowTrigger.Type.KEYWORD)
                        .intent("intent")
                        .addKeyword("string")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .build()

        assertThat(agentFlow.id()).isEqualTo("id")
        assertThat(agentFlow.agentId()).isEqualTo("agentId")
        assertThat(agentFlow.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentFlow.enabled()).isEqualTo(true)
        assertThat(agentFlow.name()).isEqualTo("name")
        assertThat(agentFlow.priority()).isEqualTo(0L)
        assertThat(agentFlow.steps())
            .containsExactly(
                FlowStep.builder()
                    .id("id")
                    .config(
                        FlowStep.Config.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(FlowStep.Type.MESSAGE)
                    .nextStepId("nextStepId")
                    .build()
            )
        assertThat(agentFlow.trigger())
            .isEqualTo(
                FlowTrigger.builder()
                    .type(FlowTrigger.Type.KEYWORD)
                    .intent("intent")
                    .addKeyword("string")
                    .build()
            )
        assertThat(agentFlow.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentFlow.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentFlow =
            AgentFlow.builder()
                .id("id")
                .agentId("agentId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enabled(true)
                .name("name")
                .priority(0L)
                .addStep(
                    FlowStep.builder()
                        .id("id")
                        .config(
                            FlowStep.Config.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(FlowStep.Type.MESSAGE)
                        .nextStepId("nextStepId")
                        .build()
                )
                .trigger(
                    FlowTrigger.builder()
                        .type(FlowTrigger.Type.KEYWORD)
                        .intent("intent")
                        .addKeyword("string")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .build()

        val roundtrippedAgentFlow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentFlow),
                jacksonTypeRef<AgentFlow>(),
            )

        assertThat(roundtrippedAgentFlow).isEqualTo(agentFlow)
    }
}
