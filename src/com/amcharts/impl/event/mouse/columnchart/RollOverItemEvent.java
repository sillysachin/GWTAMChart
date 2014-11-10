package com.amcharts.impl.event.mouse.columnchart;

import com.amcharts.impl.event.AmChartEventJSO;

/**
 * 
 * @author sachinsr
 * Dispatched when user rolls-over the axis label. Event is an instance of original mouse event.
 */
public class RollOverItemEvent extends AmItemEvent<RollOverItemHandler>
{
	public static final String NAME = "rollOverItem";

	public static final Type<RollOverItemHandler> TYPE = new Type<RollOverItemHandler>();

	public RollOverItemEvent()
	{
	}

	public RollOverItemEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<RollOverItemHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( RollOverItemHandler handler )
	{
		handler.onRollOverItem( this );
	}

	public static String getName()
	{
		return NAME;
	}
}