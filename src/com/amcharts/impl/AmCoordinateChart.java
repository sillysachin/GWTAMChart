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
	public Integer getStartDuration()
	{
		return getJso().getStartDuration();
	}

	@Override
	public void setStartDuration( Integer startDuration )
	{
		getJso().setStartDuration( startDuration );
	}
}
