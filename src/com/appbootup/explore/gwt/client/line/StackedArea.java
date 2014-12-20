package com.appbootup.explore.gwt.client.line;

import java.util.ArrayList;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmLegend;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ChartScrollbar;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.Guide;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.wrapper.AbstractChartWrapper;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class StackedArea extends AbstractChartWrapper
{
	public StackedArea()
	{
		GWTAMChart.chartService
				.getData( "/data/stackedArea.json", new AsyncCallback<String>()
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
		amSerialChart.setPathToImages( AmCharts.JS_AMCHARTS_IMAGES );
		amSerialChart.setDataProvider( chartData );

		AmLegend amLegend = AmCharts.AmLegend();
		amLegend.setEqualWidths( false );
		amLegend.setPeriodValueText( "total: [[value.sum]]" );
		amLegend.setPosition( "top" );
		amLegend.setValueAlign( "left" );
		amLegend.setValueWidth( 100 );
		amSerialChart.setLegend( amLegend );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setStackType( "regular" );
		valueAxis.setGridAlpha( 0.07 );
		valueAxis.setPosition( "left" );
		valueAxis.setTitle( "Traffic incidents" );
		amSerialChart.addValueAxis( valueAxis );

		AmGraph amGraph1 = AmCharts.AmGraph();
		amGraph1.setBalloonText( "<img src='http://www.amcharts.com/lib/3/images/car.png' style='vertical-align:bottom; margin-right: 10px; width:28px; height:21px;'><span style='font-size:14px; color:#000000;'><b>[[value]]</b></span>" );
		amGraph1.setFillAlphas( 0.6 );
		amGraph1.setHidden( true );
		amGraph1.setLineAlpha( 0.4 );
		amGraph1.setTitle( "Cars" );
		amGraph1.setValueField( "cars" );
		amSerialChart.addGraph( amGraph1 );
		AmGraph amGraph2 = AmCharts.AmGraph();
		amGraph2.setBalloonText( "<img src='http://www.amcharts.com/lib/3/images/motorcycle.png' style='vertical-align:bottom; margin-right: 10px; width:28px; height:21px;'><span style='font-size:14px; color:#000000;'><b>[[value]]</b></span>" );
		amGraph2.setFillAlphas( 0.6 );
		amGraph2.setLineAlpha( 0.4 );
		amGraph2.setTitle( "Motorcycles" );
		amGraph2.setValueField( "motorcycles" );
		amSerialChart.addGraph( amGraph2 );
		AmGraph amGraph3 = AmCharts.AmGraph();
		amGraph3.setBalloonText( "<img src='http://www.amcharts.com/lib/3/images/bicycle.png' style='vertical-align:bottom; margin-right: 10px; width:28px; height:21px;'><span style='font-size:14px; color:#000000;'><b>[[value]]</b></span>" );
		amGraph3.setFillAlphas( 0.6 );
		amGraph3.setLineAlpha( 0.4 );
		amGraph3.setTitle( "Bicycles" );
		amGraph3.setValueField( "bicycles" );
		amSerialChart.addGraph( amGraph3 );

		amSerialChart.setPlotAreaBorderAlpha( 0 );
		amSerialChart.setMarginTop( 10 );
		amSerialChart.setMarginLeft( 0 );
		amSerialChart.setMarginBottom( 0 );

		ChartScrollbar chartScrollbar = AmCharts.ChartScrollbar();
		amSerialChart.addChartScrollbar( chartScrollbar );

		ChartCursor chartCursor = AmCharts.ChartCursor();
		chartCursor.setCursorAlpha( 0 );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setCategoryField( "year" );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setStartOnAxis( true );
		categoryAxis.setAxisColor( "#DADADA" );
		categoryAxis.setGridAlpha( 0.07 );
		Guide guide1 = AmCharts.Guide();
		guide1.setCategory( "2001" );
		guide1.setToCategory( "2003" );
		guide1.setLineColor( "#CC0000" );
		guide1.setLineAlpha( 1 );
		guide1.setFillAlpha( 0.2 );
		guide1.setFillColor( "#CC0000" );
		;
		guide1.setDashLength( 2 );
		guide1.setInside( true );
		guide1.setLabelRotation( 90 );
		guide1.setLabel( "fines for speeding increased" );
		Guide guide2 = AmCharts.Guide();
		guide2.setCategory( "2007" );
		guide2.setLineColor( "#CC0000" );
		guide2.setLineAlpha( 1 );
		guide2.setDashLength( 2 );
		guide2.setInside( true );
		guide2.setLabelRotation( 90 );
		guide2.setLabel( "motorcycle fee introduced" );
		ArrayList<Guide> guides = new ArrayList<Guide>();
		guides.add( guide1 );
		guides.add( guide2 );
		categoryAxis.setGuides( guides );

		ExportConfig exportConfig = new ExportConfig();
		exportConfig.setMenuTop( "10px" );
		exportConfig.setMenuRight( "10px" );
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( AmCharts.JS_AMCHARTS_IMAGES + "export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amSerialChart.setExportConfig( exportConfig );

		setAmChart( amSerialChart );
		getReadyCallback().onReady();
	}
}