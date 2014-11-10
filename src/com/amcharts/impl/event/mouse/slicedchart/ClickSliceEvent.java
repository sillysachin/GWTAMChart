package com.amcharts.impl.event.mouse.slicedchart;

import com.amcharts.impl.event.AmChartEventJSO;
/**
 * 
 * @author sachinsr
 * Dispatched when user clicks on a slice. Event is an instance of original mouse event.
 */
public class ClickSliceEvent extends AmSliceEvent<ClickSliceHandler>
{
	public static final String NAME = "clickSlice";

	public static final Type<ClickSliceHandler> TYPE = new Type<ClickSliceHandler>();

	public ClickSliceEvent()
	{
	}

	public ClickSliceEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	@Override
	public final Type<ClickSliceHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( ClickSliceHandler handler )
	{
		handler.onClickSlice( this );
	}

	public static String getName()
	{
		return NAME;
	}
}