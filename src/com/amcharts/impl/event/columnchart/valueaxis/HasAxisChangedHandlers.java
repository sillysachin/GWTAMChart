package com.amcharts.impl.event.columnchart.valueaxis;

import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * A widget that implements this interface provides registration for
 * {@link AxisChangedHandler} instances.
 */
public interface HasAxisChangedHandlers extends HasHandlers
{
	/**
	 * Adds a {@link AxisChangedEvent} handler.
	 * 
	 * @param handler the clickItem handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addAxisChangedHandler( AxisChangedHandler handler );
}