package com.amcharts.api;

import java.util.Date;

public interface IsTrendLine
{
	/**
	 * Dash length.
	 */
	public double getDashLength();

	/**
	 * Dash length.
	 */
	public void setDashLength( double dashLength );

	/**
	 * "String, equal to category value to which trend line should be drawn. It should be used if chart doesn't parse dates."
	 */
	public String getFinalCategory();

	/**
	 * "String, equal to category value to which trend line should be drawn. It should be used if chart doesn't parse dates."
	 */
	public void setFinalCategory( String finalCategory );

	/**
	 * Date to which trend line should be drawn. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public Date getFinalDate();

	/**
	 * Date to which trend line should be drawn. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public void setFinalDate( Date finalDate );

	/**
	 * Value at which trend line should end.
	 */
	public double getFinalValue();

	/**
	 * Value at which trend line should end.
	 */
	public void setFinalValue( double finalValue );

	/**
	 * Used by XY chart only. X value at which trend line should end.
	 */
	public double getFinalXValue();

	/**
	 * Used by XY chart only. X value at which trend line should end.
	 */
	public void setFinalXValue( double finalXValue );

	/**
	 * "Unique id of a Trend line. You don't need to set it, unless you want to."
	 */
	public String getId();

	/**
	 * "Unique id of a Trend line. You don't need to set it, unless you want to."
	 */
	public void setId( String id );

	/**
	 * "String, equal to category value from which trend line should start. It should be used if chart doesn't parse dates."
	 */
	public String getInitialCategory();

	/**
	 * "String, equal to category value from which trend line should start. It should be used if chart doesn't parse dates."
	 */
	public void setInitialCategory( String initialCategory );

	/**
	 * Date from which trend line should start. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public Date getInitialDate();

	/**
	 * Date from which trend line should start. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public void setInitialDate( Date initialDate );

	/**
	 * Value from which trend line should start.
	 */
	public double getInitialValue();

	/**
	 * Value from which trend line should start.
	 */
	public void setInitialValue( double initialValue );

	/**
	 * Used by XY chart only. X value from which trend line should start.
	 */
	public double getInitialXValue();

	/**
	 * Used by XY chart only. X value from which trend line should start.
	 */
	public void setInitialXValue( double initialXValue );

	/**
	 * "Used by Stock chart. If this property is set to true, this trend line won't be removed when clicked on eraser tool."
	 */
	public Boolean isIsProtected();

	/**
	 * "Used by Stock chart. If this property is set to true, this trend line won't be removed when clicked on eraser tool."
	 */
	public void setIsProtected( Boolean isProtected );

	/**
	 * Line opacity.
	 */
	public double getLineAlpha();

	/**
	 * Line opacity.
	 */
	public void setLineAlpha( double lineAlpha );

	/**
	 * Line color.
	 */
	public String getLineColor();

	/**
	 * Line color.
	 */
	public void setLineColor( String lineColor );

	/**
	 * Line thickness.
	 */
	public double getLineThickness();

	/**
	 * Line thickness.
	 */
	public void setLineThickness( double lineThickness );

	/**
	 * Value axis of the trend line. Will use first value axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public IsValueAxis getValueAxis();

	/**
	 * Value axis of the trend line. Will use first value axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public void setValueAxis( IsValueAxis valueAxis );

	/**
	 * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public IsValueAxis getValueAxisX();

	/**
	 * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public void setValueAxisX( IsValueAxis valueAxisX );
}
