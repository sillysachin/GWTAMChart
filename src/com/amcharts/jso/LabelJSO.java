package com.amcharts.jso;

import com.amcharts.api.IsLabel;
import com.google.gwt.core.client.JavaScriptObject;

public final class LabelJSO extends JavaScriptObject implements IsLabel
{
	protected LabelJSO()
	{
	}

	/**
	 *
	 */
	public final native String getAlign() /*-{
		return align;
	}-*/;

	/**
	 *
	 */
	public final native void setAlign( String align ) /*-{
		this.align = align;
	}-*/;

	/**
	 *
	 */
	public final native double getAlpha() /*-{
		return alpha;
	}-*/;

	/**
	 *
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.alpha = alpha;
	}-*/;

	/**
	 * Specifies if label is bold or not.
	 */
	public final native Boolean isBold() /*-{
		return bold;
	}-*/;

	/**
	 * Specifies if label is bold or not.
	 */
	public final native void setBold( Boolean bold ) /*-{
		this.bold = bold;
	}-*/;

	/**
	 * Color of a label.
	 */
	public final native String getColor() /*-{
		return color;
	}-*/;

	/**
	 * Color of a label.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * "Unique id of a Label. You don't need to set it, unless you want to."
	 */
	public final native String getId() /*-{
		return id;
	}-*/;

	/**
	 * "Unique id of a Label. You don't need to set it, unless you want to."
	 */
	public final native void setId( String id ) /*-{
		this.id = id;
	}-*/;

	/**
	 * Rotation angle.
	 */
	public final native double getRotation() /*-{
		return rotation;
	}-*/;

	/**
	 * Rotation angle.
	 */
	public final native void setRotation( double rotation ) /*-{
		this.rotation = rotation;
	}-*/;

	/**
	 * Text size.
	 */
	public final native double getSize() /*-{
		return size;
	}-*/;

	/**
	 * Text size.
	 */
	public final native void setSize( double size ) /*-{
		this.size = size;
	}-*/;

	/**
	 * Text of a label.
	 */
	public final native String getText() /*-{
		return text;
	}-*/;

	/**
	 * Text of a label.
	 */
	public final native void setText( String text ) /*-{
		this.text = text;
	}-*/;

	/**
	 * URL which will be access if user clicks on a label.
	 */
	public final native String getUrl() /*-{
		return url;
	}-*/;

	/**
	 * URL which will be access if user clicks on a label.
	 */
	public final native void setUrl( String url ) /*-{
		this.url = url;
	}-*/;

	/**
	 * X position of a label.
	 */
	public final native String getX() /*-{
		return x;
	}-*/;

	/**
	 * X position of a label.
	 */
	public final native void setX( String x ) /*-{
		this.x = x;
	}-*/;

	/**
	 * y position of a label.
	 */
	public final native String getY() /*-{
		return y;
	}-*/;

	/**
	 * y position of a label.
	 */
	public final native void setY( String y ) /*-{
		this.y = y;
	}-*/;
}