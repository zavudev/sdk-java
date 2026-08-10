// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import com.zavudev.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowUpdateParamsTest {

    @Test
    fun create() {
        FlowUpdateParams.builder()
            .senderId("senderId")
            .flowId("flowId")
            .description("description")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params = FlowUpdateParams.builder().senderId("senderId").flowId("flowId").build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        assertThat(params._pathParam(1)).isEqualTo("flowId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FlowUpdateParams.builder()
                .senderId("senderId")
                .flowId("flowId")
                .description("description")
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
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.enabled()).contains(true)
        assertThat(body.name()).contains("name")
        assertThat(body.priority()).contains(0L)
        assertThat(body.steps().getOrNull())
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
        assertThat(body.trigger())
            .contains(
                FlowTrigger.builder()
                    .type(FlowTrigger.Type.KEYWORD)
                    .intent("intent")
                    .addKeyword("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FlowUpdateParams.builder().senderId("senderId").flowId("flowId").build()

        val body = params._body()
    }
}
