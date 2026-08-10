// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowListPageResponseTest {

    @Test
    fun create() {
        val flowListPageResponse =
            FlowListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        assertThat(flowListPageResponse.items())
            .containsExactly(
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
        assertThat(flowListPageResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flowListPageResponse =
            FlowListPageResponse.builder()
                .addItem(
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
                .nextCursor("nextCursor")
                .build()

        val roundtrippedFlowListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flowListPageResponse),
                jacksonTypeRef<FlowListPageResponse>(),
            )

        assertThat(roundtrippedFlowListPageResponse).isEqualTo(flowListPageResponse)
    }
}
