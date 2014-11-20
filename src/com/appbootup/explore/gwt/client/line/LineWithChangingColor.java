package com.appbootup.explore.gwt.client.line;

import java.util.ArrayList;

import com.amcharts.api.IsDateFormat;
import com.amcharts.impl.AmBalloon;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ChartScrollbar;
import com.amcharts.impl.DateFormat;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.util.LogUtils;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class LineWithChangingColor
{
	public LineWithChangingColor()
	{
		GWTAMChart.chartService
				.getData( "/data/lineWithChangingColor.json", new AsyncCallback<String>()
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

	protected void drawChart( final JsArray<JavaScriptObject> chartData )
	{
		final AmSerialChart amSerialChart = AmCharts.AmSerialChart();
		amSerialChart.setTheme( "none" );
		amSerialChart.setPathToImages( "/js/amcharts/images/" );
		amSerialChart.setDataProvider( chartData );

		AmBalloon amBalloon = AmCharts.AmBalloon();
		amBalloon.setCornerRadius( 6 );
		amSerialChart.setBalloon( amBalloon );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setDuration( "mm" );
		valueAxis.setDurationUnits( JsonUtils
				.unsafeEval( "{'hh':'h ', 'mm':'min'}" ) );
		valueAxis.setAxisAlpha( 0 );
		amSerialChart.addValueAxis( valueAxis );

		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setBullet( "square" );
		amGraph.setBulletBorderAlpha( 1 );
		amGraph.setBulletBorderThickness( 1 );
		amGraph.setFillAlphas( 0.3 );
		amGraph.setFillColorsField( "lineColor" );
		amGraph.setLegendValueText( "[[value]]" );
		amGraph.setLineColorField( "lineColor" );
		amGraph.setTitle( "duration" );
		amGraph.setValueField( "duration" );
		amSerialChart.addGraph( amGraph );

		ChartScrollbar chartScrollbar = AmCharts.ChartScrollbar();
		amSerialChart.addChartScrollbar( chartScrollbar );

		ChartCursor chartCursor = AmCharts.ChartCursor();
		chartCursor.setCategoryBalloonDateFormat( "YYYY MMM DD" );
		chartCursor.setCursorAlpha( 0 );
		chartCursor.setZoomable( false );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setDataDateFormat( "YYYY-MM-DD" );
		amSerialChart.setCategoryField( "date" );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		DateFormat dateFormat1 = new DateFormat();
		dateFormat1.setPeriod( "DD" );
		dateFormat1.setFormat( "DD" );
		DateFormat dateFormat2 = new DateFormat();
		dateFormat2.setPeriod( "WW" );
		dateFormat2.setFormat( "MMM DD" );
		DateFormat dateFormat3 = new DateFormat();
		dateFormat3.setPeriod( "MM" );
		dateFormat3.setFormat( "MMM" );
		DateFormat dateFormat4 = new DateFormat();
		dateFormat4.setPeriod( "YYYY" );
		dateFormat4.setFormat( "YYYY" );
		ArrayList<IsDateFormat> dateFormats = new ArrayList<IsDateFormat>();
		dateFormats.add( dateFormat1 );
		dateFormats.add( dateFormat2 );
		dateFormats.add( dateFormat3 );
		dateFormats.add( dateFormat4 );
		categoryAxis.setDateFormats( dateFormats );
		categoryAxis.setParseDates( true );
		categoryAxis.setAutoGridCount( false );
		categoryAxis.setAxisColor( "#555555" );
		categoryAxis.setGridAlpha( 0 );
		categoryAxis.setGridCount( 50 );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
		LogUtils.log( amSerialChart );

	}
}