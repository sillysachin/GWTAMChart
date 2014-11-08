package com.amcharts.impl.event.columnchart.valueaxis;

import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * A widget that implements this interface provides registration for
 * {@link AxisZoomedHandler} instances.
 */
public interface HasAxisZoomedHandlers extends HasHandlers
{
	/**
	 * Adds a {@link AxisZoomedEvent} handler.
	 * 
	 * @param handler the rollOutItem handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addAxisZoomedHandler( AxisZoomedHandler handler );
}