package com.amcharts.impl.event.mouse.piechart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link RollOverSliceHandler} instances.
 */
public interface HasRollOverSliceHandlers extends HasHandlers
{
	/**
	 * Adds a {@link RollOverSliceEvent} handler.
	 * 
	 * @param handler the rollOverSlice handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addRollOverSliceHandler( RollOverSliceHandler handler );
}