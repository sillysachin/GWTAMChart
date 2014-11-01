package com.amcharts.impl;

import com.amcharts.api.IsAmBalloon;
import com.amcharts.jso.AmBalloonJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public class AmBalloon implements IsAmBalloon, IJavaScriptWrapper<AmBalloonJSO>
{
	private AmBalloonJSO jso;

	public AmBalloon()
	{
		setJso( ( AmBalloonJSO ) JavaScriptObject.createObject() );
	}

	@Override
	public AmBalloonJSO getJso()
	{
		return this.jso;
	}

	@Override
	public void setJso( AmBalloonJSO jso )
	{
		this.jso = jso;
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#isAdjustBorderColor()
	 */
	@Override
	public boolean isAdjustBorderColor()
	{
		return getJso().isAdjustBorderColor();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setAdjustBorderColor(boolean)
	 */
	@Override
	public void setAdjustBorderColor( boolean adjustBorderColor )
	{
		getJso().setAdjustBorderColor( adjustBorderColor );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getAnimationDuration()
	 */
	@Override
	public double getAnimationDuration()
	{
		return getJso().getAnimationDuration();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setAnimationDuration(double)
	 */
	@Override
	public void setAnimationDuration( double animationDuration )
	{
		getJso().setAnimationDuration( animationDuration );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getBorderAlpha()
	 */
	@Override
	public double getBorderAlpha()
	{
		return getJso().getBorderAlpha();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setBorderAlpha(double)
	 */
	@Override
	public void setBorderAlpha( double borderAlpha )
	{
		getJso().setBorderAlpha( borderAlpha );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getBorderColor()
	 */
	@Override
	public String getBorderColor()
	{
		return getJso().getBorderColor();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setBorderColor(java.lang.String)
	 */
	@Override
	public void setBorderColor( String borderColor )
	{
		getJso().setBorderColor( borderColor );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getBorderThickness()
	 */
	@Override
	public double getBorderThickness()
	{
		return getJso().getBorderThickness();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setBorderThickness(double)
	 */
	@Override
	public void setBorderThickness( double borderThickness )
	{
		getJso().setBorderThickness( borderThickness );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getColor()
	 */
	@Override
	public String getColor()
	{
		return getJso().getColor();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setColor(java.lang.String)
	 */
	@Override
	public void setColor( String color )
	{
		getJso().setColor( color );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getCornerRadius()
	 */
	@Override
	public double getCornerRadius()
	{
		return getJso().getCornerRadius();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setCornerRadius(double)
	 */
	@Override
	public void setCornerRadius( double cornerRadius )
	{
		getJso().setCornerRadius( cornerRadius );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getFadeOutDuration()
	 */
	@Override
	public double getFadeOutDuration()
	{
		return getJso().getFadeOutDuration();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFadeOutDuration(double)
	 */
	@Override
	public void setFadeOutDuration( double fadeOutDuration )
	{
		getJso().setFadeOutDuration( fadeOutDuration );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getFillAlpha()
	 */
	@Override
	public double getFillAlpha()
	{
		return getJso().getFillAlpha();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFillAlpha(double)
	 */
	@Override
	public void setFillAlpha( double fillAlpha )
	{
		getJso().setFillAlpha( fillAlpha );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getFillColor()
	 */
	@Override
	public String getFillColor()
	{
		return getJso().getFillColor();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFillColor(java.lang.String)
	 */
	@Override
	public void setFillColor( String fillColor )
	{
		getJso().setFillColor( fillColor );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#isFixedPosition()
	 */
	@Override
	public boolean isFixedPosition()
	{
		return getJso().isFixedPosition();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFixedPosition(boolean)
	 */
	@Override
	public void setFixedPosition( boolean fixedPosition )
	{
		getJso().setFixedPosition( fixedPosition );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getFontSize()
	 */
	@Override
	public double getFontSize()
	{
		return getJso().getFontSize();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFontSize(double)
	 */
	@Override
	public void setFontSize( double fontSize )
	{
		getJso().setFontSize( fontSize );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getHorizontalPadding()
	 */
	@Override
	public double getHorizontalPadding()
	{
		return getJso().getHorizontalPadding();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setHorizontalPadding(double)
	 */
	@Override
	public void setHorizontalPadding( double horizontalPadding )
	{
		getJso().setHorizontalPadding( horizontalPadding );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getMaxWidth()
	 */
	@Override
	public double getMaxWidth()
	{
		return getJso().getMaxWidth();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setMaxWidth(double)
	 */
	@Override
	public void setMaxWidth( double maxWidth )
	{
		getJso().setMaxWidth( maxWidth );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getOffsetX()
	 */
	@Override
	public double getOffsetX()
	{
		return getJso().getOffsetX();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setOffsetX(double)
	 */
	@Override
	public void setOffsetX( double offsetX )
	{
		getJso().setOffsetX( offsetX );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getOffsetY()
	 */
	@Override
	public double getOffsetY()
	{
		return getJso().getOffsetY();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setOffsetY(double)
	 */
	@Override
	public void setOffsetY( double offsetY )
	{
		getJso().setOffsetY( offsetY );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getPointerWidth()
	 */
	@Override
	public double getPointerWidth()
	{
		return getJso().getPointerWidth();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setPointerWidth(double)
	 */
	@Override
	public void setPointerWidth( double pointerWidth )
	{
		getJso().setPointerWidth( pointerWidth );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getShadowAlpha()
	 */
	@Override
	public double getShadowAlpha()
	{
		return getJso().getShadowAlpha();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setShadowAlpha(double)
	 */
	@Override
	public void setShadowAlpha( double shadowAlpha )
	{
		getJso().setShadowAlpha( shadowAlpha );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getShadowColor()
	 */
	@Override
	public double getShadowColor()
	{
		return getJso().getShadowColor();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setShadowColor(double)
	 */
	@Override
	public void setShadowColor( double shadowColor )
	{
		getJso().setShadowColor( shadowColor );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#isShowBullet()
	 */
	@Override
	public boolean isShowBullet()
	{
		return getJso().isShowBullet();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setShowBullet(boolean)
	 */
	@Override
	public void setShowBullet( boolean showBullet )
	{
		getJso().setShowBullet( showBullet );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getTextAlign()
	 */
	@Override
	public String getTextAlign()
	{
		return getJso().getTextAlign();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setTextAlign(java.lang.String)
	 */
	@Override
	public void setTextAlign( String textAlign )
	{
		getJso().setTextAlign( textAlign );
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getVerticalPadding()
	 */
	@Override
	public double getVerticalPadding()
	{
		return getJso().getVerticalPadding();
	}

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setVerticalPadding(double)
	 */
	@Override
	public void setVerticalPadding( double verticalPadding )
	{
		getJso().setVerticalPadding( verticalPadding );
	}
}