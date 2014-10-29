package com.appbootup.explore.gwt.client;

import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class SimplePieChart
{
	public SimplePieChart()
	{
		GWTAMChart.chartService.getLineWithTrendLineChartData( "/data/simplePieChart.json", new AsyncCallback<String>()
		{
			@Override
			public void onSuccess( String chartData )
			{
				JavaScriptObject pieDataProvider = JsonUtils.unsafeEval( chartData );
				simplePieChart( pieDataProvider );
			}

			@Override
			public void onFailure( Throwable caught )
			{
				GWT.log( "This Sucks", caught );
			}
		} );
	}

	protected void simplePieChart( JavaScriptObject chartData )
	{
		AmPieChart amPieChart = new AmPieChart();
		amPieChart.setType( "pie" );
		amPieChart.setDataProvider( chartData );
		amPieChart.setTheme( "none" );
		amPieChart.setValueField( "litres" );
		amPieChart.setTitleField( "country" );
		amPieChart.setSize( "600px", "400px" );
		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amPieChart.setExportConfig( exportConfig );
		RootLayoutPanel.get().add( amPieChart );
	}
}
