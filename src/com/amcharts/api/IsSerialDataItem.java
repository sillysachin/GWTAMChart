package com.amcharts.api;

import com.google.gwt.core.client.JavaScriptObject;

public interface IsSerialDataItem
{
	/**
	 * You can access each GraphDataItem using this object. The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
	 */
	public JavaScriptObject getAxes();

	/**
	 * You can access each GraphDataItem using this object. The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
	 */
	public void setAxes( JavaScriptObject axes );

	/**
	 * "category value. String if parseDates is false, Date if true."
	 */
	public String getCategory();

	/**
	 * "category value. String if parseDates is false, Date if true."
	 */
	public void setCategory( String category );

	/**
	 * "Reference to original data object, from dataProvider."
	 */
	public JavaScriptObject getDataContext();

	/**
	 * "Reference to original data object, from dataProvider."
	 */
	public void setDataContext( JavaScriptObject dataContext );

	/**
	 * Time stamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
	 */
	public double getTime();

	/**
	 * Time stamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
	 */
	public void setTime( double time );

	/**
	 * "Coordinate (horizontal or vertical, depends on chart's rotate property) of the series."
	 */
	public double getX();

	/**
	 * "Coordinate (horizontal or vertical, depends on chart's rotate property) of the series."
	 */
	public void setX( double x );
}
