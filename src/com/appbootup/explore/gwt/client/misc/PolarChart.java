package com.appbootup.explore.gwt.client.misc;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmRadarChart;
import com.amcharts.impl.Guide;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.wrapper.AbstractChartWrapper;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class PolarChart extends AbstractChartWrapper
{
	public PolarChart()
	{
		GWTAMChart.chartService
				.getData( "/data/polarChart.json", new AsyncCallback<String>()
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
		AmRadarChart amRadarChart = AmCharts.AmRadarChart();
		amRadarChart.setDataProvider( chartData );
		amRadarChart.setTheme( "none" );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setGridType( "circle" );
		valueAxis.setMinimum( 0 );
		valueAxis.setAutoGridCount( false );
		valueAxis.setAxisAlpha( 0.2 );
		valueAxis.setFillAlpha( 0.05 );
		valueAxis.setFillColor( "#FFFFFF" );
		valueAxis.setGridAlpha( 0.08 );

		Guide guide1 = AmCharts.Guide();
		guide1.setAngle( 225 );
		guide1.setFillAlpha( 0.3 );
		guide1.setFillColor( "#0066CC" );
		guide1.setTickLength( 0 );
		guide1.setToAngle( 315 );
		guide1.setToValue( 14 );
		guide1.setValue( 0 );
		guide1.setLineAlpha( 0 );
		valueAxis.addGuide( guide1 );

		Guide guide2 = AmCharts.Guide();
		guide2.setAngle( 45 );
		guide2.setFillAlpha( 0.3 );
		guide2.setFillColor( "#CC3333" );
		guide2.setTickLength( 0 );
		guide2.setToAngle( 135 );
		guide2.setToValue( 14 );
		guide2.setValue( 0 );
		guide2.setLineAlpha( 0 );
		valueAxis.addGuide( guide2 );
		valueAxis.setPosition( "left" );
		amRadarChart.addValueAxis( valueAxis );
		amRadarChart.setStartDuration( 1 );
		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setBalloonText( "[[category]]: [[value]] m/s" );
		amGraph.setBullet( "round" );
		amGraph.setFillAlphas( 0.3 );
		amGraph.setValueField( "value" );
		amRadarChart.addGraph( amGraph );
		amRadarChart.setCategoryField( "direction" );
		amChart = amRadarChart;
		getReadyCallback().onReady();
	}
}