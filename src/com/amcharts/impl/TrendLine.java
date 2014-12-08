package com.amcharts.impl;

import java.util.Date;

import com.amcharts.api.IsTrendLine;
import com.amcharts.api.IsValueAxis;
import com.amcharts.jso.TrendLineJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class TrendLine implements IJavaScriptWrapper<TrendLineJSO>, IsTrendLine
{
	private TrendLineJSO jso;

	protected TrendLine()
	{
		jso = createJso();
	}

	public TrendLineJSO getJso()
	{
		return this.jso;
	}

	public void setJso( TrendLineJSO jso )
	{
		this.jso = jso;
	}

	private native TrendLineJSO createJso() 
	/*-{
		var trendLine = new $wnd.AmCharts.TrendLine();
		return trendLine;
	}-*/;

	/**
	 * Dash length.
	 */
	public final native double getDashLength() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.dashLength;
	}-*/;

	/**
	 * Dash length.
	 */
	public final native void setDashLength( double dashLength ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.dashLength = dashLength;
	}-*/;

	/**
	 * "String, equal to category value to which trend line should be drawn. It should be used if chart doesn't parse dates."
	 */
	public final native String getFinalCategory() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.finalCategory;
	}-*/;

	/**
	 * "String, equal to category value to which trend line should be drawn. It should be used if chart doesn't parse dates."
	 */
	public final native void setFinalCategory( String finalCategory ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.finalCategory = finalCategory;
	}-*/;

	/**
	 * Date to which trend line should be drawn. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public final native Date getFinalDate() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.finalDate;
	}-*/;

	/**
	 * Date to which trend line should be drawn. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public final native void setFinalDate( Date finalDate ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.finalDate = finalDate;
	}-*/;

	/**
	 * Value at which trend line should end.
	 */
	public final native double getFinalValue() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.finalValue;
	}-*/;

	/**
	 * Value at which trend line should end.
	 */
	public final native void setFinalValue( double finalValue ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.finalValue = finalValue;
	}-*/;

	/**
	 * Used by XY chart only. X value at which trend line should end.
	 */
	public final native double getFinalXValue() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.finalXValue;
	}-*/;

	/**
	 * Used by XY chart only. X value at which trend line should end.
	 */
	public final native void setFinalXValue( double finalXValue ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.finalXValue = finalXValue;
	}-*/;

	/**
	 * "Unique id of a Trend line. You don't need to set it, unless you want to."
	 */
	public final native String getId() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.id;
	}-*/;

	/**
	 * "Unique id of a Trend line. You don't need to set it, unless you want to."
	 */
	public final native void setId( String id ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.id = id;
	}-*/;

	/**
	 * "String, equal to category value from which trend line should start. It should be used if chart doesn't parse dates."
	 */
	public final native String getInitialCategory() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.initialCategory;
	}-*/;

	/**
	 * "String, equal to category value from which trend line should start. It should be used if chart doesn't parse dates."
	 */
	public final native void setInitialCategory( String initialCategory ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.initialCategory = initialCategory;
	}-*/;

	/**
	 * Date from which trend line should start. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public final native Date getInitialDate() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.initialDate;
	}-*/;

	/**
	 * Date from which trend line should start. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public final native void setInitialDate( Date initialDate ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.initialDate = initialDate;
	}-*/;

	/**
	 * Value from which trend line should start.
	 */
	public final native double getInitialValue() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.initialValue;
	}-*/;

	/**
	 * Value from which trend line should start.
	 */
	public final native void setInitialValue( double initialValue ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.initialValue = initialValue;
	}-*/;

	/**
	 * Used by XY chart only. X value from which trend line should start.
	 */
	public final native double getInitialXValue() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.initialXValue;
	}-*/;

	/**
	 * Used by XY chart only. X value from which trend line should start.
	 */
	public final native void setInitialXValue( double initialXValue ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.initialXValue = initialXValue;
	}-*/;

	/**
	 * "Used by Stock chart. If this property is set to true, this trend line won't be removed when clicked on eraser tool."
	 */
	public final native Boolean isIsProtected() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.isProtected;
	}-*/;

	/**
	 * "Used by Stock chart. If this property is set to true, this trend line won't be removed when clicked on eraser tool."
	 */
	public final native void setIsProtected( Boolean isProtected ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.isProtected = isProtected;
	}-*/;

	/**
	 * Line opacity.
	 */
	public final native double getLineAlpha() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.lineAlpha;
	}-*/;

	/**
	 * Line opacity.
	 */
	public final native void setLineAlpha( double lineAlpha ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.lineAlpha = lineAlpha;
	}-*/;

	/**
	 * Line color.
	 */
	public final native String getLineColor() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.lineColor;
	}-*/;

	/**
	 * Line color.
	 */
	public final native void setLineColor( String lineColor ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.lineColor = lineColor;
	}-*/;

	/**
	 * Line thickness.
	 */
	public final native double getLineThickness() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.lineThickness;
	}-*/;

	/**
	 * Line thickness.
	 */
	public final native void setLineThickness( double lineThickness ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.lineThickness = lineThickness;
	}-*/;

	/**
	 * Value axis of the trend line. Will use first value axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public final native IsValueAxis getValueAxis() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.valueAxis;
	}-*/;

	/**
	 * Value axis of the trend line. Will use first value axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public final native void setValueAxis( IsValueAxis valueAxis ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.valueAxis = valueAxis;
	}-*/;

	/**
	 * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public final native IsValueAxis getValueAxisX() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.valueAxisX;
	}-*/;

	/**
	 * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public final native void setValueAxisX( IsValueAxis valueAxisX ) /*-{
		this.@com.amcharts.impl.TrendLine::jso.valueAxisX = valueAxisX;
	}-*/;
}
