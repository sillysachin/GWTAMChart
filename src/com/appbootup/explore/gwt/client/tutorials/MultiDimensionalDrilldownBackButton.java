package com.appbootup.explore.gwt.client.tutorials;

import java.util.ArrayList;
import java.util.List;

import com.amcharts.api.IsLabel;
import com.amcharts.api.IsTitle;
import com.amcharts.impl.AmChart;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ChartDataIndex;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.Item;
import com.amcharts.impl.Label;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.Title;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.DataContext;
import com.amcharts.impl.event.chart.RenderedEvent;
import com.amcharts.impl.event.chart.RenderedHandler;
import com.amcharts.impl.util.LogUtils;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ContextMenuEvent;
import com.google.gwt.event.dom.client.ContextMenuHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class MultiDimensionalDrilldownBackButton
{
	public MultiDimensionalDrilldownBackButton()
	{
		GWTAMChart.chartService
				.getData( "/data/multiDimensionalDrilldownBackButton.json", new AsyncCallback<String>()
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
		amSerialChart.setPathToImages( "/js/amcharts/images/" );
		String chartTitle = "Base";
		final List<ChartDataIndex> chartDataIndexes = new ArrayList<ChartDataIndex>();

		ArrayList<Title> titles = new ArrayList<Title>();
		Title title = new Title();
		titles.add( title );
		title.setText( chartTitle );
		amSerialChart.setTitles( titles );

		ArrayList<Label> allLabels = new ArrayList<Label>();
		Label label = new Label();
		label.setText( "" );
		label.setX( "150" );
		label.setY( "10" );
		label.setUrl( "javascript: goBack();void(0);" );
		allLabels.add( label );
		amSerialChart.setAllLabels( allLabels );
		amSerialChart.setDataProvider( chartData );

		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setAxisAlpha( 0 );
		valueAxis.setDashLength( 4 );
		valueAxis.setPosition( "left" );
		amSerialChart.addValueAxis( valueAxis );
		// GRAPHS
		AmGraph amGraph1 = AmCharts.AmGraph();
		amGraph1.setId( "fromGraph" );
		amGraph1.setLineAlpha( 0 );
		amGraph1.setShowBalloon( false );
		amGraph1.setValueField( "fromValue" );
		amGraph1.setFillAlphas( 0 );
		amSerialChart.addGraph( amGraph1 );
		AmGraph amGraph2 = AmCharts.AmGraph();
		amGraph2.setFillAlphas( 0.2 );
		amGraph2.setFillToGraph( "fromGraph" );
		amGraph2.setLineAlpha( 0 );
		amGraph2.setShowBalloon( false );
		amGraph2.setValueField( "toValue" );
		amSerialChart.addGraph( amGraph2 );
		AmGraph amGraph3 = AmCharts.AmGraph();
		amGraph3.setValueField( "value" );
		amGraph3.setFillAlphas( 0 );
		amGraph3.setBulletField( "bullet" );
		amSerialChart.addGraph( amGraph3 );

		ChartCursor chartCursor = AmCharts.ChartCursor();
		chartCursor.setZoomable( false );
		chartCursor.setFullWidth( true );
		chartCursor.setCategoryBalloonEnabled( false );
		chartCursor.setCursorAlpha( 0.1 );
		amSerialChart.addChartCursor( chartCursor );

		amSerialChart.setDataDateFormat( "YYYY-MM-DD HH:NN:SS" );
		amSerialChart.setCategoryField( "date" );

		// AXES
		// category axis
		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setParseDates( true );// as our data is date-based, we set parseDates to true
		categoryAxis.setMinPeriod( "mm" );// our data is daily, so we set minPeriod to DD   
		categoryAxis.setAxisAlpha( 0 );
		categoryAxis.setMinHorizontalGap( 50 );
		categoryAxis.setGridAlpha( 0 );
		categoryAxis.setTickLength( 0 );

		ExportConfig exportConfig = new ExportConfig();
		exportConfig.setMenuTop( "20px" );
		exportConfig.setMenuRight( "20px" );
		MenuItem menuItem1 = new MenuItem();
		menuItem1.setIcon( "/js/amcharts/images/export.png" );
		menuItem1.setFormat( "png" );
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
		amSerialChart.setExportConfig( exportConfig );

		amSerialChart.addRenderedHandler( new RenderedHandler()
		{
			@Override
			public void onRendered( RenderedEvent event )
			{
				Anchor amChartMenu = new Anchor( "<b>Go Back</b>", true );
				amChartMenu.addStyleName( "gwtAmChartMenu" );
				amChartMenu.addClickHandler( new ClickHandler()
				{
					@Override
					public void onClick( ClickEvent event )
					{
						GWT.log("This is funny.");
					}
				} );
				amSerialChart.addContent( amChartMenu );
			}
		} );
		
		amSerialChart.addHandler( new ContextMenuHandler()
		{
			@Override
			public void onContextMenu( ContextMenuEvent event )
			{
				LogUtils.log( "context" );
			}
		}, ContextMenuEvent.getType() );

		amSerialChart.addListener( "clickGraph", new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO evt )
			{
				LogUtils.log( "ola" );
			}
		} );

		amSerialChart.addListener( "clickGraphItem", new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO evt )
			{
				DataContext dataContext = evt.getItem().getDataContext();
				JsArray<JavaScriptObject> subSet = dataContext.getSubSet();
				if ( subSet != null && subSet.length() > 0 )
				{
					AmChart amChart = evt.getChart();
					ChartDataIndex chartDataIndex = new ChartDataIndex();
					chartDataIndex.setIndex( evt.getIndex() );
					String subSetTitle = dataContext.getSubSetTitle();
					chartDataIndex.setTitle( subSetTitle );
					List<IsTitle> chartTitles = evt.getChart().getTitles();
					Title title = ( Title ) chartTitles.get( 0 );//FIXME: Why the casting?.
					String titleText = title.getText();
					chartDataIndex.setPrev( titleText );
					chartDataIndexes.add( chartDataIndex );
					amChart.setDataProvider( subSet );
					List<IsLabel> allChartLabels = evt.getChart()
							.getAllLabels();
					Label label = ( Label ) allChartLabels.get( 0 );//FIXME: Why the casting?
					label.setText( "Go Back " + titleText );
					title.setText( subSetTitle );
					amChart.validateData();
				}
				onClickGraphItem( evt );//FIXME: Massive Thabadthob code.
			}
		} );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}

	protected native void onClickGraphItem( AmChartEventJSO evt )
	/*-{
		function goBack() {
			var previousData = chartData;
			var tmp = {
				prev : ""
			}

			// Remove latest
			chartDataIndexes.pop();

			// Get previous cached object
			for (var i = 0; i < chartDataIndexes.length; i++) {
				tmp = chartDataIndexes[i];
				previousData = previousData[tmp.index].subSet;
			}

			// Apply titles and stuff
			chart.allLabels[0].text = tmp.prev ? "Go Back " + tmp.prev : "";
			chart.titles[0].text = tmp.title || chartTitle;
			chart.dataProvider = previousData;
			chart.validateData();
		}
	}-*/;
}