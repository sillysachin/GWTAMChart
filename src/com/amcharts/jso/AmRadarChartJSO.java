package com.amcharts.jso;

import com.amcharts.api.IsAmRadarChart;

public final class AmRadarChartJSO extends AmCoordinateChartJSO implements IsAmRadarChart
{
	protected AmRadarChartJSO()
	{
	}

	/**
	 * Field in your data provider containing categories.
	 */
	public final native String getCategoryField() /*-{
		return categoryField;
	}-*/;

	/**
	 * Field in your data provider containing categories.
	 */
	public final native void setCategoryField( String categoryField ) /*-{
		this.categoryField = categoryField;
	}-*/;

	/**
	 * Bottom margin of the chart.
	 */
	public final native double getMarginBottom() /*-{
		return marginBottom;
	}-*/;

	/**
	 * Bottom margin of the chart.
	 */
	public final native void setMarginBottom( double marginBottom ) /*-{
		this.marginBottom = marginBottom;
	}-*/;

	/**
	 * Left margin of the chart.
	 */
	public final native double getMarginLeft() /*-{
		return marginLeft;
	}-*/;

	/**
	 * Left margin of the chart.
	 */
	public final native void setMarginLeft( double marginLeft ) /*-{
		this.marginLeft = marginLeft;
	}-*/;

	/**
	 * Right margin of the chart.
	 */
	public final native double getMarginRight() /*-{
		return marginRight;
	}-*/;

	/**
	 * Right margin of the chart.
	 */
	public final native void setMarginRight( double marginRight ) /*-{
		this.marginRight = marginRight;
	}-*/;

	/**
	 * Top margin of the chart.
	 */
	public final native double getMarginTop() /*-{
		return marginTop;
	}-*/;

	/**
	 * Top margin of the chart.
	 */
	public final native void setMarginTop( double marginTop ) /*-{
		this.marginTop = marginTop;
	}-*/;

	/**
	 * Radius of a radar.
	 */
	public final native String getRadius() /*-{
		return radius;
	}-*/;

	/**
	 * Radius of a radar.
	 */
	public final native void setRadius( String radius ) /*-{
		this.radius = radius;
	}-*/;
}