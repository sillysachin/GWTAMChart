package com.amcharts.impl.event.mouse.slicedchart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link RollOutSliceHandler} instances.
 */
public interface HasRollOutSliceHandlers extends HasHandlers
{
	/**
	 * Adds a {@link RollOutSliceEvent} handler.
	 * 
	 * @param handler the rollOutSlice handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addRollOutSliceHandler( RollOutSliceHandler handler );
}