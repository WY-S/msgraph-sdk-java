// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site With Reference Request.
 */
public class SiteWithReferenceRequest extends BaseRequest implements ISiteWithReferenceRequest {

    /**
     * The request for the Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Site.class);
    }

    public void post(final Site newSite, final IJsonBackedObject payload, final ICallback<Site> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public Site post(final Site newSite, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newSite;
        }
        return null;
    }

    public void get(final ICallback<Site> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Site get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<Site> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final Site sourceSite, final ICallback<Site> callback) {
		send(HttpMethod.PATCH, callback, sourceSite);
	}

	public Site patch(final Site sourceSite) throws ClientException {
		return send(HttpMethod.PATCH, sourceSite);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISiteWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ISiteWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISiteWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (SiteWithReferenceRequest)this;
    }
}
