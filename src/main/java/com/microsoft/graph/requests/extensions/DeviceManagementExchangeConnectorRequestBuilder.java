// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorRequest;
import com.microsoft.graph.models.generated.DeviceManagementExchangeConnectorSyncType;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorSyncRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorSyncRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange Connector Request Builder.
 */
public class DeviceManagementExchangeConnectorRequestBuilder extends BaseRequestBuilder implements IDeviceManagementExchangeConnectorRequestBuilder {

    /**
     * The request builder for the DeviceManagementExchangeConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementExchangeConnectorRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceManagementExchangeConnectorRequest instance
     */
    public IDeviceManagementExchangeConnectorRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementExchangeConnectorRequest instance
     */
    public IDeviceManagementExchangeConnectorRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceManagementExchangeConnectorRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IDeviceManagementExchangeConnectorSyncRequestBuilder sync(final DeviceManagementExchangeConnectorSyncType syncType) {
        return new DeviceManagementExchangeConnectorSyncRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sync"), getClient(), null, syncType);
    }
}

