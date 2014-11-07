package com.amcharts.api;

public interface IsChartCursor
{

	double getAdjustment();

	void setAdjustment( double adjustment );

	double getAnimationDuration();

	void setAnimationDuration( double animationDuration );

	boolean isAvoidBalloonOverlapping();

	void setAvoidBalloonOverlapping( boolean avoidBalloonOverlapping );

	boolean isBulletsEnabled();

	void setBulletsEnabled( boolean bulletsEnabled );

	double getBulletSize();

	void setBulletSize( double bulletSize );

	double getCategoryBalloonAlpha();

	void setCategoryBalloonAlpha( double categoryBalloonAlpha );

	String getCategoryBalloonColor();

	void setCategoryBalloonColor( String categoryBalloonColor );

	String getCategoryBalloonDateFormat();

	void setCategoryBalloonDateFormat( String categoryBalloonDateFormat );

	boolean isCategoryBalloonEnabled();

	void setCategoryBalloonEnabled( boolean categoryBalloonEnabled );

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

	boolean isEnabled();

	void setEnabled( boolean enabled );

	boolean isFullWidth();

	void setFullWidth( boolean fullWidth );

	double getGraphBulletAlpha();

	void setGraphBulletAlpha( double graphBulletAlpha );

	double getGraphBulletSize();

	void setGraphBulletSize( double graphBulletSize );

	boolean isOneBalloonOnly();

	void setOneBalloonOnly( boolean oneBalloonOnly );

	boolean isPan();

	void setPan( boolean pan );

	double getSelectionAlpha();

	void setSelectionAlpha( double selectionAlpha );

	boolean isSelectWithoutZooming();

	void setSelectWithoutZooming( boolean selectWithoutZooming );

	boolean isShowNextAvailable();

	void setShowNextAvailable( boolean showNextAvailable );

	boolean isValueBalloonsEnabled();

	void setValueBalloonsEnabled( boolean valueBalloonsEnabled );

	double getValueLineAlpha();

	void setValueLineAlpha( double valueLineAlpha );

	IsValueAxis getValueLineAxis();

	void setValueLineAxis( IsValueAxis valueLineAxis );

	boolean isValueLineBalloonEnabled();

	void setValueLineBalloonEnabled( boolean valueLineBalloonEnabled );

	boolean isValueLineEnabled();

	void setValueLineEnabled( boolean valueLineEnabled );

	boolean isZoomable();

	void setZoomable( boolean zoomable );

	boolean isZooming();

	void setZooming( boolean zooming );

}