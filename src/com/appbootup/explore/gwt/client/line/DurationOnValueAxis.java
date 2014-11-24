package com.appbootup.explore.gwt.client.line;

import java.util.ArrayList;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmLegend;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.DateFormat;
import com.amcharts.impl.DurationUnits;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.ValueAxis;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class DurationOnValueAxis
{
	public DurationOnValueAxis()
	{
		GWTAMChart.chartService
				.getData( "/data/durationOnValueAxis.json", new AsyncCallback<String>()
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
		amSerialChart.setDataProvider( chartData );

		AmLegend amLegend = AmCharts.AmLegend();
		amLegend.setEqualWidths( false );
		amLegend.setUseGraphSettings( true );
		amLegend.setValueAlign( "left" );
		amLegend.setValueWidth( 100 );
		amSerialChart.setLegend( amLegend );

		ValueAxis valueAxis1 = AmCharts.ValueAxis();
		valueAxis1.setId( "distanceAxis" );
		valueAxis1.setAxisAlpha( 0 );
		valueAxis1.setGridAlpha( 0 );
		valueAxis1.setPosition( "left" );
		valueAxis1.setTitle( "distance" );
		amSerialChart.addValueAxis( valueAxis1 );

		ValueAxis valueAxis2 = AmCharts.ValueAxis();
		valueAxis2.setId( "latitudeAxis" );
		valueAxis2.setAxisAlpha( 0 );
		valueAxis2.setGridAlpha( 0 );
		valueAxis2.setPosition( "right" );
		valueAxis2.setLabelsEnabled( false );
		amSerialChart.addValueAxis( valueAxis2 );

		ValueAxis valueAxis3 = AmCharts.ValueAxis();
		valueAxis3.setId( "durationAxis" );
		valueAxis3.setDuration( "mm" );
		DurationUnits durationUnits = new DurationUnits();
		durationUnits.setHh( "h " );
		durationUnits.setMm( "min" );
		valueAxis3.setDurationUnits( durationUnits );
		valueAxis3.setAxisAlpha( 0 );
		valueAxis3.setGridAlpha( 0 );
		valueAxis3.setInside( true );
		valueAxis3.setPosition( "right" );
		valueAxis3.setTitle( "duration" );
		amSerialChart.addValueAxis( valueAxis3 );

		AmGraph amGraph1 = AmCharts.AmGraph();
		amGraph1.setAlphaField( "alpha" );
		amGraph1.setBalloonText( "[[value]] miles" );
		amGraph1.setDashLengthField( "dashLength" );
		amGraph1.setFillAlphas( 0.7 );
		amGraph1.setLegendPeriodValueText( "total: [[value.sum]] mi" );
		amGraph1.setType( "column" );
		amGraph1.setTitle( "distance" );
		amGraph1.setValueField( "distance" );
		amGraph1.setValueAxis( "distanceAxis" );
		amSerialChart.addGraph( amGraph1 );

		AmGraph amGraph2 = AmCharts.AmGraph();
		amGraph2.setBalloonText( "latitude:[[value]]" );
		amGraph2.setBullet( "round" );
		amGraph2.setBulletBorderAlpha( 1 );
		amGraph2.setUseLineColorForBulletBorder( true );
		amGraph2.setBulletColor( "#FFFFFF" );
		amGraph2.setBulletSizeField( "townSize" );
		amGraph2.setDashLengthField( "dashLength" );
		amGraph2.setDescriptionField( "townName" );
		amGraph2.setLabelPosition( "right" );
		amGraph2.setLabelText( "[[townName2]]" );
		amGraph2.setLegendValueText( "[[description]]/[[value]]" );
		amGraph2.setTitle( "latitude/city" );
		amGraph2.setFillAlphas( 0 );
		amGraph2.setValueField( "latitude" );
		amGraph2.setValueAxis( "latitudeAxis" );
		amSerialChart.addGraph( amGraph2 );

		AmGraph amGraph3 = AmCharts.AmGraph();
		amGraph3.setBullet( "square" );
		amGraph3.setBulletBorderAlpha( 1 );
		amGraph3.setBulletBorderThickness( 1 );
		amGraph3.setDashLengthField( "dashLength" );
		amGraph3.setLegendValueText( "[[value]]" );
		amGraph3.setTitle( "duration" );
		amGraph3.setFillAlphas( 0 );
		amGraph3.setValueField( "duration" );
		amGraph3.setValueAxis( "durationAxis" );

		amSerialChart.addGraph( amGraph3 );

		amSerialChart.setPlotAreaBorderAlpha( 0 );
		amSerialChart.setMarginTop( 10 );
		amSerialChart.setMarginLeft( 0 );
		amSerialChart.setMarginBottom( 0 );

		ChartCursor chartCursor = AmCharts.ChartCursor();
		chartCursor.setCategoryBalloonDateFormat( "DD" );
		chartCursor.setCursorAlpha( 0.1 );
		chartCursor.setColor( "#000000" );
		chartCursor.setFullWidth( true );
		chartCursor.setValueBalloonsEnabled( false );
		chartCursor.setZoomable( false );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setCategoryField( "date" );
		amSerialChart.setDataDateFormat( "YYYY-MM-DD" );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		ArrayList<DateFormat> dateFormats = new ArrayList<DateFormat>();
		DateFormat dateFormat1 = new DateFormat();
		dateFormat1.setPeriod( "DD" );
		dateFormat1.setFormat( "DD" );
		dateFormats.add( dateFormat1 );
		DateFormat dateFormat2 = new DateFormat();
		dateFormat2.setPeriod( "WW" );
		dateFormat2.setFormat( "MMM DD" );
		dateFormats.add( dateFormat2 );
		DateFormat dateFormat3 = new DateFormat();
		dateFormat3.setPeriod( "MM" );
		dateFormat3.setFormat( "MMM" );
		dateFormats.add( dateFormat3 );
		DateFormat dateFormat4 = new DateFormat();
		dateFormat4.setPeriod( "YYYY" );
		dateFormat4.setFormat( "YYYY" );
		dateFormats.add( dateFormat4 );
		categoryAxis.setDateFormats( dateFormats );
		categoryAxis.setParseDates( true );
		categoryAxis.setAutoGridCount( false );
		categoryAxis.setAxisColor( "#555555" );
		categoryAxis.setGridAlpha( 0.1 );
		categoryAxis.setGridColor( "#FFFFFF" );
		categoryAxis.setGridCount( 50 );

		ExportConfig exportConfig = new ExportConfig();
		exportConfig.setMenuBottom( "20px" );
		exportConfig.setMenuRight( "22px" );
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amSerialChart.setExportConfig( exportConfig );

		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}
}