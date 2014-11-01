package com.amcharts.impl.event.mouse.piechart;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sachinsr
 * Dispatched when user clicks on a slice and the slice is pulled-out. Event is an instance of original mouse event.
 */
public class PullOutSliceEvent extends AmChartEvent<PullOutSliceHandler>
{
	public static final String NAME = "pullOutSlice";

	private static final Type<PullOutSliceHandler> TYPE = new Type<PullOutSliceHandler>();

	public static Type<PullOutSliceHandler> getType()
	{
		return TYPE;
	}

	public PullOutSliceEvent()
	{
	}

	public PullOutSliceEvent( JavaScriptObject amChartEventJSO )
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