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
	public final native Boolean isHideXScrollbar() /*-{
		return this.hideXScrollbar;
	}-*/;

	/**
	 * Specifies if Scrollbar of X axis (horizontal) should be hidden.
	 */
	public final native void setHideXScrollbar( Boolean hideXScrollbar ) /*-{
		this.hideXScrollbar = hideXScrollbar;
	}-*/;

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public final native Boolean isHideYScrollbar() /*-{
		return this.hideYScrollbar;
	}-*/;

	/**
	 * Specifies if Scrollbar of Y axis (vertical) should be hidden.
	 */
	public final native void setHideYScrollbar( Boolean hideYScrollbar ) /*-{
		this.hideYScrollbar = hideYScrollbar;
	}-*/;

	/**
	 * Maximum zoom factor of the chart.
	 */
	public final native double getMaxZoomFactor() /*-{
		return this.maxZoomFactor;
	}-*/;

	/**
	 * Maximum zoom factor of the chart.
	 */
	public final native void setMaxZoomFactor( double maxZoomFactor ) /*-{
		this.maxZoomFactor = maxZoomFactor;
	}-*/;
}
