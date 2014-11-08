package com.amcharts.impl.event.mouse.slicedchart;

import com.amcharts.impl.event.AmChartEventJSO;
import com.google.gwt.event.shared.GwtEvent;

public class AmSlicedChartEventUtils
{
	public static GwtEvent< ? > createEvent( AmChartEventJSO event )
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