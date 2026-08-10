// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.services.async.number10dlc.BrandServiceAsync
import com.zavudev.api.services.async.number10dlc.BrandServiceAsyncImpl
import com.zavudev.api.services.async.number10dlc.CampaignServiceAsync
import com.zavudev.api.services.async.number10dlc.CampaignServiceAsyncImpl
import java.util.function.Consumer

class Number10dlcServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    Number10dlcServiceAsync {

    private val withRawResponse: Number10dlcServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brands: BrandServiceAsync by lazy { BrandServiceAsyncImpl(clientOptions) }

    private val campaigns: CampaignServiceAsync by lazy { CampaignServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): Number10dlcServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): Number10dlcServiceAsync =
        Number10dlcServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brands(): BrandServiceAsync = brands

    override fun campaigns(): CampaignServiceAsync = campaigns

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        Number10dlcServiceAsync.WithRawResponse {

        private val brands: BrandServiceAsync.WithRawResponse by lazy {
            BrandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaigns: CampaignServiceAsync.WithRawResponse by lazy {
            CampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Number10dlcServiceAsync.WithRawResponse =
            Number10dlcServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brands(): BrandServiceAsync.WithRawResponse = brands

        override fun campaigns(): CampaignServiceAsync.WithRawResponse = campaigns
    }
}
