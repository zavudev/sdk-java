// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.contacts.ContactCreateParams
import com.zavudev.api.models.contacts.ContactMergeParams
import com.zavudev.api.models.contacts.ContactUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contact =
            contactService.create(
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

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contact = contactService.retrieve("contactId")

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contact =
            contactService.update(
                ContactUpdateParams.builder()
                    .contactId("contactId")
                    .defaultChannel(ContactUpdateParams.DefaultChannel.SMS)
                    .metadata(
                        ContactUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val page = contactService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        contactService.delete("contactId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun dismissMergeSuggestion() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        contactService.dismissMergeSuggestion("contactId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun merge() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contact =
            contactService.merge(
                ContactMergeParams.builder()
                    .contactId("contactId")
                    .sourceContactId("jx7xyz789")
                    .build()
            )

        contact.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByPhone() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val contactService = client.contacts()

        val contact = contactService.retrieveByPhone("phoneNumber")

        contact.validate()
    }
}
