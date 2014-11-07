package com.amcharts.jso;

import com.amcharts.api.IsCategoryAxis;
import com.google.gwt.core.client.JavaScriptObject;

public class CategoryAxisJSO extends JavaScriptObject implements IsCategoryAxis
{
	protected CategoryAxisJSO()
	{
	}

	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	@Override
	public final native void setTitle( String title )
	/*-{
		this.title = title;
	}-*/;

	@Override
	public final native String getPosition()
	/*-{
		return this.position;
	}-*/;

	@Override
	public final native void setPosition( String position )
	/*-{
		this.position = position;
	}-*/;

	@Override
	public final native String getGridPosition() /*-{
		return this.gridPosition;
	}-*/;

	@Override
	public final native void setGridPosition( String gridPosition )
	/*-{
		this.gridPosition = gridPosition;
	}-*/;
}