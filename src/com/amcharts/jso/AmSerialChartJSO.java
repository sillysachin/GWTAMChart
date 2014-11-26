package com.amcharts.jso;

import java.util.Date;

import com.amcharts.api.IsAmSerialChart;
import com.amcharts.api.IsCategoryAxis;

public final class AmSerialChartJSO extends AmRectangularChartJSO implements IsAmSerialChart
{
	protected AmSerialChartJSO()
	{
	}

	/**
	 * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
	 */
	public final native String getBalloonDateFormat() /*-{
		return balloonDateFormat;
	}-*/;

	/**
	 * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
	 */
	public final native void setBalloonDateFormat( String balloonDateFormat ) /*-{
		this.balloonDateFormat = balloonDateFormat;
	}-*/;

	/**
	 * "Read-only. Chart creates category axis itself. If you want to change some properties, you should get this axis from the chart and set properties to this object."
	 */
	public final native IsCategoryAxis getCategoryAxis() /*-{
		return categoryAxis;
	}-*/;

	/**
	 * "Read-only. Chart creates category axis itself. If you want to change some properties, you should get this axis from the chart and set properties to this object."
	 */
	public final native void setCategoryAxis( IsCategoryAxis categoryAxis ) /*-{
		this.categoryAxis = categoryAxis;
	}-*/;

	/**
	 * Category field name tells the chart the name of the field in your dataProvider object which will be used for category axis values.
	 */
	public final native String getCategoryField() /*-{
		return categoryField;
	}-*/;

	/**
	 * Category field name tells the chart the name of the field in your dataProvider object which will be used for category axis values.
	 */
	public final native void setCategoryField( String categoryField ) /*-{
		this.categoryField = categoryField;
	}-*/;

	/**
	 * The gap in pixels between two columns of the same category.
	 */
	public final native double getColumnSpacing() /*-{
		return columnSpacing;
	}-*/;

	/**
	 * The gap in pixels between two columns of the same category.
	 */
	public final native void setColumnSpacing( double columnSpacing ) /*-{
		this.columnSpacing = columnSpacing;
	}-*/;

	/**
	 * Space between 3D stacked columns.
	 */
	public final native double getColumnSpacing3D() /*-{
		return columnSpacing3D;
	}-*/;

	/**
	 * Space between 3D stacked columns.
	 */
	public final native void setColumnSpacing3D( double columnSpacing3D ) /*-{
		this.columnSpacing3D = columnSpacing3D;
	}-*/;

	/**
	 * Relative width of columns. Value range is 0 - 1.
	 */
	public final native double getColumnWidth() /*-{
		return columnWidth;
	}-*/;

	/**
	 * Relative width of columns. Value range is 0 - 1.
	 */
	public final native void setColumnWidth( double columnWidth ) /*-{
		this.columnWidth = columnWidth;
	}-*/;

	/**
	 * "Even if your chart parses dates, you can pass them as strings in your data � all you need to do is to set data date format and the chart will parse dates to date objects. Check this page for available formats.Please note that two-digit years (YY) is NOT supported in this setting."
	 */
	public final native String getDataDateFormat() /*-{
		return dataDateFormat;
	}-*/;

	/**
	 * "Even if your chart parses dates, you can pass them as strings in your data � all you need to do is to set data date format and the chart will parse dates to date objects. Check this page for available formats.Please note that two-digit years (YY) is NOT supported in this setting."
	 */
	public final native void setDataDateFormat( String dataDateFormat ) /*-{
		this.dataDateFormat = dataDateFormat;
	}-*/;

	/**
	 * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
	 */
	public final native Date getEndDate() /*-{
		return endDate;
	}-*/;

	/**
	 * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
	 */
	public final native void setEndDate( Date endDate ) /*-{
		this.endDate = endDate;
	}-*/;

	/**
	 * Read-only. Category index to which the chart is currently displayed.
	 */
	public final native double getEndIndex() /*-{
		return endIndex;
	}-*/;

