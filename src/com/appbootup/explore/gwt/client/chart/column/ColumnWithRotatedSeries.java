package com.appbootup.explore.gwt.client.chart.column;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmExport;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ValueAxis;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ColumnWithRotatedSeries
{
	public ColumnWithRotatedSeries()
	{
		GWTAMChart.chartService
				.getData( "/data/columnWithRotatedSeries.json", new AsyncCallback<String>()
				{
					@Override
					public void onSuccess( String chartData )
					{
						JavaScriptObject dataProvider = JsonUtils
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

	protected void drawChart( JavaScriptObject chartData )
	{
		final AmSerialChart amSerialChart = AmCharts.AmSerialChart();
		amSerialChart.setTheme( "none" );
		amSerialChart.setPathToImages( "../js/amcharts/images/" );
		amSerialChart.setDataProvider( chartData );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setAxisAlpha( 0 );
		valueAxis.setPosition( "left" );
		valueAxis.setTitle( "Visitors from country" );
		amSerialChart.addValueAxis( valueAxis );

		amSerialChart.setStartDuration( 1 );

		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setBalloonText( "<b>[[category]]: [[value]]</b>" );
		amGraph.setColorField( "color" );
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

		//TODO: categoryAxis exists already and should not be created.
		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setGridPosition( "start" );
		categoryAxis.setLabelRotation( 45 );

		amSerialChart.setAmExport( new AmExport() );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}
}