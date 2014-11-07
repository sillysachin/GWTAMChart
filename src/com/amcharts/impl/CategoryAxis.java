package com.amcharts.impl;

import com.amcharts.api.IsCategoryAxis;
import com.amcharts.jso.CategoryAxisJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public class CategoryAxis extends AxisBase implements IsCategoryAxis, IJavaScriptWrapper<CategoryAxisJSO>
{
	protected CategoryAxisJSO jso;

	public CategoryAxis()
	{
	}

	public CategoryAxisJSO getJso()
	{
		return jso;
	}

	public void setJso( CategoryAxisJSO jso )
	{
		this.jso = jso;
	}

	public native CategoryAxisJSO createJso()
	/*-{
		var categoryAxis = new $wnd.AmCharts.CategoryAxis();
		return categoryAxis;
	}-*/;

	@Override
	public native String getTitle() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.title;
	}-*/;

	@Override
	public native void setTitle( String title ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.title = title;
	}-*/;

	@Override
	public native String getPosition() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.position;
	}-*/;

	@Override
	public native void setPosition( String position ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.position = position;
	}-*/;

	public native boolean isParseDates() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.parseDates;
	}-*/;

	public native void setParseDates( boolean parseDates ) /*-{
		var categoryAxis = this.@com.amcharts.impl.CategoryAxis::jso;
		categoryAxis.parseDates = parseDates;
	}-*/;

	public native String getMinPeriod() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.minPeriod;
	}-*/;

	public native void setMinPeriod( String minPeriod ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.minPeriod = minPeriod;
	}-*/;

	public native double getGridAlpha() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.gridAlpha;
	}-*/;

	public native void setGridAlpha( double gridAlpha ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.gridAlpha = gridAlpha;
	}-*/;

	public native double getMinorGridAlpha() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.minorGridAlpha;
	}-*/;

	public native void setMinorGridAlpha( double minorGridAlpha ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.minorGridAlpha = minorGridAlpha;
	}-*/;

	public native double getAxisAlpha() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.axisAlpha;
	}-*/;

	public native void setAxisAlpha( double axisAlpha ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.axisAlpha = axisAlpha;
	}-*/;

	public native boolean isMinorGridEnabled() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.minorGridEnabled;
	}-*/;

	public native void setMinorGridEnabled( boolean minorGridEnabled ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.minorGridEnabled = minorGridEnabled;
	}-*/;

	public native boolean isInside() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.inside;
	}-*/;

	public native void setInside( boolean inside ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.inside = inside;
	}-*/;

	public native boolean isAutoGridCount() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.autoGridCount;
	}-*/;

	public native void setAutoGridCount( boolean autoGridCount ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.autoGridCount = autoGridCount;
	}-*/;

	public native int getGridCount() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.gridCount;
	}-*/;

	public native void setGridCount( int gridCount ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.gridCount = gridCount;
	}-*/;

	public String getGridPosition()
	{
		return getJso().getGridPosition();
	}

	public void setGridPosition( String gridPosition )
	{
		getJso().setGridPosition( gridPosition );
	};

	public native float getLabelRotation() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.labelRotation;
	}-*/;

	public native void setLabelRotation( double labelRotation ) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.labelRotation = labelRotation;
	}-*/;
}