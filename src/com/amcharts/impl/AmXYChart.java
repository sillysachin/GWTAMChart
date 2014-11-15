package com.amcharts.impl;

import com.amcharts.api.IsAmXYChart;
import com.amcharts.jso.AmXYChartJSO;

public final class AmXYChart extends AmRectangularChart implements IsAmXYChart
{
	protected AmXYChart()
	{
		jso = createJso();
		//TODO: ENUM for type of chart.
		setType( "xy" );
	}

	public native AmXYChartJSO createJso() /*-{
		var chart = new $wnd.AmCharts.AmXYChart();
		return chart;
	}-*/;

	public AmXYChartJSO getJso()
	{
		return ( AmXYChartJSO ) this.jso;
	}

	public void setJso( AmXYChartJSO jso )
	{
		this.jso = jso;
	}

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public final boolean isHideXScrollbar()
	{
		return getJso().isHideXScrollbar();
	}

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public final void setHideXScrollbar( boolean hideXScrollbar )
	{
		getJso().setHideXScrollbar( hideXScrollbar );
	}

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public final boolean isHideYScrollbar()
	{
		return getJso().isHideYScrollbar();
	}

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public final void setHideYScrollbar( boolean hideYScrollbar )
	{
		getJso().setHideYScrollbar( hideYScrollbar );
	}

	/**
	 * Maximum zoom factor of the chart.
	 */
	public final double getMaxZoomFactor()
	{
		return getJso().getMaxZoomFactor();
	}

	/**
	 * Maximum zoom factor of the chart.
	 */
	public final void setMaxZoomFactor( double maxZoomFactor )
	{
		getJso().setMaxZoomFactor( maxZoomFactor );
	}
}
