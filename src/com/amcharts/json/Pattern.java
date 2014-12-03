package com.amcharts.json;

import com.amcharts.api.IsPattern;

public class Pattern implements IsPattern
{
	private String randomY;

	private String randomX;

	private String y;

	private String x;

	private String weight;

	private String height;

	private String url;

	@Override
	public String getUrl()
	{
		return this.url;
	}

	@Override
	public void setUrl( String url )
	{
		this.url = url;
	}

	@Override
	public String getHeight()
	{
		return height;
	}

	@Override
	public void setHeight( String height )
	{
		this.height = height;
	}

	@Override
	public String getWidth()
	{
		return this.weight;
	}

	@Override
	public void setWeight( String weight )
	{
		this.weight = weight;
	}

	@Override
	public String getX()
	{
		return this.x;
	}

	@Override
	public void setX( String x )
	{
		this.x = x;
	}

	@Override
	public String getY()
	{
		return this.y;
	}

	@Override
	public void setY( String y )
	{
		this.y = y;
	}

	@Override
	public String getRandomX()
	{
		return this.randomX;
	}

	@Override
	public void setRandomX( String randomX )
	{
		this.randomX = randomX;
	}

	@Override
	public String getRandomY()
	{
		return this.randomY;
	}

	@Override
	public void setRandomY( String randomY )
	{
		this.randomY = randomY;
	}
}