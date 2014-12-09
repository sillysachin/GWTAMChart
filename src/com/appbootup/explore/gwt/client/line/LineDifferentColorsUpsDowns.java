package com.appbootup.explore.gwt.client.line;

import com.amcharts.api.IsChartCursor;
import com.amcharts.api.IsChartScrollbar;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
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
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class LineDifferentColorsUpsDowns
{
	public LineDifferentColorsUpsDowns()
	{
		GWTAMChart.chartService
				.getData( "/data/lineDifferentColorsUpsDowns.json", new AsyncCallback<String>()
				{
					@Override
					public void onSuccess( String chartData )
					{
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
		firstDate.setDate(firstDate.getDate() - 150);

		for (var i = 0; i < 150; i++) {
			// we create date objects here. In your data, you can have date strings
			// and then set format of your dates using chart.dataDateFormat property,
			// however when possible, use date objects, as this will speed up chart rendering.
			var newDate = new Date(firstDate);
			newDate.setDate(newDate.getDate() + i);

			var visits = Math.round(Math.random() * 100 - 50);

			chartData.push({
				date : newDate,
				visits : visits
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

		amSerialChart.setAutoMargins( false );
		amSerialChart.setMarginLeft( 8 );
		amSerialChart.setMarginRight( 8 );
		amSerialChart.setMarginTop( 10 );
		amSerialChart.setMarginBottom( 26 );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setAxisAlpha( 0 );
		valueAxis.setInside( true );
		valueAxis.setId( "v1" );
		amSerialChart.addValueAxis( valueAxis );

		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setUseNegativeColorIfDown( true );
		amGraph.setBalloonText( "[[category]]<br><b>value: [[value]]</b>" );
		amGraph.setBullet( "round" );
		amGraph.setBulletBorderAlpha( 1 );
		amGraph.setBulletBorderColor( "#FFFFFF" );
		amGraph.setHideBulletsCount( 50 );
		amGraph.setLineThickness( 2 );
		amGraph.setLineColor( "#fdd400" );
		amGraph.setNegativeLineColor( "#67b7dc" );
		amGraph.setValueField( "visits" );
		amSerialChart.addGraph( amGraph );

		IsChartScrollbar chartScrollbar = new ChartScrollbar();
		amSerialChart.addChartScrollbar( chartScrollbar );

		IsChartCursor chartCursor = new ChartCursor();
		chartCursor.setValueLineEnabled( true );
		chartCursor.setValueLineBalloonEnabled( true );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setCategoryField( "date" );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setParseDates( true );
		categoryAxis.setAxisAlpha( 0 );
		categoryAxis.setMinHorizontalGap( 60 );

		AmChartListener zoomChart = new AmChartListener()
		{
			public void function( AmChartEventJSO event )
			{
				amSerialChart.zoomToIndexes( 130, chartData.length() - 1 );
			}
		};
		amSerialChart.addListener( "dataUpdated", zoomChart );

		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}
}