package com.appbootup.explore.gwt.client;

import java.util.Date;

import com.amcharts.impl.AmCharts;
import com.amcharts.impl.AmGraph;
import com.amcharts.impl.AmPieChart;
import com.amcharts.impl.AmSerialChart;
import com.amcharts.impl.CategoryAxis;
import com.amcharts.impl.ChartCursor;
import com.amcharts.impl.ChartScrollbar;
import com.amcharts.impl.Guide;
import com.amcharts.impl.TrendLine;
import com.amcharts.impl.ValueAxis;
import com.amcharts.jso.AmChartJSO;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTAMChart implements EntryPoint
{
	/**
	 * The message displayed to the user when the server cannot be reached or returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while " + "attempting to contact the server. Please check your network " + "connection and try again.";

	private static final String JSON_URL = GWT.getModuleBaseURL() + "json/amchart?q=";

	final static ChartServiceAsync chartService = GWT.create( ChartService.class );

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		// pieChartByJSNI();
		// serialChartByJSNI();
		// chartByServerJSON();
		// lineWithTrendLineChartByJSNI();
		// SimplePieChart simplePieChart = new SimplePieChart();
		//ThreeDPieChart threeDPieChart = new ThreeDPieChart();
		//DonutChart threeDPieChart = new DonutChart();
		ThreeDDonutChart threeDDonutChart = new ThreeDDonutChart();
	}

	private void pieChartByJSNI()
	{
		String pieData = "[{title:\"Pie Dogs have eaten\",value:70},{title:\"Pie Dogs haven\'t eaten\",value:30}]";
		AmPieChart amPieChart = AmCharts.AmPieChart();
		amPieChart.setSize( "600px", "400px" );
		JavaScriptObject pieDataProvider = JsonUtils.unsafeEval( pieData );
		amPieChart.setDataProvider( pieDataProvider );
		amPieChart.setValueField( "value" );
		amPieChart.setTitleField( "title" );
		GWT.log( "Render to -> " + amPieChart.getId() );
		RootLayoutPanel.get().add( amPieChart );
	}

	private void serialChartByJSNI()
	{
		AmSerialChart amSerialChart = AmCharts.AmSerialChart();
		amSerialChart.setSize( "600px", "400px" );
		JavaScriptObject serialDataProvider = JsonUtils.unsafeEval( "[{\"country\": \"USA\",\"visits\": 4252},{\"country\": \"China\",\"visits\": 1882},{\"country\": \"Japan\",\"visits\": 1809}]" );
		amSerialChart.setDataProvider( serialDataProvider );
		amSerialChart.setCategoryField( "country" );
		amSerialChart.setAngle( 30.0 );
		amSerialChart.setDepth3D( 15.0 );

		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		categoryAxis.setAutoGridCount( false );
		categoryAxis.setGridCount( 3 );
		categoryAxis.setGridPosition( "start" );
		categoryAxis.setLabelRotation( 90 );

		AmGraph amGraph = AmCharts.AmGraph();
		amGraph.setValueField( "visits" );
		amGraph.setType( "column" );
		amGraph.setFillAlphas( 0.8 );
		amGraph.setBalloonText( "[[category]]: <b>[[value]]</b>" );
		amGraph.setType( "line" );
		amGraph.setFillAlphas( 0.5 );

		amGraph.setFillAlphas( 0 ); // or delete this line, as 0 is default
		amGraph.setBullet( "round" );
		amGraph.setLineColor( "#8d1cc6" );

		amSerialChart.addGraph( amGraph );
		GWT.log( "Render to -> " + amSerialChart.getId() );
		RootLayoutPanel.get().add( amSerialChart );
	}

	private void chartByServerJSON()
	{
		String url = JSON_URL;
		url = URL.encode( url );

		RequestBuilder builder = new RequestBuilder( RequestBuilder.GET, url );

		try
		{
			builder.sendRequest( null, new RequestCallback()
			{
				public void onError( Request request, Throwable exception )
				{
					GWT.log( "Couldn't retrieve JSON" );
				}

				public void onResponseReceived( Request request, Response response )
				{
					if ( 200 == response.getStatusCode() )
					{
						String text = response.getText();
						AmChartJSO amChartJSO = JsonUtils.<AmChartJSO> safeEval( text );
						GWT.log( "amChartJSO -> " + amChartJSO.getType() );
						GWTAMChartPanel amChartPanel = new GWTAMChartPanel( "chart-dashboard", text );
						RootLayoutPanel.get().add( amChartPanel );
					}
					else
					{
						GWT.log( "Couldn't retrieve JSON (" + response.getStatusText() + ")" );
					}
				}
			} );
		}
		catch ( RequestException e )
		{
			GWT.log( SERVER_ERROR );
		}
	}

	private void lineWithTrendLineChartByJSNI()
	{

		chartService.getLineWithTrendLineChartData( "/data/lineWithTrendLines.json", new AsyncCallback<String>()
		{
			@Override
			public void onSuccess( String chartData )
			{
				lineWithTrendLines( chartData );
			}

			@Override
			public void onFailure( Throwable caught )
			{
				GWT.log( "This Sucks", caught );
			}
		} );
	}

	private void lineWithTrendLines( String chartData )
	{
		AmSerialChart amSerialChart = AmCharts.AmSerialChart();
		amSerialChart.setPathToImages( "../js/amcharts/images/" );
		JavaScriptObject serialDataProvider = JsonUtils.unsafeEval( chartData );
		amSerialChart.setDataProvider( serialDataProvider );
		amSerialChart.setDataDateFormat( "YYYY-MM-DD" );
		amSerialChart.setCategoryField( "date" );

		// AXES
		// category
		CategoryAxis categoryAxis = amSerialChart.getCategoryAxis();
		// categoryAxis.setParseDates(true); // as our data is date-based, we set parseDates to true
		// categoryAxis.setMinPeriod("DD"); // our data is daily, so we set minPeriod to DD
		// categoryAxis.setGridAlpha(0.1);
		// categoryAxis.setMinorGridAlpha(0.1);
		// categoryAxis.setAxisAlpha(0);
		// categoryAxis.setMinorGridEnabled(true);
		// categoryAxis.setInside(true);

		// value
		ValueAxis valueAxis = AmCharts.ValueAxis();
		valueAxis.setTickLength( 0 );
		valueAxis.setAxisAlpha( 0 );
		valueAxis.setShowFirstLabel( false );
		valueAxis.setShowLastLabel( false );
		amSerialChart.addValueAxis( valueAxis );

		// GRAPH
		AmGraph graph = AmCharts.AmGraph();
		graph.setDashLength( 3 );
		graph.setLineColor( "#00CC00" );
		graph.setValueField( "value" );
		graph.setDashLength( 3 );
		graph.setBullet( "round" );
		graph.setBalloonText( "[[category]]<br><b><span style='font-size:14px);'>value:[[value]]</span></b>" );
		amSerialChart.addGraph( graph );

		// CURSOR
		ChartCursor chartCursor = AmCharts.ChartCursor();
		amSerialChart.addChartCursor( chartCursor );

		// SCROLLBAR
		ChartScrollbar chartScrollbar = AmCharts.ChartScrollbar();
		amSerialChart.addChartScrollbar( chartScrollbar );

		// HORIZONTAL GREEN RANGE
		Guide guide = AmCharts.Guide();
		guide.setValue( 10 );
		guide.setToValue( 20 );
		guide.setFillColor( "#00CC00" );
		guide.setInside( true );
		guide.setFillAlpha( 0.2 );
		guide.setLineAlpha( 0 );
		valueAxis.addGuide( guide );

		// TREND LINES
		// first trend line
		TrendLine trendLine = AmCharts.TrendLine();
		// note,when creating date objects 0 month is January, as months are zero based in JavaScript.
		trendLine.setInitialDate( new Date( 2012, 0, 2, 12, 0 ) ); // 12 is hour - to start trend line in the middle of the day
		trendLine.setFinalDate( new Date( 2012, 0, 11, 12, 0 ) );
		trendLine.setInitialValue( 10 );
		trendLine.setFinalValue( 19 );
		trendLine.setLineColor( "#CC0000" );
		amSerialChart.addTrendLine( trendLine );

		// second trend line
		trendLine = AmCharts.TrendLine();
		trendLine.setInitialDate( new Date( 2012, 0, 17, 12, 0 ) );
		trendLine.setFinalDate( new Date( 2012, 0, 22, 12, 0 ) );
		trendLine.setInitialValue( 16 );
		trendLine.setFinalValue( 10 );
		trendLine.setLineColor( "#CC0000" );
		amSerialChart.addTrendLine( trendLine );

		RootLayoutPanel.get().add( amSerialChart );
	}
}