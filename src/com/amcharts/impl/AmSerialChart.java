package com.amcharts.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class AmSerialChart extends AmRectangularChart {
	CategoryAxis categoryAxis;

	public AmSerialChart() {
		jso = createJso();
		CategoryAxis categoryAxis = new CategoryAxis();
		categoryAxis.setJso(getCategoryAxisJSO());
	}

	public native JavaScriptObject createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmSerialChart();
		return chart;
	}-*/;

	public CategoryAxis getCategoryAxis() {
		return categoryAxis;
	}
}
