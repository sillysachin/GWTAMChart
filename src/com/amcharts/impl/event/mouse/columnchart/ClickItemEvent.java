package com.amcharts.impl.event.mouse.columnchart;

import com.amcharts.impl.event.AmChartEventJSO;
/**
 * 
 * @author sachinsr
 * Dispatched when user clicks on a axis label. Event is an instance of original mouse event.
 */
public class ClickItemEvent extends AmItemEvent<ClickItemHandler>
{
	public static final String NAME = "clickItem";

	private static final Type<ClickItemHandler> TYPE = new Type<ClickItemHandler>();

	public static Type<ClickItemHandler> getType()
	{
		return TYPE;
	}

	public ClickItemEvent()
	{
	}

	public ClickItemEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<ClickItemHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( ClickItemHandler handler )
	{
		handler.onClickItem( this );
	}

	public static String getName()
	{
		return NAME;
	}
}