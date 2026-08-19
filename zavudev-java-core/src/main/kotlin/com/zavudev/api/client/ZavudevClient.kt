// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.client

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.services.blocking.AddressService
import com.zavudev.api.services.blocking.AgentService
import com.zavudev.api.services.blocking.AgentTemplateService
import com.zavudev.api.services.blocking.BalanceService
import com.zavudev.api.services.blocking.BroadcastService
import com.zavudev.api.services.blocking.CallService
import com.zavudev.api.services.blocking.ContactService
import com.zavudev.api.services.blocking.ConversationService
import com.zavudev.api.services.blocking.EmailDomainService
import com.zavudev.api.services.blocking.FunctionService
import com.zavudev.api.services.blocking.IntrospectService
import com.zavudev.api.services.blocking.InvitationService
import com.zavudev.api.services.blocking.MeService
import com.zavudev.api.services.blocking.MessageService
import com.zavudev.api.services.blocking.Number10dlcService
import com.zavudev.api.services.blocking.PhoneNumberService
import com.zavudev.api.services.blocking.RegulatoryDocumentService
import com.zavudev.api.services.blocking.SenderService
import com.zavudev.api.services.blocking.SubAccountService
import com.zavudev.api.services.blocking.TemplateService
import com.zavudev.api.services.blocking.UrlService
import java.util.function.Consumer

/**
 * A client for interacting with the Zavudev REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface ZavudevClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): ZavudevClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ZavudevClient

    fun messages(): MessageService

    fun templates(): TemplateService

    fun senders(): SenderService

    fun contacts(): ContactService

    fun broadcasts(): BroadcastService

    fun introspect(): IntrospectService

    fun phoneNumbers(): PhoneNumberService

    fun addresses(): AddressService

    fun regulatoryDocuments(): RegulatoryDocumentService

    fun invitations(): InvitationService

    fun urls(): UrlService

    fun balance(): BalanceService

    fun subAccounts(): SubAccountService

    fun number10dlc(): Number10dlcService

    fun me(): MeService

    fun functions(): FunctionService

    fun conversations(): ConversationService

    fun calls(): CallService

    fun agentTemplates(): AgentTemplateService

    fun emailDomains(): EmailDomainService

    fun agents(): AgentService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [ZavudevClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ZavudevClient.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        fun templates(): TemplateService.WithRawResponse

        fun senders(): SenderService.WithRawResponse

        fun contacts(): ContactService.WithRawResponse

        fun broadcasts(): BroadcastService.WithRawResponse

        fun introspect(): IntrospectService.WithRawResponse

        fun phoneNumbers(): PhoneNumberService.WithRawResponse

        fun addresses(): AddressService.WithRawResponse

        fun regulatoryDocuments(): RegulatoryDocumentService.WithRawResponse

        fun invitations(): InvitationService.WithRawResponse

        fun urls(): UrlService.WithRawResponse

        fun balance(): BalanceService.WithRawResponse

        fun subAccounts(): SubAccountService.WithRawResponse

        fun number10dlc(): Number10dlcService.WithRawResponse

        fun me(): MeService.WithRawResponse

        fun functions(): FunctionService.WithRawResponse

        fun conversations(): ConversationService.WithRawResponse

        fun calls(): CallService.WithRawResponse

        fun agentTemplates(): AgentTemplateService.WithRawResponse

        fun emailDomains(): EmailDomainService.WithRawResponse

        fun agents(): AgentService.WithRawResponse
    }
}
