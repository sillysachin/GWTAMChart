package com.amcharts.impl;

import java.util.Date;
import java.util.List;

import com.amcharts.api.IsCategoryAxis;
import com.amcharts.api.IsFunction;
import com.amcharts.impl.event.AmChartListener;
import com.amcharts.jso.CategoryAxisJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public final class CategoryAxis extends AxisBase implements IsCategoryAxis, IJavaScriptWrapper<CategoryAxisJSO>
{
	protected CategoryAxis()
	{
		jso = createJso();
	}

	public CategoryAxisJSO getJso()
	{
		return ( CategoryAxisJSO ) this.jso;
	}

	public void setJso( CategoryAxisJSO jso )
	{
		this.jso = jso;
	}

	public native CategoryAxisJSO createJso()
	/*-{
		var categoryAxis = new $wnd.AmCharts.CategoryAxis();
		return categoryAxis;
	}-*/;

	/**
	  * "Angle of label rotation, if the number of series exceeds autoRotateCount and parseDates is set to false."
	  */
	public final double getAutoRotateAngle()
	{
		return getJso().getAutoRotateAngle();
	}

	/**
	 * "Angle of label rotation, if the number of series exceeds autoRotateCount and parseDates is set to false."
	 */
	public final void setAutoRotateAngle( double autoRotateAngle )
	{
		getJso().setAutoRotateAngle( autoRotateAngle );
	}

	/**
	 * "If the number of category axis items will exceed the autoRotateCount, the labels will be rotated by autoRotateAngle degree. Works only if parseDates is false."
	 */
	public final double getAutoRotateCount()
	{
		return getJso().getAutoRotateCount();
	}

	/**
	 * "If the number of category axis items will exceed the autoRotateCount, the labels will be rotated by autoRotateAngle degree. Works only if parseDates is false."
	 */
	public final void setAutoRotateCount( double autoRotateCount )
	{
		getJso().setAutoRotateCount( autoRotateCount );
	}

	/**
	 * Specifies if axis labels (only when it is horizontal) should be wrapped if they don't fit in the allocated space. Wrapping won't work for rotated axis labels.
	 */
	public final boolean isAutoWrap()
	{
		return getJso().isAutoWrap();
	}

	/**
	 * Specifies if axis labels (only when it is horizontal) should be wrapped if they don't fit in the allocated space. Wrapping won't work for rotated axis labels.
	 */
	public final void setAutoWrap( boolean autoWrap )
	{
		getJso().setAutoWrap( autoWrap );
	}

	/**
	 * "When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods, like month, in bold. Set this to false to disable the functionality."
	 */
	public final boolean isBoldPeriodBeginning()
	{
		return getJso().isBoldPeriodBeginning();
	}

	/**
	 * "When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods, like month, in bold. Set this to false to disable the functionality."
	 */
	public final void setBoldPeriodBeginning( boolean boldPeriodBeginning )
	{
		getJso().setBoldPeriodBeginning( boldPeriodBeginning );
	}

	/**
	 * "specifies a method that returns the value that should be used as categoryValue for current item. If this property is set, the return value of the custom data function takes precedence over categoryField. When a chart calls this method, it passes category value, data item from chart's data provider and reference to categoryAxis: categoryFunction(category, dataItem, categoryAxis); This method can be used both when category axis parses dates and when it doesn't. If axis parses dates, your categoryFunction should return Date object. For example, if you have date strings in your data, you can use this method to convert these strings into Date objects."""
	 */
	public final IsFunction getCategoryFunction()
	{
		return getJso().getCategoryFunction();
	}

	/**
	 * "specifies a method that returns the value that should be used as categoryValue for current item. If this property is set, the return value of the custom data function takes precedence over categoryField. When a chart calls this method, it passes category value, data item from chart's data provider and reference to categoryAxis: categoryFunction(category, dataItem, categoryAxis); This method can be used both when category axis parses dates and when it doesn't. If axis parses dates, your categoryFunction should return Date object. For example, if you have date strings in your data, you can use this method to convert these strings into Date objects."""
	 */
	public final void setCategoryFunction( IsFunction categoryFunction )
	{
		getJso().setCategoryFunction( categoryFunction );
	}

	/**
	 * "This setting works only when parseDates is set to true and equalSpacing is set to false. In case you set it to false, labels will never be centered between grid lines."
	 */
	public final boolean isCenterLabelOnFullPeriod()
	{
		return getJso().isCenterLabelOnFullPeriod();
	}

	/**
	 * "This setting works only when parseDates is set to true and equalSpacing is set to false. In case you set it to false, labels will never be centered between grid lines."
	 */
	public final void setCenterLabelOnFullPeriod( boolean centerLabelOnFullPeriod )
	{
		getJso().setCenterLabelOnFullPeriod( centerLabelOnFullPeriod );
	}

	/**
	 * "Date formats of different periods. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years. Check this page for date formatting strings."
	 */
	public final List<JavaScriptObject> getDateFormats()
	{
		return getJso().getDateFormats();
	}

	/**
	 * "Date formats of different periods. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years. Check this page for date formatting strings."
	 */
	public final void setDateFormats( List<JavaScriptObject> dateFormats )
	{
		getJso().setDateFormats( dateFormats );
	}

	/**
	 * "In case your category axis values are Date objects and parseDates is set to true, the chart will parse dates and will place your data points at irregular intervals. However if you want dates to be parsed (displayed on the axis, baloons, etc), but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true."
	 */
	public final boolean isEqualSpacing()
	{
		return getJso().isEqualSpacing();
	}

	/**
	 * "In case your category axis values are Date objects and parseDates is set to true, the chart will parse dates and will place your data points at irregular intervals. However if you want dates to be parsed (displayed on the axis, baloons, etc), but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true."
	 */
	public final void setEqualSpacing( boolean equalSpacing )
	{
		getJso().setEqualSpacing( equalSpacing );
	}

	/**
	 * "Sets first day of the week. 0 is Sunday, 1 is Monday, etc."
	 */
	public final double getFirstDayOfWeek()
	{
		return getJso().getFirstDayOfWeek();
	}

	/**
	 * "Sets first day of the week. 0 is Sunday, 1 is Monday, etc."
	 */
	public final void setFirstDayOfWeek( double firstDayOfWeek )
	{
		getJso().setFirstDayOfWeek( firstDayOfWeek );
	}

	/**
	 * "Field in data provider which specifies if the category value should always be shown. For example: categoryAxis.forceShowField = 'forceShow'; And in data: {category:'one', forceShow:true, value:100} Note, this works only when parseDates is set to false."
	 */
	public final String getForceShowField()
	{
		return getJso().getForceShowField();
	}

	/**
	 * "Field in data provider which specifies if the category value should always be shown. For example: categoryAxis.forceShowField = 'forceShow'; And in data: {category:'one', forceShow:true, value:100} Note, this works only when parseDates is set to false."
	 */
	public final void setForceShowField( String forceShowField )
	{
		getJso().setForceShowField( forceShowField );
	}

	/**
	 * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell. Possible values are: 'start' and 'middle' This setting doesn't work if parseDates is set to true.
	 */
	public final String getGridPosition()
	{
		return getJso().getGridPosition();
	}

	/**
	 * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell. Possible values are: 'start' and 'middle' This setting doesn't work if parseDates is set to true.
	 */
	public final void setGridPosition( String gridPosition )
	{
		getJso().setGridPosition( gridPosition );
	}

	/**
	 * You can use it to set color of a axis label. Works only with non-date-based data.
	 */
	public final String getLabelColorField()
	{
		return getJso().getLabelColorField();
	}

	/**
	 * You can use it to set color of a axis label. Works only with non-date-based data.
	 */
	public final void setLabelColorField( String labelColorField )
	{
		getJso().setLabelColorField( labelColorField );
	}

	/**
	 * "You can use this function to format Category axis labels. If this function is set, then it is called with the following parameters passed: if dates are not parsed: labelFunction(valueText, serialDataItem, categoryAxis) if dates are parsed: labelFunction(valueText, date, categoryAxis) Your function should return string which will be displayed on the axis."
	 */
	public final IsFunction getLabelFunction()
	{
		return getJso().getLabelFunction();
	}

	/**
	 * "You can use this function to format Category axis labels. If this function is set, then it is called with the following parameters passed: if dates are not parsed: labelFunction(valueText, serialDataItem, categoryAxis) if dates are parsed: labelFunction(valueText, date, categoryAxis) Your function should return string which will be displayed on the axis."
	 */
	public final void setLabelFunction( IsFunction labelFunction )
	{
		getJso().setLabelFunction( labelFunction );
	}

	/**
	 * "If you set it to false, the start of longer periods won't use a different date format and won't be bold."
	 */
	public final boolean isMarkPeriodChange()
	{
		return getJso().isMarkPeriodChange();
	}

	/**
	 * "If you set it to false, the start of longer periods won't use a different date format and won't be bold."
	 */
	public final void setMarkPeriodChange( boolean markPeriodChange )
	{
		getJso().setMarkPeriodChange( markPeriodChange );
	}

	/**
	 * "Specifies the shortest period of your data. This should be set only if parseDates is set to 'true'. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also possible to supply a number for increments, i.e. '15mm' which will instruct the chart that your data is supplied in 15 minute increments."
	 */
	public final String getMinPeriod()
	{
		return getJso().getMinPeriod();
	}

	/**
	 * "Specifies the shortest period of your data. This should be set only if parseDates is set to 'true'. Possible period values: fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also possible to supply a number for increments, i.e. '15mm' which will instruct the chart that your data is supplied in 15 minute increments."
	 */
	public final void setMinPeriod( String minPeriod )
	{
		getJso().setMinPeriod( minPeriod );
	}

	/**
	 * "In case your category axis values are Date objects, set this to true. In this case the chart will parse dates and will place your data points at irregular intervals. If you want dates to be parsed, but data points to be placed at equal intervals, set both parseDates and equalSpacing to true."
	 */
	public final boolean isParseDates()
	{
		return getJso().isParseDates();
	}

	/**
	 * "In case your category axis values are Date objects, set this to true. In this case the chart will parse dates and will place your data points at irregular intervals. If you want dates to be parsed, but data points to be placed at equal intervals, set both parseDates and equalSpacing to true."
	 */
	public final void setParseDates( boolean parseDates )
	{
		getJso().setParseDates( parseDates );
	}

	/**
	 * "Specifies whether the graph should start on axis or not. In case you display columns, it is recommended to set this to false. If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true."
	 */
	public final boolean isStartOnAxis()
	{
		return getJso().isStartOnAxis();
	}

	/**
	 * "Specifies whether the graph should start on axis or not. In case you display columns, it is recommended to set this to false. If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true."
	 */
	public final void setStartOnAxis( boolean startOnAxis )
	{
		getJso().setStartOnAxis( startOnAxis );
	}

	/**
	 * Position of a axis tick. Works only with non-date-based data.
	 */
	public final String getTickPosition()
	{
		return getJso().getTickPosition();
	}

	/**
	 * Position of a axis tick. Works only with non-date-based data.
	 */
	public final void setTickPosition( String tickPosition )
	{
		getJso().setTickPosition( tickPosition );
	}

	/**
	 * "Works only when parseDates is set to true and equalSpacing is false. If you set it to true, at the position where bigger period changes, category axis will display date strings of bot small and big period, in two rows."
	 */
	public final boolean isTwoLineMode()
	{
		return getJso().isTwoLineMode();
	}

	/**
	 * "Works only when parseDates is set to true and equalSpacing is false. If you set it to true, at the position where bigger period changes, category axis will display date strings of bot small and big period, in two rows."
	 */
	public final void setTwoLineMode( boolean twoLineMode )
	{
		getJso().setTwoLineMode( twoLineMode );
	}

	/**
	 * Returns coordinate of a category. Works only if parseDates is false. If parseDates is true, use dateToCoordinate method.
	 */
	public native double categoryToCoordinate( String category )
	/*-{
		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return categoryAxis.categoryToCoordinate(category);
	}-*/;

	/**
	 * Returns Date of the coordinate, in case parseDates is set to true and equalSpacing is set to false.
	 */
	public native Date coordinateToDate( double coordinate )
	/*-{
		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return categoryAxis.coordinateToDate(coordinate);
	}-*/;

	/**
	 * Returns coordinate of the date, in case parseDates is set to true. if parseDates is false, use categoryToCoordinate method.
	 */
	public native double dateToCoordinate( Date date )
	/*-{
		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return categoryAxis.dateToCoordinate(date);
	}-*/;

	/**
	 * Returns index of the category which is most close to specified coordinate.
	 */
	public native double xToIndex( double x )
	/*-{
		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		return categoryAxis.xToIndex();
	}-*/;
	
	/**
	 * Adds event listener to the object.
	 * type - string like 'axisChanged' (should be listed in 'events' section of this class or classes which extend this class). 
	 * handler - function which is called when event happens.
	 */
	public native double addListener( String eventName, AmChartListener amChartListener )
	/*-{
		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		var categoryAxisThis = this;
		console.log('addListener - > ' + eventName);
		categoryAxis
				.addListener(
						eventName,
						function(event) {
							console.log('event function processed - > ' + eventName);
							@com.amcharts.impl.util.LogUtils::log(Ljava/lang/Object;)(event);
							categoryAxisThis.@com.amcharts.impl.AxisBase::handleListener(Lcom/amcharts/impl/event/AmChartListener;Lcom/amcharts/impl/event/AmChartEventJSO;)(amChartListener,event);
							if (event.event == undefined) {
								console.log('Non Dom Event - > ' + event.type);
							} else {
								console.log('Dom Event - > ' + event.type);
							}
						});
	}-*/;
}