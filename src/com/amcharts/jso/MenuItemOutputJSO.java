package com.amcharts.jso;

import com.amcharts.api.IsFunction;
import com.amcharts.api.IsMenuItemOutput;
import com.google.gwt.core.client.JavaScriptObject;

public final class MenuItemOutputJSO extends JavaScriptObject implements IsMenuItemOutput
{
	protected MenuItemOutputJSO()
	{
	}

	public final native String getBackgroundColor() /*-{
		return backgroundColor;
	}-*/;

	public final native void setBackgroundColor( String backgroundColor ) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native String getFileName() /*-{
		return fileName;
	}-*/;

	public final native void setFileName( String fileName ) /*-{
		this.fileName = fileName;
	}-*/;

	public final native String getFormat() /*-{
		return format;
	}-*/;

	public final native void setFormat( String format ) /*-{
		this.format = format;
	}-*/;

	public final native String getOutput() /*-{
		return output;
	}-*/;

	public final native void setOutput( String output ) /*-{
		this.output = output;
	}-*/;

	public final native String getRender() /*-{
		return render;
	}-*/;

	public final native void setRender( String render ) /*-{
		this.render = render;
	}-*/;

	public final native double getDpi() /*-{
		return dpi;
	}-*/;

	public final native void setDpi( double dpi ) /*-{
		this.dpi = dpi;
	}-*/;

	public final native IsFunction getOnclick() /*-{
		return onclick;
	}-*/;

	public final native void setOnclick( IsFunction onclick ) /*-{
		this.onclick = onclick;
	}-*/;
}
