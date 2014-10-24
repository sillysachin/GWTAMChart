package com.amcharts.jso;

import com.amcharts.api.IsTitle;
import com.google.gwt.core.client.JavaScriptObject;

public class AmTitleJSO extends JavaScriptObject implements IsTitle
{
	protected AmTitleJSO()
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

	public static native AmTitleJSO create( String text )
	/*-{
		return {text: text};
	}-*/;
}