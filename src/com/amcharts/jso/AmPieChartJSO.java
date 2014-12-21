package com.amcharts.jso;

import com.amcharts.api.IsAmPieChart;

public class AmPieChartJSO extends AmSlicedChartJSO implements IsAmPieChart
{
	protected AmPieChartJSO()
	{
	}

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
	public final native Double getLabelRadius()
	/*-{
		return this.labelRadius;
	}-*/;

	@Override
	public final native void setLabelRadius( Double labelRadius )
	/*-{
		this.labelRadius = labelRadius.@java.lang.Double::doubleValue()();
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
	public final native Double getMinRadius()
	/*-{
		return this.minRadius;
	}-*/;

	@Override
	public final native void setMinRadius( Double minRadius )
	/*-{
		this.minRadius = minRadius.@java.lang.Double::doubleValue()();
	}-*/;

	@Override
	public final native Double getPieAlpha()
	/*-{
		return this.pieAlpha;
	}-*/;

	@Override
	public final native void setPieAlpha( Double pieAlpha )
	/*-{
		this.pieAlpha = pieAlpha.@java.lang.Double::doubleValue()();
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
	public final native Double getStartAngle()
	/*-{
		return this.startAngle;
	}-*/;

	@Override
	public final native void setStartAngle( Double startAngle )
	/*-{
		this.startAngle = startAngle.@java.lang.Double::doubleValue()();
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