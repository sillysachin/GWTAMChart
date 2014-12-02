package com.appbootup.explore.gwt.client;

import com.amcharts.impl.AmChart;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.impl.util.WrapperUtils;
import com.amcharts.jso.AmChartJSO;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ResizeComposite;

public class GWTAMChartPanel extends ResizeComposite
{
	LayoutPanel divWrapper = new LayoutPanel();

	JSONObject chartJSONObject = null;

	String chartJSONString = "";

	AmChartJSO chartJSO = null;

	AmChart amChart = null;

	public GWTAMChartPanel( String id, JSONValue chartJSONObject )
	{
		setId( id );
		if ( chartJSONObject != null )
		{
			setChartJSONObect( ( JSONObject ) ( chartJSONObject ) );
		}
		initWidget( divWrapper );
		addStyleName( "roc-chart" );
	}

	public GWTAMChartPanel( String id, String chartJSONString )
	{
		setId( id );
		if ( "NoData".equals( chartJSONString ) )
		{
			FlowPanel noDataPanel = new FlowPanel();
			noDataPanel.setSize( 100 + Unit.PCT.getType(), 100 + Unit.PCT
					.getType() );

			Label noDataLbl = new Label();
			noDataLbl.setText( "No Data" );

			noDataPanel.add( noDataLbl );
			divWrapper.add( noDataPanel );
		}
		else if ( chartJSONString != null && !""
				.equals( chartJSONString.trim() ) && !"NoData"
				.equals( chartJSONString ) )
		{
			this.chartJSONString = chartJSONString;
			setChartJSONObect( ( JSONObject ) ( JSONParser
					.parseLenient( chartJSONString ) ) );
		}
		initWidget( divWrapper );
		addStyleName( "roc-chart" );
	}

	public String getId()
	{
		String id = divWrapper.getElement().getId();
		return id;
	}

	public void setId( String id )
	{
		divWrapper.getElement().setId( id );
	}

	private void setChartJSONObect( JSONValue chartJSONObject )
	{
		this.chartJSONObject = ( JSONObject ) ( chartJSONObject );
	}

	protected static native JavaScriptObject getJsonObject( String jsonString )
	/*-{
		return JSON.parseLenient(jsonString);
	}-*/;

	@Override
	protected void onLoad()
	{
		try
		{
			Scheduler.get().scheduleDeferred( new ScheduledCommand()
			{
				public void execute()
				{
					chartJSO = drawChart( getId(), chartJSONObject.isObject()
							.getJavaScriptObject() );
					amChart = ( AmChart ) WrapperUtils.wrap( chartJSO );
					onDrawChart();
				}
			} );
		}
		catch ( JavaScriptException caught )
		{
			GWT.log( "Exception while rendering the chart", caught );
		}
	}

	public void onDrawChart()
	{
	}

	protected static native AmChartJSO drawChart( String id, JavaScriptObject jso )
	/*-{
		var chart = $wnd.AmCharts.makeChart(id, jso);
		return chart;
	}-*/;

	public AmChart getAmChart()
	{
		return amChart;
	}

	public void addListener( String eventName, AmChartListener amChartListener )
	{
		getAmChart().addListener( eventName, amChartListener );
	}
}