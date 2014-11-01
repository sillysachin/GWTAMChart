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

public class SimplePieChart
{
	public SimplePieChart()
	{
		GWTAMChart.chartService.getLineWithTrendLineChartData( "/data/drawChart.json", new AsyncCallback<String>()
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
		amPieChart.setType( "pie" );
		amPieChart.setDataProvider( chartData );
		amPieChart.setTheme( "none" );
		amPieChart.setValueField( "litres" );
		amPieChart.setTitleField( "country" );
		amPieChart.setSize( "600px", "400px" );
		amPieChart.setGroupedPulled( true );
		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amPieChart.setExportConfig( exportConfig );
		amPieChart.setGroupPercent( 5.0 );
		AmPieChartJSO jso = amPieChart.getJso();
		GWT.log( "groupedPulled - >" + jso.getGroupedPulled() );
		GWT.log( "groupedPulled - >" + amPieChart.getGroupedPulled() );
		GWT.log( "groupPercent - >" + jso.getGroupPercent() );
		GWT.log( "groupPercent - >" + amPieChart.getGroupPercent() );
		GWT.log( "valueField - >" + jso.getValueField() );
		GWT.log( "valueField - >" + amPieChart.getValueField() );
		RootLayoutPanel.get().add( amPieChart );
	}
}