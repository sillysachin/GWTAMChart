package com.amcharts.impl.event.chart;

import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;


/**
 * A widget that implements this interface provides registration for
 * {@link DataUpdatedHandler} instances.
 */
public interface HasDataUpdatedHandlers extends HasHandlers
{
	/**
	 * Adds a {@link DataUpdatedEvent} handler.
	 * 
	 * @param handler the dataUpdated handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addDataUpdatedHandler( DataUpdatedHandler handler );
}