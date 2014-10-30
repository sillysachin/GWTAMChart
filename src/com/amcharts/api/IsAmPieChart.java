package com.amcharts.api;

public interface IsAmPieChart extends IsAmSlicedChart
{
	public abstract Double getAngle();

	public abstract void setAngle( Double angle );

	public abstract String getBalloonText();

	public abstract void setBalloonText( String balloonText );

	public abstract Double getDepth3D();

	public abstract void setDepth3D( Double depth3d );

	public abstract String getInnerRadius();

	public abstract void setInnerRadius( String innerRadius );

	public abstract Float getLabelRadius();

	public abstract void setLabelRadius( Float labelRadius );

	public abstract String getLabelRadiusField();

	public abstract void setLabelRadiusField( String labelRadiusField );

	public abstract String getLabelText();

	public abstract void setLabelText( String labelText );

	public abstract Float getMinRadius();

	public abstract void setMinRadius( Float minRadius );

	public abstract Float getPieAlpha();

	public abstract void setPieAlpha( Float pieAlpha );

	public abstract String getPieX();

	public abstract void setPieX( String pieX );

	public abstract String getPieY();

	public abstract void setPieY( String pieY );

	public abstract String getPullOutRadius();

	public abstract void setPullOutRadius( String pullOutRadius );

	public abstract String getRadius();

	public abstract void setRadius( String radius );

	public abstract Float getStartAngle();

	public abstract void setStartAngle( Float startAngle );

	public abstract String getStartRadius();

	public abstract void setStartRadius( String startRadius );
}