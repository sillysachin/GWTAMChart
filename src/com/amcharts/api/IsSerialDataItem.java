package com.amcharts.api;


public interface IsSerialDataItem
{
	/**
	 * You can access each GraphDataItem using this object. The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
	 */
	public IsAxisAuto getAxis( String axisId );

	/**
	 * "category value. String if parseDates is false, Date if true."
	 */
	public String getCategory();

	/**
	 * "Reference to original data object, from dataProvider."
	 */
	public IsDataContext getDataContext();

	/**
	 * Time stamp of a series date. Available only if parseDates property of CategoryAxis is set to true.
	 */
	public double getTime();

	/**
	 * "Coordinate (horizontal or vertical, depends on chart's rotate property) of the series."
	 */
	public double getX();
}