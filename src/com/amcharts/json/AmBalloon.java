package com.amcharts.json;

import com.amcharts.api.IsAmBalloon;

public final class AmBalloon implements IsAmBalloon
{
	private boolean adjustBorderColor;

	private double animationDuration;

	private double borderAlpha;

	private String borderColor;

	private double borderThickness;

	private String color;

	private double cornerRadius;

	private double fadeOutDuration;

	private double fillAlpha;

	private String fillColor;

	private boolean fixedPosition;

	private double fontSize;

	private double horizontalPadding;

	private double maxWidth;

	private double offsetX;

	private double offsetY;

	private double pointerWidth;

	private double shadowAlpha;

	private String shadowColor;

	private boolean showBullet;

	private String textAlign;

	private double verticalPadding;

	/**
	 * "If this is set to true, border color instead of background color will be changed when user rolls-over the slice, graph, etc."
	 */
	public boolean isAdjustBorderColor()
	{
		return adjustBorderColor;
	}

	/**
	 * "If this is set to true, border color instead of background color will be changed when user rolls-over the slice, graph, etc."
	 */
	public void setAdjustBorderColor( boolean adjustBorderColor )
	{
		this.adjustBorderColor = adjustBorderColor;
	}

	/**
	 * "Duration of balloon movement from previous point to current point, in seconds."
	 */
	public double getAnimationDuration()
	{
		return animationDuration;
	}

	/**
	 * "Duration of balloon movement from previous point to current point, in seconds."
	 */
	public void setAnimationDuration( double animationDuration )
	{
		this.animationDuration = animationDuration;
	}

	/**
	 * Balloon border opacity. Value range is 0 - 1.
	 */
	public double getBorderAlpha()
	{
		return borderAlpha;
	}

	/**
	 * Balloon border opacity. Value range is 0 - 1.
	 */
	public void setBorderAlpha( double borderAlpha )
	{
		this.borderAlpha = borderAlpha;
	}

	/**
	 * Balloon border color. Will only be used of adjustBorderColor is false.
	 */
	public String getBorderColor()
	{
		return borderColor;
	}

	/**
	 * Balloon border color. Will only be used of adjustBorderColor is false.
	 */
	public void setBorderColor( String borderColor )
	{
		this.borderColor = borderColor;
	}

	/**
	 * Balloon border thickness.
	 */
	public double getBorderThickness()
	{
		return borderThickness;
	}

	/**
	 * Balloon border thickness.
	 */
	public void setBorderThickness( double borderThickness )
	{
		this.borderThickness = borderThickness;
	}

	/**
	 * Color of text in the balloon.
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Color of text in the balloon.
	 */
	public void setColor( String color )
	{
		this.color = color;
	}

	/**
	 * Balloon corner radius.
	 */
	public double getCornerRadius()
	{
		return cornerRadius;
	}

	/**
	 * Balloon corner radius.
	 */
	public void setCornerRadius( double cornerRadius )
	{
		this.cornerRadius = cornerRadius;
	}

	/**
	 * "Duration of a fade out animation, in seconds."
	 */
	public double getFadeOutDuration()
	{
		return fadeOutDuration;
	}

	/**
	 * "Duration of a fade out animation, in seconds."
	 */
	public void setFadeOutDuration( double fadeOutDuration )
	{
		this.fadeOutDuration = fadeOutDuration;
	}

	/**
	 * Balloon background opacity.
	 */
	public double getFillAlpha()
	{
		return fillAlpha;
	}

	/**
	 * Balloon background opacity.
	 */
	public void setFillAlpha( double fillAlpha )
	{
		this.fillAlpha = fillAlpha;
	}

	/**
	 * Balloon background color. Usually balloon background color is set by the chart. Only if 'adjustBorderColor' is 'true' this color will be used.
	 */
	public String getFillColor()
	{
		return fillColor;
	}

