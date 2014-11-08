package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsFunction;
import com.google.gwt.core.client.JavaScriptObject;

public final class CategoryAxisJSO extends AxisBaseJSO implements IsCategoryAxis
{
	protected CategoryAxisJSO()
	{
	}

	/**
	 * "Angle of label rotation, if the number of series exceeds autoRotateCount and parseDates is set to false."
	 */
	public final native double getAutoRotateAngle() /*-{
		return autoRotateAngle;
	}-*/;

	/**
	 * "Angle of label rotation, if the number of series exceeds autoRotateCount and parseDates is set to false."
	 */
	public final native void setAutoRotateAngle( double autoRotateAngle ) /*-{
		this.autoRotateAngle = autoRotateAngle;
	}-*/;

	/**
	 * "If the number of category axis items will exceed the autoRotateCount, the labels will be rotated by autoRotateAngle degree. Works only if parseDates is false."
	 */
	public final native double getAutoRotateCount() /*-{
		return autoRotateCount;
	}-*/;

	/**
	 * "If the number of category axis items will exceed the autoRotateCount, the labels will be rotated by autoRotateAngle degree. Works only if parseDates is false."
	 */
	public final native void setAutoRotateCount( double autoRotateCount ) /*-{
		this.autoRotateCount = autoRotateCount;
	}-*/;

	/**
	 * Specifies if axis labels (only when it is horizontal) should be wrapped if they don't fit in the allocated space. Wrapping won't work for rotated axis labels.
	 */
	public final native boolean isAutoWrap() /*-{
		return autoWrap;
	}-*/;

	/**
	 * Specifies if axis labels (only when it is horizontal) should be wrapped if they don't fit in the allocated space. Wrapping won't work for rotated axis labels.
	 */
	public final native void setAutoWrap( boolean autoWrap ) /*-{
		this.autoWrap = autoWrap;
	}-*/;

	/**
	 * "When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods, like month, in bold. Set this to false to disable the functionality."
	 */
	public final native boolean isBoldPeriodBeginning() /*-{
		return boldPeriodBeginning;
	}-*/;

	/**
	 * "When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods, like month, in bold. Set this to false to disable the functionality."
	 */
	public final native void setBoldPeriodBeginning( boolean boldPeriodBeginning ) /*-{
		this.boldPeriodBeginning = boldPeriodBeginning;
	}-*/;

	/**
	 * "specifies a method that returns the value that should be used as categoryValue for current item. If this property is set, the return value of the custom data function takes precedence over categoryField. When a chart calls this method, it passes category value, data item from chart's data provider and reference to categoryAxis: categoryFunction(category, dataItem, categoryAxis); This method can be used both when category axis parses dates and when it doesn't. If axis parses dates, your categoryFunction should return Date object. For example, if you have date strings in your data, you can use this method to convert these strings into Date objects."""
	 */
	public final native IsFunction getCategoryFunction() /*-{
		return categoryFunction;
	}-*/;

	/**
	 * "specifies a method that returns the value that should be used as categoryValue for current item. If this property is set, the return value of the custom data function takes precedence over categoryField. When a chart calls this method, it passes category value, data item from chart's data provider and reference to categoryAxis: categoryFunction(category, dataItem, categoryAxis); This method can be used both when category axis parses dates and when it doesn't. If axis parses dates, your categoryFunction should return Date object. For example, if you have date strings in your data, you can use this method to convert these strings into Date objects."""
	 */
	public final native void setCategoryFunction( IsFunction categoryFunction ) /*-{
		this.categoryFunction = categoryFunction;
	}-*/;

	/**
	 * "This setting works only when parseDates is set to true and equalSpacing is set to false. In case you set it to false, labels will never be centered between grid lines."
	 */
	public final native boolean isCenterLabelOnFullPeriod() /*-{
		return centerLabelOnFullPeriod;
	}-*/;

	/**
	 * "This setting works only when parseDates is set to true and equalSpacing is set to false. In case you set it to false, labels will never be centered between grid lines."
	 */
	public final native void setCenterLabelOnFullPeriod( boolean centerLabelOnFullPeriod ) /*-{
		this.centerLabelOnFullPeriod = centerLabelOnFullPeriod;
	}-*/;

	/**
	 * "Date formats of different periods. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years. Check this page for date formatting strings."
	 */
	public final native List<JavaScriptObject> getDateFormats() /*-{
		return dateFormats;
	}-*/;

	/**
	 * "Date formats of different periods. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years. Check this page for date formatting strings."
	 */
	public final native void setDateFormats( List<JavaScriptObject> dateFormats ) /*-{
		this.dateFormats = dateFormats;
	}-*/;

	/**
	 * "In case your category axis values are Date objects and parseDates is set to true, the chart will parse dates and will place your data points at irregular intervals. However if you want dates to be parsed (displayed on the axis, baloons, etc), but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true."
	 */
	public final native boolean isEqualSpacing() /*-{
		return equalSpacing;
	}-*/;

	/**
	 * "In case your category axis values are Date objects and parseDates is set to true, the chart will parse dates and will place your data points at irregular intervals. However if you want dates to be parsed (displayed on the axis, baloons, etc), but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true."
	 */
	public final native void setEqualSpacing( boolean equalSpacing ) /*-{
		this.equalSpacing = equalSpacing;
	}-*/;

	/**
	 * "Sets first day of the week. 0 is Sunday, 1 is Monday, etc."
	 */
	public final native double getFirstDayOfWeek() /*-{
		return firstDayOfWeek;
	}-*/;

	/**
	 * "Sets first day of the week. 0 is Sunday, 1 is Monday, etc."
	 */
	public final native void setFirstDayOfWeek( double firstDayOfWeek ) /*-{
		this.firstDayOfWeek = firstDayOfWeek;
	}-*/;

