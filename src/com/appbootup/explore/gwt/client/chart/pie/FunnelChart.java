package com.appbootup.explore.gwt.client.chart.pie;

import com.amcharts.impl.AmBalloon;
import com.amcharts.impl.AmFunnelChart;
import com.amcharts.jso.AmFunnelChartJSO;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class FunnelChart
{
	public FunnelChart()
	{
		GWTAMChart.chartService.getData( "/data/funnelChart.json", new AsyncCallback<String>()
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
		amFunnelChart.setTheme( "patterns" );
		amFunnelChart.setTitleField( "title" );
		amFunnelChart.setMarginRight( 160 );
		amFunnelChart.setMarginLeft( 15 );
		amFunnelChart.setLabelPosition( "right" );
		amFunnelChart.setFunnelAlpha(0.9);
		amFunnelChart.setValueField( "value" );
		amFunnelChart.setSize( "1240px", "500px" );
		amFunnelChart.setStartX( 0 );
		amFunnelChart.setNeckWidth( "30%" );
		amFunnelChart.setStartAlpha( 0 );
		amFunnelChart.setOutlineThickness( 1 );
		amFunnelChart.setNeckHeight( "40%" );
		amFunnelChart.setValueRepresents( "area" );
		AmBalloon balloon = new AmBalloon();
		balloon.setFixedPosition( true );
		balloon.setColor( "#F0F0F0" );
		balloon.setFillColor( "#0F0F0F" );
		amFunnelChart.setBalloon( balloon );
		amFunnelChart.setBalloonText( "[[title]]:<b>[[value]]</b>"  );
		AmFunnelChartJSO jso = amFunnelChart.getJso();
		GWT.log( "valueField - >" + jso.getValueField() );
		GWT.log( "valueField - >" + amFunnelChart.getValueField() );
		RootLayoutPanel.get().add( amFunnelChart );
	}
}