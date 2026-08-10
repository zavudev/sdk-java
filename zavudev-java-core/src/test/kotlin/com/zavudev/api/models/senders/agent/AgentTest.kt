// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.senders.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.zavudev.api.core.JsonValue
import com.zavudev.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTest {

    @Test
    fun create() {
        val agent =
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
                                    JsonValue.from("Hola, soy Atlas. Preguntame lo que quieras."),
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

        assertThat(agent.id()).isEqualTo("agent_abc123")
        assertThat(agent.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agent.enabled()).isEqualTo(true)
        assertThat(agent.model()).isEqualTo("gpt-4o-mini")
        assertThat(agent.name()).isEqualTo("Customer Support Agent")
        assertThat(agent.provider()).isEqualTo(AgentProvider.OPENAI)
        assertThat(agent.senderId()).isEqualTo("sender_12345")
        assertThat(agent.systemPrompt()).isEqualTo("systemPrompt")
        assertThat(agent.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agent.contextWindowMessages()).contains(0L)
        assertThat(agent.includeContactMetadata()).contains(true)
        assertThat(agent.maxTokens()).contains(0L)
        assertThat(agent.senderIds().getOrNull()).containsExactly("string")
        assertThat(agent.stats())
            .contains(
                Agent.Stats.builder()
                    .totalCost(0.0)
                    .totalInvocations(0L)
                    .totalTokensUsed(0L)
                    .build()
            )
        assertThat(agent.temperature()).contains(0.0)
        assertThat(agent.triggerOnChannels().getOrNull()).containsExactly("sms", "whatsapp")
        assertThat(agent.triggerOnMessageTypes().getOrNull()).containsExactly("text")
        assertThat(agent.voice())
            .contains(
                Agent.Voice.builder()
                    .enabled(true)
                    .greeting("Hi, thanks for calling Acme. How can I help you today?")
                    .greetings(
                        Agent.Voice.Greetings.builder()
                            .putAdditionalProperty(
                                "es",
                                JsonValue.from("Hola, soy Atlas. Preguntame lo que quieras."),
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agent =
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
                                    JsonValue.from("Hola, soy Atlas. Preguntame lo que quieras."),
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

        val roundtrippedAgent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(agent), jacksonTypeRef<Agent>())

        assertThat(roundtrippedAgent).isEqualTo(agent)
    }
}