	/**
	 * "Field in data provider which specifies if the category value should always be shown. For example: categoryAxis.forceShowField = 'forceShow'; And in data: {category:'one', forceShow:true, value:100} Note, this works only when parseDates is set to false."
	 */
	public final native String getForceShowField() /*-{
		return forceShowField;
	}-*/;

	/**
	 * "Field in data provider which specifies if the category value should always be shown. For example: categoryAxis.forceShowField = 'forceShow'; And in data: {category:'one', forceShow:true, value:100} Note, this works only when parseDates is set to false."
	 */
	public final native void setForceShowField( String forceShowField ) /*-{
		this.forceShowField = forceShowField;
	}-*/;

	/**
	 * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell. Possible values are: 'start' and 'middle' This setting doesn't work if parseDates is set to true.
	 */
	public final native String getGridPosition() /*-{
		return gridPosition;
	}-*/;

	/**
	 * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell. Possible values are: 'start' and 'middle' This setting doesn't work if parseDates is set to true.
	 */
	public final native void setGridPosition( String gridPosition ) /*-{
		this.gridPosition = gridPosition;
	}-*/;

	/**
	 * You can use it to set color of a axis label. Works only with non-date-based data.
	 */
	public final native String getLabelColorField() /*-{
		return labelColorField;
	}-*/;

	/**
	 * You can use it to set color of a axis label. Works only with non-date-based data.
	 */
	public final native void setLabelColorField( String labelColorField ) /*-{
		this.labelColorField = labelColorField;
	}-*/;

	/**
	 * "You can use this function to format Category axis labels. If this function is set, then it is called with the following parameters passed: if dates are not parsed: labelFunction(valueText, serialDataItem, categoryAxis) if dates are parsed: labelFunction(valueText, date, categoryAxis) Your function should return string which will be displayed on the axis."
	 */
	public final native IsFunction getLabelFunction() /*-{
		return labelFunction;
	}-*/;

	/**
	 * "You can use this function to format Category axis labels. If this function is set, then it is called with the following parameters passed: if dates are not parsed: labelFunction(valueText, serialDataItem, categoryAxis) if dates are parsed: labelFunction(valueText, date, categoryAxis) Your function should return string which will be displayed on the axis."
	 */
	public final native void setLabelFunction( IsFunction labelFunction ) /*-{
		this.labelFunction = labelFunction;
	}-*/;

	/**
	 * "If you set it to false, the start of longer periods won't use a different date format and won't be bold."
	 */
	public final native boolean isMarkPeriodChange() /*-{
		return markPeriodChange;
	}-*/;

	/**
	 * "If you set it to false, the start of longer periods won't use a different date format and won't be bold."
	 */
	public final native void setMarkPeriodChange( boolean markPeriodChange ) /*-{
		this.markPeriodChange = markPeriodChange;
	}-*/;

	/**
	 * "Specifies the shortest period of your data. This should be set only if parseDates is set to 'true'. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also possible to supply a number for increments, i.e. '15mm' which will instruct the chart that your data is supplied in 15 minute increments."
	 */
	public final native String getMinPeriod() /*-{
		return minPeriod;
	}-*/;

	/**
	 * "Specifies the shortest period of your data. This should be set only if parseDates is set to 'true'. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also possible to supply a number for increments, i.e. '15mm' which will instruct the chart that your data is supplied in 15 minute increments."
	 */
	public final native void setMinPeriod( String minPeriod ) /*-{
		this.minPeriod = minPeriod;
	}-*/;

	/**
	 * "In case your category axis values are Date objects, set this to true. In this case the chart will parse dates and will place your data points at irregular intervals. If you want dates to be parsed, but data points to be placed at equal intervals, set both parseDates and equalSpacing to true."
	 */
	public final native boolean isParseDates() /*-{
		return parseDates;
	}-*/;

	/**
	 * "In case your category axis values are Date objects, set this to true. In this case the chart will parse dates and will place your data points at irregular intervals. If you want dates to be parsed, but data points to be placed at equal intervals, set both parseDates and equalSpacing to true."
	 */
	public final native void setParseDates( boolean parseDates ) /*-{
		this.parseDates = parseDates;
	}-*/;

	/**
	 * "Specifies whether the graph should start on axis or not. In case you display columns, it is recommended to set this to false. If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true."
	 */
	public final native boolean isStartOnAxis() /*-{
		return startOnAxis;
	}-*/;

	/**
	 * "Specifies whether the graph should start on axis or not. In case you display columns, it is recommended to set this to false. If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true."
	 */
	public final native void setStartOnAxis( boolean startOnAxis ) /*-{
		this.startOnAxis = startOnAxis;
	}-*/;

	/**
	 * Position of a axis tick. Works only with non-date-based data.
	 */
	public final native String getTickPosition() /*-{
		return tickPosition;
	}-*/;

	/**
	 * Position of a axis tick. Works only with non-date-based data.
	 */
	public final native void setTickPosition( String tickPosition ) /*-{
		this.tickPosition = tickPosition;
	}-*/;

	/**
	 * "Works only when parseDates is set to true and equalSpacing is false. If you set it to true, at the position where bigger period changes, category axis will display date strings of bot small and big period, in two rows."
	 */
	public final native boolean isTwoLineMode() /*-{
		return twoLineMode;
	}-*/;

	/**
	 * "Works only when parseDates is set to true and equalSpacing is false. If you set it to true, at the position where bigger period changes, category axis will display date strings of bot small and big period, in two rows."
	 */
	public final native void setTwoLineMode( boolean twoLineMode ) /*-{
		this.twoLineMode = twoLineMode;
	}-*/;
}
