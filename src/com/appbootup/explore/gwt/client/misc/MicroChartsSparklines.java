package com.appbootup.explore.gwt.client.misc;

import com.amcharts.impl.AmChartTheme;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ValueAxis;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class MicroChartsSparklines
{
	public MicroChartsSparklines()
	{
		GWTAMChart.chartService
				.getData( "/data/microChartsSparklines.json", new AsyncCallback<String>()
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

	protected void drawChart( JsArray<JavaScriptObject> chart1Data )
	{
		AmSerialChart chart1 = AmCharts.AmSerialChart( AmChartTheme.NONE );
		chart1.setDataProvider( chart1Data );
		chart1.setCategoryField( "day" );
		chart1.setAutoMargins( false );
		chart1.setMarginLeft( 0 );
		chart1.setMarginRight( 5 );
		chart1.setMarginTop( 0 );
		chart1.setMarginBottom( 0 );

		AmGraph graph1 = AmCharts.AmGraph();
		graph1.setValueField( "value" );
		graph1.setBulletField( "bullet" );
		graph1.setShowBalloon( false );
		graph1.setLineColor( "#a9ec49" );
		chart1.addGraph( graph1 );

		ValueAxis valueAxis1 = AmCharts.ValueAxis();
		valueAxis1.setGridAlpha( 0 );
		valueAxis1.setAxisAlpha( 0 );
		chart1.addValueAxis( valueAxis1 );

		CategoryAxis categoryAxis1 = chart1.getCategoryAxis();
		categoryAxis1.setGridAlpha( 0 );
		categoryAxis1.setAxisAlpha( 0 );
		categoryAxis1.setStartOnAxis( true );
		//chart1.write( "line1" );
		chart1.setSize( "200px", "50px" );
		RootLayoutPanel.get().add( chart1 );

		// small column chart
		AmSerialChart chart2 = AmCharts.AmSerialChart( AmChartTheme.NONE );
		chart2.setDataProvider( getSmallColumnChartData() );
		chart2.setCategoryField( "day" );
		chart2.setAutoMargins( false );
		chart2.setMarginLeft( 0 );
		chart2.setMarginRight( 0 );
		chart2.setMarginTop( 0 );
		chart2.setMarginBottom( 0 );

		AmGraph graph2 = AmCharts.AmGraph();
		graph2.setValueField( "value" );
		graph2.setType( "column" );
		graph2.setFillAlphas( 1 );
		graph2.setLineColor( "#a9ec49" );
		graph2.setShowBalloon( false );
		chart2.addGraph( graph2 );

		ValueAxis valueAxis2 = AmCharts.ValueAxis();
		valueAxis2.setGridAlpha( 0 );
		valueAxis2.setAxisAlpha( 0 );
		chart2.addValueAxis( valueAxis2 );

		CategoryAxis categoryAxis2 = chart2.getCategoryAxis();
		categoryAxis2.setGridAlpha( 0 );
		categoryAxis2.setAxisAlpha( 0 );
		//chart2.write( "column1" );
		chart2.setSize( "200px", "50px" );
		RootLayoutPanel.get().add( chart2 );

	}

	private final native JsArray<JavaScriptObject> getSmallColumnChartData()
	/*-{
		var data = [ {
			day : 1,
			value : -5
		}, {
			day : 2,
			value : 3
		}, {
			day : 3,
			value : 7
		}, {
			day : 4,
			value : -3
		}, {
			day : 5,
			value : 3
		}, {
			day : 6,
			value : 4
		}, {
			day : 7,
			value : 6
		}, {
			day : 8,
			value : -3
		}, {
			day : 9,
			value : -2
		}, {
			day : 10,
			value : 6
		} ]
		return data;
	}-*/;
}