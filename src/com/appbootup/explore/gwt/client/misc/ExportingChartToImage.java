package com.appbootup.explore.gwt.client.misc;

import com.amcharts.api.IsChartCursor;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmExport;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.MenuItemOutput;
import com.amcharts.impl.MenuItemStyle;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.util.LogUtils;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ExportingChartToImage
{
	public ExportingChartToImage()
	{
		GWTAMChart.chartService
				.getData( "/data/exportingChartToImage.json", new AsyncCallback<String>()
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
		amSerialChart.setPathToImages( "/js/amcharts/images/" );
		amSerialChart.setDataProvider( chartData );

		amSerialChart.setDepth3D( 20 );
		amSerialChart.setAngle( 30 );

		//TODO: categoryAxis exists already and should not be created.
		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setLabelRotation( 90 );
		categoryAxis.setGridPosition( "start" );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setTitle( "Visitors" );
		amSerialChart.addValueAxis( valueAxis );

		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setValueField( "visits" );
		amGraph.setColorField( "color" );
		amGraph.setType( "column" );
		amGraph.setLineAlpha( 0.1 );
		amGraph.setFillAlphas( 1 );
		amSerialChart.addGraph( amGraph );

		IsChartCursor chartCursor = new ChartCursor();
		chartCursor.setCursorAlpha( 0 );
		chartCursor.setZoomable( false );
		chartCursor.setCategoryBalloonEnabled( false );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setCategoryField( "country" );

		AmExport amExport = AmCharts.AmExport();
		amExport.setTop( "21" );
		amExport.setRight( "20" );
		amExport.setExportJPG( true );
		amExport.setExportPNG( true );
		amExport.setExportSVG( true );

		ExportConfig exportConfig = AmCharts.ExportConfig();
		//exportConfig.setMenuTop( "auto" );
		//exportConfig.setMenuLeft( "auto" );
		//exportConfig.setMenuRight( "0px" );
		//exportConfig.setMenuBottom( "0px" );
		MenuItem menuItem1 = new MenuItem();
		menuItem1.setTitle( "JPG" );
		menuItem1.setFormat( "jpg" );
		exportConfig.addMenuItem( menuItem1 );
		MenuItem menuItem2 = new MenuItem();
		menuItem2.setTitle( "PNG" );
		menuItem2.setFormat( "png" );
		exportConfig.addMenuItem( menuItem2 );
		MenuItem menuItem3 = new MenuItem();
		menuItem3.setTitle( "SVG" );
		menuItem3.setFormat( "svg" );
		exportConfig.addMenuItem( menuItem3 );
		MenuItem menuItem4 = new MenuItem();
		menuItem4.setTitle( "PDF" );
		menuItem4.setFormat( "pdf" );
		exportConfig.addMenuItem( menuItem4 );

		MenuItemStyle menuItemStyle = AmCharts.MenuItemStyle();
		menuItemStyle.setBackgroundColor( "transparent" );
		menuItemStyle.setOpacity( 1 );
		menuItemStyle.setRollOverBackgroundColor( "#EFEFEF" );
		menuItemStyle.setColor( "#000000" );
		menuItemStyle.setRollOverColor( "#CC0000" );
		menuItemStyle.setPaddingTop( "6px" );
		menuItemStyle.setPaddingRight( "6px" );
		menuItemStyle.setPaddingBottom( "6px" );
		menuItemStyle.setPaddingLeft( "6px" );
		menuItemStyle.setMarginTop( "0px" );
		menuItemStyle.setMarginRight( "0px" );
		menuItemStyle.setMarginBottom( "0px" );
		menuItemStyle.setMarginLeft( "0px" );
		menuItemStyle.setTextAlign( "left" );
		menuItemStyle.setTextDecoration( "none" );
		menuItemStyle.setFontFamily( "Arial" ); // Default: charts default
		menuItemStyle.setFontSize( "12px" ); // Default: charts default		
		exportConfig.setMenuItemStyle( menuItemStyle );
		//MenuItemOutput menuItemOutput = AmCharts.MenuItemOutput();
		//menuItemOutput.setBackgroundColor( "#FFFFFF" );
		//menuItemOutput.setFileName( "amCharts" );
		//menuItemOutput.setFormat( "png" );
		//menuItemOutput.setOutput( "dataurlnewwindow" );
		//menuItemOutput.setRender( "browser" );
		//menuItemOutput.setDpi( 90 );
		//menuItemOutput.setOnclick( new MenuItemOutputCallback()
		//{
		//	public void execute(JavaScriptObject instance,JavaScriptObject config,JavaScriptObject event)
		//	{
		//		function(instance, config, event) {
		//			event.preventDefault();
		//			instance.output(config);
		//		}
		//	}
		//} );

		//exportConfig.setMenuItemOutput( menuItemOutput );
		exportConfig.setRemoveImagery( true );
		amExport.setUserCFG( exportConfig );
		amSerialChart.setAmExport( amExport );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
		LogUtils.log( amExport.getJso() );
	}
}