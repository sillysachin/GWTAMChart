package com.amcharts.impl.event.columnchart.valueaxis;

import com.amcharts.impl.event.AmChartEvent;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * 
 * @author sachinsr
 * XY chart only. Dispatched when axis is zoomed.
 */
public class AxisZoomedEvent extends AmChartEvent<AxisZoomedHandler>
{
	public static final String NAME = "axisZoomed";

	public static final Type<AxisZoomedHandler> TYPE = new Type<AxisZoomedHandler>();

	public AxisZoomedEvent()
	{
	}

	@Override
	public final Type<AxisZoomedHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( AxisZoomedHandler handler )
	{
		handler.onAxisZoomed( this );
	}

	public static String getName()
	{
		return NAME;
	}

	/**
	 * Register a handler for AxisZoomedEvent events on the eventbus.
	 * 
	 * @param eventBus the {@link EventBus}
	 * @param handler an {@link AxisZoomedHandler} instance
	 * @return an {@link HandlerRegistration} instance
	 */
	public static HandlerRegistration addHandler( EventBus eventBus, AxisZoomedHandler handler )
	{
		return eventBus.addHandler( TYPE, handler );
	}

	public Object getStartValue()
	{
		return getJso().getStartValue();
	}

	public void setStartValue( Object startValue )
	{
		this.getJso().setStartValue( startValue );
	}

	public Object getEndValue()
	{
		return getJso().getEndValue();
	}

	public void setEndValue( Object endValue )
	{
		this.getJso().setEndValue( endValue );
	}
}