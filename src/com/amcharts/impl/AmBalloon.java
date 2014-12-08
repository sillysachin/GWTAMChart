package com.amcharts.impl;

import com.amcharts.api.IsAmBalloon;
import com.amcharts.jso.AmBalloonJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;
import com.google.gwt.core.client.JavaScriptObject;

public final class AmBalloon implements IJavaScriptWrapper<AmBalloonJSO>, IsAmBalloon
{
	private AmBalloonJSO jso;

	protected AmBalloon()
	{
		setJso( ( AmBalloonJSO ) JavaScriptObject.createObject() );
	}

	public AmBalloonJSO getJso()
	{
		return this.jso;
	}

	public void setJso( AmBalloonJSO jso )
	{
		this.jso = jso;
	}

	public native AmBalloonJSO createJso() /*-{
		return new $wnd.AmCharts.AmBalloon();
	}-*/;

	/**
	 * "If this is set to true, border color instead of background color will be changed when user rolls-over the slice, graph, etc."
	 */
	public final native Boolean isAdjustBorderColor() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.adjustBorderColor;
	}-*/;

	/**
	 * "If this is set to true, border color instead of background color will be changed when user rolls-over the slice, graph, etc."
	 */
	public final native void setAdjustBorderColor( Boolean adjustBorderColor ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.adjustBorderColor = adjustBorderColor;
	}-*/;

	/**
	 * "Duration of balloon movement from previous point to current point, in seconds."
	 */
	public final native double getAnimationDuration() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.animationDuration;
	}-*/;

	/**
	 * "Duration of balloon movement from previous point to current point, in seconds."
	 */
	public final native void setAnimationDuration( double animationDuration ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.animationDuration = animationDuration;
	}-*/;

	/**
	 * Balloon border opacity. Value range is 0 - 1.
	 */
	public final native double getBorderAlpha() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.borderAlpha;
	}-*/;

	/**
	 * Balloon border opacity. Value range is 0 - 1.
	 */
	public final native void setBorderAlpha( double borderAlpha ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.borderAlpha = borderAlpha;
	}-*/;

	/**
	 * Balloon border color. Will only be used of adjustBorderColor is false.
	 */
	public final native String getBorderColor() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.borderColor;
	}-*/;

	/**
	 * Balloon border color. Will only be used of adjustBorderColor is false.
	 */
	public final native void setBorderColor( String borderColor ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.borderColor = borderColor;
	}-*/;

	/**
	 * Balloon border thickness.
	 */
	public final native double getBorderThickness() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.borderThickness;
	}-*/;

	/**
	 * Balloon border thickness.
	 */
	public final native void setBorderThickness( double borderThickness ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.borderThickness = borderThickness;
	}-*/;

	/**
	 * Color of text in the balloon.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.color;
	}-*/;

	/**
	 * Color of text in the balloon.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.color = color;
	}-*/;

	/**
	 * Balloon corner radius.
	 */
	public final native double getCornerRadius() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.cornerRadius;
	}-*/;

	/**
	 * Balloon corner radius.
	 */
	public final native void setCornerRadius( double cornerRadius ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.cornerRadius = cornerRadius;
	}-*/;

	/**
	 * "Duration of a fade out animation, in seconds."
	 */
	public final native double getFadeOutDuration() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.fadeOutDuration;
	}-*/;

	/**
	 * "Duration of a fade out animation, in seconds."
	 */
	public final native void setFadeOutDuration( double fadeOutDuration ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.fadeOutDuration = fadeOutDuration;
	}-*/;

	/**
	 * Balloon background opacity.
	 */
	public final native double getFillAlpha() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.fillAlpha;
	}-*/;

	/**
	 * Balloon background opacity.
	 */
	public final native void setFillAlpha( double fillAlpha ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.fillAlpha = fillAlpha;
	}-*/;

	/**
	 * Balloon background color. Usually balloon background color is set by the chart. Only if 'adjustBorderColor' is 'true' this color will be used.
	 */
	public final native String getFillColor() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.fillColor;
	}-*/;

	/**
	 * Balloon background color. Usually balloon background color is set by the chart. Only if 'adjustBorderColor' is 'true' this color will be used.
	 */
	public final native void setFillColor( String fillColor ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.fillColor = fillColor;
	}-*/;

	/**
	 * Specifies if balloon should follow mouse when hovering the slice/column/bullet or stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
	 */
	public final native Boolean isFixedPosition() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.fixedPosition;
	}-*/;

	/**
	 * Specifies if balloon should follow mouse when hovering the slice/column/bullet or stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
	 */
	public final native void setFixedPosition( Boolean fixedPosition ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.fixedPosition = fixedPosition;
	}-*/;

	/**
	 * Size of text in the balloon. Chart's fontSize is used by default.
	 */
	public final native double getFontSize() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.fontSize;
	}-*/;

	/**
	 * Size of text in the balloon. Chart's fontSize is used by default.
	 */
	public final native void setFontSize( double fontSize ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.fontSize = fontSize;
	}-*/;

	/**
	 * Horizontal padding of the balloon.
	 */
	public final native double getHorizontalPadding() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.horizontalPadding;
	}-*/;

	/**
	 * Horizontal padding of the balloon.
	 */
	public final native void setHorizontalPadding( double horizontalPadding ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.horizontalPadding = horizontalPadding;
	}-*/;

	/**
	 * Maximum width of a balloon.
	 */
	public final native double getMaxWidth() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.maxWidth;
	}-*/;

	/**
	 * Maximum width of a balloon.
	 */
	public final native void setMaxWidth( double maxWidth ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.maxWidth = maxWidth;
	}-*/;

	/**
	 * "Defines horizontal distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public final native double getOffsetX() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.offsetX;
	}-*/;

	/**
	 * "Defines horizontal distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public final native void setOffsetX( double offsetX ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.offsetX = offsetX;
	}-*/;

	/**
	 * "Defines vertical distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public final native double getOffsetY() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.offsetY;
	}-*/;

	/**
	 * "Defines vertical distance from mouse pointer to balloon pointer. If you set it to a small value, the balloon might flicker, as mouse might lose focus on hovered object."
	 */
	public final native void setOffsetY( double offsetY ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.offsetY = offsetY;
	}-*/;

	/**
	 * The width of the pointer (arrow) 'root'. Only used if cornerRadius is 0.
	 */
	public final native double getPointerWidth() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.pointerWidth;
	}-*/;

	/**
	 * The width of the pointer (arrow) 'root'. Only used if cornerRadius is 0.
	 */
	public final native void setPointerWidth( double pointerWidth ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.pointerWidth = pointerWidth;
	}-*/;

	/**
	 * Opacity of a shadow.
	 */
	public final native double getShadowAlpha() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.shadowAlpha;
	}-*/;

	/**
	 * Opacity of a shadow.
	 */
	public final native void setShadowAlpha( double shadowAlpha ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.shadowAlpha = shadowAlpha;
	}-*/;

	/**
	 * Color of a shadow.
	 */
	public final native String getShadowColor() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.shadowColor;
	}-*/;

	/**
	 * Color of a shadow.
	 */
	public final native void setShadowColor( String shadowColor ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.shadowColor = shadowColor;
	}-*/;

	/**
	 * "If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used. If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false"
	 */
	public final native Boolean isShowBullet() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.showBullet;
	}-*/;

	/**
	 * "If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used. If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false"
	 */
	public final native void setShowBullet( Boolean showBullet ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.showBullet = showBullet;
	}-*/;

	/**
	 * "Text alignment, possible values 'left', 'middle' and 'right'"
	 */
	public final native String getTextAlign() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.textAlign;
	}-*/;

	/**
	 * "Text alignment, possible values 'left', 'middle' and 'right'"
	 */
	public final native void setTextAlign( String textAlign ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.textAlign = textAlign;
	}-*/;

	/**
	 * Vertical padding of the balloon.
	 */
	public final native double getVerticalPadding() /*-{
		return this.@com.amcharts.impl.AmBalloon::jso.verticalPadding;
	}-*/;

	/**
	 * Vertical padding of the balloon.
	 */
	public final native void setVerticalPadding( double verticalPadding ) /*-{
		this.@com.amcharts.impl.AmBalloon::jso.verticalPadding = verticalPadding;
	}-*/;

	/**
	 * Hides balloon.
	 */
	public native void hide()
	/*-{
		var ballon = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		ballon.hide();
	}-*/;

	/**
	 * Specifies the text which should be displayed.
	 */
	public native void show( String value )
	/*-{
		var ballon = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		ballon.show(value);
	}-*/;

	/**
	 * Sets coordinates the balloon should point to.
	 */
	public native void setPosition( double x, double y )
	/*-{
		var ballon = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		ballon.setPosition(x, y);
	}-*/;

	/**
	 * Defines a square within which the balloon should appear. Bounds are set by chart class, you don't need to call this method yourself.
	 */
	public native void setBounds( double left, double top, double right, double bottom )
	/*-{
		var ballon = @com.amcharts.impl.util.WrapperUtils::unwrap(Lcom/google/gwt/core/client/IJavaScriptWrapper;)(this);
		ballon.setBounds(left, top, right, bottom);
	}-*/;
}