package com.amcharts.json;

import com.amcharts.api.IsGaugeArrow;
import com.amcharts.api.IsGaugeAxis;

public final class GaugeArrowJSON implements IsGaugeArrow
{
	private double alpha;

	private IsGaugeAxis axis;

	private double borderAlpha;

	private boolean clockWiseOnly;

	private String color;

	private String id;

	private String innerRadius;

	private double nailAlpha;

	private double nailBorderAlpha;

	private double nailBorderThickness;

	private double nailRadius;

	private String radius;

	private double startWidth;

	private double value;

	/**
	 * Opacity of an arrow.
	 */
	public double getAlpha()
	{
		return alpha;
	}

	/**
	 * Opacity of an arrow.
	 */
	public void setAlpha( double alpha )
	{
		this.alpha = alpha;
	}

	/**
	 * "Axis of the arrow. You can use reference to the axis or id of the axis. If you don't set any axis, the first axis of a chart will be used."
	 */
	public IsGaugeAxis getAxis()
	{
		return axis;
	}

	/**
	 * "Axis of the arrow. You can use reference to the axis or id of the axis. If you don't set any axis, the first axis of a chart will be used."
	 */
	public void setAxis( IsGaugeAxis axis )
	{
		this.axis = axis;
	}

	/**
	 * Opacity of arrow border.
	 */
	public double getBorderAlpha()
	{
		return borderAlpha;
	}

	/**
	 * Opacity of arrow border.
	 */
	public void setBorderAlpha( double borderAlpha )
	{
		this.borderAlpha = borderAlpha;
	}

	/**
	 * "In case you need the arrow to rotate only clock-wise, set this property to true."
	 */
	public boolean isClockWiseOnly()
	{
		return clockWiseOnly;
	}

	/**
	 * "In case you need the arrow to rotate only clock-wise, set this property to true."
	 */
	public void setClockWiseOnly( boolean clockWiseOnly )
	{
		this.clockWiseOnly = clockWiseOnly;
	}

	/**
	 * Color of an arrow.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Color of an arrow.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * Unique id of an arrow.
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Unique id of an arrow.
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * Inner radius of an arrow.
	 */
	public String getInnerRadius()
	{
		return innerRadius;
	}

	/**
	 * Inner radius of an arrow.
	 */
	public void setInnerRadius( String innerRadius )
	{
		this.innerRadius = innerRadius;
	}

	/**
	 * "Opacity of a nail, holding the arrow."
	 */
	public double getNailAlpha()
	{
		return nailAlpha;
	}

	/**
	 * "Opacity of a nail, holding the arrow."
	 */
	public void setNailAlpha( double nailAlpha )
	{
		this.nailAlpha = nailAlpha;
	}

	/**
	 * Opacity of nail border.
	 */
	public double getNailBorderAlpha()
	{
		return nailBorderAlpha;
	}

	/**
	 * Opacity of nail border.
	 */
	public void setNailBorderAlpha( double nailBorderAlpha )
	{
		this.nailBorderAlpha = nailBorderAlpha;
	}

	/**
	 * Thickness of nail border.
	 */
	public double getNailBorderThickness()
	{
		return nailBorderThickness;
	}

	/**
	 * Thickness of nail border.
	 */
	public void setNailBorderThickness( double nailBorderThickness )
	{
		this.nailBorderThickness = nailBorderThickness;
	}

	/**
	 * "Radius of a nail, holding the arrow."
	 */
	public double getNailRadius()
	{
		return nailRadius;
	}

	/**
	 * "Radius of a nail, holding the arrow."
	 */
	public void setNailRadius( double nailRadius )
	{
		this.nailRadius = nailRadius;
	}

	/**
	 * Radius of an arrow.
	 */
	public String getRadius()
	{
		return radius;
	}

	/**
	 * Radius of an arrow.
	 */
	public void setRadius( String radius )
	{
		this.radius = radius;
	}

	/**
	 * Width of arrow root.
	 */
	public double getStartWidth()
	{
		return startWidth;
	}

	/**
	 * Width of arrow root.
	 */
	public void setStartWidth( double startWidth )
	{
		this.startWidth = startWidth;
	}

	/**
	 * Value to which the arrow should point at.
	 */
	public double getValue()
	{
		return value;
	}

	/**
	 * Value to which the arrow should point at.
	 */
	public void setValue( double value )
	{
		this.value = value;
	}
}
