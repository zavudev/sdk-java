// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.senders

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.senders.agent.AgentCreateParams
import com.zavudev.api.models.senders.agent.AgentProvider
import com.zavudev.api.models.senders.agent.AgentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.senders().agent()

        val agentResponseFuture =
            agentServiceAsync.create(
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

        val agentResponse = agentResponseFuture.get()
        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.senders().agent()

        val agentResponseFuture = agentServiceAsync.retrieve("senderId")

        val agentResponse = agentResponseFuture.get()
        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.senders().agent()

        val agentResponseFuture =
            agentServiceAsync.update(
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

        val agentResponse = agentResponseFuture.get()
        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.senders().agent()

        val future = agentServiceAsync.delete("senderId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stats() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.senders().agent()

        val agentStatsFuture = agentServiceAsync.stats("senderId")

        val agentStats = agentStatsFuture.get()
        agentStats.validate()
    }
}
