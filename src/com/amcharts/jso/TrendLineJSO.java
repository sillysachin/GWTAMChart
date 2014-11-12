package com.amcharts.jso;

import java.util.Date;

import com.amcharts.api.IsTrendLine;
import com.amcharts.api.IsValueAxis;
import com.google.gwt.core.client.JavaScriptObject;

public final class TrendLineJSO extends JavaScriptObject implements IsTrendLine
{
	protected TrendLineJSO()
	{
	}

	/**
	 * Dash length.
	 */
	public final native double getDashLength() /*-{
		return dashLength;
	}-*/;

	/**
	 * Dash length.
	 */
	public final native void setDashLength( double dashLength ) /*-{
		this.dashLength = dashLength;
	}-*/;

	/**
	 * "String, equal to category value to which trend line should be drawn. It should be used if chart doesn't parse dates."
	 */
	public final native String getFinalCategory() /*-{
		return finalCategory;
	}-*/;

	/**
	 * "String, equal to category value to which trend line should be drawn. It should be used if chart doesn't parse dates."
	 */
	public final native void setFinalCategory( String finalCategory ) /*-{
		this.finalCategory = finalCategory;
	}-*/;

	/**
	 * Date to which trend line should be drawn. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public final native Date getFinalDate() /*-{
		return finalDate;
	}-*/;

	/**
	 * Date to which trend line should be drawn. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public final native void setFinalDate( Date finalDate ) /*-{
		this.finalDate = finalDate;
	}-*/;

	/**
	 * Value at which trend line should end.
	 */
	public final native double getFinalValue() /*-{
		return finalValue;
	}-*/;

	/**
	 * Value at which trend line should end.
	 */
	public final native void setFinalValue( double finalValue ) /*-{
		this.finalValue = finalValue;
	}-*/;

	/**
	 * Used by XY chart only. X value at which trend line should end.
	 */
	public final native double getFinalXValue() /*-{
		return finalXValue;
	}-*/;

	/**
	 * Used by XY chart only. X value at which trend line should end.
	 */
	public final native void setFinalXValue( double finalXValue ) /*-{
		this.finalXValue = finalXValue;
	}-*/;

	/**
	 * "Unique id of a Trend line. You don't need to set it, unless you want to."
	 */
	public final native String getId() /*-{
		return id;
	}-*/;

	/**
	 * "Unique id of a Trend line. You don't need to set it, unless you want to."
	 */
	public final native void setId( String id ) /*-{
		this.id = id;
	}-*/;

	/**
	 * "String, equal to category value from which trend line should start. It should be used if chart doesn't parse dates."
	 */
	public final native String getInitialCategory() /*-{
		return initialCategory;
	}-*/;

	/**
	 * "String, equal to category value from which trend line should start. It should be used if chart doesn't parse dates."
	 */
	public final native void setInitialCategory( String initialCategory ) /*-{
		this.initialCategory = initialCategory;
	}-*/;

	/**
	 * Date from which trend line should start. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public final native Date getInitialDate() /*-{
		return initialDate;
	}-*/;

	/**
	 * Date from which trend line should start. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public final native void setInitialDate( Date initialDate ) /*-{
		this.initialDate = initialDate;
	}-*/;

	/**
	 * Value from which trend line should start.
	 */
	public final native double getInitialValue() /*-{
		return initialValue;
	}-*/;

	/**
	 * Value from which trend line should start.
	 */
	public final native void setInitialValue( double initialValue ) /*-{
		this.initialValue = initialValue;
	}-*/;

	/**
	 * Used by XY chart only. X value from which trend line should start.
	 */
	public final native double getInitialXValue() /*-{
		return initialXValue;
	}-*/;

	/**
	 * Used by XY chart only. X value from which trend line should start.
	 */
	public final native void setInitialXValue( double initialXValue ) /*-{
		this.initialXValue = initialXValue;
	}-*/;

	/**
	 * "Used by Stock chart. If this property is set to true, this trend line won't be removed when clicked on eraser tool."
	 */
	public final native boolean isIsProtected() /*-{
		return isProtected;
	}-*/;

	/**
	 * "Used by Stock chart. If this property is set to true, this trend line won't be removed when clicked on eraser tool."
	 */
	public final native void setIsProtected( boolean isProtected ) /*-{
		this.isProtected = isProtected;
	}-*/;

	/**
	 * Line opacity.
	 */
	public final native double getLineAlpha() /*-{
		return lineAlpha;
	}-*/;

	/**
	 * Line opacity.
	 */
	public final native void setLineAlpha( double lineAlpha ) /*-{
		this.lineAlpha = lineAlpha;
	}-*/;

	/**
	 * Line color.
	 */
	public final native String getLineColor() /*-{
		return lineColor;
	}-*/;

	/**
	 * Line color.
	 */
	public final native void setLineColor( String lineColor ) /*-{
		this.lineColor = lineColor;
	}-*/;

	/**
	 * Line thickness.
	 */
	public final native double getLineThickness() /*-{
		return lineThickness;
	}-*/;

	/**
	 * Line thickness.
	 */
	public final native void setLineThickness( double lineThickness ) /*-{
		this.lineThickness = lineThickness;
	}-*/;

	/**
	 * Value axis of the trend line. Will use first value axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public final native IsValueAxis getValueAxis() /*-{
		return valueAxis;
	}-*/;

	/**
	 * Value axis of the trend line. Will use first value axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public final native void setValueAxis( IsValueAxis valueAxis ) /*-{
		this.valueAxis = valueAxis;
	}-*/;

	/**
	 * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public final native IsValueAxis getValueAxisX() /*-{
		return valueAxisX;
	}-*/;

	/**
	 * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public final native void setValueAxisX( IsValueAxis valueAxisX ) /*-{
		this.valueAxisX = valueAxisX;
	}-*/;
}
