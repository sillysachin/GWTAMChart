package com.amcharts.impl;

import com.amcharts.api.IsDataContext;
import com.amcharts.api.IsSerialDataItem;
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
	public final native JavaScriptObject getAxes() /*-{
		return this.axes;
	}-*/;

	/**
	 * category value. String if parseDates is false, Date if true.
	 */
	public final native String getCategory()
	/*-{
		return this.category;
	}-*/;

	/**
	 * Reference to original data object, from dataProvider.
	 */
	public final native IsDataContext getDataContext()
	/*-{
		return this.dataContext;
	}-*/;

	/**
	 * Time stamp of a series date. Available only if parseDates property of CategoryAxis is set to true.
	 */
	public final native double getTime()
	/*-{
		return this.time;
	}-*/;

	/**
	 * Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
	 */
	public final native double getX()
	/*-{
		return this.x;
	}-*/;
}