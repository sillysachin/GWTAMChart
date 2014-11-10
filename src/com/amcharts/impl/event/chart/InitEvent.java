package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartEvent;
import com.amcharts.impl.event.AmChartEventJSO;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * 
 * @author sachinsr
 * Dispatched when chart is build for the first time.
 */
public class InitEvent extends AmChartEvent<InitHandler>
{
	public static final String NAME = "init";

	public static final Type<InitHandler> TYPE = new Type<InitHandler>();

	public InitEvent()
	{
	}

	public InitEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<InitHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( InitHandler handler )
	{
		handler.onInit( this );
	}

	public static String getName()
	{
		return NAME;
	}

	public static HandlerRegistration addHandler( EventBus eventBus, InitHandler handler )
	{
		return eventBus.addHandler( TYPE, handler );
	}
}