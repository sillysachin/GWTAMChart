package com.amcharts.api;

public interface IsGaugeArrow
{
	/**
	 * Opacity of an arrow.
	 */
	public double getAlpha();

	/**
	 * Opacity of an arrow.
	 */
	public void setAlpha( double alpha );

	/**
	 * "Axis of the arrow. You can use reference to the axis or id of the axis. If you don't set any axis, the first axis of a chart will be used."
	 */
	public IsGaugeAxis getAxis();

	/**
	 * "Axis of the arrow. You can use reference to the axis or id of the axis. If you don't set any axis, the first axis of a chart will be used."
	 */
	public void setAxis( IsGaugeAxis axis );

	/**
	 * Opacity of arrow border.
	 */
	public double getBorderAlpha();

	/**
	 * Opacity of arrow border.
	 */
	public void setBorderAlpha( double borderAlpha );

	/**
	 * "In case you need the arrow to rotate only clock-wise, set this property to true."
	 */
	public Boolean isClockWiseOnly();

	/**
	 * "In case you need the arrow to rotate only clock-wise, set this property to true."
	 */
	public void setClockWiseOnly( Boolean clockWiseOnly );

	/**
	 * Color of an arrow.
	 */
	public String getColor();

	/**
	 * Color of an arrow.
	 */
	public void setColor( String color );

	/**
	 * Unique id of an arrow.
	 */
	public String getId();

	/**
	 * Unique id of an arrow.
	 */
	public void setId( String id );

	/**
	 * Inner radius of an arrow.
	 */
	public String getInnerRadius();

	/**
	 * Inner radius of an arrow.
	 */
	public void setInnerRadius( String innerRadius );

	/**
	 * "Opacity of a nail, holding the arrow."
	 */
	public double getNailAlpha();

	/**
	 * "Opacity of a nail, holding the arrow."
	 */
	public void setNailAlpha( double nailAlpha );

	/**
	 * Opacity of nail border.
	 */
	public double getNailBorderAlpha();

	/**
	 * Opacity of nail border.
	 */
	public void setNailBorderAlpha( double nailBorderAlpha );

	/**
	 * Thickness of nail border.
	 */
	public double getNailBorderThickness();

	/**
	 * Thickness of nail border.
	 */
	public void setNailBorderThickness( double nailBorderThickness );

	/**
	 * "Radius of a nail, holding the arrow."
	 */
	public double getNailRadius();

	/**
	 * "Radius of a nail, holding the arrow."
	 */
	public void setNailRadius( double nailRadius );

	/**
	 * Radius of an arrow.
	 */
	public String getRadius();

	/**
	 * Radius of an arrow.
	 */
	public void setRadius( String radius );

	/**
	 * Width of arrow root.
	 */
	public double getStartWidth();

	/**
	 * Width of arrow root.
	 */
	public void setStartWidth( double startWidth );

	/**
	 * Value to which the arrow should point at.
	 */
	public double getValue();

	/**
	 * Value to which the arrow should point at.
	 */
	public void setValue( double value );
}