	/**
	 * Balloon background color. Usually balloon background color is set by the chart. Only if 'adjustBorderColor' is 'true' this color will be used.
	 */
	public void setFillColor( String fillColor )
	{
		this.fillColor = fillColor;
	}

	/**
	 * Specifies if balloon should follow mouse when hovering the slice/column/bullet or stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
	 */
	public boolean isFixedPosition()
	{
		return fixedPosition;
	}

	/**
	 * Specifies if balloon should follow mouse when hovering the slice/column/bullet or stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
	 */
	public void setFixedPosition( boolean fixedPosition )
	{
		this.fixedPosition = fixedPosition;
	}

	/**
	 * Size of text in the balloon. Chart's fontSize is used by default.
	 */
	public double getFontSize()
	{
		return fontSize;
	}

	/**
	 * Size of text in the balloon. Chart's fontSize is used by default.
	 */
	public void setFontSize( double fontSize )
	{
		this.fontSize = fontSize;
	}

	/**
	 * Horizontal padding of the balloon.
	 */
	public double getHorizontalPadding()
	{
		return horizontalPadding;
	}

	/**
	 * Horizontal padding of the balloon.
	 */
	public void setHorizontalPadding( double horizontalPadding )
	{
		this.horizontalPadding = horizontalPadding;
	}

	/**
	 * Maximum width of a balloon.
	 */
	public double getMaxWidth()
	{
		return maxWidth;
	}

	/**
	 * Maximum width of a balloon.
	 */
	public void setMaxWidth( double maxWidth )
	{
		this.maxWidth = maxWidth;
	}

	/**
	 * "Defines horizontal distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public double getOffsetX()
	{
		return offsetX;
	}

	/**
	 * "Defines horizontal distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public void setOffsetX( double offsetX )
	{
		this.offsetX = offsetX;
	}

	/**
	 * "Defines vertical distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public double getOffsetY()
	{
		return offsetY;
	}

	/**
	 * "Defines vertical distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public void setOffsetY( double offsetY )
	{
		this.offsetY = offsetY;
	}

	/**
	 * The width of the pointer (arrow) 'root'. Only used if cornerRadius is 0.
	 */
	public double getPointerWidth()
	{
		return pointerWidth;
	}

	/**
	 * The width of the pointer (arrow) 'root'. Only used if cornerRadius is 0.
	 */
	public void setPointerWidth( double pointerWidth )
	{
		this.pointerWidth = pointerWidth;
	}

	/**
	 * Opacity of a shadow.
	 */
	public double getShadowAlpha()
	{
		return shadowAlpha;
	}

	/**
	 * Opacity of a shadow.
	 */
	public void setShadowAlpha( double shadowAlpha )
	{
		this.shadowAlpha = shadowAlpha;
	}

	/**
	 * Color of a shadow.
	 */
	public String getShadowColor()
	{
		return shadowColor;
	}

	/**
	 * Color of a shadow.
	 */
	public void setShadowColor( String shadowColor )
	{
		this.shadowColor = shadowColor;
	}

	/**
	 * "If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used. If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false"
	 */
	public boolean isShowBullet()
	{
		return showBullet;
	}

	/**
	 * "If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used. If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false"
	 */
	public void setShowBullet( boolean showBullet )
	{
		this.showBullet = showBullet;
	}

	/**
	 * "Text alignment, possible values 'left', 'middle' and 'right'"
	 */
	public String getTextAlign()
	{
		return textAlign;
	}

	/**
	 * "Text alignment, possible values 'left', 'middle' and 'right'"
	 */
	public void setTextAlign( String textAlign )
	{
		this.textAlign = textAlign;
	}

	/**
	 * Vertical padding of the balloon.
	 */
	public double getVerticalPadding()
	{
		return verticalPadding;
	}

	/**
	 * Vertical padding of the balloon.
	 */
	public void setVerticalPadding( double verticalPadding )
	{
		this.verticalPadding = verticalPadding;
	}
}
