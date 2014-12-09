package com.amcharts.api;

import java.util.List;

public interface IsCategoryAxis extends IsAxisBase
{
	/**
	 * "Angle of label rotation, if the number of series exceeds autoRotateCount and parseDates is set to false."
	 */
	public double getAutoRotateAngle();

	/**
	 * "Angle of label rotation, if the number of series exceeds autoRotateCount and parseDates is set to false."
	 */
	public void setAutoRotateAngle( double autoRotateAngle );

	/**
	 * "If the number of category axis items will exceed the autoRotateCount, the labels will be rotated by autoRotateAngle degree. Works only if parseDates is false."
	 */
	public double getAutoRotateCount();

	/**
	 * "If the number of category axis items will exceed the autoRotateCount, the labels will be rotated by autoRotateAngle degree. Works only if parseDates is false."
	 */
	public void setAutoRotateCount( double autoRotateCount );

	/**
	 * Specifies if axis labels (only when it is horizontal) should be wrapped if they don't fit in the allocated space. Wrapping won't work for rotated axis labels.
	 */
	public Boolean isAutoWrap();

	/**
	 * Specifies if axis labels (only when it is horizontal) should be wrapped if they don't fit in the allocated space. Wrapping won't work for rotated axis labels.
	 */
	public void setAutoWrap( Boolean autoWrap );

	/**
	 * "When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods, like month, in bold. Set this to false to disable the functionality."
	 */
	public Boolean isBoldPeriodBeginning();

	/**
	 * "When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods, like month, in bold. Set this to false to disable the functionality."
	 */
	public void setBoldPeriodBeginning( Boolean boldPeriodBeginning );

	/**
	 * "specifies a method that returns the value that should be used as categoryValue for current item. If this property is set, the return value of the custom data function takes precedence over categoryField. When a chart calls this method, it passes category value, data item from chart's data provider and reference to categoryAxis: categoryFunction(category, dataItem, categoryAxis); This method can be used both when category axis parses dates and when it doesn't. If axis parses dates, your categoryFunction should return Date object. For example, if you have date strings in your data, you can use this method to convert these strings into Date objects."""
	 */
	public IsFunction getCategoryFunction();

	/**
	 * "specifies a method that returns the value that should be used as categoryValue for current item. If this property is set, the return value of the custom data function takes precedence over categoryField. When a chart calls this method, it passes category value, data item from chart's data provider and reference to categoryAxis: categoryFunction(category, dataItem, categoryAxis); This method can be used both when category axis parses dates and when it doesn't. If axis parses dates, your categoryFunction should return Date object. For example, if you have date strings in your data, you can use this method to convert these strings into Date objects."""
	 */
	public void setCategoryFunction( IsFunction categoryFunction );

	/**
	 * "This setting works only when parseDates is set to true and equalSpacing is set to false. In case you set it to false, labels will never be centered between grid lines."
	 */
	public Boolean isCenterLabelOnFullPeriod();

	/**
	 * "This setting works only when parseDates is set to true and equalSpacing is set to false. In case you set it to false, labels will never be centered between grid lines."
	 */
	public void setCenterLabelOnFullPeriod( Boolean centerLabelOnFullPeriod );

	/**
	 * "Date formats of different periods. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years. Check this page for date formatting strings."
	 */
	public List< ? extends IsDateFormat> getDateFormats();

	/**
	 * "Date formats of different periods. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years. Check this page for date formatting strings."
	 */
	public void setDateFormats( List< ? extends IsDateFormat> dateFormats );

	/**
	 * "In case your category axis values are Date objects and parseDates is set to true, the chart will parse dates and will place your data points at irregular intervals. However if you want dates to be parsed (displayed on the axis, baloons, etc), but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true."
	 */
	public Boolean isEqualSpacing();

	/**
	 * "In case your category axis values are Date objects and parseDates is set to true, the chart will parse dates and will place your data points at irregular intervals. However if you want dates to be parsed (displayed on the axis, baloons, etc), but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true."
	 */
	public void setEqualSpacing( Boolean equalSpacing );

	/**
	 * "Sets first day of the week. 0 is Sunday, 1 is Monday, etc."
	 */
	public double getFirstDayOfWeek();

	/**
	 * "Sets first day of the week. 0 is Sunday, 1 is Monday, etc."
	 */
	public void setFirstDayOfWeek( double firstDayOfWeek );

	/**
	 * "Field in data provider which specifies if the category value should always be shown. For example: categoryAxis.forceShowField = 'forceShow'; And in data: {category:'one', forceShow:true, value:100} Note, this works only when parseDates is set to false."
	 */
	public String getForceShowField();

