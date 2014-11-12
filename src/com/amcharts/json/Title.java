package com.amcharts.json;

import com.amcharts.api.IsTitle;

public final class Title implements IsTitle
{
	private double alpha;

	private boolean bold;

	private String color;

	private String id;

	private double size;

	private String text;

	/**
	 * Opacity of a title.
	 */
	public double getAlpha()
	{
		return alpha;
	}

	/**
	 * Opacity of a title.
	 */
	public void setAlpha( double alpha )
	{
		this.alpha = alpha;
	}

	/**
	 * Specifies if title should be bold or not.
	 */
	public boolean isBold()
	{
		return bold;
	}

	/**
	 * Specifies if title should be bold or not.
	 */
	public void setBold( boolean bold )
	{
		this.bold = bold;
	}

	/**
	 * Text color of a title.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Text color of a title.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * "Unique id of a Title. You don't need to set it, unless you want to."
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * "Unique id of a Title. You don't need to set it, unless you want to."
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * Text size of a title.
	 */
	public double getSize()
	{
		return size;
	}

	/**
	 * Text size of a title.
	 */
	public void setSize( double size )
	{
		this.size = size;
	}

	/**
	 * Text of a title.
	 */
	public String getText()
	{
		return text;
	}

	/**
	 * Text of a title.
	 */
	public void setText( String text )
	{
		this.text = text;
	}
}
