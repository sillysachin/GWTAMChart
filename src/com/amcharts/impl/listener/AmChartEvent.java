package com.amcharts.impl.listener;

import com.google.gwt.event.dom.client.MouseEvent;

public class AmChartEvent extends MouseEvent<AmChartHandler>
{
	DataItem dataItem;

	public native DataItem getDataItem()
	/*-{
		return this.@com.amcharts.impl.listener.AmChartEvent::dataItem;
	}-*/;

	private static final Type<AmChartHandler> TYPE = new Type<AmChartHandler>( "clickSlice", new AmChartEvent() );

	public static Type<AmChartHandler> getType()
	{
		return TYPE;
	}

	protected AmChartEvent()
	{
	}

	@Override
	public final Type<AmChartHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( AmChartHandler handler )
	{
		handler.onEvent( this );
	}
}