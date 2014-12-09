package com.amcharts.impl;

import com.amcharts.api.IsMenuItem;
import com.amcharts.jso.ItemJSO;
import com.amcharts.jso.MenuItemJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuItem implements IJavaScriptWrapper<JavaScriptObject>, IsMenuItem
{
	private MenuItemJSO jso;

	public MenuItem()
	{
		setJso( MenuItemJSO.createObject().cast() );
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

	/* (non-Javadoc)
	 * @see com.amcharts.impl.IsMenuItem#getTitle()
	 */

	@Override
	public native String getTitle() /*-{
		return this.@com.amcharts.impl.MenuItem::jso.title;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.impl.IsMenuItem#setTitle(java.lang.String)
	 */
	@Override
	public native void setTitle( String title ) /*-{
		this.@com.amcharts.impl.MenuItem::jso.title = title;
	}-*/;

	public native String getIconTitle() /*-{
		return this.@com.amcharts.impl.MenuItem::jso.iconTitle;
	}-*/;

	public native void setIconTitle( String iconTitle ) /*-{
		this.@com.amcharts.impl.MenuItem::jso.iconTitle = iconTitle;
	}-*/;

	public native String getTextAlign() /*-{
		return this.@com.amcharts.impl.MenuItem::jso.textAlign;
	}-*/;

	public native void setTextAlign( String textAlign ) /*-{
		this.@com.amcharts.impl.MenuItem::jso.textAlign = textAlign;
	}-*/;

	public void addItem( Item item )
	{
		ItemJSO itemJso = item.getJso();
		addItem( itemJso );
	}

	private native void addItem( ItemJSO itemJso )/*-{
		if (this.@com.amcharts.impl.MenuItem::jso.items == undefined) {
			this.@com.amcharts.impl.MenuItem::jso.items = [];
		}
		this.@com.amcharts.impl.MenuItem::jso.items.push(itemJso)
	}-*/;
}