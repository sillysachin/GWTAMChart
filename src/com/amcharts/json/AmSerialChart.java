package com.amcharts.json;

import java.util.Date;

public class AmSerialChart extends AmCoordinateChart implements IsAmSerialChart
{
	private CategoryAxis categoryAxis;

	private String balloonDateFormat;

	private String categoryField;

	private Number columnSpacing;

	private Number columnSpacing3D;

	private Number columnWidth;

	private String dataDateFormat;

	private Date endDate;

	private Number endIndex;

	private Number maxSelectedSeries;

	private Number maxSelectedTime;

	private Number minSelectedTime;

	private Boolean mouseWheelScrollEnabled;

	private Boolean mouseWheelZoomEnabled;

	private Boolean rotate;

	private Date startDate;

	private Number startIndex;

	private Boolean zoomOutOnDataUpdate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getCategoryAxis()
	 */
	@Override
	public CategoryAxis getCategoryAxis()
	{
		return categoryAxis;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setCategoryAxis(com.amcharts.json.CategoryAxis)
	 */
	@Override
	public void setCategoryAxis( CategoryAxis categoryAxis )
	{
		this.categoryAxis = categoryAxis;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getBalloonDateFormat()
	 */
	@Override
	public String getBalloonDateFormat()
	{
		return balloonDateFormat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setBalloonDateFormat(java.lang.String)
	 */
	@Override
	public void setBalloonDateFormat( String balloonDateFormat )
	{
		this.balloonDateFormat = balloonDateFormat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getCategoryField()
	 */
	@Override
	public String getCategoryField()
	{
		return categoryField;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setCategoryField(java.lang.String)
	 */
	@Override
	public void setCategoryField( String categoryField )
	{
		this.categoryField = categoryField;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getColumnSpacing()
	 */
	@Override
	public Number getColumnSpacing()
	{
		return columnSpacing;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setColumnSpacing(java.lang.Number)
	 */
	@Override
	public void setColumnSpacing( Number columnSpacing )
	{
		this.columnSpacing = columnSpacing;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getColumnSpacing3D()
	 */
	@Override
	public Number getColumnSpacing3D()
	{
		return columnSpacing3D;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setColumnSpacing3D(java.lang.Number)
	 */
	@Override
	public void setColumnSpacing3D( Number columnSpacing3D )
	{
		this.columnSpacing3D = columnSpacing3D;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getColumnWidth()
	 */
	@Override
	public Number getColumnWidth()
	{
		return columnWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setColumnWidth(java.lang.Number)
	 */
	@Override
	public void setColumnWidth( Number columnWidth )
	{
		this.columnWidth = columnWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getDataDateFormat()
	 */
	@Override
	public String getDataDateFormat()
	{
		return dataDateFormat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setDataDateFormat(java.lang.String)
	 */
	@Override
	public void setDataDateFormat( String dataDateFormat )
	{
		this.dataDateFormat = dataDateFormat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getEndDate()
	 */
	@Override
	public Date getEndDate()
	{
		return endDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setEndDate(java.util.Date)
	 */
	@Override
	public void setEndDate( Date endDate )
	{
		this.endDate = endDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getEndIndex()
	 */
	@Override
	public Number getEndIndex()
	{
		return endIndex;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setEndIndex(java.lang.Number)
	 */
	@Override
	public void setEndIndex( Number endIndex )
	{
		this.endIndex = endIndex;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMaxSelectedSeries()
	 */
	@Override
	public Number getMaxSelectedSeries()
	{
		return maxSelectedSeries;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMaxSelectedSeries(java.lang.Number)
	 */
	@Override
	public void setMaxSelectedSeries( Number maxSelectedSeries )
	{
		this.maxSelectedSeries = maxSelectedSeries;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMaxSelectedTime()
	 */
	@Override
	public Number getMaxSelectedTime()
	{
		return maxSelectedTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMaxSelectedTime(java.lang.Number)
	 */
	@Override
	public void setMaxSelectedTime( Number maxSelectedTime )
	{
		this.maxSelectedTime = maxSelectedTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMinSelectedTime()
	 */
	@Override
	public Number getMinSelectedTime()
	{
		return minSelectedTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMinSelectedTime(java.lang.Number)
	 */
	@Override
	public void setMinSelectedTime( Number minSelectedTime )
	{
		this.minSelectedTime = minSelectedTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMouseWheelScrollEnabled()
	 */
	@Override
	public Boolean getMouseWheelScrollEnabled()
	{
		return mouseWheelScrollEnabled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMouseWheelScrollEnabled(java.lang.Boolean)
	 */
	@Override
	public void setMouseWheelScrollEnabled( Boolean mouseWheelScrollEnabled )
	{
		this.mouseWheelScrollEnabled = mouseWheelScrollEnabled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMouseWheelZoomEnabled()
	 */
	@Override
	public Boolean getMouseWheelZoomEnabled()
	{
		return mouseWheelZoomEnabled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMouseWheelZoomEnabled(java.lang.Boolean)
	 */
	@Override
	public void setMouseWheelZoomEnabled( Boolean mouseWheelZoomEnabled )
	{
		this.mouseWheelZoomEnabled = mouseWheelZoomEnabled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getRotate()
	 */
	@Override
	public Boolean getRotate()
	{
		return rotate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setRotate(java.lang.Boolean)
	 */
	@Override
	public void setRotate( Boolean rotate )
	{
		this.rotate = rotate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getStartDate()
	 */
	@Override
	public Date getStartDate()
	{
		return startDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setStartDate(java.util.Date)
	 */
	@Override
	public void setStartDate( Date startDate )
	{
		this.startDate = startDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getStartIndex()
	 */
	@Override
	public Number getStartIndex()
	{
		return startIndex;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setStartIndex(java.lang.Number)
	 */
	@Override
	public void setStartIndex( Number startIndex )
	{
		this.startIndex = startIndex;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getZoomOutOnDataUpdate()
	 */
	@Override
	public Boolean getZoomOutOnDataUpdate()
	{
		return zoomOutOnDataUpdate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setZoomOutOnDataUpdate(java.lang.Boolean)
	 */
	@Override
	public void setZoomOutOnDataUpdate( Boolean zoomOutOnDataUpdate )
	{
		this.zoomOutOnDataUpdate = zoomOutOnDataUpdate;
	}
}
