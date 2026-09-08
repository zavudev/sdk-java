// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.contacts.ContactCreateParams
import com.zavudev.api.models.contacts.ContactMergeParams
import com.zavudev.api.models.contacts.ContactUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactFuture =
            contactServiceAsync.create(
                ContactCreateParams.builder()
                    .addChannel(
                        ContactCreateParams.Channel.builder()
                            .channel(ContactCreateParams.Channel.InnerChannel.SMS)
                            .identifier("+14155551234")
                            .countryCode("US")
                            .isPrimary(true)
                            .label("work")
                            .build()
                    )
                    .displayName("John Doe")
                    .metadata(
                        ContactCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactFuture = contactServiceAsync.retrieve("contactId")

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactFuture =
            contactServiceAsync.update(
                ContactUpdateParams.builder()
                    .contactId("contactId")
                    .defaultChannel(ContactUpdateParams.DefaultChannel.SMS)
                    .displayName("John Doe")
                    .metadata(
                        ContactUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val pageFuture = contactServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val future = contactServiceAsync.delete("contactId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun merge() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactFuture =
            contactServiceAsync.merge(
                ContactMergeParams.builder()
                    .contactId("contactId")
                    .sourceContactId("jx7xyz789")
                    .build()
            )

        val contact = contactFuture.get()
        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByPhone() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contactServiceAsync = client.contacts()

        val contactFuture = contactServiceAsync.retrieveByPhone("phoneNumber")

        val contact = contactFuture.get()
        contact.validate()
    }
}
