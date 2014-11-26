package com.amcharts.impl;

import com.amcharts.api.IsTitle;
import com.amcharts.jso.TitleJSO;
import com.google.gwt.core.client.IJavaScriptWrapper;

public final class Title implements IJavaScriptWrapper<TitleJSO>, IsTitle
{
	private TitleJSO jso;

	protected Title()
	{
		jso = createJso();
	}

	public TitleJSO getJso()
	{
		return this.jso;
	}

	public void setJso( TitleJSO jso )
	{
		this.jso = jso;
	}

	public native TitleJSO createJso() /*-{
		return this.jso;
	}-*/;

	/**
	 * Opacity of a title.
	 */
	public final native double getAlpha() /*-{
		return this.@com.amcharts.impl.Title::jso.alpha;
	}-*/;

	/**
	 * Opacity of a title.
	 */
	public final native void setAlpha( double alpha ) /*-{
		this.@com.amcharts.impl.Title::jso.alpha = alpha;
	}-*/;

	/**
	 * Specifies if title should be bold or not.
	 */
	public final native Boolean isBold() /*-{
		return this.@com.amcharts.impl.Title::jso.bold;
	}-*/;

	/**
	 * Specifies if title should be bold or not.
	 */
	public final native void setBold( Boolean bold ) /*-{
		this.@com.amcharts.impl.Title::jso.bold = bold;
	}-*/;

	/**
	 * Text color of a title.
	 */
	public final native String getColor() /*-{
		return this.@com.amcharts.impl.Title::jso.color;
	}-*/;

	/**
	 * Text color of a title.
	 */
	public final native void setColor( String color ) /*-{
		this.@com.amcharts.impl.Title::jso.color = color;
	}-*/;

	/**
	 * "Unique id of a Title. You don't need to set it, unless you want to."
	 */
	public final native String getId() /*-{
		return this.@com.amcharts.impl.Title::jso.id;
	}-*/;

	/**
	 * "Unique id of a Title. You don't need to set it, unless you want to."
	 */
	public final native void setId( String id ) /*-{
		this.@com.amcharts.impl.Title::jso.id = id;
	}-*/;

	/**
	 * Text size of a title.
	 */
	public final native double getSize() /*-{
		return this.@com.amcharts.impl.Title::jso.size;
	}-*/;

	/**
	 * Text size of a title.
	 */
	public final native void setSize( double size ) /*-{
		this.@com.amcharts.impl.Title::jso.size = size;
	}-*/;

	/**
	 * Text of a title.
	 */
	public final native String getText() /*-{
		return this.@com.amcharts.impl.Title::jso.text;
	}-*/;

	/**
	 * Text of a title.
	 */
	public final native void setText( String text ) /*-{
		this.@com.amcharts.impl.Title::jso.text = text;
	}-*/;
}
