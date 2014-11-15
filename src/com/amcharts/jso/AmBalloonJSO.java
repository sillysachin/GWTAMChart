package com.amcharts.jso;

import com.amcharts.api.IsAmBalloon;
import com.google.gwt.core.client.JavaScriptObject;

public final class AmBalloonJSO extends JavaScriptObject implements IsAmBalloon
{
	protected AmBalloonJSO()
	{
	}

	/**
	 * "If this is set to true, border color instead of background color will be changed when user rolls-over the slice, graph, etc."
	 */
	public final native boolean isAdjustBorderColor() /*-{
		return adjustBorderColor;
	}-*/;

	/**
	 * "If this is set to true, border color instead of background color will be changed when user rolls-over the slice, graph, etc."
	 */
	public final native void setAdjustBorderColor( boolean adjustBorderColor ) /*-{
		this.adjustBorderColor = adjustBorderColor;
	}-*/;

	/**
	 * "Duration of balloon movement from previous point to current point, in seconds."
	 */
	public final native double getAnimationDuration() /*-{
		return animationDuration;
	}-*/;

	/**
	 * "Duration of balloon movement from previous point to current point, in seconds."
	 */
	public final native void setAnimationDuration( double animationDuration ) /*-{
		this.animationDuration = animationDuration;
	}-*/;

	/**
	 * Balloon border opacity. Value range is 0 - 1.
	 */
	public final native double getBorderAlpha() /*-{
		return borderAlpha;
	}-*/;

	/**
	 * Balloon border opacity. Value range is 0 - 1.
	 */
	public final native void setBorderAlpha( double borderAlpha ) /*-{
		this.borderAlpha = borderAlpha;
	}-*/;

	/**
	 * Balloon border color. Will only be used of adjustBorderColor is false.
	 */
	public final native String getBorderColor() /*-{
		return borderColor;
	}-*/;

	/**
	 * Balloon border color. Will only be used of adjustBorderColor is false.
	 */
	public final native void setBorderColor( String borderColor ) /*-{
		this.borderColor = borderColor;
	}-*/;

	/**
	 * Balloon border thickness.
	 */
	public final native double getBorderThickness() /*-{
		return borderThickness;
	}-*/;

	/**
	 * Balloon border thickness.
	 */
	public final native void setBorderThickness( double borderThickness ) /*-{
		this.borderThickness = borderThickness;
	}-*/;

	/**
	 * Color of text in the balloon.
	 */
	public final native String getColor() /*-{
		return color;
	}-*/;

	/**
	 * Color of text in the balloon.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * Balloon corner radius.
	 */
	public final native double getCornerRadius() /*-{
		return cornerRadius;
	}-*/;

	/**
	 * Balloon corner radius.
	 */
	public final native void setCornerRadius( double cornerRadius ) /*-{
		this.cornerRadius = cornerRadius;
	}-*/;

	/**
	 * "Duration of a fade out animation, in seconds."
	 */
	public final native double getFadeOutDuration() /*-{
		return fadeOutDuration;
	}-*/;

	/**
	 * "Duration of a fade out animation, in seconds."
	 */
	public final native void setFadeOutDuration( double fadeOutDuration ) /*-{
		this.fadeOutDuration = fadeOutDuration;
	}-*/;

	/**
	 * Balloon background opacity.
	 */
	public final native double getFillAlpha() /*-{
		return fillAlpha;
	}-*/;

	/**
	 * Balloon background opacity.
	 */
	public final native void setFillAlpha( double fillAlpha ) /*-{
		this.fillAlpha = fillAlpha;
	}-*/;

	/**
	 * Balloon background color. Usually balloon background color is set by the chart. Only if 'adjustBorderColor' is 'true' this color will be used.
	 */
	public final native String getFillColor() /*-{
		return fillColor;
	}-*/;

	/**
	 * Balloon background color. Usually balloon background color is set by the chart. Only if 'adjustBorderColor' is 'true' this color will be used.
	 */
	public final native void setFillColor( String fillColor ) /*-{
		this.fillColor = fillColor;
	}-*/;

