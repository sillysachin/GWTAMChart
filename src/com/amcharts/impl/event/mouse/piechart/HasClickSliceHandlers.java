package com.amcharts.impl.event.mouse.piechart;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A widget that implements this interface provides registration for
 * {@link ClickSliceHandler} instances.
 */
public interface HasClickSliceHandlers extends HasHandlers
{
	/**
	 * Adds a {@link ClickSliceEvent} handler.
	 * 
	 * @param handler the clickSlice handler
	 * @return {@link HandlerRegistration} used to remove this handler
	 */
	HandlerRegistration addClickSliceHandler( ClickSliceHandler handler );
}