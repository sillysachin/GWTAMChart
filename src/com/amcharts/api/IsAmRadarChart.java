package com.amcharts.api;

public interface IsAmRadarChart extends IsAmCoordinateChart
{
	/**
	 * Field in your data provider containing categories.
	 */
	public String getCategoryField();

	/**
	 * Field in your data provider containing categories.
	 */
	public void setCategoryField( String categoryField );

	/**
	 * Bottom margin of the chart.
	 */
	public double getMarginBottom();

	/**
	 * Bottom margin of the chart.
	 */
	public void setMarginBottom( double marginBottom );

	/**
	 * Left margin of the chart.
	 */
	public double getMarginLeft();

	/**
	 * Left margin of the chart.
	 */
	public void setMarginLeft( double marginLeft );

	/**
	 * Right margin of the chart.
	 */
	public double getMarginRight();

	/**
	 * Right margin of the chart.
	 */
	public void setMarginRight( double marginRight );

	/**
	 * Top margin of the chart.
	 */
	public double getMarginTop();

	/**
	 * Top margin of the chart.
	 */
	public void setMarginTop( double marginTop );

	/**
	 * Radius of a radar.
	 */
	public String getRadius();

	/**
	 * Radius of a radar.
	 */
	public void setRadius( String radius );
}
