package com.amcharts.impl.event.mouse.slicedchart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link RightClickSliceHandler} instances.
 */
public interface HasRightClickSliceHandlers extends HasHandlers
{
	/**
	 * Adds a {@link RightClickSliceEvent} handler.
	 * 
	 * @param handler the rightClickSlice handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addRightClickSliceHandler( RightClickSliceHandler handler );
}