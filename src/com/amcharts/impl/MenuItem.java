package com.amcharts.impl;

import com.amcharts.api.IsMenuItem;
import com.amcharts.jso.MenuItemJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuItem implements IJavaScriptWrapper, IsMenuItem
{
	private MenuItemJSO jso;

	public MenuItem()
	{
		setJso( JavaScriptObject.createObject() );
	}

	@Override
	public JavaScriptObject getJso()
	{
		return jso;
	}

	@Override
	public void setJso( JavaScriptObject jso )
	{
		this.jso = jso.cast();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.impl.IsMenuItem#getIcon()
	 */
	@Override
	public native String getIcon() /*-{
		return this.@com.amcharts.impl.MenuItem::jso.icon;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.impl.IsMenuItem#setIcon(java.lang.String)
	 */
	@Override
	public native void setIcon( String icon ) /*-{
		this.@com.amcharts.impl.MenuItem::jso.icon = icon;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.impl.IsMenuItem#getFormat()
	 */
	@Override
	public native String getFormat() /*-{
		return this.@com.amcharts.impl.MenuItem::jso.format;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.impl.IsMenuItem#setFormat(java.lang.String)
	 */
	@Override
	public native void setFormat( String format ) /*-{
		this.@com.amcharts.impl.MenuItem::jso.format = format;
	}-*/;
}