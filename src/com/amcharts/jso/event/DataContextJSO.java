package com.amcharts.jso.event;

import com.google.gwt.core.client.JavaScriptObject;

public class DataContextJSO extends JavaScriptObject
{
	protected DataContextJSO()
	{
	}

	public final native Integer getId()
	/*-{
		return this.id;
	}-*/;

	public final native void setId( Integer id )
	/*-{
		this.id = id;
	}-*/;

	public final native String getClassName()
	/*-{
		return className;
	}-*/;

	public final native void setClassName( String className )
	/*-{
		this.className = className;
	}-*/;

	public final native String getColor()
	/*-{
		return color;
	}-*/;

	public final native void setColor( String color )
	/*-{
		this.color = color;
	}-*/;

	public final native String getPercent()
	/*-{
		return percent;
	}-*/;

	public final native void setPercent( String percent )
	/*-{
		this.percent = percent;
	}-*/;

	public final native String getType()
	/*-{
		return type;
	}-*/;

	public final native void setType( String type )
	/*-{
		this.type = type;
	}-*/;
}