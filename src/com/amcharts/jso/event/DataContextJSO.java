package com.amcharts.jso.event;

import com.google.gwt.core.client.JavaScriptObject;

public class DataContextJSO extends JavaScriptObject
{
	protected DataContextJSO()
	{
	}

	public final native Integer getId()
	/*-{
		return this.id;
	}-*/;

	public final native void setId( Integer id )
	/*-{
		this.id = id;
	}-*/;
}