package com.amcharts.api;

import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;

public interface IsAmAngularChart
{

	/**
	 * Uses the whole space of the canvas to draw the gauge.
	 */
	public abstract boolean isAdjustSize();

	/**
	 * Uses the whole space of the canvas to draw the gauge.
	 */
	public abstract void setAdjustSize( boolean adjustSize );

	/**
	 * Array of arrows.
	 */
	public abstract List<IsGaugeArrow> getArrows();

	/**
	 * Array of arrows.
	 */
	public abstract void setArrows( List<IsGaugeArrow> arrows );

	/**
	 * Array of axes.
	 */
	public abstract List<IsGaugeAxis> getAxes();

	/**
	 * Array of axes.
	 */
	public abstract void setAxes( List<IsGaugeAxis> axes );

	/**
	 * In case you use gauge to create a clock, set this to true.
	 */
	public abstract boolean isClockWiseOnly();

	/**
	 * In case you use gauge to create a clock, set this to true.
	 */
	public abstract void setClockWiseOnly( boolean clockWiseOnly );

	/**
	 * Gauge face opacity.
	 */
	public abstract double getFaceAlpha();

	/**
	 * Gauge face opacity.
	 */
	public abstract void setFaceAlpha( double faceAlpha );

	/**
	 * Gauge face border opacity.
	 */
	public abstract double getFaceBorderAlpha();

	/**
	 * Gauge face border opacity.
	 */
	public abstract void setFaceBorderAlpha( double faceBorderAlpha );

	/**
	 * Gauge face border color.
	 */
	public abstract String getFaceBorderColor();

	/**
	 * Gauge face border color.
	 */
	public abstract void setFaceBorderColor( String faceBorderColor );

	/**
	 * Gauge face border width.
	 */
	public abstract double getFaceBorderWidth();

	/**
	 * Gauge face border width.
	 */
	public abstract void setFaceBorderWidth( double faceBorderWidth );

	/**
	 * Gauge face color, requires faceAlpha > 0
	 */
	public abstract String getFaceColor();

	/**
	 * Gauge face color, requires faceAlpha > 0
	 */
	public abstract void setFaceColor( String faceColor );

	/**
	 * "Gauge face image-pattern.Example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}"
	 */
	public abstract JavaScriptObject getFacePattern();

	/**
	 * "Gauge face image-pattern.Example: {'url':'../amcharts/patterns/black/pattern1.png', 'width':4, 'height':4}"
	 */
	public abstract void setFacePattern( JavaScriptObject facePattern );

	/**
	 * Gauge's horizontal position in pixel, origin is the center. Centered by default.
	 */
	public abstract double getGaugeX();

	/**
	 * Gauge's horizontal position in pixel, origin is the center. Centered by default.
	 */
	public abstract void setGaugeX( double gaugeX );

	/**
	 * Gauge's vertical position in pixel, origin is the center. Centered by default.
	 */
	public abstract double getGaugeY();

	/**
	 * Gauge's vertical position in pixel, origin is the center. Centered by default.
	 */
	public abstract void setGaugeY( double gaugeY );

	/**
	 * Bottom spacing between chart and container.
	 */
	public abstract double getMarginBottom();

	/**
	 * Bottom spacing between chart and container.
	 */
	public abstract void setMarginBottom( double marginBottom );

	/**
	 * Left-hand spacing between chart and container.
	 */
	public abstract double getMarginLeft();

	/**
	 * Left-hand spacing between chart and container.
	 */
	public abstract void setMarginLeft( double marginLeft );

	/**
	 * Right-hand spacing between chart and container.
	 */
	public abstract double getMarginRight();

	/**
	 * Right-hand spacing between chart and container.
	 */
	public abstract void setMarginRight( double marginRight );

	/**
	 * Top spacing between chart and container.
	 */
	public abstract double getMarginTop();

	/**
	 * Top spacing between chart and container.
	 */
	public abstract void setMarginTop( double marginTop );

	/**
	 * Minimum radius of a gauge.
	 */
	public abstract double getMinRadius();

	/**
	 * Minimum radius of a gauge.
	 */
	public abstract void setMinRadius( double minRadius );

	/**
	 * Duration of arrow animation.
	 */
	public abstract double getStartDuration();

	/**
	 * Duration of arrow animation.
	 */
	public abstract void setStartDuration( double startDuration );

	/**
	 * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
	 */
	public abstract String getStartEffect();

	/**
	 * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
	 */
	public abstract void setStartEffect( String startEffect );

}