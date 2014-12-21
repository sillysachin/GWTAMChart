package com.appbootup.explore.gwt.client.chart.pie;

import com.amcharts.api.IsSlice;
import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.event.AmChartEventJSO;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.DataContext;
import com.amcharts.impl.wrapper.AbstractChartWrapper;
import com.appbootup.explore.gwt.client.GWTAMChart;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class PieChartBrokenSlices extends AbstractChartWrapper
{
	public PieChartBrokenSlices()
	{
		GWTAMChart.chartService
				.getData( "/data/pieChartBrokenSlices.json", new AsyncCallback<String>()
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
		final AmPieChart amPieChart = AmCharts.AmPieChart();
		amPieChart.setDataProvider( chartData );
		amPieChart.setDataProvider( generateChartData( null ) );
		amPieChart.setTitleField( "type" );
		amPieChart.setValueField( "percent" );
		amPieChart.setOutlineColor( "#FFFFFF" );
		amPieChart.setOutlineAlpha( 0.8 );
		amPieChart.setOutlineThickness( 2.0 );
		amPieChart.setColorField( "color" );
		amPieChart.setPulledField( "pulled" );

		// ADD TITLE
		amPieChart.addTitle( "Click a slice to see the details" );
		amPieChart.addListener( "rightClickSlice", new AmChartListener()
		{
			@Override
			public void function( AmChartEventJSO event )
			{
				IsSlice dataItem = ( IsSlice ) event.getDataItem();
				DataContext dataContext = ( DataContext ) dataItem
						.getDataContext();
				Integer selected = dataContext.getId();
				amPieChart.setDataProvider( generateChartData( selected ) );
				amPieChart.validateData();
			}
		} );
		setAmChart( amPieChart );
		getReadyCallback().onReady();
	}

	private native JsArray<JavaScriptObject> generateChartData( Integer selected )
	/*-{
		var types = [ {
			type : "Fossil Energy",
			percent : 70,
			color : "#ff9e01",
			subs : [ {
				type : "Oil",
				percent : 15
			}, {
				type : "Coal",
				percent : 35
			}, {
				type : "Nuclear",
				percent : 20
			} ]
		}, {
			type : "Green Energy",
			percent : 30,
			color : "#b0de09",
			subs : [ {
				type : "Hydro",
				percent : 15
			}, {
				type : "Wind",
				percent : 10
			}, {
				type : "Other",
				percent : 5
			} ]
		} ];

		var chartData = [];
		for (var i = 0; i < types.length; i++) {
			if (i == selected) {
				for (var x = 0; x < types[i].subs.length; x++) {
					chartData.push({
						type : types[i].subs[x].type,
						percent : types[i].subs[x].percent,
						color : types[i].color,
						pulled : true
					});
				}
			} else {
				chartData.push({
					type : types[i].type,
					percent : types[i].percent,
					color : types[i].color,
					id : i
				});
			}
		}
		console.log(chartData);
		return chartData;
	}-*/;
}