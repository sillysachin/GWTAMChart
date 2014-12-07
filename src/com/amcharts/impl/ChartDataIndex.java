package com.amcharts.impl;

public class ChartDataIndex
{
	private int index;

	private String title;

	private String prev;

	public void setIndex( int index )
	{
		this.index = index;
	}

	public void setTitle( String title )
	{
		this.title = title;
	}

	public void setPrev( String prev )
	{
		this.prev = prev;
	}

	public String getPrev()
	{
		return prev;
	}

	public int getIndex()
	{
		return index;
	}

	public String getTitle()
	{
		return title;
	}
}