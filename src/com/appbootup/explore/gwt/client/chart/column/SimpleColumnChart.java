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

public class SimpleColumnChart
{
	public SimpleColumnChart()
	{
		GWTAMChart.chartService
				.getData( "/data/simpleColumnChart.json", new AsyncCallback<String>()
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
		amSerialChart.setPathToImages( "/js/amcharts/images/" );
		amSerialChart.setDataProvider( chartData );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setGridColor( "FFFFFF" );
		valueAxis.setDashLength( 0 );
		valueAxis.setGridAlpha( 0.2 );
		amSerialChart.addValueAxis( valueAxis );

		amSerialChart.setGridAboveGraphs( true );
		amSerialChart.setStartDuration( 1 );

		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setBalloonText( "<b>[[category]]: [[value]]</b>" );
		amGraph.setLineAlpha( 0.2 );
		amGraph.setFillAlphas( 0.9 );
		amGraph.setType( "column" );
		amGraph.setValueField( "visits" );
		amSerialChart.addGraph( amGraph );

		ChartCursor chartCursor = new ChartCursor();
		chartCursor.setCategoryBalloonEnabled( false );
		chartCursor.setCursorAlpha( 0 );
		chartCursor.setZoomable( false );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setCategoryField( "country" );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setGridPosition( "start" );
		categoryAxis.setGridAlpha( 45 );
		categoryAxis.setTickPosition( "start" );
		categoryAxis.setTickLength( 20 );

		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		exportConfig.setMenuTop( 0 );
		amSerialChart.setExportConfig( exportConfig );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}
}