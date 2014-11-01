package com.amcharts.impl.event.mouse.piechart;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sachinsr
 * Dispatched when user clicks on a slice and the slice is pulled-in. Event is an instance of original mouse event.
 */
public class PullInSliceEvent extends AmChartEvent<PullInSliceHandler>
{
	public static final String NAME = "pullInSlice";

	private static final Type<PullInSliceHandler> TYPE = new Type<PullInSliceHandler>();

	public static Type<PullInSliceHandler> getType()
	{
		return TYPE;
	}

	public PullInSliceEvent()
	{
	}

	public PullInSliceEvent( JavaScriptObject amChartEventJSO )
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