package com.amcharts.impl.event.columnchart.valueaxis;

import com.amcharts.impl.event.AmChartHandler;

public interface AxisChangedHandler extends AmChartHandler
{
	void onAxisChanged( AxisChangedEvent event );
}