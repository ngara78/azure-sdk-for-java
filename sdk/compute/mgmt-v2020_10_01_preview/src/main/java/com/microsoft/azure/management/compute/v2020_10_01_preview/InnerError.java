/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Inner error details.
 */
public class InnerError {
    /**
     * The exception type.
     */
    @JsonProperty(value = "exceptiontype")
    private String exceptiontype;

    /**
     * The internal error message or exception dump.
     */
    @JsonProperty(value = "errordetail")
    private String errordetail;

    /**
     * Get the exception type.
     *
     * @return the exceptiontype value
     */
    public String exceptiontype() {
        return this.exceptiontype;
    }

    /**
     * Set the exception type.
     *
     * @param exceptiontype the exceptiontype value to set
     * @return the InnerError object itself.
     */
    public InnerError withExceptiontype(String exceptiontype) {
        this.exceptiontype = exceptiontype;
        return this;
    }

    /**
     * Get the internal error message or exception dump.
     *
     * @return the errordetail value
     */
    public String errordetail() {
        return this.errordetail;
    }

    /**
     * Set the internal error message or exception dump.
     *
     * @param errordetail the errordetail value to set
     * @return the InnerError object itself.
     */
    public InnerError withErrordetail(String errordetail) {
        this.errordetail = errordetail;
        return this;
    }

}
