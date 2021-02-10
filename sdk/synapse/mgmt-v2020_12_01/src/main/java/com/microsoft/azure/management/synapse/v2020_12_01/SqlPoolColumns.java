/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SqlPoolColumnsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlPoolColumns.
 */
public interface SqlPoolColumns extends HasInner<SqlPoolColumnsInner> {
    /**
     * Get Sql pool column.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TableSchemaSqlPoolWorkspaceSqlPoolColumnModel> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName, String columnName);

}
