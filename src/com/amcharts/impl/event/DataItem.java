package com.amcharts.impl.event;

import com.google.gwt.core.client.JavaScriptObject;

public class DataItem extends JavaScriptObject
{
	protected DataItem()
	{
	}

	public final native double getBalloonX()
	/*-{
		return balloonX;
	}-*/;

	public final native void setBalloonX( double balloonX )
	/*-{
		this.balloonX = balloonX;
	}-*/;

	public final native double getBalloonY()
	/*-{
		return balloonY;
	}-*/;

	public final native void setBalloonY( double balloonY )
	/*-{
		this.balloonY = balloonY;
	}-*/;

	public final native String getClassName()
	/*-{
		return className;
	}-*/;

	public final native void setClassName( String className )
	/*-{
		this.className = className;
	}-*/;

	public final native int getIndex()
	/*-{
		return index;
	}-*/;

	public final native void setIndex( int index )
	/*-{
		this.index = index;
	}-*/;

	public final native double getIx()
	/*-{
		return ix;
	}-*/;

	public final native void setIx( double ix )
	/*-{
		this.ix = ix;
	}-*/;

	public final native double getIy()
	/*-{
		return iy;
	}-*/;

	public final native void setIy( double iy )
	/*-{
		this.iy = iy;
	}-*/;

	public final native String getLabelColor()
	/*-{
		return labelColor;
	}-*/;

	public final native void setLabelColor( String labelColor )
	/*-{
		this.labelColor = labelColor;
	}-*/;

	public final native int getLabelQuarter()
	/*-{
		return labelQuarter;
	}-*/;

	public final native void setLabelQuarter( int labelQuarter )
	/*-{
		this.labelQuarter = labelQuarter;
	}-*/;

	public final native double getLabelRadius()
	/*-{
		return labelRadius;
	}-*/;

	public final native void setLabelRadius( double labelRadius )
	/*-{
		this.labelRadius = labelRadius;
	}-*/;

	public final native String getPattern()
	/*-{
		return pattern;
	}-*/;

	public final native void setPattern( String pattern )
	/*-{
		this.pattern = pattern;
	}-*/;

	public final native double getPullX()
	/*-{
		return pullX;
	}-*/;

	public final native void setPullX( double pullX )
	/*-{
		this.pullX = pullX;
	}-*/;

	public final native double getPullY()
	/*-{
		return pullY;
	}-*/;

	public final native void setPullY( double pullY )
	/*-{
		this.pullY = pullY;
	}-*/;

	public final native double getStartAngle()
	/*-{
		return startAngle;
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

	public final native boolean isStarted()
	/*-{
		return started;
	}-*/;

	public final native void setStarted( boolean started )
	/*-{
		this.started = started;
	}-*/;

	public final native boolean isSwitchable()
	/*-{
		return switchable;
	}-*/;

	public final native void setSwitchable( boolean switchable )
	/*-{
		this.switchable = switchable;
	}-*/;
}