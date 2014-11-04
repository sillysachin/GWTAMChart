package com.amcharts.impl.event.chart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link InitHandler} instances.
 */
public interface HasInitHandlers extends HasHandlers
{
	/**
	 * Adds a {@link InitEvent} handler.
	 * 
	 * @param handler the init handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addInitHandler( InitHandler handler );
}