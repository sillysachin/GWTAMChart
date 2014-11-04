package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartHandler;

public interface DrawHandler extends AmChartHandler
{
	void onDraw( DrawEvent event );
}