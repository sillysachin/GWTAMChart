package com.amcharts.impl.event.mouse.columnchart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link ClickItemHandler} instances.
 */
public interface HasClickItemHandlers extends HasHandlers
{
	/**
	 * Adds a {@link ClickItemEvent} handler.
	 * 
	 * @param handler the clickItem handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addClickItemHandler( ClickItemHandler handler );
}