package com.amcharts.api;

public interface IsLabel
{
	/**
	 *
	 */
	public String getAlign();

	/**
	 *
	 */
	public void setAlign( String align );

	/**
	 *
	 */
	public double getAlpha();

	/**
	 *
	 */
	public void setAlpha( double alpha );

	/**
	 * Specifies if label is bold or not.
	 */
	public boolean isBold();

	/**
	 * Specifies if label is bold or not.
	 */
	public void setBold( boolean bold );

	/**
	 * Color of a label.
	 */
	public String getColor();

	/**
	 * Color of a label.
	 */
	public void setColor( String color );

	/**
	 * "Unique id of a Label. You don't need to set it, unless you want to."
	 */
	public String getId();

	/**
	 * "Unique id of a Label. You don't need to set it, unless you want to."
	 */
	public void setId( String id );

	/**
	 * Rotation angle.
	 */
	public double getRotation();

	/**
	 * Rotation angle.
	 */
	public void setRotation( double rotation );

	/**
	 * Text size.
	 */
	public double getSize();

	/**
	 * Text size.
	 */
	public void setSize( double size );

	/**
	 * Text of a label.
	 */
	public String getText();

	/**
	 * Text of a label.
	 */
	public void setText( String text );

	/**
	 * URL which will be access if user clicks on a label.
	 */
	public String getUrl();

	/**
	 * URL which will be access if user clicks on a label.
	 */
	public void setUrl( String url );

	/**
	 * X position of a label.
	 */
	public String getX();

	/**
	 * X position of a label.
	 */
	public void setX( String x );

	/**
	 * y position of a label.
	 */
	public String getY();

	/**
	 * y position of a label.
	 */
	public void setY( String y );
}
