package com.amcharts.impl;

import com.amcharts.api.AxisPosition;
import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsTitle;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class CategoryAxis extends AxisBase implements IsCategoryAxis,
		IJavaScriptWrapper {
	JavaScriptObject jso;

	public CategoryAxis() {
	}

	public JavaScriptObject getJso() {
		return jso;
	}

	public void setJso(JavaScriptObject jso) {
		this.jso = jso;
	}

	public native JavaScriptObject createJso()
	/*-{
		var categoryAxis = new $wnd.AmCharts.CategoryAxis();
		return categoryAxis;
	}-*/;

	@Override
	public native IsTitle getTitle() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.title;
	}-*/;

	@Override
	public native void setTitle(IsTitle title) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.title = title;
	}-*/;

	@Override
	public native AxisPosition getPosition() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.position;
	}-*/;

	@Override
	public native void setPosition(AxisPosition position) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.position = position;
	}-*/;

	public native boolean isParseDates() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.parseDates;
	}-*/;

	public native void setParseDates(boolean parseDates) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.parseDates = parseDates;
	}-*/;

	public native String getMinPeriod() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.minPeriod;
	}-*/;

	public native void setMinPeriod(String minPeriod) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.minPeriod = minPeriod;
	}-*/;

	public native double getGridAlpha() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.gridAlpha;
	}-*/;

	public native void setGridAlpha(double gridAlpha) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.gridAlpha = gridAlpha;
	}-*/;

	public native double getMinorGridAlpha() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.minorGridAlpha;
	}-*/;

	public native void setMinorGridAlpha(double minorGridAlpha) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.minorGridAlpha = minorGridAlpha;
	}-*/;

	public native double getAxisAlpha() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.axisAlpha;
	}-*/;

	public native void setAxisAlpha(double axisAlpha) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.axisAlpha = axisAlpha;
	}-*/;

	public native boolean isMinorGridEnabled() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.minorGridEnabled;
	}-*/;

	public native void setMinorGridEnabled(boolean minorGridEnabled) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.minorGridEnabled = minorGridEnabled;
	}-*/;

	public native boolean isInside() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.inside;
	}-*/;

	public native void setInside(boolean inside) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.inside = inside;
	}-*/;

	public native boolean isAutoGridCount() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.autoGridCount;
	}-*/;

	public native void setAutoGridCount(boolean autoGridCount) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.autoGridCount = autoGridCount;
	}-*/;
}