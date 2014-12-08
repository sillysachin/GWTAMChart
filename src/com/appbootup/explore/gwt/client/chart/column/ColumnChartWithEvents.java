package com.appbootup.explore.gwt.client.chart.column;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.chart.RenderedEvent;
import com.amcharts.impl.event.chart.RenderedHandler;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ColumnChartWithEvents
{
	public ColumnChartWithEvents()
	{
		GWTAMChart.chartService
				.getData( "/data/columnChartWithEvents.json", new AsyncCallback<String>()
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
		final AmSerialChart amSerialChart = AmCharts.AmSerialChart();
		amSerialChart.setTheme( "none" );
		amSerialChart.setPathToImages( AmCharts.JS_AMCHARTS_IMAGES );
		amSerialChart.setDataProvider( chartData );

		amSerialChart.setAutoMargins( false );
		amSerialChart.setMarginLeft( 30 );
		amSerialChart.setMarginRight( 8 );
		amSerialChart.setMarginTop( 10 );
		amSerialChart.setMarginBottom( 26 );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setPosition( "left" );
		valueAxis.setAxisAlpha( 0.2 );
		amSerialChart.addValueAxis( valueAxis );

		amSerialChart.setStartDuration( 1 );

		AmGraph amGraph1 = AmCharts.AmGraph();
		amGraph1.setBalloonText( "<span style='font-size:13px;'>[[title]] in [[category]]:<b>[[value]]</b> [[additional]]</span>" );
		amGraph1.setAlphaField( "alpha" );
		amGraph1.setDashLengthField( "dashLengthColumn" );
		amGraph1.setFillAlphas( 1 );
		amGraph1.setType( "column" );
		amGraph1.setTitle( "Income" );
		amGraph1.setValueField( "income" );
		amSerialChart.addGraph( amGraph1 );

		AmGraph amGraph2 = AmCharts.AmGraph();
		amGraph2.setBalloonText( "<span style='font-size:13px;'>[[title]] in [[category]]:<b>[[value]]</b> [[additional]]</span>" );
		amGraph2.setBullet( "round" );
		amGraph2.setDashLengthField( "dashLengthLine" );
		amGraph2.setLineThickness( 3 );
		amGraph2.setBulletSize( 7 );
		amGraph2.setBulletBorderAlpha( 1 );
		amGraph2.setBulletColor( "#FFFFFF" );
		amGraph2.setBulletBorderThickness( 3 );
		//TODO: Cannot see setUseLineColorForBulletBorder api in AMChart documentation.
		amGraph2.setUseLineColorForBulletBorder( true );
		amGraph2.setFillAlphas( 0 );
		amGraph2.setLineAlpha( 1 );
		amGraph2.setType( "column" );
		amGraph2.setTitle( "Expenses" );
		amGraph2.setValueField( "expenses" );
		amSerialChart.addGraph( amGraph2 );

		amSerialChart.setCategoryField( "year" );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setGridPosition( "start" );
		categoryAxis.setAxisAlpha( 0 );
		categoryAxis.setTickLength( 0 );

		ExportConfig exportConfig = new ExportConfig();
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( AmCharts.JS_AMCHARTS_IMAGES+"export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		exportConfig.setMenuTop( 0 );
		amSerialChart.setExportConfig( exportConfig );
		amSerialChart.setSize( "1240px", "500px" );

		final AmChartListener handleClick = new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO event )
			{
				GWT.log( "handleClick - > " + event.getValue() );
			}
		};
		final AmChartListener handleOver = new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO event )
			{
				//TODO: target needs allow jsni to invoke setAttr. Target is currently a JSO.
				//event.getTarget().setAttr( "cursor", "default" );
				//event.getTarget().setAttr( "fill", "#000000" );
				GWT.log( "handleOver - > " + event.getValue() );
			}
		};
		final AmChartListener handleOut = new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO event )
			{
				//TODO: target needs allow jsni to invoke setAttr. Target is currently a JSO.
				//event.getTarget().setAttr( "cursor", "pointer" );
				//event.getTarget().setAttr( "fill", "#CC0000" );
				GWT.log( "handleOut - > " );
			}
		};

		amSerialChart.addListener( "rendered", new AmChartListener()
		{
			public void function( AmChartEventJSO event )
			{
				GWT.log( "rendered" );
				CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
				categoryAxis.addListener( "clickItem", handleClick );
				categoryAxis.addListener( "rollOverItem", handleOver );
				categoryAxis.addListener( "rollOutItem", handleOut );
			}
		} );

		amSerialChart.addRenderedHandler( new RenderedHandler()
		{
			@Override
			public void onRendered( RenderedEvent event )
			{
				GWT.log( "renderedHandler -> " + event.getType() );
				CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
			}
		} );

		amSerialChart.addListener( "clickGraphItem", new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO event )
			{
				JavaScriptObject axes = event.getClickItem()
						.getSerialDataItem().getAxes();
				//TODO: IsSerialDataItemAxis isSerialDataItemAxis = axes.get( 0 );
				//TODO: IsGraphDataItem isGraphDataItem = isSerialDataItemAxis.getGraphs().get( 0 );
			}
		} );

		RootLayoutPanel.get().add( amSerialChart );
	}
}