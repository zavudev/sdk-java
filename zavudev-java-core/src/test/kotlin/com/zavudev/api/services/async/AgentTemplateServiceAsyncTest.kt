// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentTemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentTemplateServiceAsync = client.agentTemplates()

        val agentTemplateFuture = agentTemplateServiceAsync.retrieve("fermi")

        val agentTemplate = agentTemplateFuture.get()
        agentTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentTemplateServiceAsync = client.agentTemplates()

        val agentTemplatesFuture = agentTemplateServiceAsync.list()

        val agentTemplates = agentTemplatesFuture.get()
        agentTemplates.validate()
    }
}
