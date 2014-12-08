package com.appbootup.explore.gwt.client.line;

import com.amcharts.api.IsChartCursor;
import com.amcharts.api.IsChartScrollbar;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmLegend;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ChartScrollbar;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class MultipleValueAxes
{
	public MultipleValueAxes()
	{
		GWTAMChart.chartService
				.getData( "/data/multipleValueAxes.json", new AsyncCallback<String>()
				{
					@Override
					public void onSuccess( String chartData )
					{
						JsArray<JavaScriptObject> dataProvider = JsonUtils
								.unsafeEval( chartData );
						drawChart( generatechartData() );
					}

					@Override
					public void onFailure( Throwable caught )
					{
						GWT.log( "This Sucks", caught );
					}
				} );
	}

	protected native JsArray<JavaScriptObject> generatechartData()
	/*-{
		var chartData = [];
		var firstDate = new Date();
		firstDate.setDate(firstDate.getDate() - 100);

		for (var i = 0; i < 100; i++) {
			// we create date objects here. In your data, you can have date strings
			// and then set format of your dates using chart.dataDateFormat property,
			// however when possible, use date objects, as this will speed up chart rendering.
			var newDate = new Date(firstDate);
			newDate.setDate(newDate.getDate() + i);

			var visits = Math.round(Math.random() * 40) + 100;
			var hits = Math.round(Math.random() * 80) + 500;
			var views = Math.round(Math.random() * 6000);

			chartData.push({
				date : newDate,
				visits : visits,
				hits : hits,
				views : views
			});
		}
		return chartData;
	}-*/;

	protected void drawChart( final JsArray<JavaScriptObject> chartData )
	{
		final AmSerialChart amSerialChart = AmCharts.AmSerialChart();
		amSerialChart.setTheme( "none" );
		amSerialChart.setPathToImages( AmCharts.JS_AMCHARTS_IMAGES );
		amSerialChart.setDataProvider( chartData );

		AmLegend legend = new AmLegend();
		legend.setUseGraphSettings( true );
		amSerialChart.setLegend( legend );

		ValueAxis valueAxis1 = AmCharts.ValueAxis();
		valueAxis1.setId( "v1" );
		valueAxis1.setAxisColor( "#FF6600" );
		valueAxis1.setAxisThickness( 2 );
		valueAxis1.setGridAlpha( 0 );
		valueAxis1.setAxisAlpha( 1 );
		valueAxis1.setPosition( "left" );
		amSerialChart.addValueAxis( valueAxis1 );
		ValueAxis valueAxis2 = AmCharts.ValueAxis();
		valueAxis2.setId( "v2" );
		valueAxis2.setAxisColor( "#FF6600" );
		valueAxis2.setAxisThickness( 2 );
		valueAxis2.setGridAlpha( 0 );
		valueAxis2.setAxisAlpha( 1 );
		valueAxis2.setPosition( "right" );
		amSerialChart.addValueAxis( valueAxis2 );
		ValueAxis valueAxis3 = AmCharts.ValueAxis();
		valueAxis3.setId( "v3" );
		valueAxis3.setAxisColor( "#FF6600" );
		valueAxis3.setAxisThickness( 2 );
		valueAxis3.setGridAlpha( 0 );
		valueAxis3.setAxisAlpha( 1 );
		valueAxis3.setPosition( "left" );
		valueAxis3.setOffset( 50 );
		amSerialChart.addValueAxis( valueAxis3 );

		AmGraph amGraph1 = AmCharts.AmGraph();
		amGraph1.setValueAxis( "v1" );
		amGraph1.setLineColor( "#FF6600" );
		amGraph1.setBullet( "round" );
		amGraph1.setBulletBorderThickness( 1 );
		amGraph1.setHideBulletsCount( 30 );
		amGraph1.setTitle( "red line" );
		amGraph1.setValueField( "visits" );
		amGraph1.setFillAlphas( 0 );
		amSerialChart.addGraph( amGraph1 );

		AmGraph amGraph2 = AmCharts.AmGraph();
		amGraph2.setValueAxis( "v2" );
		amGraph2.setLineColor( "#FCD202" );
		amGraph2.setBullet( "square" );
		amGraph2.setBulletBorderThickness( 1 );
		amGraph2.setHideBulletsCount( 30 );
		amGraph2.setTitle( "yellow line" );
		amGraph2.setValueField( "hits" );
		amGraph2.setFillAlphas( 0 );
		amSerialChart.addGraph( amGraph2 );

		AmGraph amGraph3 = AmCharts.AmGraph();
		amGraph3.setValueAxis( "v3" );
		amGraph3.setLineColor( "#B0DE09" );
		amGraph3.setBullet( "triangleUp" );
		amGraph3.setBulletBorderThickness( 1 );
		amGraph3.setHideBulletsCount( 30 );
		amGraph3.setTitle( "green line" );
		amGraph3.setValueField( "views" );
		amGraph3.setFillAlphas( 0 );
		amSerialChart.addGraph( amGraph3 );

		IsChartScrollbar chartScrollbar = new ChartScrollbar();
		amSerialChart.addChartScrollbar( chartScrollbar );

		IsChartCursor chartCursor = new ChartCursor();
		chartCursor.setCursorPosition( "mouse" );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setCategoryField( "date" );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setParseDates( true );
		categoryAxis.setAxisColor( "#DADADA" );
		categoryAxis.setMinorGridEnabled( true );

		AmChartListener zoomChart = new AmChartListener()
		{
			public void function( AmChartEventJSO event )
			{
				zoomChart( chartData, amSerialChart );
			}
		};
		amSerialChart.addListener( "dataUpdated", zoomChart );
		zoomChart( chartData, amSerialChart );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}

	private void zoomChart( final JsArray<JavaScriptObject> chartData, final AmSerialChart amSerialChart )
	{
		amSerialChart.zoomToIndexes( chartData.length() - 20, chartData
				.length() - 1 );
	}
}