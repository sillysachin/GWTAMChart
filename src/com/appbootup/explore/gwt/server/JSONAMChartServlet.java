package com.appbootup.explore.gwt.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amcharts.json.AmPieChart;
import com.amcharts.json.PieChartSlice;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings( "serial" )
public class JSONAMChartServlet extends HttpServlet
{
	@Override
	protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		out.println( getAMChart() );
		out.flush();
	}

	public String getAMChart()
	{
		StringBuffer sb = new StringBuffer();
		BufferedReader reader = null;
		ServletContext cntxt = this.getServletContext();
		String fName = "/data/amchart.json";
		AmPieChart pieChart = new AmPieChart();
		pieChart.setType( "pie" );
		pieChart.setValueField( "value" );
		pieChart.setTitleField( "key" );

		List<PieChartSlice> dataProvider = new ArrayList<PieChartSlice>();
		PieChartSlice slice1 = new PieChartSlice();
		slice1.setKey( "Beer" );
		slice1.setValue( "201.1" );
		dataProvider.add( slice1 );
		PieChartSlice slice2 = new PieChartSlice();
		slice2.setKey( "Whiskey" );
		slice2.setValue( "165.8" );
		dataProvider.add( slice2 );
		pieChart.setDataProvider( dataProvider );
		pieChart.setLabelFunction( getFunctionString() );

		JsonRenderer renderer = JsonBuilderFactory.getInstance()
				.getJacksonRenderer();
		String jsonStringJackson = renderer.toJson( pieChart );
		System.out.println( jsonStringJackson );

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

		return jsonStringJackson;
		//	return filejson;
	}

	private String getFunctionString()
	{
		return "function(slice, text) {" + "console.log('------------Start----------------');" + "console.log(slice);" + "console.log(text);" + "console.log('-------------End-----------------');" + "return text;" + "}";
	}
}