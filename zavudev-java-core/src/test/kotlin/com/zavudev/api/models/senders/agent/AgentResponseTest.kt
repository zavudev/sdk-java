// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentResponseTest {

    @Test
    fun create() {
        val agentResponse =
            AgentResponse.builder()
                .agent(
                    Agent.builder()
                        .id("agent_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .model("gpt-4o-mini")
                        .name("Customer Support Agent")
                        .provider(AgentProvider.OPENAI)
                        .senderId("sender_12345")
                        .systemPrompt("systemPrompt")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .contextWindowMessages(0L)
                        .includeContactMetadata(true)
                        .maxTokens(0L)
                        .addSenderId("string")
                        .stats(
                            Agent.Stats.builder()
                                .totalCost(0.0)
                                .totalInvocations(0L)
                                .totalTokensUsed(0L)
                                .build()
                        )
                        .temperature(0.0)
                        .addTriggerOnChannel("sms")
                        .addTriggerOnChannel("whatsapp")
                        .addTriggerOnMessageType("text")
                        .voice(
                            Agent.Voice.builder()
                                .enabled(true)
                                .greeting("Hi, thanks for calling Acme. How can I help you today?")
                                .greetings(
                                    Agent.Voice.Greetings.builder()
                                        .putAdditionalProperty(
                                            "es",
                                            JsonValue.from(
                                                "Hola, soy Atlas. Preguntame lo que quieras."
                                            ),
                                        )
                                        .build()
                                )
                                .interruptible(true)
                                .language("en")
                                .maxCallDurationMinutes(1L)
                                .maxIdleSeconds(5L)
                                .model("openai/gpt-4o")
                                .recordCalls(true)
                                .sttModel("sttModel")
                                .sttProvider("sttProvider")
                                .transferPhoneNumber("+14155551234")
                                .ttsProvider("ttsProvider")
                                .ttsVoiceId("aria")
                                .voicemailAction(Agent.Voice.VoicemailAction.HANGUP)
                                .voicemailMessage("voicemailMessage")
                                .voiceSpeed(0.5)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(agentResponse.agent())
            .isEqualTo(
                Agent.builder()
                    .id("agent_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .model("gpt-4o-mini")
                    .name("Customer Support Agent")
                    .provider(AgentProvider.OPENAI)
                    .senderId("sender_12345")
                    .systemPrompt("systemPrompt")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .contextWindowMessages(0L)
                    .includeContactMetadata(true)
                    .maxTokens(0L)
                    .addSenderId("string")
                    .stats(
                        Agent.Stats.builder()
                            .totalCost(0.0)
                            .totalInvocations(0L)
                            .totalTokensUsed(0L)
                            .build()
                    )
                    .temperature(0.0)
                    .addTriggerOnChannel("sms")
                    .addTriggerOnChannel("whatsapp")
                    .addTriggerOnMessageType("text")
                    .voice(
                        Agent.Voice.builder()
                            .enabled(true)
                            .greeting("Hi, thanks for calling Acme. How can I help you today?")
                            .greetings(
                                Agent.Voice.Greetings.builder()
                                    .putAdditionalProperty(
                                        "es",
                                        JsonValue.from(
                                            "Hola, soy Atlas. Preguntame lo que quieras."
                                        ),
                                    )
                                    .build()
                            )
                            .interruptible(true)
                            .language("en")
                            .maxCallDurationMinutes(1L)
                            .maxIdleSeconds(5L)
                            .model("openai/gpt-4o")
                            .recordCalls(true)
                            .sttModel("sttModel")
                            .sttProvider("sttProvider")
                            .transferPhoneNumber("+14155551234")
                            .ttsProvider("ttsProvider")
                            .ttsVoiceId("aria")
                            .voicemailAction(Agent.Voice.VoicemailAction.HANGUP)
                            .voicemailMessage("voicemailMessage")
                            .voiceSpeed(0.5)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentResponse =
            AgentResponse.builder()
                .agent(
                    Agent.builder()
                        .id("agent_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .model("gpt-4o-mini")
                        .name("Customer Support Agent")
                        .provider(AgentProvider.OPENAI)
                        .senderId("sender_12345")
                        .systemPrompt("systemPrompt")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .contextWindowMessages(0L)
                        .includeContactMetadata(true)
                        .maxTokens(0L)
                        .addSenderId("string")
                        .stats(
                            Agent.Stats.builder()
                                .totalCost(0.0)
                                .totalInvocations(0L)
                                .totalTokensUsed(0L)
                                .build()
                        )
                        .temperature(0.0)
                        .addTriggerOnChannel("sms")
                        .addTriggerOnChannel("whatsapp")
                        .addTriggerOnMessageType("text")
                        .voice(
                            Agent.Voice.builder()
                                .enabled(true)
                                .greeting("Hi, thanks for calling Acme. How can I help you today?")
                                .greetings(
                                    Agent.Voice.Greetings.builder()
                                        .putAdditionalProperty(
                                            "es",
                                            JsonValue.from(
                                                "Hola, soy Atlas. Preguntame lo que quieras."
                                            ),
                                        )
                                        .build()
                                )
                                .interruptible(true)
                                .language("en")
                                .maxCallDurationMinutes(1L)
                                .maxIdleSeconds(5L)
                                .model("openai/gpt-4o")
                                .recordCalls(true)
                                .sttModel("sttModel")
                                .sttProvider("sttProvider")
                                .transferPhoneNumber("+14155551234")
                                .ttsProvider("ttsProvider")
                                .ttsVoiceId("aria")
                                .voicemailAction(Agent.Voice.VoicemailAction.HANGUP)
                                .voicemailMessage("voicemailMessage")
                                .voiceSpeed(0.5)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedAgentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentResponse),
                jacksonTypeRef<AgentResponse>(),
            )

        assertThat(roundtrippedAgentResponse).isEqualTo(agentResponse)
    }
}
