package com.amcharts.impl.event.mouse.piechart;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * @author sachinsr
 * Dispatched when user clicks on a slice. Event is an instance of original mouse event.
 */
public class RightClickSliceEvent extends AmChartEvent<RightClickSliceHandler>
{
	public static final String NAME = "rightClickSlice";

	private static final Type<RightClickSliceHandler> TYPE = new Type<RightClickSliceHandler>();

	public static Type<RightClickSliceHandler> getType()
	{
		return TYPE;
	}

	public RightClickSliceEvent()
	{
	}

	public RightClickSliceEvent( JavaScriptObject amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<RightClickSliceHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( RightClickSliceHandler handler )
	{
		handler.onRightClickSlice( this );
	}

	public static String getName()
	{
		return NAME;
	}
}