package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartEvent;
import com.amcharts.impl.event.AmChartEventJSO;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * 
 * @author sachinsr
 * Dispatched when the chart is build for the first time and each time after chart.validateNow() method is called and the chart is build.
 */
public class RenderedEvent extends AmChartEvent<RenderedHandler>
{
	public static final String NAME = "rendered";

	private static final Type<RenderedHandler> TYPE = new Type<RenderedHandler>();

	public static Type<RenderedHandler> getType()
	{
		return TYPE;
	}

	public RenderedEvent()
	{
	}

	public RenderedEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<RenderedHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( RenderedHandler handler )
	{
		handler.onRendered( this );
	}

	public static String getName()
	{
		return NAME;
	}

	public static HandlerRegistration addHandler( EventBus eventBus, RenderedHandler handler )
	{
		return eventBus.addHandler( TYPE, handler );
	}
}