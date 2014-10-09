package com.appbootup.explore.gwt.client;

import com.amcharts.jso.AmChartJso;
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

	AmChartJso chartJSO = null;

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
			noDataPanel.setSize( 100 + Unit.PCT.getType(), 100 + Unit.PCT.getType() );

			Label noDataLbl = new Label();
			noDataLbl.setText( "No Data" );

			noDataPanel.add( noDataLbl );
			divWrapper.add( noDataPanel );
		}
		else if ( chartJSONString != null && !"".equals( chartJSONString.trim() ) && !"NoData".equals( chartJSONString ) )
		{
			this.chartJSONString = chartJSONString;
			setChartJSONObect( ( JSONObject ) ( JSONParser.parseLenient( chartJSONString ) ) );
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

	protected static native AmChartJso drawChart( String id, JavaScriptObject jso )
	/*-{
		var chart = $wnd.AmCharts.makeChart(id, jso);
		return chart;
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
					chartJSO = drawChart( getId(), chartJSONObject.isObject().getJavaScriptObject());
					GWT.log( "amChartJSO -> " + chartJSO.getType() );
				}
			} );
		}
		catch ( JavaScriptException caught )
		{
			GWT.log( "Exception while rendering the chart", caught );
		}
	}
}