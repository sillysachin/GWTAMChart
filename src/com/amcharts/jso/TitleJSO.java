package com.amcharts.jso;

import com.amcharts.api.IsTitle;
import com.google.gwt.core.client.JavaScriptObject;

public final class TitleJSO extends JavaScriptObject implements IsTitle
{
	protected TitleJSO()
	{
	}

	/**
	 * Opacity of a title.
	 */
	public final native double getAlpha() /*-{
		return this.alpha;
	}-*/;

	/**
	 * Opacity of a title.
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.alpha = alpha;
	}-*/;

	/**
	 * Specifies if title should be bold or not.
	 */
	public final native Boolean isBold() /*-{
		return this.bold;
	}-*/;

	/**
	 * Specifies if title should be bold or not.
	 */
	public final native void setBold( Boolean bold ) /*-{
		this.bold = bold;
	}-*/;

	/**
	 * Text color of a title.
	 */
	public final native String getColor() /*-{
		return this.color;
	}-*/;

	/**
	 * Text color of a title.
	 */
	public final native void setColor( String color ) /*-{
		this.color = color;
	}-*/;

	/**
	 * "Unique id of a Title. You don't need to set it, unless you want to."
	 */
	public final native String getId() /*-{
		return this.id;
	}-*/;

	/**
	 * "Unique id of a Title. You don't need to set it, unless you want to."
	 */
	public final native void setId( String id ) /*-{
		this.id = id;
	}-*/;

	/**
	 * Text size of a title.
	 */
	public final native double getSize() /*-{
		return this.size;
	}-*/;

	/**
	 * Text size of a title.
	 */
	public final native void setSize( double size ) /*-{
		this.size = size;
	}-*/;

	/**
	 * Text of a title.
	 */
	public final native String getText() /*-{
		return this.text;
	}-*/;

	/**
	 * Text of a title.
	 */
	public final native void setText( String text ) /*-{
		this.text = text;
	}-*/;
}
