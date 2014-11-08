package com.amcharts.jso;

import java.util.Date;

import com.amcharts.api.IsAmSerialChart;
import com.amcharts.api.IsCategoryAxis;

public class AmSerialChartJSO extends AmRectangularChartJSO implements IsAmSerialChart
{
	protected AmSerialChartJSO()
	{
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getCategoryAxis()
	 */
	@Override
	public final native IsCategoryAxis getCategoryAxis()
	/*-{
		return this.categoryAxis;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setCategoryAxis(com.amcharts.api.IsCategoryAxis)
	 */
	@Override
	public final native void setCategoryAxis( IsCategoryAxis categoryAxis )
	/*-{
		this.categoryAxis = categoryAxis;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getBalloonDateFormat()
	 */
	@Override
	public final native String getBalloonDateFormat()
	/*-{
		return this.balloonDateFormat;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setBalloonDateFormat(java.lang.String)
	 */
	@Override
	public final native void setBalloonDateFormat( String balloonDateFormat )
	/*-{
		this.balloonDateFormat = balloonDateFormat;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getCategoryField()
	 */
	@Override
	public final native String getCategoryField()
	/*-{
		return this.categoryField;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setCategoryField(java.lang.String)
	 */
	@Override
	public final native void setCategoryField( String categoryField )
	/*-{
		this.categoryField = categoryField;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getColumnSpacing()
	 */
	@Override
	public final native Number getColumnSpacing()
	/*-{
		return this.columnSpacing;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setColumnSpacing(java.lang.Number)
	 */
	@Override
	public final native void setColumnSpacing( Number columnSpacing )
	/*-{
		this.columnSpacing = columnSpacing;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getColumnSpacing3D()
	 */
	@Override
	public final native Number getColumnSpacing3D()
	/*-{
		return this.columnSpacing3D;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setColumnSpacing3D(java.lang.Number)
	 */
	@Override
	public final native void setColumnSpacing3D( Number columnSpacing3D )
	/*-{
		this.columnSpacing3D = columnSpacing3D;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getColumnWidth()
	 */
	@Override
	public final native Number getColumnWidth()
	/*-{
		return this.columnWidth;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setColumnWidth(java.lang.Number)
	 */
	@Override
	public final native void setColumnWidth( Number columnWidth )
	/*-{
		this.columnWidth = columnWidth;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getDataDateFormat()
	 */
	@Override
	public final native String getDataDateFormat()
	/*-{
		return this.dataDateFormat;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setDataDateFormat(java.lang.String)
	 */
	@Override
	public final native void setDataDateFormat( String dataDateFormat )
	/*-{
		this.dataDateFormat = dataDateFormat;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getEndDate()
	 */
	@Override
	public final native Date getEndDate()
	/*-{
		return this.endDate;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setEndDate(java.util.Date)
	 */
	@Override
	public final native void setEndDate( Date endDate )
	/*-{
		this.endDate = endDate;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getEndIndex()
	 */
	@Override
	public final native Number getEndIndex()
	/*-{
		return this.endIndex;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setEndIndex(java.lang.Number)
	 */
	@Override
	public final native void setEndIndex( Number endIndex )
	/*-{
		this.endIndex = endIndex;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMaxSelectedSeries()
	 */
	@Override
	public final native Number getMaxSelectedSeries()
	/*-{
		return this.maxSelectedSeries;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMaxSelectedSeries(java.lang.Number)
	 */
	@Override
	public final native void setMaxSelectedSeries( Number maxSelectedSeries )
	/*-{
		this.maxSelectedSeries = maxSelectedSeries;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMaxSelectedTime()
	 */
	@Override
	public final native Number getMaxSelectedTime()
	/*-{
		return this.maxSelectedTime;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMaxSelectedTime(java.lang.Number)
	 */
	@Override
	public final native void setMaxSelectedTime( Number maxSelectedTime )
	/*-{
		this.maxSelectedTime = maxSelectedTime;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMinSelectedTime()
	 */
	@Override
	public final native Number getMinSelectedTime()
	/*-{
		return this.minSelectedTime;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMinSelectedTime(java.lang.Number)
	 */
	@Override
	public final native void setMinSelectedTime( Number minSelectedTime )
	/*-{
		this.minSelectedTime = minSelectedTime;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMouseWheelScrollEnabled()
	 */
	@Override
	public final native Boolean getMouseWheelScrollEnabled()
	/*-{
		return this.mouseWheelScrollEnabled;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMouseWheelScrollEnabled(java.lang.Boolean)
	 */
	@Override
	public final native void setMouseWheelScrollEnabled( Boolean mouseWheelScrollEnabled )
	/*-{
		this.mouseWheelScrollEnabled = mouseWheelScrollEnabled;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getMouseWheelZoomEnabled()
	 */
	@Override
	public final native Boolean getMouseWheelZoomEnabled()
	/*-{
		return this.mouseWheelZoomEnabled;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setMouseWheelZoomEnabled(java.lang.Boolean)
	 */
	@Override
	public final native void setMouseWheelZoomEnabled( Boolean mouseWheelZoomEnabled )
	/*-{
		this.mouseWheelZoomEnabled = mouseWheelZoomEnabled;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getRotate()
	 */
	@Override
	public final native Boolean getRotate()
	/*-{
		return this.rotate;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setRotate(java.lang.Boolean)
	 */
	@Override
	public final native void setRotate( Boolean rotate )
	/*-{
		this.rotate = rotate;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getStartDate()
	 */
	@Override
	public final native Date getStartDate()
	/*-{
		return this.startDate;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setStartDate(java.util.Date)
	 */
	@Override
	public final native void setStartDate( Date startDate )
	/*-{
		this.startDate = startDate;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getStartIndex()
	 */
	@Override
	public final native Number getStartIndex()
	/*-{
		return this.startIndex;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setStartIndex(java.lang.Number)
	 */
	@Override
	public final native void setStartIndex( Number startIndex )
	/*-{
		this.startIndex = startIndex;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#getZoomOutOnDataUpdate()
	 */
	@Override
	public final native Boolean getZoomOutOnDataUpdate()
	/*-{
		return this.zoomOutOnDataUpdate;
	}-*/;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amcharts.json.IsAmSerialChart#setZoomOutOnDataUpdate(java.lang.Boolean)
	 */
	@Override
	public final native void setZoomOutOnDataUpdate( Boolean zoomOutOnDataUpdate )
	/*-{
		this.zoomOutOnDataUpdate = zoomOutOnDataUpdate;
	}-*/;
}