package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartEvent;
import com.amcharts.impl.event.AmChartEventJSO;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * 
 * @author sachinsr
 * Fired every time chart is drawn - on zoom, hide graph, etc.
 */
public class DrawEvent extends AmChartEvent<DrawHandler>
{
	public static final String NAME = "draw";

	public static final Type<DrawHandler> TYPE = new Type<DrawHandler>();

	public DrawEvent()
	{
	}

	public DrawEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<DrawHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( DrawHandler handler )
	{
		handler.onDraw( this );
	}

	public static String getName()
	{
		return NAME;
	}

	public static HandlerRegistration addHandler( EventBus eventBus, DrawHandler handler )
	{
		return eventBus.addHandler( TYPE, handler );
	}
}