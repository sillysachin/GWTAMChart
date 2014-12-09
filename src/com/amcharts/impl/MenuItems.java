package com.amcharts.impl;

import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuItems implements IJavaScriptWrapper<JavaScriptObject>
{
	private JavaScriptObject jso;

	public MenuItems()
	{
		setJso( JavaScriptObject.createArray() );
	}

	@Override
	public JavaScriptObject getJso()
	{
		return jso;
	}

	@Override
	public void setJso( JavaScriptObject jso )
	{
		this.jso = jso;
	}
}