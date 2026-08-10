// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders.agent

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.senders.agent.tools.ToolCreateParams
import com.zavudev.api.models.senders.agent.tools.ToolDeleteParams
import com.zavudev.api.models.senders.agent.tools.ToolParameters
import com.zavudev.api.models.senders.agent.tools.ToolRetrieveParams
import com.zavudev.api.models.senders.agent.tools.ToolTestParams
import com.zavudev.api.models.senders.agent.tools.ToolUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ToolServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.senders().agent().tools()

        val toolFuture =
            toolServiceAsync.create(
                ToolCreateParams.builder()
                    .senderId("senderId")
                    .description("Get the status of a customer order")
                    .name("get_order_status")
                    .parameters(
                        ToolParameters.builder()
                            .properties(
                                ToolParameters.Properties.builder()
                                    .putAdditionalProperty(
                                        "order_id",
                                        JsonValue.from(
                                            mapOf(
                                                "description" to "The order ID to look up",
                                                "type" to "string",
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .addRequired("order_id")
                            .type(ToolParameters.Type.OBJECT)
                            .build()
                    )
                    .webhookUrl("https://api.example.com/webhooks/order-status")
                    .enabled(true)
                    .webhookSecret("whsec_...")
                    .build()
            )

        val tool = toolFuture.get()
        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.senders().agent().tools()

        val toolFuture =
            toolServiceAsync.retrieve(
                ToolRetrieveParams.builder().senderId("senderId").toolId("toolId").build()
            )

        val tool = toolFuture.get()
        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.senders().agent().tools()

        val toolFuture =
            toolServiceAsync.update(
                ToolUpdateParams.builder()
                    .senderId("senderId")
                    .toolId("toolId")
                    .description("description")
                    .enabled(true)
                    .name("name")
                    .parameters(
                        ToolParameters.builder()
                            .properties(
                                ToolParameters.Properties.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf("description" to "description", "type" to "type")
                                        ),
                                    )
                                    .build()
                            )
                            .addRequired("string")
                            .type(ToolParameters.Type.OBJECT)
                            .build()
                    )
                    .webhookSecret("webhookSecret")
                    .webhookUrl("https://example.com")
                    .build()
            )

        val tool = toolFuture.get()
        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.senders().agent().tools()

        val pageFuture = toolServiceAsync.list("senderId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.senders().agent().tools()

        val future =
            toolServiceAsync.delete(
                ToolDeleteParams.builder().senderId("senderId").toolId("toolId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.senders().agent().tools()

        val responseFuture =
            toolServiceAsync.test(
                ToolTestParams.builder()
                    .senderId("senderId")
                    .toolId("toolId")
                    .testParams(
                        ToolTestParams.TestParams.builder()
                            .putAdditionalProperty("order_id", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
