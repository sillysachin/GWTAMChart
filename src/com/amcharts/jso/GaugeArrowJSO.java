package com.amcharts.jso;

import com.amcharts.api.IsGaugeArrow;
import com.amcharts.api.IsGaugeAxis;
import com.google.gwt.core.client.JavaScriptObject;

public final class GaugeArrowJSO extends JavaScriptObject implements IsGaugeArrow
{
	protected GaugeArrowJSO()
	{
	}

	/**
	 * Opacity of an arrow.
	 */
	public final native double getAlpha() /*-{
		return alpha;
	}-*/;

	/**
	 * Opacity of an arrow.
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.alpha = alpha;
	}-*/;

	/**
	 * "Axis of the arrow. You can use reference to the axis or id of the axis. If you don't set any axis, the first axis of a chart will be used."
	 */
	public final native IsGaugeAxis getAxis() /*-{
		return axis;
	}-*/;

	/**
	 * "Axis of the arrow. You can use reference to the axis or id of the axis. If you don't set any axis, the first axis of a chart will be used."
	 */
	public final native void setAxis( IsGaugeAxis axis ) /*-{
		this.axis = axis;
	}-*/;

	/**
	 * Opacity of arrow border.
	 */
	public final native double getBorderAlpha() /*-{
		return borderAlpha;
	}-*/;

	/**
	 * Opacity of arrow border.
	 */
	public final native void setBorderAlpha( double borderAlpha ) /*-{
		this.borderAlpha = borderAlpha;
	}-*/;

	/**
	 * "In case you need the arrow to rotate only clock-wise, set this property to true."
	 */
	public final native Boolean isClockWiseOnly() /*-{
		return clockWiseOnly;
	}-*/;

	/**
	 * "In case you need the arrow to rotate only clock-wise, set this property to true."
	 */
	public final native void setClockWiseOnly( Boolean clockWiseOnly ) /*-{
		this.clockWiseOnly = clockWiseOnly;
	}-*/;

	/**
	 * Color of an arrow.
	 */
	public final native String getColor() /*-{
		return color;
	}-*/;

	/**
	 * Color of an arrow.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * Unique id of an arrow.
	 */
	public final native String getId() /*-{
		return id;
	}-*/;

	/**
	 * Unique id of an arrow.
	 */
	public final native void setId( String id ) /*-{
		this.id = id;
	}-*/;

	/**
	 * Inner radius of an arrow.
	 */
	public final native String getInnerRadius() /*-{
		return innerRadius;
	}-*/;

	/**
	 * Inner radius of an arrow.
	 */
	public final native void setInnerRadius( String innerRadius ) /*-{
		this.innerRadius = innerRadius;
	}-*/;

	/**
	 * "Opacity of a nail, holding the arrow."
	 */
	public final native double getNailAlpha() /*-{
		return nailAlpha;
	}-*/;

	/**
	 * "Opacity of a nail, holding the arrow."
	 */
	public final native void setNailAlpha( double nailAlpha ) /*-{
		this.nailAlpha = nailAlpha;
	}-*/;

	/**
	 * Opacity of nail border.
	 */
	public final native double getNailBorderAlpha() /*-{
		return nailBorderAlpha;
	}-*/;

	/**
	 * Opacity of nail border.
	 */
	public final native void setNailBorderAlpha( double nailBorderAlpha ) /*-{
		this.nailBorderAlpha = nailBorderAlpha;
	}-*/;

	/**
	 * Thickness of nail border.
	 */
	public final native double getNailBorderThickness() /*-{
		return nailBorderThickness;
	}-*/;

	/**
	 * Thickness of nail border.
	 */
	public final native void setNailBorderThickness( double nailBorderThickness ) /*-{
		this.nailBorderThickness = nailBorderThickness;
	}-*/;

	/**
	 * "Radius of a nail, holding the arrow."
	 */
	public final native double getNailRadius() /*-{
		return nailRadius;
	}-*/;

	/**
	 * "Radius of a nail, holding the arrow."
	 */
	public final native void setNailRadius( double nailRadius ) /*-{
		this.nailRadius = nailRadius;
	}-*/;

	/**
	 * Radius of an arrow.
	 */
	public final native String getRadius() /*-{
		return radius;
	}-*/;

	/**
	 * Radius of an arrow.
	 */
	public final native void setRadius( String radius ) /*-{
		this.radius = radius;
	}-*/;

	/**
	 * Width of arrow root.
	 */
	public final native double getStartWidth() /*-{
		return startWidth;
	}-*/;

	/**
	 * Width of arrow root.
	 */
	public final native void setStartWidth( double startWidth ) /*-{
		this.startWidth = startWidth;
	}-*/;

	/**
	 * Value to which the arrow should point at.
	 */
	public final native double getValue() /*-{
		return value;
	}-*/;

	/**
	 * Value to which the arrow should point at.
	 */
	public final native void setValue( double value ) /*-{
		this.value = value;
	}-*/;
}
