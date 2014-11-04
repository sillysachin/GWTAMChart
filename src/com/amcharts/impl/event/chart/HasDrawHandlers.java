package com.amcharts.impl.event.chart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link DrawHandler} instances.
 */
public interface HasDrawHandlers extends HasHandlers
{
	/**
	 * Adds a {@link DrawEvent} handler.
	 * 
	 * @param handler the draw handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addDrawHandler( DrawHandler handler );
}