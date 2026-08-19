// File generated from our OpenAPI spec by Stainless.

package com.zavudev.api.client

import com.zavudev.api.core.ClientOptions
import com.zavudev.api.services.async.AddressServiceAsync
import com.zavudev.api.services.async.AgentServiceAsync
import com.zavudev.api.services.async.AgentTemplateServiceAsync
import com.zavudev.api.services.async.BalanceServiceAsync
import com.zavudev.api.services.async.BroadcastServiceAsync
import com.zavudev.api.services.async.CallServiceAsync
import com.zavudev.api.services.async.ContactServiceAsync
import com.zavudev.api.services.async.ConversationServiceAsync
import com.zavudev.api.services.async.EmailDomainServiceAsync
import com.zavudev.api.services.async.FunctionServiceAsync
import com.zavudev.api.services.async.IntrospectServiceAsync
import com.zavudev.api.services.async.InvitationServiceAsync
import com.zavudev.api.services.async.MeServiceAsync
import com.zavudev.api.services.async.MessageServiceAsync
import com.zavudev.api.services.async.Number10dlcServiceAsync
import com.zavudev.api.services.async.PhoneNumberServiceAsync
import com.zavudev.api.services.async.RegulatoryDocumentServiceAsync
import com.zavudev.api.services.async.SenderServiceAsync
import com.zavudev.api.services.async.SubAccountServiceAsync
import com.zavudev.api.services.async.TemplateServiceAsync
import com.zavudev.api.services.async.UrlServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Zavudev REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface ZavudevClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): ZavudevClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ZavudevClientAsync

    fun messages(): MessageServiceAsync

    fun templates(): TemplateServiceAsync

    fun senders(): SenderServiceAsync

    fun contacts(): ContactServiceAsync

    fun broadcasts(): BroadcastServiceAsync

    fun introspect(): IntrospectServiceAsync

    fun phoneNumbers(): PhoneNumberServiceAsync

    fun addresses(): AddressServiceAsync

    fun regulatoryDocuments(): RegulatoryDocumentServiceAsync

    fun invitations(): InvitationServiceAsync

    fun urls(): UrlServiceAsync

    fun balance(): BalanceServiceAsync

    fun subAccounts(): SubAccountServiceAsync

    fun number10dlc(): Number10dlcServiceAsync

    fun me(): MeServiceAsync

    fun functions(): FunctionServiceAsync

    fun conversations(): ConversationServiceAsync

    fun calls(): CallServiceAsync

    fun agentTemplates(): AgentTemplateServiceAsync

    fun emailDomains(): EmailDomainServiceAsync

    fun agents(): AgentServiceAsync

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

    /**
     * A view of [ZavudevClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ZavudevClientAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        fun templates(): TemplateServiceAsync.WithRawResponse

        fun senders(): SenderServiceAsync.WithRawResponse

        fun contacts(): ContactServiceAsync.WithRawResponse

        fun broadcasts(): BroadcastServiceAsync.WithRawResponse

        fun introspect(): IntrospectServiceAsync.WithRawResponse

        fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse

        fun addresses(): AddressServiceAsync.WithRawResponse

        fun regulatoryDocuments(): RegulatoryDocumentServiceAsync.WithRawResponse

        fun invitations(): InvitationServiceAsync.WithRawResponse

        fun urls(): UrlServiceAsync.WithRawResponse

        fun balance(): BalanceServiceAsync.WithRawResponse

        fun subAccounts(): SubAccountServiceAsync.WithRawResponse

        fun number10dlc(): Number10dlcServiceAsync.WithRawResponse

        fun me(): MeServiceAsync.WithRawResponse

        fun functions(): FunctionServiceAsync.WithRawResponse

        fun conversations(): ConversationServiceAsync.WithRawResponse

        fun calls(): CallServiceAsync.WithRawResponse

        fun agentTemplates(): AgentTemplateServiceAsync.WithRawResponse

        fun emailDomains(): EmailDomainServiceAsync.WithRawResponse

        fun agents(): AgentServiceAsync.WithRawResponse
    }
}
