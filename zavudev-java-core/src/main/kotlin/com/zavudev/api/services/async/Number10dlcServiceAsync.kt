// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.services.async

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.services.async.number10dlc.BrandServiceAsync
import com.zavudev.api.services.async.number10dlc.CampaignServiceAsync
import java.util.function.Consumer

interface Number10dlcServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): Number10dlcServiceAsync

    fun brands(): BrandServiceAsync

    fun campaigns(): CampaignServiceAsync

    /**
     * A view of [Number10dlcServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): Number10dlcServiceAsync.WithRawResponse

        fun brands(): BrandServiceAsync.WithRawResponse

        fun campaigns(): CampaignServiceAsync.WithRawResponse
    }
}
