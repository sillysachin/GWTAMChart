package com.amcharts.json;

import com.amcharts.api.AxisPosition;
import com.amcharts.api.IsCategoryAxis;

public class CategoryAxis implements IsCategoryAxis
{
	private String title;

	private String position = AxisPosition.BOTTOM.toString().toLowerCase();

	private String gridPosition;

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

	@Override
	public String getGridPosition()
	{
		return this.gridPosition;
	}

	@Override
	public void setGridPosition( String gridPosition )
	{
		this.gridPosition = gridPosition;
	}
}