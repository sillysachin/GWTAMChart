package com.amcharts.json;

import java.util.Date;

import com.amcharts.api.IsTrendLine;
import com.amcharts.api.IsValueAxis;

public final class TrendLine implements IsTrendLine
{
	private double dashLength;

	private String finalCategory;

	private Date finalDate;

	private double finalValue;

	private double finalXValue;

	private String id;

	private String initialCategory;

	private Date initialDate;

	private double initialValue;

	private double initialXValue;

	private boolean isProtected;

	private double lineAlpha;

	private String lineColor;

	private double lineThickness;

	private IsValueAxis valueAxis;

	private IsValueAxis valueAxisX;

	/**
	 * Dash length.
	 */
	public double getDashLength()
	{
		return dashLength;
	}

	/**
	 * Dash length.
	 */
	public void setDashLength( double dashLength )
	{
		this.dashLength = dashLength;
	}

	/**
	 * "String, equal to category value to which trend line should be drawn. It should be used if chart doesn't parse dates."
	 */
	public String getFinalCategory()
	{
		return finalCategory;
	}

	/**
	 * "String, equal to category value to which trend line should be drawn. It should be used if chart doesn't parse dates."
	 */
	public void setFinalCategory( String finalCategory )
	{
		this.finalCategory = finalCategory;
	}

	/**
	 * Date to which trend line should be drawn. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public Date getFinalDate()
	{
		return finalDate;
	}

	/**
	 * Date to which trend line should be drawn. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public void setFinalDate( Date finalDate )
	{
		this.finalDate = finalDate;
	}

	/**
	 * Value at which trend line should end.
	 */
	public double getFinalValue()
	{
		return finalValue;
	}

	/**
	 * Value at which trend line should end.
	 */
	public void setFinalValue( double finalValue )
	{
		this.finalValue = finalValue;
	}

	/**
	 * Used by XY chart only. X value at which trend line should end.
	 */
	public double getFinalXValue()
	{
		return finalXValue;
	}

	/**
	 * Used by XY chart only. X value at which trend line should end.
	 */
	public void setFinalXValue( double finalXValue )
	{
		this.finalXValue = finalXValue;
	}

	/**
	 * "Unique id of a Trend line. You don't need to set it, unless you want to."
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * "Unique id of a Trend line. You don't need to set it, unless you want to."
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * "String, equal to category value from which trend line should start. It should be used if chart doesn't parse dates."
	 */
	public String getInitialCategory()
	{
		return initialCategory;
	}

	/**
	 * "String, equal to category value from which trend line should start. It should be used if chart doesn't parse dates."
	 */
	public void setInitialCategory( String initialCategory )
	{
		this.initialCategory = initialCategory;
	}

	/**
	 * Date from which trend line should start. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public Date getInitialDate()
	{
		return initialDate;
	}

	/**
	 * Date from which trend line should start. It can be date string (using the same date format as chart.dataDateFormat) or date object.
	 */
	public void setInitialDate( Date initialDate )
	{
		this.initialDate = initialDate;
	}

	/**
	 * Value from which trend line should start.
	 */
	public double getInitialValue()
	{
		return initialValue;
	}

	/**
	 * Value from which trend line should start.
	 */
	public void setInitialValue( double initialValue )
	{
		this.initialValue = initialValue;
	}

	/**
	 * Used by XY chart only. X value from which trend line should start.
	 */
	public double getInitialXValue()
	{
		return initialXValue;
	}

	/**
	 * Used by XY chart only. X value from which trend line should start.
	 */
	public void setInitialXValue( double initialXValue )
	{
		this.initialXValue = initialXValue;
	}

	/**
	 * "Used by Stock chart. If this property is set to true, this trend line won't be removed when clicked on eraser tool."
	 */
	public boolean isIsProtected()
	{
		return isProtected;
	}

	/**
	 * "Used by Stock chart. If this property is set to true, this trend line won't be removed when clicked on eraser tool."
	 */
	public void setIsProtected( boolean isProtected )
	{
		this.isProtected = isProtected;
	}

	/**
	 * Line opacity.
	 */
	public double getLineAlpha()
	{
		return lineAlpha;
	}

	/**
	 * Line opacity.
	 */
	public void setLineAlpha( double lineAlpha )
	{
		this.lineAlpha = lineAlpha;
	}

	/**
	 * Line color.
	 */
	public String getLineColor()
	{
		return lineColor;
	}

	/**
	 * Line color.
	 */
	public void setLineColor( String lineColor )
	{
		this.lineColor = lineColor;
	}

	/**
	 * Line thickness.
	 */
	public double getLineThickness()
	{
		return lineThickness;
	}

	/**
	 * Line thickness.
	 */
	public void setLineThickness( double lineThickness )
	{
		this.lineThickness = lineThickness;
	}

	/**
	 * Value axis of the trend line. Will use first value axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public IsValueAxis getValueAxis()
	{
		return valueAxis;
	}

	/**
	 * Value axis of the trend line. Will use first value axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public void setValueAxis( IsValueAxis valueAxis )
	{
		this.valueAxis = valueAxis;
	}

	/**
	 * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public IsValueAxis getValueAxisX()
	{
		return valueAxisX;
	}

	/**
	 * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if not set any. You can use a reference to the value axis object or id of value axis.
	 */
	public void setValueAxisX( IsValueAxis valueAxisX )
	{
		this.valueAxisX = valueAxisX;
	}
}
