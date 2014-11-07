package com.amcharts.impl;

import com.amcharts.api.IsAmRectangularChart;

public class AmRectangularChart extends AmCoordinateChart implements IsAmRectangularChart
{
	public native void addChartCursor( ChartCursor chartCursor )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var chartCursor = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(chartCursor)
		chart.addChartCursor(chartCursor);
	}-*/;
}
