package com.amcharts.jso;

import com.amcharts.api.IsAmCoordinateChart;

public class AmCoordinateChartJSO extends AmChartJSO implements IsAmCoordinateChart
{
	protected AmCoordinateChartJSO()
	{
	}

	@Override
	public final native double getStartDuration()
	/*-{
		return this.startDuration;
	}-*/;

	@Override
	public final native void setStartDuration( double startDuration )
	/*-{
		this.startDuration = startDuration;
	}-*/;

	public final native void setGridAboveGraphs( boolean gridAboveGraphs )
	/*-{
		this.gridAboveGraphs = gridAboveGraphs;
	}-*/;
}