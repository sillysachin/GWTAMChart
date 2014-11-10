package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartEvent;
import com.amcharts.impl.event.AmChartEventJSO;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * 
 * @author sachinsr
 * Dispatched when chart is build for the first time or after validateData() method was called.
 */
public class DataUpdatedEvent extends AmChartEvent<DataUpdatedHandler>
{
	public static final String NAME = "dataUpdated";

	public static final Type<DataUpdatedHandler> TYPE = new Type<DataUpdatedHandler>();

	public DataUpdatedEvent()
	{
	}

	public DataUpdatedEvent( AmChartEventJSO amChartEventJSO )
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

	public static HandlerRegistration addHandler( EventBus eventBus, DataUpdatedHandler handler )
	{
		return eventBus.addHandler( TYPE, handler );
	}
}