package com.amcharts.jso;

import com.amcharts.api.IsAmLegendData;
import com.google.gwt.core.client.JavaScriptObject;

public class AmLegendDataJSO extends JavaScriptObject implements IsAmLegendData
{
	protected AmLegendDataJSO()
	{
	}

	@Override
	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	@Override
	public final native String getColor()
	/*-{
		return this.color;
	}-*/;

	@Override
	public final native String getMarkerType()
	/*-{
		return this.markerType;
	}-*/;

	@Override
	public final native void setTitle( String title )
	/*-{
		this.title = title;
	}-*/;

	@Override
	public final native void setColor( String color )
	/*-{
		this.color = color;

	}-*/;

	@Override
	public final native void setMarkerType( String markerType )
	/*-{
		this.markerType = markerType;
	}-*/;
}