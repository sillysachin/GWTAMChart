package com.amcharts.json;

import com.amcharts.api.IsAmCoordinateChart;

public class AmCoordinateChart extends AmChart implements IsAmCoordinateChart
{
	int startDuration;

	@Override
	public Integer getStartDuration()
	{
		return startDuration;
	}

	@Override
	public void setStartDuration( Integer startDuration )
	{
		this.startDuration = startDuration;
	}
}
