package com.amcharts.json;

import com.amcharts.api.AxisPosition;
import com.amcharts.api.IsTitle;
import com.amcharts.api.IsValueAxis;

public class ValueAxis implements IsValueAxis
{
	private IsTitle title;

	private AxisPosition position = AxisPosition.left;

	@Override
	public IsTitle getTitle()
	{
		return title;
	}

	@Override
	public void setTitle( IsTitle title )
	{
		this.title = title;
	}

	@Override
	public AxisPosition getPosition()
	{
		return position;
	}

	@Override
	public void setPosition( AxisPosition position )
	{
		this.position = position;
	}
}