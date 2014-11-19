package com.amcharts.jso;

import com.google.gwt.core.client.JavaScriptObject;

public class MenuItemsJSO extends JavaScriptObject
{
	protected MenuItemsJSO()
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

	public final native String getIconTitle() /*-{
		return this.iconTitle;
	}-*/;

	public final native void setIconTitle( String iconTitle ) /*-{
		this.iconTitle = iconTitle;
	}-*/;

	public final native String getTextAlign() /*-{
		return this.textAlign;
	}-*/;

	public final native void setTextAlign( String textAlign ) /*-{
		this.textAlign = textAlign;
	}-*/;
}