package com.appbootup.explore.gwt.client.chart.column;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.AmLegend;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.ValueAxis;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class StackedColumnChart
{
	public StackedColumnChart()
	{
		GWTAMChart.chartService
				.getData( "/data/stackedColumnChart.json", new AsyncCallback<String>()
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
		amSerialChart.setDataProvider( chartData );
		
		AmLegend legend = new AmLegend();
		legend.setHorizontalGap(10);
		legend.setMaxColumns(10);
		//TODO: Provide a enum for position values.
		legend.setPosition("right");
		legend.setUseGraphSettings(true);
		legend.setMarkerSize(10);
		amSerialChart.setLegend( legend );
	    
		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setStackType( "regular" );
		valueAxis.setAxisAlpha( 0.3 );
		valueAxis.setGridAlpha( 0 );
		amSerialChart.addValueAxis( valueAxis );

		AmGraph amGraph1 = AmCharts.AmGraph();
		amGraph1.setBalloonText( "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>" );
		amGraph1.setFillAlphas( 0.8 );
		amGraph1.setLabelText("[[value]]");
		amGraph1.setLineAlpha( 0.3 );
		amGraph1.setTitle("Europe");
		amGraph1.setType( "column" );
		amGraph1.setValueField( "europe" );
		amGraph1.setColor( "#000000" );
		amSerialChart.addGraph( amGraph1 );

		AmGraph amGraph2 = AmCharts.AmGraph();
		amGraph2.setBalloonText( "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>" );
		amGraph2.setFillAlphas( 0.8 );
		amGraph2.setLabelText("[[value]]");
		amGraph2.setLineAlpha( 0.3 );
		amGraph2.setTitle("North America");
		amGraph2.setType( "column" );
		amGraph2.setValueField( "namerica" );
		amGraph2.setColor( "#000000" );
		amSerialChart.addGraph( amGraph2 );
		
		AmGraph amGraph3 = AmCharts.AmGraph();
		amGraph3.setBalloonText( "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>" );
		amGraph3.setFillAlphas( 0.8 );
		amGraph3.setLabelText("[[value]]");
		amGraph3.setLineAlpha( 0.3 );
		amGraph3.setTitle("Asia-Pacific");
		amGraph3.setType( "column" );
		amGraph3.setValueField( "asia" );
		amGraph3.setColor( "#000000" );
		amSerialChart.addGraph( amGraph3 );
		
		AmGraph amGraph4 = AmCharts.AmGraph();
		amGraph4.setBalloonText( "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>" );
		amGraph4.setFillAlphas( 0.8 );
		amGraph4.setLabelText("[[value]]");
		amGraph4.setLineAlpha( 0.3 );
		amGraph4.setTitle("Asia-Pacific");
		amGraph4.setType( "column" );
		amGraph4.setValueField( "asia" );
		amGraph4.setColor( "#000000" );
		amSerialChart.addGraph( amGraph4 );
	
		AmGraph amGraph5 = AmCharts.AmGraph();
		amGraph5.setBalloonText( "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>" );
		amGraph5.setFillAlphas( 0.8 );
		amGraph5.setLabelText("[[value]]");
		amGraph5.setLineAlpha( 0.3 );
		amGraph5.setTitle("Latin America");
		amGraph5.setType( "column" );
		amGraph5.setValueField( "lamerica" );
		amGraph5.setColor( "#000000" );
		amSerialChart.addGraph( amGraph5 );

		AmGraph amGraph6 = AmCharts.AmGraph();
		amGraph6.setBalloonText( "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>" );
		amGraph6.setFillAlphas( 0.8 );
		amGraph6.setLabelText("[[value]]");
		amGraph6.setLineAlpha( 0.3 );
		amGraph6.setTitle("Middle-East");
		amGraph6.setType( "column" );
		amGraph6.setValueField( "meast" );
		amGraph6.setColor( "#000000" );
		amSerialChart.addGraph( amGraph6 );

		AmGraph amGraph7 = AmCharts.AmGraph();
		amGraph7.setBalloonText( "<b>[[title]]</b><br><span style='font-size:14px'>[[category]]: <b>[[value]]</b></span>" );
		amGraph7.setFillAlphas( 0.8 );
		amGraph7.setLabelText("[[value]]");
		amGraph7.setLineAlpha( 0.3 );
		amGraph7.setTitle("Africa");
		amGraph7.setType( "column" );
		amGraph7.setValueField( "africa" );
		amGraph7.setColor( "#000000" );
		amSerialChart.addGraph( amGraph7 );
		
		amSerialChart.setCategoryField( "year" );

		//TODO: categoryAxis exists already and should not be created.
		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		//TODO: Provide a enum for gridPosition values.
		categoryAxis.setGridPosition( "start" );
		categoryAxis.setGridAlpha( 0 );
		categoryAxis.setAxisAlpha( 0 );
		//TODO: Provide a enum for position values.
		categoryAxis.setPosition( "left" );

		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		exportConfig.setMenuTop( 20 );
		exportConfig.setMenuRight( 20 );
		amSerialChart.setExportConfig( exportConfig );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}
}