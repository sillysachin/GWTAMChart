package com.amcharts.impl;

import com.amcharts.api.IsChartCursor;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class ChartCursor implements IsChartCursor, IJavaScriptWrapper {
	JavaScriptObject jso;

	public ChartCursor() {
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
		var chartCursor = new $wnd.AmCharts.ChartCursor();
		return chartCursor;
	}-*/;
}