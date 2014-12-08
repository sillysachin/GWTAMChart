package com.appbootup.explore.gwt.client.chart.pie;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.JsFunction;
import com.amcharts.impl.MenuItem;
import com.amcharts.jso.AmPieChartJSO;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class SimplePieChart
{
	public SimplePieChart()
	{
		GWTAMChart.chartService
				.getData( "/data/simplePieChart.json", new AsyncCallback<String>()
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
		amPieChart.setType( "pie" );
		amPieChart.setDataProvider( chartData );
		amPieChart.setTheme( "none" );
		amPieChart.setValueField( "litres" );
		amPieChart.setTitleField( "country" );
		amPieChart.setSize( "1240px", "500px" );
		amPieChart.setGroupedPulled( true );
		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( AmCharts.JS_AMCHARTS_IMAGES+"export.png" );
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
		//amPieChart.setLabelFunction( getLabelFunction() );
		String functionString = getFunctionString();
		JsFunction jsFunction = new JsFunction();
		jsFunction.setFunctionString( functionString );
		amPieChart.setLabelFunction( jsFunction );
		RootLayoutPanel.get().add( amPieChart );
	}

	private native JavaScriptObject getLabelFunction()
	/*-{
		return function(slice, text) {
			return text;
		};
	}-*/;

	private String getFunctionString()
	{
		return "function(slice, text) {" + "return text;" + "}";
	}
}