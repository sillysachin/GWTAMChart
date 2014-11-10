package com.amcharts.impl.event.mouse.slicedchart;

import com.amcharts.impl.event.AmChartEventJSO;

/**
 * 
 * @author sachinsr
 * Dispatched when user right-clicks the slice. Event is an instance of original mouse event.
 */
public class RightClickSliceEvent extends AmSliceEvent<RightClickSliceHandler>
{
	public static final String NAME = "rightClickSlice";

	public static final Type<RightClickSliceHandler> TYPE = new Type<RightClickSliceHandler>();

	public RightClickSliceEvent()
	{
	}

	public RightClickSliceEvent( AmChartEventJSO amChartEventJSO )
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