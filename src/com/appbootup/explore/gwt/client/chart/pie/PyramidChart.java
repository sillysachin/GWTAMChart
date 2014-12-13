package com.appbootup.explore.gwt.client.chart.pie;

import com.amcharts.impl.AmBalloon;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmFunnelChart;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class PyramidChart
{
	public PyramidChart()
	{
		GWTAMChart.chartService.getData( "/data/pyramidChart.json", new AsyncCallback<String>()
		{
			@Override
			public void onSuccess( String chartData )
			{
				JsArray<JavaScriptObject> dataProvider = JsonUtils.unsafeEval( chartData );
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
		AmFunnelChart amFunnelChart = new AmFunnelChart();
		amFunnelChart.setDataProvider( chartData );
		amFunnelChart.setTheme( "none" );
		amFunnelChart.setValueField( "value" );
		amFunnelChart.setTitleField( "title" );
		amFunnelChart.setSize( "310px", "125px" );
		amFunnelChart.setMarginRight( 240.0 );
		amFunnelChart.setMarginLeft( 50.0 );
		amFunnelChart.setStartX( -500 );
		amFunnelChart.setRotate( true );
		amFunnelChart.setLabelPosition( "right" );
		AmBalloon balloon =  AmCharts.AmBalloon();
		balloon.setFixedPosition( true );
		balloon.setColor( "#F0F0F0" );
		balloon.setFillColor( "#0F0F0F" );
		amFunnelChart.setBalloon( balloon );
		amFunnelChart.setBalloonText( "[[title]]: [[value]]n[[description]]" );
		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( AmCharts.JS_AMCHARTS_IMAGES+"export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amFunnelChart.setExportConfig( exportConfig );
		amFunnelChart.setGroupPercent( 5.0 );
		RootLayoutPanel.get().add( amFunnelChart );
	}
}