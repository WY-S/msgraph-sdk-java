// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IUserExportPersonalDataRequest;
import com.microsoft.graph.requests.extensions.UserExportPersonalDataRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Export Personal Data Request Builder.
 */
public class BaseUserExportPersonalDataRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserExportPersonalData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param storageLocation the storageLocation
     */
    public BaseUserExportPersonalDataRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String storageLocation) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("storageLocation", storageLocation);
    }

    /**
     * Creates the IUserExportPersonalDataRequest
     *
     * @return the IUserExportPersonalDataRequest instance
     */
    public IUserExportPersonalDataRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserExportPersonalDataRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserExportPersonalDataRequest instance
     */
    public IUserExportPersonalDataRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserExportPersonalDataRequest request = new UserExportPersonalDataRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("storageLocation")) {
            request.body.storageLocation = getParameter("storageLocation");
        }

        return request;
    }
}
