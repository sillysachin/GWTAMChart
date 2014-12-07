package com.amcharts.impl.event;

import com.amcharts.api.IsDataContext;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class DataContext extends JavaScriptObject implements IsDataContext
{
	protected DataContext()
	{
	}

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#getId()
	 */
	@Override
	public final native Integer getId()
	/*-{
		return this.id;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#setId(java.lang.Integer)
	 */
	@Override
	public final native void setId( Integer id )
	/*-{
		this.id = id;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#getClassName()
	 */
	@Override
	public final native String getClassName()
	/*-{
		return className;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#setClassName(java.lang.String)
	 */
	@Override
	public final native void setClassName( String className )
	/*-{
		this.className = className;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#getColor()
	 */
	@Override
	public final native String getColor()
	/*-{
		return color;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#setColor(java.lang.String)
	 */
	@Override
	public final native void setColor( String color )
	/*-{
		this.color = color;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#getPercent()
	 */
	@Override
	public final native String getPercent()
	/*-{
		return percent;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#setPercent(java.lang.String)
	 */
	@Override
	public final native void setPercent( String percent )
	/*-{
		this.percent = percent;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#getType()
	 */
	@Override
	public final native String getType()
	/*-{
		return type;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#setType(java.lang.String)
	 */
	@Override
	public final native void setType( String type )
	/*-{
		this.type = type;
	}-*/;

	public final native JsArray<JavaScriptObject> getSubSet()
	/*-{
		return this.subSet;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.api.event.IsDataContext#getSubSetTitle()
	 */
	@Override
	public final native String getSubSetTitle()
	/*-{
		return this.subSetTitle;
	}-*/;
}