package com.amcharts.jso;

import java.util.List;

import com.amcharts.api.IsAmAngularChart;
import com.amcharts.api.IsFacePattern;
import com.amcharts.api.IsGaugeArrow;
import com.amcharts.api.IsGaugeAxis;

public final class AmAngularGaugeJSO extends AmChartJSO implements IsAmAngularChart
{
	protected AmAngularGaugeJSO()
	{
	}

	/**
	 * Uses the whole space of the canvas to draw the gauge.
	 */
	public final native Boolean isAdjustSize() /*-{
		return this.adjustSize;
	}-*/;

	/**
	 * Uses the whole space of the canvas to draw the gauge.
	 */
	public final native void setAdjustSize( Boolean adjustSize ) /*-{
		this.adjustSize = adjustSize;
	}-*/;

	/**
	 * Array of arrows.
	 */
	public final native List<IsGaugeArrow> getArrows() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.arrows);
	}-*/;

	/**
	 * Array of arrows.
	 */
	public final native void setArrows( List<IsGaugeArrow> arrows ) /*-{
		this.arrows = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(arrows);
	}-*/;

	/**
	 * Array of axes.
	 */
	public final native List<IsGaugeAxis> getAxes() /*-{
		return @com.amcharts.impl.util.WrapperUtils::getList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.axes);
	}-*/;

	/**
	 * Array of axes.
	 */
	public final native void setAxes( List<IsGaugeAxis> axes ) /*-{
		this.axes = @com.amcharts.impl.util.WrapperUtils::getArray(Ljava/util/List;)(axes);
	}-*/;

	/**
	 * In case you use gauge to create a clock, set this to true.
	 */
	public final native Boolean isClockWiseOnly() /*-{
		return this.clockWiseOnly;
	}-*/;

	/**
	 * In case you use gauge to create a clock, set this to true.
	 */
	public final native void setClockWiseOnly( Boolean clockWiseOnly ) /*-{
		this.clockWiseOnly = clockWiseOnly;
	}-*/;

	/**
	 * Gauge face opacity.
	 */
	public final native double getFaceAlpha() /*-{
		return this.faceAlpha;
	}-*/;

	/**
	 * Gauge face opacity.
	 */
	public final native void setFaceAlpha( double faceAlpha ) /*-{
		this.faceAlpha = faceAlpha;
	}-*/;

	/**
	 * Gauge face border opacity.
	 */
	public final native double getFaceBorderAlpha() /*-{
		return this.faceBorderAlpha;
	}-*/;

	/**
	 * Gauge face border opacity.
	 */
	public final native void setFaceBorderAlpha( double faceBorderAlpha ) /*-{
		this.faceBorderAlpha = faceBorderAlpha;
	}-*/;

	/**
	 * Gauge face border color.
	 */
	public final native String getFaceBorderColor() /*-{
		return this.faceBorderColor;
	}-*/;

	/**
	 * Gauge face border color.
	 */
	public final native void setFaceBorderColor( String faceBorderColor ) /*-{
		this.faceBorderColor = faceBorderColor;
	}-*/;

	/**
	 * Gauge face border width.
	 */
	public final native double getFaceBorderWidth() /*-{
		return this.faceBorderWidth;
	}-*/;

	/**
	 * Gauge face border width.
	 */
	public final native void setFaceBorderWidth( double faceBorderWidth ) /*-{
		this.faceBorderWidth = faceBorderWidth;
	}-*/;

	/**
	 * Gauge face color, requires faceAlpha > 0
	 */
	public final native String getFaceColor() /*-{
		return this.faceColor;
	}-*/;

	/**
	 * Gauge face color, requires faceAlpha > 0
	 */
	public final native void setFaceColor( String faceColor ) /*-{
		this.faceColor = faceColor;
	}-*/;

	/**
	 * "Gauge face image-pattern.Example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}"
	 */
	public final native IsFacePattern getFacePattern() /*-{
		return this.facePattern;
	}-*/;

	/**
	 * "Gauge face image-pattern.Example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}"
	 */
	public final native void setFacePattern( IsFacePattern facePattern ) /*-{
		this.facePattern = facePattern;
	}-*/;

	/**
	 * Gauge's horizontal position in pixel, origin is the center. Centered by default.
	 */
	public final native double getGaugeX() /*-{
		return this.gaugeX;
	}-*/;

	/**
	 * Gauge's horizontal position in pixel, origin is the center. Centered by default.
	 */
	public final native void setGaugeX( double gaugeX ) /*-{
		this.gaugeX = gaugeX;
	}-*/;

	/**
	 * Gauge's vertical position in pixel, origin is the center. Centered by default.
	 */
	public final native double getGaugeY() /*-{
		return this.gaugeY;
	}-*/;

	/**
	 * Gauge's vertical position in pixel, origin is the center. Centered by default.
	 */
	public final native void setGaugeY( double gaugeY ) /*-{
		this.gaugeY = gaugeY;
	}-*/;

	/**
	 * Bottom spacing between chart and container.
	 */
	public final native double getMarginBottom() /*-{
		return this.marginBottom;
	}-*/;

	/**
	 * Bottom spacing between chart and container.
	 */
	public final native void setMarginBottom( double marginBottom ) /*-{
		this.marginBottom = marginBottom;
	}-*/;

	/**
	 * Left-hand spacing between chart and container.
	 */
	public final native double getMarginLeft() /*-{
		return this.marginLeft;
	}-*/;

	/**
	 * Left-hand spacing between chart and container.
	 */
	public final native void setMarginLeft( double marginLeft ) /*-{
		this.marginLeft = marginLeft;
	}-*/;

	/**
	 * Right-hand spacing between chart and container.
	 */
	public final native double getMarginRight() /*-{
		return this.marginRight;
	}-*/;

	/**
	 * Right-hand spacing between chart and container.
	 */
	public final native void setMarginRight( double marginRight ) /*-{
		this.marginRight = marginRight;
	}-*/;

	/**
	 * Top spacing between chart and container.
	 */
	public final native double getMarginTop() /*-{
		return this.marginTop;
	}-*/;

	/**
	 * Top spacing between chart and container.
	 */
	public final native void setMarginTop( double marginTop ) /*-{
		this.marginTop = marginTop;
	}-*/;

	/**
	 * Minimum radius of a gauge.
	 */
	public final native double getMinRadius() /*-{
		return this.minRadius;
	}-*/;

	/**
	 * Minimum radius of a gauge.
	 */
	public final native void setMinRadius( double minRadius ) /*-{
		this.minRadius = minRadius;
	}-*/;

	/**
	 * Duration of arrow animation.
	 */
	public final native double getStartDuration() /*-{
		return this.startDuration;
	}-*/;

	/**
	 * Duration of arrow animation.
	 */
	public final native void setStartDuration( double startDuration ) /*-{
		this.startDuration = startDuration;
	}-*/;

	/**
	 * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
	 */
	public final native String getStartEffect() /*-{
		return this.startEffect;
	}-*/;

	/**
	 * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
	 */
	public final native void setStartEffect( String startEffect ) /*-{
		this.startEffect = startEffect;
	}-*/;
}
