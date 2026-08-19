// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.agents.AgentCreateParams
import com.zavudev.api.models.agents.AgentListVoicesParams
import com.zavudev.api.models.agents.AgentTestParams
import com.zavudev.api.models.agents.AgentUpdateParams
import com.zavudev.api.models.senders.agent.AgentProvider
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.agents()

        val agentFuture =
            agentServiceAsync.create(
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

        val agent = agentFuture.get()
        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.agents()

        val agentFuture = agentServiceAsync.retrieve("agentId")

        val agent = agentFuture.get()
        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.agents()

        val agentFuture =
            agentServiceAsync.update(
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

        val agent = agentFuture.get()
        agent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.agents()

        val pageFuture = agentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.agents()

        val future = agentServiceAsync.delete("agentId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listVoices() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.agents()

        val responseFuture =
            agentServiceAsync.listVoices(AgentListVoicesParams.builder().language("es").build())

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.agents()

        val responseFuture =
            agentServiceAsync.test(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
