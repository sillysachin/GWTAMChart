package com.appbootup.explore.gwt.client;

import com.appbootup.explore.gwt.client.line.LineDifferentColorsUpsDowns;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTAMChart implements EntryPoint
{
	/**
	 * The message displayed to the user when the server cannot be reached or returns an error.
	 */

	public final static ChartServiceAsync chartService = GWT
			.create( ChartService.class );

	public static final String JSON_URL = GWT.getModuleBaseURL() + "json/amchart?q=";

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		// pieChartByJSNI();
		// serialChartByJSNI();
		// chartByServerJSON();
		// lineWithTrendLineChartByJSNI();
		// SimplePieChart drawChart = new SimplePieChart();
		// ThreeDPieChart threeDPieChart = new ThreeDPieChart();
		// DonutChart threeDPieChart = new DonutChart();
		// ThreeDDonutChart threeDDonutChart = new ThreeDDonutChart();
		// PieChartWithLegend pieChartWithLegend = new PieChartWithLegend();
		// PieChartBrokenSlices pieChartBrokenSlices = new PieChartBrokenSlices();
		// PyramidChart pyramidChart = new PyramidChart();
		// ThreeDFunnelChart threeDFunnelChart = new ThreeDFunnelChart();
		// FunnelChart funnelChart = new FunnelChart();
		// ColumnWithRotatedSeries columnWithRotatedSeries = new ColumnWithRotatedSeries();
		// SimpleColumnChart simpleColumnChart = new SimpleColumnChart();
		// ColumnChartWithEvents columnChartWithEvents = new ColumnChartWithEvents();
		// StackedColumnChart stackedColumnChart = new StackedColumnChart();
		// ThreeDCylinderChart threeDCylinderChart = new ThreeDCylinderChart();
		LineDifferentColorsUpsDowns lineDifferentColorsUpsDowns = new LineDifferentColorsUpsDowns();
	}
}