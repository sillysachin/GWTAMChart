package com.amcharts.impl;

import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class AmGraph implements IJavaScriptWrapper {

	JavaScriptObject jso;

	public AmGraph() {
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
		var graph = new $wnd.AmCharts.AmGraph();
		return graph;
	}-*/;

	public native void setValueField(String valueField)
	/*-{
		this.@com.amcharts.impl.AmGraph::jso.valueField = valueField;
	}-*/;

	public native String getValueField()
	/*-{
		return this.@com.amcharts.impl.AmGraph::jso.valueField;
	}-*/;

	public native void setType(String type)
	/*-{
		this.@com.amcharts.impl.AmGraph::jso.type = type;
	}-*/;

	public native String getType()
	/*-{
		return this.@com.amcharts.impl.AmGraph::jso.type;
	}-*/;

	public native int getDashLength()
	/*-{
		return this.@com.amcharts.impl.AmGraph::jso.dashLength;
	}-*/;

	public native void setDashLength(int dashLength)
	/*-{
		this.@com.amcharts.impl.AmGraph::jso.dashLength = dashLength;
	}-*/;

	public native String getLineColor()
	/*-{
		return this.@com.amcharts.impl.AmGraph::jso.lineColor;
	}-*/;

	public native void setLineColor(String lineColor)
	/*-{
		this.@com.amcharts.impl.AmGraph::jso.lineColor = lineColor;
	}-*/;

	public native String getBullet()
	/*-{
		return this.@com.amcharts.impl.AmGraph::jso.bullet;
	}-*/;

	public native void setBullet(String bullet)
	/*-{
		this.@com.amcharts.impl.AmGraph::jso.bullet = bullet;
	}-*/;

	public native String getBalloonText()/*-{
		return this.@com.amcharts.impl.AmGraph::jso.balloonText;
	}-*/;

	public native void setBalloonText(String balloonText)/*-{
		this.@com.amcharts.impl.AmGraph::jso.balloonText = balloonText;
	}-*/;
}