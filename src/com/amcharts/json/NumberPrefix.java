package com.amcharts.json;

import com.amcharts.api.IsNumberPrefix;

public class NumberPrefix implements IsNumberPrefix
{
	private String number;

	private String prefix;

	@Override
	public String getNumber()
	{
		return this.number;
	}

	@Override
	public  void setNumber( String number )
	{
		this.number = number;
	}

	@Override
	public String getPrefix()
	{
		return this.prefix;
	}

	@Override
	public  void setPrefix( String prefix )
	{
		this.prefix = prefix;
	}
}