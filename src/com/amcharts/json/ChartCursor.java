package com.amcharts.json;

import com.amcharts.api.IsChartCursor;
import com.amcharts.api.IsFunction;
import com.amcharts.api.IsValueAxis;

public class ChartCursor implements IsChartCursor
{
	private double adjustment;

	private double animationDuration;

	private boolean avoidBalloonOverlapping;

	private boolean bulletsEnabled;

	private double bulletSize;

	private double categoryBalloonAlpha;

	private String categoryBalloonColor;

	private String categoryBalloonDateFormat;

	private boolean categoryBalloonEnabled;

	private IsFunction categoryBalloonFunction;

	private String color;

	private double cursorAlpha;

	private String cursorColor;

	private String cursorPosition;

	private boolean enabled;

	private boolean fullWidth;

	private double graphBulletAlpha;

	private double graphBulletSize;

	private boolean oneBalloonOnly;

	private boolean pan;

	private double selectionAlpha;

	private boolean selectWithoutZooming;

	private boolean showNextAvailable;

	private boolean valueBalloonsEnabled;

	private double valueLineAlpha;

	private IsValueAxis valueLineAxis;

	private boolean valueLineBalloonEnabled;

	private boolean valueLineEnabled;

	private boolean zoomable;

	private boolean zooming;

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
	public boolean isAvoidBalloonOverlapping()
	{
		return avoidBalloonOverlapping;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setAvoidBalloonOverlapping(boolean)
	 */
	@Override
	public void setAvoidBalloonOverlapping( boolean avoidBalloonOverlapping )
	{
		this.avoidBalloonOverlapping = avoidBalloonOverlapping;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isBulletsEnabled()
	 */
	@Override
	public boolean isBulletsEnabled()
	{
		return bulletsEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setBulletsEnabled(boolean)
	 */
	@Override
	public void setBulletsEnabled( boolean bulletsEnabled )
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
	public boolean isCategoryBalloonEnabled()
	{
		return categoryBalloonEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setCategoryBalloonEnabled(boolean)
	 */
	@Override
	public void setCategoryBalloonEnabled( boolean categoryBalloonEnabled )
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
	public boolean isEnabled()
	{
		return enabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setEnabled(boolean)
	 */
	@Override
	public void setEnabled( boolean enabled )
	{
		this.enabled = enabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isFullWidth()
	 */
	@Override
	public boolean isFullWidth()
	{
		return fullWidth;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setFullWidth(boolean)
	 */
	@Override
	public void setFullWidth( boolean fullWidth )
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
	public boolean isOneBalloonOnly()
	{
		return oneBalloonOnly;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setOneBalloonOnly(boolean)
	 */
	@Override
	public void setOneBalloonOnly( boolean oneBalloonOnly )
	{
		this.oneBalloonOnly = oneBalloonOnly;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isPan()
	 */
	@Override
	public boolean isPan()
	{
		return pan;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setPan(boolean)
	 */
	@Override
	public void setPan( boolean pan )
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
	public boolean isSelectWithoutZooming()
	{
		return selectWithoutZooming;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setSelectWithoutZooming(boolean)
	 */
	@Override
	public void setSelectWithoutZooming( boolean selectWithoutZooming )
	{
		this.selectWithoutZooming = selectWithoutZooming;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isShowNextAvailable()
	 */
	@Override
	public boolean isShowNextAvailable()
	{
		return showNextAvailable;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setShowNextAvailable(boolean)
	 */
	@Override
	public void setShowNextAvailable( boolean showNextAvailable )
	{
		this.showNextAvailable = showNextAvailable;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isValueBalloonsEnabled()
	 */
	@Override
	public boolean isValueBalloonsEnabled()
	{
		return valueBalloonsEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setValueBalloonsEnabled(boolean)
	 */
	@Override
	public void setValueBalloonsEnabled( boolean valueBalloonsEnabled )
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
	public boolean isValueLineBalloonEnabled()
	{
		return valueLineBalloonEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setValueLineBalloonEnabled(boolean)
	 */
	@Override
	public void setValueLineBalloonEnabled( boolean valueLineBalloonEnabled )
	{
		this.valueLineBalloonEnabled = valueLineBalloonEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isValueLineEnabled()
	 */
	@Override
	public boolean isValueLineEnabled()
	{
		return valueLineEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setValueLineEnabled(boolean)
	 */
	@Override
	public void setValueLineEnabled( boolean valueLineEnabled )
	{
		this.valueLineEnabled = valueLineEnabled;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isZoomable()
	 */
	@Override
	public boolean isZoomable()
	{
		return zoomable;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setZoomable(boolean)
	 */
	@Override
	public void setZoomable( boolean zoomable )
	{
		this.zoomable = zoomable;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#isZooming()
	 */
	@Override
	public boolean isZooming()
	{
		return zooming;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsChartCursor#setZooming(boolean)
	 */
	@Override
	public void setZooming( boolean zooming )
	{
		this.zooming = zooming;
	}
}