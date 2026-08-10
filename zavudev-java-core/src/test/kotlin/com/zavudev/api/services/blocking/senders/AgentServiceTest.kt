// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.senders

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.senders.agent.AgentCreateParams
import com.zavudev.api.models.senders.agent.AgentProvider
import com.zavudev.api.models.senders.agent.AgentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.senders().agent()

        val agentResponse =
            agentService.create(
                AgentCreateParams.builder()
                    .senderId("senderId")
                    .model("gpt-4o-mini")
                    .name("Customer Support")
                    .provider(AgentProvider.OPENAI)
                    .systemPrompt(
                        "You are a helpful customer support agent. Be friendly and concise."
                    )
                    .apiKey("sk-...")
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
                            .voicemailAction(AgentCreateParams.Voice.VoicemailAction.HANGUP)
                            .voicemailMessage("voicemailMessage")
                            .voiceSpeed(0.5)
                            .build()
                    )
                    .build()
            )

        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.senders().agent()

        val agentResponse = agentService.retrieve("senderId")

        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.senders().agent()

        val agentResponse =
            agentService.update(
                AgentUpdateParams.builder()
                    .senderId("senderId")
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
                            .voicemailAction(AgentUpdateParams.Voice.VoicemailAction.HANGUP)
                            .voicemailMessage("voicemailMessage")
                            .voiceSpeed(0.5)
                            .build()
                    )
                    .build()
            )

        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.senders().agent()

        agentService.delete("senderId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stats() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.senders().agent()

        val agentStats = agentService.stats("senderId")

        agentStats.validate()
    }
}
