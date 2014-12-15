package com.appbootup.explore.gwt.client.xy;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmLegend;
import com.amcharts.impl.AmXYChart;
import com.amcharts.impl.ValueAxis;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class BubbleChart
{
	public BubbleChart()
	{
		GWTAMChart.chartService
				.getData( "/data/bubbleChart.json", new AsyncCallback<String>()
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
		final AmXYChart amXYChart = AmCharts.AmXYChart();
		amXYChart.setTheme( "none" );
		amXYChart.setPathToImages( AmCharts.JS_AMCHARTS_IMAGES );
		amXYChart.setDataProvider( chartData );

		AmLegend legend = new AmLegend();
		legend.setUseGraphSettings( true );
		amXYChart.setLegend( legend );

		ValueAxis valueAxis1 = AmCharts.ValueAxis();
		valueAxis1.setAxisAlpha( 0 );
		valueAxis1.setPosition( "bottom" );
		amXYChart.addValueAxis( valueAxis1 );

		ValueAxis valueAxis2 = AmCharts.ValueAxis();
		valueAxis2.setMinMaxMultiplier( 1.2 );
		valueAxis2.setAxisAlpha( 0 );
		valueAxis2.setPosition( "left" );
		amXYChart.addValueAxis( valueAxis2 );

		amXYChart.setStartDuration( 2 );

		AmGraph amGraph1 = AmCharts.AmGraph();
		amGraph1.setBalloonText( "x:<b>[[x]]</b> y:<b>[[y]]</b><br>value:<b>[[value]]</b>" );
		amGraph1.setBullet( "circle" );
		amGraph1.setBulletBorderAlpha( 0.2 );
		amGraph1.setBulletAlpha( .8 );
		amGraph1.setLineAlpha( 0 );
		amGraph1.setFillAlphas( 0 );
		amGraph1.setValueField( "value" );
		amGraph1.setXField( "x" );
		amGraph1.setYField( "y" );
		amGraph1.setMaxBulletSize( 100 );
		amXYChart.addGraph( amGraph1 );

		AmGraph amGraph2 = AmCharts.AmGraph();
		amGraph2.setBalloonText( "x:<b>[[x]]</b> y:<b>[[y]]</b><br>value:<b>[[value]]</b>" );
		amGraph2.setBullet( "diamond" );
		amGraph2.setBulletBorderAlpha( 0.2 );
		amGraph2.setBulletAlpha( .8 );
		amGraph2.setLineAlpha( 0 );
		amGraph2.setFillAlphas( 0 );
		amGraph2.setValueField( "value2" );
		amGraph2.setXField( "x2" );
		amGraph2.setYField( "y2" );
		amGraph2.setMaxBulletSize( 100 );
		amXYChart.addGraph( amGraph2 );

		amXYChart.setMarginLeft( 46 );
		amXYChart.setMarginBottom( 35 );
		amXYChart.asWidget();
	}
}