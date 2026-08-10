// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.blocking

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.services.blocking.number10dlc.BrandService
import com.zavudev.api.services.blocking.number10dlc.CampaignService
import java.util.function.Consumer

interface Number10dlcService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): Number10dlcService

    fun brands(): BrandService

    fun campaigns(): CampaignService

    /**
     * A view of [Number10dlcService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Number10dlcService.WithRawResponse

        fun brands(): BrandService.WithRawResponse

        fun campaigns(): CampaignService.WithRawResponse
    }
}
