package com.amcharts.jso;

import com.amcharts.api.IsAmPieChart;

public class AmPieChartJSO extends AmSlicedChartJSO implements IsAmPieChart
{
	protected AmPieChartJSO()
	{
	}

	@Override
	public final native double getAngle()
	/*-{
		return this.angle;
	}-*/;

	@Override
	public final native void setAngle( double angle )
	/*-{
		this.angle = angle;
	}-*/;

	@Override
	public final native String getBalloonText()
	/*-{
		return this.balloonText;
	}-*/;

	@Override
	public final native void setBalloonText( String balloonText )
	/*-{
		this.balloonText = balloonText;
	}-*/;

	@Override
	public final native double getDepth3D()
	/*-{
		return this.depth3D;
	}-*/;

	@Override
	public final native void setDepth3D( double depth3D )
	/*-{
		this.depth3D = depth3D;
	}-*/;

	@Override
	public final native String getInnerRadius()
	/*-{
		return this.innerRadius;
	}-*/;

	@Override
	public final native void setInnerRadius( String innerRadius )
	/*-{
		this.innerRadius = innerRadius;
	}-*/;

	@Override
	public final native double getLabelRadius()
	/*-{
		return this.labelRadius;
	}-*/;

	@Override
	public final native void setLabelRadius( double labelRadius )
	/*-{
		this.labelRadius = labelRadius;
	}-*/;

	@Override
	public final native String getLabelRadiusField()
	/*-{
		return this.labelRadiusField;
	}-*/;

	@Override
	public final native void setLabelRadiusField( String labelRadiusField )
	/*-{
		this.labelRadiusField = labelRadiusField;
	}-*/;

	@Override
	public final native String getLabelText()
	/*-{
		return this.labelText;
	}-*/;

	@Override
	public final native void setLabelText( String labelText )
	/*-{
		this.labelText = labelText;
	}-*/;

	@Override
	public final native double getMinRadius()
	/*-{
		return this.minRadius;
	}-*/;

	@Override
	public final native void setMinRadius( double minRadius )
	/*-{
		this.minRadius = minRadius;
	}-*/;

	@Override
	public final native double getPieAlpha()
	/*-{
		return this.pieAlpha;
	}-*/;

	@Override
	public final native void setPieAlpha( double pieAlpha )
	/*-{
		this.pieAlpha = pieAlpha;
	}-*/;

	@Override
	public final native String getPieX()
	/*-{
		return this.pieX;
	}-*/;

	@Override
	public final native void setPieX( String pieX )
	/*-{
		this.pieX = pieX;
	}-*/;

	@Override
	public final native String getPieY()
	/*-{
		return this.pieY;
	}-*/;

	@Override
	public final native void setPieY( String pieY )
	/*-{
		this.pieY = pieY;
	}-*/;

	@Override
	public final native String getPullOutRadius()
	/*-{
		return this.pullOutRadius;
	}-*/;

	@Override
	public final native void setPullOutRadius( String pullOutRadius )
	/*-{
		this.pullOutRadius = pullOutRadius;
	}-*/;

	@Override
	public final native String getRadius()
	/*-{
		return this.radius;
	}-*/;

	@Override
	public final native void setRadius( String radius )
	/*-{
		this.radius = radius;
	}-*/;

	@Override
	public final native double getStartAngle()
	/*-{
		return this.startAngle;
	}-*/;

	@Override
	public final native void setStartAngle( double startAngle )
	/*-{
		this.startAngle = startAngle;
	}-*/;

	@Override
	public final native String getStartRadius()
	/*-{
		return this.startRadius;
	}-*/;

	@Override
	public final native void setStartRadius( String startRadius )
	/*-{
		this.startRadius = startRadius;
	}-*/;
}