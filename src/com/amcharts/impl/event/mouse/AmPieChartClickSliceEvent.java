package com.amcharts.impl.event.mouse;

import com.amcharts.impl.event.AmChartEvent;
import com.amcharts.impl.event.DataItem;

public class AmPieChartClickSliceEvent extends AmChartEvent<AmPieChartClickSliceHandler>
{
	public native DataItem getDataItem()
	/*-{
		this.dataItem.className = 'DataItem';
		var dataItem = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.dataItem)
		return dataItem;
	}-*/;

	private static final Type<AmPieChartClickSliceHandler> TYPE = new Type<AmPieChartClickSliceHandler>( "clickSlice", new AmPieChartClickSliceEvent() );

	public static Type<AmPieChartClickSliceHandler> getType()
	{
		return TYPE;
	}

	protected AmPieChartClickSliceEvent()
	{
	}

	@Override
	public final Type<AmPieChartClickSliceHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch( AmPieChartClickSliceHandler handler )
	{
		handler.onClickSlic( this );
	}
}