package com.amcharts.json;

import com.amcharts.api.IsSerialDataItem;
import com.google.gwt.core.client.JavaScriptObject;

public final class SerialDataItem implements IsSerialDataItem
{
	private JavaScriptObject axes;

	private String category;

	private JavaScriptObject dataContext;

	private double time;

	private double x;

	/**
	 * You can access each GraphDataItem using this object. The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
	 */
	public JavaScriptObject getAxes()
	{
		return axes;
	}

	/**
	 * You can access each GraphDataItem using this object. The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
	 */
	public void setAxes( JavaScriptObject axes )
	{
		this.axes = axes;
	}

	/**
	 * "category value. String if parseDates is false, Date if true."
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * "category value. String if parseDates is false, Date if true."
	 */
	public void setCategory( String category )
	{
		this.category = category;
	}

	/**
	 * "Reference to original data object, from dataProvider."
	 */
	public JavaScriptObject getDataContext()
	{
		return dataContext;
	}

	/**
	 * "Reference to original data object, from dataProvider."
	 */
	public void setDataContext( JavaScriptObject dataContext )
	{
		this.dataContext = dataContext;
	}

	/**
	 * Time stamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
	 */
	public double getTime()
	{
		return time;
	}

	/**
	 * Time stamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
	 */
	public void setTime( double time )
	{
		this.time = time;
	}

	/**
	 * "Coordinate (horizontal or vertical, depends on chart's rotate property) of the series."
	 */
	public double getX()
	{
		return x;
	}

	/**
	 * "Coordinate (horizontal or vertical, depends on chart's rotate property) of the series."
	 */
	public void setX( double x )
	{
		this.x = x;
	}
}
