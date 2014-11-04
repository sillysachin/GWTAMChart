package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sachinsr
 * Fired every time chart is drawn - on zoom, hide graph, etc.
 */
public class DrawEvent extends AmChartEvent<DrawHandler>
{
	public static final String NAME = "draw";

	private static final Type<DrawHandler> TYPE = new Type<DrawHandler>();

	public static Type<DrawHandler> getType()
	{
		return TYPE;
	}

	public DrawEvent()
	{
	}

	public DrawEvent( JavaScriptObject amChartEventJSO )
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
}