package com.amcharts.api;

public interface IsGuageBand
{
	/**
	 * Opacity of band fill. Will use axis.bandAlpha if not set any.
	 */
	public double getAlpha();

	/**
	 * Opacity of band fill. Will use axis.bandAlpha if not set any.
	 */
	public void setAlpha( double alpha );

	/**
	 * "When rolled-over, band will display balloon if you set some text for this property."
	 */
	public String getBalloonText();

	/**
	 * "When rolled-over, band will display balloon if you set some text for this property."
	 */
	public void setBalloonText( String balloonText );

	/**
	 * Color of a band.
	 */
	public String getColor();

	/**
	 * Color of a band.
	 */
	public void setColor( String color );

	/**
	 * End value of a fill.
	 */
	public double getEndValue();

	/**
	 * End value of a fill.
	 */
	public void setEndValue( double endValue );

	/**
	 * Unique id of a band.
	 */
	public String getId();

	/**
	 * Unique id of a band.
	 */
	public void setId( String id );

	/**
	 * "Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band to be drawn to the axis center."
	 */
	public String getInnerRadius();

	/**
	 * "Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band to be drawn to the axis center."
	 */
	public void setInnerRadius( String innerRadius );

	/**
	 * "Band radius. If not set any, the band will start with the axis outline."
	 */
	public String getRadius();

	/**
	 * "Band radius. If not set any, the band will start with the axis outline."
	 */
	public void setRadius( String radius );

	/**
	 * Start value of a fill.
	 */
	public double getStartValue();

	/**
	 * Start value of a fill.
	 */
	public void setStartValue( double startValue );
}
