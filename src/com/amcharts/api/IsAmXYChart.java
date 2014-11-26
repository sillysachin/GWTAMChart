package com.amcharts.api;


public interface IsAmXYChart extends IsAmRectangularChart
{
	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public Boolean isHideXScrollbar();

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public void setHideXScrollbar( Boolean hideXScrollbar );

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public Boolean isHideYScrollbar();

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public void setHideYScrollbar( Boolean hideYScrollbar );

	/**
	 * Maximum zoom factor of the chart.
	 */
	public double getMaxZoomFactor();

	/**
	 * Maximum zoom factor of the chart.
	 */
	public void setMaxZoomFactor( double maxZoomFactor );
}
