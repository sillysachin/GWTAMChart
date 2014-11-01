package com.amcharts.impl.event.mouse.piechart;

import com.amcharts.impl.event.AmChartHandler;

public interface PullInSliceHandler extends AmChartHandler
{
	void onPullInSlice( PullInSliceEvent event );
}