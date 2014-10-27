package com.amcharts.impl;

import java.util.Date;

import com.google.gwt.core.client.JavaScriptObject;

public class AmSerialChart extends AmRectangularChart {
	CategoryAxis categoryAxis;	
	
	public AmSerialChart() {
		jso = createJso();
		categoryAxis = new CategoryAxis();
		JavaScriptObject categoryAxisJSO = getCategoryAxisJSO();
		categoryAxis.setJso(categoryAxisJSO);
	}

	public native JavaScriptObject createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmSerialChart();
		return chart;
	}-*/;

	public CategoryAxis getCategoryAxis() {
		return categoryAxis;
	}

	public native String getBalloonDateFormat() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.balloonDateFormat;
	}-*/;

	public native void setBalloonDateFormat(String balloonDateFormat) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.balloonDateFormat = balloonDateFormat;
	}-*/;

	public native String getCategoryField() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.categoryField;
	}-*/;

	public native void setCategoryField(String categoryField) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.categoryField = categoryField;
	}-*/;

	public native Number getColumnSpacing() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.columnSpacing;
	}-*/;

	public native void setColumnSpacing(Number columnSpacing) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.columnSpacing = columnSpacing;
	}-*/;

	public native Number getColumnSpacing3D() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.columnSpacing3D;
	}-*/;

	public native void setColumnSpacing3D(Number columnSpacing3D) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.columnSpacing3D = columnSpacing3D;
	}-*/;

	public native Number getColumnWidth() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.columnWidth;
	}-*/;

	public native void setColumnWidth(Number columnWidth) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.columnWidth = columnWidth;
	}-*/;

	public native String getDataDateFormat() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.dataDateFormat;
	}-*/;

	public native void setDataDateFormat(String dataDateFormat) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.dataDateFormat = dataDateFormat;
	}-*/;

	public native Date getEndDate() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.endDate;
	}-*/;

	public native void setEndDate(Date endDate) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.endDate = endDate;
	}-*/;

	public native Number getEndIndex() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.endIndex;
	}-*/;

	public native void setEndIndex(Number endIndex) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.endIndex = endIndex;
	}-*/;

	public native Number getMaxSelectedSeries() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.maxSelectedSeries;
	}-*/;

	public native void setMaxSelectedSeries(Number maxSelectedSeries) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.maxSelectedSeries = maxSelectedSeries;
	}-*/;

	public native Number getMaxSelectedTime() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.maxSelectedTime;
	}-*/;

	public native void setMaxSelectedTime(Number maxSelectedTime) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.maxSelectedTime = maxSelectedTime;
	}-*/;

	public native Number getMinSelectedTime() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.minSelectedTime;
	}-*/;

	public native void setMinSelectedTime(Number minSelectedTime) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.minSelectedTime = minSelectedTime;
	}-*/;

	public native Boolean getMouseWheelScrollEnabled() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.mouseWheelScrollEnabled;
	}-*/;

	public native void setMouseWheelScrollEnabled(Boolean mouseWheelScrollEnabled) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.mouseWheelScrollEnabled = mouseWheelScrollEnabled;
	}-*/;

	public native Boolean getMouseWheelZoomEnabled() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.mouseWheelZoomEnabled;
	}-*/;

	public native void setMouseWheelZoomEnabled(Boolean mouseWheelZoomEnabled) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.mouseWheelZoomEnabled = mouseWheelZoomEnabled;
	}-*/;

	public native Boolean getRotate() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.rotate;
	}-*/;

	public native void setRotate(Boolean rotate) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.rotate = rotate;
	}-*/;

	public native Date getStartDate() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.startDate;
	}-*/;

	public native void setStartDate(Date startDate) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.startDate = startDate;
	}-*/;

	public native Number getStartIndex() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.startIndex;
	}-*/;

	public native void setStartIndex(Number startIndex) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.startIndex = startIndex;
	}-*/;

	public native Boolean getZoomOutOnDataUpdate() /*-{
		return this.@com.amcharts.impl.CategoryAxis::jso.zoomOutOnDataUpdate;
	}-*/;

	public native void setZoomOutOnDataUpdate(Boolean zoomOutOnDataUpdate) /*-{
		this.@com.amcharts.impl.CategoryAxis::jso.zoomOutOnDataUpdate = zoomOutOnDataUpdate;
	}-*/;
}