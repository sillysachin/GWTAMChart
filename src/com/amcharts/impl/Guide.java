package com.amcharts.impl;

import com.amcharts.api.IsGuide;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class Guide implements IsGuide, IJavaScriptWrapper {
	JavaScriptObject jso;
    
	public Guide() {
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
		var guide = new $wnd.AmCharts.Guide();
		return guide;
	}-*/;

	public native int getValue() /*-{
		return this.@com.amcharts.impl.Guide::jso.value;
	}-*/;

	public native void setValue(int value) /*-{
		this.@com.amcharts.impl.Guide::jso.value = value;
	}-*/;

	public native int getToValue() /*-{
		return this.@com.amcharts.impl.Guide::jso.toValue;
	}-*/;

	public native void setToValue(int toValue) /*-{
		this.@com.amcharts.impl.Guide::jso.toValue = toValue;
	}-*/;

	public native String getFillColor() /*-{
		return this.@com.amcharts.impl.Guide::jso.fillColor;
	}-*/;

	public native void setFillColor(String fillColor) /*-{
		this.@com.amcharts.impl.Guide::jso.fillColor = fillColor;
	}-*/;

	public native boolean isInside() /*-{
		return this.@com.amcharts.impl.Guide::jso.inside;
	}-*/;

	public native void setInside(boolean inside) /*-{
		this.@com.amcharts.impl.Guide::jso.inside = inside;
	}-*/;

	public native double getFillAlpha() /*-{
		return this.@com.amcharts.impl.Guide::jso.fillAlpha;
	}-*/;

	public native void setFillAlpha(double fillAlpha) /*-{
		this.@com.amcharts.impl.Guide::jso.fillAlpha = fillAlpha;
	}-*/;

	public native double getLineAlpha() /*-{
		return this.@com.amcharts.impl.Guide::jso.lineAlpha;
	}-*/;

	public native void setLineAlpha(double lineAlpha) /*-{
		this.@com.amcharts.impl.Guide::jso.lineAlpha = lineAlpha;
	}-*/;
}