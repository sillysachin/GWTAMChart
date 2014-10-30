package com.amcharts.api;

import java.util.Date;

import com.amcharts.json.CategoryAxis;

public interface IsAmSerialChart
{

	public abstract CategoryAxis getCategoryAxis();

	public abstract void setCategoryAxis( CategoryAxis categoryAxis );

	public abstract String getBalloonDateFormat();

	public abstract void setBalloonDateFormat( String balloonDateFormat );

	public abstract String getCategoryField();

	public abstract void setCategoryField( String categoryField );

	public abstract Number getColumnSpacing();

	public abstract void setColumnSpacing( Number columnSpacing );

	public abstract Number getColumnSpacing3D();

	public abstract void setColumnSpacing3D( Number columnSpacing3D );

	public abstract Number getColumnWidth();

	public abstract void setColumnWidth( Number columnWidth );

	public abstract String getDataDateFormat();

	public abstract void setDataDateFormat( String dataDateFormat );

	public abstract Date getEndDate();

	public abstract void setEndDate( Date endDate );

	public abstract Number getEndIndex();

	public abstract void setEndIndex( Number endIndex );

	public abstract Number getMaxSelectedSeries();

	public abstract void setMaxSelectedSeries( Number maxSelectedSeries );

	public abstract Number getMaxSelectedTime();

	public abstract void setMaxSelectedTime( Number maxSelectedTime );

	public abstract Number getMinSelectedTime();

	public abstract void setMinSelectedTime( Number minSelectedTime );

	public abstract Boolean getMouseWheelScrollEnabled();

	public abstract void setMouseWheelScrollEnabled( Boolean mouseWheelScrollEnabled );

	public abstract Boolean getMouseWheelZoomEnabled();

	public abstract void setMouseWheelZoomEnabled( Boolean mouseWheelZoomEnabled );

	public abstract Boolean getRotate();

	public abstract void setRotate( Boolean rotate );

	public abstract Date getStartDate();

	public abstract void setStartDate( Date startDate );

	public abstract Number getStartIndex();

	public abstract void setStartIndex( Number startIndex );

	public abstract Boolean getZoomOutOnDataUpdate();

	public abstract void setZoomOutOnDataUpdate( Boolean zoomOutOnDataUpdate );

}