	/**
	 * Specifies if balloon should follow mouse when hovering the slice/column/bullet or stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
	 */
	public final native boolean isFixedPosition() /*-{
		return fixedPosition;
	}-*/;

	/**
	 * Specifies if balloon should follow mouse when hovering the slice/column/bullet or stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
	 */
	public final native void setFixedPosition( boolean fixedPosition ) /*-{
		this.fixedPosition = fixedPosition;
	}-*/;

	/**
	 * Size of text in the balloon. Chart's fontSize is used by default.
	 */
	public final native double getFontSize() /*-{
		return fontSize;
	}-*/;

	/**
	 * Size of text in the balloon. Chart's fontSize is used by default.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.fontSize = fontSize;
	}-*/;

	/**
	 * Horizontal padding of the balloon.
	 */
	public final native double getHorizontalPadding() /*-{
		return horizontalPadding;
	}-*/;

	/**
	 * Horizontal padding of the balloon.
	 */
	public final native void setHorizontalPadding( double horizontalPadding ) /*-{
		this.horizontalPadding = horizontalPadding;
	}-*/;

	/**
	 * Maximum width of a balloon.
	 */
	public final native double getMaxWidth() /*-{
		return maxWidth;
	}-*/;

	/**
	 * Maximum width of a balloon.
	 */
	public final native void setMaxWidth( double maxWidth ) /*-{
		this.maxWidth = maxWidth;
	}-*/;

	/**
	 * "Defines horizontal distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public final native double getOffsetX() /*-{
		return offsetX;
	}-*/;

	/**
	 * "Defines horizontal distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public final native void setOffsetX( double offsetX ) /*-{
		this.offsetX = offsetX;
	}-*/;

	/**
	 * "Defines vertical distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public final native double getOffsetY() /*-{
		return offsetY;
	}-*/;

	/**
	 * "Defines vertical distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public final native void setOffsetY( double offsetY ) /*-{
		this.offsetY = offsetY;
	}-*/;

	/**
	 * The width of the pointer (arrow) 'root'. Only used if cornerRadius is 0.
	 */
	public final native double getPointerWidth() /*-{
		return pointerWidth;
	}-*/;

	/**
	 * The width of the pointer (arrow) 'root'. Only used if cornerRadius is 0.
	 */
	public final native void setPointerWidth( double pointerWidth ) /*-{
		this.pointerWidth = pointerWidth;
	}-*/;

	/**
	 * Opacity of a shadow.
	 */
	public final native double getShadowAlpha() /*-{
		return shadowAlpha;
	}-*/;

	/**
	 * Opacity of a shadow.
	 */
	public final native void setShadowAlpha( double shadowAlpha ) /*-{
		this.shadowAlpha = shadowAlpha;
	}-*/;

	/**
	 * Color of a shadow.
	 */
	public final native String getShadowColor() /*-{
		return shadowColor;
	}-*/;

	/**
	 * Color of a shadow.
	 */
	public final native void setShadowColor( String shadowColor ) /*-{
		this.shadowColor = shadowColor;
	}-*/;

	/**
	 * "If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used. If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false"
	 */
	public final native boolean isShowBullet() /*-{
		return showBullet;
	}-*/;

	/**
	 * "If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used. If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false"
	 */
	public final native void setShowBullet( boolean showBullet ) /*-{
		this.showBullet = showBullet;
	}-*/;

	/**
	 * "Text alignment, possible values 'left', 'middle' and 'right'"
	 */
	public final native String getTextAlign() /*-{
		return textAlign;
	}-*/;

	/**
	 * "Text alignment, possible values 'left', 'middle' and 'right'"
	 */
	public final native void setTextAlign( String textAlign ) /*-{
		this.textAlign = textAlign;
	}-*/;

	/**
	 * Vertical padding of the balloon.
	 */
	public final native double getVerticalPadding() /*-{
		return verticalPadding;
	}-*/;

	/**
	 * Vertical padding of the balloon.
	 */
	public final native void setVerticalPadding( double verticalPadding ) /*-{
		this.verticalPadding = verticalPadding;
	}-*/;
}