	/**
	 * "Field in data provider which specifies if the category value should always be shown. For example: categoryAxis.forceShowField = 'forceShow'; And in data: {category:'one', forceShow:true, value:100} Note, this works only when parseDates is set to false."
	 */
	public void setForceShowField( String forceShowField );

	/**
	 * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell. Possible values are: 'start' and 'middle' This setting doesn't work if parseDates is set to true.
	 */
	public String getGridPosition();

	/**
	 * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell. Possible values are: 'start' and 'middle' This setting doesn't work if parseDates is set to true.
	 */
	public void setGridPosition( String gridPosition );

	/**
	 * You can use it to set color of a axis label. Works only with non-date-based data.
	 */
	public String getLabelColorField();

	/**
	 * You can use it to set color of a axis label. Works only with non-date-based data.
	 */
	public void setLabelColorField( String labelColorField );

	/**
	 * "You can use this function to format Category axis labels. If this function is set, then it is called with the following parameters passed: if dates are not parsed: labelFunction(valueText, serialDataItem, categoryAxis) if dates are parsed: labelFunction(valueText, date, categoryAxis) Your function should return string which will be displayed on the axis."
	 */
	public IsFunction getLabelFunction();

	/**
	 * "You can use this function to format Category axis labels. If this function is set, then it is called with the following parameters passed: if dates are not parsed: labelFunction(valueText, serialDataItem, categoryAxis) if dates are parsed: labelFunction(valueText, date, categoryAxis) Your function should return string which will be displayed on the axis."
	 */
	public void setLabelFunction( IsFunction labelFunction );

	/**
	 * "If you set it to false, the start of longer periods won't use a different date format and won't be bold."
	 */
	public Boolean isMarkPeriodChange();

	/**
	 * "If you set it to false, the start of longer periods won't use a different date format and won't be bold."
	 */
	public void setMarkPeriodChange( Boolean markPeriodChange );

	/**
	 * "Specifies the shortest period of your data. This should be set only if parseDates is set to 'true'. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also possible to supply a number for increments, i.e. '15mm' which will instruct the chart that your data is supplied in 15 minute increments."
	 */
	public String getMinPeriod();

	/**
	 * "Specifies the shortest period of your data. This should be set only if parseDates is set to 'true'. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also possible to supply a number for increments, i.e. '15mm' which will instruct the chart that your data is supplied in 15 minute increments."
	 */
	public void setMinPeriod( String minPeriod );

	/**
	 * "In case your category axis values are Date objects, set this to true. In this case the chart will parse dates and will place your data points at irregular intervals. If you want dates to be parsed, but data points to be placed at equal intervals, set both parseDates and equalSpacing to true."
	 */
	public Boolean isParseDates();

	/**
	 * "In case your category axis values are Date objects, set this to true. In this case the chart will parse dates and will place your data points at irregular intervals. If you want dates to be parsed, but data points to be placed at equal intervals, set both parseDates and equalSpacing to true."
	 */
	public void setParseDates( Boolean parseDates );

	/**
	 * "Possible values are: 'top', 'bottom', 'left', 'right'. If axis is vertical, default position is 'left'. If axis is horizontal, default position is 'bottom'."
	 */
	public String getPosition();

	/**
	 * "Possible values are: 'top', 'bottom', 'left', 'right'. If axis is vertical, default position is 'left'. If axis is horizontal, default position is 'bottom'."
	 */
	public void setPosition( String position );

	/**
	 * "Specifies whether the graph should start on axis or not. In case you display columns, it is recommended to set this to false. If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true."
	 */
	public Boolean isStartOnAxis();

	/**
	 * "Specifies whether the graph should start on axis or not. In case you display columns, it is recommended to set this to false. If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true."
	 */
	public void setStartOnAxis( Boolean startOnAxis );

	/**
	 * Position of a axis tick. Works only with non-date-based data.
	 */
	public String getTickPosition();

	/**
	 * Position of a axis tick. Works only with non-date-based data.
	 */
	public void setTickPosition( String tickPosition );

	/**
	 * "Works only when parseDates is set to true and equalSpacing is false. If you set it to true, at the position where bigger period changes, category axis will display date strings of bot small and big period, in two rows."
	 */
	public Boolean isTwoLineMode();

	/**
	 * "Works only when parseDates is set to true and equalSpacing is false. If you set it to true, at the position where bigger period changes, category axis will display date strings of bot small and big period, in two rows."
	 */
	public void setTwoLineMode( Boolean twoLineMode );
}
