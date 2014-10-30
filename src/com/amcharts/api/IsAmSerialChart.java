package com.amcharts.api;

import java.util.Date;

import com.amcharts.json.CategoryAxis;

public interface IsAmSerialChart
{
	Double getAngle();

	void setAngle( Double angle );

	CategoryAxis getCategoryAxis();

	void setCategoryAxis( CategoryAxis categoryAxis );

	String getBalloonDateFormat();

	void setBalloonDateFormat( String balloonDateFormat );

	String getCategoryField();

	void setCategoryField( String categoryField );

	Number getColumnSpacing();

	void setColumnSpacing( Number columnSpacing );

	Number getColumnSpacing3D();

	void setColumnSpacing3D( Number columnSpacing3D );

	Number getColumnWidth();

	void setColumnWidth( Number columnWidth );

	String getDataDateFormat();

	void setDataDateFormat( String dataDateFormat );

	Date getEndDate();

	void setEndDate( Date endDate );

	Number getEndIndex();

	void setEndIndex( Number endIndex );

	Number getMaxSelectedSeries();

	void setMaxSelectedSeries( Number maxSelectedSeries );

	Number getMaxSelectedTime();

	void setMaxSelectedTime( Number maxSelectedTime );

	Number getMinSelectedTime();

	void setMinSelectedTime( Number minSelectedTime );

	Boolean getMouseWheelScrollEnabled();

	void setMouseWheelScrollEnabled( Boolean mouseWheelScrollEnabled );

	Boolean getMouseWheelZoomEnabled();

	void setMouseWheelZoomEnabled( Boolean mouseWheelZoomEnabled );

	Boolean getRotate();

	void setRotate( Boolean rotate );

	Date getStartDate();

	void setStartDate( Date startDate );

	Number getStartIndex();

	void setStartIndex( Number startIndex );

	Boolean getZoomOutOnDataUpdate();

	void setZoomOutOnDataUpdate( Boolean zoomOutOnDataUpdate );
}