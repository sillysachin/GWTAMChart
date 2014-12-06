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

import com.amcharts.impl.JsFunction;
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

		List<PieChartSlice> dataProvider = new ArrayList<PieChartSlice>();
		PieChartSlice slice1 = new PieChartSlice();
		slice1.setCountry( "Lithuania" );
		slice1.setLitres( "501.9" );
		dataProvider.add( slice1 );
		PieChartSlice slice2 = new PieChartSlice();
		slice2.setCountry( "Czech Republic" );
		slice2.setLitres( "301.9" );
		dataProvider.add( slice2 );
		PieChartSlice slice3 = new PieChartSlice();
		slice3.setCountry( "Ireland" );
		slice3.setLitres( "201.1" );
		dataProvider.add( slice3 );
		PieChartSlice slice4 = new PieChartSlice();
		slice4.setCountry( "Germany" );
		slice4.setLitres( "165.8" );
		dataProvider.add( slice4 );
		PieChartSlice slice5 = new PieChartSlice();
		slice5.setCountry( "Australia" );
		slice5.setLitres( "139.9" );
		dataProvider.add( slice5 );
		PieChartSlice slice6 = new PieChartSlice();
		slice6.setCountry( "Austria" );
		slice6.setLitres( "128.3" );
		dataProvider.add( slice6 );
		PieChartSlice slice7 = new PieChartSlice();
		slice7.setCountry( "UK" );
		slice7.setLitres( "99" );
		dataProvider.add( slice7 );
		PieChartSlice slice8 = new PieChartSlice();
		slice8.setCountry( "Belgium" );
		slice8.setLitres( "60" );
		dataProvider.add( slice8 );
		PieChartSlice slice9 = new PieChartSlice();
		slice9.setCountry( "The Netherlands" );
		slice9.setLitres( "50" );
		dataProvider.add( slice9 );

		AmPieChart amPieChart = new AmPieChart();
		amPieChart.setType( "pie" );
		amPieChart.setDataProvider( dataProvider );
		amPieChart.setTheme( "none" );
		amPieChart.setValueField( "litres" );
		amPieChart.setTitleField( "country" );
		amPieChart.setGroupedPulled( true );
		//ExportConfig exportConfig = new ExportConfig();
		//MenuItem menuItem = new MenuItem();
		//menuItem.setIcon( "/js/amcharts/images/export.png" );
		//menuItem.setFormat( "png" );
		//exportConfig.addMenuItem( menuItem );
		//amPieChart.setExportConfig( exportConfig );
		amPieChart.setGroupPercent( 5.0 );
		String functionString = getFunctionString();
		JsFunction jsFunction = new JsFunction();
		jsFunction.setFunctionString( functionString );
		amPieChart.setLabelFunction( jsFunction );
		JsonRenderer renderer = JsonBuilderFactory.getInstance()
				.getJacksonRenderer();
		String jsonStringJackson = renderer.toJson( amPieChart );
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
		return "function(slice, text) {" + "return text;" + "}";
	}
}