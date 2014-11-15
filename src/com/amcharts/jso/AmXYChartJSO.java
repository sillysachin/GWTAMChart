package com.amcharts.jso;

import com.amcharts.api.IsAmXYChart;

public final class AmXYChartJSO extends AmRectangularChartJSO implements IsAmXYChart
{
	protected AmXYChartJSO()
	{
	}

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public final native boolean isHideXScrollbar() /*-{
		return hideXScrollbar;
	}-*/;

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public final native void setHideXScrollbar( boolean hideXScrollbar ) /*-{
		this.hideXScrollbar = hideXScrollbar;
	}-*/;

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public final native boolean isHideYScrollbar() /*-{
		return hideYScrollbar;
	}-*/;

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public final native void setHideYScrollbar( boolean hideYScrollbar ) /*-{
		this.hideYScrollbar = hideYScrollbar;
	}-*/;

	/**
	 * Maximum zoom factor of the chart.
	 */
	public final native double getMaxZoomFactor() /*-{
		return maxZoomFactor;
	}-*/;

	/**
	 * Maximum zoom factor of the chart.
	 */
	public final native void setMaxZoomFactor( double maxZoomFactor ) /*-{
		this.maxZoomFactor = maxZoomFactor;
	}-*/;
}
