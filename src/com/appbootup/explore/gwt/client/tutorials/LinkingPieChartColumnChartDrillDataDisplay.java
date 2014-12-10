package com.appbootup.explore.gwt.client.tutorials;

import java.util.ArrayList;
import java.util.List;

import com.amcharts.api.IsValueAxis;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.Slice;
import com.amcharts.impl.Title;
import com.amcharts.impl.ValueAxis;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.DataContext;
import com.amcharts.impl.util.LogUtils;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class LinkingPieChartColumnChartDrillDataDisplay
{
	public LinkingPieChartColumnChartDrillDataDisplay()
	{
		GWTAMChart.chartService
				.getData( "/data/linkingPieChartColumnChartDrillDataDisplay.json", new AsyncCallback<String>()
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
		final JsArray<JavaScriptObject> collectiveData = getCollectiveData( chartData );

		LogUtils.log( chartData );
		AmPieChart amPieChart = AmCharts.AmPieChart();
		amPieChart.setDataProvider( chartData );
		amPieChart.setValueField( "projects" );
		amPieChart.setTitleField( "department" );
		amPieChart.setLabelText( "[[title]]: [[value]]" );
		amPieChart.setPullOutOnlyOne( true );

		final AmSerialChart amSerialChart = AmCharts.AmSerialChart();
		amSerialChart.setTheme( "none" );
		amSerialChart.setPathToImages( AmCharts.JS_AMCHARTS_IMAGES );
		amSerialChart.setAutoMargins( false );
		amSerialChart.setMarginLeft( 30 );
		amSerialChart.setMarginRight( 8 );
		amSerialChart.setMarginTop( 10 );
		amSerialChart.setMarginBottom( 26 );

		List<Title> titles = new ArrayList<Title>();
		Title title = new Title();
		title.setText( "All Departments" );
		titles.add( title );
		amSerialChart.setTitles( titles );
		amSerialChart.setDataProvider( collectiveData );

		// GRAPHS
		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setTitle( "projects" );
		amGraph.setValueField( "projects" );
		amGraph.setType( "column" );
		amGraph.setFillAlphas( 0.8 );
		amSerialChart.addGraph( amGraph );

		amSerialChart.setCategoryField( "category" );

		// AXES
		// category axis
		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setGridCount( 50 );
		categoryAxis.setAutoGridCount( false );
		categoryAxis.setGridPosition( "start" );

		List<IsValueAxis> valueAxes = new ArrayList<IsValueAxis>();
		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setIntegersOnly( true );
		valueAxes.add( valueAxis );
		amSerialChart.setValueAxes( valueAxes );

		amPieChart.setSize( "620px", "400px" );
		amSerialChart.setSize( "620px", "400px" );

		amPieChart.addListener( "pullOutSlice", new AmChartListener()
		{
			public void function( AmChartEventJSO event )
			{
				Slice dataItem = ( Slice ) event.getDataItem();
				DataContext dataContext = ( DataContext ) dataItem
						.getDataContext();
				amSerialChart
						.setDataProvider( ( JsArray<JavaScriptObject> ) dataContext
								.get( "months" ) );
				Title amSerialChartTitle = ( Title ) amSerialChart.getTitles()
						.get( 0 );
				amSerialChartTitle.setText( ( String ) dataContext
						.get( "department" ) );

				amSerialChart.validateData();
				amSerialChart.animateAgain();
			}
		} );
		amPieChart.addListener( "pullInSlice", new AmChartListener()
		{
			public void function( AmChartEventJSO event )
			{
				amSerialChart.setDataProvider( collectiveData );
				Title amSerialChartTitle = ( Title ) amSerialChart.getTitles()
						.get( 0 );
				amSerialChartTitle.setText( "All departments" );
				amSerialChart.validateData();
				amSerialChart.animateAgain();
			}
		} );

		HorizontalPanel contentWrapper = new HorizontalPanel();
		contentWrapper.add( amPieChart );
		contentWrapper.add( amSerialChart );
		RootLayoutPanel.get().add( contentWrapper );
	}

	private native JsArray<JavaScriptObject> getCollectiveData( JsArray<JavaScriptObject> chartData )
	/*-{
		var collectiveData = [];
		for ( var x in chartData) {
			var dataPoint = chartData[x];
			if (0 == x) {
				for ( var y in dataPoint.months) {
					collectiveData.push({
						"category" : dataPoint.months[y].category,
						"projects" : dataPoint.months[y].projects
					});
				}
			} else {
				for ( var y in dataPoint.months) {
					collectiveData[y].projects += dataPoint.months[y].projects;
				}
			}
		}
		return collectiveData;
	}-*/;
}