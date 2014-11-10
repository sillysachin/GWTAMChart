package com.amcharts.impl.event.columnchart.valueaxis;

import com.amcharts.impl.event.AmChartEvent;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * 
 * @author sachinsr
 * Dispatched when value axis min/max values are changed.
 */
public class AxisChangedEvent extends AmChartEvent<AxisChangedHandler>
{
	public static final String NAME = "axisChanged";

	public static final Type<AxisChangedHandler> TYPE = new Type<AxisChangedHandler>();

	public AxisChangedEvent()
	{
	}

	@Override
	public final Type<AxisChangedHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( AxisChangedHandler handler )
	{
		handler.onAxisChanged( this );
	}

	public static String getName()
	{
		return NAME;
	}

	/**
	 * Register a handler for AxisChangedEvent events on the eventbus.
	 * 
	 * @param eventBus the {@link EventBus}
	 * @param handler an {@link AxisChangedHandler} instance
	 * @return an {@link HandlerRegistration} instance
	 */
	public static HandlerRegistration addHandler( EventBus eventBus, AxisChangedHandler handler )
	{
		return eventBus.addHandler( TYPE, handler );
	}
}