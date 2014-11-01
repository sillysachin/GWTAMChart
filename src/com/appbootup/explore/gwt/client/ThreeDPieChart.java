package com.appbootup.explore.gwt.client;

import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
import com.amcharts.jso.AmPieChartJSO;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ThreeDPieChart
{
	public ThreeDPieChart()
	{
		GWTAMChart.chartService.getLineWithTrendLineChartData( "/data/threeDPieChart.json", new AsyncCallback<String>()
		{
			@Override
			public void onSuccess( String chartData )
			{
				JavaScriptObject pieDataProvider = JsonUtils.unsafeEval( chartData );
				drawChart( pieDataProvider );
			}

			@Override
			public void onFailure( Throwable caught )
			{
				GWT.log( "This Sucks", caught );
			}
		} );
	}

	protected void drawChart( JavaScriptObject chartData )
	{
		AmPieChart amPieChart = new AmPieChart();
		amPieChart.setDataProvider( chartData );
		amPieChart.setTheme( "none" );
		amPieChart.setValueField( "value" );
		amPieChart.setTitleField( "country" );
		amPieChart.setOutlineAlpha( 0.4 );
		amPieChart.setDepth3D( 15.0 );
		amPieChart.setSize( "1024px", "500px" );
		amPieChart.setBalloonText( "[[title]]<br><span style='font-size:14px'><b>[[value]]</b> ([[percents]]%)</span>" );
		amPieChart.setAngle( 30.0 );
		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amPieChart.setExportConfig( exportConfig );
		AmPieChartJSO jso = amPieChart.getJso();
		GWT.log( "angle - >" + jso.getAngle() );
		GWT.log( "angle - >" + amPieChart.getAngle() );
		GWT.log( "depth3D - >" + jso.getDepth3D() );
		GWT.log( "depth3D - >" + amPieChart.getDepth3D() );
		GWT.log( "outlineAlpha - >" + jso.getOutlineAlpha() );
		GWT.log( "outlineAlpha - >" + amPieChart.getOutlineAlpha() );
		RootLayoutPanel.get().add( amPieChart );
	}
}