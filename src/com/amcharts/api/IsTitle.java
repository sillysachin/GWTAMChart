package com.amcharts.api;

public interface IsTitle
{
	/**
	 * Opacity of a title.
	 */
	public double getAlpha();

	/**
	 * Opacity of a title.
	 */
	public void setAlpha( double alpha );

	/**
	 * Specifies if title should be bold or not.
	 */
	public boolean isBold();

	/**
	 * Specifies if title should be bold or not.
	 */
	public void setBold( boolean bold );

	/**
	 * Text color of a title.
	 */
	public String getColor();

	/**
	 * Text color of a title.
	 */
	public void setColor( String color );

	/**
	 * "Unique id of a Title. You don't need to set it, unless you want to."
	 */
	public String getId();

	/**
	 * "Unique id of a Title. You don't need to set it, unless you want to."
	 */
	public void setId( String id );

	/**
	 * Text size of a title.
	 */
	public double getSize();

	/**
	 * Text size of a title.
	 */
	public void setSize( double size );

	/**
	 * Text of a title.
	 */
	public String getText();

	/**
	 * Text of a title.
	 */
	public void setText( String text );
}
