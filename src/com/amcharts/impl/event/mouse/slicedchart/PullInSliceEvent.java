package com.amcharts.impl.event.mouse.slicedchart;

import com.amcharts.impl.event.AmChartEventJSO;
/**
 * 
 * @author sachinsr
 * Dispatched when user clicks on a slice and the slice is pulled-in. Event is an instance of original mouse event.
 */
public class PullInSliceEvent extends AmSliceEvent<PullInSliceHandler>
{
	public static final String NAME = "pullInSlice";

	public static final Type<PullInSliceHandler> TYPE = new Type<PullInSliceHandler>();

	public PullInSliceEvent()
	{
	}

	public PullInSliceEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<PullInSliceHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( PullInSliceHandler handler )
	{
		handler.onPullInSlice( this );
	}

	public static String getName()
	{
		return NAME;
	}
}