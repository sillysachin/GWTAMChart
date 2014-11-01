package com.amcharts.impl.event.mouse.slicedchart;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sachinsr
 * Dispatched when user rolls-out of the slice. Event is an instance of original mouse event.
 */
public class RollOutSliceEvent extends AmSliceEvent<RollOutSliceHandler>
{
	public static final String NAME = "rollOutSlice";

	private static final Type<RollOutSliceHandler> TYPE = new Type<RollOutSliceHandler>();

	public static Type<RollOutSliceHandler> getType()
	{
		return TYPE;
	}

	public RollOutSliceEvent()
	{
	}

	public RollOutSliceEvent( JavaScriptObject amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<RollOutSliceHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( RollOutSliceHandler handler )
	{
		handler.onRollOutSlice( this );
	}

	public static String getName()
	{
		return NAME;
	}
}