package com.appbootup.explore.gwt.client.chart.column;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
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

public class ThreeDCylinderChart
{
	public ThreeDCylinderChart()
	{
		GWTAMChart.chartService
				.getData( "/data/threeDCylinderChart.json", new AsyncCallback<String>()
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
		final AmSerialChart amSerialChart = AmCharts.AmSerialChart();
		amSerialChart.setTheme( "none" );
		amSerialChart.setDataProvider( chartData );
		amSerialChart.setStartDuration( 2 );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setPosition( "left" );
		valueAxis.setAxisAlpha( 0 );
		valueAxis.setGridAlpha( 0 );
		amSerialChart.addValueAxis( valueAxis );

		AmGraph amGraph1 = AmCharts.AmGraph();
		amGraph1.setBalloonText( "[[category]]: <b>[[value]]</b>" );
		amGraph1.setColorField( "color" );
		amGraph1.setFillAlphas( 0.85 );
		amGraph1.setLineAlpha( 0.1 );
		amGraph1.setType( "column" );
		amGraph1.setTopRadius( 1 );
		amGraph1.setValueField( "visits" );
		amSerialChart.addGraph( amGraph1 );

		amSerialChart.setDepth3D( 40 );
		amSerialChart.setAngle( 30 );

		ChartCursor chartCursor = new ChartCursor();
		chartCursor.setCategoryBalloonEnabled( false );
		chartCursor.setCursorAlpha( 0 );
		chartCursor.setZoomable( false );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setCategoryField( "country" );

		//TODO: CategoryAxis exists already and should not be created.
		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		//TODO: Provide a enum for gridPosition values.
		categoryAxis.setGridPosition( "start" );
		categoryAxis.setGridAlpha( 0 );
		categoryAxis.setAxisAlpha( 0 );
		//TODO: Provide a enum for position values.
		categoryAxis.setPosition( "left" );

		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( AmCharts.JS_AMCHARTS_IMAGES+"export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		exportConfig.setMenuTop( 20 );
		exportConfig.setMenuRight( 20 );
		amSerialChart.setExportConfig( exportConfig );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}
}