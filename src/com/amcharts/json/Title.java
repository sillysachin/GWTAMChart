package com.amcharts.json;

import com.amcharts.model.IsTitle;

public class Title implements IsTitle
{
	private String text;

	public Title()
	{

	}

	public Title( String text )
	{
		this.text = text;
	}

	@Override
	public String getText()
	{
		return text;
	}

	@Override
	public void setText( String text )
	{
		this.text = text;
	}
}
