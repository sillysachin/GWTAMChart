package com.appbootup.explore.gwt.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;

import com.appbootup.explore.gwt.client.ChartService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings( "serial" )
public class ChartServiceImpl extends RemoteServiceServlet implements ChartService
{

	public String getLineWithTrendLineChartData( String fName ) throws IllegalArgumentException
	{
		ServletContext cntxt = this.getServletContext();
		BufferedReader reader = null;
		StringBuffer sb = new StringBuffer();

		InputStream ins = cntxt.getResourceAsStream( fName );
		try
		{
			if ( ins != null )
			{
				InputStreamReader isr = new InputStreamReader( ins );
				reader = new BufferedReader( isr );
				String sCurrentLine = "";
				while ( ( sCurrentLine = reader.readLine() ) != null )
				{
					sb.append( sCurrentLine );
				}
			}
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if ( reader != null )
					reader.close();
			}
			catch ( IOException ex )
			{
				ex.printStackTrace();
			}
		}

		String filejson = sb.toString();
		System.out.println( filejson );
		return filejson;
	}
}