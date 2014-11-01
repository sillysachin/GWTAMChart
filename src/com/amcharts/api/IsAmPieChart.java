package com.amcharts.api;

public interface IsAmPieChart extends IsAmSlicedChart
{
	String getInnerRadius();

	void setInnerRadius( String innerRadius );

	double getLabelRadius();

	void setLabelRadius( double labelRadius );

	String getLabelRadiusField();

	void setLabelRadiusField( String labelRadiusField );

	String getLabelText();

	void setLabelText( String labelText );

	double getMinRadius();

	void setMinRadius( double minRadius );

	double getPieAlpha();

	void setPieAlpha( double pieAlpha );

	String getPieX();

	void setPieX( String pieX );

	String getPieY();

	void setPieY( String pieY );

	String getPullOutRadius();

	void setPullOutRadius( String pullOutRadius );

	String getRadius();

	void setRadius( String radius );

	double getStartAngle();

	void setStartAngle( double startAngle );

	String getStartRadius();

	void setStartRadius( String startRadius );
}