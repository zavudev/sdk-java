// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.senders.agent.flows.FlowCreateParams
import com.zavudev.api.models.senders.agent.flows.FlowDeleteParams
import com.zavudev.api.models.senders.agent.flows.FlowDuplicateParams
import com.zavudev.api.models.senders.agent.flows.FlowRetrieveParams
import com.zavudev.api.models.senders.agent.flows.FlowStep
import com.zavudev.api.models.senders.agent.flows.FlowTrigger
import com.zavudev.api.models.senders.agent.flows.FlowUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FlowServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val flowServiceAsync = client.senders().agent().flows()

        val flowFuture =
            flowServiceAsync.create(
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
            )

        val flow = flowFuture.get()
        flow.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val flowServiceAsync = client.senders().agent().flows()

        val flowFuture =
            flowServiceAsync.retrieve(
                FlowRetrieveParams.builder().senderId("senderId").flowId("flowId").build()
            )

        val flow = flowFuture.get()
        flow.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val flowServiceAsync = client.senders().agent().flows()

        val flowFuture =
            flowServiceAsync.update(
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
            )

        val flow = flowFuture.get()
        flow.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val flowServiceAsync = client.senders().agent().flows()

        val pageFuture = flowServiceAsync.list("senderId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val flowServiceAsync = client.senders().agent().flows()

        val future =
            flowServiceAsync.delete(
                FlowDeleteParams.builder().senderId("senderId").flowId("flowId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun duplicate() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val flowServiceAsync = client.senders().agent().flows()

        val responseFuture =
            flowServiceAsync.duplicate(
                FlowDuplicateParams.builder()
                    .senderId("senderId")
                    .flowId("flowId")
                    .newName("Lead Capture (Copy)")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
