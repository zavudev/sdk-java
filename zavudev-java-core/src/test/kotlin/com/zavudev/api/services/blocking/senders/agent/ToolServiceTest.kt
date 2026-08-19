// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders.agent

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.senders.agent.tools.ToolCreateParams
import com.zavudev.api.models.senders.agent.tools.ToolDeleteParams
import com.zavudev.api.models.senders.agent.tools.ToolListTestRunsParams
import com.zavudev.api.models.senders.agent.tools.ToolParameters
import com.zavudev.api.models.senders.agent.tools.ToolRetrieveParams
import com.zavudev.api.models.senders.agent.tools.ToolTestParams
import com.zavudev.api.models.senders.agent.tools.ToolUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ToolServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.senders().agent().tools()

        val tool =
            toolService.create(
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

        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.senders().agent().tools()

        val tool =
            toolService.retrieve(
                ToolRetrieveParams.builder().senderId("senderId").toolId("toolId").build()
            )

        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.senders().agent().tools()

        val tool =
            toolService.update(
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

        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.senders().agent().tools()

        val page = toolService.list("senderId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.senders().agent().tools()

        toolService.delete(ToolDeleteParams.builder().senderId("senderId").toolId("toolId").build())
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTestRuns() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.senders().agent().tools()

        val response =
            toolService.listTestRuns(
                ToolListTestRunsParams.builder()
                    .senderId("senderId")
                    .toolId("toolId")
                    .limit(100L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.senders().agent().tools()

        val response =
            toolService.test(
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

        response.validate()
    }
}
