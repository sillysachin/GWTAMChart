package com.amcharts.json;

import com.amcharts.api.AmChartData;

public class PieChartSlice implements AmChartData
{
	private static final long serialVersionUID = -6197470312910551481L;

	private String country;

	private String litres;

	public String getCountry()
	{
		return country;
	}

	public void setCountry( String country )
	{
		this.country = country;
	}

	public String getLitres()
	{
		return litres;
	}

	public void setLitres( String litres )
	{
		this.litres = litres;
	}
}