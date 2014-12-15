package com.amcharts.impl.wrapper;

import com.appbootup.explore.gwt.client.misc.PolarChart;
import com.google.gwt.core.client.GWT;

public class ChartWrapperUtils
{
	public static IsChartWrapper createWrapper( String className, String id )
	{
		IsChartWrapper wrapper = null;
		GWT.log( className );
		// GWT compiler cannot dynamically create the class with GWT.create(classLiteral) method. Hence the if-else.
		if ( className.equals( getSimpleName( PolarChart.class ) ) )
		{
			wrapper = GWT.create( PolarChart.class );
		}

		return wrapper;
	}

	private static Object getSimpleName( Class< ? > clazz )
	{
		return clazz.getSimpleName();
	}
}