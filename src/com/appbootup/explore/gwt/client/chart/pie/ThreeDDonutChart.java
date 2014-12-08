package com.appbootup.explore.gwt.client.chart.pie;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
import com.amcharts.jso.AmPieChartJSO;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ThreeDDonutChart
{
	public ThreeDDonutChart()
	{
		GWTAMChart.chartService
				.getData( "/data/threeDDonutChart.json", new AsyncCallback<String>()
				{
					@Override
					public void onSuccess( String chartData )
					{
						JsArray<JavaScriptObject> dataProvider = JsonUtils
								.unsafeEval( chartData );
						drawChart( dataProvider );
					}

					@Override
					public void onFailure( Throwable caught )
					{
						GWT.log( "This Sucks", caught );
					}
				} );
	}

	protected void drawChart( JsArray<JavaScriptObject> chartData )
	{
		AmPieChart amPieChart = new AmPieChart();
		amPieChart.setDataProvider( chartData );
		amPieChart.setTheme( "none" );
		amPieChart.setValueField( "visits" );
		amPieChart.setTitleField( "country" );
		amPieChart.setStartEffect( "elastic" );
		amPieChart.setStartDuration( 2.0 );
		amPieChart.setLabelRadius( 5.0 );
		amPieChart.setInnerRadius( "50%" );
		amPieChart.setDepth3D( 10.0 );
		amPieChart
				.setBalloonText( "[[title]]<br><span style='font-size:14px'><b>[[value]]</b> ([[percents]]%)</span>" );
		amPieChart.setAngle( 15.0 );
		amPieChart.setSize( "1024px", "500px" );

		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( AmCharts.JS_AMCHARTS_IMAGES + "export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amPieChart.setExportConfig( exportConfig );
		RootLayoutPanel.get().add( amPieChart );
	}
}