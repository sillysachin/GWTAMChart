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

public class DonutChart
{
	public DonutChart()
	{
		GWTAMChart.chartService.getLineWithTrendLineChartData( "/data/donutChart.json", new AsyncCallback<String>()
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
		amPieChart.setDataProvider( chartData );
		amPieChart.setTheme( "patterns" );
		amPieChart.setValueField( "value" );
		amPieChart.setTitleField( "title" );
		amPieChart.setLabelRadius( 5 );
		amPieChart.setRadius( "42%" );
		amPieChart.setSize( "1024px", "500px" );
		amPieChart.setInnerRadius( "60%" );
		amPieChart.setLabelText( "[[title]]" );
		AmPieChartJSO jso = amPieChart.getJso();
		GWT.log( "labelRadius - >" + jso.getLabelRadius() );
		GWT.log( "labelRadius - >" + amPieChart.getLabelRadius() );
		GWT.log( "radius - >" + jso.getRadius() );
		GWT.log( "radius - >" + amPieChart.getRadius() );
		GWT.log( "labelText - >" + jso.getLabelText() );
		GWT.log( "labelText - >" + amPieChart.getLabelText() );
		RootLayoutPanel.get().add( amPieChart );
	}
}