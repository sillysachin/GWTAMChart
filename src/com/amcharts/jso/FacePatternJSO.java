package com.amcharts.jso;

import com.amcharts.api.IsFacePattern;
import com.google.gwt.core.client.JavaScriptObject;

public class FacePatternJSO extends JavaScriptObject implements IsFacePattern
{
	protected FacePatternJSO()
	{
	}

	@Override
	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	@Override
	public final native double getWidth()
	/*-{
		return this.width;
	}-*/;

	@Override
	public final native double getHeight()
	/*-{
		return this.height;
	}-*/;

	@Override
	public final native void setUrl( String url )
	/*-{
		this.url = url;
	}-*/;

	@Override
	public final native void setWidth( double width )
	/*-{
		this.width = width;
	}-*/;

	@Override
	public final native void setHeight( double height )
	/*-{
		this.height = height;
	}-*/;
}