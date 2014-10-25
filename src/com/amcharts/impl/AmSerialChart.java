package com.amcharts.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class AmSerialChart extends AmRectangularChart {
	public AmSerialChart() {
		jso = createJso();
	}

	public native JavaScriptObject createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmSerialChart();
		return chart;
	}-*/;
}
