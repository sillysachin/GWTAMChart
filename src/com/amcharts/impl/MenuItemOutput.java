package com.amcharts.impl;

import com.amcharts.api.IsMenuItemOutput;
import com.amcharts.jso.MenuItemOutputJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

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
		var jso = {}
		jso.className = 'MenuItemOutput';
		return jso;
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

	public final native JavaScriptObject getOnClick() /*-{
		return this.@com.amcharts.impl.MenuItemOutput::jso.onclick;
	}-*/;

	public final native void setOnClick( MenuItemOutputCallback menuItemOutputCallback ) /*-{
		varMenuItemOutputThis = this;
		this.@com.amcharts.impl.MenuItemOutput::jso.onclick = function(
				instance, config, event) {
			event.preventDefault();
			var amExport = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(instance);
			var menuItemOutput = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(config);
			varMenuItemOutputThis.@com.amcharts.impl.MenuItemOutput::execute(Lcom/amcharts/impl/MenuItemOutputCallback;Lcom/amcharts/impl/AmExport;Lcom/amcharts/impl/MenuItemOutput;)(menuItemOutputCallback,amExport, menuItemOutput)
		};
	}-*/;

	public final void execute( MenuItemOutputCallback menuItemOutputCallback, AmExport instance, MenuItemOutput config )
	{
		menuItemOutputCallback.execute( instance, config );
	}
}