package com.amcharts.api;

public interface IsChartCursor
{

	double getAdjustment();

	void setAdjustment( double adjustment );

	double getAnimationDuration();

	void setAnimationDuration( double animationDuration );

	Boolean isAvoidBalloonOverlapping();

	void setAvoidBalloonOverlapping( Boolean avoidBalloonOverlapping );

	Boolean isBulletsEnabled();

	void setBulletsEnabled( Boolean bulletsEnabled );

	double getBulletSize();

	void setBulletSize( double bulletSize );

	double getCategoryBalloonAlpha();

	void setCategoryBalloonAlpha( double categoryBalloonAlpha );

	String getCategoryBalloonColor();

	void setCategoryBalloonColor( String categoryBalloonColor );

	String getCategoryBalloonDateFormat();

	void setCategoryBalloonDateFormat( String categoryBalloonDateFormat );

	Boolean isCategoryBalloonEnabled();

	void setCategoryBalloonEnabled( Boolean categoryBalloonEnabled );

	IsFunction getCategoryBalloonFunction();

	void setCategoryBalloonFunction( IsFunction categoryBalloonFunction );

	String getColor();

	void setColor( String color );

	double getCursorAlpha();

	void setCursorAlpha( double cursorAlpha );

	String getCursorColor();

	void setCursorColor( String cursorColor );

	String getCursorPosition();

	void setCursorPosition( String cursorPosition );

	Boolean isEnabled();

	void setEnabled( Boolean enabled );

	Boolean isFullWidth();

	void setFullWidth( Boolean fullWidth );

	double getGraphBulletAlpha();

	void setGraphBulletAlpha( double graphBulletAlpha );

	double getGraphBulletSize();

	void setGraphBulletSize( double graphBulletSize );

	Boolean isOneBalloonOnly();

	void setOneBalloonOnly( Boolean oneBalloonOnly );

	Boolean isPan();

	void setPan( Boolean pan );

	double getSelectionAlpha();

	void setSelectionAlpha( double selectionAlpha );

	Boolean isSelectWithoutZooming();

	void setSelectWithoutZooming( Boolean selectWithoutZooming );

	Boolean isShowNextAvailable();

	void setShowNextAvailable( Boolean showNextAvailable );

	Boolean isValueBalloonsEnabled();

	void setValueBalloonsEnabled( Boolean valueBalloonsEnabled );

	double getValueLineAlpha();

	void setValueLineAlpha( double valueLineAlpha );

	IsValueAxis getValueLineAxis();

	void setValueLineAxis( IsValueAxis valueLineAxis );

	Boolean isValueLineBalloonEnabled();

	void setValueLineBalloonEnabled( Boolean valueLineBalloonEnabled );

	Boolean isValueLineEnabled();

	void setValueLineEnabled( Boolean valueLineEnabled );

	Boolean isZoomable();

	void setZoomable( Boolean zoomable );

	Boolean isZooming();

	void setZooming( Boolean zooming );

}