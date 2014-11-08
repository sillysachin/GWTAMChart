package com.amcharts.impl.event.mouse.columnchart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link RollOverItemHandler} instances.
 */
public interface HasRollOverItemHandlers extends HasHandlers
{
	/**
	 * Adds a {@link RollOverItemEvent} handler.
	 * 
	 * @param handler the rollOverItem handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addRollOverItemHandler( RollOverItemHandler handler );
}