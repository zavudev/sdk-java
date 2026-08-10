// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking.contacts

import com.zavudev.api.client.okhttp.ZavudevOkHttpClient
import com.zavudev.api.core.JsonValue
import com.zavudev.api.models.contacts.channels.ChannelAddParams
import com.zavudev.api.models.contacts.channels.ChannelRemoveParams
import com.zavudev.api.models.contacts.channels.ChannelSetPrimaryParams
import com.zavudev.api.models.contacts.channels.ChannelUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChannelServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val channelService = client.contacts().channels()

        val channel =
            channelService.update(
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

        channel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val channelService = client.contacts().channels()

        val response =
            channelService.add(
                ChannelAddParams.builder()
                    .contactId("contactId")
                    .channel(ChannelAddParams.Channel.EMAIL)
                    .identifier("john.work@company.com")
                    .countryCode("US")
                    .isPrimary(true)
                    .label("work")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val channelService = client.contacts().channels()

        channelService.remove(
            ChannelRemoveParams.builder().contactId("contactId").channelId("channelId").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setPrimary() {
        val client = ZavudevOkHttpClient.builder().apiKey("My API Key").build()
        val channelService = client.contacts().channels()

        val response =
            channelService.setPrimary(
                ChannelSetPrimaryParams.builder()
                    .contactId("contactId")
                    .channelId("channelId")
                    .build()
            )

        response.validate()
    }
}
