// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowDuplicateResponseTest {

    @Test
    fun create() {
        val flowDuplicateResponse =
            FlowDuplicateResponse.builder()
                .flow(
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
                )
                .build()

        assertThat(flowDuplicateResponse.flow())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flowDuplicateResponse =
            FlowDuplicateResponse.builder()
                .flow(
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
                )
                .build()

        val roundtrippedFlowDuplicateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flowDuplicateResponse),
                jacksonTypeRef<FlowDuplicateResponse>(),
            )

        assertThat(roundtrippedFlowDuplicateResponse).isEqualTo(flowDuplicateResponse)
    }
}
