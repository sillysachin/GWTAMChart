package com.amcharts.jso;

import com.amcharts.api.IsAmBalloon;
import com.google.gwt.core.client.JavaScriptObject;

public class AmBalloonJSO extends JavaScriptObject implements IsAmBalloon
{
	protected AmBalloonJSO()
	{
	}
	
	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#isAdjustBorderColor()
	 */
	@Override
	public final native boolean isAdjustBorderColor()
	/*-{
		return this.adjustBorderColor;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setAdjustBorderColor(boolean)
	 */
	@Override
	public final native void setAdjustBorderColor( boolean adjustBorderColor )
	/*-{
		this.adjustBorderColor = adjustBorderColor;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getAnimationDuration()
	 */
	@Override
	public final native double getAnimationDuration()
	/*-{
		return this.animationDuration;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setAnimationDuration(double)
	 */
	@Override
	public final native void setAnimationDuration( double animationDuration )
	/*-{
		this.animationDuration = animationDuration;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getBorderAlpha()
	 */
	@Override
	public final native double getBorderAlpha()
	/*-{
		return this.borderAlpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setBorderAlpha(double)
	 */
	@Override
	public final native void setBorderAlpha( double borderAlpha )
	/*-{
		this.borderAlpha = borderAlpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getBorderColor()
	 */
	@Override
	public final native String getBorderColor()
	/*-{
		return this.borderColor;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setBorderColor(java.lang.String)
	 */
	@Override
	public final native void setBorderColor( String borderColor )
	/*-{
		this.borderColor = borderColor;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getBorderThickness()
	 */
	@Override
	public final native double getBorderThickness()
	/*-{
		return this.borderThickness;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setBorderThickness(double)
	 */
	@Override
	public final native void setBorderThickness( double borderThickness )
	/*-{
		this.borderThickness = borderThickness;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getColor()
	 */
	@Override
	public final native String getColor()
	/*-{
		return this.color;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setColor(java.lang.String)
	 */
	@Override
	public final native void setColor( String color )
	/*-{
		this.color = color;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getCornerRadius()
	 */
	@Override
	public final native double getCornerRadius()
	/*-{
		return this.cornerRadius;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setCornerRadius(double)
	 */
	@Override
	public final native void setCornerRadius( double cornerRadius )
	/*-{
		this.cornerRadius = cornerRadius;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getFadeOutDuration()
	 */
	@Override
	public final native double getFadeOutDuration()
	/*-{
		return this.fadeOutDuration;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFadeOutDuration(double)
	 */
	@Override
	public final native void setFadeOutDuration( double fadeOutDuration )
	/*-{
		this.fadeOutDuration = fadeOutDuration;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getFillAlpha()
	 */
	@Override
	public final native double getFillAlpha()
	/*-{
		return this.fillAlpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFillAlpha(double)
	 */
	@Override
	public final native void setFillAlpha( double fillAlpha )
	/*-{
		this.fillAlpha = fillAlpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getFillColor()
	 */
	@Override
	public final native String getFillColor()
	/*-{
		return this.fillColor;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFillColor(java.lang.String)
	 */
	@Override
	public final native void setFillColor( String fillColor )
	/*-{
		this.fillColor = fillColor;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#isFixedPosition()
	 */
	@Override
	public final native boolean isFixedPosition()
	/*-{
		return this.fixedPosition;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFixedPosition(boolean)
	 */
	@Override
	public final native void setFixedPosition( boolean fixedPosition )
	/*-{
		this.fixedPosition = fixedPosition;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getFontSize()
	 */
	@Override
	public final native double getFontSize()
	/*-{
		return this.fontSize;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setFontSize(double)
	 */
	@Override
	public final native void setFontSize( double fontSize )
	/*-{
		this.fontSize = fontSize;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getHorizontalPadding()
	 */
	@Override
	public final native double getHorizontalPadding()
	/*-{
		return this.horizontalPadding;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setHorizontalPadding(double)
	 */
	@Override
	public final native void setHorizontalPadding( double horizontalPadding )
	/*-{
		this.horizontalPadding = horizontalPadding;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getMaxWidth()
	 */
	@Override
	public final native double getMaxWidth()
	/*-{
		return this.maxWidth;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setMaxWidth(double)
	 */
	@Override
	public final native void setMaxWidth( double maxWidth )
	/*-{
		this.maxWidth = maxWidth;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getOffsetX()
	 */
	@Override
	public final native double getOffsetX()
	/*-{
		return this.offsetX;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setOffsetX(double)
	 */
	@Override
	public final native void setOffsetX( double offsetX )
	/*-{
		this.offsetX = offsetX;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getOffsetY()
	 */
	@Override
	public final native double getOffsetY()
	/*-{
		return this.offsetY;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setOffsetY(double)
	 */
	@Override
	public final native void setOffsetY( double offsetY )
	/*-{
		this.offsetY = offsetY;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getPointerWidth()
	 */
	@Override
	public final native double getPointerWidth()
	/*-{
		return this.pointerWidth;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setPointerWidth(double)
	 */
	@Override
	public final native void setPointerWidth( double pointerWidth )
	/*-{
		this.pointerWidth = pointerWidth;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getShadowAlpha()
	 */
	@Override
	public final native double getShadowAlpha()
	/*-{
		return this.shadowAlpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setShadowAlpha(double)
	 */
	@Override
	public final native void setShadowAlpha( double shadowAlpha )
	/*-{
		this.shadowAlpha = shadowAlpha;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getShadowColor()
	 */
	@Override
	public final native double getShadowColor()
	/*-{
		return this.shadowColor;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setShadowColor(double)
	 */
	@Override
	public final native void setShadowColor( double shadowColor )
	/*-{
		this.shadowColor = shadowColor;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#isShowBullet()
	 */
	@Override
	public final native boolean isShowBullet()
	/*-{
		return this.showBullet;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setShowBullet(boolean)
	 */
	@Override
	public final native void setShowBullet( boolean showBullet )
	/*-{
		this.showBullet = showBullet;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getTextAlign()
	 */
	@Override
	public final native String getTextAlign()
	/*-{
		return this.textAlign;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setTextAlign(java.lang.String)
	 */
	@Override
	public final native void setTextAlign( String textAlign )
	/*-{
		this.textAlign = textAlign;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#getVerticalPadding()
	 */
	@Override
	public final native double getVerticalPadding()
	/*-{
		return this.verticalPadding;
	}-*/;

	/* (non-Javadoc)
	 * @see com.amcharts.json.IsAmBalloon#setVerticalPadding(double)
	 */
	@Override
	public final native void setVerticalPadding( double verticalPadding )
	/*-{
		this.verticalPadding = verticalPadding;
	}-*/;
}