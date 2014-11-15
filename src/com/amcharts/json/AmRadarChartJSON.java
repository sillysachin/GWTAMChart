package com.amcharts.json;

import com.amcharts.api.IsAmRadarChart;

public final class AmRadarChartJSON extends AmCoordinateChart implements IsAmRadarChart
{
	private String categoryField;

	private double marginBottom;

	private double marginLeft;

	private double marginRight;

	private double marginTop;

	private String radius;

	/**
	 * Field in your data provider containing categories.
	 */
	public String getCategoryField()
	{
		return categoryField;
	}

	/**
	 * Field in your data provider containing categories.
	 */
	public void setCategoryField( String categoryField )
	{
		this.categoryField = categoryField;
	}

	/**
	 * Bottom margin of the chart.
	 */
	public double getMarginBottom()
	{
		return marginBottom;
	}

	/**
	 * Bottom margin of the chart.
	 */
	public void setMarginBottom( double marginBottom )
	{
		this.marginBottom = marginBottom;
	}

	/**
	 * Left margin of the chart.
	 */
	public double getMarginLeft()
	{
		return marginLeft;
	}

	/**
	 * Left margin of the chart.
	 */
	public void setMarginLeft( double marginLeft )
	{
		this.marginLeft = marginLeft;
	}

	/**
	 * Right margin of the chart.
	 */
	public double getMarginRight()
	{
		return marginRight;
	}

	/**
	 * Right margin of the chart.
	 */
	public void setMarginRight( double marginRight )
	{
		this.marginRight = marginRight;
	}

	/**
	 * Top margin of the chart.
	 */
	public double getMarginTop()
	{
		return marginTop;
	}

	/**
	 * Top margin of the chart.
	 */
	public void setMarginTop( double marginTop )
	{
		this.marginTop = marginTop;
	}

	/**
	 * Radius of a radar.
	 */
	public String getRadius()
	{
		return radius;
	}

	/**
	 * Radius of a radar.
	 */
	public void setRadius( String radius )
	{
		this.radius = radius;
	}
}
