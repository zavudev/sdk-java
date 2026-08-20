// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.models.contacts

import com.zavudev.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = ContactUpdateParams.builder().contactId("contactId").build()

        assertThat(params._pathParam(0)).isEqualTo("contactId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.defaultChannel()).contains(ContactUpdateParams.DefaultChannel.SMS)
        assertThat(body.displayName()).contains("John Doe")
        assertThat(body.metadata())
            .contains(
                ContactUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ContactUpdateParams.builder().contactId("contactId").build()

        val body = params._body()
    }
}
