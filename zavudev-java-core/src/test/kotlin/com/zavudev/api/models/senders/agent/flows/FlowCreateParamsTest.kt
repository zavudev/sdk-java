// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowCreateParamsTest {

    @Test
    fun create() {
        FlowCreateParams.builder()
            .senderId("senderId")
            .name("Lead Capture")
            .addStep(
                FlowStep.builder()
                    .id("welcome")
                    .config(
                        FlowStep.Config.builder()
                            .putAdditionalProperty("text", JsonValue.from("bar"))
                            .build()
                    )
                    .type(FlowStep.Type.MESSAGE)
                    .nextStepId("ask_name")
                    .build()
            )
            .addStep(
                FlowStep.builder()
                    .id("ask_name")
                    .config(
                        FlowStep.Config.builder()
                            .putAdditionalProperty("variable", JsonValue.from("bar"))
                            .putAdditionalProperty("prompt", JsonValue.from("bar"))
                            .build()
                    )
                    .type(FlowStep.Type.COLLECT)
                    .nextStepId("nextStepId")
                    .build()
            )
            .trigger(
                FlowTrigger.builder()
                    .type(FlowTrigger.Type.KEYWORD)
                    .intent("intent")
                    .keywords(listOf("info", "pricing", "demo"))
                    .build()
            )
            .description("Capture lead information")
            .enabled(true)
            .priority(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FlowCreateParams.builder()
                .senderId("senderId")
                .name("Lead Capture")
                .addStep(
                    FlowStep.builder()
                        .id("welcome")
                        .config(
                            FlowStep.Config.builder()
                                .putAdditionalProperty("text", JsonValue.from("bar"))
                                .build()
                        )
                        .type(FlowStep.Type.MESSAGE)
                        .build()
                )
                .addStep(
                    FlowStep.builder()
                        .id("ask_name")
                        .config(
                            FlowStep.Config.builder()
                                .putAdditionalProperty("variable", JsonValue.from("bar"))
                                .putAdditionalProperty("prompt", JsonValue.from("bar"))
                                .build()
                        )
                        .type(FlowStep.Type.COLLECT)
                        .build()
                )
                .trigger(FlowTrigger.builder().type(FlowTrigger.Type.KEYWORD).build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("senderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FlowCreateParams.builder()
                .senderId("senderId")
                .name("Lead Capture")
                .addStep(
                    FlowStep.builder()
                        .id("welcome")
                        .config(
                            FlowStep.Config.builder()
                                .putAdditionalProperty("text", JsonValue.from("bar"))
                                .build()
                        )
                        .type(FlowStep.Type.MESSAGE)
                        .nextStepId("ask_name")
                        .build()
                )
                .addStep(
                    FlowStep.builder()
                        .id("ask_name")
                        .config(
                            FlowStep.Config.builder()
                                .putAdditionalProperty("variable", JsonValue.from("bar"))
                                .putAdditionalProperty("prompt", JsonValue.from("bar"))
                                .build()
                        )
                        .type(FlowStep.Type.COLLECT)
                        .nextStepId("nextStepId")
                        .build()
                )
                .trigger(
                    FlowTrigger.builder()
                        .type(FlowTrigger.Type.KEYWORD)
                        .intent("intent")
                        .keywords(listOf("info", "pricing", "demo"))
                        .build()
                )
                .description("Capture lead information")
                .enabled(true)
                .priority(0L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Lead Capture")
        assertThat(body.steps())
            .containsExactly(
                FlowStep.builder()
                    .id("welcome")
                    .config(
                        FlowStep.Config.builder()
                            .putAdditionalProperty("text", JsonValue.from("bar"))
                            .build()
                    )
                    .type(FlowStep.Type.MESSAGE)
                    .nextStepId("ask_name")
                    .build(),
                FlowStep.builder()
                    .id("ask_name")
                    .config(
                        FlowStep.Config.builder()
                            .putAdditionalProperty("variable", JsonValue.from("bar"))
                            .putAdditionalProperty("prompt", JsonValue.from("bar"))
                            .build()
                    )
                    .type(FlowStep.Type.COLLECT)
                    .nextStepId("nextStepId")
                    .build(),
            )
        assertThat(body.trigger())
            .isEqualTo(
                FlowTrigger.builder()
                    .type(FlowTrigger.Type.KEYWORD)
                    .intent("intent")
                    .keywords(listOf("info", "pricing", "demo"))
                    .build()
            )
        assertThat(body.description()).contains("Capture lead information")
        assertThat(body.enabled()).contains(true)
        assertThat(body.priority()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FlowCreateParams.builder()
                .senderId("senderId")
                .name("Lead Capture")
                .addStep(
                    FlowStep.builder()
                        .id("welcome")
                        .config(
                            FlowStep.Config.builder()
                                .putAdditionalProperty("text", JsonValue.from("bar"))
                                .build()
                        )
                        .type(FlowStep.Type.MESSAGE)
                        .build()
                )
                .addStep(
                    FlowStep.builder()
                        .id("ask_name")
                        .config(
                            FlowStep.Config.builder()
                                .putAdditionalProperty("variable", JsonValue.from("bar"))
                                .putAdditionalProperty("prompt", JsonValue.from("bar"))
                                .build()
                        )
                        .type(FlowStep.Type.COLLECT)
                        .build()
                )
                .trigger(FlowTrigger.builder().type(FlowTrigger.Type.KEYWORD).build())
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Lead Capture")
        assertThat(body.steps())
            .containsExactly(
                FlowStep.builder()
                    .id("welcome")
                    .config(
                        FlowStep.Config.builder()
                            .putAdditionalProperty("text", JsonValue.from("bar"))
                            .build()
                    )
                    .type(FlowStep.Type.MESSAGE)
                    .build(),
                FlowStep.builder()
                    .id("ask_name")
                    .config(
                        FlowStep.Config.builder()
                            .putAdditionalProperty("variable", JsonValue.from("bar"))
                            .putAdditionalProperty("prompt", JsonValue.from("bar"))
                            .build()
                    )
                    .type(FlowStep.Type.COLLECT)
                    .build(),
            )
        assertThat(body.trigger())
            .isEqualTo(FlowTrigger.builder().type(FlowTrigger.Type.KEYWORD).build())
    }
}
