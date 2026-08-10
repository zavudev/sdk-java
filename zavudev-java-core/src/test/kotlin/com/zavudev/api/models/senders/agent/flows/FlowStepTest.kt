// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowStepTest {

    @Test
    fun create() {
        val flowStep =
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

        assertThat(flowStep.id()).isEqualTo("id")
        assertThat(flowStep.config())
            .isEqualTo(
                FlowStep.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(flowStep.type()).isEqualTo(FlowStep.Type.MESSAGE)
        assertThat(flowStep.nextStepId()).contains("nextStepId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flowStep =
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

        val roundtrippedFlowStep =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flowStep),
                jacksonTypeRef<FlowStep>(),
            )

        assertThat(roundtrippedFlowStep).isEqualTo(flowStep)
    }
}
