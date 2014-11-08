package com.amcharts.impl;

import com.amcharts.api.IsAmCoordinateChart;
import com.amcharts.jso.AmCoordinateChartJSO;

public class AmCoordinateChart extends AmChart implements IsAmCoordinateChart
{
	@Override
	public AmCoordinateChartJSO getJso()
	{
		return ( AmCoordinateChartJSO ) super.getJso();
	}

	@Override
	public double getStartDuration()
	{
		return getJso().getStartDuration();
	}

	@Override
	public void setStartDuration( double startDuration )
	{
		getJso().setStartDuration( startDuration );
	}
	
	public void setGridAboveGraphs( boolean gridAboveGraphs )
	{
		getJso().setGridAboveGraphs( gridAboveGraphs );
	}
}