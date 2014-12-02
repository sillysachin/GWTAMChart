package com.appbootup.explore.gwt.client.tutorials;

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
import com.amcharts.impl.DurationUnits;
import com.amcharts.impl.JsFunction;
import com.amcharts.impl.ValueAxis;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class UpdatingBalloonTooltip
{
	public UpdatingBalloonTooltip()
	{
		GWTAMChart.chartService
				.getData( "/data/updatingBalloonTooltip.json", new AsyncCallback<String>()
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
		amSerialChart.setCategoryField( "date" );
		amSerialChart.setDataDateFormat( "YYYY-MM-DD" );
		amSerialChart.setMarginTop( 0 );

		AmBalloon amBalloon = AmCharts.AmBalloon();
		amBalloon.setCornerRadius( 6 );
		amSerialChart.setBalloon( amBalloon );
		amBalloon.setAdjustBorderColor( false );
		amBalloon.setHorizontalPadding( 10 );
		amBalloon.setVerticalPadding( 10 );

		// GRAPHS
		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setTitle( "duration" );
		amGraph.setValueField( "duration" );
		amGraph.setType( "line" );
		amGraph.setLineColorField( "lineColor" );
		amGraph.setFillColorsField( "lineColor" );
		amGraph.setFillAlphas( 0.3 );
		amGraph.setBalloonText( "[[value]]" );
		amGraph.setLineThickness( 1 );
		amGraph.setLegendValueText( "[[value]]" );
		amGraph.setBullet( "square" );
		amGraph.setBulletBorderThickness( 1 );
		amGraph.setBulletBorderAlpha( 1 );
		JsFunction balloonFunction = new JsFunction();
		String adjustBalloonText = getFunctionString();
		balloonFunction.setFunctionString( adjustBalloonText );
		amGraph.setBalloonFunction( balloonFunction ); // TODO: Chart does not seem to be picking up fill color for balloons.
		amSerialChart.addGraph( amGraph );

		ChartCursor chartCursor = AmCharts.ChartCursor();
		chartCursor.setCategoryBalloonDateFormat( "YYYY MMM DD" );
		chartCursor.setCursorAlpha( 0 );
		chartCursor.setZoomable( false );
		amSerialChart.addChartCursor( chartCursor );

		// AXES
		// category axis
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
		// we want custom date formatting, so we change it in next line
		ArrayList<IsDateFormat> dateFormats = new ArrayList<IsDateFormat>();
		dateFormats.add( dateFormat1 );
		dateFormats.add( dateFormat2 );
		dateFormats.add( dateFormat3 );
		dateFormats.add( dateFormat4 );
		categoryAxis.setDateFormats( dateFormats );
		categoryAxis.setParseDates( true );// as our data is date-based, we set parseDates to true
		categoryAxis.setMinPeriod( "DD" );// our data is daily, so we set minPeriod to DD   
		categoryAxis.setAutoGridCount( false );
		categoryAxis.setAxisColor( "#555555" );
		categoryAxis.setGridColor( "#000000" );
		categoryAxis.setGridAlpha( 0 );
		categoryAxis.setGridCount( 50 );

		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}

	private String getFunctionString()
	{
		StringBuilder functionString = new StringBuilder();
		functionString
				.append( "function adjustBalloonText(graphDataItem, graph){" );
		functionString.append( "    var value = graphDataItem.values.value;" );
		functionString.append( "    if(value < 500){" );
		functionString.append( "        return value + '<br>(Little)';" );
		functionString.append( "    }" );
		functionString.append( "    else{" );
		functionString.append( "        return value + '<br>(A Lot)';" );
		functionString.append( "    }" );
		functionString.append( "}" );
		return functionString.toString();
	}
}