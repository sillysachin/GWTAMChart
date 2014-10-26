package com.amcharts.impl;

import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;

public class AmChart extends Composite implements IJavaScriptWrapper {
	protected JavaScriptObject jso;
	String id;

	private LayoutPanel divWrapper = new LayoutPanel();

	protected AmChart() {
		init();
	}

	private void init() {
		String id = Document.get().createUniqueId();
		setId(id);
		initWidget(divWrapper);
	}

	private void init(JavaScriptObject configJSO) {
		init();
		jso = makeChart(getId(), configJSO);
	}

	public void setId(String id) {
		this.id = id;
		divWrapper.getElement().setId(id);
		// TODO: need to verify how this impacts the chart which uses the id for finding the parent container.
	}

	public String getId() {
		return id;
	}

	public native JavaScriptObject makeChart(String containerId,
			JavaScriptObject configJSO)
	/*-{
		this.@com.amcharts.impl.AmChart::setId(Ljava/lang/String;)(containerId);
		return $wnd.AmCharts.makeChart(containerId, configJSO);
	}-*/;

	public native JavaScriptObject makeChart(JavaScriptObject configJSO)
	/*-{
		var containerId = this.@com.amcharts.impl.AmChart::getId();
		return $wnd.AmCharts.makeChart(containerId, configJSO);
	}-*/;

	@Override
	public JavaScriptObject getJso() {
		return jso;
	}

	@Override
	public void setJso(JavaScriptObject jso) {
		this.jso = jso;
	}

	public native void addGraph(AmGraph amGraph)
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var graph = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(amGraph)
		chart.addGraph(graph);
	}-*/;

	public native void addValueAxis(ValueAxis valueAxis)
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var valueAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(valueAxis)
		chart.addValueAxis(valueAxis);
	}-*/;

	public native void addChartCursor(ChartCursor chartCursor)
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var chartCursor = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(chartCursor)
		chart.addChartCursor(chartCursor);
	}-*/;

	public native void addChartScrollbar(ChartScrollbar chartScrollbar)
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var chartScrollbar = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(chartScrollbar)
		chart.addChartScrollbar(chartScrollbar);
	}-*/;

	public native void addTrendLine(TrendLine trendLine)
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var trendLine = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(trendLine)
		chart.addTrendLine(trendLine);
	}-*/;

	@Override
	protected void onLoad() {
		String id = getId();
		write(id);
	}

	public native void write(String containerId)
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.write(containerId);
	}-*/;

	// TODO:Need to provide a better alternative than JavaScriptObject dataProvider.
	public native void setDataProvider(JavaScriptObject dataProvider)
	/*-{
		this.@com.amcharts.impl.AmChart::jso.dataProvider = dataProvider;
	}-*/;

	public native void setCategoryField(String categoryField)
	/*-{
		this.@com.amcharts.impl.AmChart::jso.categoryField = categoryField;
	}-*/;

	public native void setType(String type)
	/*-{
		this.@com.amcharts.impl.AmChart::jso.type = type;
	}-*/;

	public native String getType()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.type;
	}-*/;

	public native void setTitleField(String titleField)
	/*-{
		this.@com.amcharts.impl.AmChart::jso.titleField = titleField;
	}-*/;

	public native String getTitleField()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.titleField;
	}-*/;

	public native void setValueField(String valueField)
	/*-{
		this.@com.amcharts.impl.AmChart::jso.valueField = valueField;
	}-*/;

	public native String getValueField()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.valueField;
	}-*/;

	public native String getDataDateFormat()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.dataDateFormat;
	}-*/;

	public native void setDataDateFormat(String dataDateFormat)
	/*-{
		this.@com.amcharts.impl.AmChart::jso.dataDateFormat = dataDateFormat;
	}-*/;

	public native String getPathToImages()
	/*-{
		return this.@com.amcharts.impl.AmChart::jso.pathToImages;
	}-*/;

	public native void setPathToImages(String pathToImages)
	/*-{
		this.@com.amcharts.impl.AmChart::jso.pathToImages = pathToImages;
	}-*/;

	public native JavaScriptObject getCategoryAxisJSO()
	/*-{
		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this).categoryAxis;
		return categoryAxis;
	}-*/;
}