package com.amcharts.impl.event.chart;

import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;

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