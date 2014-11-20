package com.appbootup.explore.gwt.client.line;

import com.amcharts.api.IsChartCursor;
import com.amcharts.api.IsChartScrollbar;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ChartScrollbar;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
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

public class DateBasedData
{
	public DateBasedData()
	{
		GWTAMChart.chartService
				.getData( "/data/dateBasedData.json", new AsyncCallback<String>()
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
		amSerialChart.setDataDateFormat( "YYYY-MM-DD" );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setId( "v1" );
		valueAxis.setAxisAlpha( 0 );
		valueAxis.setPosition( "left" );
		amSerialChart.addValueAxis( valueAxis );

		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setId( "g1" );
		amGraph.setBullet( "round" );
		amGraph.setBulletBorderAlpha( 1 );
		amGraph.setBulletColor( "#FFFFFF" );
		amGraph.setBulletSize( 5 );
		amGraph.setHideBulletsCount( 50 );
		amGraph.setLineThickness( 2 );
		amGraph.setTitle( "red line" );
		amGraph.setUseLineColorForBulletBorder( true );
		amGraph.setValueField( "value" );
		amSerialChart.addGraph( amGraph );

		IsChartScrollbar chartScrollbar = new ChartScrollbar();
		chartScrollbar.setGraph( "g1" );
		chartScrollbar.setScrollbarHeight( 30 );
		amSerialChart.addChartScrollbar( chartScrollbar );

		IsChartCursor chartCursor = new ChartCursor();
		chartCursor.setCursorPosition( "mouse" );
		chartCursor.setPan( true );
		chartCursor.setValueLineEnabled( true );
		chartCursor.setValueLineBalloonEnabled( true );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setCategoryField( "date" );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setParseDates( true );
		categoryAxis.setDashLength( 1 );
		categoryAxis.setPosition( "top" );
		categoryAxis.setMinorGridEnabled( true );

		ExportConfig exportConfig = new ExportConfig();
		exportConfig.setMenuRight( 20 );
		exportConfig.setMenuBottom( 50 );
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amSerialChart.setExportConfig( exportConfig );

		AmChartListener zoomChart = new AmChartListener()
		{
			public void function( AmChartEventJSO event )
			{
				amSerialChart.zoomToIndexes( chartData.length() - 40, chartData
						.length() - 1 );
			}
		};
		amSerialChart.addListener( "rendered", zoomChart );
		zoomChart( chartData, amSerialChart );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}

	private void zoomChart( final JsArray<JavaScriptObject> chartData, final AmSerialChart amSerialChart )
	{
		amSerialChart.zoomToIndexes( chartData.length() - 40, chartData
				.length() - 1 );
	}
}