package com.amcharts.impl.event.mouse.slicedchart;

import com.amcharts.impl.Slice;
import com.amcharts.impl.event.AmChartDomEvent;
import com.amcharts.impl.event.AmChartHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class AmSliceEvent<H extends AmChartHandler> extends AmChartDomEvent<H>
{
	private Slice dataItem;

	public AmSliceEvent()
	{
	}

	public AmSliceEvent( JavaScriptObject amChartEventJSO )
	{
		super( amChartEventJSO );
		this.setDataItem( extractDataItem( amChartEventJSO ) );
	}

	public native Slice extractDataItem()
	/*-{
		this.dataItem.className = 'Slice';
		return this.dataItem;
	}-*/;

	public native Slice extractDataItem( JavaScriptObject amChartEventJSO )
	/*-{
		amChartEventJSO.dataItem.className = 'Slice';
		return amChartEventJSO.dataItem;
	}-*/;

	public Slice getDataItem()
	{
		if ( dataItem == null )
		{
			dataItem = extractDataItem();
		}
		return dataItem;
	}

	public void setDataItem( Slice dataItem )
	{
		this.dataItem = dataItem;
	}
}