// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async.contacts

import com.zavudev.api.client.okhttp.ZavudevOkHttpClientAsync
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.contacts.channels.ChannelAddParams
import com.zavudev.api.models.contacts.channels.ChannelRemoveParams
import com.zavudev.api.models.contacts.channels.ChannelSetPrimaryParams
import com.zavudev.api.models.contacts.channels.ChannelUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChannelServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val channelServiceAsync = client.contacts().channels()

        val channelFuture =
            channelServiceAsync.update(
                ChannelUpdateParams.builder()
                    .contactId("contactId")
                    .channelId("channelId")
                    .label("label")
                    .metadata(
                        ChannelUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .verified(true)
                    .build()
            )

        val channel = channelFuture.get()
        channel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val channelServiceAsync = client.contacts().channels()

        val responseFuture =
            channelServiceAsync.add(
                ChannelAddParams.builder()
                    .contactId("contactId")
                    .channel(ChannelAddParams.Channel.EMAIL)
                    .identifier("john.work@company.com")
                    .countryCode("US")
                    .isPrimary(true)
                    .label("work")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val channelServiceAsync = client.contacts().channels()

        val future =
            channelServiceAsync.remove(
                ChannelRemoveParams.builder().contactId("contactId").channelId("channelId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setPrimary() {
        val client = ZavudevOkHttpClientAsync.builder().apiKey("My API Key").build()
        val channelServiceAsync = client.contacts().channels()

        val responseFuture =
            channelServiceAsync.setPrimary(
                ChannelSetPrimaryParams.builder()
                    .contactId("contactId")
                    .channelId("channelId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
