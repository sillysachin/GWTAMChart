package com.amcharts.impl;

import com.amcharts.api.IsGuageBand;
import com.amcharts.jso.GuageBandJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class GuageBand implements IJavaScriptWrapper<GuageBandJSO>, IsGuageBand
{
	private GuageBandJSO jso;

	public GuageBand()
	{
		jso = createJso();
	}

	public GuageBandJSO getJso()
	{
		return this.jso;
	}

	public void setJso( GuageBandJSO jso )
	{
		this.jso = jso;
	}

	public native GuageBandJSO createJso() /*-{
		return this.jso;
	}-*/;

	/**
	 * Opacity of band fill. Will use axis.bandAlpha if not set any.
	 */
	public final native double getAlpha() /*-{
		return this.@com.amcharts.impl.GuageBand::jso.alpha;
	}-*/;

	/**
	 * Opacity of band fill. Will use axis.bandAlpha if not set any.
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.@com.amcharts.impl.GuageBand::jso.alpha = alpha;
	}-*/;

	/**
	 * "When rolled-over, band will display balloon if you set some text for this property."
	 */
	public final native String getBalloonText() /*-{
		return this.@com.amcharts.impl.GuageBand::jso.balloonText;
	}-*/;

	/**
	 * "When rolled-over, band will display balloon if you set some text for this property."
	 */
	public final native void setBalloonText( String balloonText ) /*-{
		this.@com.amcharts.impl.GuageBand::jso.balloonText = balloonText;
	}-*/;

	/**
	 * Color of a band.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.GuageBand::jso.color;
	}-*/;

	/**
	 * Color of a band.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.GuageBand::jso.color = color;
	}-*/;

	/**
	 * End value of a fill.
	 */
	public final native double getEndValue() /*-{
		return this.@com.amcharts.impl.GuageBand::jso.endValue;
	}-*/;

	/**
	 * End value of a fill.
	 */
	public final native void setEndValue( double endValue ) /*-{
		this.@com.amcharts.impl.GuageBand::jso.endValue = endValue;
	}-*/;

	/**
	 * Unique id of a band.
	 */
	public final native String getId() /*-{
		return this.@com.amcharts.impl.GuageBand::jso.id;
	}-*/;

	/**
	 * Unique id of a band.
	 */
	public final native void setId( String id ) /*-{
		this.@com.amcharts.impl.GuageBand::jso.id = id;
	}-*/;

	/**
	 * "Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band to be drawn to the axis center."
	 */
	public final native String getInnerRadius() /*-{
		return this.@com.amcharts.impl.GuageBand::jso.innerRadius;
	}-*/;

	/**
	 * "Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band to be drawn to the axis center."
	 */
	public final native void setInnerRadius( String innerRadius ) /*-{
		this.@com.amcharts.impl.GuageBand::jso.innerRadius = innerRadius;
	}-*/;

	/**
	 * "Band radius. If not set any, the band will start with the axis outline."
	 */
	public final native String getRadius() /*-{
		return this.@com.amcharts.impl.GuageBand::jso.radius;
	}-*/;

	/**
	 * "Band radius. If not set any, the band will start with the axis outline."
	 */
	public final native void setRadius( String radius ) /*-{
		this.@com.amcharts.impl.GuageBand::jso.radius = radius;
	}-*/;

	/**
	 * Start value of a fill.
	 */
	public final native double getStartValue() /*-{
		return this.@com.amcharts.impl.GuageBand::jso.startValue;
	}-*/;

	/**
	 * Start value of a fill.
	 */
	public final native void setStartValue( double startValue ) /*-{
		this.@com.amcharts.impl.GuageBand::jso.startValue = startValue;
	}-*/;
}
