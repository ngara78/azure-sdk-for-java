/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ScriptActions.
 */
public class ScriptActionsInner {
    /** The Retrofit service to perform REST calls. */
    private ScriptActionsService service;
    /** The service client containing this operation class. */
    private HDInsightManagementClientImpl client;

    /**
     * Initializes an instance of ScriptActionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ScriptActionsInner(Retrofit retrofit, HDInsightManagementClientImpl client) {
        this.service = retrofit.create(ScriptActionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ScriptActions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ScriptActionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ScriptActions delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters/{clusterName}/scriptActions/{scriptName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("clusterName") String clusterName, @Path("scriptName") String scriptName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ScriptActions listByCluster" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters/{clusterName}/scriptActions")
        Observable<Response<ResponseBody>> listByCluster(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("clusterName") String clusterName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ScriptActions getExecutionDetail" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters/{clusterName}/scriptExecutionHistory/{scriptExecutionId}")
        Observable<Response<ResponseBody>> getExecutionDetail(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("clusterName") String clusterName, @Path("scriptExecutionId") String scriptExecutionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ScriptActions listByClusterNext" })
        @GET
        Observable<Response<ResponseBody>> listByClusterNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Deletes a specified persisted script action of the cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptName The name of the script.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String clusterName, String scriptName) {
        deleteWithServiceResponseAsync(resourceGroupName, clusterName, scriptName).toBlocking().single().body();
    }

    /**
     * Deletes a specified persisted script action of the cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptName The name of the script.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String clusterName, String scriptName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, clusterName, scriptName), serviceCallback);
    }

    /**
     * Deletes a specified persisted script action of the cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptName The name of the script.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String clusterName, String scriptName) {
        return deleteWithServiceResponseAsync(resourceGroupName, clusterName, scriptName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a specified persisted script action of the cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptName The name of the script.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String clusterName, String scriptName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (clusterName == null) {
            throw new IllegalArgumentException("Parameter clusterName is required and cannot be null.");
        }
        if (scriptName == null) {
            throw new IllegalArgumentException("Parameter scriptName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, clusterName, scriptName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RuntimeScriptActionDetailInner&gt; object if successful.
     */
    public PagedList<RuntimeScriptActionDetailInner> listByCluster(final String resourceGroupName, final String clusterName) {
        ServiceResponse<Page<RuntimeScriptActionDetailInner>> response = listByClusterSinglePageAsync(resourceGroupName, clusterName).toBlocking().single();
        return new PagedList<RuntimeScriptActionDetailInner>(response.body()) {
            @Override
            public Page<RuntimeScriptActionDetailInner> nextPage(String nextPageLink) {
                return listByClusterNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RuntimeScriptActionDetailInner>> listByClusterAsync(final String resourceGroupName, final String clusterName, final ListOperationCallback<RuntimeScriptActionDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByClusterSinglePageAsync(resourceGroupName, clusterName),
            new Func1<String, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(String nextPageLink) {
                    return listByClusterNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RuntimeScriptActionDetailInner&gt; object
     */
    public Observable<Page<RuntimeScriptActionDetailInner>> listByClusterAsync(final String resourceGroupName, final String clusterName) {
        return listByClusterWithServiceResponseAsync(resourceGroupName, clusterName)
            .map(new Func1<ServiceResponse<Page<RuntimeScriptActionDetailInner>>, Page<RuntimeScriptActionDetailInner>>() {
                @Override
                public Page<RuntimeScriptActionDetailInner> call(ServiceResponse<Page<RuntimeScriptActionDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RuntimeScriptActionDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> listByClusterWithServiceResponseAsync(final String resourceGroupName, final String clusterName) {
        return listByClusterSinglePageAsync(resourceGroupName, clusterName)
            .concatMap(new Func1<ServiceResponse<Page<RuntimeScriptActionDetailInner>>, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(ServiceResponse<Page<RuntimeScriptActionDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByClusterNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
    ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RuntimeScriptActionDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> listByClusterSinglePageAsync(final String resourceGroupName, final String clusterName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (clusterName == null) {
            throw new IllegalArgumentException("Parameter clusterName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByCluster(this.client.subscriptionId(), resourceGroupName, clusterName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> result = listByClusterDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RuntimeScriptActionDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> listByClusterDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RuntimeScriptActionDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RuntimeScriptActionDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the script execution detail for the given script execution ID.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RuntimeScriptActionDetailInner object if successful.
     */
    public RuntimeScriptActionDetailInner getExecutionDetail(String resourceGroupName, String clusterName, String scriptExecutionId) {
        return getExecutionDetailWithServiceResponseAsync(resourceGroupName, clusterName, scriptExecutionId).toBlocking().single().body();
    }

    /**
     * Gets the script execution detail for the given script execution ID.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RuntimeScriptActionDetailInner> getExecutionDetailAsync(String resourceGroupName, String clusterName, String scriptExecutionId, final ServiceCallback<RuntimeScriptActionDetailInner> serviceCallback) {
        return ServiceFuture.fromResponse(getExecutionDetailWithServiceResponseAsync(resourceGroupName, clusterName, scriptExecutionId), serviceCallback);
    }

    /**
     * Gets the script execution detail for the given script execution ID.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuntimeScriptActionDetailInner object
     */
    public Observable<RuntimeScriptActionDetailInner> getExecutionDetailAsync(String resourceGroupName, String clusterName, String scriptExecutionId) {
        return getExecutionDetailWithServiceResponseAsync(resourceGroupName, clusterName, scriptExecutionId).map(new Func1<ServiceResponse<RuntimeScriptActionDetailInner>, RuntimeScriptActionDetailInner>() {
            @Override
            public RuntimeScriptActionDetailInner call(ServiceResponse<RuntimeScriptActionDetailInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the script execution detail for the given script execution ID.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuntimeScriptActionDetailInner object
     */
    public Observable<ServiceResponse<RuntimeScriptActionDetailInner>> getExecutionDetailWithServiceResponseAsync(String resourceGroupName, String clusterName, String scriptExecutionId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (clusterName == null) {
            throw new IllegalArgumentException("Parameter clusterName is required and cannot be null.");
        }
        if (scriptExecutionId == null) {
            throw new IllegalArgumentException("Parameter scriptExecutionId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getExecutionDetail(this.client.subscriptionId(), resourceGroupName, clusterName, scriptExecutionId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RuntimeScriptActionDetailInner>>>() {
                @Override
                public Observable<ServiceResponse<RuntimeScriptActionDetailInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RuntimeScriptActionDetailInner> clientResponse = getExecutionDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RuntimeScriptActionDetailInner> getExecutionDetailDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RuntimeScriptActionDetailInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RuntimeScriptActionDetailInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RuntimeScriptActionDetailInner&gt; object if successful.
     */
    public PagedList<RuntimeScriptActionDetailInner> listByClusterNext(final String nextPageLink) {
        ServiceResponse<Page<RuntimeScriptActionDetailInner>> response = listByClusterNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RuntimeScriptActionDetailInner>(response.body()) {
            @Override
            public Page<RuntimeScriptActionDetailInner> nextPage(String nextPageLink) {
                return listByClusterNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RuntimeScriptActionDetailInner>> listByClusterNextAsync(final String nextPageLink, final ServiceFuture<List<RuntimeScriptActionDetailInner>> serviceFuture, final ListOperationCallback<RuntimeScriptActionDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByClusterNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(String nextPageLink) {
                    return listByClusterNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RuntimeScriptActionDetailInner&gt; object
     */
    public Observable<Page<RuntimeScriptActionDetailInner>> listByClusterNextAsync(final String nextPageLink) {
        return listByClusterNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RuntimeScriptActionDetailInner>>, Page<RuntimeScriptActionDetailInner>>() {
                @Override
                public Page<RuntimeScriptActionDetailInner> call(ServiceResponse<Page<RuntimeScriptActionDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RuntimeScriptActionDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> listByClusterNextWithServiceResponseAsync(final String nextPageLink) {
        return listByClusterNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RuntimeScriptActionDetailInner>>, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(ServiceResponse<Page<RuntimeScriptActionDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByClusterNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all the persisted script actions for the specified cluster.
     *
    ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RuntimeScriptActionDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> listByClusterNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByClusterNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> result = listByClusterNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RuntimeScriptActionDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> listByClusterNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RuntimeScriptActionDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RuntimeScriptActionDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
