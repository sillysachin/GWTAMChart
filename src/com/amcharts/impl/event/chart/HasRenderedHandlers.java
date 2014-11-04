package com.amcharts.impl.event.chart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link RenderedHandler} instances.
 */
public interface HasRenderedHandlers extends HasHandlers
{
	/**
	 * Adds a {@link RenderedEvent} handler.
	 * 
	 * @param handler the rendered handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addRenderedHandler( RenderedHandler handler );
}