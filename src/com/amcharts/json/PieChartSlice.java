package com.amcharts.json;

import com.amcharts.api.AmChartDataObject;

public class PieChartSlice implements AmChartDataObject
{
	private static final long serialVersionUID = -6197470312910551481L;

	private String key;

	private String value;

	public String getKey()
	{
		return key;
	}

	public void setKey( String key )
	{
		this.key = key;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue( String value )
	{
		this.value = value;
	}
}