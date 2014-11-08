package com.amcharts.impl.event;

import com.amcharts.impl.event.chart.DataUpdatedEvent;
import com.amcharts.impl.event.chart.DrawEvent;
import com.amcharts.impl.event.chart.InitEvent;
import com.amcharts.impl.event.chart.RenderedEvent;
import com.amcharts.impl.event.columnchart.valueaxis.AxisChangedEvent;
import com.amcharts.impl.event.columnchart.valueaxis.AxisZoomedEvent;
import com.amcharts.impl.event.columnchart.valueaxis.LogarithmicAxisFailedEvent;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Event;
import com.google.web.bindery.event.shared.Event.Type;

public class AmChartEventUtils
{
	public static GwtEvent< ? > createEvent( Event event )
	{
		GwtEvent< ? > amChartEvent = null;
		String type = event.getType();

		return amChartEvent;
	}

	public static com.google.web.bindery.event.shared.Event< ? > createEvent( com.google.web.bindery.event.shared.Event< ? > event )
	{
		com.google.web.bindery.event.shared.Event< ? > amChartEvent = null;
		Type< ? > type = event.getAssociatedType();
		if ( AxisChangedEvent.getType().equals( type ) )
		{
			amChartEvent = new AxisChangedEvent();
		}
		else if ( AxisZoomedEvent.getName().equals( type ) )
		{
			amChartEvent = new AxisZoomedEvent();
		}
		else if ( LogarithmicAxisFailedEvent.getName().equals( type ) )
		{
			amChartEvent = new LogarithmicAxisFailedEvent();
		}

		return amChartEvent;
	}

	public static AmChartEvent< ? > createEvent( AmChartEventJSO event )
	{
		AmChartEvent< ? > amChartEvent = null;
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
