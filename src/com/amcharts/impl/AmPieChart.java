package com.amcharts.impl;

import com.amcharts.api.IsAmPieChart;
import com.google.gwt.core.client.JavaScriptObject;

public class AmPieChart extends AmSlicedChart implements IsAmPieChart
{

	public AmPieChart()
	{
		jso = createJso();
		setType( "pie" );
	}

	public native JavaScriptObject createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmPieChart();
		return chart;
	}-*/;

	@Override
	public native String getBalloonText() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().balloonText;
	}-*/;

	@Override
	public native void setBalloonText( String balloonText ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().balloonText = balloonText;
	}-*/;

	public native void setDepth3D( Float depth3D )
	/*-{
		this.@com.amcharts.impl.AmPieChart::getJso().depth3D = depth3D;
	}-*/;

	public native Float getDepth3D()
	/*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().depth3D;
	}-*/;

	@Override
	public native String getInnerRadius() /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().innerRadius;
	}-*/;

	@Override
	public native void setInnerRadius( String innerRadius ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().innerRadius = innerRadius;
	}-*/;

	@Override
	public native Float getLabelRadius() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().depth3D;
	}-*/;

	@Override
	public native void setLabelRadius( Float labelRadius ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().depth3D = depth3D;
	}-*/;

	@Override
	public native String getLabelRadiusField() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().labelRadiusField;
	}-*/;

	@Override
	public native void setLabelRadiusField( String labelRadiusField ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().labelRadiusField = labelRadiusField;
	}-*/;

	@Override
	public native String getLabelText() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().labelText;

	}-*/;

	@Override
	public native void setLabelText( String labelText ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().labelText = labelText;
	}-*/;

	@Override
	public native Float getMinRadius() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().minRadius;
	}-*/;

	@Override
	public native void setMinRadius( Float minRadius ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().minRadius = minRadius;
	}-*/;

	@Override
	public native Float getPieAlpha() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().pieAlpha;
	}-*/;

	@Override
	public native void setPieAlpha( Float pieAlpha ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().pieAlpha = pieAlpha;
	}-*/;

	@Override
	public native String getPieX() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().pieX

	}-*/;

	@Override
	public native void setPieX( String pieX ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().pieX = pieX;
	}-*/;

	@Override
	public native String getPieY() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().pieY;

	}-*/;

	@Override
	public native void setPieY( String pieY ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().pieY = pieY;
	}-*/;

	@Override
	public native String getPullOutRadius() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().pullOutRadius;
	}-*/;

	@Override
	public native void setPullOutRadius( String pullOutRadius ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().pullOutRadius = pullOutRadius;
	}-*/;

	@Override
	public native String getRadius() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().radius;
	}-*/;

	@Override
	public native void setRadius( String radius ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().radius = radius;
	}-*/;

	@Override
	public native Float getStartAngle() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().startAngle;
	}-*/;

	@Override
	public native void setStartAngle( Float startAngle )
	/*-{
		this.@com.amcharts.impl.AmPieChart::getJso().startAngle = startAngle;
	}-*/;

	@Override
	public native String getStartRadius() /*-{
		return this.@com.amcharts.impl.AmPieChart::getJso().startRadius;
	}-*/;

	@Override
	public native void setStartRadius( String startRadius ) /*-{
		this.@com.amcharts.impl.AmPieChart::getJso().startRadius = startRadius;
	}-*/;
}