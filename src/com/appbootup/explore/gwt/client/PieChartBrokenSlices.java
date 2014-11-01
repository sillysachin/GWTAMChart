package com.appbootup.explore.gwt.client;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.Slice;
import com.amcharts.impl.event.AmChartEvent;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.event.DataContext;
import com.amcharts.impl.event.mouse.slicedchart.AmSliceEvent;
import com.amcharts.impl.event.mouse.slicedchart.ClickSliceEvent;
import com.amcharts.impl.event.mouse.slicedchart.ClickSliceHandler;
import com.amcharts.impl.event.mouse.slicedchart.RightClickSliceEvent;
import com.amcharts.impl.event.mouse.slicedchart.RightClickSliceHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class PieChartBrokenSlices
{
	public PieChartBrokenSlices()
	{
		GWTAMChart.chartService.getLineWithTrendLineChartData( "/data/pieChartBrokenSlices.json", new AsyncCallback<String>()
		{
			@Override
			public void onSuccess( String chartData )
			{
				JavaScriptObject pieDataProvider = JsonUtils.unsafeEval( chartData );
				simplePieChart( pieDataProvider );
			}

			@Override
			public void onFailure( Throwable caught )
			{
				GWT.log( "This Sucks", caught );
			}
		} );
	}

	protected void simplePieChart( JavaScriptObject chartData )
	{
		final AmPieChart amPieChart = AmCharts.AmPieChart();
		amPieChart.setDataProvider( chartData );
		amPieChart.setDataProvider( generateChartData( null ) );
		amPieChart.setTitleField( "type" );
		amPieChart.setValueField( "percent" );
		amPieChart.setOutlineColor( "#FFFFFF" );
		amPieChart.setOutlineAlpha( 0.8 );
		amPieChart.setOutlineThickness( 2 );
		amPieChart.setColorField( "color" );
		amPieChart.setPulledField( "pulled" );

		// ADD TITLE
		amPieChart.addTitle( "Click a slice to see the details" );
		amPieChart.setSize( "600px", "400px" );
		amPieChart.addClickSliceHandler( new ClickSliceHandler()
		{
			@Override
			public void onClickSlice( ClickSliceEvent event )
			{
				Integer selected = null;
				Slice dataItem = event.getDataItem();
				DataContext dataContext = dataItem.getDataContext();
				selected = dataContext.getId();
				GWT.log( event.getEvent().getClientX() + "" );
				log( event );
				amPieChart.setDataProvider( generateChartData( selected ) );
				amPieChart.validateData();
			}
		} );
		amPieChart.addClickSliceHandler( new ClickSliceHandler()
		{
			@Override
			public void onClickSlice( ClickSliceEvent event )
			{
				GWT.log( event.getEvent().getClientX() + "" );
			}
		} );
		amPieChart.addListener( RightClickSliceEvent.getName(), new AmChartListener()
		{
			@Override
			public void function( AmChartEvent< ? > event )
			{
				Integer selected = null;
				Slice dataItem = ( ( AmSliceEvent< ? > ) event ).getDataItem();
				DataContext dataContext = dataItem.getDataContext();
				selected = dataContext.getId();
				GWT.log( event.getEvent().getClientX() + "" );
				log( event );
				amPieChart.setDataProvider( generateChartData( selected ) );
				amPieChart.validateData();
			}
		} );
		amPieChart.addRightClickSliceHandler( new RightClickSliceHandler()
		{
			@Override
			public void onRightClickSlice( RightClickSliceEvent event )
			{
				Integer selected = null;
				Slice dataItem = event.getDataItem();
				DataContext dataContext = dataItem.getDataContext();
				selected = dataContext.getId();
				GWT.log( event.getEvent().getClientX() + "" );
				log( event );
				amPieChart.setDataProvider( generateChartData( selected ) );
				amPieChart.validateData();
			}
		} );
		RootLayoutPanel.get().add( amPieChart );
	}

	private native void log( AmChartEvent< ? > event )
	/*-{
		console.log(event);
		//JSON.stringify(event, null, 4)
	}-*/;

	private native JavaScriptObject generateChartData( Integer selected )
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
		return chartData;
	}-*/;
}