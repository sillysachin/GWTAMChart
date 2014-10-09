package com.appbootup.explore.gwt.client;

import com.amcharts.jso.AmChartJso;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTAMChart implements EntryPoint
{
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while " + "attempting to contact the server. Please check your network " + "connection and try again.";

	private static final String JSON_URL = GWT.getModuleBaseURL() + "json/amchart?q=";

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
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
						AmChartJso amChartJSO = JsonUtils.<AmChartJso> safeEval( text );
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
}