package com.amcharts.impl.event.mouse.piechart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link PullInSliceHandler} instances.
 */
public interface HasPullInSliceHandlers extends HasHandlers
{
	/**
	 * Adds a {@link PullInSliceEvent} handler.
	 * 
	 * @param handler the pullInSlice handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addPullInSliceHandler( PullInSliceHandler handler );
}