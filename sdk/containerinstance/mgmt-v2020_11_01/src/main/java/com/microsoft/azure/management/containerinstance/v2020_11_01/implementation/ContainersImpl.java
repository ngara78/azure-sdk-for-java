/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerinstance.v2020_11_01.Containers;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.containerinstance.v2020_11_01.Logs;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ContainerExecResponse;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ContainerAttachResponse;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ContainerExecRequest;

class ContainersImpl extends WrapperImpl<ContainersInner> implements Containers {
    private final ContainerInstanceManager manager;

    ContainersImpl(ContainerInstanceManager manager) {
        super(manager.inner().containers());
        this.manager = manager;
    }

    public ContainerInstanceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Logs> listLogsAsync(String resourceGroupName, String containerGroupName, String containerName) {
        ContainersInner client = this.inner();
        return client.listLogsAsync(resourceGroupName, containerGroupName, containerName)
        .map(new Func1<LogsInner, Logs>() {
            @Override
            public Logs call(LogsInner inner) {
                return new LogsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ContainerExecResponse> executeCommandAsync(String resourceGroupName, String containerGroupName, String containerName, ContainerExecRequest containerExecRequest) {
        ContainersInner client = this.inner();
        return client.executeCommandAsync(resourceGroupName, containerGroupName, containerName, containerExecRequest)
        .map(new Func1<ContainerExecResponseInner, ContainerExecResponse>() {
            @Override
            public ContainerExecResponse call(ContainerExecResponseInner inner) {
                return new ContainerExecResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ContainerAttachResponse> attachAsync(String resourceGroupName, String containerGroupName, String containerName) {
        ContainersInner client = this.inner();
        return client.attachAsync(resourceGroupName, containerGroupName, containerName)
        .map(new Func1<ContainerAttachResponseInner, ContainerAttachResponse>() {
            @Override
            public ContainerAttachResponse call(ContainerAttachResponseInner inner) {
                return new ContainerAttachResponseImpl(inner, manager());
            }
        });
    }

}
