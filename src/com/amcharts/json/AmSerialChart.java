package com.amcharts.json;

import java.util.Date;

import com.amcharts.api.IsAmSerialChart;
import com.amcharts.api.IsCategoryAxis;

public final class AmSerialChart extends AmRectangularChart implements IsAmSerialChart
{
	private String balloonDateFormat;

	private IsCategoryAxis categoryAxis;

	private String categoryField;

	private double columnSpacing;

	private double columnSpacing3D;

	private double columnWidth;

	private String dataDateFormat;

	private Date endDate;

	private double endIndex;

	private double maxSelectedSeries;

	private double maxSelectedTime;

	private double minSelectedTime;

	private boolean mouseWheelScrollEnabled;

	private boolean mouseWheelZoomEnabled;

	private boolean rotate;

	private Date startDate;

	private double startIndex;

	private boolean zoomOutOnDataUpdate;

	/**
	 * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
	 */
	public String getBalloonDateFormat()
	{
		return balloonDateFormat;
	}

	/**
	 * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
	 */
	public void setBalloonDateFormat( String balloonDateFormat )
	{
		this.balloonDateFormat = balloonDateFormat;
	}

	/**
	 * "Read-only. Chart creates category axis itself. If you want to change some properties, you should get this axis from the chart and set properties to this object."
	 */
	public IsCategoryAxis getCategoryAxis()
	{
		return categoryAxis;
	}

	/**
	 * "Read-only. Chart creates category axis itself. If you want to change some properties, you should get this axis from the chart and set properties to this object."
	 */
	public void setCategoryAxis( IsCategoryAxis categoryAxis )
	{
		this.categoryAxis = categoryAxis;
	}

	/**
	 * Category field name tells the chart the name of the field in your dataProvider object which will be used for category axis values.
	 */
	public String getCategoryField()
	{
		return categoryField;
	}

	/**
	 * Category field name tells the chart the name of the field in your dataProvider object which will be used for category axis values.
	 */
	public void setCategoryField( String categoryField )
	{
		this.categoryField = categoryField;
	}

	/**
	 * The gap in pixels between two columns of the same category.
	 */
	public double getColumnSpacing()
	{
		return columnSpacing;
	}

	/**
	 * The gap in pixels between two columns of the same category.
	 */
	public void setColumnSpacing( double columnSpacing )
	{
		this.columnSpacing = columnSpacing;
	}

	/**
	 * Space between 3D stacked columns.
	 */
	public double getColumnSpacing3D()
	{
		return columnSpacing3D;
	}

	/**
	 * Space between 3D stacked columns.
	 */
	public void setColumnSpacing3D( double columnSpacing3D )
	{
		this.columnSpacing3D = columnSpacing3D;
	}

	/**
	 * Relative width of columns. Value range is 0 - 1.
	 */
	public double getColumnWidth()
	{
		return columnWidth;
	}

	/**
	 * Relative width of columns. Value range is 0 - 1.
	 */
	public void setColumnWidth( double columnWidth )
	{
		this.columnWidth = columnWidth;
	}

	/**
	 * "Even if your chart parses dates, you can pass them as strings in your data � all you need to do is to set data date format and the chart will parse dates to date objects. Check this page for available formats.Please note that two-digit years (YY) is NOT supported in this setting."
	 */
	public String getDataDateFormat()
	{
		return dataDateFormat;
	}

	/**
	 * "Even if your chart parses dates, you can pass them as strings in your data � all you need to do is to set data date format and the chart will parse dates to date objects. Check this page for available formats.Please note that two-digit years (YY) is NOT supported in this setting."
	 */
	public void setDataDateFormat( String dataDateFormat )
	{
		this.dataDateFormat = dataDateFormat;
	}

	/**
	 * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
	 */
	public Date getEndDate()
	{
		return endDate;
	}

	/**
	 * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
	 */
	public void setEndDate( Date endDate )
	{
		this.endDate = endDate;
	}

	/**
	 * Read-only. Category index to which the chart is currently displayed.
	 */
	public double getEndIndex()
	{
		return endIndex;
	}

	/**
	 * Read-only. Category index to which the chart is currently displayed.
	 */
	public void setEndIndex( double endIndex )
	{
		this.endIndex = endIndex;
	}

	/**
	 * Maximum number of series allowed to select.
	 */
	public double getMaxSelectedSeries()
	{
		return maxSelectedSeries;
	}

	/**
	 * Maximum number of series allowed to select.
	 */
	public void setMaxSelectedSeries( double maxSelectedSeries )
	{
		this.maxSelectedSeries = maxSelectedSeries;
	}

	/**
	 * "The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days. Works if equalSpacing is set to false (default)."
	 */
	public double getMaxSelectedTime()
	{
		return maxSelectedTime;
	}

	/**
	 * "The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days. Works if equalSpacing is set to false (default)."
	 */
	public void setMaxSelectedTime( double maxSelectedTime )
	{
		this.maxSelectedTime = maxSelectedTime;
	}

	/**
	 * "The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second. Works if equalSpacing is set to false (default)."
	 */
	public double getMinSelectedTime()
	{
		return minSelectedTime;
	}

	/**
	 * "The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second. Works if equalSpacing is set to false (default)."
	 */
	public void setMinSelectedTime( double minSelectedTime )
	{
		this.minSelectedTime = minSelectedTime;
	}

	/**
	 * "Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will zoom-in/out."
	 */
	public boolean isMouseWheelScrollEnabled()
	{
		return mouseWheelScrollEnabled;
	}

	/**
	 * "Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will zoom-in/out."
	 */
	public void setMouseWheelScrollEnabled( boolean mouseWheelScrollEnabled )
	{
		this.mouseWheelScrollEnabled = mouseWheelScrollEnabled;
	}

	/**
	 * "Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will scroll."
	 */
	public boolean isMouseWheelZoomEnabled()
	{
		return mouseWheelZoomEnabled;
	}

	/**
	 * "Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while rotating mouse wheel, the chart will scroll."
	 */
	public void setMouseWheelZoomEnabled( boolean mouseWheelZoomEnabled )
	{
		this.mouseWheelZoomEnabled = mouseWheelZoomEnabled;
	}

	/**
	 * "If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars)."
	 */
	public boolean isRotate()
	{
		return rotate;
	}

	/**
	 * "If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars)."
	 */
	public void setRotate( boolean rotate )
	{
		this.rotate = rotate;
	}

	/**
	 * Read-only. If category axis parses dates startDate indicates date from which the chart is currently displayed.
	 */
	public Date getStartDate()
	{
		return startDate;
	}

	/**
	 * Read-only. If category axis parses dates startDate indicates date from which the chart is currently displayed.
	 */
	public void setStartDate( Date startDate )
	{
		this.startDate = startDate;
	}

	/**
	 * Read-only. Category index from which the chart is currently displayed.
	 */
	public double getStartIndex()
	{
		return startIndex;
	}

	/**
	 * Read-only. Category index from which the chart is currently displayed.
	 */
	public void setStartIndex( double startIndex )
	{
		this.startIndex = startIndex;
	}

	/**
	 * Specifies if chart should zoom-out when data is updated.
	 */
	public boolean isZoomOutOnDataUpdate()
	{
		return zoomOutOnDataUpdate;
	}

	/**
	 * Specifies if chart should zoom-out when data is updated.
	 */
	public void setZoomOutOnDataUpdate( boolean zoomOutOnDataUpdate )
	{
		this.zoomOutOnDataUpdate = zoomOutOnDataUpdate;
	}
}
