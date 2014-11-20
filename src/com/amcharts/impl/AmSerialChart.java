package com.amcharts.impl;

import java.util.Date;

import com.amcharts.api.IsAmSerialChart;
import com.amcharts.api.IsCategoryAxis;
import com.amcharts.jso.AmSerialChartJSO;
import com.amcharts.jso.CategoryAxisJSO;

public class AmSerialChart extends AmRectangularChart implements IsAmSerialChart
{
	CategoryAxis categoryAxis;

	public AmSerialChart()
	{
		jso = createJso();
		categoryAxis = new CategoryAxis();
		CategoryAxisJSO categoryAxisJSO = ( CategoryAxisJSO ) getCategoryAxisJSO();
		categoryAxis.setJso( categoryAxisJSO );
		setType( "serial" );
	}

	@Override
	public AmSerialChartJSO getJso()
	{
		return ( AmSerialChartJSO ) super.getJso();
	}

	public native AmSerialChartJSO createJso()
	/*-{
		var chart = new $wnd.AmCharts.AmSerialChart();
		return chart;
	}-*/;

	public CategoryAxis getCategoryAxis()
	{
		return categoryAxis;
	};

	// TODO: Deviating from usual approach of nested entities.
	//	public native CategoryAxis getCategoryAxis()
	//	/*-{
	//		var categoryAxis = @com.amcharts.impl.util.WrapperUtils::wrap(Lcom/google/gwt/core/client/JavaScriptObject;)(this.categoryAxis)
	//		return categoryAxis;
	//	}-*/;

