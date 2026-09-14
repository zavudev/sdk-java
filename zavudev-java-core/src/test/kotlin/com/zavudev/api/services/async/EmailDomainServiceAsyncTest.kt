// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.models.emaildomains.EmailDomainCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailDomainServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val emailDomainFuture =
            emailDomainServiceAsync.create(
                EmailDomainCreateParams.builder().domain("example.com").build()
            )

        val emailDomain = emailDomainFuture.get()
        emailDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val emailDomainFuture = emailDomainServiceAsync.retrieve("domainId")

        val emailDomain = emailDomainFuture.get()
        emailDomain.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val emailDomainsFuture = emailDomainServiceAsync.list()

        val emailDomains = emailDomainsFuture.get()
        emailDomains.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val future = emailDomainServiceAsync.delete("domainId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val responseFuture = emailDomainServiceAsync.verify("domainId")

        val response = responseFuture.get()
        response.validate()
    }
}
