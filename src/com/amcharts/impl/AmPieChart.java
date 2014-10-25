package com.amcharts.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class AmPieChart extends AmSlicedChart {

	public AmPieChart() {
		jso = createJso();
		setType("pie");
	}

	public native JavaScriptObject createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmPieChart();
		return chart;
	}-*/;

//	@Override
//	public native void write()
//	/*-{
//		var chartData = [ {
//			title : "Pie I have eaten",
//			value : 70
//		}, {
//			title : "Pie I haven\'t eaten",
//			value : 30
//		} ];
//		var chart = new $wnd.AmCharts.AmPieChart();
//		chart.valueField = "value";
//		chart.titleField = "title";
//		chart.dataProvider = chartData;
//		chart.write("chartdiv");
//	}-*/;

}
