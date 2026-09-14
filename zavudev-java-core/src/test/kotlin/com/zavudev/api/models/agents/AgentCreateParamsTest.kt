// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.senders.agent.AgentProvider
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateParamsTest {

    @Test
    fun create() {
        AgentCreateParams.builder()
            .model("model")
            .name("name")
            .provider(AgentProvider.OPENAI)
            .systemPrompt("systemPrompt")
            .contextWindowMessages(1L)
            .includeContactMetadata(true)
            .maxTokens(1L)
            .temperature(0.0)
            .addTriggerOnChannel("string")
            .addTriggerOnMessageType("string")
            .voice(
                AgentCreateParams.Voice.builder()
                    .enabled(true)
                    .greeting("Hi, thanks for calling Acme. How can I help you today?")
                    .greetings(
                        AgentCreateParams.Voice.Greetings.builder()
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
                    .voicemailAction(AgentCreateParams.Voice.VoicemailAction.HANGUP)
                    .voicemailMessage("voicemailMessage")
                    .voiceSpeed(0.5)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentCreateParams.builder()
                .model("model")
                .name("name")
                .provider(AgentProvider.OPENAI)
                .systemPrompt("systemPrompt")
                .contextWindowMessages(1L)
                .includeContactMetadata(true)
                .maxTokens(1L)
                .temperature(0.0)
                .addTriggerOnChannel("string")
                .addTriggerOnMessageType("string")
                .voice(
                    AgentCreateParams.Voice.builder()
                        .enabled(true)
                        .greeting("Hi, thanks for calling Acme. How can I help you today?")
                        .greetings(
                            AgentCreateParams.Voice.Greetings.builder()
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
                        .voicemailAction(AgentCreateParams.Voice.VoicemailAction.HANGUP)
                        .voicemailMessage("voicemailMessage")
                        .voiceSpeed(0.5)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.provider()).isEqualTo(AgentProvider.OPENAI)
        assertThat(body.systemPrompt()).isEqualTo("systemPrompt")
        assertThat(body.contextWindowMessages()).contains(1L)
        assertThat(body.includeContactMetadata()).contains(true)
        assertThat(body.maxTokens()).contains(1L)
        assertThat(body.temperature()).contains(0.0)
        assertThat(body.triggerOnChannels().getOrNull()).containsExactly("string")
        assertThat(body.triggerOnMessageTypes().getOrNull()).containsExactly("string")
        assertThat(body.voice())
            .contains(
                AgentCreateParams.Voice.builder()
                    .enabled(true)
                    .greeting("Hi, thanks for calling Acme. How can I help you today?")
                    .greetings(
                        AgentCreateParams.Voice.Greetings.builder()
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
                    .voicemailAction(AgentCreateParams.Voice.VoicemailAction.HANGUP)
                    .voicemailMessage("voicemailMessage")
                    .voiceSpeed(0.5)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .model("model")
                .name("name")
                .provider(AgentProvider.OPENAI)
                .systemPrompt("systemPrompt")
                .build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.provider()).isEqualTo(AgentProvider.OPENAI)
        assertThat(body.systemPrompt()).isEqualTo("systemPrompt")
    }
}
