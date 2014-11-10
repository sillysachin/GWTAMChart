package com.amcharts.impl.event.mouse.slicedchart;

import com.amcharts.impl.event.AmChartEventJSO;
/**
 * 
 * @author sachinsr
 * Dispatched when user rolls-out of the slice. Event is an instance of original mouse event.
 */
public class RollOutSliceEvent extends AmSliceEvent<RollOutSliceHandler>
{
	public static final String NAME = "rollOutSlice";

	public static final Type<RollOutSliceHandler> TYPE = new Type<RollOutSliceHandler>();

	public RollOutSliceEvent()
	{
	}

	public RollOutSliceEvent( AmChartEventJSO amChartEventJSO )
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