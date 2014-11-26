package com.amcharts.api;

public interface IsAmBalloon
{
	/**
	 * "If this is set to true, border color instead of background color will be changed when user rolls-over the slice, graph, etc."
	 */
	public Boolean isAdjustBorderColor();

	/**
	 * "If this is set to true, border color instead of background color will be changed when user rolls-over the slice, graph, etc."
	 */
	public void setAdjustBorderColor( Boolean adjustBorderColor );

	/**
	 * "Duration of balloon movement from previous point to current point, in seconds."
	 */
	public double getAnimationDuration();

	/**
	 * "Duration of balloon movement from previous point to current point, in seconds."
	 */
	public void setAnimationDuration( double animationDuration );

	/**
	 * Balloon border opacity. Value range is 0 - 1.
	 */
	public double getBorderAlpha();

	/**
	 * Balloon border opacity. Value range is 0 - 1.
	 */
	public void setBorderAlpha( double borderAlpha );

	/**
	 * Balloon border color. Will only be used of adjustBorderColor is false.
	 */
	public String getBorderColor();

	/**
	 * Balloon border color. Will only be used of adjustBorderColor is false.
	 */
	public void setBorderColor( String borderColor );

	/**
	 * Balloon border thickness.
	 */
	public double getBorderThickness();

	/**
	 * Balloon border thickness.
	 */
	public void setBorderThickness( double borderThickness );

	/**
	 * Color of text in the balloon.
	 */
	public String getColor();

	/**
	 * Color of text in the balloon.
	 */
	public void setColor( String color );

	/**
	 * Balloon corner radius.
	 */
	public double getCornerRadius();

	/**
	 * Balloon corner radius.
	 */
	public void setCornerRadius( double cornerRadius );

	/**
	 * "Duration of a fade out animation, in seconds."
	 */
	public double getFadeOutDuration();

	/**
	 * "Duration of a fade out animation, in seconds."
	 */
	public void setFadeOutDuration( double fadeOutDuration );

	/**
	 * Balloon background opacity.
	 */
	public double getFillAlpha();

	/**
	 * Balloon background opacity.
	 */
	public void setFillAlpha( double fillAlpha );

	/**
	 * Balloon background color. Usually balloon background color is set by the chart. Only if 'adjustBorderColor' is 'true' this color will be used.
	 */
	public String getFillColor();

	/**
	 * Balloon background color. Usually balloon background color is set by the chart. Only if 'adjustBorderColor' is 'true' this color will be used.
	 */
	public void setFillColor( String fillColor );

	/**
	 * Specifies if balloon should follow mouse when hovering the slice/column/bullet or stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
	 */
	public Boolean isFixedPosition();

	/**
	 * Specifies if balloon should follow mouse when hovering the slice/column/bullet or stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
	 */
	public void setFixedPosition( Boolean fixedPosition );

	/**
	 * Size of text in the balloon. Chart's fontSize is used by default.
	 */
	public double getFontSize();

	/**
	 * Size of text in the balloon. Chart's fontSize is used by default.
	 */
	public void setFontSize( double fontSize );

	/**
	 * Horizontal padding of the balloon.
	 */
	public double getHorizontalPadding();

	/**
	 * Horizontal padding of the balloon.
	 */
	public void setHorizontalPadding( double horizontalPadding );

	/**
	 * Maximum width of a balloon.
	 */
	public double getMaxWidth();

	/**
	 * Maximum width of a balloon.
	 */
	public void setMaxWidth( double maxWidth );

	/**
	 * "Defines horizontal distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public double getOffsetX();

	/**
	 * "Defines horizontal distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public void setOffsetX( double offsetX );

	/**
	 * "Defines vertical distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public double getOffsetY();

	/**
	 * "Defines vertical distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public void setOffsetY( double offsetY );

	/**
	 * The width of the pointer (arrow) 'root'. Only used if cornerRadius is 0.
	 */
	public double getPointerWidth();

	/**
	 * The width of the pointer (arrow) 'root'. Only used if cornerRadius is 0.
	 */
	public void setPointerWidth( double pointerWidth );

	/**
	 * Opacity of a shadow.
	 */
	public double getShadowAlpha();

	/**
	 * Opacity of a shadow.
	 */
	public void setShadowAlpha( double shadowAlpha );

	/**
	 * Color of a shadow.
	 */
	public String getShadowColor();

	/**
	 * Color of a shadow.
	 */
	public void setShadowColor( String shadowColor );

	/**
	 * "If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used. If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false"
	 */
	public Boolean isShowBullet();

	/**
	 * "If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used. If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false"
	 */
	public void setShowBullet( Boolean showBullet );

	/**
	 * "Text alignment, possible values 'left', 'middle' and 'right'"
	 */
	public String getTextAlign();

	/**
	 * "Text alignment, possible values 'left', 'middle' and 'right'"
	 */
	public void setTextAlign( String textAlign );

	/**
	 * Vertical padding of the balloon.
	 */
	public double getVerticalPadding();

	/**
	 * Vertical padding of the balloon.
	 */
	public void setVerticalPadding( double verticalPadding );
}
