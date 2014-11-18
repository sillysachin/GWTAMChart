package com.amcharts.impl;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsMenuItemOutput;
import com.amcharts.jso.MenuItemOutputJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class MenuItemOutput implements IJavaScriptWrapper<MenuItemOutputJSO>, IsMenuItemOutput
{
	private MenuItemOutputJSO jso;

	protected MenuItemOutput()
	{
		jso = createJso();
	}

	public MenuItemOutputJSO getJso()
	{
		return this.jso;
	}

	public void setJso( MenuItemOutputJSO jso )
	{
		this.jso = jso;
	}

	public native MenuItemOutputJSO createJso() /*-{
		return {};
	}-*/;

	public final native String getBackgroundColor() /*-{
		return this.@com.amcharts.impl.MenuItemOutput::jso.backgroundColor;
	}-*/;

	public final native void setBackgroundColor( String backgroundColor ) /*-{
		this.@com.amcharts.impl.MenuItemOutput::jso.backgroundColor = backgroundColor;
	}-*/;

	public final native String getFileName() /*-{
		return this.@com.amcharts.impl.MenuItemOutput::jso.fileName;
	}-*/;

	public final native void setFileName( String fileName ) /*-{
		this.@com.amcharts.impl.MenuItemOutput::jso.fileName = fileName;
	}-*/;

	public final native String getFormat() /*-{
		return this.@com.amcharts.impl.MenuItemOutput::jso.format;
	}-*/;

	public final native void setFormat( String format ) /*-{
		this.@com.amcharts.impl.MenuItemOutput::jso.format = format;
	}-*/;

	public final native String getOutput() /*-{
		return this.@com.amcharts.impl.MenuItemOutput::jso.output;
	}-*/;

	public final native void setOutput( String output ) /*-{
		this.@com.amcharts.impl.MenuItemOutput::jso.output = output;
	}-*/;

	public final native String getRender() /*-{
		return this.@com.amcharts.impl.MenuItemOutput::jso.render;
	}-*/;

	public final native void setRender( String render ) /*-{
		this.@com.amcharts.impl.MenuItemOutput::jso.render = render;
	}-*/;

	public final native double getDpi() /*-{
		return this.@com.amcharts.impl.MenuItemOutput::jso.dpi;
	}-*/;

	public final native void setDpi( double dpi ) /*-{
		this.@com.amcharts.impl.MenuItemOutput::jso.dpi = dpi;
	}-*/;

	public final native IsFunction getOnclick() /*-{
		return this.@com.amcharts.impl.MenuItemOutput::jso.onclick;
	}-*/;

	public final native void setOnclick( IsFunction onclick ) /*-{
		this.@com.amcharts.impl.MenuItemOutput::jso.onclick = onclick;
	}-*/;
}
