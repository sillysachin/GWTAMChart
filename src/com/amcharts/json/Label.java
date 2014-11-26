package com.amcharts.json;

import com.amcharts.api.IsLabel;

public final class Label implements IsLabel
{
	private String align;

	private double alpha;

	private Boolean bold;

	private String color;

	private String id;

	private double rotation;

	private double size;

	private String text;

	private String url;

	private String x;

	private String y;

	/**
	 *
	 */
	public String getAlign()
	{
		return align;
	}

	/**
	 *
	 */
	public void setAlign( String align )
	{
		this.align = align;
	}

	/**
	 *
	 */
	public double getAlpha()
	{
		return alpha;
	}

	/**
	 *
	 */
	public void setAlpha( double alpha )
	{
		this.alpha = alpha;
	}

	/**
	 * Specifies if label is bold or not.
	 */
	public Boolean isBold()
	{
		return bold;
	}

	/**
	 * Specifies if label is bold or not.
	 */
	public void setBold( Boolean bold )
	{
		this.bold = bold;
	}

	/**
	 * Color of a label.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Color of a label.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * "Unique id of a Label. You don't need to set it, unless you want to."
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * "Unique id of a Label. You don't need to set it, unless you want to."
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * Rotation angle.
	 */
	public double getRotation()
	{
		return rotation;
	}

	/**
	 * Rotation angle.
	 */
	public void setRotation( double rotation )
	{
		this.rotation = rotation;
	}

	/**
	 * Text size.
	 */
	public double getSize()
	{
		return size;
	}

	/**
	 * Text size.
	 */
	public void setSize( double size )
	{
		this.size = size;
	}

	/**
	 * Text of a label.
	 */
	public String getText()
	{
		return text;
	}

	/**
	 * Text of a label.
	 */
	public void setText( String text )
	{
		this.text = text;
	}

	/**
	 * URL which will be access if user clicks on a label.
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * URL which will be access if user clicks on a label.
	 */
	public void setUrl( String url )
	{
		this.url = url;
	}

	/**
	 * X position of a label.
	 */
	public String getX()
	{
		return x;
	}

	/**
	 * X position of a label.
	 */
	public void setX( String x )
	{
		this.x = x;
	}

	/**
	 * y position of a label.
	 */
	public String getY()
	{
		return y;
	}

	/**
	 * y position of a label.
	 */
	public void setY( String y )
	{
		this.y = y;
	}
}
