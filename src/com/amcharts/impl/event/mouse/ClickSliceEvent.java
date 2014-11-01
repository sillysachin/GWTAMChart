package com.amcharts.impl.event.mouse;

import com.amcharts.impl.event.AmChartEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class ClickSliceEvent extends AmChartEvent<ClickSliceHandler>
{
	public static final String NAME = "clickSlice";

	private static final Type<ClickSliceHandler> TYPE = new Type<ClickSliceHandler>();

	public static Type<ClickSliceHandler> getType()
	{
		return TYPE;
	}

	public ClickSliceEvent()
	{
	}

	public ClickSliceEvent( JavaScriptObject amChartEventJSO )
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