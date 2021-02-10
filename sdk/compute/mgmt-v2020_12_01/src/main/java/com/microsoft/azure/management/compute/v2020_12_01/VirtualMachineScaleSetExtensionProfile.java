/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.VirtualMachineScaleSetExtensionInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machine scale set extension profile.
 */
public class VirtualMachineScaleSetExtensionProfile {
    /**
     * The virtual machine scale set child extension resources.
     */
    @JsonProperty(value = "extensions")
    private List<VirtualMachineScaleSetExtensionInner> extensions;

    /**
     * Specifies the time alloted for all extensions to start. The time
     * duration should be between 15 minutes and 120 minutes (inclusive) and
     * should be specified in ISO 8601 format. The default value is 90 minutes
     * (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     */
    @JsonProperty(value = "extensionsTimeBudget")
    private String extensionsTimeBudget;

    /**
     * Get the virtual machine scale set child extension resources.
     *
     * @return the extensions value
     */
    public List<VirtualMachineScaleSetExtensionInner> extensions() {
        return this.extensions;
    }

    /**
     * Set the virtual machine scale set child extension resources.
     *
     * @param extensions the extensions value to set
     * @return the VirtualMachineScaleSetExtensionProfile object itself.
     */
    public VirtualMachineScaleSetExtensionProfile withExtensions(List<VirtualMachineScaleSetExtensionInner> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @return the extensionsTimeBudget value
     */
    public String extensionsTimeBudget() {
        return this.extensionsTimeBudget;
    }

    /**
     * Set specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @param extensionsTimeBudget the extensionsTimeBudget value to set
     * @return the VirtualMachineScaleSetExtensionProfile object itself.
     */
    public VirtualMachineScaleSetExtensionProfile withExtensionsTimeBudget(String extensionsTimeBudget) {
        this.extensionsTimeBudget = extensionsTimeBudget;
        return this;
    }

}
