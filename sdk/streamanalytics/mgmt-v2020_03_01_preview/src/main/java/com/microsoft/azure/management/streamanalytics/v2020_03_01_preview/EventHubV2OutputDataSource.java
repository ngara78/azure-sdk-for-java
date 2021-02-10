/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes an Event Hub output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = EventHubV2OutputDataSource.class)
@JsonTypeName("Microsoft.EventHub/EventHub")
@JsonFlatten
public class EventHubV2OutputDataSource extends OutputDataSource {
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.serviceBusNamespace")
    private String serviceBusNamespace;

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.sharedAccessPolicyName")
    private String sharedAccessPolicyName;

    /**
     * The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.sharedAccessPolicyKey")
    private String sharedAccessPolicyKey;

    /**
     * Authentication Mode. Possible values include: 'Msi', 'UserToken',
     * 'ConnectionString'.
     */
    @JsonProperty(value = "properties.authenticationMode")
    private AuthenticationMode authenticationMode;

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.eventHubName")
    private String eventHubName;

    /**
     * The key/column that is used to determine to which partition to send
     * event data.
     */
    @JsonProperty(value = "properties.partitionKey")
    private String partitionKey;

    /**
     * The propertyColumns property.
     */
    @JsonProperty(value = "properties.propertyColumns")
    private List<String> propertyColumns;

    /**
     * Get the namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @return the serviceBusNamespace value
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @param serviceBusNamespace the serviceBusNamespace value to set
     * @return the EventHubV2OutputDataSource object itself.
     */
    public EventHubV2OutputDataSource withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @return the sharedAccessPolicyName value
     */
    public String sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * Set the shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     *
     * @param sharedAccessPolicyName the sharedAccessPolicyName value to set
     * @return the EventHubV2OutputDataSource object itself.
     */
    public EventHubV2OutputDataSource withSharedAccessPolicyName(String sharedAccessPolicyName) {
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        return this;
    }

    /**
     * Get the shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     *
     * @return the sharedAccessPolicyKey value
     */
    public String sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey;
    }

    /**
     * Set the shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     *
     * @param sharedAccessPolicyKey the sharedAccessPolicyKey value to set
     * @return the EventHubV2OutputDataSource object itself.
     */
    public EventHubV2OutputDataSource withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        return this;
    }

    /**
     * Get authentication Mode. Possible values include: 'Msi', 'UserToken', 'ConnectionString'.
     *
     * @return the authenticationMode value
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set authentication Mode. Possible values include: 'Msi', 'UserToken', 'ConnectionString'.
     *
     * @param authenticationMode the authenticationMode value to set
     * @return the EventHubV2OutputDataSource object itself.
     */
    public EventHubV2OutputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /**
     * Get the name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     *
     * @return the eventHubName value
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     *
     * @param eventHubName the eventHubName value to set
     * @return the EventHubV2OutputDataSource object itself.
     */
    public EventHubV2OutputDataSource withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Get the key/column that is used to determine to which partition to send event data.
     *
     * @return the partitionKey value
     */
    public String partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the key/column that is used to determine to which partition to send event data.
     *
     * @param partitionKey the partitionKey value to set
     * @return the EventHubV2OutputDataSource object itself.
     */
    public EventHubV2OutputDataSource withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get the propertyColumns value.
     *
     * @return the propertyColumns value
     */
    public List<String> propertyColumns() {
        return this.propertyColumns;
    }

    /**
     * Set the propertyColumns value.
     *
     * @param propertyColumns the propertyColumns value to set
     * @return the EventHubV2OutputDataSource object itself.
     */
    public EventHubV2OutputDataSource withPropertyColumns(List<String> propertyColumns) {
        this.propertyColumns = propertyColumns;
        return this;
    }

}
