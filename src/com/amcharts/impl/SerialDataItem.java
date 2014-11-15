package com.amcharts.impl;

import com.amcharts.api.IsSerialDataItem;
import com.amcharts.impl.event.DataContext;
import com.amcharts.impl.event.DataItem;
import com.google.gwt.core.client.JavaScriptObject;

public final class SerialDataItem extends DataItem implements IsSerialDataItem
{
	protected SerialDataItem()
	{
	}

	/**
	 * You can access each GraphDataItem using this object. The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
	 */
	public final native JavaScriptObject getAxes()
	/*-{
		return this.axes;
	}-*/;

	/**
	 * You can access each GraphDataItem using this object. The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
	 * @param axes
	 */
	public final native void setAxes( JavaScriptObject axes )
	/*-{
		this.axes = axes;
	}-*/;

	public final native String getCategory()
	/*-{
		return this.category;
	}-*/;

	/**
	 * category value. String if parseDates is false, Date if true.
	 * @param category
	 */
	public final native void setCategory( String category )
	/*-{
		this.category = category;
	}-*/;

	public final native DataContext getDataContext()
	/*-{
		return this.dataContext;
	}-*/;

	/**
	 * Reference to original data object, from dataProvider.
	 * @param dataContext
	 */
	public final native void setDataContext( JavaScriptObject dataContext )
	/*-{
		this.dataContext = dataContext;
	}-*/;

	public final native double getTime()
	/*-{
		return this.time;
	}-*/;

	/**
	 * Time stamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
	 * @param time
	 */
	public final native void setTime( double time )
	/*-{
		this.time = time;
	}-*/;

	public final native double getX()
	/*-{
		return this.x;
	}-*/;

	/**
	 * Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
	 * @param x
	 */
	public final native void setX( double x )
	/*-{
		this.x = x;
	}-*/;
}