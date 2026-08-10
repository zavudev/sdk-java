// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.services.blocking.number10dlc.BrandService
import com.zavudev.api.services.blocking.number10dlc.BrandServiceImpl
import com.zavudev.api.services.blocking.number10dlc.CampaignService
import com.zavudev.api.services.blocking.number10dlc.CampaignServiceImpl
import java.util.function.Consumer

class Number10dlcServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    Number10dlcService {

    private val withRawResponse: Number10dlcService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val brands: BrandService by lazy { BrandServiceImpl(clientOptions) }

    private val campaigns: CampaignService by lazy { CampaignServiceImpl(clientOptions) }

    override fun withRawResponse(): Number10dlcService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): Number10dlcService =
        Number10dlcServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun brands(): BrandService = brands

    override fun campaigns(): CampaignService = campaigns

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        Number10dlcService.WithRawResponse {

        private val brands: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val campaigns: CampaignService.WithRawResponse by lazy {
            CampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Number10dlcService.WithRawResponse =
            Number10dlcServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun brands(): BrandService.WithRawResponse = brands

        override fun campaigns(): CampaignService.WithRawResponse = campaigns
    }
}
