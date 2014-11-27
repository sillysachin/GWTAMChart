package com.amcharts.json;

import com.amcharts.api.IsFunction;

public class JsFunction implements IsFunction
{
	private String functionString;

	@Override
	public String getFunctionString()
	{
		return functionString;
	}

	@Override
	public void setFunctionString( String functionString )
	{
		this.functionString = functionString;
	}

	@Override
	public String toString()
	{
		return functionString;
	}
}