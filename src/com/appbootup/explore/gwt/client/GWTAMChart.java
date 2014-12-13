package com.appbootup.explore.gwt.client;

import com.appbootup.explore.gwt.client.tutorials.LinkingPieChartColumnChartDrillDataDisplay;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

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
		// GWTAMChartSample.pieChartByJSNI();
		// GWTAMChartSample.serialChartByJSNI();
		// GWTAMChartSample.chartByServerJSON();
		// GWTAMChartSample.lineWithTrendLineChartByJSNI();
		// final SimplePieChart simplePieChart = new SimplePieChart();
		// final ThreeDPieChart chart = new ThreeDPieChart();
		// final DonutChart chart = new DonutChart();
		// final ThreeDDonutChart chart = new ThreeDDonutChart();
		// final PieChartWithLegend chart = new PieChartWithLegend();
		// final PieChartBrokenSlices chart = new PieChartBrokenSlices();
		// final PyramidChart chart = new PyramidChart();
		// final ThreeDFunnelChart chart = new ThreeDFunnelChart();
		// final FunnelChart chart = new FunnelChart();
		// final ColumnWithRotatedSeries chart = new ColumnWithRotatedSeries();
		// final SimpleColumnChart chart = new SimpleColumnChart();
		// final ColumnChartWithEvents chart = new ColumnChartWithEvents();
		// final StackedColumnChart chart = new StackedColumnChart();
		// final ThreeDCylinderChart chart = new ThreeDCylinderChart();
		// final LineDifferentColorsUpsDowns chart = new LineDifferentColorsUpsDowns();
		// final DateBasedData chart = new DateBasedData();
		// final MultipleValueAxes chart = new MultipleValueAxes();
		// final BubbleChart chart = new BubbleChart();
		// final final PolarChart chart = new PolarChart();
		// final MicroChartsSparklines chart = new MicroChartsSparklines();
		// final AngularGaugeWithTwoAxes chart = new AngularGaugeWithTwoAxes();
		// final AngularGauge chart = new AngularGauge();
		// final ExportingChartToImage chart = new ExportingChartToImage();
		// final LineWithChangingColor chart = new LineWithChangingColor();
		// final StackedArea chart = new StackedArea();
		// final DurationOnValueAxis chart = new DurationOnValueAxis();
		// final UpdatingBalloonTooltip chart = new UpdatingBalloonTooltip();
		// final MultiDimensionalDrilldownBackButton chart = new MultiDimensionalDrilldownBackButton();
		final LinkingPieChartColumnChartDrillDataDisplay chart = new LinkingPieChartColumnChartDrillDataDisplay();

		chart.setReadyCallback( new IsReadyCallback()
		{
			public void onReady()
			{
				Widget widget = chart.getChartWidget();
				widget.setSize( "620px", "250px" );
				RootLayoutPanel.get().add( widget );
			}
		} );
	}
}