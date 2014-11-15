package com.amcharts.jso;

import com.amcharts.api.IsGaugeBand;
import com.google.gwt.core.client.JavaScriptObject;

public final class GaugeBandJSO extends JavaScriptObject implements IsGaugeBand
{
	protected GaugeBandJSO()
	{
	}

	/**
	 * Opacity of band fill. Will use axis.bandAlpha if not set any.
	 */
	public final native double getAlpha() /*-{
		return alpha;
	}-*/;

	/**
	 * Opacity of band fill. Will use axis.bandAlpha if not set any.
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.alpha = alpha;
	}-*/;

	/**
	 * "When rolled-over, band will display balloon if you set some text for this property."
	 */
	public final native String getBalloonText() /*-{
		return balloonText;
	}-*/;

	/**
	 * "When rolled-over, band will display balloon if you set some text for this property."
	 */
	public final native void setBalloonText( String balloonText ) /*-{
		this.balloonText = balloonText;
	}-*/;

	/**
	 * Color of a band.
	 */
	public final native String getColor() /*-{
		return color;
	}-*/;

	/**
	 * Color of a band.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * End value of a fill.
	 */
	public final native double getEndValue() /*-{
		return endValue;
	}-*/;

	/**
	 * End value of a fill.
	 */
	public final native void setEndValue( double endValue ) /*-{
		this.endValue = endValue;
	}-*/;

	/**
	 * Unique id of a band.
	 */
	public final native String getId() /*-{
		return id;
	}-*/;

	/**
	 * Unique id of a band.
	 */
	public final native void setId( String id ) /*-{
		this.id = id;
	}-*/;

	/**
	 * "Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band to be drawn to the axis center."
	 */
	public final native String getInnerRadius() /*-{
		return innerRadius;
	}-*/;

	/**
	 * "Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band to be drawn to the axis center."
	 */
	public final native void setInnerRadius( String innerRadius ) /*-{
		this.innerRadius = innerRadius;
	}-*/;

	/**
	 * "Band radius. If not set any, the band will start with the axis outline."
	 */
	public final native String getRadius() /*-{
		return radius;
	}-*/;

	/**
	 * "Band radius. If not set any, the band will start with the axis outline."
	 */
	public final native void setRadius( String radius ) /*-{
		this.radius = radius;
	}-*/;

	/**
	 * Start value of a fill.
	 */
	public final native double getStartValue() /*-{
		return startValue;
	}-*/;

	/**
	 * Start value of a fill.
	 */
	public final native void setStartValue( double startValue ) /*-{
		this.startValue = startValue;
	}-*/;
}