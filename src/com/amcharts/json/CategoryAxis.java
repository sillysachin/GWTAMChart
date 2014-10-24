package com.amcharts.json;

import com.amcharts.api.AxisPosition;
import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsTitle;

public class CategoryAxis implements IsCategoryAxis
{
	private IsTitle title;

	private AxisPosition position = AxisPosition.bottom;

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
