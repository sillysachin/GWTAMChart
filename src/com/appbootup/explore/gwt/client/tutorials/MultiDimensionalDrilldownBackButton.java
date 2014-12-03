package com.appbootup.explore.gwt.client.tutorials;

import java.util.ArrayList;
import java.util.List;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ExportConfig;
import com.amcharts.impl.Label;
import com.amcharts.impl.MenuItem;
import com.amcharts.impl.Title;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.DataContext;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
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
		List<Object> chartDataIndexes = new ArrayList<Object>();

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
		MenuItem menuItem = new MenuItem();
		menuItem.setIcon( "/js/amcharts/images/export.png" );
		menuItem.setFormat( "png" );
		exportConfig.addMenuItem( menuItem );
		amSerialChart.setExportConfig( exportConfig );

		amSerialChart.addListener( "clickGraphItem", new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO evt )
			{
				DataContext dataContext = evt.getItem().getDataContext();//FIXME: Massive Thabadthob code.
				onClickGraphItem( evt );//FIXME: Massive Thabadthob code.
			}
		} );
		amSerialChart.setSize( "1240px", "500px" );
		RootLayoutPanel.get().add( amSerialChart );
	}

	protected native void onClickGraphItem( AmChartEventJSO evt )
	/*-{
		if ($wnd.chartDataIndexes == undefined) {
			$wnd.chartDataIndexes = [];
			$wnd.chart = evt.chart;
			$wnd.chartData = evt.chart.dataProvider;
			$wnd.chartTitle = evt.chart.text;
			
			$wnd.goBack = function() {
				var previousData = $wnd.chartData;
				var tmp = {
					prev : ""
				}

				// Remove latest
				$wnd.chartDataIndexes.pop();

				// Get previous cached object
				for (var i = 0; i < $wnd.chartDataIndexes.length; i++) {
					tmp = $wnd.chartDataIndexes[i];
					previousData = previousData[tmp.index].subSet;
				}

				// Apply titles and stuff
				$wnd.chart.allLabels[0].text = tmp.prev ? "Go Back " + tmp.prev : "";
				$wnd.chart.titles[0].text = tmp.title || $wnd.chartTitle;
				$wnd.chart.dataProvider = previousData;
				$wnd.chart.validateData();
			}
		}

		if (evt.item.dataContext.subSet) {
			$wnd.chartDataIndexes.push({
				index : evt.index,
				title : evt.item.dataContext.subSetTitle,
				prev : evt.chart.titles[0].text
			});
			evt.chart.dataProvider = evt.item.dataContext.subSet;
			evt.chart.allLabels[0].text = "Go Back " + evt.chart.titles[0].text;
			evt.chart.titles[0].text = evt.item.dataContext.subSetTitle;
			evt.chart.validateData();
		}
	}-*/;
}