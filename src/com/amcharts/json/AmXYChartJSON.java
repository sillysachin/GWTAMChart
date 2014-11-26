package com.amcharts.json;

import com.amcharts.api.IsAmXYChart;
import com.amcharts.jso.AmRectangularChartJSO;

public final class AmXYChartJSON extends AmRectangularChartJSO implements IsAmXYChart
{
	private Boolean hideXScrollbar;

	private Boolean hideYScrollbar;

	private double maxZoomFactor;

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public Boolean isHideXScrollbar()
	{
		return hideXScrollbar;
	}

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public void setHideXScrollbar( Boolean hideXScrollbar )
	{
		this.hideXScrollbar = hideXScrollbar;
	}

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public Boolean isHideYScrollbar()
	{
		return hideYScrollbar;
	}

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public void setHideYScrollbar( Boolean hideYScrollbar )
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
