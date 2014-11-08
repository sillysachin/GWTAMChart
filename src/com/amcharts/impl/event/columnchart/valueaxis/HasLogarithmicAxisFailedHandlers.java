package com.amcharts.impl.event.columnchart.valueaxis;

import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * A widget that implements this interface provides registration for
 * {@link LogarithmicAxisFailedHandler} instances.
 */
public interface HasLogarithmicAxisFailedHandlers extends HasHandlers
{
	/**
	 * Adds a {@link LogarithmicAxisFailedEvent} handler.
	 * 
	 * @param handler the rollOverItem handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addLogarithmicAxisFailedHandler( LogarithmicAxisFailedHandler handler );
}