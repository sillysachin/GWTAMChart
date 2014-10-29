package com.amcharts.jso;

import com.amcharts.api.IsMenuItem;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuItemJSO extends JavaScriptObject implements IsMenuItem
{
	protected MenuItemJSO()
	{
	}

	@Override
	public final native String getIcon()
	/*-{
		return this.icon;
	}-*/;

	@Override
	public final native void setIcon( String icon )
	/*-{
		this.icon = icon;
	}-*/;

	@Override
	public final native String getFormat()
	/*-{
		return this.format;
	}-*/;

	@Override
	public final native void setFormat( String format )
	/*-{
		this.format = format;
	}-*/;

}
