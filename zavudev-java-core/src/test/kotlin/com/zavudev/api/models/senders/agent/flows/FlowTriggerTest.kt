// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent.flows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowTriggerTest {

    @Test
    fun create() {
        val flowTrigger =
            FlowTrigger.builder()
                .type(FlowTrigger.Type.KEYWORD)
                .intent("intent")
                .addKeyword("string")
                .build()

        assertThat(flowTrigger.type()).isEqualTo(FlowTrigger.Type.KEYWORD)
        assertThat(flowTrigger.intent()).contains("intent")
        assertThat(flowTrigger.keywords().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flowTrigger =
            FlowTrigger.builder()
                .type(FlowTrigger.Type.KEYWORD)
                .intent("intent")
                .addKeyword("string")
                .build()

        val roundtrippedFlowTrigger =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flowTrigger),
                jacksonTypeRef<FlowTrigger>(),
            )

        assertThat(roundtrippedFlowTrigger).isEqualTo(flowTrigger)
    }
}
