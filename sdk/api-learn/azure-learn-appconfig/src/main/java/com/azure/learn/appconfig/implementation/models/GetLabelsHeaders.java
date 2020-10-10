// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.learn.appconfig.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GetLabelsHeaders model. */
@Fluent
public final class GetLabelsHeaders {
    /*
     * The Sync-Token property.
     */
    @JsonProperty(value = "Sync-Token")
    private String syncToken;

    /**
     * Get the syncToken property: The Sync-Token property.
     *
     * @return the syncToken value.
     */
    public String getSyncToken() {
        return this.syncToken;
    }

    /**
     * Set the syncToken property: The Sync-Token property.
     *
     * @param syncToken the syncToken value to set.
     * @return the GetLabelsHeaders object itself.
     */
    public GetLabelsHeaders setSyncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
}
