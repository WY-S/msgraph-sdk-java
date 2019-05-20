// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICalendarRequest;
import com.microsoft.graph.requests.extensions.CalendarRequest;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.requests.extensions.ICalendarGetScheduleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGetScheduleCollectionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Request Builder.
 */
public class CalendarRequestBuilder extends BaseRequestBuilder implements ICalendarRequestBuilder {

    /**
     * The request builder for the Calendar
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ICalendarRequest instance
     */
    public ICalendarRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICalendarRequest instance
     */
    public ICalendarRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new CalendarRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEventCollectionRequestBuilder events() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    public IEventRequestBuilder events(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }
    public IEventCollectionRequestBuilder calendarView() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView"), getClient(), null);
    }

    public IEventRequestBuilder calendarView(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView") + "/" + id, getClient(), null);
    }
    public ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    public ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }
    public IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    public IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }

    public ICalendarGetScheduleCollectionRequestBuilder getSchedule(final java.util.List<String> schedules, final DateTimeTimeZone endTime, final DateTimeTimeZone startTime, final Integer availabilityViewInterval) {
        return new CalendarGetScheduleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSchedule"), getClient(), null, schedules, endTime, startTime, availabilityViewInterval);
    }
}

