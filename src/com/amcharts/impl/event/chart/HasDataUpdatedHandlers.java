package com.amcharts.impl.event.chart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

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