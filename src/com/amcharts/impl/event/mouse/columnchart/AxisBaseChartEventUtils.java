package com.amcharts.impl.event.mouse.columnchart;

import com.amcharts.impl.event.AmChartEventJSO;
import com.google.gwt.event.shared.GwtEvent;

public class AxisBaseChartEventUtils
{
	public static GwtEvent< ? > createEvent( AmChartEventJSO event )
	{
		GwtEvent< ? > itemEvent = null;
		String type = event.getType();
		if ( ClickItemEvent.getName().equals( type ) )
		{
			itemEvent = new ClickItemEvent( event );
		}
		else if ( RollOutItemEvent.getName().equals( type ) )
		{
			itemEvent = new RollOutItemEvent( event );
		}
		else if ( RollOverItemEvent.getName().equals( type ) )
		{
			itemEvent = new RollOverItemEvent( event );
		}

		return itemEvent;
	}
}