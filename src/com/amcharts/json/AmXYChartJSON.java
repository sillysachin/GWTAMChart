package com.amcharts.json;

import com.amcharts.api.IsAmXYChart;
import com.amcharts.jso.AmRectangularChartJSO;

public final class AmXYChartJSON extends AmRectangularChartJSO implements IsAmXYChart
{
	private boolean hideXScrollbar;

	private boolean hideYScrollbar;

	private double maxZoomFactor;

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public boolean isHideXScrollbar()
	{
		return hideXScrollbar;
	}

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public void setHideXScrollbar( boolean hideXScrollbar )
	{
		this.hideXScrollbar = hideXScrollbar;
	}

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public boolean isHideYScrollbar()
	{
		return hideYScrollbar;
	}

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public void setHideYScrollbar( boolean hideYScrollbar )
	{
		this.hideYScrollbar = hideYScrollbar;
	}

	/**
	 * Maximum zoom factor of the chart.
	 */
	public double getMaxZoomFactor()
	{
		return maxZoomFactor;
	}

	/**
	 * Maximum zoom factor of the chart.
	 */
	public void setMaxZoomFactor( double maxZoomFactor )
	{
		this.maxZoomFactor = maxZoomFactor;
	}
}
