package com.appbootup.explore.gwt.client.misc;

import com.amcharts.api.IsChartCursor;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmExport;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.Item;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.MenuItemOutput;
import com.amcharts.impl.MenuItemOutputCallback;
import com.amcharts.impl.MenuItemStyle;
import com.amcharts.impl.ValueAxis;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ExportingChartToImage
{
	// Exporting charts and maps as an image or PDF
	// http://www.amcharts.com/tutorials/exporting-charts-and-maps-as-an-image-or-pdf/
	// Saving exported image on a server
	// http://www.amcharts.com/tutorials/saving-exported-image-on-a-server/
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
		amSerialChart.setPathToImages( AmCharts.JS_AMCHARTS_IMAGES );
		amSerialChart.setDataProvider( chartData );

		amSerialChart.setDepth3D( 20 );
		amSerialChart.setAngle( 30 );

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
		amExport.setExportPDF( true );

		ExportConfig exportConfig = AmCharts.ExportConfig();
		MenuItem menuItem1 = new MenuItem();
		menuItem1.setIcon( AmCharts.JS_AMCHARTS_IMAGES+"export.png" );
		menuItem1.setIconTitle( "Save chart as an image" );
		menuItem1.setTextAlign( "center" );
		Item item1 = AmCharts.Item();
		item1.setTitle( "JPG" );
		item1.setFormat( "jpg" );
		menuItem1.addItem( item1 );
		Item item2 = AmCharts.Item();
		item2.setTitle( "PNG" );
		item2.setFormat( "png" );
		menuItem1.addItem( item2 );
		Item item3 = AmCharts.Item();
		item3.setTitle( "SVG" );
		item3.setFormat( "svg" );
		menuItem1.addItem( item3 );
		Item item4 = AmCharts.Item();
		item4.setTitle( "PDF" );
		item4.setFormat( "pdf" );
		menuItem1.addItem( item4 );
		exportConfig.addMenuItem( menuItem1 );

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

		MenuItemOutput menuItemOutput = AmCharts.MenuItemOutput();
		menuItemOutput.setBackgroundColor( "#FFFFFF" );
		menuItemOutput.setFileName( "amCharts" );
		menuItemOutput.setFormat( "png" );
		menuItemOutput.setOutput( "dataurlnewwindow" );
		menuItemOutput.setRender( "browser" );
		menuItemOutput.setDpi( 90 );
		menuItemOutput.setOnClick( new MenuItemOutputCallback()
		{
			@Override
			public void execute( AmExport instance, MenuItemOutput config )
			{
				instance.output( config );
			}
		} );
		//TODO: Why do we need this?
		//exportConfig.setMenuItemOutput( menuItemOutput );
		exportConfig.setRemoveImagery( true );
		amExport.setUserCFG( exportConfig );
		amSerialChart.setAmExport( amExport );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}
}