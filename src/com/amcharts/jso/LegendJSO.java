package com.amcharts.jso;

import com.amcharts.api.IsLegend;
import com.google.gwt.core.client.JavaScriptObject;

public class LegendJSO extends JavaScriptObject implements IsLegend
{
	protected LegendJSO()
	{
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#getMarginRight()
	 */
	@Override
	public final native int getMarginRight()
	/*-{
		return this.marginRight;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#getMarkerType()
	 */
	@Override
	public final native String getMarkerType()
	/*-{
		return this.markerType;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#getPosition()
	 */
	@Override
	public final native String getPosition()
	/*-{
		return this.position;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#isAutoMargins()
	 */
	@Override
	public final native boolean isAutoMargins()
	/*-{
		return this.autoMargins;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#setAutoMargins(boolean)
	 */
	@Override
	public final native void setAutoMargins( boolean autoMargins )
	/*-{
		this.autoMargins = autoMargins;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#setMarginRight(int)
	 */
	@Override
	public final native void setMarginRight( int marginRight )
	/*-{
		this.marginRight = marginRight;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#setMarkerType(java.lang.String)
	 */
	@Override
	public final native void setMarkerType( String markerType )
	/*-{
		this.markerType = markerType;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsLegend#setPosition(java.lang.String)
	 */
	@Override
	public final native void setPosition( String position )
	/*-{
		this.position = position;
	}-*/;

	public final native int getId()
	/*-{
		return id;
	}-*/;

	public final native void setId( int id )
	/*-{
		this.id = id;
	}-*/;
}