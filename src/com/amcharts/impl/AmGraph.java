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

	public native void setType(String type)
	/*-{
		this.@com.amcharts.impl.AmGraph::jso.type = type;
	}-*/;
}