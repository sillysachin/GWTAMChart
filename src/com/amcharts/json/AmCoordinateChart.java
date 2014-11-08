package com.amcharts.json;

import com.amcharts.api.IsAmCoordinateChart;

public class AmCoordinateChart extends AmChart implements IsAmCoordinateChart
{
	double startDuration;

	@Override
	public double getStartDuration()
	{
		return startDuration;
	}

	@Override
	public void setStartDuration( double startDuration )
	{
		this.startDuration = startDuration;
	}
}
