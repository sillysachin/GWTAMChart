package com.amcharts.api;

public interface IsLegend
{

	public abstract String getMarkerType();

	public abstract void setMarkerType( String markerType );

	public abstract String getPosition();

	public abstract void setPosition( String position );

	public abstract int getMarginRight();

	public abstract void setMarginRight( int marginRight );

	public abstract boolean isAutoMargins();

	public abstract void setAutoMargins( boolean autoMargins );
}