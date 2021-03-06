/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON-serialized array of Certificate objects.
 */
public class CertificateListDescriptionInner {
    /**
     * The array of Certificate objects.
     */
    @JsonProperty(value = "value")
    private List<CertificateDescriptionInner> value;

    /**
     * Get the array of Certificate objects.
     *
     * @return the value value
     */
    public List<CertificateDescriptionInner> value() {
        return this.value;
    }

    /**
     * Set the array of Certificate objects.
     *
     * @param value the value value to set
     * @return the CertificateListDescriptionInner object itself.
     */
    public CertificateListDescriptionInner withValue(List<CertificateDescriptionInner> value) {
        this.value = value;
        return this;
    }

}
