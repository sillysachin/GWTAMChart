package com.amcharts.impl;

import com.amcharts.jso.AmSerialChartJSO;
import com.amcharts.jso.CategoryAxisJSO;

public class AmSerialChart extends AmRectangularChart
{
	CategoryAxis categoryAxis;

	public AmSerialChart()
	{
		jso = createJso();
		categoryAxis = new CategoryAxis();
		CategoryAxisJSO categoryAxisJSO = ( CategoryAxisJSO ) getCategoryAxisJSO();
		categoryAxis.setJso( categoryAxisJSO );
		setType( "serial" );
	}

	@Override
	public AmSerialChartJSO getJso()
	{
		return ( AmSerialChartJSO ) super.getJso();
	}

	public native AmSerialChartJSO createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmSerialChart();
		return chart;
	}-*/;

	public void setAngle( double angle )
	{
		getJso().setAngle( angle );
	}

	public double getAngle()
	{
		return getJso().getAngle();
	}

	public native String getBalloonDateFormat() /*-{
		return this.@com.amcharts.impl.AmSerialChart::getJso()
				.getBalloonDateFormat();
	}-*/;

	public native void setBalloonDateFormat( String balloonDateFormat ) /*-{
		this.@com.amcharts.impl.AmSerialChart::getJso().setBalloonDateFormat(
				balloonDateFormat);
	}-*/;

	public native void setDepth3D( double depth3D )
	/*-{
		this.@com.amcharts.impl.AmSerialChart::getJso().setDepth3D(depth3D);
	}-*/;

	public native double getDepth3D()
	/*-{
		return this.@com.amcharts.impl.AmSerialChart::getJso().getDepth3D();
	}-*/;

	public CategoryAxis getCategoryAxis()
	{
		return categoryAxis;
	};

	//	public native CategoryAxis getCategoryAxis()
	//	/*-{
	//		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.categoryAxis)
	//		return categoryAxis;
	//	}-*/;

	public native void setCategoryAxis( CategoryAxis categoryAxis )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(categoryAxis)
		chart.categoryAxis = categoryAxis;
	}-*/;
}