package com.amcharts.impl;

import com.amcharts.api.IsChartScrollbar;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class ChartScrollbar implements IsChartScrollbar, IJavaScriptWrapper
{
	JavaScriptObject jso;

	public ChartScrollbar()
	{
		jso = createJso();
	}

	public JavaScriptObject getJso()
	{
		return jso;
	}

	public void setJso( JavaScriptObject jso )
	{
		this.jso = jso;
	}

	public native JavaScriptObject createJso()
	/*-{
		var chartScrollbar = new $wnd.AmCharts.ChartScrollbar();
		return chartScrollbar;
	}-*/;
}