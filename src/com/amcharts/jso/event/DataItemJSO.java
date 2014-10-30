package com.amcharts.jso.event;

import com.google.gwt.core.client.JavaScriptObject;

public class DataItemJSO extends JavaScriptObject
{
	protected DataItemJSO()
	{
	}

	public final native DataContextJSO getDataContext()
	/*-{
		return this.dataContext;
	}-*/;
}