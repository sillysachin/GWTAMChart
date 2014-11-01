package com.amcharts.api;

public interface IsAmFunnelChart
{
	String getBallonText();

	void setBallonText( String ballonText );

	String getBaseWidth();

	void setBaseWidth( String baseWidth );

	String getLabelPosition();

	void setLabelPosition( String labelPosition );

	String getNeckHeight();

	void setNeckHeight( String neckHeight );

	String getNeckWidth();

	void setNeckWidth( String neckWidth );

	String getPullDistance();

	void setPullDistance( String pullDistance );

	boolean isRotate();

	void setRotate( boolean rotate );

	double getStartX();

	void setStartX( double startX );

	double getStartY();

	void setStartY( double startY );

	String getValueRepresents();

	void setValueRepresents( String valueRepresents );

}