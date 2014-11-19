package com.amcharts.impl;

import com.amcharts.jso.ItemJSO;

public class Item
{
	private ItemJSO jso;

	public Item()
	{
		setJso( ( ItemJSO ) ItemJSO.createObject().cast() );
	}

	public ItemJSO getJso()
	{
		return jso;
	}

	public void setJso( ItemJSO jso )
	{
		this.jso = jso;
	}

	public final String getIcon()
	{
		return getJso().getIcon();
	}

	public final  void setIcon( String icon )
	{
		getJso().setIcon(icon);
	}

	public final String getFormat()
	{
		return getJso().getFormat();
	}

	public final  void setFormat( String format )
	{
		getJso().setFormat(format);
	}
	
	public native String getTitle() /*-{
		return this.@com.amcharts.impl.Item::jso.title;
	}-*/;

	public native void setTitle( String title ) /*-{
		this.@com.amcharts.impl.Item::jso.title = title;
	}-*/;

}