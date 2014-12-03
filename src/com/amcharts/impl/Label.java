package com.amcharts.impl;

import com.amcharts.api.IsLabel;
import com.amcharts.jso.LabelJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class Label implements IJavaScriptWrapper<LabelJSO>, IsLabel
{
	private LabelJSO jso;

	public Label()
	{
		jso = createJso();
	}

	public LabelJSO getJso()
	{
		return this.jso;
	}

	public void setJso( LabelJSO jso )
	{
		this.jso = jso;
	}

	public native LabelJSO createJso() /*-{
		return {};
	}-*/;

	/**
	 *
	 */
	public final native String getAlign() /*-{
		return this.@com.amcharts.impl.Label::jso.align;
	}-*/;

	/**
	 *
	 */
	public final native void setAlign( String align ) /*-{
		this.@com.amcharts.impl.Label::jso.align = align;
	}-*/;

	/**
	 *
	 */
	public final native double getAlpha() /*-{
		return this.@com.amcharts.impl.Label::jso.alpha;
	}-*/;

	/**
	 *
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.@com.amcharts.impl.Label::jso.alpha = alpha;
	}-*/;

	/**
	 * Specifies if label is bold or not.
	 */
	public final native Boolean isBold() /*-{
		return this.@com.amcharts.impl.Label::jso.bold;
	}-*/;

	/**
	 * Specifies if label is bold or not.
	 */
	public final native void setBold( Boolean bold ) /*-{
		this.@com.amcharts.impl.Label::jso.bold = bold;
	}-*/;

	/**
	 * Color of a label.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.Label::jso.color;
	}-*/;

	/**
	 * Color of a label.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.Label::jso.color = color;
	}-*/;

	/**
	 * "Unique id of a Label. You don't need to set it, unless you want to."
	 */
	public final native String getId() /*-{
		return this.@com.amcharts.impl.Label::jso.id;
	}-*/;

	/**
	 * "Unique id of a Label. You don't need to set it, unless you want to."
	 */
	public final native void setId( String id ) /*-{
		this.@com.amcharts.impl.Label::jso.id = id;
	}-*/;

	/**
	 * Rotation angle.
	 */
	public final native double getRotation() /*-{
		return this.@com.amcharts.impl.Label::jso.rotation;
	}-*/;

	/**
	 * Rotation angle.
	 */
	public final native void setRotation( double rotation ) /*-{
		this.@com.amcharts.impl.Label::jso.rotation = rotation;
	}-*/;

	/**
	 * Text size.
	 */
	public final native double getSize() /*-{
		return this.@com.amcharts.impl.Label::jso.size;
	}-*/;

	/**
	 * Text size.
	 */
	public final native void setSize( double size ) /*-{
		this.@com.amcharts.impl.Label::jso.size = size;
	}-*/;

	/**
	 * Text of a label.
	 */
	public final native String getText() /*-{
		return this.@com.amcharts.impl.Label::jso.text;
	}-*/;

	/**
	 * Text of a label.
	 */
	public final native void setText( String text ) /*-{
		this.@com.amcharts.impl.Label::jso.text = text;
	}-*/;

	/**
	 * URL which will be access if user clicks on a label.
	 */
	public final native String getUrl() /*-{
		return this.@com.amcharts.impl.Label::jso.url;
	}-*/;

	/**
	 * URL which will be access if user clicks on a label.
	 */
	public final native void setUrl( String url ) /*-{
		this.@com.amcharts.impl.Label::jso.url = url;
	}-*/;

	/**
	 * X position of a label.
	 */
	public final native String getX() /*-{
		return this.@com.amcharts.impl.Label::jso.x;
	}-*/;

	/**
	 * X position of a label.
	 */
	public final native void setX( String x ) /*-{
		this.@com.amcharts.impl.Label::jso.x = x;
	}-*/;

	/**
	 * y position of a label.
	 */
	public final native String getY() /*-{
		return this.@com.amcharts.impl.Label::jso.y;
	}-*/;

	/**
	 * y position of a label.
	 */
	public final native void setY( String y ) /*-{
		this.@com.amcharts.impl.Label::jso.y = y;
	}-*/;
}
