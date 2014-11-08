package com.amcharts.impl.event.mouse.columnchart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link RollOutItemHandler} instances.
 */
public interface HasRollOutItemHandlers extends HasHandlers
{
	/**
	 * Adds a {@link RollOutItemEvent} handler.
	 * 
	 * @param handler the rollOutItem handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addRollOutItemHandler( RollOutItemHandler handler );
}