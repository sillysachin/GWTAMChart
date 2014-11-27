package com.amcharts.impl;

import com.amcharts.api.IsFunction;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;

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

	public static JavaScriptObject getJSInstance( JsFunction jsFunction )
	{
		JavaScriptObject jsFunctionJSO = JsonUtils.unsafeEval( jsFunction
				.getFunctionString() );
		return jsFunctionJSO;
	}

	public static JsFunction getInstance( JavaScriptObject jsFunctionJSO )
	{
		JsFunction jsFunction = new JsFunction();
		jsFunction.setFunctionString( jsFunctionJSO.toString() );
		return jsFunction;
	}
}