	public native void setCategoryAxis( IsCategoryAxis categoryAxis )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		var varCategoryAxis = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(categoryAxis)
		chart.categoryAxis = varCategoryAxis;
	}-*/;

	/**
	 * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
	 */
	public final String getBalloonDateFormat()
	{
		return getJso().getBalloonDateFormat();
	}

	/**
	 * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
	 */
	public final void setBalloonDateFormat( String balloonDateFormat )
	{
		getJso().setBalloonDateFormat( balloonDateFormat );
	}

	/**
	 * Category field name tells the chart the name of the field in your dataProvider object which will be used for category axis values.
	 */
	public final String getCategoryField()
	{
		return getJso().getCategoryField();
	}

	/**
	 * Category field name tells the chart the name of the field in your dataProvider object which will be used for category axis values.
	 */
	public final void setCategoryField( String categoryField )
	{
		getJso().setCategoryField( categoryField );
	}

	/**
	 * The gap in pixels between two columns of the same category.
	 */
	public final double getColumnSpacing()
	{
		return getJso().getColumnSpacing();
	}

	/**
	 * The gap in pixels between two columns of the same category.
	 */
	public final void setColumnSpacing( double columnSpacing )
	{
		getJso().setColumnSpacing( columnSpacing );
	}

	/**
	 * Space between 3D stacked columns.
	 */
	public final double getColumnSpacing3D()
	{
		return getJso().getColumnSpacing3D();
	}

	/**
	 * Space between 3D stacked columns.
	 */
	public final void setColumnSpacing3D( double columnSpacing3D )
	{
		getJso().setColumnSpacing3D( columnSpacing3D );
	}

	/**
	 * Relative width of columns. Value range is 0 - 1.
	 */
	public final double getColumnWidth()
	{
		return getJso().getColumnWidth();
	}

	/**
	 * Relative width of columns. Value range is 0 - 1.
	 */
	public final void setColumnWidth( double columnWidth )
	{
		getJso().setColumnWidth( columnWidth );
	}

	/**
	 * "Even if your chart parses dates, you can pass them as strings in your data � all you need to do is to set data date format and the chart will parse dates to date objects. Check this page for available formats.Please note that two-digit years (YY) is NOT supported in this setting."
	 */
	public final String getDataDateFormat()
	{
		return getJso().getDataDateFormat();
	}

	/**
	 * "Even if your chart parses dates, you can pass them as strings in your data � all you need to do is to set data date format and the chart will parse dates to date objects. Check this page for available formats.Please note that two-digit years (YY) is NOT supported in this setting."
	 */
	public final void setDataDateFormat( String dataDateFormat )
	{
		getJso().setDataDateFormat( dataDateFormat );
	}

	/**
	 * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
	 */
	public final Date getEndDate()
	{
		return getJso().getEndDate();
	}

	/**
	 * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
	 */
	public final void setEndDate( Date endDate )
	{
		getJso().setEndDate( endDate );
	}

	/**
	 * Read-only. Category index to which the chart is currently displayed.
	 */
	public final double getEndIndex()
	{
		return getJso().getEndIndex();
	}

	/**
	 * Read-only. Category index to which the chart is currently displayed.
	 */
	public final void setEndIndex( double endIndex )
	{
		getJso().setEndIndex( endIndex );
	}

	/**
	 * Maximum number of series allowed to select.
	 */
	public final double getMaxSelectedSeries()
	{
		return getJso().getMaxSelectedSeries();
	}

	/**
	 * Maximum number of series allowed to select.
	 */
	public final void setMaxSelectedSeries( double maxSelectedSeries )
	{
		getJso().setMaxSelectedSeries( maxSelectedSeries );
	}

	/**
	 * "The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days. Works if equalSpacing is set to false (default)."
	 */
	public final double getMaxSelectedTime()
	{
		return getJso().getMaxSelectedTime();
	}

	/**
	 * "The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days. Works if equalSpacing is set to false (default)."
	 */
	public final void setMaxSelectedTime( double maxSelectedTime )
	{
		getJso().setMaxSelectedTime( maxSelectedTime );
	}

	/**
	 * "The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second. Works if equalSpacing is set to false (default)."
	 */
	public final double getMinSelectedTime()
	{
		return getJso().getMinSelectedTime();
	}

	/**
	 * "The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second. Works if equalSpacing is set to false (default)."
	 */
	public final void setMinSelectedTime( double minSelectedTime )
	{
		getJso().setMinSelectedTime( minSelectedTime );
	}

	/**
	 * "Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will zoom-in/out."
	 */
	public final boolean isMouseWheelScrollEnabled()
	{
		return getJso().isMouseWheelScrollEnabled();
	}

	/**
	 * "Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will zoom-in/out."
	 */
	public final void setMouseWheelScrollEnabled( boolean mouseWheelScrollEnabled )
	{
		getJso().setMouseWheelScrollEnabled( mouseWheelScrollEnabled );
	}

	/**
	 * "Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will scroll."
	 */
	public final boolean isMouseWheelZoomEnabled()
	{
		return getJso().isMouseWheelZoomEnabled();
	}

	/**
	 * "Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will scroll."
	 */
	public final void setMouseWheelZoomEnabled( boolean mouseWheelZoomEnabled )
	{
		getJso().setMouseWheelZoomEnabled( mouseWheelZoomEnabled );
	}

	/**
	 * "If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars)."
	 */
	public final boolean isRotate()
	{
		return getJso().isRotate();
	}

	/**
	 * "If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars)."
	 */
	public final void setRotate( boolean rotate )
	{
		getJso().setRotate( rotate );
	}

	/**
	 * Read-only. If category axis parses dates startDate indicates date from which the chart is currently displayed.
	 */
	public final Date getStartDate()
	{
		return getJso().getStartDate();
	}

	/**
	 * Read-only. If category axis parses dates startDate indicates date from which the chart is currently displayed.
	 */
	public final void setStartDate( Date startDate )
	{
		getJso().setStartDate( startDate );
	}

	/**
	 * Read-only. Category index from which the chart is currently displayed.
	 */
	public final double getStartIndex()
	{
		return getJso().getStartIndex();
	}

	/**
	 * Read-only. Category index from which the chart is currently displayed.
	 */
	public final void setStartIndex( double startIndex )
	{
		getJso().setStartIndex( startIndex );
	}

	/**
	 * Specifies if chart should zoom-out when data is updated.
	 */
	public final boolean isZoomOutOnDataUpdate()
	{
		return getJso().isZoomOutOnDataUpdate();
	}

	/**
	 * Specifies if chart should zoom-out when data is updated.
	 */
	public final void setZoomOutOnDataUpdate( boolean zoomOutOnDataUpdate )
	{
		getJso().setZoomOutOnDataUpdate( zoomOutOnDataUpdate );
	}

	/**
	 * 
	 * @param value - series (category value) which index you want to find.
	 * @return Returns index of the specified category value.
	 */
	public native double getCategoryIndexByValue( String value )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		return chart.getCategoryIndexByValue(value);
	}-*/;

	/**
	 * Zooms out, charts shows all available data.
	 */
	public native void zoomOut()
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.zoomOut();
	}-*/;

	/**
	 * Zooms the chart by the value of the category axis.
	 * @param start - category value, String \\ end - category value, String.	
	 */
	public native double zoomToCategoryValues( String start, String end )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.zoomToCategoryValues(start, end);
	}-*/;

	/**
	 * Zooms the chart from one date to another.
	 * @param start date, Date object \\ end - end date, Date object.	
	 */
	public native double zoomToDates( Date start, Date end )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.zoomToDates(start, end);
	}-*/;

	/**
	 * Zooms the chart by the index of the category.
	 * @param start index, Number \\ end - end index, Number	
	 */
	public native double zoomToIndexes( double start, double end )
	/*-{
		var chart = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this)
		chart.zoomToIndexes(start, end);
	}-*/;
}