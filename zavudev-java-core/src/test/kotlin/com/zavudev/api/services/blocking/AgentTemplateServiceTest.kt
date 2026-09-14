// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentTemplateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val agentTemplateService = client.agentTemplates()

        val agentTemplate = agentTemplateService.retrieve("fermi")

        agentTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val agentTemplateService = client.agentTemplates()

        val agentTemplates = agentTemplateService.list()

        agentTemplates.validate()
    }
}
