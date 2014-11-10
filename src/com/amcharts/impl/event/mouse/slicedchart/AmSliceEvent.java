package com.amcharts.impl.event.mouse.slicedchart;

import com.amcharts.impl.Slice;
import com.amcharts.impl.event.AmChartDomEvent;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartHandler;

public abstract class AmSliceEvent<H extends AmChartHandler> extends AmChartDomEvent<H>
{
	public AmSliceEvent()
	{
	}

	public AmSliceEvent( AmChartEventJSO amChartEventJSO )
	{
		super( amChartEventJSO );
	}

	public Slice getDataItem()
	{
		return ( Slice ) getJso().getDataItem();
	}

	public void setDataItem( Slice dataItem )
	{
		this.getJso().setDataItem( dataItem );
	}
}