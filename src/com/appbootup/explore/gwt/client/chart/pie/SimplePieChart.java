package com.appbootup.explore.gwt.client.chart.pie;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmExport;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.Item;
import com.amcharts.impl.JsFunction;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.MenuItemOutput;
import com.amcharts.impl.MenuItemOutputCallback;
import com.amcharts.impl.util.LogUtils;
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
		amPieChart.setDataProvider( chartData );
		amPieChart.setTheme( "none" );
		amPieChart.setValueField( "litres" );
		amPieChart.setTitleField( "country" );
		amPieChart.setSize( "1240px", "500px" );
		amPieChart.setGroupedPulled( true );
		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem1 = new MenuItem();
		menuItem1.setIcon( AmCharts.JS_AMCHARTS_IMAGES + "export.png" );
		menuItem1.setFormat( "png" );
		exportConfig.addMenuItem( menuItem1 );
		MenuItem menuItem2 = new MenuItem();
		menuItem2.setIcon( AmCharts.JS_AMCHARTS_IMAGES + "circular6-24.png" );
		Item item = new Item();
		menuItem2.addItem( item );
		exportConfig.addMenuItem( menuItem2 );
		amPieChart.setExportConfig( exportConfig );

		MenuItemOutput menuItemOutput = AmCharts.MenuItemOutput();
		menuItemOutput.setOnClick( new MenuItemOutputCallback()
		{
			public void execute( AmExport instance, MenuItemOutput config )
			{
				LogUtils.log( config );
				LogUtils.log( instance );
				GWT.log( "We can implment Export,Refresh,Clear,Jump To etc with multiple icons." );
			}
		} );
		exportConfig.setMenuItemOutput( menuItemOutput );

		amPieChart.setGroupPercent( 5.0 );
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