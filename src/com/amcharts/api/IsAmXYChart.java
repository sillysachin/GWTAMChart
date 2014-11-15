package com.amcharts.api;


public interface IsAmXYChart extends IsAmRectangularChart
{
	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public boolean isHideXScrollbar();

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public void setHideXScrollbar( boolean hideXScrollbar );

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public boolean isHideYScrollbar();

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public void setHideYScrollbar( boolean hideYScrollbar );

	/**
	 * Maximum zoom factor of the chart.
	 */
	public double getMaxZoomFactor();

	/**
	 * Maximum zoom factor of the chart.
	 */
	public void setMaxZoomFactor( double maxZoomFactor );
}
