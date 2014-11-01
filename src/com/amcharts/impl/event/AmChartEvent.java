package com.amcharts.impl.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Event;

public abstract class AmChartEvent<H extends EventHandler> extends GwtEvent<H>
{
	private DataItem dataItem;

	private Event event;

	public AmChartEvent()
	{
	}

	public AmChartEvent( JavaScriptObject amChartEventJSO )
	{
		this.setDataItem( extractDataItem( amChartEventJSO ) );
	}

	public native DataItem extractDataItem()
	/*-{
		this.dataItem.className = 'DataItem';
		this.@com.amcharts.impl.event.AmChartEvent::event = this.event;
		var dataItem = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.dataItem)
		return dataItem;
	}-*/;

	public native DataItem extractDataItem( JavaScriptObject amChartEventJSO )
	/*-{
		amChartEventJSO.dataItem.className = 'DataItem';
		this.@com.amcharts.impl.event.AmChartEvent::event = amChartEventJSO.event;
		var dataItem = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(amChartEventJSO.dataItem)
		return dataItem;
	}-*/;

	public DataItem getDataItem()
	{
		if ( dataItem == null )
		{
			dataItem = extractDataItem();
		}
		return dataItem;
	}

	public void setDataItem( DataItem dataItem )
	{
		this.dataItem = dataItem;
	}

	public Event getEvent()
	{
		return event;
	}

	public void setEvent( Event event )
	{
		this.event = event;
	}
}