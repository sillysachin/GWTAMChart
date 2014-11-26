package com.amcharts.impl;

import com.amcharts.api.IsGaugeArrow;
import com.amcharts.api.IsGaugeAxis;
import com.amcharts.jso.GaugeArrowJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class GaugeArrow implements IJavaScriptWrapper<GaugeArrowJSO>, IsGaugeArrow
{
	private GaugeArrowJSO jso;

	protected GaugeArrow()
	{
		jso = createJso();
	}

	public GaugeArrowJSO getJso()
	{
		return this.jso;
	}

	public void setJso( GaugeArrowJSO jso )
	{
		this.jso = jso;
	}

	//Learn: Very important to invoke $wnd.AmCharts.GaugeArrow() instead of just {} or GaugeArrowJSO.createObject()
	public native GaugeArrowJSO createJso() /*-{
		var gaugeArrow = new $wnd.AmCharts.GaugeArrow();
		return gaugeArrow;
	}-*/;

	/**
	 * Opacity of an arrow.
	 */
	public final native double getAlpha() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.alpha;
	}-*/;

	/**
	 * Opacity of an arrow.
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.alpha = alpha;
	}-*/;

	/**
	 * "Axis of the arrow. You can use reference to the axis or id of the axis. If you don't set any axis, the first axis of a chart will be used."
	 */
	public final native IsGaugeAxis getAxis() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.axis;
	}-*/;

	/**
	 * "Axis of the arrow. You can use reference to the axis or id of the axis. If you don't set any axis, the first axis of a chart will be used."
	 */
	public final native void setAxis( IsGaugeAxis axis ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.axis = axis;
	}-*/;

	/**
	 * Opacity of arrow border.
	 */
	public final native double getBorderAlpha() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.borderAlpha;
	}-*/;

	/**
	 * Opacity of arrow border.
	 */
	public final native void setBorderAlpha( double borderAlpha ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.borderAlpha = borderAlpha;
	}-*/;

	/**
	 * "In case you need the arrow to rotate only clock-wise, set this property to true."
	 */
	public final native Boolean isClockWiseOnly() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.clockWiseOnly;
	}-*/;

	/**
	 * "In case you need the arrow to rotate only clock-wise, set this property to true."
	 */
	public final native void setClockWiseOnly( Boolean clockWiseOnly ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.clockWiseOnly = clockWiseOnly;
	}-*/;

	/**
	 * Color of an arrow.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.color;
	}-*/;

	/**
	 * Color of an arrow.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.color = color;
	}-*/;

	/**
	 * Unique id of an arrow.
	 */
	public final native String getId() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.id;
	}-*/;

	/**
	 * Unique id of an arrow.
	 */
	public final native void setId( String id ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.id = id;
	}-*/;

	/**
	 * Inner radius of an arrow.
	 */
	public final native String getInnerRadius() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.innerRadius;
	}-*/;

	/**
	 * Inner radius of an arrow.
	 */
	public final native void setInnerRadius( String innerRadius ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.innerRadius = innerRadius;
	}-*/;

	/**
	 * "Opacity of a nail, holding the arrow."
	 */
	public final native double getNailAlpha() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.nailAlpha;
	}-*/;

	/**
	 * "Opacity of a nail, holding the arrow."
	 */
	public final native void setNailAlpha( double nailAlpha ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.nailAlpha = nailAlpha;
	}-*/;

	/**
	 * Opacity of nail border.
	 */
	public final native double getNailBorderAlpha() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.nailBorderAlpha;
	}-*/;

	/**
	 * Opacity of nail border.
	 */
	public final native void setNailBorderAlpha( double nailBorderAlpha ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.nailBorderAlpha = nailBorderAlpha;
	}-*/;

	/**
	 * Thickness of nail border.
	 */
	public final native double getNailBorderThickness() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.nailBorderThickness;
	}-*/;

	/**
	 * Thickness of nail border.
	 */
	public final native void setNailBorderThickness( double nailBorderThickness ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.nailBorderThickness = nailBorderThickness;
	}-*/;

	/**
	 * "Radius of a nail, holding the arrow."
	 */
	public final native double getNailRadius() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.nailRadius;
	}-*/;

	/**
	 * "Radius of a nail, holding the arrow."
	 */
	public final native void setNailRadius( double nailRadius ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.nailRadius = nailRadius;
	}-*/;

	/**
	 * Radius of an arrow.
	 */
	public final native String getRadius() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.radius;
	}-*/;

	/**
	 * Radius of an arrow.
	 */
	public final native void setRadius( String radius ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.radius = radius;
	}-*/;

	/**
	 * Width of arrow root.
	 */
	public final native double getStartWidth() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.startWidth;
	}-*/;

	/**
	 * Width of arrow root.
	 */
	public final native void setStartWidth( double startWidth ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.startWidth = startWidth;
	}-*/;

	/**
	 * Value to which the arrow should point at.
	 */
	public final native double getValue() /*-{
		return this.@com.amcharts.impl.GaugeArrow::jso.value;
	}-*/;

	/**
	 * Value to which the arrow should point at.
	 */
	public final native void setValue( double value ) /*-{
		this.@com.amcharts.impl.GaugeArrow::jso.value = value;
	}-*/;
}
