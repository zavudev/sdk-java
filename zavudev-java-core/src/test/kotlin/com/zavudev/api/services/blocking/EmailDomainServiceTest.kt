// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.models.emaildomains.EmailDomainCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailDomainServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val emailDomain =
            emailDomainService.create(
                EmailDomainCreateParams.builder().domain("example.com").build()
            )

        emailDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val emailDomain = emailDomainService.retrieve("domainId")

        emailDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val emailDomains = emailDomainService.list()

        emailDomains.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        emailDomainService.delete("domainId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val response = emailDomainService.verify("domainId")

        response.validate()
    }
}
