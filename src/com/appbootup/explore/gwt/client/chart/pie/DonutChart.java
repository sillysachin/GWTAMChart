package com.appbootup.explore.gwt.client.chart.pie;

import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.wrapper.AbstractChartWrapper;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class DonutChart extends AbstractChartWrapper
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
		amPieChart.setInnerRadius( "60%" );
		amPieChart.setLabelText( "[[title]]" );

		setAmChart( amPieChart );
		getReadyCallback().onReady();
	}
}