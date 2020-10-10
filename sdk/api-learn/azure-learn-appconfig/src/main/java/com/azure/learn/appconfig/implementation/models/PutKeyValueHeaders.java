// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.learn.appconfig.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PutKeyValueHeaders model. */
@Fluent
public final class PutKeyValueHeaders {
    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The Sync-Token property.
     */
    @JsonProperty(value = "Sync-Token")
    private String syncToken;

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the PutKeyValueHeaders object itself.
     */
    public PutKeyValueHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

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
     * @return the PutKeyValueHeaders object itself.
     */
    public PutKeyValueHeaders setSyncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
}
