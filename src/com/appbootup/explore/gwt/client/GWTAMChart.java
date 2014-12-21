package com.appbootup.explore.gwt.client;

import com.amcharts.impl.wrapper.IsReadyCallback;
import com.appbootup.explore.gwt.client.tutorials.MultiDimensionalDrilldownBackButton;
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
		// final SimplePieChart chartWrapper = new SimplePieChart();
		// final ThreeDPieChart chartWrapper = new ThreeDPieChart();
		// final DonutChart chartWrapper = new DonutChart();
		// final ThreeDDonutChart chartWrapper = new ThreeDDonutChart();
		// final PieChartWithLegend chartWrapper = new PieChartWithLegend();
		// final PieChartBrokenSlices chartWrapper = new PieChartBrokenSlices();
		// final PyramidChart chartWrapper = new PyramidChart();
		// final ThreeDFunnelChart chartWrapper = new ThreeDFunnelChart();
		// final FunnelChart chartWrapper = new FunnelChart();
		// final ColumnWithRotatedSeries chartWrapper = new ColumnWithRotatedSeries();
		// final SimpleColumnChart chartWrapper = new SimpleColumnChart();
		// final ColumnChartWithEvents chartWrapper = new ColumnChartWithEvents();
		// final StackedColumnChart chartWrapper = new StackedColumnChart();
		// final ThreeDCylinderChart chartWrapper = new ThreeDCylinderChart();
		// final LineDifferentColorsUpsDowns chartWrapper = new LineDifferentColorsUpsDowns();
		// final DateBasedData chartWrapper = new DateBasedData();
		// final MultipleValueAxes chartWrapper = new MultipleValueAxes();
		// final BubbleChart chartWrapper = new BubbleChart();
		// final PolarChart chartWrapper = new PolarChart();
		// final MicroChartsSparklines chartWrapper = new MicroChartsSparklines();
		// final AngularGaugeWithTwoAxes chartWrapper = new AngularGaugeWithTwoAxes();
		// final AngularGauge chartWrapper = new AngularGauge();
		// final ExportingChartToImage chartWrapper = new ExportingChartToImage();
		// final LineWithChangingColor chartWrapper = new LineWithChangingColor();
		// final StackedArea chartWrapper = new StackedArea();
		// final DurationOnValueAxis chartWrapper = new DurationOnValueAxis();
		// final UpdatingBalloonTooltip chartWrapper = new UpdatingBalloonTooltip();
		final MultiDimensionalDrilldownBackButton chartWrapper = new MultiDimensionalDrilldownBackButton();
		// final LinkingPieChartColumnChartDrillDataDisplay chartWrapper = new LinkingPieChartColumnChartDrillDataDisplay();

		chartWrapper.setReadyCallback( new IsReadyCallback()
		{
			public void onReady()
			{
				chartWrapper.setSize( "620px", "350px" );
				Widget widget = chartWrapper.getChartWidget();
				RootLayoutPanel.get().add( widget );
			}
		} );
	}
}