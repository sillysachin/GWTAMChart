package com.amcharts.json;

import com.amcharts.api.AxisPosition;
import com.amcharts.api.IsValueAxis;

public class ValueAxis implements IsValueAxis
{
	private String title;

	private String position = AxisPosition.LEFT.toString().toLowerCase();

	@Override
	public String getTitle()
	{
		return title;
	}

	@Override
	public void setTitle( String title )
	{
		this.title = title;
	}

	@Override
	public String getPosition()
	{
		return position;
	}

	@Override
	public void setPosition( String position )
	{
		this.position = position;
	}
}