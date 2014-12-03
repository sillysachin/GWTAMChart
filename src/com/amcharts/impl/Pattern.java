package com.amcharts.impl;

import com.amcharts.api.IsPattern;
import com.google.gwt.core.client.JavaScriptObject;

public class Pattern extends JavaScriptObject implements IsPattern
{
	protected Pattern()
	{
	}

	@Override
	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	@Override
	public final native void setUrl( String url )
	/*-{
		this.url = url;
	}-*/;

	@Override
	public final native String getHeight()
	/*-{
		return height;
	}-*/;

	@Override
	public final native void setHeight( String height )
	/*-{
		this.height = height;
	}-*/;

	@Override
	public final native String getWidth()
	/*-{
		return this.weight;
	}-*/;

	@Override
	public final native void setWeight( String weight )
	/*-{
		this.weight = weight;
	}-*/;

	@Override
	public final native String getX()
	/*-{
		return this.x;
	}-*/;

	@Override
	public final native void setX( String x )
	/*-{
		this.x = x;
	}-*/;

	@Override
	public final native String getY()
	/*-{
		return this.y;
	}-*/;

	@Override
	public final native void setY( String y )
	/*-{
		this.y = y;
	}-*/;

	@Override
	public final native String getRandomX()
	/*-{
		return this.randomX;
	}-*/;

	@Override
	public final native void setRandomX( String randomX )
	/*-{
		this.randomX = randomX;
	}-*/;

	@Override
	public final native String getRandomY()
	/*-{
		return this.randomY;
	}-*/;

	@Override
	public final native void setRandomY( String randomY )
	/*-{
		this.randomY = randomY;
	}-*/;
}