package com.amcharts.jso;

import com.google.gwt.core.client.JavaScriptObject;

public class ItemJSO extends JavaScriptObject
{
	protected ItemJSO()
	{
	}

	public final native String getIcon()
	/*-{
		return this.icon;
	}-*/;

	public final native void setIcon( String icon )
	/*-{
		this.icon = icon;
	}-*/;

	public final native String getFormat()
	/*-{
		return this.format;
	}-*/;

	public final native void setFormat( String format )
	/*-{
		this.format = format;
	}-*/;

	public final native String getTitle()
	/*-{
		this.title = title;
	}-*/;

	public final native void setTitle( String title )
	/*-{
		this.title = title;
	}-*/;
}