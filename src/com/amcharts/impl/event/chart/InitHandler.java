package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartHandler;

public interface InitHandler extends AmChartHandler
{
	void onInit( InitEvent event );
}