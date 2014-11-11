package com.amcharts.api;

import java.util.Date;

public interface IsAmSerialChart extends IsAmRectangularChart
{
	/**
	 * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
	 */
	public String getBalloonDateFormat();

	/**
	 * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
	 */
	public void setBalloonDateFormat( String balloonDateFormat );

	/**
	 * "Read-only. Chart creates category axis itself. If you want to change some properties, you should get this axis from the chart and set properties to this object."
	 */
	public IsCategoryAxis getCategoryAxis();

	/**
	 * "Read-only. Chart creates category axis itself. If you want to change some properties, you should get this axis from the chart and set properties to this object."
	 */
	public void setCategoryAxis( IsCategoryAxis categoryAxis );

	/**
	 * Category field name tells the chart the name of the field in your dataProvider object which will be used for category axis values.
	 */
	public String getCategoryField();

	/**
	 * Category field name tells the chart the name of the field in your dataProvider object which will be used for category axis values.
	 */
	public void setCategoryField( String categoryField );

	/**
	 * The gap in pixels between two columns of the same category.
	 */
	public double getColumnSpacing();

	/**
	 * The gap in pixels between two columns of the same category.
	 */
	public void setColumnSpacing( double columnSpacing );

	/**
	 * Space between 3D stacked columns.
	 */
	public double getColumnSpacing3D();

	/**
	 * Space between 3D stacked columns.
	 */
	public void setColumnSpacing3D( double columnSpacing3D );

	/**
	 * Relative width of columns. Value range is 0 - 1.
	 */
	public double getColumnWidth();

	/**
	 * Relative width of columns. Value range is 0 - 1.
	 */
	public void setColumnWidth( double columnWidth );

	/**
	 * "Even if your chart parses dates, you can pass them as strings in your data � all you need to do is to set data date format and the chart will parse dates to date objects. Check this page for available formats.Please note that two-digit years (YY) is NOT supported in this setting."
	 */
	public String getDataDateFormat();

	/**
	 * "Even if your chart parses dates, you can pass them as strings in your data � all you need to do is to set data date format and the chart will parse dates to date objects. Check this page for available formats.Please note that two-digit years (YY) is NOT supported in this setting."
	 */
	public void setDataDateFormat( String dataDateFormat );

	/**
	 * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
	 */
	public Date getEndDate();

	/**
	 * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
	 */
	public void setEndDate( Date endDate );

	/**
	 * Read-only. Category index to which the chart is currently displayed.
	 */
	public double getEndIndex();

	/**
	 * Read-only. Category index to which the chart is currently displayed.
	 */
	public void setEndIndex( double endIndex );

	/**
	 * Maximum number of series allowed to select.
	 */
	public double getMaxSelectedSeries();

	/**
	 * Maximum number of series allowed to select.
	 */
	public void setMaxSelectedSeries( double maxSelectedSeries );

	/**
	 * "The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days. Works if equalSpacing is set to false (default)."
	 */
	public double getMaxSelectedTime();

	/**
	 * "The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days. Works if equalSpacing is set to false (default)."
	 */
	public void setMaxSelectedTime( double maxSelectedTime );

	/**
	 * "The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second. Works if equalSpacing is set to false (default)."
	 */
	public double getMinSelectedTime();

	/**
	 * "The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second. Works if equalSpacing is set to false (default)."
	 */
	public void setMinSelectedTime( double minSelectedTime );

	/**
	 * "Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will zoom-in/out."
	 */
	public boolean isMouseWheelScrollEnabled();

	/**
	 * "Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will zoom-in/out."
	 */
	public void setMouseWheelScrollEnabled( boolean mouseWheelScrollEnabled );

	/**
	 * "Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will scroll."
	 */
	public boolean isMouseWheelZoomEnabled();

	/**
	 * "Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will scroll."
	 */
	public void setMouseWheelZoomEnabled( boolean mouseWheelZoomEnabled );

	/**
	 * "If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars)."
	 */
	public boolean isRotate();

	/**
	 * "If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars)."
	 */
	public void setRotate( boolean rotate );

	/**
	 * Read-only. If category axis parses dates startDate indicates date from which the chart is currently displayed.
	 */
	public Date getStartDate();

	/**
	 * Read-only. If category axis parses dates startDate indicates date from which the chart is currently displayed.
	 */
	public void setStartDate( Date startDate );

	/**
	 * Read-only. Category index from which the chart is currently displayed.
	 */
	public double getStartIndex();

	/**
	 * Read-only. Category index from which the chart is currently displayed.
	 */
	public void setStartIndex( double startIndex );

	/**
	 * Specifies if chart should zoom-out when data is updated.
	 */
	public boolean isZoomOutOnDataUpdate();

	/**
	 * Specifies if chart should zoom-out when data is updated.
	 */
	public void setZoomOutOnDataUpdate( boolean zoomOutOnDataUpdate );
}
