// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.agents

import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.senders.agent.AgentProvider
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateParamsTest {

    @Test
    fun create() {
        AgentUpdateParams.builder()
            .agentId("agentId")
            .apiKey("apiKey")
            .contextWindowMessages(1L)
            .enabled(true)
            .includeContactMetadata(true)
            .maxTokens(1L)
            .model("model")
            .name("name")
            .provider(AgentProvider.OPENAI)
            .systemPrompt("systemPrompt")
            .temperature(0.0)
            .addTriggerOnChannel("string")
            .addTriggerOnMessageType("string")
            .voice(
                AgentUpdateParams.Voice.builder()
                    .enabled(true)
                    .greeting("Hi, thanks for calling Acme. How can I help you today?")
                    .greetings(
                        AgentUpdateParams.Voice.Greetings.builder()
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
                    .voicemailAction(AgentUpdateParams.Voice.VoicemailAction.HANGUP)
                    .voicemailMessage("voicemailMessage")
                    .voiceSpeed(0.5)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentUpdateParams.builder().agentId("agentId").build()

        assertThat(params._pathParam(0)).isEqualTo("agentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateParams.builder()
                .agentId("agentId")
                .apiKey("apiKey")
                .contextWindowMessages(1L)
                .enabled(true)
                .includeContactMetadata(true)
                .maxTokens(1L)
                .model("model")
                .name("name")
                .provider(AgentProvider.OPENAI)
                .systemPrompt("systemPrompt")
                .temperature(0.0)
                .addTriggerOnChannel("string")
                .addTriggerOnMessageType("string")
                .voice(
                    AgentUpdateParams.Voice.builder()
                        .enabled(true)
                        .greeting("Hi, thanks for calling Acme. How can I help you today?")
                        .greetings(
                            AgentUpdateParams.Voice.Greetings.builder()
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
                        .voicemailAction(AgentUpdateParams.Voice.VoicemailAction.HANGUP)
                        .voicemailMessage("voicemailMessage")
                        .voiceSpeed(0.5)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.apiKey()).contains("apiKey")
        assertThat(body.contextWindowMessages()).contains(1L)
        assertThat(body.enabled()).contains(true)
        assertThat(body.includeContactMetadata()).contains(true)
        assertThat(body.maxTokens()).contains(1L)
        assertThat(body.model()).contains("model")
        assertThat(body.name()).contains("name")
        assertThat(body.provider()).contains(AgentProvider.OPENAI)
        assertThat(body.systemPrompt()).contains("systemPrompt")
        assertThat(body.temperature()).contains(0.0)
        assertThat(body.triggerOnChannels().getOrNull()).containsExactly("string")
        assertThat(body.triggerOnMessageTypes().getOrNull()).containsExactly("string")
        assertThat(body.voice())
            .contains(
                AgentUpdateParams.Voice.builder()
                    .enabled(true)
                    .greeting("Hi, thanks for calling Acme. How can I help you today?")
                    .greetings(
                        AgentUpdateParams.Voice.Greetings.builder()
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
                    .voicemailAction(AgentUpdateParams.Voice.VoicemailAction.HANGUP)
                    .voicemailMessage("voicemailMessage")
                    .voiceSpeed(0.5)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdateParams.builder().agentId("agentId").build()

        val body = params._body()
    }
}
