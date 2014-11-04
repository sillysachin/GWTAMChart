package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartHandler;

public interface DataUpdatedHandler extends AmChartHandler
{
	void onDataUpdated( DataUpdatedEvent dataUpdatedEvent );
}