	/**
	 * Read-only. Category index to which the chart is currently displayed.
	 */
	public final native void setEndIndex( double endIndex ) /*-{
		this.endIndex = endIndex;
	}-*/;

	/**
	 * Maximum number of series allowed to select.
	 */
	public final native double getMaxSelectedSeries() /*-{
		return maxSelectedSeries;
	}-*/;

	/**
	 * Maximum number of series allowed to select.
	 */
	public final native void setMaxSelectedSeries( double maxSelectedSeries ) /*-{
		this.maxSelectedSeries = maxSelectedSeries;
	}-*/;

	/**
	 * "The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days. Works if equalSpacing is set to false (default)."
	 */
	public final native double getMaxSelectedTime() /*-{
		return maxSelectedTime;
	}-*/;

	/**
	 * "The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days. Works if equalSpacing is set to false (default)."
	 */
	public final native void setMaxSelectedTime( double maxSelectedTime ) /*-{
		this.maxSelectedTime = maxSelectedTime;
	}-*/;

	/**
	 * "The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second. Works if equalSpacing is set to false (default)."
	 */
	public final native double getMinSelectedTime() /*-{
		return minSelectedTime;
	}-*/;

	/**
	 * "The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second. Works if equalSpacing is set to false (default)."
	 */
	public final native void setMinSelectedTime( double minSelectedTime ) /*-{
		this.minSelectedTime = minSelectedTime;
	}-*/;

	/**
	 * "Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will zoom-in/out."
	 */
	public final native Boolean isMouseWheelScrollEnabled() /*-{
		return mouseWheelScrollEnabled;
	}-*/;

	/**
	 * "Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will zoom-in/out."
	 */
	public final native void setMouseWheelScrollEnabled( Boolean mouseWheelScrollEnabled ) /*-{
		this.mouseWheelScrollEnabled = mouseWheelScrollEnabled;
	}-*/;

	/**
	 * "Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will scroll."
	 */
	public final native Boolean isMouseWheelZoomEnabled() /*-{
		return mouseWheelZoomEnabled;
	}-*/;

	/**
	 * "Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will scroll."
	 */
	public final native void setMouseWheelZoomEnabled( Boolean mouseWheelZoomEnabled ) /*-{
		this.mouseWheelZoomEnabled = mouseWheelZoomEnabled;
	}-*/;

	/**
	 * "If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars)."
	 */
	public final native Boolean isRotate() /*-{
		return rotate;
	}-*/;

	/**
	 * "If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars)."
	 */
	public final native void setRotate( Boolean rotate ) /*-{
		this.rotate = rotate;
	}-*/;

	/**
	 * Read-only. If category axis parses dates startDate indicates date from which the chart is currently displayed.
	 */
	public final native Date getStartDate() /*-{
		return startDate;
	}-*/;

	/**
	 * Read-only. If category axis parses dates startDate indicates date from which the chart is currently displayed.
	 */
	public final native void setStartDate( Date startDate ) /*-{
		this.startDate = startDate;
	}-*/;

	/**
	 * Read-only. Category index from which the chart is currently displayed.
	 */
	public final native double getStartIndex() /*-{
		return startIndex;
	}-*/;

	/**
	 * Read-only. Category index from which the chart is currently displayed.
	 */
	public final native void setStartIndex( double startIndex ) /*-{
		this.startIndex = startIndex;
	}-*/;

	/**
	 * Specifies if chart should zoom-out when data is updated.
	 */
	public final native Boolean isZoomOutOnDataUpdate() /*-{
		return zoomOutOnDataUpdate;
	}-*/;

	/**
	 * Specifies if chart should zoom-out when data is updated.
	 */
	public final native void setZoomOutOnDataUpdate( Boolean zoomOutOnDataUpdate ) /*-{
		this.zoomOutOnDataUpdate = zoomOutOnDataUpdate;
	}-*/;
}
