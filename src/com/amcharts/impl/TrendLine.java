package com.amcharts.impl;

import java.util.Date;

import com.amcharts.api.IsTrendLine;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class TrendLine implements IsTrendLine, IJavaScriptWrapper {
	JavaScriptObject jso;

	public TrendLine() {
		jso = createJso();
	}

	public JavaScriptObject getJso() {
		return jso;
	}

	public void setJso(JavaScriptObject jso) {
		this.jso = jso;
	}

	public native JavaScriptObject createJso()
	/*-{
		var trendLine = new $wnd.AmCharts.TrendLine();
		return trendLine;
	}-*/;

	public native Date getInitialDate() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.initialDate;
	}-*/;

	public native void setInitialDate(Date initialDate) /*-{
		this.@com.amcharts.impl.TrendLine::jso.initialDate = initialDate;
	}-*/;

	public native Date getFinalDate() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.finalDate;
	}-*/;

	public native void setFinalDate(Date finalDate) /*-{
		this.@com.amcharts.impl.TrendLine::jso.finalDate = finalDate;
	}-*/;

	public native int getInitialValue() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.initialValue;
	}-*/;

	public native void setInitialValue(int initialValue) /*-{
		this.@com.amcharts.impl.TrendLine::jso.initialValue = initialValue;
	}-*/;

	public native int getFinalValue() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.finalValue;
	}-*/;

	public native void setFinalValue(int finalValue) /*-{
		this.@com.amcharts.impl.TrendLine::jso.finalValue = finalValue;
	}-*/;

	public native String getLineColor() /*-{
		return this.@com.amcharts.impl.TrendLine::jso.lineColor;
	}-*/;

	public native void setLineColor(String lineColor) /*-{
		this.@com.amcharts.impl.TrendLine::jso.lineColor = lineColor;
	}-*/;
}