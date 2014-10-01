package com.amcharts.json;

import com.amcharts.model.AxisPosition;
import com.amcharts.model.IsTitle;
import com.amcharts.model.IsValueAxis;

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
