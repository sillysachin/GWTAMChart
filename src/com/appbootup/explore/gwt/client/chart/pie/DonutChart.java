package com.appbootup.explore.gwt.client.chart.pie;

import com.amcharts.impl.AmPieChart;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class DonutChart
{
	public DonutChart()
	{
		GWTAMChart.chartService
				.getData( "/data/donutChart.json", new AsyncCallback<String>()
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
		amPieChart.setTheme( "patterns" );
		amPieChart.setValueField( "value" );
		amPieChart.setTitleField( "title" );
		amPieChart.setLabelRadius( 5.0 );
		amPieChart.setRadius( "42%" );
		amPieChart.setSize( "1024px", "500px" );
		amPieChart.setInnerRadius( "60%" );
		amPieChart.setLabelText( "[[title]]" );
		RootLayoutPanel.get().add( amPieChart );
	}
}