package com.amcharts.impl.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Event;

public abstract class AmChartEvent<H extends EventHandler> extends GwtEvent<H>
{
	private Event event;

	public AmChartEvent()
	{
	}

	public AmChartEvent( JavaScriptObject amChartEventJSO )
	{
		this.setEvent( extractEvent( amChartEventJSO ) );
	}

	public Event getEvent()
	{
		if ( event == null )
		{
			event = extractEvent();
		}
		return event;
	}

	public void setEvent( Event event )
	{
		this.event = event;
	}

	public native Event extractEvent()
	/*-{
		this.@com.amcharts.impl.event.AmChartEvent::event = this.event;
		return this.event;
	}-*/;

	public native Event extractEvent( JavaScriptObject amChartEventJSO )
	/*-{
		this.@com.amcharts.impl.event.AmChartEvent::event = amChartEventJSO.event;
		return amChartEventJSO.event;
	}-*/;
}