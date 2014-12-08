package com.amcharts.impl.event;

import com.google.gwt.core.client.JavaScriptObject;

public class DataItem extends JavaScriptObject
{
	protected DataItem()
	{
	}

	public final native double getBalloonX()
	/*-{
		return this.balloonX;
	}-*/;

	public final native void setBalloonX( double balloonX )
	/*-{
		this.balloonX = balloonX;
	}-*/;

	public final native double getBalloonY()
	/*-{
		return this.balloonY;
	}-*/;

	public final native void setBalloonY( double balloonY )
	/*-{
		this.balloonY = balloonY;
	}-*/;

	public final native String getClassName()
	/*-{
		return this.className;
	}-*/;

	public final native void setClassName( String className )
	/*-{
		this.className = className;
	}-*/;

	public final native Integer getIndex()
	/*-{
		return this.index;
	}-*/;

	public final native void setIndex( Integer index )
	/*-{
		this.index = index;
	}-*/;

	public final native double getIx()
	/*-{
		return this.ix;
	}-*/;

	public final native void setIx( double ix )
	/*-{
		this.ix = ix;
	}-*/;

	public final native double getIy()
	/*-{
		return this.iy;
	}-*/;

	public final native void setIy( double iy )
	/*-{
		this.iy = iy;
	}-*/;

	public final native String getLabelColor()
	/*-{
		return this.labelColor;
	}-*/;

	public final native void setLabelColor( String labelColor )
	/*-{
		this.labelColor = labelColor;
	}-*/;

	public final native int getLabelQuarter()
	/*-{
		return this.labelQuarter;
	}-*/;

	public final native void setLabelQuarter( int labelQuarter )
	/*-{
		this.labelQuarter = labelQuarter;
	}-*/;

	public final native double getLabelRadius()
	/*-{
		return this.labelRadius;
	}-*/;

	public final native void setLabelRadius( double labelRadius )
	/*-{
		this.labelRadius = labelRadius;
	}-*/;

	public final native String getPattern()
	/*-{
		return this.pattern;
	}-*/;

	public final native void setPattern( String pattern )
	/*-{
		this.pattern = pattern;
	}-*/;

	public final native double getPullX()
	/*-{
		return this.pullX;
	}-*/;

	public final native void setPullX( double pullX )
	/*-{
		this.pullX = pullX;
	}-*/;

	public final native double getPullY()
	/*-{
		return this.pullY;
	}-*/;

	public final native void setPullY( double pullY )
	/*-{
		this.pullY = pullY;
	}-*/;

	public final native double getStartAngle()
	/*-{
		return this.startAngle;
	}-*/;

	public final native void setStartAngle( double startAngle )
	/*-{
		this.startAngle = startAngle;
	}-*/;

	public final native double getStartX()
	/*-{
		return startX;
	}-*/;

	public final native void setStartX( double startX )
	/*-{
		this.startX = startX;
	}-*/;

	public final native double getStartY()
	/*-{
		return startY;
	}-*/;

	public final native void setStartY( double startY )
	/*-{
		this.startY = startY;
	}-*/;

	public final native Boolean isStarted()
	/*-{
		return this.started;
	}-*/;

	public final native void setStarted( Boolean started )
	/*-{
		this.started = started;
	}-*/;

	public final native Boolean isSwitchable()
	/*-{
		return this.switchable;
	}-*/;

	public final native void setSwitchable( Boolean switchable )
	/*-{
		this.switchable = switchable;
	}-*/;
}