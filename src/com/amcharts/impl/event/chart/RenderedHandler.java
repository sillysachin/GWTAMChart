package com.amcharts.impl.event.chart;

import com.amcharts.impl.event.AmChartHandler;

public interface RenderedHandler extends AmChartHandler
{
	void onRendered( RenderedEvent event );
}