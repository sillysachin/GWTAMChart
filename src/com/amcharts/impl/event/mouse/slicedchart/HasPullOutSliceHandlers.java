package com.amcharts.impl.event.mouse.slicedchart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link PullOutSliceHandler} instances.
 */
public interface HasPullOutSliceHandlers extends HasHandlers
{
	/**
	 * Adds a {@link PullOutSliceEvent} handler.
	 * 
	 * @param handler the pullOutSlice handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addPullOutSliceHandler( PullOutSliceHandler handler );
}