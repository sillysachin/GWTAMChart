package com.amcharts.impl.event.mouse.columnchart;

import com.amcharts.impl.event.AmChartEventJSO;
/**
 * 
 * @author sachinsr
 * Dispatched when user rolls-out of the axis label. Event is an instance of original mouse event.
 */
public class RollOutItemEvent extends AmItemEvent<RollOutItemHandler>
{
	public static final String NAME = "rollOutItem";

	private static final Type<RollOutItemHandler> TYPE = new Type<RollOutItemHandler>();

	public static Type<RollOutItemHandler> getType()
	{
		return TYPE;
	}

	public RollOutItemEvent()
	{
	}

	public RollOutItemEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<RollOutItemHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( RollOutItemHandler handler )
	{
		handler.onRollOutItem( this );
	}

	public static String getName()
	{
		return NAME;
	}
}