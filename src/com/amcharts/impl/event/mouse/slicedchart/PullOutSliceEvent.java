package com.amcharts.impl.event.mouse.slicedchart;

import com.amcharts.impl.event.AmChartEventJSO;
/**
 * 
 * @author sachinsr
 * Dispatched when user clicks on a slice and the slice is pulled-out. Event is an instance of original mouse event.
 */
public class PullOutSliceEvent extends AmSliceEvent<PullOutSliceHandler>
{
	public static final String NAME = "pullOutSlice";

	public static final Type<PullOutSliceHandler> TYPE = new Type<PullOutSliceHandler>();

	public PullOutSliceEvent()
	{
	}

	public PullOutSliceEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<PullOutSliceHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( PullOutSliceHandler handler )
	{
		handler.onPullOutSlice( this );
	}

	public static String getName()
	{
		return NAME;
	}
}