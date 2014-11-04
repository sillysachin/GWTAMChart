package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * @author sachinsr
 * Dispatched when chart is build for the first time or after validateData() method was called.
 */
public class DataUpdatedEvent extends AmChartEvent<DataUpdatedHandler>
{
	public static final String NAME = "dataUpdated";

	private static final Type<DataUpdatedHandler> TYPE = new Type<DataUpdatedHandler>();

	public static Type<DataUpdatedHandler> getType()
	{
		return TYPE;
	}

	public DataUpdatedEvent()
	{
	}

	public DataUpdatedEvent( JavaScriptObject amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<DataUpdatedHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( DataUpdatedHandler handler )
	{
		handler.onDataUpdated( this );
	}

	public static String getName()
	{
		return NAME;
	}
}