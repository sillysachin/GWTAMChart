package com.amcharts.impl.event;

import com.amcharts.impl.SerialDataItem;
import com.amcharts.jso.AmGraphJSO;
import com.google.gwt.core.client.JavaScriptObject;

public class ClickItem extends JavaScriptObject
{
	protected ClickItem()
	{
	}

	public final native String getBulletGraphics()
	/*-{
		return this.bulletGraphics;
	}-*/;

	public final native void setBulletGraphics( String bulletGraphics )
	/*-{
		this.bulletGraphics = bulletGraphics;
	}-*/;

	public final native int getCategory()
	/*-{
		return this.category;
	}-*/;

	public final native void setCategory( int category )
	/*-{
		this.category = category;
	}-*/;

	public final native DataContext getDataContext()
	/*-{
		return this.dataContext;
	}-*/;

	public final native void setDataContext( DataContext dataContext )
	/*-{
		this.dataContext = dataContext;
	}-*/;

	public final native AmGraphJSO getGraph()
	/*-{
		return this.graph;
	}-*/;

	public final native void setGraph( AmGraphJSO graph )
	/*-{
		this.graph = graph;
	}-*/;

	public final native int getIndex()
	/*-{
		return this.index;
	}-*/;

	public final native void setIndex( int index )
	/*-{
		this.index = index;
	}-*/;

	public final native Boolean isNegative()
	/*-{
		return this.isNegative;
	}-*/;

	public final native void setNegative( Boolean isNegative )
	/*-{
		this.isNegative = isNegative;
	}-*/;

	public final native SerialDataItem getSerialDataItem()
	/*-{
		return this.serialDataItem;
	}-*/;

	public final native void setSerialDataItem( SerialDataItem serialDataItem )
	/*-{
		this.serialDataItem = serialDataItem;
	}-*/;

	public final native JavaScriptObject getValues()
	/*-{
		return this.values;
	}-*/;

	public final native void setValues( JavaScriptObject values )
	/*-{
		this.values = values;
	}-*/;

	public final native double getX()
	/*-{
		return this.x;
	}-*/;

	public final native void setX( double x )
	/*-{
		this.x = x;
	}-*/;

	public final native double getY()
	/*-{
		return this.y;
	}-*/;

	public final native void setY( double y )
	/*-{
		this.y = y;
	}-*/;
}
