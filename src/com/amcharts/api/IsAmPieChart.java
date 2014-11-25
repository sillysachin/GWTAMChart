package com.amcharts.api;

public interface IsAmPieChart extends IsAmSlicedChart
{
	String getInnerRadius();

	void setInnerRadius( String innerRadius );

	Double getLabelRadius();

	void setLabelRadius( Double labelRadius );

	String getLabelRadiusField();

	void setLabelRadiusField( String labelRadiusField );

	String getLabelText();

	void setLabelText( String labelText );

	Double getMinRadius();

	void setMinRadius( Double minRadius );

	Double getPieAlpha();

	void setPieAlpha( Double pieAlpha );

	String getPieX();

	void setPieX( String pieX );

	String getPieY();

	void setPieY( String pieY );

	String getPullOutRadius();

	void setPullOutRadius( String pullOutRadius );

	String getRadius();

	void setRadius( String radius );

	Double getStartAngle();

	void setStartAngle( Double startAngle );

	String getStartRadius();

	void setStartRadius( String startRadius );
}