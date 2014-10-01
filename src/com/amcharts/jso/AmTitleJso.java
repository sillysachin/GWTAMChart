package com.amcharts.jso;

import com.amcharts.model.IsTitle;
import com.google.gwt.core.client.JavaScriptObject;

public class AmTitleJso extends JavaScriptObject implements IsTitle
{
	protected AmTitleJso()
	{
	}

	@Override
	public final native String getText()
	/*-{
		return this.text;
	}-*/;

	@Override
	public final native void setText( String text )
	/*-{
		this.text = text;
	}-*/;

	public static native AmTitleJso create( String text )
	/*-{
		return {text: text};
	}-*/;
}