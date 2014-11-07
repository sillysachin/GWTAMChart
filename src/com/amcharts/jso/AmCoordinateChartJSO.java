package com.amcharts.jso;

import com.amcharts.api.IsAmCoordinateChart;

public class AmCoordinateChartJSO extends AmChartJSO implements IsAmCoordinateChart
{
	protected AmCoordinateChartJSO()
	{
	}

	@Override
	public final native Integer getStartDuration()
	/*-{
		return this.startDuration;
	}-*/;

	@Override
	public final native void setStartDuration( Integer startDuration )
	/*-{
		this.startDuration = startDuration;
	}-*/;
}