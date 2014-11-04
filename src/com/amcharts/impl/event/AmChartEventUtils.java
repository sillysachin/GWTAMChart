package com.amcharts.impl.event;

import com.amcharts.impl.event.chart.DataUpdatedEvent;
import com.amcharts.impl.event.chart.DrawEvent;
import com.amcharts.impl.event.chart.InitEvent;
import com.amcharts.impl.event.chart.RenderedEvent;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Event;

public class AmChartEventUtils
{
	public static GwtEvent< ? > createEvent( Event event )
	{
		GwtEvent< ? > amChartEvent = null;
		String type = event.getType();
		if ( RenderedEvent.getName().equals( type ) )
		{
			amChartEvent = new RenderedEvent( event );
		}
		else if ( InitEvent.getName().equals( type ) )
		{
			amChartEvent = new InitEvent( event );
		}
		else if ( DrawEvent.getName().equals( type ) )
		{
			amChartEvent = new DrawEvent( event );
		}
		else if ( DataUpdatedEvent.getName().equals( type ) )
		{
			amChartEvent = new DataUpdatedEvent( event );
		}

		return amChartEvent;
	}
}
