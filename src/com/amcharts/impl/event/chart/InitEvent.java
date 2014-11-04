package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sachinsr
 * Dispatched when chart is build for the first time.
 */
public class InitEvent extends AmChartEvent<InitHandler>
{
	public static final String NAME = "init";

	private static final Type<InitHandler> TYPE = new Type<InitHandler>();

	public static Type<InitHandler> getType()
	{
		return TYPE;
	}

	public InitEvent()
	{
	}

	public InitEvent( JavaScriptObject amChartEventJSO )
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
}