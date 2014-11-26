package com.amcharts.json;

import com.amcharts.api.IsChartCursor;
import com.amcharts.api.IsFunction;
import com.amcharts.api.IsValueAxis;

public class ChartCursor implements IsChartCursor
{
	private double adjustment;

	private double animationDuration;

	private Boolean avoidBalloonOverlapping;

	private Boolean bulletsEnabled;

	private double bulletSize;

	private double categoryBalloonAlpha;

	private String categoryBalloonColor;

	private String categoryBalloonDateFormat;

	private Boolean categoryBalloonEnabled;

	private IsFunction categoryBalloonFunction;

	private String color;

	private double cursorAlpha;

	private String cursorColor;

	private String cursorPosition;

	private Boolean enabled;

	private Boolean fullWidth;

	private double graphBulletAlpha;

	private double graphBulletSize;

	private Boolean oneBalloonOnly;

	private Boolean pan;

	private double selectionAlpha;

	private Boolean selectWithoutZooming;

	private Boolean showNextAvailable;

	private Boolean valueBalloonsEnabled;

	private double valueLineAlpha;

	private IsValueAxis valueLineAxis;

	private Boolean valueLineBalloonEnabled;

	private Boolean valueLineEnabled;

	private Boolean zoomable;

	private Boolean zooming;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getAdjustment()
	 */
	@Override
	public double getAdjustment()
	{
		return adjustment;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setAdjustment(double)
	 */
	@Override
	public void setAdjustment( double adjustment )
	{
		this.adjustment = adjustment;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getAnimationDuration()
	 */
	@Override
	public double getAnimationDuration()
	{
		return animationDuration;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setAnimationDuration(double)
	 */
	@Override
	public void setAnimationDuration( double animationDuration )
	{
		this.animationDuration = animationDuration;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isAvoidBalloonOverlapping()
	 */
	@Override
	public Boolean isAvoidBalloonOverlapping()
	{
		return avoidBalloonOverlapping;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setAvoidBalloonOverlapping(Boolean)
	 */
	@Override
	public void setAvoidBalloonOverlapping( Boolean avoidBalloonOverlapping )
	{
		this.avoidBalloonOverlapping = avoidBalloonOverlapping;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isBulletsEnabled()
	 */
	@Override
	public Boolean isBulletsEnabled()
	{
		return bulletsEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setBulletsEnabled(Boolean)
	 */
	@Override
	public void setBulletsEnabled( Boolean bulletsEnabled )
	{
		this.bulletsEnabled = bulletsEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getBulletSize()
	 */
	@Override
	public double getBulletSize()
	{
		return bulletSize;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setBulletSize(double)
	 */
	@Override
	public void setBulletSize( double bulletSize )
	{
		this.bulletSize = bulletSize;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getCategoryBalloonAlpha()
	 */
	@Override
	public double getCategoryBalloonAlpha()
	{
		return categoryBalloonAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCategoryBalloonAlpha(double)
	 */
	@Override
	public void setCategoryBalloonAlpha( double categoryBalloonAlpha )
	{
		this.categoryBalloonAlpha = categoryBalloonAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getCategoryBalloonColor()
	 */
	@Override
	public String getCategoryBalloonColor()
	{
		return categoryBalloonColor;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCategoryBalloonColor(java.lang.String)
	 */
	@Override
	public void setCategoryBalloonColor( String categoryBalloonColor )
	{
		this.categoryBalloonColor = categoryBalloonColor;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getCategoryBalloonDateFormat()
	 */
	@Override
	public String getCategoryBalloonDateFormat()
	{
		return categoryBalloonDateFormat;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCategoryBalloonDateFormat(java.lang.String)
	 */
	@Override
	public void setCategoryBalloonDateFormat( String categoryBalloonDateFormat )
	{
		this.categoryBalloonDateFormat = categoryBalloonDateFormat;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isCategoryBalloonEnabled()
	 */
	@Override
	public Boolean isCategoryBalloonEnabled()
	{
		return categoryBalloonEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCategoryBalloonEnabled(Boolean)
	 */
	@Override
	public void setCategoryBalloonEnabled( Boolean categoryBalloonEnabled )
	{
		this.categoryBalloonEnabled = categoryBalloonEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getCategoryBalloonFunction()
	 */
	@Override
	public IsFunction getCategoryBalloonFunction()
	{
		return categoryBalloonFunction;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCategoryBalloonFunction(java.lang.String)
	 */
	@Override
	public void setCategoryBalloonFunction( IsFunction categoryBalloonFunction )
	{
		this.categoryBalloonFunction = categoryBalloonFunction;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getColor()
	 */
	@Override
	public String getColor()
	{
		return color;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setColor(java.lang.String)
	 */
	@Override
	public void setColor( String color )
	{
		this.color = color;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getCursorAlpha()
	 */
	@Override
	public double getCursorAlpha()
	{
		return cursorAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCursorAlpha(double)
	 */
	@Override
	public void setCursorAlpha( double cursorAlpha )
	{
		this.cursorAlpha = cursorAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getCursorColor()
	 */
	@Override
	public String getCursorColor()
	{
		return cursorColor;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCursorColor(java.lang.String)
	 */
	@Override
	public void setCursorColor( String cursorColor )
	{
		this.cursorColor = cursorColor;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getCursorPosition()
	 */
	@Override
	public String getCursorPosition()
	{
		return cursorPosition;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCursorPosition(java.lang.String)
	 */
	@Override
	public void setCursorPosition( String cursorPosition )
	{
		this.cursorPosition = cursorPosition;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isEnabled()
	 */
	@Override
	public Boolean isEnabled()
	{
		return enabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setEnabled(Boolean)
	 */
	@Override
	public void setEnabled( Boolean enabled )
	{
		this.enabled = enabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isFullWidth()
	 */
	@Override
	public Boolean isFullWidth()
	{
		return fullWidth;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setFullWidth(Boolean)
	 */
	@Override
	public void setFullWidth( Boolean fullWidth )
	{
		this.fullWidth = fullWidth;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getGraphBulletAlpha()
	 */
	@Override
	public double getGraphBulletAlpha()
	{
		return graphBulletAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setGraphBulletAlpha(double)
	 */
	@Override
	public void setGraphBulletAlpha( double graphBulletAlpha )
	{
		this.graphBulletAlpha = graphBulletAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getGraphBulletSize()
	 */
	@Override
	public double getGraphBulletSize()
	{
		return graphBulletSize;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setGraphBulletSize(double)
	 */
	@Override
	public void setGraphBulletSize( double graphBulletSize )
	{
		this.graphBulletSize = graphBulletSize;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isOneBalloonOnly()
	 */
	@Override
	public Boolean isOneBalloonOnly()
	{
		return oneBalloonOnly;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setOneBalloonOnly(Boolean)
	 */
	@Override
	public void setOneBalloonOnly( Boolean oneBalloonOnly )
	{
		this.oneBalloonOnly = oneBalloonOnly;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isPan()
	 */
	@Override
	public Boolean isPan()
	{
		return pan;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setPan(Boolean)
	 */
	@Override
	public void setPan( Boolean pan )
	{
		this.pan = pan;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getSelectionAlpha()
	 */
	@Override
	public double getSelectionAlpha()
	{
		return selectionAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setSelectionAlpha(double)
	 */
	@Override
	public void setSelectionAlpha( double selectionAlpha )
	{
		this.selectionAlpha = selectionAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isSelectWithoutZooming()
	 */
	@Override
	public Boolean isSelectWithoutZooming()
	{
		return selectWithoutZooming;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setSelectWithoutZooming(Boolean)
	 */
	@Override
	public void setSelectWithoutZooming( Boolean selectWithoutZooming )
	{
		this.selectWithoutZooming = selectWithoutZooming;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isShowNextAvailable()
	 */
	@Override
	public Boolean isShowNextAvailable()
	{
		return showNextAvailable;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setShowNextAvailable(Boolean)
	 */
	@Override
	public void setShowNextAvailable( Boolean showNextAvailable )
	{
		this.showNextAvailable = showNextAvailable;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isValueBalloonsEnabled()
	 */
	@Override
	public Boolean isValueBalloonsEnabled()
	{
		return valueBalloonsEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setValueBalloonsEnabled(Boolean)
	 */
	@Override
	public void setValueBalloonsEnabled( Boolean valueBalloonsEnabled )
	{
		this.valueBalloonsEnabled = valueBalloonsEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getValueLineAlpha()
	 */
	@Override
	public double getValueLineAlpha()
	{
		return valueLineAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setValueLineAlpha(double)
	 */
	@Override
	public void setValueLineAlpha( double valueLineAlpha )
	{
		this.valueLineAlpha = valueLineAlpha;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#getValueLineAxis()
	 */
	@Override
	public IsValueAxis getValueLineAxis()
	{
		return valueLineAxis;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setValueLineAxis(com.amcharts.api.IsValueAxis)
	 */
	@Override
	public void setValueLineAxis( IsValueAxis valueLineAxis )
	{
		this.valueLineAxis = valueLineAxis;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isValueLineBalloonEnabled()
	 */
	@Override
	public Boolean isValueLineBalloonEnabled()
	{
		return valueLineBalloonEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setValueLineBalloonEnabled(Boolean)
	 */
	@Override
	public void setValueLineBalloonEnabled( Boolean valueLineBalloonEnabled )
	{
		this.valueLineBalloonEnabled = valueLineBalloonEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isValueLineEnabled()
	 */
	@Override
	public Boolean isValueLineEnabled()
	{
		return valueLineEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setValueLineEnabled(Boolean)
	 */
	@Override
	public void setValueLineEnabled( Boolean valueLineEnabled )
	{
		this.valueLineEnabled = valueLineEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isZoomable()
	 */
	@Override
	public Boolean isZoomable()
	{
		return zoomable;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setZoomable(Boolean)
	 */
	@Override
	public void setZoomable( Boolean zoomable )
	{
		this.zoomable = zoomable;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isZooming()
	 */
	@Override
	public Boolean isZooming()
	{
		return zooming;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setZooming(Boolean)
	 */
	@Override
	public void setZooming( Boolean zooming )
	{
		this.zooming = zooming;
	}
}