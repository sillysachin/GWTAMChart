package com.amcharts.api;

public interface IsAmFunnelChart extends IsAmSlicedChart
{
	String getBaseWidth();

	void setBaseWidth( String baseWidth );

	void setFunnelAlpha( double funnelAlpha );

	double getFunnelAlpha();

	String getLabelPosition();

	void setLabelPosition( String labelPosition );

	String getNeckHeight();

	void setNeckHeight( String neckHeight );

	String getNeckWidth();

	void setNeckWidth( String neckWidth );

	String getPullDistance();

	void setPullDistance( String pullDistance );

	Boolean isRotate();

	void setRotate( Boolean rotate );

	double getStartX();

	void setStartX( double startX );

	double getStartY();

	void setStartY( double startY );

	String getValueRepresents();

	void setValueRepresents( String valueRepresents );

}