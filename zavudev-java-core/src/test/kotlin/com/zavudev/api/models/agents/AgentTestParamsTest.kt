// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTestParamsTest {

    @Test
    fun create() {
        AgentTestParams.builder()
            .agentId("agentId")
            .message("Where is order ORD-12345?")
            .executeTools(true)
            .addHistory(
                AgentTestParams.History.builder()
                    .content("content")
                    .role(AgentTestParams.History.Role.USER)
                    .build()
            )
            .useKnowledgeBase(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentTestParams.builder()
                .agentId("agentId")
                .message("Where is order ORD-12345?")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentTestParams.builder()
                .agentId("agentId")
                .message("Where is order ORD-12345?")
                .executeTools(true)
                .addHistory(
                    AgentTestParams.History.builder()
                        .content("content")
                        .role(AgentTestParams.History.Role.USER)
                        .build()
                )
                .useKnowledgeBase(true)
                .build()

        val body = params._body()

        assertThat(body.message()).isEqualTo("Where is order ORD-12345?")
        assertThat(body.executeTools()).contains(true)
        assertThat(body.history().getOrNull())
            .containsExactly(
                AgentTestParams.History.builder()
                    .content("content")
                    .role(AgentTestParams.History.Role.USER)
                    .build()
            )
        assertThat(body.useKnowledgeBase()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentTestParams.builder()
                .agentId("agentId")
                .message("Where is order ORD-12345?")
                .build()

        val body = params._body()

        assertThat(body.message()).isEqualTo("Where is order ORD-12345?")
    }
}
