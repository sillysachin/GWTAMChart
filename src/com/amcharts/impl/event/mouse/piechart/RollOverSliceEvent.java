package com.amcharts.impl.event.mouse.piechart;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;
/**
 * 
 * @author sachinsr
 * Dispatched when user rolls-over the slice. Event is an instance of original mouse event.
 */
public class RollOverSliceEvent extends AmChartEvent<RollOverSliceHandler>
{
	public static final String NAME = "rollOverSlice";

	private static final Type<RollOverSliceHandler> TYPE = new Type<RollOverSliceHandler>();

	public static Type<RollOverSliceHandler> getType()
	{
		return TYPE;
	}

	public RollOverSliceEvent()
	{
	}

	public RollOverSliceEvent( JavaScriptObject amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<RollOverSliceHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( RollOverSliceHandler handler )
	{
		handler.onRollOverSlice( this );
	}

	public static String getName()
	{
		return NAME;
	}
}