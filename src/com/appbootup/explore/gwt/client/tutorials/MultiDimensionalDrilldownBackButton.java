package com.appbootup.explore.gwt.client.tutorials;

import java.util.ArrayList;
import java.util.Stack;

import com.amcharts.api.IsTitle;
import com.amcharts.impl.AmChart;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmExport;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ChartDataIndex;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.Item;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.MenuItemOutput;
import com.amcharts.impl.MenuItemOutputCallback;
import com.amcharts.impl.Title;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.DataContext;
import com.amcharts.impl.wrapper.AbstractChartWrapper;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MultiDimensionalDrilldownBackButton extends AbstractChartWrapper
{
	final Stack<ChartDataIndex> chartDataIndexes = new Stack<ChartDataIndex>();

	private String chartTitle = "Base";

	private String id;

	public MultiDimensionalDrilldownBackButton( String id )
	{
		this.id = id;
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
		final HorizontalPanel amToolbar = new HorizontalPanel();
		final HTML htmlAmChartMenuGoBack = new HTML( "<b>Go Back</b> : ", true );
		final Anchor anchorAmChartMenuGoBack = new Anchor( "", true );

		final AmSerialChart amSerialChart = AmCharts.AmSerialChart( id );
		amSerialChart.setTheme( "none" );
		GWT.log( AmCharts.JS_AMCHARTS_IMAGES );
		amSerialChart.setPathToImages( AmCharts.JS_AMCHARTS_IMAGES );

		ArrayList<IsTitle> titles = new ArrayList<IsTitle>();
		final Title title = new Title();
		titles.add( title );
		title.setText( chartTitle );
		amSerialChart.setTitles( titles );
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
		menuItem1.setIcon( AmCharts.JS_AMCHARTS_IMAGES + "export.png" );
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

		MenuItemOutput menuItemOutput = AmCharts.MenuItemOutput();
		menuItemOutput.setOnClick( new MenuItemOutputCallback()
		{
			@Override
			public void execute( AmExport instance, MenuItemOutput config )
			{
				GWT.log( "Cool" );
			}
		} );
		//FIXME: Incomplete.
		//exportConfig.setMenuItemOutput( menuItemOutput );

		amSerialChart.setExportConfig( exportConfig );

		amSerialChart.addListener( "rendered", new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO event )
			{
				htmlAmChartMenuGoBack.addStyleName( "gwt-AmChartMenu" );
				anchorAmChartMenuGoBack.addStyleName( "gwt-AmChartMenu" );
				anchorAmChartMenuGoBack.addClickHandler( new ClickHandler()
				{
					@Override
					public void onClick( ClickEvent event )
					{
						goBack( chartData, amSerialChart, anchorAmChartMenuGoBack );
					}
				} );
				amToolbar.add( htmlAmChartMenuGoBack );
				amToolbar.add( anchorAmChartMenuGoBack );
			}
		} );

		amSerialChart.addListener( "clickGraphItem", new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO evt )
			{
				DataContext dataContext = ( DataContext ) evt.getItem()
						.getDataContext();
				JsArray<JavaScriptObject> subSet = dataContext.getSubSet();
				if ( subSet != null && subSet.length() > 0 )
				{
					AmChart amChart = evt.getChart();
					ChartDataIndex chartDataIndex = new ChartDataIndex();
					chartDataIndex.setIndex( evt.getIndex() );
					String subSetTitle = dataContext.getSubSetTitle();
					chartDataIndex.setTitle( subSetTitle );
					String titleText = title.getText();
					chartDataIndex.setPrev( titleText );
					chartDataIndexes.push( chartDataIndex );
					amChart.setDataProvider( subSet );
					anchorAmChartMenuGoBack.setText( titleText );
					title.setText( subSetTitle );
					amChart.validateData();
				}
			}
		} );
		VerticalPanel content = new VerticalPanel();
		content.add( amToolbar );
		content.add( amSerialChart.asWidget() );

		setChartWidget( content );
		getReadyCallback().onReady();
	}

	private void goBack( final JsArray<JavaScriptObject> chartData, AmSerialChart amSerialChart, Anchor anchorAmChartMenuGoBack )
	{
		JsArray<JavaScriptObject> previousData = chartData;
		ChartDataIndex tmp = new ChartDataIndex();
		tmp.setPrev( "" );

		// Remove latest
		chartDataIndexes.pop();
		// Get previous cached object
		for ( ChartDataIndex chartDataIndex : chartDataIndexes )
		{
			tmp = chartDataIndex;
			JavaScriptObject javaScriptObject = previousData.get( tmp
					.getIndex() );
			previousData = getSubSet( javaScriptObject );
		}

		// Apply titles and stuff
		anchorAmChartMenuGoBack
				.setText( tmp.getPrev() != null ? tmp.getPrev() : "" );

		Title amSerialChartTitle = ( Title ) amSerialChart.getTitles().get( 0 );
		if ( tmp.getTitle() != null )
		{
			amSerialChartTitle.setText( tmp.getTitle() );
		}
		else
		{
			amSerialChartTitle.setText( chartTitle );
		}
		amSerialChart.setDataProvider( previousData );
		amSerialChart.validateData();
	}

	private native JsArray<JavaScriptObject> getSubSet( JavaScriptObject data )
	/*-{
		return data.subSet;
	}-*/;
}