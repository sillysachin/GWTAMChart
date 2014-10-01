package com.appbootup.explore.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
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

	JSONObject chartJSONObjectWrapper = null;

	JavaScriptObject chart;

	String chartJSONString = "";

	public GWTAMChartPanel( String id, JSONValue jsonValue )
	{
		setId( id );

		if ( jsonValue != null )
		{
			setChartJSONObect( ( JSONObject ) ( jsonValue ) );
		}
		initWidget( divWrapper );
		addStyleName( "roc-chart" );
	}

	public GWTAMChartPanel( String id, String chartJSONString )
	{
		this( id, chartJSONString, null, null, null, null, null, null );
	}

	public GWTAMChartPanel( String id, String chartJSONString, String drilldownName, String drilldownCategories, String drilldownJson, String drilldownSeriesTypes, String chartDrilldownSmcdXTitle, String chartDrilldownSmcdYTitle )
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

	private void setChartJSONObect( JSONValue chartJSONValueWrapper )
	{
		chartJSONObjectWrapper = ( JSONObject ) ( chartJSONValueWrapper );
	}

	protected static native JavaScriptObject getJsonObject( String jsonString )
	/*-{
		return JSON.parse(jsonString);
	}-*/;

	protected static native JavaScriptObject drawChart( String id, JavaScriptObject jso )
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
					String jsonString = chartJSONString;
					chart = drawChart( getId(), JsonUtils.unsafeEval( jsonString ) );
				}
			} );
		}
		catch ( JavaScriptException caught )
		{
			GWT.log( "Exception while rendering the chart", caught );
		}
	}
}