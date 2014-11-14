package com.amcharts.impl;

import java.util.ArrayList;
import java.util.List;

import com.amcharts.api.IsExportConfig;
import com.amcharts.api.IsMenuItem;
import com.amcharts.impl.util.WrapperUtils;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class ExportConfig implements IsExportConfig, IJavaScriptWrapper
{
	private JavaScriptObject jso;

	public ExportConfig()
	{
		setJso( JavaScriptObject.createObject() );
		setMenuItems( new ArrayList<MenuItem>() );
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

	public List<MenuItem> getMenuItems()
	{
		JavaScriptObject menuItemsJSO = getMenuItemsJSO();
		List<JavaScriptObject> list = WrapperUtils.getList( menuItemsJSO );
		List<MenuItem> menuItems = new ArrayList<MenuItem>();
		for ( int i = 0; i < list.size(); i++ )
		{
			MenuItem menuItem = new MenuItem();
			menuItem.setJso( list.get( i ) );
			menuItems.add( menuItem );
		}
		return menuItems;
	}

	private native JavaScriptObject getMenuItemsJSO() /*-{
		return @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this).menuItems;
	}-*/;

	public native void setMenuItems( List<MenuItem> menuItems ) /*-{
		var jsList = @com.amcharts.impl.util.WrapperUtils::unwrapList(Ljava/util/List;)(menuItems);
		@com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this).menuItems = jsList;
	}-*/;

	public native void addMenuItem( IsMenuItem menuItem )
	/*-{
		var varMenuItem = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(menuItem)
		this.@com.amcharts.impl.ExportConfig::jso.menuItems.push(varMenuItem)
	}-*/;

	public native void setMenuTop( String menuTop )
	/*-{
		this.@com.amcharts.impl.ExportConfig::jso.menuTop = menuTop;
	}-*/;

	public native void setMenuTop( int menuTop )
	/*-{
		this.@com.amcharts.impl.ExportConfig::jso.menuTop = menuTop;
	}-*/;

	public native String getMenuTop()
	/*-{
		return this.@com.amcharts.impl.ExportConfig::jso.menuTop;
	}-*/;

	public native void setMenuRight( String menuRight )
	/*-{
		return this.@com.amcharts.impl.ExportConfig::jso.menuRight;
	}-*/;

	public native void setMenuRight( int menuRight )
	/*-{
		return this.@com.amcharts.impl.ExportConfig::jso.menuRight;
	}-*/;

	public native String getMenuRight()
	/*-{
		return this.@com.amcharts.impl.ExportConfig::jso.menuRight;
	}-*/;

	public native void setMenuBottom( String menuBottom )
	/*-{
		return this.@com.amcharts.impl.ExportConfig::jso.menuBottom;
	}-*/;

	public native String getMenuBottom()
	/*-{
		return this.@com.amcharts.impl.ExportConfig::jso.menuBottom;
	}-*/;

	public native void setMenuBottom( int menuBottom )
	/*-{
		return this.@com.amcharts.impl.ExportConfig::jso.menuBottom;
	}-*/;
}