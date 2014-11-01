package com.appbootup.explore.gwt.client;

import com.amcharts.impl.AmBalloon;
import com.amcharts.impl.AmFunnelChart;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
import com.amcharts.jso.AmFunnelChartJSO;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ThreeDFunnelChart
{
	public ThreeDFunnelChart()
	{
		GWTAMChart.chartService.getLineWithTrendLineChartData( "/data/threeDFunnelChart.json", new AsyncCallback<String>()
		{
			@Override
			public void onSuccess( String chartData )
			{
				JavaScriptObject pieDataProvider = JsonUtils.unsafeEval( chartData );
				drawChart( pieDataProvider );
			}

			@Override
			public void onFailure( Throwable caught )
			{
				GWT.log( "This Sucks", caught );
			}
		} );
	}

	protected void drawChart( JavaScriptObject chartData )
	{
		AmFunnelChart amFunnelChart = new AmFunnelChart();
		amFunnelChart.setDataProvider( chartData );
		amFunnelChart.setTheme( "none" );
		amFunnelChart.setValueField( "value" );
		amFunnelChart.setTitleField( "title" );
		amFunnelChart.setSize( "600px", "400px" );
		amFunnelChart.setMarginRight( 240 );
		amFunnelChart.setMarginLeft( 50 );
		amFunnelChart.setStartX( -500 );
		amFunnelChart.setDepth3D( 100 );
		amFunnelChart.setAngle( 40 );
		amFunnelChart.setOutlineAlpha( 1 );
		amFunnelChart.setOutlineColor( "#FFFFFF" );
		amFunnelChart.setOutlineThickness( 2 );
		amFunnelChart.setLabelPosition( "right" );
		AmBalloon balloon = new AmBalloon();
		balloon.setFixedPosition( true );
		balloon.setColor( "#F0F0F0" );
		balloon.setFillColor( "#0F0F0F" );
		amFunnelChart.setBalloon( balloon );
		amFunnelChart.setBalloonText( "[[title]]: [[value]]n[[description]]" );
		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amFunnelChart.setExportConfig( exportConfig );
		amFunnelChart.setGroupPercent( 5.0 );
		AmFunnelChartJSO jso = amFunnelChart.getJso();
		GWT.log( "valueField - >" + jso.getValueField() );
		GWT.log( "valueField - >" + amFunnelChart.getValueField() );
		RootLayoutPanel.get().add( amFunnelChart );
	}
}