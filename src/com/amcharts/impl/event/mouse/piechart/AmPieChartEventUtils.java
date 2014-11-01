package com.amcharts.impl.event.mouse.piechart;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Event;

public class AmPieChartEventUtils
{
	public static GwtEvent< ? > createEvent( Event event )
	{
		GwtEvent< ? > sliceEvent = null;
		String type = event.getType();
		if ( ClickSliceEvent.getName().equals( type ) )
		{
			sliceEvent = new ClickSliceEvent( event );
		}
		else if ( RightClickSliceEvent.getName().equals( type ) )
		{
			sliceEvent = new RightClickSliceEvent( event );
		}
		else if ( PullInSliceEvent.getName().equals( type ) )
		{
			sliceEvent = new PullInSliceEvent( event );
		}
		else if ( PullOutSliceEvent.getName().equals( type ) )
		{
			sliceEvent = new PullOutSliceEvent( event );
		}
		else if ( RollOutSliceEvent.getName().equals( type ) )
		{
			sliceEvent = new RollOutSliceEvent( event );
		}
		else if ( RollOverSliceEvent.getName().equals( type ) )
		{
			sliceEvent = new RollOverSliceEvent( event );
		}

		return sliceEvent;
	}
}
